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

class nsip6_response extends base_response
{
	public nsip6[] nsip6;
}
/**
* Configuration for ip6 resource.
*/

public class nsip6 extends base_resource
{
	private String ipv6address;
	private String scope;
	private String type;
	private Long vlan;
	private String nd;
	private String icmp;
	private String vserver;
	private String telnet;
	private String ftp;
	private String gui;
	private String ssh;
	private String snmp;
	private String mgmtaccess;
	private String restrictaccess;
	private String dynamicrouting;
	private String hostroute;
	private String ip6hostrtgw;
	private Integer metric;
	private String vserverrhilevel;
	private String ospf6lsatype;
	private Long ospfarea;
	private String state;
	private String map;
	private Long ownernode;
	private Long td;

	//------- Read only Parameter ---------;

	private String[] iptype;
	private String curstate;
	private Boolean viprtadv2bsd;
	private Long vipvsercount;
	private Long vipvserdowncount;
	private String systemtype;
	private Long __count;

	/**
	* <pre>
	* IPv6 address to create on the NetScaler appliance.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipv6address(String ipv6address) throws Exception{
		this.ipv6address = ipv6address;
	}

	/**
	* <pre>
	* IPv6 address to create on the NetScaler appliance.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipv6address() throws Exception {
		return this.ipv6address;
	}

	/**
	* <pre>
	* Scope of the IPv6 address to be created. Cannot be changed after the IP address is created.<br> Default value: global<br> Possible values = global, link-local
	* </pre>
	*/
	public void set_scope(String scope) throws Exception{
		this.scope = scope;
	}

	/**
	* <pre>
	* Scope of the IPv6 address to be created. Cannot be changed after the IP address is created.<br> Default value: global<br> Possible values = global, link-local
	* </pre>
	*/
	public String get_scope() throws Exception {
		return this.scope;
	}

	/**
	* <pre>
	* Type of IP address to be created on the NetScaler appliance. Cannot be changed after the IP address is created.<br> Default value: SNIP<br> Possible values = NSIP, VIP, SNIP, GSLBsiteIP, ADNSsvcIP, CLIP
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of IP address to be created on the NetScaler appliance. Cannot be changed after the IP address is created.<br> Default value: SNIP<br> Possible values = NSIP, VIP, SNIP, GSLBsiteIP, ADNSsvcIP, CLIP
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* Respond to Neighbor Discovery (ND) requests for this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nd(String nd) throws Exception{
		this.nd = nd;
	}

	/**
	* <pre>
	* Respond to Neighbor Discovery (ND) requests for this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nd() throws Exception {
		return this.nd;
	}

	/**
	* <pre>
	* Respond to ICMP requests for this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_icmp(String icmp) throws Exception{
		this.icmp = icmp;
	}

	/**
	* <pre>
	* Respond to ICMP requests for this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_icmp() throws Exception {
		return this.icmp;
	}

	/**
	* <pre>
	* Enable or disable the state of all the virtual servers associated with this VIP6 address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_vserver(String vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* Enable or disable the state of all the virtual servers associated with this VIP6 address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_vserver() throws Exception {
		return this.vserver;
	}

	/**
	* <pre>
	* Allow Telnet access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_telnet(String telnet) throws Exception{
		this.telnet = telnet;
	}

	/**
	* <pre>
	* Allow Telnet access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_telnet() throws Exception {
		return this.telnet;
	}

	/**
	* <pre>
	* Allow File Transfer Protocol (FTP) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ftp(String ftp) throws Exception{
		this.ftp = ftp;
	}

	/**
	* <pre>
	* Allow File Transfer Protocol (FTP) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ftp() throws Exception {
		return this.ftp;
	}

	/**
	* <pre>
	* Allow graphical user interface (GUI) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, SECUREONLY, DISABLED
	* </pre>
	*/
	public void set_gui(String gui) throws Exception{
		this.gui = gui;
	}

	/**
	* <pre>
	* Allow graphical user interface (GUI) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, SECUREONLY, DISABLED
	* </pre>
	*/
	public String get_gui() throws Exception {
		return this.gui;
	}

	/**
	* <pre>
	* Allow secure Shell (SSH) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ssh(String ssh) throws Exception{
		this.ssh = ssh;
	}

	/**
	* <pre>
	* Allow secure Shell (SSH) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ssh() throws Exception {
		return this.ssh;
	}

	/**
	* <pre>
	* Allow Simple Network Management Protocol (SNMP) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_snmp(String snmp) throws Exception{
		this.snmp = snmp;
	}

	/**
	* <pre>
	* Allow Simple Network Management Protocol (SNMP) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_snmp() throws Exception {
		return this.snmp;
	}

	/**
	* <pre>
	* Allow access to management applications on this IP address.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mgmtaccess(String mgmtaccess) throws Exception{
		this.mgmtaccess = mgmtaccess;
	}

	/**
	* <pre>
	* Allow access to management applications on this IP address.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mgmtaccess() throws Exception {
		return this.mgmtaccess;
	}

	/**
	* <pre>
	* Block access to nonmanagement applications on this IP address. This option is applicable forMIP6s, SNIP6s, and NSIP6s, and is disabled by default. Nonmanagement applications can run on the underlying NetScaler Free BSD operating system.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_restrictaccess(String restrictaccess) throws Exception{
		this.restrictaccess = restrictaccess;
	}

	/**
	* <pre>
	* Block access to nonmanagement applications on this IP address. This option is applicable forMIP6s, SNIP6s, and NSIP6s, and is disabled by default. Nonmanagement applications can run on the underlying NetScaler Free BSD operating system.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_restrictaccess() throws Exception {
		return this.restrictaccess;
	}

	/**
	* <pre>
	* Allow dynamic routing on the IP address. Specific to SNIP6 address.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dynamicrouting(String dynamicrouting) throws Exception{
		this.dynamicrouting = dynamicrouting;
	}

	/**
	* <pre>
	* Allow dynamic routing on the IP address. Specific to SNIP6 address.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dynamicrouting() throws Exception {
		return this.dynamicrouting;
	}

	/**
	* <pre>
	* Advertise a route for the VIP6 address by using the dynamic routing protocols running on the NetScaler appliance.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_hostroute(String hostroute) throws Exception{
		this.hostroute = hostroute;
	}

	/**
	* <pre>
	* Advertise a route for the VIP6 address by using the dynamic routing protocols running on the NetScaler appliance.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_hostroute() throws Exception {
		return this.hostroute;
	}

	/**
	* <pre>
	* IPv6 address of the gateway for the route.
	* </pre>
	*/
	public void set_ip6hostrtgw(String ip6hostrtgw) throws Exception{
		this.ip6hostrtgw = ip6hostrtgw;
	}

	/**
	* <pre>
	* IPv6 address of the gateway for the route.
	* </pre>
	*/
	public String get_ip6hostrtgw() throws Exception {
		return this.ip6hostrtgw;
	}

	/**
	* <pre>
	* Integer value to add to or subtract from the cost of the route advertised for the VIP6 address.<br> Minimum value =  -16777215
	* </pre>
	*/
	public void set_metric(int metric) throws Exception {
		this.metric = new Integer(metric);
	}

	/**
	* <pre>
	* Integer value to add to or subtract from the cost of the route advertised for the VIP6 address.<br> Minimum value =  -16777215
	* </pre>
	*/
	public void set_metric(Integer metric) throws Exception{
		this.metric = metric;
	}

	/**
	* <pre>
	* Integer value to add to or subtract from the cost of the route advertised for the VIP6 address.<br> Minimum value =  -16777215
	* </pre>
	*/
	public Integer get_metric() throws Exception {
		return this.metric;
	}

	/**
	* <pre>
	* Advertise or do not advertise the route for the Virtual IP (VIP6) address on the basis of the state of the virtual servers associated with that VIP6.
* NONE - Advertise the route for the VIP6 address, irrespective of the state of the virtual servers associated with the address.
* ONE VSERVER - Advertise the route for the VIP6 address if at least one of the associated virtual servers is in UP state.
* ALL VSERVER - Advertise the route for the VIP6 address if all of the associated virtual servers are in UP state.<br> Default value: ONE_VSERVER<br> Possible values = ONE_VSERVER, ALL_VSERVERS, NONE
	* </pre>
	*/
	public void set_vserverrhilevel(String vserverrhilevel) throws Exception{
		this.vserverrhilevel = vserverrhilevel;
	}

	/**
	* <pre>
	* Advertise or do not advertise the route for the Virtual IP (VIP6) address on the basis of the state of the virtual servers associated with that VIP6.
* NONE - Advertise the route for the VIP6 address, irrespective of the state of the virtual servers associated with the address.
* ONE VSERVER - Advertise the route for the VIP6 address if at least one of the associated virtual servers is in UP state.
* ALL VSERVER - Advertise the route for the VIP6 address if all of the associated virtual servers are in UP state.<br> Default value: ONE_VSERVER<br> Possible values = ONE_VSERVER, ALL_VSERVERS, NONE
	* </pre>
	*/
	public String get_vserverrhilevel() throws Exception {
		return this.vserverrhilevel;
	}

	/**
	* <pre>
	* Type of LSAs to be used by the IPv6 OSPF protocol, running on the NetScaler appliance, for advertising the route for the VIP6 address.<br> Default value: EXTERNAL<br> Possible values = INTRA_AREA, EXTERNAL
	* </pre>
	*/
	public void set_ospf6lsatype(String ospf6lsatype) throws Exception{
		this.ospf6lsatype = ospf6lsatype;
	}

	/**
	* <pre>
	* Type of LSAs to be used by the IPv6 OSPF protocol, running on the NetScaler appliance, for advertising the route for the VIP6 address.<br> Default value: EXTERNAL<br> Possible values = INTRA_AREA, EXTERNAL
	* </pre>
	*/
	public String get_ospf6lsatype() throws Exception {
		return this.ospf6lsatype;
	}

	/**
	* <pre>
	* ID of the area in which the Intra-Area-Prefix LSAs are to be advertised for the VIP6 address by the IPv6 OSPF protocol running on the NetScaler appliance.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_ospfarea(long ospfarea) throws Exception {
		this.ospfarea = new Long(ospfarea);
	}

	/**
	* <pre>
	* ID of the area in which the Intra-Area-Prefix LSAs are to be advertised for the VIP6 address by the IPv6 OSPF protocol running on the NetScaler appliance.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_ospfarea(Long ospfarea) throws Exception{
		this.ospfarea = ospfarea;
	}

	/**
	* <pre>
	* ID of the area in which the Intra-Area-Prefix LSAs are to be advertised for the VIP6 address by the IPv6 OSPF protocol running on the NetScaler appliance.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public Long get_ospfarea() throws Exception {
		return this.ospfarea;
	}

	/**
	* <pre>
	* Enable or disable the IP address.<br> Default value: ENABLED<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enable or disable the IP address.<br> Default value: ENABLED<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Mapped IPV4 address for the IPV6 address.
	* </pre>
	*/
	public void set_map(String map) throws Exception{
		this.map = map;
	}

	/**
	* <pre>
	* Mapped IPV4 address for the IPV6 address.
	* </pre>
	*/
	public String get_map() throws Exception {
		return this.map;
	}

	/**
	* <pre>
	* ID of the cluster node for which you are adding the IP address. Must be used if you want the IP address to be active only on the specific node. Can be configured only through the cluster IP address. Cannot be changed after the IP address is created.<br> Default value: 255
	* </pre>
	*/
	public void set_ownernode(long ownernode) throws Exception {
		this.ownernode = new Long(ownernode);
	}

	/**
	* <pre>
	* ID of the cluster node for which you are adding the IP address. Must be used if you want the IP address to be active only on the specific node. Can be configured only through the cluster IP address. Cannot be changed after the IP address is created.<br> Default value: 255
	* </pre>
	*/
	public void set_ownernode(Long ownernode) throws Exception{
		this.ownernode = ownernode;
	}

	/**
	* <pre>
	* ID of the cluster node for which you are adding the IP address. Must be used if you want the IP address to be active only on the specific node. Can be configured only through the cluster IP address. Cannot be changed after the IP address is created.<br> Default value: 255
	* </pre>
	*/
	public Long get_ownernode() throws Exception {
		return this.ownernode;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* The type of the IPv6 address.<br> Possible values = NSIP, VIP, SNIP, GSLBsiteIP, ADNSsvcIP, CLIP
	* </pre>
	*/
	public String[] get_iptype() throws Exception {
		return this.iptype;
	}

	/**
	* <pre>
	* Current state of this IP.<br> Default value: ENABLED<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Whether this route is advertised to FreeBSD.
	* </pre>
	*/
	public Boolean get_viprtadv2bsd() throws Exception {
		return this.viprtadv2bsd;
	}

	/**
	* <pre>
	* Number	of vservers	bound to this VIP.
	* </pre>
	*/
	public Long get_vipvsercount() throws Exception {
		return this.vipvsercount;
	}

	/**
	* <pre>
	* Number	of vservers	bound to this VIP, which are down.
	* </pre>
	*/
	public Long get_vipvserdowncount() throws Exception {
		return this.vipvserdowncount;
	}

	/**
	* <pre>
	* The type of the System. Possible Values: Standalone, HA, Cluster. Used for display purpose.<br> Possible values = Stand-alone, HA, Cluster
	* </pre>
	*/
	public String get_systemtype() throws Exception {
		return this.systemtype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsip6_response result = (nsip6_response) service.get_payload_formatter().string_to_resource(nsip6_response.class, response);
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
		return result.nsip6;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipv6address;
	}

	/**
	* Use this API to add nsip6.
	*/
	public static base_response add(nitro_service client, nsip6 resource) throws Exception {
		nsip6 addresource = new nsip6();
		addresource.ipv6address = resource.ipv6address;
		addresource.scope = resource.scope;
		addresource.type = resource.type;
		addresource.vlan = resource.vlan;
		addresource.nd = resource.nd;
		addresource.icmp = resource.icmp;
		addresource.vserver = resource.vserver;
		addresource.telnet = resource.telnet;
		addresource.ftp = resource.ftp;
		addresource.gui = resource.gui;
		addresource.ssh = resource.ssh;
		addresource.snmp = resource.snmp;
		addresource.mgmtaccess = resource.mgmtaccess;
		addresource.restrictaccess = resource.restrictaccess;
		addresource.dynamicrouting = resource.dynamicrouting;
		addresource.hostroute = resource.hostroute;
		addresource.ip6hostrtgw = resource.ip6hostrtgw;
		addresource.metric = resource.metric;
		addresource.vserverrhilevel = resource.vserverrhilevel;
		addresource.ospf6lsatype = resource.ospf6lsatype;
		addresource.ospfarea = resource.ospfarea;
		addresource.state = resource.state;
		addresource.map = resource.map;
		addresource.ownernode = resource.ownernode;
		addresource.td = resource.td;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nsip6 resources.
	*/
	public static base_responses add(nitro_service client, nsip6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip6 addresources[] = new nsip6[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nsip6();
				addresources[i].ipv6address = resources[i].ipv6address;
				addresources[i].scope = resources[i].scope;
				addresources[i].type = resources[i].type;
				addresources[i].vlan = resources[i].vlan;
				addresources[i].nd = resources[i].nd;
				addresources[i].icmp = resources[i].icmp;
				addresources[i].vserver = resources[i].vserver;
				addresources[i].telnet = resources[i].telnet;
				addresources[i].ftp = resources[i].ftp;
				addresources[i].gui = resources[i].gui;
				addresources[i].ssh = resources[i].ssh;
				addresources[i].snmp = resources[i].snmp;
				addresources[i].mgmtaccess = resources[i].mgmtaccess;
				addresources[i].restrictaccess = resources[i].restrictaccess;
				addresources[i].dynamicrouting = resources[i].dynamicrouting;
				addresources[i].hostroute = resources[i].hostroute;
				addresources[i].ip6hostrtgw = resources[i].ip6hostrtgw;
				addresources[i].metric = resources[i].metric;
				addresources[i].vserverrhilevel = resources[i].vserverrhilevel;
				addresources[i].ospf6lsatype = resources[i].ospf6lsatype;
				addresources[i].ospfarea = resources[i].ospfarea;
				addresources[i].state = resources[i].state;
				addresources[i].map = resources[i].map;
				addresources[i].ownernode = resources[i].ownernode;
				addresources[i].td = resources[i].td;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsip6 of given name.
	*/
	public static base_response delete(nitro_service client, String ipv6address) throws Exception {
		nsip6 deleteresource = new nsip6();
		deleteresource.ipv6address = ipv6address;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsip6.
	*/
	public static base_response delete(nitro_service client, nsip6 resource) throws Exception {
		nsip6 deleteresource = new nsip6();
		deleteresource.ipv6address = resource.ipv6address;
		deleteresource.td = resource.td;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsip6 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ipv6address[]) throws Exception {
		base_responses result = null;
		if (ipv6address != null && ipv6address.length > 0) {
			nsip6 deleteresources[] = new nsip6[ipv6address.length];
			for (int i=0;i<ipv6address.length;i++){
				deleteresources[i] = new nsip6();
				deleteresources[i].ipv6address = ipv6address[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsip6 resources.
	*/
	public static base_responses delete(nitro_service client, nsip6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip6 deleteresources[] = new nsip6[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nsip6();
				deleteresources[i].ipv6address = resources[i].ipv6address;
				deleteresources[i].td = resources[i].td;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nsip6.
	*/
	public static base_response update(nitro_service client, nsip6 resource) throws Exception {
		nsip6 updateresource = new nsip6();
		updateresource.ipv6address = resource.ipv6address;
		updateresource.td = resource.td;
		updateresource.nd = resource.nd;
		updateresource.icmp = resource.icmp;
		updateresource.vserver = resource.vserver;
		updateresource.telnet = resource.telnet;
		updateresource.ftp = resource.ftp;
		updateresource.gui = resource.gui;
		updateresource.ssh = resource.ssh;
		updateresource.snmp = resource.snmp;
		updateresource.mgmtaccess = resource.mgmtaccess;
		updateresource.restrictaccess = resource.restrictaccess;
		updateresource.state = resource.state;
		updateresource.map = resource.map;
		updateresource.dynamicrouting = resource.dynamicrouting;
		updateresource.hostroute = resource.hostroute;
		updateresource.ip6hostrtgw = resource.ip6hostrtgw;
		updateresource.metric = resource.metric;
		updateresource.vserverrhilevel = resource.vserverrhilevel;
		updateresource.ospf6lsatype = resource.ospf6lsatype;
		updateresource.ospfarea = resource.ospfarea;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nsip6 resources.
	*/
	public static base_responses update(nitro_service client, nsip6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip6 updateresources[] = new nsip6[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nsip6();
				updateresources[i].ipv6address = resources[i].ipv6address;
				updateresources[i].td = resources[i].td;
				updateresources[i].nd = resources[i].nd;
				updateresources[i].icmp = resources[i].icmp;
				updateresources[i].vserver = resources[i].vserver;
				updateresources[i].telnet = resources[i].telnet;
				updateresources[i].ftp = resources[i].ftp;
				updateresources[i].gui = resources[i].gui;
				updateresources[i].ssh = resources[i].ssh;
				updateresources[i].snmp = resources[i].snmp;
				updateresources[i].mgmtaccess = resources[i].mgmtaccess;
				updateresources[i].restrictaccess = resources[i].restrictaccess;
				updateresources[i].state = resources[i].state;
				updateresources[i].map = resources[i].map;
				updateresources[i].dynamicrouting = resources[i].dynamicrouting;
				updateresources[i].hostroute = resources[i].hostroute;
				updateresources[i].ip6hostrtgw = resources[i].ip6hostrtgw;
				updateresources[i].metric = resources[i].metric;
				updateresources[i].vserverrhilevel = resources[i].vserverrhilevel;
				updateresources[i].ospf6lsatype = resources[i].ospf6lsatype;
				updateresources[i].ospfarea = resources[i].ospfarea;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsip6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsip6 resource, String[] args) throws Exception{
		nsip6 unsetresource = new nsip6();
		unsetresource.ipv6address = resource.ipv6address;
		unsetresource.td = resource.td;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nsip6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String ipv6address[], String args[]) throws Exception {
		base_responses result = null;
		if (ipv6address != null && ipv6address.length > 0) {
			nsip6 unsetresources[] = new nsip6[ipv6address.length];
			for (int i=0;i<ipv6address.length;i++){
				unsetresources[i] = new nsip6();
				unsetresources[i].ipv6address = ipv6address[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsip6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nsip6 resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip6 unsetresources[] = new nsip6[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nsip6();
				unsetresources[i].ipv6address = resources[i].ipv6address;
				unsetresources[i].td = resources[i].td;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nsip6 resources that are configured on netscaler.
	*/
	public static nsip6[] get(nitro_service service) throws Exception{
		nsip6 obj = new nsip6();
		nsip6[] response = (nsip6[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsip6 resources that are configured on netscaler.
	*/
	public static nsip6[] get(nitro_service service, options option) throws Exception{
		nsip6 obj = new nsip6();
		nsip6[] response = (nsip6[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a nsip6 resource.
	*/
	public static nsip6 get(nitro_service service, nsip6 obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nsip6 response = (nsip6) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a nsip6 resources.
	*/
	public static nsip6[] get(nitro_service service, nsip6 obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			nsip6 response[] = new nsip6[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (nsip6) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nsip6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsip6[] get_filtered(nitro_service service, String filter) throws Exception{
		nsip6 obj = new nsip6();
		options option = new options();
		option.set_filter(filter);
		nsip6[] response = (nsip6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsip6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsip6[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsip6 obj = new nsip6();
		options option = new options();
		option.set_filter(filter);
		nsip6[] response = (nsip6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsip6 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsip6 obj = new nsip6();
		options option = new options();
		option.set_count(true);
		nsip6[] response = (nsip6[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsip6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsip6 obj = new nsip6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsip6[] response = (nsip6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsip6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsip6 obj = new nsip6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsip6[] response = (nsip6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class iptypeEnum {
		public static final String NSIP = "NSIP";
		public static final String VIP = "VIP";
		public static final String SNIP = "SNIP";
		public static final String GSLBsiteIP = "GSLBsiteIP";
		public static final String ADNSsvcIP = "ADNSsvcIP";
		public static final String CLIP = "CLIP";
	}
	public static class mgmtaccessEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sshEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class hostrouteEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String DISABLED = "DISABLED";
		public static final String ENABLED = "ENABLED";
	}
	public static class ftpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ospf6lsatypeEnum {
		public static final String INTRA_AREA = "INTRA_AREA";
		public static final String EXTERNAL = "EXTERNAL";
	}
	public static class vserverrhilevelEnum {
		public static final String ONE_VSERVER = "ONE_VSERVER";
		public static final String ALL_VSERVERS = "ALL_VSERVERS";
		public static final String NONE = "NONE";
	}
	public static class icmpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class scopeEnum {
		public static final String global = "global";
		public static final String link_local = "link-local";
	}
	public static class vserverEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ndEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class systemtypeEnum {
		public static final String Stand_alone = "Stand-alone";
		public static final String HA = "HA";
		public static final String Cluster = "Cluster";
	}
	public static class snmpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class curstateEnum {
		public static final String DISABLED = "DISABLED";
		public static final String ENABLED = "ENABLED";
	}
	public static class restrictaccessEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class guiEnum {
		public static final String ENABLED = "ENABLED";
		public static final String SECUREONLY = "SECUREONLY";
		public static final String DISABLED = "DISABLED";
	}
	public static class telnetEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dynamicroutingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String NSIP = "NSIP";
		public static final String VIP = "VIP";
		public static final String SNIP = "SNIP";
		public static final String GSLBsiteIP = "GSLBsiteIP";
		public static final String ADNSsvcIP = "ADNSsvcIP";
		public static final String CLIP = "CLIP";
	}
}
