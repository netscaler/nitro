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
	* The IP address of the entity.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The IP address of the entity.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* The netmask of the IP.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The netmask of the IP.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The type of the IP address.<br> Default value: NSADDR_SNIP<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of the IP address.<br> Default value: NSADDR_SNIP<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) ARP and gratuitous ARP for the entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_arp(String arp) throws Exception{
		this.arp = arp;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) ARP and gratuitous ARP for the entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_arp() throws Exception {
		return this.arp;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) ICMP responses for the entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_icmp(String icmp) throws Exception{
		this.icmp = icmp;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) ICMP responses for the entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
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
	* Use this option to set (enable or disable) the state of telnet access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_telnet(String telnet) throws Exception{
		this.telnet = telnet;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of telnet access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_telnet() throws Exception {
		return this.telnet;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of ftp access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ftp(String ftp) throws Exception{
		this.ftp = ftp;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of ftp access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ftp() throws Exception {
		return this.ftp;
	}

	/**
	* <pre>
	* Use this option to set (enable|Secureonly|disable) GUI access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, SECUREONLY, DISABLED
	* </pre>
	*/
	public void set_gui(String gui) throws Exception{
		this.gui = gui;
	}

	/**
	* <pre>
	* Use this option to set (enable|Secureonly|disable) GUI access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, SECUREONLY, DISABLED
	* </pre>
	*/
	public String get_gui() throws Exception {
		return this.gui;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of SSH access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ssh(String ssh) throws Exception{
		this.ssh = ssh;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of SSH access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ssh() throws Exception {
		return this.ssh;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of SNMP access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_snmp(String snmp) throws Exception{
		this.snmp = snmp;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of SNMP access to this IP entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_snmp() throws Exception {
		return this.snmp;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of management access to this IP entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mgmtaccess(String mgmtaccess) throws Exception{
		this.mgmtaccess = mgmtaccess;
	}

	/**
	* <pre>
	* Use this option to set (enable or disable) the state of management access to this IP entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mgmtaccess() throws Exception {
		return this.mgmtaccess;
	}

	/**
	* <pre>
	* Enable or disable blocking of all ports not used for management access.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_restrictaccess(String restrictaccess) throws Exception{
		this.restrictaccess = restrictaccess;
	}

	/**
	* <pre>
	* Enable or disable blocking of all ports not used for management access.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_restrictaccess() throws Exception {
		return this.restrictaccess;
	}

	/**
	* <pre>
	* Use this option to enable or disable dynamic routing on this IP address for the entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dynamicrouting(String dynamicrouting) throws Exception{
		this.dynamicrouting = dynamicrouting;
	}

	/**
	* <pre>
	* Use this option to enable or disable dynamic routing on this IP address for the entity.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
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
	* The state of advertisement of a hostroute to this IP entity.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_hostroute(String hostroute) throws Exception{
		this.hostroute = hostroute;
	}

	/**
	* <pre>
	* The state of advertisement of a hostroute to this IP entity.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_hostroute() throws Exception {
		return this.hostroute;
	}

	/**
	* <pre>
	* The gateway for the hostroute to be advertised for this IP entity.<br> Default value: -1
	* </pre>
	*/
	public void set_hostrtgw(String hostrtgw) throws Exception{
		this.hostrtgw = hostrtgw;
	}

	/**
	* <pre>
	* The gateway for the hostroute to be advertised for this IP entity.<br> Default value: -1
	* </pre>
	*/
	public String get_hostrtgw() throws Exception {
		return this.hostrtgw;
	}

	/**
	* <pre>
	* The metric value to be added or subtracted from the cost of the hostroute advertised for this IP entity.<br> Minimum value =  -16777215
	* </pre>
	*/
	public void set_metric(int metric) throws Exception {
		this.metric = new Integer(metric);
	}

	/**
	* <pre>
	* The metric value to be added or subtracted from the cost of the hostroute advertised for this IP entity.<br> Minimum value =  -16777215
	* </pre>
	*/
	public void set_metric(Integer metric) throws Exception{
		this.metric = metric;
	}

	/**
	* <pre>
	* The metric value to be added or subtracted from the cost of the hostroute advertised for this IP entity.<br> Minimum value =  -16777215
	* </pre>
	*/
	public Integer get_metric() throws Exception {
		return this.metric;
	}

	/**
	* <pre>
	* The state of per VIP RHI controls.<br> Default value: RHI_STATE_ONE<br> Possible values = ONE_VSERVER, ALL_VSERVERS, NONE
	* </pre>
	*/
	public void set_vserverrhilevel(String vserverrhilevel) throws Exception{
		this.vserverrhilevel = vserverrhilevel;
	}

	/**
	* <pre>
	* The state of per VIP RHI controls.<br> Default value: RHI_STATE_ONE<br> Possible values = ONE_VSERVER, ALL_VSERVERS, NONE
	* </pre>
	*/
	public String get_vserverrhilevel() throws Exception {
		return this.vserverrhilevel;
	}

	/**
	* <pre>
	* The OSPF's route advertisement type.<br> Default value: DISABLED<br> Possible values = TYPE1, TYPE5
	* </pre>
	*/
	public void set_ospflsatype(String ospflsatype) throws Exception{
		this.ospflsatype = ospflsatype;
	}

	/**
	* <pre>
	* The OSPF's route advertisement type.<br> Default value: DISABLED<br> Possible values = TYPE1, TYPE5
	* </pre>
	*/
	public String get_ospflsatype() throws Exception {
		return this.ospflsatype;
	}

	/**
	* <pre>
	* The area ID of the area in which OSPF Type1 LSAs should be advertised.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_ospfarea(long ospfarea) throws Exception {
		this.ospfarea = new Long(ospfarea);
	}

	/**
	* <pre>
	* The area ID of the area in which OSPF Type1 LSAs should be advertised.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_ospfarea(Long ospfarea) throws Exception{
		this.ospfarea = ospfarea;
	}

	/**
	* <pre>
	* The area ID of the area in which OSPF Type1 LSAs should be advertised.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public Long get_ospfarea() throws Exception {
		return this.ospfarea;
	}

	/**
	* <pre>
	* Use this option to enable or disable the entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Use this option to enable or disable the entity.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Use this option to bind this IP to a VRID.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_vrid(long vrid) throws Exception {
		this.vrid = new Long(vrid);
	}

	/**
	* <pre>
	* Use this option to bind this IP to a VRID.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_vrid(Long vrid) throws Exception{
		this.vrid = vrid;
	}

	/**
	* <pre>
	* Use this option to bind this IP to a VRID.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_vrid() throws Exception {
		return this.vrid;
	}

	/**
	* <pre>
	* ICMp response control on down vserver.<br> Default value: 5<br> Possible values = NONE, ONE_VSERVER, ALL_VSERVERS, VSVR_CNTRLD
	* </pre>
	*/
	public void set_icmpresponse(String icmpresponse) throws Exception{
		this.icmpresponse = icmpresponse;
	}

	/**
	* <pre>
	* ICMp response control on down vserver.<br> Default value: 5<br> Possible values = NONE, ONE_VSERVER, ALL_VSERVERS, VSVR_CNTRLD
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
	* Arp response control on down vserver.<br> Default value: 5<br> Possible values = NONE, ONE_VSERVER, ALL_VSERVERS
	* </pre>
	*/
	public void set_arpresponse(String arpresponse) throws Exception{
		this.arpresponse = arpresponse;
	}

	/**
	* <pre>
	* Arp response control on down vserver.<br> Default value: 5<br> Possible values = NONE, ONE_VSERVER, ALL_VSERVERS
	* </pre>
	*/
	public String get_arpresponse() throws Exception {
		return this.arpresponse;
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
	public static base_response unset(nitro_service client, String ipaddress, String args[]) throws Exception {
		nsip unsetresource = new nsip();
		unsetresource.ipaddress = ipaddress;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of nsip resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsip resource, String[] args) throws Exception{
		nsip unsetresource = new nsip();
		unsetresource.ipaddress = resource.ipaddress;
		unsetresource.netmask = resource.netmask;
		unsetresource.arp = resource.arp;
		unsetresource.icmp = resource.icmp;
		unsetresource.vserver = resource.vserver;
		unsetresource.telnet = resource.telnet;
		unsetresource.ftp = resource.ftp;
		unsetresource.gui = resource.gui;
		unsetresource.ssh = resource.ssh;
		unsetresource.snmp = resource.snmp;
		unsetresource.mgmtaccess = resource.mgmtaccess;
		unsetresource.restrictaccess = resource.restrictaccess;
		unsetresource.dynamicrouting = resource.dynamicrouting;
		unsetresource.ospf = resource.ospf;
		unsetresource.bgp = resource.bgp;
		unsetresource.rip = resource.rip;
		unsetresource.hostroute = resource.hostroute;
		unsetresource.hostrtgw = resource.hostrtgw;
		unsetresource.metric = resource.metric;
		unsetresource.vserverrhilevel = resource.vserverrhilevel;
		unsetresource.ospflsatype = resource.ospflsatype;
		unsetresource.ospfarea = resource.ospfarea;
		unsetresource.vrid = resource.vrid;
		unsetresource.icmpresponse = resource.icmpresponse;
		unsetresource.arpresponse = resource.arpresponse;
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
				unsetresources[i].netmask = resources[i].netmask;
				unsetresources[i].arp = resources[i].arp;
				unsetresources[i].icmp = resources[i].icmp;
				unsetresources[i].vserver = resources[i].vserver;
				unsetresources[i].telnet = resources[i].telnet;
				unsetresources[i].ftp = resources[i].ftp;
				unsetresources[i].gui = resources[i].gui;
				unsetresources[i].ssh = resources[i].ssh;
				unsetresources[i].snmp = resources[i].snmp;
				unsetresources[i].mgmtaccess = resources[i].mgmtaccess;
				unsetresources[i].restrictaccess = resources[i].restrictaccess;
				unsetresources[i].dynamicrouting = resources[i].dynamicrouting;
				unsetresources[i].ospf = resources[i].ospf;
				unsetresources[i].bgp = resources[i].bgp;
				unsetresources[i].rip = resources[i].rip;
				unsetresources[i].hostroute = resources[i].hostroute;
				unsetresources[i].hostrtgw = resources[i].hostrtgw;
				unsetresources[i].metric = resources[i].metric;
				unsetresources[i].vserverrhilevel = resources[i].vserverrhilevel;
				unsetresources[i].ospflsatype = resources[i].ospflsatype;
				unsetresources[i].ospfarea = resources[i].ospfarea;
				unsetresources[i].vrid = resources[i].vrid;
				unsetresources[i].icmpresponse = resources[i].icmpresponse;
				unsetresources[i].arpresponse = resources[i].arpresponse;
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
	* Use this API to fetch nsip resource of given name .
	*/
	public static nsip get(nitro_service service, String ipaddress) throws Exception{
		nsip obj = new nsip();
		obj.set_ipaddress(ipaddress);
		nsip response = (nsip) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nsip resources of given names .
	*/
	public static nsip[] get(nitro_service service, String ipaddress[]) throws Exception{
		if (ipaddress !=null && ipaddress.length>0) {
			nsip response[] = new nsip[ipaddress.length];
			nsip obj[] = new nsip[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++) {
				obj[i] = new nsip();
				obj[i].set_ipaddress(ipaddress[i]);
				response[i] = (nsip) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
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
