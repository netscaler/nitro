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

package com.citrix.netscaler.nitro.resource.config.utility;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class callhome_response extends base_response
{
	public callhome callhome;
}
/**
* Configuration for callhome resource.
*/

public class callhome extends base_resource
{
	private String emailaddress;
	private String proxymode;
	private String ipaddress;
	private Integer port;

	//------- Read only Parameter ---------;

	private String sslcardfirstfailure;
	private String sslcardlatestfailure;
	private String powfirstfail;
	private String powlatestfailure;
	private String hddfirstfail;
	private String hddlatestfailure;
	private String flashfirstfail;
	private String flashlatestfailure;
	private String restartlatestfail;
	private String[] callhomestatus;

	/**
	* <pre>
	* The contact person's E-mail address.<br> Maximum length =  78
	* </pre>
	*/
	public void set_emailaddress(String emailaddress) throws Exception{
		this.emailaddress = emailaddress;
	}

	/**
	* <pre>
	* The contact person's E-mail address.<br> Maximum length =  78
	* </pre>
	*/
	public String get_emailaddress() throws Exception {
		return this.emailaddress;
	}

	/**
	* <pre>
	* Deploy the callhome proxy mode.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_proxymode(String proxymode) throws Exception{
		this.proxymode = proxymode;
	}

	/**
	* <pre>
	* Deploy the callhome proxy mode.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_proxymode() throws Exception {
		return this.proxymode;
	}

	/**
	* <pre>
	* Proxy Server IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* Proxy Server IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Proxy Server Port.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Proxy Server Port.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Proxy Server Port.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* First occurrence SSL card failure.
	* </pre>
	*/
	public String get_sslcardfirstfailure() throws Exception {
		return this.sslcardfirstfailure;
	}

	/**
	* <pre>
	* Latest occurrence SSL card failure.
	* </pre>
	*/
	public String get_sslcardlatestfailure() throws Exception {
		return this.sslcardlatestfailure;
	}

	/**
	* <pre>
	* First occurrence power supply unit failure.
	* </pre>
	*/
	public String get_powfirstfail() throws Exception {
		return this.powfirstfail;
	}

	/**
	* <pre>
	* Latest occurrence power supply unit failure.
	* </pre>
	*/
	public String get_powlatestfailure() throws Exception {
		return this.powlatestfailure;
	}

	/**
	* <pre>
	* First occurrence hard disk drive failure.
	* </pre>
	*/
	public String get_hddfirstfail() throws Exception {
		return this.hddfirstfail;
	}

	/**
	* <pre>
	* Latest occurrence hard disk drive failure.
	* </pre>
	*/
	public String get_hddlatestfailure() throws Exception {
		return this.hddlatestfailure;
	}

	/**
	* <pre>
	* First occurrence compact flash failure.
	* </pre>
	*/
	public String get_flashfirstfail() throws Exception {
		return this.flashfirstfail;
	}

	/**
	* <pre>
	* Latest occurrence compact flush failure.
	* </pre>
	*/
	public String get_flashlatestfailure() throws Exception {
		return this.flashlatestfailure;
	}

	/**
	* <pre>
	* Latest occurrence warm restart failure.
	* </pre>
	*/
	public String get_restartlatestfail() throws Exception {
		return this.restartlatestfail;
	}

	/**
	* <pre>
	* Callhome feature enabled/disable, register with upload server successful/failed.<br> Possible values = ENABLED, DISABLED, SUCCESSFUL, FAILED
	* </pre>
	*/
	public String[] get_callhomestatus() throws Exception {
		return this.callhomestatus;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		callhome[] resources = new callhome[1];
		callhome_response result = (callhome_response) service.get_payload_formatter().string_to_resource(callhome_response.class, response);
		if(result.errorcode != 0) {
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if (result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode);
			}
		}
		resources[0] = result.callhome;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update callhome.
	*/
	public static base_response update(nitro_service client, callhome resource) throws Exception {
		callhome updateresource = new callhome();
		updateresource.emailaddress = resource.emailaddress;
		updateresource.proxymode = resource.proxymode;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.port = resource.port;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of callhome resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, callhome resource, String[] args) throws Exception{
		callhome unsetresource = new callhome();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the callhome resources that are configured on netscaler.
	*/
	public static callhome get(nitro_service service) throws Exception{
		callhome obj = new callhome();
		callhome[] response = (callhome[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the callhome resources that are configured on netscaler.
	*/
	public static callhome get(nitro_service service,  options option) throws Exception{
		callhome obj = new callhome();
		callhome[] response = (callhome[])obj.get_resources(service,option);
		return response[0];
	}

	public static class callhomestatusEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
		public static final String SUCCESSFUL = "SUCCESSFUL";
		public static final String FAILED = "FAILED";
	}
	public static class proxymodeEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
