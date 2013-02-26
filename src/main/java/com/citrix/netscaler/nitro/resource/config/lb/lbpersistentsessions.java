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

class lbpersistentsessions_response extends base_response
{
	public lbpersistentsessions[] lbpersistentsessions;
}
/**
* Configuration for persistence session resource.
*/

public class lbpersistentsessions extends base_resource
{
	private String vserver;
	private String persistenceparameter;

	//------- Read only Parameter ---------;

	private Long type;
	private String srcip;
	private String srcipv6;
	private String destip;
	private String destipv6;
	private Boolean flags;
	private Integer destport;
	private String vservername;
	private Long timeout;
	private Long referencecount;
	private String sipcallid;
	private String persistenceparam;
	private Long __count;

	/**
	* <pre>
	* The name of the virtual server.
	* </pre>
	*/
	public void set_vserver(String vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* The name of the virtual server.
	* </pre>
	*/
	public String get_vserver() throws Exception {
		return this.vserver;
	}

	/**
	* <pre>
	* The persistence parameter whose persistence sessions are to be flushed.
	* </pre>
	*/
	public void set_persistenceparameter(String persistenceparameter) throws Exception{
		this.persistenceparameter = persistenceparameter;
	}

	/**
	* <pre>
	* The persistence parameter whose persistence sessions are to be flushed.
	* </pre>
	*/
	public String get_persistenceparameter() throws Exception {
		return this.persistenceparameter;
	}

	/**
	* <pre>
	* The netmask of this IP.
	* </pre>
	*/
	public Long get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* SOURCE IP.
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* SOURCE IPv6 ADDRESS.
	* </pre>
	*/
	public String get_srcipv6() throws Exception {
		return this.srcipv6;
	}

	/**
	* <pre>
	* DESTINATION IP.
	* </pre>
	*/
	public String get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* DESTINATION IPv6 ADDRESS.
	* </pre>
	*/
	public String get_destipv6() throws Exception {
		return this.destipv6;
	}

	/**
	* <pre>
	* IPv6 FLAGS.
	* </pre>
	*/
	public Boolean get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Destination port.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* Virtual server name.
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* Persistent Session timeout.
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* Reference Count.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* SIP CALLID.
	* </pre>
	*/
	public String get_sipcallid() throws Exception {
		return this.sipcallid;
	}

	/**
	* <pre>
	* Specific persistence information . Callid in case of SIP_CALLID persistence entry , RTSP session id in case of RTSP_SESSIONID persistence entry.
	* </pre>
	*/
	public String get_persistenceparam() throws Exception {
		return this.persistenceparam;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbpersistentsessions_response result = (lbpersistentsessions_response) service.get_payload_formatter().string_to_resource(lbpersistentsessions_response.class, response);
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
		return result.lbpersistentsessions;
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
	* Use this API to clear lbpersistentsessions.
	*/
	public static base_response clear(nitro_service client, lbpersistentsessions resource) throws Exception {
		lbpersistentsessions clearresource = new lbpersistentsessions();
		clearresource.vserver = resource.vserver;
		clearresource.persistenceparameter = resource.persistenceparameter;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear lbpersistentsessions resources.
	*/
	public static base_responses clear(nitro_service client, lbpersistentsessions resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbpersistentsessions clearresources[] = new lbpersistentsessions[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new lbpersistentsessions();
				clearresources[i].vserver = resources[i].vserver;
				clearresources[i].persistenceparameter = resources[i].persistenceparameter;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to fetch all the lbpersistentsessions resources that are configured on netscaler.
	*/
	public static lbpersistentsessions[] get(nitro_service service) throws Exception{
		lbpersistentsessions obj = new lbpersistentsessions();
		lbpersistentsessions[] response = (lbpersistentsessions[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lbpersistentsessions resources that are configured on netscaler.
	*/
	public static lbpersistentsessions[] get(nitro_service service, options option) throws Exception{
		lbpersistentsessions obj = new lbpersistentsessions();
		lbpersistentsessions[] response = (lbpersistentsessions[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the lbpersistentsessions resources that are configured on netscaler.
	* This uses lbpersistentsessions_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static lbpersistentsessions[] get(nitro_service service, lbpersistentsessions_args args) throws Exception{
		lbpersistentsessions obj = new lbpersistentsessions();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		lbpersistentsessions[] response = (lbpersistentsessions[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbpersistentsessions resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbpersistentsessions[] get_filtered(nitro_service service, String filter) throws Exception{
		lbpersistentsessions obj = new lbpersistentsessions();
		options option = new options();
		option.set_filter(filter);
		lbpersistentsessions[] response = (lbpersistentsessions[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbpersistentsessions resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbpersistentsessions[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbpersistentsessions obj = new lbpersistentsessions();
		options option = new options();
		option.set_filter(filter);
		lbpersistentsessions[] response = (lbpersistentsessions[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbpersistentsessions resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lbpersistentsessions obj = new lbpersistentsessions();
		options option = new options();
		option.set_count(true);
		lbpersistentsessions[] response = (lbpersistentsessions[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbpersistentsessions resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lbpersistentsessions obj = new lbpersistentsessions();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbpersistentsessions[] response = (lbpersistentsessions[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbpersistentsessions resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbpersistentsessions obj = new lbpersistentsessions();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbpersistentsessions[] response = (lbpersistentsessions[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
