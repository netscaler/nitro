/*
* Copyright (c) 2008-2015 Citrix Systems, Inc.
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package com.citrix.netscaler.nitro.resource.base;

import java.io.*;
import java.net.*;
import javax.net.ssl.*;
import java.util.zip.*;
import javax.net.*;

import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.nitro_service.OnerrorEnum;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.nitro_util;
import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.base.base_response;

/**
 * base_resource is a abstract base class for all the netscaler config/stat resources.
 */
public abstract class base_resource
{
	protected abstract base_resource[] get_nitro_response(nitro_service service, String str) throws Exception;
	
	protected abstract String get_object_name();

	/**
	 * Gets the resource type.
	 * @return  Resource Type. eg:lbvserver, csvserver.
	 */
	protected String get_object_type()
	{
		String name = this.getClass().getName();
		int index = name.lastIndexOf(".");
		if(index > 0)
			name = name.substring(index+1);
		index = name.lastIndexOf("_stats");
		if (index > 0) {	
			name = name.substring(0, index);
		}
		return name;
	}

	/**
	 * Converts netscaler resource to Json string.
	 * @param service nitro_service object.
	 * @param id sessionId.
	 * @param option Options object.
	 * @return  string in Json format.
	 */
	protected  String resource_to_string(nitro_service service, String id, options option)
	{
		Boolean warning = service.get_warning();
		String onerror = service.get_onerror();
		String result = service.get_payload_formatter().resource_to_string(this, id, option, warning, onerror);
		return result;
	}

	/**
	 * Converts netscaler resource to Json string.
	 * @param service nitro_service object
	 * @return  string in Json format.
	 */
	protected  String resource_to_string(nitro_service service)
	{
		String result = service.get_payload_formatter().resource_to_string(this);
		return result;
	}

	/**
	 * forms a String for unset operation on a resource.
	 * @param service nitro_service object.
	 * @param id session id.
	 * @param option Options object.
	 * @param args Array of args that are to be unset.
	 * @return  string in Json format.
	 * @throws Exception if invalid input is given.
	 */
	protected  String unset_string(nitro_service service, String id, options option, String args[]) throws Exception
	{
		Boolean warning = service.get_warning();
		String result = service.get_payload_formatter().unset_string(this, id, option, args, warning);
		return result;
	}

	
	/**
	 * Use this method to perform a POST operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param option Options class object.
	 * @return requested resource.
	 * @throws Exception if invalid input is given.
	 */
	private base_resource post_requestEx(nitro_service service, options option)  throws Exception
	{
		String sessionid = service.get_sessionid();
		String request = resource_to_string(service, sessionid, option);
		return post_dataEx(service, request);
	}
	
	
	
	/**
	 * Use this method to perform a Add operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param option Options class object.
	 * @return status of the operation performed.
	 * @throws Exception if invalid input is given.
	 */
	private base_response post_request(nitro_service service, options option)  throws Exception
	{
		String sessionid = service.get_sessionid();
		String request = resource_to_string(service, sessionid, option);
		return post_data(service,request);
	}

	/**
	 * Use this method to perform an Unset operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @param args string.
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	private base_response unset_request(nitro_service service, options option, String args[])  throws Exception
	{
		String sessionid = service.get_sessionid();
		String request = unset_string(service, sessionid, option, args);
		return post_data(service,request);
	}
	/**
	 * Use this method to perform a add operation on netscaler resource.
	 * @param service nitro_service object. 
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected base_response add_resource(nitro_service service)  throws Exception
	{
		return add_resource(service, null);
	}
	
	/**
	 * Use this method to perform a add operation on netscaler resource.
	 * @param service nitro_service object. 
	 * @param option options class object.
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected base_response add_resource(nitro_service service,options option)  throws Exception
	{
		if (!service.isLogin() && !this.get_object_type().equals("login"))
			service.login();
		String sessionid = service.get_sessionid();
		String request = resource_to_string(service, sessionid, option);
		return post_data(service,request);
	}
	
	/**
	 * Use this method to perform a modify operation on netscaler resource.
	 * @param service nitro_service object. 
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected base_response update_resource(nitro_service service)  throws Exception
	{
		return update_resource(service, null);
	}
	
	/**
	 * Use this method to perform a modify operation on netscaler resource.
	 * @param service nitro_service object. 
	 * @param option options class object.
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected base_response update_resource(nitro_service service,options option)  throws Exception
	{
		if (!service.isLogin() && !this.get_object_type().equals("login"))
			service.login();
		String sessionid = service.get_sessionid();
		String request = resource_to_string(service, sessionid, option);
		return put_data(service,request);
	}

	/**
	 * Use this method to perform a delete operation on netscaler resource.
	 * @param service nitro_service object
	 * @return status of the operation performed.
	 * @throws Exception nitro exception is thrown.
	 */
	protected base_response delete_resource(nitro_service service)  throws Exception
	{
		base_response response;
		if (!service.isLogin())
			service.login();

		String str = nitro_util.object_to_string_withoutquotes(this);
		response = delete_request(service, str);
		return response;
	}

	/**
	 * Use this method to perform a filtered get operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return Array of nitro resources of given resource type.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource[] getfiltered(nitro_service service,options option) throws Exception
	{
		if (!service.isLogin())
			service.login();
		base_resource[] response = get_request(service, option);
		return response;
	}

	/**
	 * Use this method to perform a get operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return Array of nitro resources of specified type.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource[] get_resources(nitro_service service,options option) throws Exception
	{
		if (!service.isLogin())
			service.login();

		base_resource[] response = get_request(service, option);
		return response;
	}

	/**
	 * Use this method to perform a get operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return Array of nitro resources of specified type.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource[] get_resources(nitro_service service) throws Exception
	{
		return get_resources(service, null);
	}

	/**
	 * Use this method to perform a get operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return Array of nitro resources of specified type.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource get_resource(nitro_service service,options option) throws Exception
	{
		if (!service.isLogin())
			service.login();

		base_resource[] response = get_request(service, option);
		if (response != null) {
			return response[0];
		} 
		return null;
	}
	
	/**
	 * Use this method to perform a get operation on netscaler resource.
	 * @param service nitro_service object.
	 * @return Array of nitro resources of specified type.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource get_resource(nitro_service service) throws Exception
	{
		return get_resource(service, null);
	}

	/**
	 * Use this method to perform a stat operation on netscaler resources.
	 * @param service nitro_service object. 
	 * @param option options class object.
	 * @return Array of nitro stat resources of specified type.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource[] stat_resources(nitro_service service,options option) throws Exception
	{
		if (!service.isLogin())
			service.login();

		base_resource[] response = stat_request(service, option);
		return response;
	}
	
	/**
	 * Use this method to perform a stat operation on netscaler resources.
	 * @param service nitro_service object. 
	 * @return Array of nitro stat resources of specified type.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource[] stat_resources(nitro_service service) throws Exception
	{
		return stat_resources(service, null);
	}
	
	/**
	 * Use this method to perform a stat operation on a netscaler resource.
	 * @param service nitro_service object. 
	 * @param option options class object.
	 * @return Requested Nitro stat resource.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource stat_resource(nitro_service service,options option) throws Exception
	{
		if (!service.isLogin())
			service.login();

		base_resource[] response = stat_request(service, option);
		if (response != null && response.length > 0)
		{
			return response[0];
		}
		return null;
	}
	
	/**
	 * Use this method to perform a stat operation on a netscaler resource.
	 * @param service nitro_service object. 
	 * @return Requested Nitro stat resource.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_resource stat_resource(nitro_service service) throws Exception
	{
		return stat_resource(service, null);
	}
	

	/**
	 * Use this method to perform a clear/sync/link/unlink/save ...etc 
	 * operation on netscaler resource.
	 * @param service nitro_service object. 
	 * @param action action needs to be taken on resource. 
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */
	public base_response perform_operation(nitro_service service, String action)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();
		options option = new options();
		option.set_action(action);
		base_response response = post_request(service, option);
		return response;
	}

	/**
	 * Use this method to perform a POST operation that returns a resource ...etc 
	 * operation on netscaler resource.
	 * @param service nitro_service object. 
	 * @param action action needs to be taken on resource. 
	 * @return requested resource
	 * @throws Exception Nitro exception is thrown.
	 */
	public base_resource perform_operationEx(nitro_service service, String action)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();
		options option = new options();
		option.set_action(action);
		base_resource response = post_requestEx(service, option);
		return response;
	}
	
	
	/**
	 * Use this method to perform a clear/sync/link/unlink/save ...etc 
	 * operation on netscaler resource.
	 * @param service nitro_service object. 
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */
	public base_response perform_operation(nitro_service service)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();
		base_response response = post_request(service, null);
		return response;
	}
	/**
	 * Use this method to perform a clear/sync/link/unlink/save ...etc 
	 * operation on netscaler resource.
	 * @param service nitro_service object. 
	 * @param option options object with action that is to be performed set.
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */
	public base_response perform_operation(nitro_service service, options option)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();

		base_response response = post_request(service, option);
		return response;
	}

	/**
	 * Use this method to perform a clear/sync/link/unlink/save ...etc 
	 * operation on netscaler resources.
	 * @param service nitro_service object. 
	 * @param resources Array of Nitro resources on which the specified action to be performed.
	 * @param option options object with action that is to be performed set.
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected static base_responses perform_operation_bulk_request(nitro_service service,base_resource resources[], String action ) throws Exception
	{
		if (!service.isLogin())
			service.login();

		options option = new options();
		option.set_action(action);		
		String onerror = service.get_onerror();
		Boolean warning = service.get_warning();
		String id = service.get_sessionid();
		String request = service.get_payload_formatter().resource_to_string(resources, id, option,warning, onerror);
		base_responses result = post_bulk_data(service,request);
		return result;
	}
	
	/**
	 * Use this method to perform a rename operation on netscaler resource.
	 * @param newname new name to be set to the specified resource.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected  void set_newname(String newname) throws Exception
	{
		nitro_exception e = new nitro_exception("Rename is not supported for this resource",-1);
		throw e;
	}

	/**
	 * Use this method to perform a rename operation on netscaler resource.
	 * @param service  nitro_service object.
	 * @param newname new name to be set to the specified resource.
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */ 
	protected base_response rename_resource(nitro_service service, String newname)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();

		options option = new options();
		option.set_action("rename");
		this.set_newname(newname);
		base_response response = post_request(service, option);
		return response;
	}

	/**
	 * Use this method to perform an Unset operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param args Array of args that are to be unset.
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected base_response unset_resource(nitro_service service, String args[])  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();

		options option = new options();
		option.set_action("unset");
		base_response response = unset_request(service, option, args);
		return response;
	}

	/**
	 * Use this method to perform an update operation on netscaler resources.
	 * @param service nitro_service object.
	 * @param resources  Array of nitro resources to be updated.
	 * @param option options class object
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected static base_responses update_bulk_request(nitro_service service,base_resource resources[]) throws Exception
	{
		if (!service.isLogin())
			service.login();

		String id = service.get_sessionid();
		Boolean warning = service.get_warning();
		String onerror = service.get_onerror();
		String request = service.get_payload_formatter().resource_to_string(resources, id, null, warning, onerror);
		base_responses result = put_bulk_data(service, request);
		return result;
	}
	
	protected static base_responses unset_bulk_request(nitro_service service,base_resource resources[], String args[]) throws Exception
	{
		if (!service.isLogin())
			service.login();
		
		String id = service.get_sessionid();
		options option = new options();
		option.set_action("unset");
		String onerror = service.get_onerror();
		Boolean warning = service.get_warning();
		String request = service.get_payload_formatter().unset_string(resources, id, option, args, warning, onerror);
		return post_bulk_data(service,request);
	}
	
	/**
	 * Use this method to perform a add operation on netscaler resources.
	 * @param service nitro_service object.
	 * @param resources Nitro resources to be added on netscaler.
	 * @param option options class object.
	 * @return status of the performed operation.
	 * @throws Exception  Nitro exception is thrown.
	 */
	protected static base_responses add_bulk_request(nitro_service service,base_resource resources[] ) throws Exception
	{
		if (!service.isLogin())
			service.login();

		String id = service.get_sessionid();
		String onerror = service.get_onerror();
		Boolean warning = service.get_warning();
		String request = service.get_payload_formatter().resource_to_string(resources, id, null,warning, onerror);
		base_responses result = post_bulk_data(service,request);
		return result;
	}
	
	/**
	 * Use this method to perform a delete operation on netscaler resources.
	 * @param service nitro_service object.
	 * @param resources Nitro resources to be deleted on netscaler.
	 * @param option options class object.
	 * @return status of the performed operation.
	 * @throws Exception  Nitro exception is thrown.
	 */
	protected static base_responses delete_bulk_request(nitro_service service,base_resource resources[]) throws Exception
	{
		if (!service.isLogin())
			service.login();

		options option = new options();
		option.set_action("rm");
		String type = resources[0].get_object_type();
		if (type.indexOf("_binding") > 0)
		{
			option.set_action("unbind");
		}
		String id = service.get_sessionid();
		String onerror = service.get_onerror();
		Boolean warning = service.get_warning();
		String request = service.get_payload_formatter().resource_to_string(resources, id, option,warning, onerror);
		base_responses result = post_bulk_data(service,request);
		return result;

	}

	/**
	 * This method, forms the http PUT request, applies on the netscaler.
	 * Reads the response from the netscaler and converts it to base response.
	 * @param service nitro_service object.
	 * @param request Json request.
	 * @return status of the operation performed.
	 * @throws Exception nitro exception is thrown.
	 */
	private static String _put(nitro_service service, String request) throws Exception {
		HttpURLConnection httpURLConnection;
		StringBuilder responseStr = new StringBuilder();
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String version = service.get_version();
			String protocol = service.get_protocol();
			urlstr = protocol+"://" + ipaddress + "/nitro/" + version + "/config/";
			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod("PUT");
			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because NetScaler currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}
			httpURLConnection.setDoInput(true);
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			
			httpURLConnection.setDoOutput(true);
			OutputStreamWriter ouput = new OutputStreamWriter(httpURLConnection.getOutputStream());
			ouput.write(request);
			ouput.flush();
			ouput.close();

			InputStream input;
			try {
				input = httpURLConnection.getInputStream();
			}
			catch (Exception e) {
				input = httpURLConnection.getErrorStream();	
			}
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}

			httpURLConnection.disconnect();
			input.close();
		}
		catch (MalformedURLException mue)
		{
			throw mue;
		}
		catch (IOException ioe)
		{
			throw ioe;
		}
		catch(Exception e)
		{
			throw e;
		}
		
		return responseStr.toString();
	}
	private static base_response put_data(nitro_service service, String request) throws Exception
	{
		
		String response = _put(service, request);
		base_response result =(base_response) service.get_payload_formatter().string_to_resource(base_response.class, response);
		if (result.errorcode != 0)
		{
				if (result.errorcode == 444) {
					service.clear_session();
				}	
				if(result.severity != null)
				{
					if(result.severity.equals("ERROR"))
						throw new nitro_exception(result.message,result.errorcode);
				}
				else
				{
					throw new nitro_exception(result.message,result.errorcode);
				}
		}
		return result;
	}
	private static base_responses put_bulk_data(nitro_service service, String request) throws Exception
	{
		
		String response = _put(service, request);
		base_responses result =(base_responses) service.get_payload_formatter().string_to_resource(base_responses.class, response);
		if (result.errorcode != 0)
		{
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if(result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode,result.response);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode,result.response);
			}
		}
		return result;
	}
	
	/**
	 * This method, forms the http POST request, applies on the netscaler.
	 * Reads the response from the netscaler and converts it to base response.
	 * @param service
	 * @param request
	 * @return
	 * @throws Exception
	 */
	private static String _post(nitro_service service, String request) throws Exception {
		HttpURLConnection httpURLConnection;
		StringBuilder responseStr = new StringBuilder();
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String version = service.get_version();
			String protocol = service.get_protocol();
			urlstr = protocol+"://" + ipaddress + "/nitro/" + version + "/config/";
			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod("POST");
			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because NetScaler currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}
			httpURLConnection.setDoInput(true);
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			request = nitro_util.encode(request);
			request = "object=" + request;
			OutputStreamWriter ouput = new OutputStreamWriter(httpURLConnection.getOutputStream());
			ouput.write(request);
			ouput.flush();
			ouput.close();

			InputStream input;
			try {
				input = httpURLConnection.getInputStream();
			}
			catch (Exception e) {
				input = httpURLConnection.getErrorStream();	
			}
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}
			input.close();
			httpURLConnection.disconnect();
		}
		catch (MalformedURLException mue)
		{
			throw mue;
		}
		catch (IOException ioe)
		{
			throw ioe;
		}
		catch(Exception e)
		{
			throw e;
		}
		return responseStr.toString();
	}
	
	
	private base_resource post_dataEx(nitro_service service, String request) throws Exception
	{
	
		String response = _post(service, request);
		base_resource[] result = (base_resource[]) get_nitro_response(service, response);
		return result[0];
	}
	
	private static base_response post_data(nitro_service service, String request) throws Exception
	{
	
		String response = _post(service, request);
		base_response result =(base_response) service.get_payload_formatter().string_to_resource(base_response.class, response);
		if (result.errorcode != 0 && result.errorcode != 1034)
		{
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if(result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode);
			}
		}
		return result;
	}

	private static base_responses post_bulk_data(nitro_service service, String request) throws Exception
	{
	
		String response = _post(service, request);
		base_responses result =(base_responses) service.get_payload_formatter().string_to_resource(base_responses.class, response);
		if (result.errorcode != 0)
		{
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if(result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode,result.response);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode,result.response);
			}
		}

		return result;
	}
	/**
	 * This method, forms the http GET request, applies on the netscaler.
	 * Reads the response from the netscaler and converts it to corresponding 
	 * resource type.
	 * @param service
	 * @param option
	 * @return Array of requested resources.
	 */
	private  base_resource[] get_request(nitro_service service,options option) throws Exception  
	{
		StringBuilder responseStr = new StringBuilder();
		HttpURLConnection httpURLConnection = null;
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String version = service.get_version();
			String sessionid = service.get_sessionid();
			String objtype = get_object_type();
			String protocol = service.get_protocol();

			// build URL
			urlstr = protocol + "://" + ipaddress + "/nitro/" + version + "/config/" + objtype;

			String name = this.get_object_name();
			if (name != null && name.length() > 0)
			{
				urlstr = urlstr+"/"+nitro_util.encode(nitro_util.encode(name));
			}

			if (option != null || (service.get_warning()!=null && service.get_warning()) )
			{
				String optionstr=null;
				if (option != null)
				{
					optionstr = option.to_string();
					if (optionstr.length() > 0)
					{
						urlstr = urlstr+"?";
						urlstr = urlstr+optionstr;
					}
				}	
				if (service.get_warning()!=null && service.get_warning())
				{					
					if (option != null && optionstr.length() > 0)
					{
						urlstr = urlstr+"&";
					}
					else
					{
						urlstr = urlstr+"?";
					}
					urlstr = urlstr+"warning=yes";
				}
			}
			
			
			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();

			httpURLConnection.setRequestMethod("GET");

			httpURLConnection.setRequestProperty("Cookie", "sessionid=" + nitro_util.encode(sessionid));
			if ((option != null) && (option.get_compression()))
				httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");

			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because NetScaler currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}
			
			InputStream input;
			try {
				input = httpURLConnection.getInputStream();
			}
			catch (Exception e) {
				input = httpURLConnection.getErrorStream();	
			}
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}

			httpURLConnection.disconnect();
			input.close();
		}
		catch (MalformedURLException mue)
		{
			throw mue;
		}
		catch (IOException ioe)
		{
			throw ioe;
			
		}
		catch(Exception e)
		{
			throw e;
		}
		base_resource[] result = get_nitro_response(service, responseStr.toString());
		return result;
	}

	/**
	 * This method, forms the http GET request, applies on the netscaler.
	 * Reads the response from the netscaler and converts it to corresponding
	 * stat resource type.
	 * @param service
	 * @param option
	 * @return Array of requested resources.
	 */
	private  base_resource[] stat_request(nitro_service service,options option) throws Exception
	{
		StringBuilder responseStr = new StringBuilder();
		HttpURLConnection httpURLConnection = null;
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String version = service.get_version();
			String sessionid = service.get_sessionid();
			String objtype = get_object_type();
			String protocol = service.get_protocol();

			// build URL
			urlstr = protocol + "://" + ipaddress + "/nitro/" + version + "/stat/" + objtype;

			String name = this.get_object_name();
			if (name != null && name.length() > 0)
			{
				urlstr = urlstr+"/"+nitro_util.encode(nitro_util.encode(name));
			}

			if (option != null || (service.get_warning()!=null && service.get_warning()) )
			{
				String optionstr = null;
				if (option != null)
				{
					optionstr = option.to_string();
					if (optionstr.length() > 0)
					{
						urlstr = urlstr+"?";
						urlstr = urlstr+optionstr;
					}
				}	
				if (service.get_warning()!= null && service.get_warning())
				{
					if (option != null && optionstr.length() > 0)
					{
					urlstr = urlstr+"&";
					}
					else
					{
						urlstr = urlstr+"?";
					}
					urlstr = urlstr+"warning=yes";
				}
			}

			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();

			httpURLConnection.setRequestMethod("GET");

			httpURLConnection.setRequestProperty("Cookie", "sessionid=" + nitro_util.encode(sessionid));
			if ((option != null) && (option.get_compression()))
				httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");

			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because NetScaler currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}

			InputStream input;
			try {
				input = httpURLConnection.getInputStream();
			}
			catch (Exception e) {
				input = httpURLConnection.getErrorStream();	
			}
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}

			httpURLConnection.disconnect();
			input.close();
		}
		catch (MalformedURLException mue)
		{
			throw mue;
		}
		catch (IOException ioe)
		{
			throw ioe;
		}
		catch(Exception e)
		{
			throw e;
		}
		base_resource[] result = get_nitro_response(service, responseStr.toString());
		return result;
	}

	/**
	 * This method, forms the http DELETE request, applies on the netscaler.
	 * Reads the response from the netscaler and converts it to base response.
	 * @param service
	 * @param req_args
	 * @return
	 * @throws Exception
	 */
	private base_response delete_request(nitro_service service, String req_args) throws Exception
	{
		StringBuilder responseStr = new StringBuilder();
		HttpURLConnection httpURLConnection = null;
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String version = service.get_version();
			String sessionid = service.get_sessionid();
			String objtype = get_object_type();
			String protocol = service.get_protocol();

			// build URL
			urlstr = protocol + "://" + ipaddress + "/nitro/" + version + "/config/" + objtype;

			String name = this.get_object_name();
			if (name != null && name.length() > 0)
			{
				urlstr = urlstr+"/"+nitro_util.encode(nitro_util.encode(name));
			}

			if(req_args != null || (service.get_warning()!=null && service.get_warning())){
				urlstr = urlstr+"?";
				if(req_args != null)
				{
					urlstr = urlstr + "args=" + req_args;
				}
				if(service.get_warning()!=null && service.get_warning())
				{
					if (req_args != null)
					{
						urlstr = urlstr+"&";
					}
					urlstr = urlstr + "warning=yes";
				}
			}

			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();

			httpURLConnection.setRequestMethod("DELETE");

			httpURLConnection.setRequestProperty("Cookie", "sessionid=" + nitro_util.encode(sessionid));
			httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");

			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because NetScaler currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}

			InputStream input;
			try {
				input = httpURLConnection.getInputStream();
			}
			catch (Exception e) {
				input = httpURLConnection.getErrorStream();	
			}
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}

			httpURLConnection.disconnect();
			input.close();
		}
		catch (MalformedURLException mue)
		{
			throw mue;
		}
		catch (IOException ioe)
		{
			throw ioe;
		}
		catch(Exception e)
		{
			throw e;
		}
		base_response result =(base_response) service.get_payload_formatter().string_to_resource(base_response.class, responseStr.toString());
        if (result.errorcode != 0) 
        {
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if(result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode);
			}
		}
		return result;
	}

	
	
}
