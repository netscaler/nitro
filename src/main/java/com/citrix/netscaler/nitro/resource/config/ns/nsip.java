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

class nsip_response extends base_response
{
	public nsip[] nsip;
}
/**
* Configuration for ip resource.
*/

public class nsip extends base_resource
{
	private String ipaddress;
	private String netmask;
	private String type;
	private String arp;
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
	private String ospf;
	private String bgp;
	private String rip;
	private String hostroute;
	private String hostrtgw;
	private Integer metric;
	private String vserverrhilevel;
	private String ospflsatype;
	private Long ospfarea;
	private String state;
	private Long vrid;
	private String icmpresponse;
	private Long ownernode;
	private String arpresponse;
	private Long td;

	//------- Read only Parameter ---------;

	private Long flags;
	private String hostrtgwact;
	private Long ospfareaval;
	private Boolean viprtadv2bsd;
	private Long vipvsercount;
	private Long vipvserdowncount;
	private Long freeports;
	private String[] iptype;
	private Long __count;

	/**
	* <pre>
	* IPv4 address to create on the NetScaler appliance. Cannot be changed after the IP address is created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* IPv4 address to create on the NetScaler appliance. Cannot be changed after the IP address is created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Subnet mask associated with the IP address.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* Subnet mask associated with the IP address.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* Type of the IP address to create on the NetScaler appliance. Cannot be changed after the IP address is created.<br> Default value: SNIP<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of the IP address to create on the NetScaler appliance. Cannot be changed after the IP address is created.<br> Default value: SNIP<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Respond to respond to ARP requests for this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_arp(String arp) throws Exception{
		this.arp = arp;
	}

	/**
	* <pre>
	* Respond to respond to ARP requests for this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_arp() throws Exception {
		return this.arp;
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
	* Use this option to set (enable or disable) the vserver attribute for this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_vserver(String vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the vserver attribute for this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
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
	* Allow secure shell (SSH) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ssh(String ssh) throws Exception{
		this.ssh = ssh;
	}

	/**
	* <pre>
	* Allow secure shell (SSH) access to this IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
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
	* Block access to nonmanagement applications on this IP. This option is applicable for MIPs, SNIPs, and NSIP, and is disabled by default. Nonmanagement applications can run on the underlying NetScaler Free BSD operating system.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_restrictaccess(String restrictaccess) throws Exception{
		this.restrictaccess = restrictaccess;
	}

	/**
	* <pre>
	* Block access to nonmanagement applications on this IP. This option is applicable for MIPs, SNIPs, and NSIP, and is disabled by default. Nonmanagement applications can run on the underlying NetScaler Free BSD operating system.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_restrictaccess() throws Exception {
		return this.restrictaccess;
	}

	/**
	* <pre>
	* Allow dynamic routing on the IP address. Specific to SNIP addresses.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dynamicrouting(String dynamicrouting) throws Exception{
		this.dynamicrouting = dynamicrouting;
	}

	/**
	* <pre>
	* Allow dynamic routing on the IP address. Specific to SNIP addresses.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dynamicrouting() throws Exception {
		return this.dynamicrouting;
	}

	/**
	* <pre>
	* Use this option to enable or disable OSPF on this IP address for the entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ospf(String ospf) throws Exception{
		this.ospf = ospf;
	}

	/**
	* <pre>
	* Use this option to enable or disable OSPF on this IP address for the entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ospf() throws Exception {
		return this.ospf;
	}

	/**
	* <pre>
	* Use this option to enable or disable BGP on this IP address for the entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_bgp(String bgp) throws Exception{
		this.bgp = bgp;
	}

	/**
	* <pre>
	* Use this option to enable or disable BGP on this IP address for the entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_bgp() throws Exception {
		return this.bgp;
	}

	/**
	* <pre>
	* Use this option to enable or disable RIP on this IP address for the entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_rip(String rip) throws Exception{
		this.rip = rip;
	}

	/**
	* <pre>
	* Use this option to enable or disable RIP on this IP address for the entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_rip() throws Exception {
		return this.rip;
	}

	/**
	* <pre>
	* Advertise a route for the VIP address, using the dynamic routing protocols running on the NetScaler appliance.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_hostroute(String hostroute) throws Exception{
		this.hostroute = hostroute;
	}

	/**
	* <pre>
	* Advertise a route for the VIP address, using the dynamic routing protocols running on the NetScaler appliance.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_hostroute() throws Exception {
		return this.hostroute;
	}

	/**
	* <pre>
	* IP address of the gateway for the route.<br> Default value: -1
	* </pre>
	*/
	public void set_hostrtgw(String hostrtgw) throws Exception{
		this.hostrtgw = hostrtgw;
	}

	/**
	* <pre>
	* IP address of the gateway for the route.<br> Default value: -1
	* </pre>
	*/
	public String get_hostrtgw() throws Exception {
		return this.hostrtgw;
	}

	/**
	* <pre>
	* Integer value to add to or subtract from the cost of the route advertised for the VIP address.<br> Minimum value =  -16777215
	* </pre>
	*/
	public void set_metric(int metric) throws Exception {
		this.metric = new Integer(metric);
	}

	/**
	* <pre>
	* Integer value to add to or subtract from the cost of the route advertised for the VIP address.<br> Minimum value =  -16777215
	* </pre>
	*/
	public void set_metric(Integer metric) throws Exception{
		this.metric = metric;
	}

	/**
	* <pre>
	* Integer value to add to or subtract from the cost of the route advertised for the VIP address.<br> Minimum value =  -16777215
	* </pre>
	*/
	public Integer get_metric() throws Exception {
		return this.metric;
	}

	/**
	* <pre>
	* Advertise the route for the Virtual IP (VIP) address on the basis of the state of the virtual servers associated with that VIP.
* NONE - Advertise the route for the VIP address, regardless of the state of the virtual servers associated with the address.
* ONE VSERVER - Advertise the route for the VIP address if at least one of the associated virtual servers is in UP state.
* ALL VSERVER - Advertise the route for the VIP address if all of the associated virtual servers are in UP state.<br> Default value: ONE_VSERVER<br> Possible values = ONE_VSERVER, ALL_VSERVERS, NONE
	* </pre>
	*/
	public void set_vserverrhilevel(String vserverrhilevel) throws Exception{
		this.vserverrhilevel = vserverrhilevel;
	}

	/**
	* <pre>
	* Advertise the route for the Virtual IP (VIP) address on the basis of the state of the virtual servers associated with that VIP.
* NONE - Advertise the route for the VIP address, regardless of the state of the virtual servers associated with the address.
* ONE VSERVER - Advertise the route for the VIP address if at least one of the associated virtual servers is in UP state.
* ALL VSERVER - Advertise the route for the VIP address if all of the associated virtual servers are in UP state.<br> Default value: ONE_VSERVER<br> Possible values = ONE_VSERVER, ALL_VSERVERS, NONE
	* </pre>
	*/
	public String get_vserverrhilevel() throws Exception {
		return this.vserverrhilevel;
	}

	/**
	* <pre>
	* Type of LSAs to be used by the OSPF protocol, running on the NetScaler appliance, for advertising the route for this VIP address.<br> Default value: DISABLED<br> Possible values = TYPE1, TYPE5
	* </pre>
	*/
	public void set_ospflsatype(String ospflsatype) throws Exception{
		this.ospflsatype = ospflsatype;
	}

	/**
	* <pre>
	* Type of LSAs to be used by the OSPF protocol, running on the NetScaler appliance, for advertising the route for this VIP address.<br> Default value: DISABLED<br> Possible values = TYPE1, TYPE5
	* </pre>
	*/
	public String get_ospflsatype() throws Exception {
		return this.ospflsatype;
	}

	/**
	* <pre>
	* ID of the area in which the Type1 LSAs are to be advertised for this VIP address by the OSPF protocol running on the NetScaler appliance.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_ospfarea(long ospfarea) throws Exception {
		this.ospfarea = new Long(ospfarea);
	}

	/**
	* <pre>
	* ID of the area in which the Type1 LSAs are to be advertised for this VIP address by the OSPF protocol running on the NetScaler appliance.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_ospfarea(Long ospfarea) throws Exception{
		this.ospfarea = ospfarea;
	}

	/**
	* <pre>
	* ID of the area in which the Type1 LSAs are to be advertised for this VIP address by the OSPF protocol running on the NetScaler appliance.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public Long get_ospfarea() throws Exception {
		return this.ospfarea;
	}

	/**
	* <pre>
	* Enable or disable the IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enable or disable the IP address.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* ID, which uniquely identifies a VMAC address, to bin to a VIP address. This binding is used to set up NetScaler appliances in an active-active configuration using VRRP.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_vrid(long vrid) throws Exception {
		this.vrid = new Long(vrid);
	}

	/**
	* <pre>
	* ID, which uniquely identifies a VMAC address, to bin to a VIP address. This binding is used to set up NetScaler appliances in an active-active configuration using VRRP.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_vrid(Long vrid) throws Exception{
		this.vrid = vrid;
	}

	/**
	* <pre>
	* ID, which uniquely identifies a VMAC address, to bin to a VIP address. This binding is used to set up NetScaler appliances in an active-active configuration using VRRP.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_vrid() throws Exception {
		return this.vrid;
	}

	/**
	* <pre>
	* Respond to ICMP requests for a Virtual IP (VIP) address on the basis of the states of the virtual servers associated with that VIP. Available settings function as follows:
* NONE - The NetScaler appliance responds to any ICMP request for the VIP address, irrespective of the states of the virtual servers associated with the address.
* ONE VSERVER - The NetScaler appliance responds to any ICMP request for the VIP address if at least one of the associated virtual servers is in UP state.
* ALL VSERVER - The NetScaler appliance responds to any ICMP request for the VIP address if all of the associated virtual servers are in UP state.
* VSVR_CNTRLD - The behavior depends on the ICMP VSERVER RESPONSE setting on all the associated virtual servers.

The following settings can be made for the ICMP VSERVER RESPONSE parameter on a virtual server:
* If you set ICMP VSERVER RESPONSE to PASSIVE on all virtual servers, NetScaler always responds.
* If you set ICMP VSERVER RESPONSE to ACTIVE on all virtual servers, NetScaler responds if even one virtual server is UP.
* When you set ICMP VSERVER RESPONSE to ACTIVE on some and PASSIVE on others, NetScaler responds if even one virtual server set to ACTIVE is UP.<br> Default value: 5<br> Possible values = NONE, ONE_VSERVER, ALL_VSERVERS, VSVR_CNTRLD
	* </pre>
	*/
	public void set_icmpresponse(String icmpresponse) throws Exception{
		this.icmpresponse = icmpresponse;
	}

	/**
	* <pre>
	* Respond to ICMP requests for a Virtual IP (VIP) address on the basis of the states of the virtual servers associated with that VIP. Available settings function as follows:
* NONE - The NetScaler appliance responds to any ICMP request for the VIP address, irrespective of the states of the virtual servers associated with the address.
* ONE VSERVER - The NetScaler appliance responds to any ICMP request for the VIP address if at least one of the associated virtual servers is in UP state.
* ALL VSERVER - The NetScaler appliance responds to any ICMP request for the VIP address if all of the associated virtual servers are in UP state.
* VSVR_CNTRLD - The behavior depends on the ICMP VSERVER RESPONSE setting on all the associated virtual servers.

The following settings can be made for the ICMP VSERVER RESPONSE parameter on a virtual server:
* If you set ICMP VSERVER RESPONSE to PASSIVE on all virtual servers, NetScaler always responds.
* If you set ICMP VSERVER RESPONSE to ACTIVE on all virtual servers, NetScaler responds if even one virtual server is UP.
* When you set ICMP VSERVER RESPONSE to ACTIVE on some and PASSIVE on others, NetScaler responds if even one virtual server set to ACTIVE is UP.<br> Default value: 5<br> Possible values = NONE, ONE_VSERVER, ALL_VSERVERS, VSVR_CNTRLD
	* </pre>
	*/
	public String get_icmpresponse() throws Exception {
		return this.icmpresponse;
	}

	/**
	* <pre>
	* The owner node in a Cluster for this IP address. Owner node can vary from 0 to 31. If ownernode is not specified then the IP is treated as Striped IP.<br> Default value: 255
	* </pre>
	*/
	public void set_ownernode(long ownernode) throws Exception {
		this.ownernode = new Long(ownernode);
	}

	/**
	* <pre>
	* The owner node in a Cluster for this IP address. Owner node can vary from 0 to 31. If ownernode is not specified then the IP is treated as Striped IP.<br> Default value: 255
	* </pre>
	*/
	public void set_ownernode(Long ownernode) throws Exception{
		this.ownernode = ownernode;
	}

	/**
	* <pre>
	* The owner node in a Cluster for this IP address. Owner node can vary from 0 to 31. If ownernode is not specified then the IP is treated as Striped IP.<br> Default value: 255
	* </pre>
	*/
	public Long get_ownernode() throws Exception {
		return this.ownernode;
	}

	/**
	* <pre>
	* Respond to ARP requests for a Virtual IP (VIP) address on the basis of the states of the virtual servers associated with that VIP. Available settings function as follows:

* NONE - The NetScaler appliance responds to any ARP request for the VIP address, irrespective of the states of the virtual servers associated with the address.
* ONE VSERVER - The NetScaler appliance responds to any ARP request for the VIP address if at least one of the associated virtual servers is in UP state.
* ALL VSERVER - The NetScaler appliance responds to any ARP request for the VIP address if all of the associated virtual servers are in UP state.<br> Default value: 5<br> Possible values = NONE, ONE_VSERVER, ALL_VSERVERS
	* </pre>
	*/
	public void set_arpresponse(String arpresponse) throws Exception{
		this.arpresponse = arpresponse;
	}

	/**
	* <pre>
	* Respond to ARP requests for a Virtual IP (VIP) address on the basis of the states of the virtual servers associated with that VIP. Available settings function as follows:

* NONE - The NetScaler appliance responds to any ARP request for the VIP address, irrespective of the states of the virtual servers associated with the address.
* ONE VSERVER - The NetScaler appliance responds to any ARP request for the VIP address if at least one of the associated virtual servers is in UP state.
* ALL VSERVER - The NetScaler appliance responds to any ARP request for the VIP address if all of the associated virtual servers are in UP state.<br> Default value: 5<br> Possible values = NONE, ONE_VSERVER, ALL_VSERVERS
	* </pre>
	*/
	public String get_arpresponse() throws Exception {
		return this.arpresponse;
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
	* The flags for this entry.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Actual Gateway used for advertising host route.
	* </pre>
	*/
	public String get_hostrtgwact() throws Exception {
		return this.hostrtgwact;
	}

	/**
	* <pre>
	* The area ID of the area in which OSPF Type1 LSAs are advertised.
	* </pre>
	*/
	public Long get_ospfareaval() throws Exception {
		return this.ospfareaval;
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
	* Number of vservers bound to this VIP.
	* </pre>
	*/
	public Long get_vipvsercount() throws Exception {
		return this.vipvsercount;
	}

	/**
	* <pre>
	* Number of vservers bound to this VIP, which are down.
	* </pre>
	*/
	public Long get_vipvserdowncount() throws Exception {
		return this.vipvserdowncount;
	}

	/**
	* <pre>
	* Number of free Ports available on this IP.
	* </pre>
	*/
	public Long get_freeports() throws Exception {
		return this.freeports;
	}

	/**
	* <pre>
	* .<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public String[] get_iptype() throws Exception {
		return this.iptype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsip_response result = (nsip_response) service.get_payload_formatter().string_to_resource(nsip_response.class, response);
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
		return result.nsip;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipaddress;
	}

	/**
	* Use this API to add nsip.
	*/
	public static base_response add(nitro_service client, nsip resource) throws Exception {
		nsip addresource = new nsip();
		addresource.ipaddress = resource.ipaddress;
		addresource.netmask = resource.netmask;
		addresource.type = resource.type;
		addresource.arp = resource.arp;
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
		addresource.ospf = resource.ospf;
		addresource.bgp = resource.bgp;
		addresource.rip = resource.rip;
		addresource.hostroute = resource.hostroute;
		addresource.hostrtgw = resource.hostrtgw;
		addresource.metric = resource.metric;
		addresource.vserverrhilevel = resource.vserverrhilevel;
		addresource.ospflsatype = resource.ospflsatype;
		addresource.ospfarea = resource.ospfarea;
		addresource.state = resource.state;
		addresource.vrid = resource.vrid;
		addresource.icmpresponse = resource.icmpresponse;
		addresource.ownernode = resource.ownernode;
		addresource.arpresponse = resource.arpresponse;
		addresource.td = resource.td;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nsip resources.
	*/
	public static base_responses add(nitro_service client, nsip resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip addresources[] = new nsip[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nsip();
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].type = resources[i].type;
				addresources[i].arp = resources[i].arp;
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
				addresources[i].ospf = resources[i].ospf;
				addresources[i].bgp = resources[i].bgp;
				addresources[i].rip = resources[i].rip;
				addresources[i].hostroute = resources[i].hostroute;
				addresources[i].hostrtgw = resources[i].hostrtgw;
				addresources[i].metric = resources[i].metric;
				addresources[i].vserverrhilevel = resources[i].vserverrhilevel;
				addresources[i].ospflsatype = resources[i].ospflsatype;
				addresources[i].ospfarea = resources[i].ospfarea;
				addresources[i].state = resources[i].state;
				addresources[i].vrid = resources[i].vrid;
				addresources[i].icmpresponse = resources[i].icmpresponse;
				addresources[i].ownernode = resources[i].ownernode;
				addresources[i].arpresponse = resources[i].arpresponse;
				addresources[i].td = resources[i].td;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsip of given name.
	*/
	public static base_response delete(nitro_service client, String ipaddress) throws Exception {
		nsip deleteresource = new nsip();
		deleteresource.ipaddress = ipaddress;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsip.
	*/
	public static base_response delete(nitro_service client, nsip resource) throws Exception {
		nsip deleteresource = new nsip();
		deleteresource.ipaddress = resource.ipaddress;
		deleteresource.td = resource.td;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsip resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ipaddress[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			nsip deleteresources[] = new nsip[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				deleteresources[i] = new nsip();
				deleteresources[i].ipaddress = ipaddress[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsip resources.
	*/
	public static base_responses delete(nitro_service client, nsip resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip deleteresources[] = new nsip[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nsip();
				deleteresources[i].ipaddress = resources[i].ipaddress;
				deleteresources[i].td = resources[i].td;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nsip.
	*/
	public static base_response update(nitro_service client, nsip resource) throws Exception {
		nsip updateresource = new nsip();
		updateresource.ipaddress = resource.ipaddress;
		updateresource.td = resource.td;
		updateresource.netmask = resource.netmask;
		updateresource.arp = resource.arp;
		updateresource.icmp = resource.icmp;
		updateresource.vserver = resource.vserver;
		updateresource.telnet = resource.telnet;
		updateresource.ftp = resource.ftp;
		updateresource.gui = resource.gui;
		updateresource.ssh = resource.ssh;
		updateresource.snmp = resource.snmp;
		updateresource.mgmtaccess = resource.mgmtaccess;
		updateresource.restrictaccess = resource.restrictaccess;
		updateresource.dynamicrouting = resource.dynamicrouting;
		updateresource.ospf = resource.ospf;
		updateresource.bgp = resource.bgp;
		updateresource.rip = resource.rip;
		updateresource.hostroute = resource.hostroute;
		updateresource.hostrtgw = resource.hostrtgw;
		updateresource.metric = resource.metric;
		updateresource.vserverrhilevel = resource.vserverrhilevel;
		updateresource.ospflsatype = resource.ospflsatype;
		updateresource.ospfarea = resource.ospfarea;
		updateresource.vrid = resource.vrid;
		updateresource.icmpresponse = resource.icmpresponse;
		updateresource.arpresponse = resource.arpresponse;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nsip resources.
	*/
	public static base_responses update(nitro_service client, nsip resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip updateresources[] = new nsip[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nsip();
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].td = resources[i].td;
				updateresources[i].netmask = resources[i].netmask;
				updateresources[i].arp = resources[i].arp;
				updateresources[i].icmp = resources[i].icmp;
				updateresources[i].vserver = resources[i].vserver;
				updateresources[i].telnet = resources[i].telnet;
				updateresources[i].ftp = resources[i].ftp;
				updateresources[i].gui = resources[i].gui;
				updateresources[i].ssh = resources[i].ssh;
				updateresources[i].snmp = resources[i].snmp;
				updateresources[i].mgmtaccess = resources[i].mgmtaccess;
				updateresources[i].restrictaccess = resources[i].restrictaccess;
				updateresources[i].dynamicrouting = resources[i].dynamicrouting;
				updateresources[i].ospf = resources[i].ospf;
				updateresources[i].bgp = resources[i].bgp;
				updateresources[i].rip = resources[i].rip;
				updateresources[i].hostroute = resources[i].hostroute;
				updateresources[i].hostrtgw = resources[i].hostrtgw;
				updateresources[i].metric = resources[i].metric;
				updateresources[i].vserverrhilevel = resources[i].vserverrhilevel;
				updateresources[i].ospflsatype = resources[i].ospflsatype;
				updateresources[i].ospfarea = resources[i].ospfarea;
				updateresources[i].vrid = resources[i].vrid;
				updateresources[i].icmpresponse = resources[i].icmpresponse;
				updateresources[i].arpresponse = resources[i].arpresponse;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsip resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsip resource, String[] args) throws Exception{
		nsip unsetresource = new nsip();
		unsetresource.ipaddress = resource.ipaddress;
		unsetresource.td = resource.td;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nsip resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String ipaddress[], String args[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			nsip unsetresources[] = new nsip[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				unsetresources[i] = new nsip();
				unsetresources[i].ipaddress = ipaddress[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsip resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nsip resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip unsetresources[] = new nsip[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nsip();
				unsetresources[i].ipaddress = resources[i].ipaddress;
				unsetresources[i].td = resources[i].td;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable nsip of given name.
	*/
	public static base_response enable(nitro_service client, String ipaddress) throws Exception {
		nsip enableresource = new nsip();
		enableresource.ipaddress = ipaddress;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nsip.
	*/
	public static base_response enable(nitro_service client, nsip resource) throws Exception {
		nsip enableresource = new nsip();
		enableresource.ipaddress = resource.ipaddress;
		enableresource.td = resource.td;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nsip resources of given names.
	*/
	public static base_responses enable(nitro_service client, String ipaddress[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			nsip enableresources[] = new nsip[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				enableresources[i] = new nsip();
				enableresources[i].ipaddress = ipaddress[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable nsip resources.
	*/
	public static base_responses enable(nitro_service client, nsip resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip enableresources[] = new nsip[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new nsip();
				enableresources[i].ipaddress = resources[i].ipaddress;
				enableresources[i].td = resources[i].td;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable nsip of given name.
	*/
	public static base_response disable(nitro_service client, String ipaddress) throws Exception {
		nsip disableresource = new nsip();
		disableresource.ipaddress = ipaddress;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nsip.
	*/
	public static base_response disable(nitro_service client, nsip resource) throws Exception {
		nsip disableresource = new nsip();
		disableresource.ipaddress = resource.ipaddress;
		disableresource.td = resource.td;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nsip resources of given names.
	*/
	public static base_responses disable(nitro_service client, String ipaddress[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			nsip disableresources[] = new nsip[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				disableresources[i] = new nsip();
				disableresources[i].ipaddress = ipaddress[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable nsip resources.
	*/
	public static base_responses disable(nitro_service client, nsip resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsip disableresources[] = new nsip[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new nsip();
				disableresources[i].ipaddress = resources[i].ipaddress;
				disableresources[i].td = resources[i].td;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to fetch all the nsip resources that are configured on netscaler.
	*/
	public static nsip[] get(nitro_service service) throws Exception{
		nsip obj = new nsip();
		nsip[] response = (nsip[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsip resources that are configured on netscaler.
	*/
	public static nsip[] get(nitro_service service, options option) throws Exception{
		nsip obj = new nsip();
		nsip[] response = (nsip[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a nsip resource.
	*/
	public static nsip get(nitro_service service, nsip obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nsip response = (nsip) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a nsip resources.
	*/
	public static nsip[] get(nitro_service service, nsip obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			nsip response[] = new nsip[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (nsip) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the nsip resources that are configured on netscaler.
	* This uses nsip_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static nsip[] get(nitro_service service, nsip_args args) throws Exception{
		nsip obj = new nsip();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		nsip[] response = (nsip[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsip resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsip[] get_filtered(nitro_service service, String filter) throws Exception{
		nsip obj = new nsip();
		options option = new options();
		option.set_filter(filter);
		nsip[] response = (nsip[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsip resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsip[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsip obj = new nsip();
		options option = new options();
		option.set_filter(filter);
		nsip[] response = (nsip[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsip resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsip obj = new nsip();
		options option = new options();
		option.set_count(true);
		nsip[] response = (nsip[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsip resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsip obj = new nsip();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsip[] response = (nsip[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsip resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsip obj = new nsip();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsip[] response = (nsip[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class arpresponseEnum {
		public static final String NONE = "NONE";
		public static final String ONE_VSERVER = "ONE_VSERVER";
		public static final String ALL_VSERVERS = "ALL_VSERVERS";
	}
	public static class iptypeEnum {
		public static final String SNIP = "SNIP";
		public static final String VIP = "VIP";
		public static final String MIP = "MIP";
		public static final String NSIP = "NSIP";
		public static final String GSLBsiteIP = "GSLBsiteIP";
		public static final String CLIP = "CLIP";
	}
	public static class sshEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ripEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class guiEnum {
		public static final String ENABLED = "ENABLED";
		public static final String SECUREONLY = "SECUREONLY";
		public static final String DISABLED = "DISABLED";
	}
	public static class ospfEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dynamicroutingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String SNIP = "SNIP";
		public static final String VIP = "VIP";
		public static final String MIP = "MIP";
		public static final String NSIP = "NSIP";
		public static final String GSLBsiteIP = "GSLBsiteIP";
		public static final String CLIP = "CLIP";
	}
	public static class ospflsatypeEnum {
		public static final String TYPE1 = "TYPE1";
		public static final String TYPE5 = "TYPE5";
	}
	public static class bgpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class arpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mgmtaccessEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class hostrouteEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ftpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
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
	public static class icmpresponseEnum {
		public static final String NONE = "NONE";
		public static final String ONE_VSERVER = "ONE_VSERVER";
		public static final String ALL_VSERVERS = "ALL_VSERVERS";
		public static final String VSVR_CNTRLD = "VSVR_CNTRLD";
	}
	public static class vserverEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class snmpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class restrictaccessEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class telnetEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
