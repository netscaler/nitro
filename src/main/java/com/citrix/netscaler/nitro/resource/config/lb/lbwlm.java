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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbwlm_response extends base_response
{
	public lbwlm[] lbwlm;
}
/**
* Configuration for web log manager resource.
*/

public class lbwlm extends base_resource
{
	private String wlmname;
	private String ipaddress;
	private Integer port;
	private String lbuid;
	private Long katimeout;

	//------- Read only Parameter ---------;

	private String secure;
	private String state;
	private Long __count;

	/**
	* <pre>
	* The name of the Work Load Manager.<br> Minimum length =  1
	* </pre>
	*/
	public void set_wlmname(String wlmname) throws Exception{
		this.wlmname = wlmname;
	}

	/**
	* <pre>
	* The name of the Work Load Manager.<br> Minimum length =  1
	* </pre>
	*/
	public String get_wlmname() throws Exception {
		return this.wlmname;
	}

	/**
	* <pre>
	* The IP address of the WLM.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The IP address of the WLM.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* The port of the WLM.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* The port of the WLM.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* The port of the WLM.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The LBUID for the Load Balancer to communicate to the Work Load Manager.
	* </pre>
	*/
	public void set_lbuid(String lbuid) throws Exception{
		this.lbuid = lbuid;
	}

	/**
	* <pre>
	* The LBUID for the Load Balancer to communicate to the Work Load Manager.
	* </pre>
	*/
	public String get_lbuid() throws Exception {
		return this.lbuid;
	}

	/**
	* <pre>
	* The idle time period after which NS would probe the WLM. The value ranges from 1 to 1440 minutes.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_katimeout(long katimeout) throws Exception {
		this.katimeout = new Long(katimeout);
	}

	/**
	* <pre>
	* The idle time period after which NS would probe the WLM. The value ranges from 1 to 1440 minutes.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_katimeout(Long katimeout) throws Exception{
		this.katimeout = katimeout;
	}

	/**
	* <pre>
	* The idle time period after which NS would probe the WLM. The value ranges from 1 to 1440 minutes.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_katimeout() throws Exception {
		return this.katimeout;
	}

	/**
	* <pre>
	* Use this parameter to enable secure mode of communication with WLM.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_secure() throws Exception {
		return this.secure;
	}

	/**
	* <pre>
	* State of the WLM.<br> Possible values = ACTIVE, INACTIVE, UNKNOWN
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbwlm_response result = (lbwlm_response) service.get_payload_formatter().string_to_resource(lbwlm_response.class, response);
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
		return result.lbwlm;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.wlmname;
	}

	/**
	* Use this API to add lbwlm.
	*/
	public static base_response add(nitro_service client, lbwlm resource) throws Exception {
		lbwlm addresource = new lbwlm();
		addresource.wlmname = resource.wlmname;
		addresource.ipaddress = resource.ipaddress;
		addresource.port = resource.port;
		addresource.lbuid = resource.lbuid;
		addresource.katimeout = resource.katimeout;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add lbwlm resources.
	*/
	public static base_responses add(nitro_service client, lbwlm resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbwlm addresources[] = new lbwlm[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new lbwlm();
				addresources[i].wlmname = resources[i].wlmname;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].port = resources[i].port;
				addresources[i].lbuid = resources[i].lbuid;
				addresources[i].katimeout = resources[i].katimeout;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbwlm of given name.
	*/
	public static base_response delete(nitro_service client, String wlmname) throws Exception {
		lbwlm deleteresource = new lbwlm();
		deleteresource.wlmname = wlmname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbwlm.
	*/
	public static base_response delete(nitro_service client, lbwlm resource) throws Exception {
		lbwlm deleteresource = new lbwlm();
		deleteresource.wlmname = resource.wlmname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbwlm resources of given names.
	*/
	public static base_responses delete(nitro_service client, String wlmname[]) throws Exception {
		base_responses result = null;
		if (wlmname != null && wlmname.length > 0) {
			lbwlm deleteresources[] = new lbwlm[wlmname.length];
			for (int i=0;i<wlmname.length;i++){
				deleteresources[i] = new lbwlm();
				deleteresources[i].wlmname = wlmname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbwlm resources.
	*/
	public static base_responses delete(nitro_service client, lbwlm resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbwlm deleteresources[] = new lbwlm[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbwlm();
				deleteresources[i].wlmname = resources[i].wlmname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update lbwlm.
	*/
	public static base_response update(nitro_service client, lbwlm resource) throws Exception {
		lbwlm updateresource = new lbwlm();
		updateresource.wlmname = resource.wlmname;
		updateresource.katimeout = resource.katimeout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update lbwlm resources.
	*/
	public static base_responses update(nitro_service client, lbwlm resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbwlm updateresources[] = new lbwlm[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbwlm();
				updateresources[i].wlmname = resources[i].wlmname;
				updateresources[i].katimeout = resources[i].katimeout;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbwlm resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, lbwlm resource, String[] args) throws Exception{
		lbwlm unsetresource = new lbwlm();
		unsetresource.wlmname = resource.wlmname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of lbwlm resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String wlmname[], String args[]) throws Exception {
		base_responses result = null;
		if (wlmname != null && wlmname.length > 0) {
			lbwlm unsetresources[] = new lbwlm[wlmname.length];
			for (int i=0;i<wlmname.length;i++){
				unsetresources[i] = new lbwlm();
				unsetresources[i].wlmname = wlmname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbwlm resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, lbwlm resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbwlm unsetresources[] = new lbwlm[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new lbwlm();
				unsetresources[i].wlmname = resources[i].wlmname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the lbwlm resources that are configured on netscaler.
	*/
	public static lbwlm[] get(nitro_service service) throws Exception{
		lbwlm obj = new lbwlm();
		lbwlm[] response = (lbwlm[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lbwlm resources that are configured on netscaler.
	*/
	public static lbwlm[] get(nitro_service service, options option) throws Exception{
		lbwlm obj = new lbwlm();
		lbwlm[] response = (lbwlm[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch lbwlm resource of given name .
	*/
	public static lbwlm get(nitro_service service, String wlmname) throws Exception{
		lbwlm obj = new lbwlm();
		obj.set_wlmname(wlmname);
		lbwlm response = (lbwlm) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbwlm resources of given names .
	*/
	public static lbwlm[] get(nitro_service service, String wlmname[]) throws Exception{
		if (wlmname !=null && wlmname.length>0) {
			lbwlm response[] = new lbwlm[wlmname.length];
			lbwlm obj[] = new lbwlm[wlmname.length];
			for (int i=0;i<wlmname.length;i++) {
				obj[i] = new lbwlm();
				obj[i].set_wlmname(wlmname[i]);
				response[i] = (lbwlm) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of lbwlm resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbwlm[] get_filtered(nitro_service service, String filter) throws Exception{
		lbwlm obj = new lbwlm();
		options option = new options();
		option.set_filter(filter);
		lbwlm[] response = (lbwlm[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbwlm resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbwlm[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbwlm obj = new lbwlm();
		options option = new options();
		option.set_filter(filter);
		lbwlm[] response = (lbwlm[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbwlm resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lbwlm obj = new lbwlm();
		options option = new options();
		option.set_count(true);
		lbwlm[] response = (lbwlm[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbwlm resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lbwlm obj = new lbwlm();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbwlm[] response = (lbwlm[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbwlm resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbwlm obj = new lbwlm();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbwlm[] response = (lbwlm[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class secureEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class stateEnum {
		public static final String ACTIVE = "ACTIVE";
		public static final String INACTIVE = "INACTIVE";
		public static final String UNKNOWN = "UNKNOWN";
	}
}
