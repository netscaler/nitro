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

class inat_response extends base_response
{
	public inat[] inat;
}
/**
* Configuration for inbound nat resource.
*/

public class inat extends base_resource
{
	private String name;
	private String publicip;
	private String privateip;
	private String tcpproxy;
	private String ftp;
	private String usip;
	private String usnip;
	private String proxyip;
	private String mode;

	//------- Read only Parameter ---------;

	private Long flags;
	private Long __count;

	/**
	* <pre>
	* A Name for the Inbound NAT (INAT) entry. The name must not exceed 127 characters, and the leading character must be a number or letter. The following characters are also allowed: @ _ - . (period) : (colon) # and space ( ).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* A Name for the Inbound NAT (INAT) entry. The name must not exceed 127 characters, and the leading character must be a number or letter. The following characters are also allowed: @ _ - . (period) : (colon) # and space ( ).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Public IP address of packets received on the NetScaler appliance. Can be either an IPv4 or an IPv6 address. Possible values: NetScaler-owned VIPs.<br> Minimum length =  1
	* </pre>
	*/
	public void set_publicip(String publicip) throws Exception{
		this.publicip = publicip;
	}

	/**
	* <pre>
	* Public IP address of packets received on the NetScaler appliance. Can be either an IPv4 or an IPv6 address. Possible values: NetScaler-owned VIPs.<br> Minimum length =  1
	* </pre>
	*/
	public String get_publicip() throws Exception {
		return this.publicip;
	}

	/**
	* <pre>
	* IP address of the server to which the packet is sent by the NetScaler. Can be either an IPv4 or an IPv6 address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_privateip(String privateip) throws Exception{
		this.privateip = privateip;
	}

	/**
	* <pre>
	* IP address of the server to which the packet is sent by the NetScaler. Can be either an IPv4 or an IPv6 address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_privateip() throws Exception {
		return this.privateip;
	}

	/**
	* <pre>
	* Enable TCP proxying, which enables the NetScaler appliance to optimize the TCP traffic by using Layer 4 features.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tcpproxy(String tcpproxy) throws Exception{
		this.tcpproxy = tcpproxy;
	}

	/**
	* <pre>
	* Enable TCP proxying, which enables the NetScaler appliance to optimize the TCP traffic by using Layer 4 features.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tcpproxy() throws Exception {
		return this.tcpproxy;
	}

	/**
	* <pre>
	* Enable the FTP protocol on the server for transferring files between the client and the server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ftp(String ftp) throws Exception{
		this.ftp = ftp;
	}

	/**
	* <pre>
	* Enable the FTP protocol on the server for transferring files between the client and the server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ftp() throws Exception {
		return this.ftp;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to retain the source IP address of the packets before sending the packets to the server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_usip(String usip) throws Exception{
		this.usip = usip;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to retain the source IP address of the packets before sending the packets to the server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_usip() throws Exception {
		return this.usip;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to use an SNIP address as the source IP address of the packets before sending the packets to the server.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_usnip(String usnip) throws Exception{
		this.usnip = usnip;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to use an SNIP address as the source IP address of the packets before sending the packets to the server.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_usnip() throws Exception {
		return this.usnip;
	}

	/**
	* <pre>
	* proxyIP	A unique IP address used as the source IP address in packets sent to the server. Must be a MIP or SNIP address.
	* </pre>
	*/
	public void set_proxyip(String proxyip) throws Exception{
		this.proxyip = proxyip;
	}

	/**
	* <pre>
	* proxyIP	A unique IP address used as the source IP address in packets sent to the server. Must be a MIP or SNIP address.
	* </pre>
	*/
	public String get_proxyip() throws Exception {
		return this.proxyip;
	}

	/**
	* <pre>
	* Stateless translation.<br> Possible values = 
	* </pre>
	*/
	public void set_mode(String mode) throws Exception{
		this.mode = mode;
	}

	/**
	* <pre>
	* Stateless translation.<br> Possible values = 
	* </pre>
	*/
	public String get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* Flags for different modes.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		inat_response result = (inat_response) service.get_payload_formatter().string_to_resource(inat_response.class, response);
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
		return result.inat;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add inat.
	*/
	public static base_response add(nitro_service client, inat resource) throws Exception {
		inat addresource = new inat();
		addresource.name = resource.name;
		addresource.publicip = resource.publicip;
		addresource.privateip = resource.privateip;
		addresource.tcpproxy = resource.tcpproxy;
		addresource.ftp = resource.ftp;
		addresource.usip = resource.usip;
		addresource.usnip = resource.usnip;
		addresource.proxyip = resource.proxyip;
		addresource.mode = resource.mode;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add inat resources.
	*/
	public static base_responses add(nitro_service client, inat resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			inat addresources[] = new inat[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new inat();
				addresources[i].name = resources[i].name;
				addresources[i].publicip = resources[i].publicip;
				addresources[i].privateip = resources[i].privateip;
				addresources[i].tcpproxy = resources[i].tcpproxy;
				addresources[i].ftp = resources[i].ftp;
				addresources[i].usip = resources[i].usip;
				addresources[i].usnip = resources[i].usnip;
				addresources[i].proxyip = resources[i].proxyip;
				addresources[i].mode = resources[i].mode;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete inat of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		inat deleteresource = new inat();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete inat.
	*/
	public static base_response delete(nitro_service client, inat resource) throws Exception {
		inat deleteresource = new inat();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete inat resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			inat deleteresources[] = new inat[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new inat();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete inat resources.
	*/
	public static base_responses delete(nitro_service client, inat resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			inat deleteresources[] = new inat[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new inat();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update inat.
	*/
	public static base_response update(nitro_service client, inat resource) throws Exception {
		inat updateresource = new inat();
		updateresource.name = resource.name;
		updateresource.privateip = resource.privateip;
		updateresource.tcpproxy = resource.tcpproxy;
		updateresource.ftp = resource.ftp;
		updateresource.usip = resource.usip;
		updateresource.usnip = resource.usnip;
		updateresource.proxyip = resource.proxyip;
		updateresource.mode = resource.mode;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update inat resources.
	*/
	public static base_responses update(nitro_service client, inat resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			inat updateresources[] = new inat[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new inat();
				updateresources[i].name = resources[i].name;
				updateresources[i].privateip = resources[i].privateip;
				updateresources[i].tcpproxy = resources[i].tcpproxy;
				updateresources[i].ftp = resources[i].ftp;
				updateresources[i].usip = resources[i].usip;
				updateresources[i].usnip = resources[i].usnip;
				updateresources[i].proxyip = resources[i].proxyip;
				updateresources[i].mode = resources[i].mode;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of inat resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		inat unsetresource = new inat();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of inat resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, inat resource, String[] args) throws Exception{
		inat unsetresource = new inat();
		unsetresource.name = resource.name;
		unsetresource.tcpproxy = resource.tcpproxy;
		unsetresource.ftp = resource.ftp;
		unsetresource.usip = resource.usip;
		unsetresource.usnip = resource.usnip;
		unsetresource.proxyip = resource.proxyip;
		unsetresource.mode = resource.mode;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of inat resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			inat unsetresources[] = new inat[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new inat();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of inat resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, inat resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			inat unsetresources[] = new inat[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new inat();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].tcpproxy = resources[i].tcpproxy;
				unsetresources[i].ftp = resources[i].ftp;
				unsetresources[i].usip = resources[i].usip;
				unsetresources[i].usnip = resources[i].usnip;
				unsetresources[i].proxyip = resources[i].proxyip;
				unsetresources[i].mode = resources[i].mode;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the inat resources that are configured on netscaler.
	*/
	public static inat[] get(nitro_service service) throws Exception{
		inat obj = new inat();
		inat[] response = (inat[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the inat resources that are configured on netscaler.
	*/
	public static inat[] get(nitro_service service, options option) throws Exception{
		inat obj = new inat();
		inat[] response = (inat[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch inat resource of given name .
	*/
	public static inat get(nitro_service service, String name) throws Exception{
		inat obj = new inat();
		obj.set_name(name);
		inat response = (inat) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch inat resources of given names .
	*/
	public static inat[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			inat response[] = new inat[name.length];
			inat obj[] = new inat[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new inat();
				obj[i].set_name(name[i]);
				response[i] = (inat) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of inat resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static inat[] get_filtered(nitro_service service, String filter) throws Exception{
		inat obj = new inat();
		options option = new options();
		option.set_filter(filter);
		inat[] response = (inat[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of inat resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static inat[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		inat obj = new inat();
		options option = new options();
		option.set_filter(filter);
		inat[] response = (inat[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the inat resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		inat obj = new inat();
		options option = new options();
		option.set_count(true);
		inat[] response = (inat[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of inat resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		inat obj = new inat();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		inat[] response = (inat[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of inat resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		inat obj = new inat();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		inat[] response = (inat[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class ftpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class usnipEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class tcpproxyEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class usipEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
