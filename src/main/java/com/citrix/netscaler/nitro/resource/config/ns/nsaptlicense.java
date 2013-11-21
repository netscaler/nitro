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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsaptlicense_response extends base_response
{
	public nsaptlicense[] nsaptlicense;
}
/**
* Configuration for aptlicense resource.
*/

public class nsaptlicense extends base_resource
{
	private String serialno;
	private String id;
	private String sessionid;
	private String bindtype;
	private String countavailable;
	private String licensedir;

	//------- Read only Parameter ---------;

	private String response;
	private String counttotal;
	private String name;
	private String relevance;
	private String datepurchased;
	private String datesa;
	private String dateexp;
	private String[] features;
	private Long __count;

	/**
	* <pre>
	* Hardware Serial Number/License Activation Code(LAC).
	* </pre>
	*/
	public void set_serialno(String serialno) throws Exception{
		this.serialno = serialno;
	}

	/**
	* <pre>
	* Hardware Serial Number/License Activation Code(LAC).
	* </pre>
	*/
	public String get_serialno() throws Exception {
		return this.serialno;
	}

	/**
	* <pre>
	* License ID.
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* License ID.
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* Session ID.
	* </pre>
	*/
	public void set_sessionid(String sessionid) throws Exception{
		this.sessionid = sessionid;
	}

	/**
	* <pre>
	* Session ID.
	* </pre>
	*/
	public String get_sessionid() throws Exception {
		return this.sessionid;
	}

	/**
	* <pre>
	* Bind type.
	* </pre>
	*/
	public void set_bindtype(String bindtype) throws Exception{
		this.bindtype = bindtype;
	}

	/**
	* <pre>
	* Bind type.
	* </pre>
	*/
	public String get_bindtype() throws Exception {
		return this.bindtype;
	}

	/**
	* <pre>
	* Count.
	* </pre>
	*/
	public void set_countavailable(String countavailable) throws Exception{
		this.countavailable = countavailable;
	}

	/**
	* <pre>
	* Count.
	* </pre>
	*/
	public String get_countavailable() throws Exception {
		return this.countavailable;
	}

	/**
	* <pre>
	* License Directory.
	* </pre>
	*/
	public void set_licensedir(String licensedir) throws Exception{
		this.licensedir = licensedir;
	}

	/**
	* <pre>
	* License Directory.
	* </pre>
	*/
	public String get_licensedir() throws Exception {
		return this.licensedir;
	}

	/**
	* <pre>
	* Response data as text blob.
	* </pre>
	*/
	public String get_response() throws Exception {
		return this.response;
	}

	/**
	* <pre>
	* Count.
	* </pre>
	*/
	public String get_counttotal() throws Exception {
		return this.counttotal;
	}

	/**
	* <pre>
	* License name.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* License relevance.
	* </pre>
	*/
	public String get_relevance() throws Exception {
		return this.relevance;
	}

	/**
	* <pre>
	* License purchase date.
	* </pre>
	*/
	public String get_datepurchased() throws Exception {
		return this.datepurchased;
	}

	/**
	* <pre>
	* License SA date.
	* </pre>
	*/
	public String get_datesa() throws Exception {
		return this.datesa;
	}

	/**
	* <pre>
	* License expiry date.
	* </pre>
	*/
	public String get_dateexp() throws Exception {
		return this.dateexp;
	}

	/**
	* <pre>
	* Features.
	* </pre>
	*/
	public String[] get_features() throws Exception {
		return this.features;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsaptlicense_response result = (nsaptlicense_response) service.get_payload_formatter().string_to_resource(nsaptlicense_response.class, response);
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
		return result.nsaptlicense;
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
	* Use this API to change nsaptlicense.
	*/
	public static base_response change(nitro_service client, nsaptlicense resource) throws Exception {
		nsaptlicense updateresource = new nsaptlicense();
		updateresource.id = resource.id;
		updateresource.sessionid = resource.sessionid;
		updateresource.bindtype = resource.bindtype;
		updateresource.countavailable = resource.countavailable;
		updateresource.licensedir = resource.licensedir;
		return updateresource.perform_operation(client,"update");
	}

	/**
	* Use this API to change nsaptlicense resources.
	*/
	public static base_responses change(nitro_service client, nsaptlicense resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsaptlicense updateresources[] = new nsaptlicense[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nsaptlicense();
				updateresources[i].id = resources[i].id;
				updateresources[i].sessionid = resources[i].sessionid;
				updateresources[i].bindtype = resources[i].bindtype;
				updateresources[i].countavailable = resources[i].countavailable;
				updateresources[i].licensedir = resources[i].licensedir;
			}
			result = perform_operation_bulk_request(client, updateresources,"update");
		}
		return result;
	}

	/**
	* Use this API to fetch all the nsaptlicense resources that are configured on netscaler.
	* This uses nsaptlicense_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static nsaptlicense[] get(nitro_service service, nsaptlicense_args args) throws Exception{
		nsaptlicense obj = new nsaptlicense();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		nsaptlicense[] response = (nsaptlicense[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to count the nsaptlicense resources configured on NetScaler.
	*/
	public static long count(nitro_service service, nsaptlicense obj) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nsaptlicense[] response = (nsaptlicense[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
