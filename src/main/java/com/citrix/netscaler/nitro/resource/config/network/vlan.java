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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vlan_response extends base_response
{
	public vlan[] vlan;
}
/**
* Configuration for "VLAN" resource.
*/

public class vlan extends base_resource
{
	private Long id;
	private String aliasname;
	private String ipv6dynamicrouting;

	//------- Read only Parameter ---------;

	private String linklocalipv6addr;
	private Boolean rnat;
	private Long portbitmap;
	private Long lsbitmap;
	private Long tagbitmap;
	private Long lstagbitmap;
	private String ifaces;
	private String tagifaces;
	private String ifnum;
	private Boolean tagged;
	private String sdxvlan;
	private Long __count;

	/**
	* <pre>
	* ID of the VLAN whose parameters you want to modify.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* ID of the VLAN whose parameters you want to modify.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* ID of the VLAN whose parameters you want to modify.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* A name for the VLAN. Must begin with a letter, a number, or the underscore symbol, and can consist of from 1 to 31 letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. You should choose a name that helps identify the VLAN. However, you cannot perform any VLAN operation by specifying this name instead of the VLAN ID.<br> Maximum length =  31
	* </pre>
	*/
	public void set_aliasname(String aliasname) throws Exception{
		this.aliasname = aliasname;
	}

	/**
	* <pre>
	* A name for the VLAN. Must begin with a letter, a number, or the underscore symbol, and can consist of from 1 to 31 letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. You should choose a name that helps identify the VLAN. However, you cannot perform any VLAN operation by specifying this name instead of the VLAN ID.<br> Maximum length =  31
	* </pre>
	*/
	public String get_aliasname() throws Exception {
		return this.aliasname;
	}

	/**
	* <pre>
	* Enable all IPv6 dynamic routing protocols on this VLAN. Note: For the ENABLED setting to work, you must configure IPv6 dynamic routing protocols from the VTYSH command line.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ipv6dynamicrouting(String ipv6dynamicrouting) throws Exception{
		this.ipv6dynamicrouting = ipv6dynamicrouting;
	}

	/**
	* <pre>
	* Enable all IPv6 dynamic routing protocols on this VLAN. Note: For the ENABLED setting to work, you must configure IPv6 dynamic routing protocols from the VTYSH command line.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ipv6dynamicrouting() throws Exception {
		return this.ipv6dynamicrouting;
	}

	/**
	* <pre>
	* The link-local IP address assigned to the VLAN.
	* </pre>
	*/
	public String get_linklocalipv6addr() throws Exception {
		return this.linklocalipv6addr;
	}

	/**
	* <pre>
	* Temporary flag used for internal purpose.
	* </pre>
	*/
	public Boolean get_rnat() throws Exception {
		return this.rnat;
	}

	/**
	* <pre>
	* Member interfaces of this vlan.
	* </pre>
	*/
	public Long get_portbitmap() throws Exception {
		return this.portbitmap;
	}

	/**
	* <pre>
	* Member linksets of this vlan.
	* </pre>
	*/
	public Long get_lsbitmap() throws Exception {
		return this.lsbitmap;
	}

	/**
	* <pre>
	* Tagged members of this vlan.
	* </pre>
	*/
	public Long get_tagbitmap() throws Exception {
		return this.tagbitmap;
	}

	/**
	* <pre>
	* Tagged linksets of this vlan.
	* </pre>
	*/
	public Long get_lstagbitmap() throws Exception {
		return this.lstagbitmap;
	}

	/**
	* <pre>
	* Names of all member interfaces of this vlan.
	* </pre>
	*/
	public String get_ifaces() throws Exception {
		return this.ifaces;
	}

	/**
	* <pre>
	* Names of all tagged member interfaces of this vlan.
	* </pre>
	*/
	public String get_tagifaces() throws Exception {
		return this.tagifaces;
	}

	/**
	* <pre>
	* The interface to be bound to the VLAN, specified in slot/port notation (for example, 1/3).<br> Minimum length =  1
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* Make the interface an 802.1q tagged interface. Packets sent on this interface on this VLAN have an additional 4-byte 802.1q tag, which identifies the VLAN. To use 802.1q tagging, you must also configure the switch connected to the appliance's interfaces.
	* </pre>
	*/
	public Boolean get_tagged() throws Exception {
		return this.tagged;
	}

	/**
	* <pre>
	* SDX vlan.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_sdxvlan() throws Exception {
		return this.sdxvlan;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vlan_response result = (vlan_response) service.get_payload_formatter().string_to_resource(vlan_response.class, response);
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
		return result.vlan;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	/**
	* Use this API to add vlan.
	*/
	public static base_response add(nitro_service client, vlan resource) throws Exception {
		vlan addresource = new vlan();
		addresource.id = resource.id;
		addresource.aliasname = resource.aliasname;
		addresource.ipv6dynamicrouting = resource.ipv6dynamicrouting;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vlan resources.
	*/
	public static base_responses add(nitro_service client, vlan resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vlan addresources[] = new vlan[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vlan();
				addresources[i].id = resources[i].id;
				addresources[i].aliasname = resources[i].aliasname;
				addresources[i].ipv6dynamicrouting = resources[i].ipv6dynamicrouting;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vlan of given name.
	*/
	public static base_response delete(nitro_service client, Long id) throws Exception {
		vlan deleteresource = new vlan();
		deleteresource.id = id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vlan.
	*/
	public static base_response delete(nitro_service client, vlan resource) throws Exception {
		vlan deleteresource = new vlan();
		deleteresource.id = resource.id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vlan resources of given names.
	*/
	public static base_responses delete(nitro_service client, Long id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			vlan deleteresources[] = new vlan[id.length];
			for (int i=0;i<id.length;i++){
				deleteresources[i] = new vlan();
				deleteresources[i].id = id[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vlan resources.
	*/
	public static base_responses delete(nitro_service client, vlan resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vlan deleteresources[] = new vlan[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vlan();
				deleteresources[i].id = resources[i].id;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vlan.
	*/
	public static base_response update(nitro_service client, vlan resource) throws Exception {
		vlan updateresource = new vlan();
		updateresource.id = resource.id;
		updateresource.aliasname = resource.aliasname;
		updateresource.ipv6dynamicrouting = resource.ipv6dynamicrouting;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vlan resources.
	*/
	public static base_responses update(nitro_service client, vlan resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vlan updateresources[] = new vlan[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vlan();
				updateresources[i].id = resources[i].id;
				updateresources[i].aliasname = resources[i].aliasname;
				updateresources[i].ipv6dynamicrouting = resources[i].ipv6dynamicrouting;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vlan resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vlan resource, String[] args) throws Exception{
		vlan unsetresource = new vlan();
		unsetresource.id = resource.id;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vlan resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Long id[], String args[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			vlan unsetresources[] = new vlan[id.length];
			for (int i=0;i<id.length;i++){
				unsetresources[i] = new vlan();
				unsetresources[i].id = id[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vlan resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vlan resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vlan unsetresources[] = new vlan[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vlan();
				unsetresources[i].id = resources[i].id;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vlan resources that are configured on netscaler.
	*/
	public static vlan[] get(nitro_service service) throws Exception{
		vlan obj = new vlan();
		vlan[] response = (vlan[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vlan resources that are configured on netscaler.
	*/
	public static vlan[] get(nitro_service service, options option) throws Exception{
		vlan obj = new vlan();
		vlan[] response = (vlan[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vlan resource of given name .
	*/
	public static vlan get(nitro_service service, Long id) throws Exception{
		vlan obj = new vlan();
		obj.set_id(id);
		vlan response = (vlan) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vlan resources of given names .
	*/
	public static vlan[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			vlan response[] = new vlan[id.length];
			vlan obj[] = new vlan[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new vlan();
				obj[i].set_id(id[i]);
				response[i] = (vlan) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vlan resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vlan[] get_filtered(nitro_service service, String filter) throws Exception{
		vlan obj = new vlan();
		options option = new options();
		option.set_filter(filter);
		vlan[] response = (vlan[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vlan resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vlan[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vlan obj = new vlan();
		options option = new options();
		option.set_filter(filter);
		vlan[] response = (vlan[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vlan resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vlan obj = new vlan();
		options option = new options();
		option.set_count(true);
		vlan[] response = (vlan[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vlan resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vlan obj = new vlan();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vlan[] response = (vlan[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vlan resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vlan obj = new vlan();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vlan[] response = (vlan[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class ipv6dynamicroutingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sdxvlanEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
