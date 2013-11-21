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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnintranetapplication_response extends base_response
{
	public vpnintranetapplication[] vpnintranetapplication;
}
/**
* Configuration for SSLVPN intranet application resource.
*/

public class vpnintranetapplication extends base_resource
{
	private String intranetapplication;
	private String protocol;
	private String destip;
	private String netmask;
	private String iprange;
	private String hostname;
	private String[] clientapplication;
	private String spoofiip;
	private String destport;
	private String interception;
	private String srcip;
	private Integer srcport;

	//------- Read only Parameter ---------;

	private String ipaddress;
	private Long __count;

	/**
	* <pre>
	* Name of the intranet application.<br> Minimum length =  1
	* </pre>
	*/
	public void set_intranetapplication(String intranetapplication) throws Exception{
		this.intranetapplication = intranetapplication;
	}

	/**
	* <pre>
	* Name of the intranet application.<br> Minimum length =  1
	* </pre>
	*/
	public String get_intranetapplication() throws Exception {
		return this.intranetapplication;
	}

	/**
	* <pre>
	* Protocol used by the intranet application. If protocol is set to BOTH, TCP and UDP traffic is allowed.<br> Possible values = TCP, UDP, ANY
	* </pre>
	*/
	public void set_protocol(String protocol) throws Exception{
		this.protocol = protocol;
	}

	/**
	* <pre>
	* Protocol used by the intranet application. If protocol is set to BOTH, TCP and UDP traffic is allowed.<br> Possible values = TCP, UDP, ANY
	* </pre>
	*/
	public String get_protocol() throws Exception {
		return this.protocol;
	}

	/**
	* <pre>
	* Destination IP address, IP range, or host name of the intranet application. This address is the server IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_destip(String destip) throws Exception{
		this.destip = destip;
	}

	/**
	* <pre>
	* Destination IP address, IP range, or host name of the intranet application. This address is the server IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* Destination subnet mask for the intranet application.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* Destination subnet mask for the intranet application.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* If you have multiple servers in your network, such as web, email, and file shares, configure an intranet application that includes the IP range for all the network applications. This allows users to access all the intranet applications contained in the IP address range.<br> Minimum length =  1
	* </pre>
	*/
	public void set_iprange(String iprange) throws Exception{
		this.iprange = iprange;
	}

	/**
	* <pre>
	* If you have multiple servers in your network, such as web, email, and file shares, configure an intranet application that includes the IP range for all the network applications. This allows users to access all the intranet applications contained in the IP address range.<br> Minimum length =  1
	* </pre>
	*/
	public String get_iprange() throws Exception {
		return this.iprange;
	}

	/**
	* <pre>
	* Name of the host for which to configure interception. The names are resolved during interception when users log on with the Access Gateway Plug-in.<br> Minimum length =  1
	* </pre>
	*/
	public void set_hostname(String hostname) throws Exception{
		this.hostname = hostname;
	}

	/**
	* <pre>
	* Name of the host for which to configure interception. The names are resolved during interception when users log on with the Access Gateway Plug-in.<br> Minimum length =  1
	* </pre>
	*/
	public String get_hostname() throws Exception {
		return this.hostname;
	}

	/**
	* <pre>
	* Names of the client applications, such as PuTTY and Xshell.<br> Minimum length =  1
	* </pre>
	*/
	public void set_clientapplication(String[] clientapplication) throws Exception{
		this.clientapplication = clientapplication;
	}

	/**
	* <pre>
	* Names of the client applications, such as PuTTY and Xshell.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_clientapplication() throws Exception {
		return this.clientapplication;
	}

	/**
	* <pre>
	* IP address that the intranet application will use to route the connection through the virtual adapter.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_spoofiip(String spoofiip) throws Exception{
		this.spoofiip = spoofiip;
	}

	/**
	* <pre>
	* IP address that the intranet application will use to route the connection through the virtual adapter.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_spoofiip() throws Exception {
		return this.spoofiip;
	}

	/**
	* <pre>
	* Destination TCP or UDP port number for the intranet application. Use a hyphen to specify a range of port numbers, for example 90-95.<br> Minimum length =  1
	* </pre>
	*/
	public void set_destport(String destport) throws Exception{
		this.destport = destport;
	}

	/**
	* <pre>
	* Destination TCP or UDP port number for the intranet application. Use a hyphen to specify a range of port numbers, for example 90-95.<br> Minimum length =  1
	* </pre>
	*/
	public String get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* Interception mode for the intranet application or resource. Correct value depends on the type of client software used to make connections. If the interception mode is set to TRANSPARENT, users connect with the Access Gateway Plug-in for Windows. With the PROXY setting, users connect with the Access Gateway Plug-in for Java.<br> Possible values = PROXY, TRANSPARENT
	* </pre>
	*/
	public void set_interception(String interception) throws Exception{
		this.interception = interception;
	}

	/**
	* <pre>
	* Interception mode for the intranet application or resource. Correct value depends on the type of client software used to make connections. If the interception mode is set to TRANSPARENT, users connect with the Access Gateway Plug-in for Windows. With the PROXY setting, users connect with the Access Gateway Plug-in for Java.<br> Possible values = PROXY, TRANSPARENT
	* </pre>
	*/
	public String get_interception() throws Exception {
		return this.interception;
	}

	/**
	* <pre>
	* Source IP address. Required if interception mode is set to PROXY. Default is the loopback address, 127.0.0.1.<br> Minimum length =  1
	* </pre>
	*/
	public void set_srcip(String srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* Source IP address. Required if interception mode is set to PROXY. Default is the loopback address, 127.0.0.1.<br> Minimum length =  1
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* Source port for the application for which the Access Gateway virtual server proxies the traffic. If users are connecting from a device that uses the Access Gateway Plug-in for Java, applications must be configured manually by using the source IP address and TCP port values specified in the intranet application profile. If a port value is not set, the destination port value is used.<br> Minimum value =  1
	* </pre>
	*/
	public void set_srcport(int srcport) throws Exception {
		this.srcport = new Integer(srcport);
	}

	/**
	* <pre>
	* Source port for the application for which the Access Gateway virtual server proxies the traffic. If users are connecting from a device that uses the Access Gateway Plug-in for Java, applications must be configured manually by using the source IP address and TCP port values specified in the intranet application profile. If a port value is not set, the destination port value is used.<br> Minimum value =  1
	* </pre>
	*/
	public void set_srcport(Integer srcport) throws Exception{
		this.srcport = srcport;
	}

	/**
	* <pre>
	* Source port for the application for which the Access Gateway virtual server proxies the traffic. If users are connecting from a device that uses the Access Gateway Plug-in for Java, applications must be configured manually by using the source IP address and TCP port values specified in the intranet application profile. If a port value is not set, the destination port value is used.<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_srcport() throws Exception {
		return this.srcport;
	}

	/**
	* <pre>
	* The IP address for the application. This address is the real application server IP address.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnintranetapplication_response result = (vpnintranetapplication_response) service.get_payload_formatter().string_to_resource(vpnintranetapplication_response.class, response);
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
		return result.vpnintranetapplication;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.intranetapplication;
	}

	/**
	* Use this API to add vpnintranetapplication.
	*/
	public static base_response add(nitro_service client, vpnintranetapplication resource) throws Exception {
		vpnintranetapplication addresource = new vpnintranetapplication();
		addresource.intranetapplication = resource.intranetapplication;
		addresource.protocol = resource.protocol;
		addresource.destip = resource.destip;
		addresource.netmask = resource.netmask;
		addresource.iprange = resource.iprange;
		addresource.hostname = resource.hostname;
		addresource.clientapplication = resource.clientapplication;
		addresource.spoofiip = resource.spoofiip;
		addresource.destport = resource.destport;
		addresource.interception = resource.interception;
		addresource.srcip = resource.srcip;
		addresource.srcport = resource.srcport;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnintranetapplication resources.
	*/
	public static base_responses add(nitro_service client, vpnintranetapplication resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnintranetapplication addresources[] = new vpnintranetapplication[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnintranetapplication();
				addresources[i].intranetapplication = resources[i].intranetapplication;
				addresources[i].protocol = resources[i].protocol;
				addresources[i].destip = resources[i].destip;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].iprange = resources[i].iprange;
				addresources[i].hostname = resources[i].hostname;
				addresources[i].clientapplication = resources[i].clientapplication;
				addresources[i].spoofiip = resources[i].spoofiip;
				addresources[i].destport = resources[i].destport;
				addresources[i].interception = resources[i].interception;
				addresources[i].srcip = resources[i].srcip;
				addresources[i].srcport = resources[i].srcport;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnintranetapplication of given name.
	*/
	public static base_response delete(nitro_service client, String intranetapplication) throws Exception {
		vpnintranetapplication deleteresource = new vpnintranetapplication();
		deleteresource.intranetapplication = intranetapplication;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnintranetapplication.
	*/
	public static base_response delete(nitro_service client, vpnintranetapplication resource) throws Exception {
		vpnintranetapplication deleteresource = new vpnintranetapplication();
		deleteresource.intranetapplication = resource.intranetapplication;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnintranetapplication resources of given names.
	*/
	public static base_responses delete(nitro_service client, String intranetapplication[]) throws Exception {
		base_responses result = null;
		if (intranetapplication != null && intranetapplication.length > 0) {
			vpnintranetapplication deleteresources[] = new vpnintranetapplication[intranetapplication.length];
			for (int i=0;i<intranetapplication.length;i++){
				deleteresources[i] = new vpnintranetapplication();
				deleteresources[i].intranetapplication = intranetapplication[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnintranetapplication resources.
	*/
	public static base_responses delete(nitro_service client, vpnintranetapplication resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnintranetapplication deleteresources[] = new vpnintranetapplication[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnintranetapplication();
				deleteresources[i].intranetapplication = resources[i].intranetapplication;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpnintranetapplication resources that are configured on netscaler.
	*/
	public static vpnintranetapplication[] get(nitro_service service) throws Exception{
		vpnintranetapplication obj = new vpnintranetapplication();
		vpnintranetapplication[] response = (vpnintranetapplication[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnintranetapplication resources that are configured on netscaler.
	*/
	public static vpnintranetapplication[] get(nitro_service service, options option) throws Exception{
		vpnintranetapplication obj = new vpnintranetapplication();
		vpnintranetapplication[] response = (vpnintranetapplication[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnintranetapplication resource of given name .
	*/
	public static vpnintranetapplication get(nitro_service service, String intranetapplication) throws Exception{
		vpnintranetapplication obj = new vpnintranetapplication();
		obj.set_intranetapplication(intranetapplication);
		vpnintranetapplication response = (vpnintranetapplication) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnintranetapplication resources of given names .
	*/
	public static vpnintranetapplication[] get(nitro_service service, String intranetapplication[]) throws Exception{
		if (intranetapplication !=null && intranetapplication.length>0) {
			vpnintranetapplication response[] = new vpnintranetapplication[intranetapplication.length];
			vpnintranetapplication obj[] = new vpnintranetapplication[intranetapplication.length];
			for (int i=0;i<intranetapplication.length;i++) {
				obj[i] = new vpnintranetapplication();
				obj[i].set_intranetapplication(intranetapplication[i]);
				response[i] = (vpnintranetapplication) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnintranetapplication resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnintranetapplication[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnintranetapplication obj = new vpnintranetapplication();
		options option = new options();
		option.set_filter(filter);
		vpnintranetapplication[] response = (vpnintranetapplication[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnintranetapplication resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnintranetapplication[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnintranetapplication obj = new vpnintranetapplication();
		options option = new options();
		option.set_filter(filter);
		vpnintranetapplication[] response = (vpnintranetapplication[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnintranetapplication resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnintranetapplication obj = new vpnintranetapplication();
		options option = new options();
		option.set_count(true);
		vpnintranetapplication[] response = (vpnintranetapplication[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnintranetapplication resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnintranetapplication obj = new vpnintranetapplication();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnintranetapplication[] response = (vpnintranetapplication[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnintranetapplication resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnintranetapplication obj = new vpnintranetapplication();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnintranetapplication[] response = (vpnintranetapplication[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class spoofiipEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class protocolEnum {
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
		public static final String ANY = "ANY";
	}
	public static class interceptionEnum {
		public static final String PROXY = "PROXY";
		public static final String TRANSPARENT = "TRANSPARENT";
	}
}
