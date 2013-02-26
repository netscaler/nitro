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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaasession_response extends base_response
{
	public aaasession[] aaasession;
}
/**
* Configuration for active connection resource.
*/

public class aaasession extends base_resource
{
	private String username;
	private String groupname;
	private String iip;
	private String netmask;
	private Boolean all;

	//------- Read only Parameter ---------;

	private String publicip;
	private Integer publicport;
	private String ipaddress;
	private Integer port;
	private String privateip;
	private Integer privateport;
	private String destip;
	private Integer destport;
	private String intranetip;
	private Long peid;
	private Long __count;

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* The group name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* The group name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* Intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_iip(String iip) throws Exception{
		this.iip = iip;
	}

	/**
	* <pre>
	* Intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_iip() throws Exception {
		return this.iip;
	}

	/**
	* <pre>
	* The netmask associated with the intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The netmask associated with the intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* Terminate the sessions of all users who are currently logged in.  .
	* </pre>
	*/
	public void set_all(boolean all) throws Exception {
		this.all = new Boolean(all);
	}

	/**
	* <pre>
	* Terminate the sessions of all users who are currently logged in.  .
	* </pre>
	*/
	public void set_all(Boolean all) throws Exception{
		this.all = all;
	}

	/**
	* <pre>
	* Terminate the sessions of all users who are currently logged in.  .
	* </pre>
	*/
	public Boolean get_all() throws Exception {
		return this.all;
	}

	/**
	* <pre>
	* Client's public IP address.
	* </pre>
	*/
	public String get_publicip() throws Exception {
		return this.publicip;
	}

	/**
	* <pre>
	* Client's public port.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_publicport() throws Exception {
		return this.publicport;
	}

	/**
	* <pre>
	* NetScaler's IP address.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* NetScaler's port.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Client's private/mapped IP address.
	* </pre>
	*/
	public String get_privateip() throws Exception {
		return this.privateip;
	}

	/**
	* <pre>
	* Client's private/mapped port.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_privateport() throws Exception {
		return this.privateport;
	}

	/**
	* <pre>
	* Destination IP address.
	* </pre>
	*/
	public String get_destip() throws Exception {
		return this.destip;
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
	* Specifies the Intranet IP.
	* </pre>
	*/
	public String get_intranetip() throws Exception {
		return this.intranetip;
	}

	/**
	* <pre>
	* Core id of the session owner.
	* </pre>
	*/
	public Long get_peid() throws Exception {
		return this.peid;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaasession_response result = (aaasession_response) service.get_payload_formatter().string_to_resource(aaasession_response.class, response);
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
		return result.aaasession;
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
	* Use this API to kill aaasession.
	*/
	public static base_response kill(nitro_service client, aaasession resource) throws Exception {
		aaasession killresource = new aaasession();
		killresource.username = resource.username;
		killresource.groupname = resource.groupname;
		killresource.iip = resource.iip;
		killresource.netmask = resource.netmask;
		killresource.all = resource.all;
		return killresource.perform_operation(client,"kill");
	}

	/**
	* Use this API to kill aaasession resources.
	*/
	public static base_responses kill(nitro_service client, aaasession resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaasession killresources[] = new aaasession[resources.length];
			for (int i=0;i<resources.length;i++){
				killresources[i] = new aaasession();
				killresources[i].username = resources[i].username;
				killresources[i].groupname = resources[i].groupname;
				killresources[i].iip = resources[i].iip;
				killresources[i].netmask = resources[i].netmask;
				killresources[i].all = resources[i].all;
			}
			result = perform_operation_bulk_request(client, killresources,"kill");
		}
		return result;
	}

	/**
	* Use this API to fetch all the aaasession resources that are configured on netscaler.
	*/
	public static aaasession[] get(nitro_service service) throws Exception{
		aaasession obj = new aaasession();
		aaasession[] response = (aaasession[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the aaasession resources that are configured on netscaler.
	*/
	public static aaasession[] get(nitro_service service, options option) throws Exception{
		aaasession obj = new aaasession();
		aaasession[] response = (aaasession[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the aaasession resources that are configured on netscaler.
	* This uses aaasession_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static aaasession[] get(nitro_service service, aaasession_args args) throws Exception{
		aaasession obj = new aaasession();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		aaasession[] response = (aaasession[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaasession resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaasession[] get_filtered(nitro_service service, String filter) throws Exception{
		aaasession obj = new aaasession();
		options option = new options();
		option.set_filter(filter);
		aaasession[] response = (aaasession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaasession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaasession[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaasession obj = new aaasession();
		options option = new options();
		option.set_filter(filter);
		aaasession[] response = (aaasession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the aaasession resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		aaasession obj = new aaasession();
		options option = new options();
		option.set_count(true);
		aaasession[] response = (aaasession[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of aaasession resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		aaasession obj = new aaasession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaasession[] response = (aaasession[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaasession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaasession obj = new aaasession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaasession[] response = (aaasession[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
