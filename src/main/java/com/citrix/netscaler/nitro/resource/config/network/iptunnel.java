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

class iptunnel_response extends base_response
{
	public iptunnel[] iptunnel;
}
/**
* Configuration for ip Tunnel resource.
*/

public class iptunnel extends base_resource
{
	private String name;
	private String remote;
	private String remotesubnetmask;
	private String local;
	private String protocol;
	private String ipsecprofilename;

	//------- Read only Parameter ---------;

	private String sysname;
	private Long type;
	private String encapip;
	private Long channel;
	private String[] tunneltype;
	private String ipsectunnelstatus;
	private String pbrname;
	private Long __count;

	/**
	* <pre>
	* Name for the IP tunnel. Leading character must be a number or letter. Other characters allowed, after the first character, are @ _ - . (period) : (colon) # and space ( ).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the IP tunnel. Leading character must be a number or letter. Other characters allowed, after the first character, are @ _ - . (period) : (colon) # and space ( ).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Public IPv4 address, of the remote device, used to set up the tunnel. For this parameter, you can alternativelyspecify a network address if you specify IPIP (IP over IP) for the Protocol parameter.<br> Minimum length =  1
	* </pre>
	*/
	public void set_remote(String remote) throws Exception{
		this.remote = remote;
	}

	/**
	* <pre>
	* Public IPv4 address, of the remote device, used to set up the tunnel. For this parameter, you can alternativelyspecify a network address if you specify IPIP (IP over IP) for the Protocol parameter.<br> Minimum length =  1
	* </pre>
	*/
	public String get_remote() throws Exception {
		return this.remote;
	}

	/**
	* <pre>
	* Subnet mask of the remote IP address of the tunnel.
	* </pre>
	*/
	public void set_remotesubnetmask(String remotesubnetmask) throws Exception{
		this.remotesubnetmask = remotesubnetmask;
	}

	/**
	* <pre>
	* Subnet mask of the remote IP address of the tunnel.
	* </pre>
	*/
	public String get_remotesubnetmask() throws Exception {
		return this.remotesubnetmask;
	}

	/**
	* <pre>
	* Type ofNetScaler owned public IPv4 address, configured on the local NetScaler appliance and used to set up the tunnel.
	* </pre>
	*/
	public void set_local(String local) throws Exception{
		this.local = local;
	}

	/**
	* <pre>
	* Type ofNetScaler owned public IPv4 address, configured on the local NetScaler appliance and used to set up the tunnel.
	* </pre>
	*/
	public String get_local() throws Exception {
		return this.local;
	}

	/**
	* <pre>
	* The IP tunneling protocol.<br> Default value: IPIP<br> Possible values = IPIP, GRE, IPSEC
	* </pre>
	*/
	public void set_protocol(String protocol) throws Exception{
		this.protocol = protocol;
	}

	/**
	* <pre>
	* The IP tunneling protocol.<br> Default value: IPIP<br> Possible values = IPIP, GRE, IPSEC
	* </pre>
	*/
	public String get_protocol() throws Exception {
		return this.protocol;
	}

	/**
	* <pre>
	* Name of IPSec profile to be associated.<br> Default value: "ns_ipsec_default_profile"
	* </pre>
	*/
	public void set_ipsecprofilename(String ipsecprofilename) throws Exception{
		this.ipsecprofilename = ipsecprofilename;
	}

	/**
	* <pre>
	* Name of IPSec profile to be associated.<br> Default value: "ns_ipsec_default_profile"
	* </pre>
	*/
	public String get_ipsecprofilename() throws Exception {
		return this.ipsecprofilename;
	}

	/**
	* <pre>
	* The name of the ip tunnel.
	* </pre>
	*/
	public String get_sysname() throws Exception {
		return this.sysname;
	}

	/**
	* <pre>
	* The type of this tunnel.
	* </pre>
	*/
	public Long get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The effective local IP address of the tunnel. Used as the source of the encapsulated packets.
	* </pre>
	*/
	public String get_encapip() throws Exception {
		return this.encapip;
	}

	/**
	* <pre>
	* The tunnel that is bound to a netbridge.
	* </pre>
	*/
	public Long get_channel() throws Exception {
		return this.channel;
	}

	/**
	* <pre>
	* Indicates that a tunnel is User-Configured, Internal or DELETE-IN-PROGRESS.<br> Possible values = Configured, Delete-In-Progress
	* </pre>
	*/
	public String[] get_tunneltype() throws Exception {
		return this.tunneltype;
	}

	/**
	* <pre>
	* Whether the ipsec on this tunnel is up or down.<br> Possible values = DOWN, UP, PARTIAL-UP, UNKNOWN
	* </pre>
	*/
	public String get_ipsectunnelstatus() throws Exception {
		return this.ipsectunnelstatus;
	}

	/**
	* <pre>
	* Name for the PBR.
	* </pre>
	*/
	public String get_pbrname() throws Exception {
		return this.pbrname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		iptunnel_response result = (iptunnel_response) service.get_payload_formatter().string_to_resource(iptunnel_response.class, response);
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
		return result.iptunnel;
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
	* Use this API to add iptunnel.
	*/
	public static base_response add(nitro_service client, iptunnel resource) throws Exception {
		iptunnel addresource = new iptunnel();
		addresource.name = resource.name;
		addresource.remote = resource.remote;
		addresource.remotesubnetmask = resource.remotesubnetmask;
		addresource.local = resource.local;
		addresource.protocol = resource.protocol;
		addresource.ipsecprofilename = resource.ipsecprofilename;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add iptunnel resources.
	*/
	public static base_responses add(nitro_service client, iptunnel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			iptunnel addresources[] = new iptunnel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new iptunnel();
				addresources[i].name = resources[i].name;
				addresources[i].remote = resources[i].remote;
				addresources[i].remotesubnetmask = resources[i].remotesubnetmask;
				addresources[i].local = resources[i].local;
				addresources[i].protocol = resources[i].protocol;
				addresources[i].ipsecprofilename = resources[i].ipsecprofilename;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete iptunnel of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		iptunnel deleteresource = new iptunnel();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete iptunnel.
	*/
	public static base_response delete(nitro_service client, iptunnel resource) throws Exception {
		iptunnel deleteresource = new iptunnel();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete iptunnel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			iptunnel deleteresources[] = new iptunnel[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new iptunnel();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete iptunnel resources.
	*/
	public static base_responses delete(nitro_service client, iptunnel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			iptunnel deleteresources[] = new iptunnel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new iptunnel();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the iptunnel resources that are configured on netscaler.
	*/
	public static iptunnel[] get(nitro_service service) throws Exception{
		iptunnel obj = new iptunnel();
		iptunnel[] response = (iptunnel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the iptunnel resources that are configured on netscaler.
	*/
	public static iptunnel[] get(nitro_service service, options option) throws Exception{
		iptunnel obj = new iptunnel();
		iptunnel[] response = (iptunnel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the iptunnel resources that are configured on netscaler.
	* This uses iptunnel_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static iptunnel[] get(nitro_service service, iptunnel_args args) throws Exception{
		iptunnel obj = new iptunnel();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		iptunnel[] response = (iptunnel[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch iptunnel resource of given name .
	*/
	public static iptunnel get(nitro_service service, String name) throws Exception{
		iptunnel obj = new iptunnel();
		obj.set_name(name);
		iptunnel response = (iptunnel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch iptunnel resources of given names .
	*/
	public static iptunnel[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			iptunnel response[] = new iptunnel[name.length];
			iptunnel obj[] = new iptunnel[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new iptunnel();
				obj[i].set_name(name[i]);
				response[i] = (iptunnel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of iptunnel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static iptunnel[] get_filtered(nitro_service service, String filter) throws Exception{
		iptunnel obj = new iptunnel();
		options option = new options();
		option.set_filter(filter);
		iptunnel[] response = (iptunnel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of iptunnel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static iptunnel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		iptunnel obj = new iptunnel();
		options option = new options();
		option.set_filter(filter);
		iptunnel[] response = (iptunnel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the iptunnel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		iptunnel obj = new iptunnel();
		options option = new options();
		option.set_count(true);
		iptunnel[] response = (iptunnel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of iptunnel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		iptunnel obj = new iptunnel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		iptunnel[] response = (iptunnel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of iptunnel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		iptunnel obj = new iptunnel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		iptunnel[] response = (iptunnel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class protocolEnum {
		public static final String IPIP = "IPIP";
		public static final String GRE = "GRE";
		public static final String IPSEC = "IPSEC";
	}
	public static class tunneltypeEnum {
		public static final String Configured = "Configured";
		public static final String Delete_In_Progress = "Delete-In-Progress";
	}
	public static class ipsectunnelstatusEnum {
		public static final String DOWN = "DOWN";
		public static final String UP = "UP";
		public static final String PARTIAL_UP = "PARTIAL-UP";
		public static final String UNKNOWN = "UNKNOWN";
	}
}
