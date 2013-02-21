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

class nspbr_response extends base_response
{
	public nspbr[] nspbr;
}
/**
* Configuration for Policy Based Routing(PBR) entry resource.
*/

public class nspbr extends base_resource
{
	private String name;
	private String action;
	private Boolean srcip;
	private String srcipop;
	private String srcipval;
	private Boolean srcport;
	private String srcportop;
	private String srcportval;
	private Boolean destip;
	private String destipop;
	private String destipval;
	private Boolean destport;
	private String destportop;
	private String destportval;
	private Boolean nexthop;
	private String nexthopval;
	private String srcmac;
	private String protocol;
	private Long protocolnumber;
	private Long vlan;
	private String Interface;
	private Long priority;
	private String msr;
	private String monitor;
	private String state;
	private Boolean detail;

	//------- Read only Parameter ---------;

	private Long hits;
	private String kernelstate;
	private Long curstate;
	private Long totalprobes;
	private Long totalfailedprobes;
	private Long failedprobes;
	private Integer monstatcode;
	private Integer monstatparam1;
	private Integer monstatparam2;
	private Integer monstatparam3;
	private Boolean data;
	private Long __count;

	/**
	* <pre>
	* The name of the PBR.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the PBR.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The action associated with the PBR.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The action associated with the PBR.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* The source IP address (range).
	* </pre>
	*/
	public void set_srcip(boolean srcip) throws Exception {
		this.srcip = new Boolean(srcip);
	}

	/**
	* <pre>
	* The source IP address (range).
	* </pre>
	*/
	public void set_srcip(Boolean srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* The source IP address (range).
	* </pre>
	*/
	public Boolean get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* Logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public void set_srcipop(String srcipop) throws Exception{
		this.srcipop = srcipop;
	}

	/**
	* <pre>
	* Logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public String get_srcipop() throws Exception {
		return this.srcipop;
	}

	/**
	* <pre>
	* The source IP address (range).
	* </pre>
	*/
	public void set_srcipval(String srcipval) throws Exception{
		this.srcipval = srcipval;
	}

	/**
	* <pre>
	* The source IP address (range).
	* </pre>
	*/
	public String get_srcipval() throws Exception {
		return this.srcipval;
	}

	/**
	* <pre>
	* The source port (range).
	* </pre>
	*/
	public void set_srcport(boolean srcport) throws Exception {
		this.srcport = new Boolean(srcport);
	}

	/**
	* <pre>
	* The source port (range).
	* </pre>
	*/
	public void set_srcport(Boolean srcport) throws Exception{
		this.srcport = srcport;
	}

	/**
	* <pre>
	* The source port (range).
	* </pre>
	*/
	public Boolean get_srcport() throws Exception {
		return this.srcport;
	}

	/**
	* <pre>
	* Logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public void set_srcportop(String srcportop) throws Exception{
		this.srcportop = srcportop;
	}

	/**
	* <pre>
	* Logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public String get_srcportop() throws Exception {
		return this.srcportop;
	}

	/**
	* <pre>
	* The source port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public void set_srcportval(String srcportval) throws Exception{
		this.srcportval = srcportval;
	}

	/**
	* <pre>
	* The source port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public String get_srcportval() throws Exception {
		return this.srcportval;
	}

	/**
	* <pre>
	* The destination IP address (range).
	* </pre>
	*/
	public void set_destip(boolean destip) throws Exception {
		this.destip = new Boolean(destip);
	}

	/**
	* <pre>
	* The destination IP address (range).
	* </pre>
	*/
	public void set_destip(Boolean destip) throws Exception{
		this.destip = destip;
	}

	/**
	* <pre>
	* The destination IP address (range).
	* </pre>
	*/
	public Boolean get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* Logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public void set_destipop(String destipop) throws Exception{
		this.destipop = destipop;
	}

	/**
	* <pre>
	* Logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public String get_destipop() throws Exception {
		return this.destipop;
	}

	/**
	* <pre>
	* The destination IP address (range).
	* </pre>
	*/
	public void set_destipval(String destipval) throws Exception{
		this.destipval = destipval;
	}

	/**
	* <pre>
	* The destination IP address (range).
	* </pre>
	*/
	public String get_destipval() throws Exception {
		return this.destipval;
	}

	/**
	* <pre>
	* The destination port (range).
	* </pre>
	*/
	public void set_destport(boolean destport) throws Exception {
		this.destport = new Boolean(destport);
	}

	/**
	* <pre>
	* The destination port (range).
	* </pre>
	*/
	public void set_destport(Boolean destport) throws Exception{
		this.destport = destport;
	}

	/**
	* <pre>
	* The destination port (range).
	* </pre>
	*/
	public Boolean get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* Logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public void set_destportop(String destportop) throws Exception{
		this.destportop = destportop;
	}

	/**
	* <pre>
	* Logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public String get_destportop() throws Exception {
		return this.destportop;
	}

	/**
	* <pre>
	* The destination port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public void set_destportval(String destportval) throws Exception{
		this.destportval = destportval;
	}

	/**
	* <pre>
	* The destination port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public String get_destportval() throws Exception {
		return this.destportval;
	}

	/**
	* <pre>
	* The Next Hop IP address.
	* </pre>
	*/
	public void set_nexthop(boolean nexthop) throws Exception {
		this.nexthop = new Boolean(nexthop);
	}

	/**
	* <pre>
	* The Next Hop IP address.
	* </pre>
	*/
	public void set_nexthop(Boolean nexthop) throws Exception{
		this.nexthop = nexthop;
	}

	/**
	* <pre>
	* The Next Hop IP address.
	* </pre>
	*/
	public Boolean get_nexthop() throws Exception {
		return this.nexthop;
	}

	/**
	* <pre>
	* The Next Hop IP address or gateway name.
	* </pre>
	*/
	public void set_nexthopval(String nexthopval) throws Exception{
		this.nexthopval = nexthopval;
	}

	/**
	* <pre>
	* The Next Hop IP address or gateway name.
	* </pre>
	*/
	public String get_nexthopval() throws Exception {
		return this.nexthopval;
	}

	/**
	* <pre>
	* The source MAC address.
	* </pre>
	*/
	public void set_srcmac(String srcmac) throws Exception{
		this.srcmac = srcmac;
	}

	/**
	* <pre>
	* The source MAC address.
	* </pre>
	*/
	public String get_srcmac() throws Exception {
		return this.srcmac;
	}

	/**
	* <pre>
	* The IP protocol name.<br> Possible values = ICMP, IGMP, TCP, EGP, IGP, ARGUS, UDP, RDP, RSVP, EIGRP, L2TP, ISIS
	* </pre>
	*/
	public void set_protocol(String protocol) throws Exception{
		this.protocol = protocol;
	}

	/**
	* <pre>
	* The IP protocol name.<br> Possible values = ICMP, IGMP, TCP, EGP, IGP, ARGUS, UDP, RDP, RSVP, EIGRP, L2TP, ISIS
	* </pre>
	*/
	public String get_protocol() throws Exception {
		return this.protocol;
	}

	/**
	* <pre>
	* The IP protocol number (decimal).<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_protocolnumber(long protocolnumber) throws Exception {
		this.protocolnumber = new Long(protocolnumber);
	}

	/**
	* <pre>
	* The IP protocol number (decimal).<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_protocolnumber(Long protocolnumber) throws Exception{
		this.protocolnumber = protocolnumber;
	}

	/**
	* <pre>
	* The IP protocol number (decimal).<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_protocolnumber() throws Exception {
		return this.protocolnumber;
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* The physical interface.
	* </pre>
	*/
	public void set_Interface(String Interface) throws Exception{
		this.Interface = Interface;
	}

	/**
	* <pre>
	* The physical interface.
	* </pre>
	*/
	public String get_Interface() throws Exception {
		return this.Interface;
	}

	/**
	* <pre>
	* The priority of the PBR.<br> Minimum value =  1<br> Maximum value =  81920
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the PBR.<br> Minimum value =  1<br> Maximum value =  81920
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the PBR.<br> Minimum value =  1<br> Maximum value =  81920
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Enable/disable Monitored Static Route(MSR) on this route.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_msr(String msr) throws Exception{
		this.msr = msr;
	}

	/**
	* <pre>
	* Enable/disable Monitored Static Route(MSR) on this route.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_msr() throws Exception {
		return this.msr;
	}

	/**
	* <pre>
	* The name of the monitor.(Can be only of type ping or ARP ).<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitor(String monitor) throws Exception{
		this.monitor = monitor;
	}

	/**
	* <pre>
	* The name of the monitor.(Can be only of type ping or ARP ).<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitor() throws Exception {
		return this.monitor;
	}

	/**
	* <pre>
	* The state of the PBR.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, REMOVED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the PBR.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, REMOVED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* To get a detailed view.
	* </pre>
	*/
	public void set_detail(boolean detail) throws Exception {
		this.detail = new Boolean(detail);
	}

	/**
	* <pre>
	* To get a detailed view.
	* </pre>
	*/
	public void set_detail(Boolean detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* To get a detailed view.
	* </pre>
	*/
	public Boolean get_detail() throws Exception {
		return this.detail;
	}

	/**
	* <pre>
	* The hits of this PBR.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The commit status of the PBR.<br> Default value: XACLNAPPLIED<br> Possible values = APPLIED, NOTAPPLIED, RE-APPLY, SFAPPLIED, SFNOTAPPLIED, SFAPPLIED61, SFNOTAPPLIED61
	* </pre>
	*/
	public String get_kernelstate() throws Exception {
		return this.kernelstate;
	}

	/**
	* <pre>
	* If this route is UP/DOWN.
	* </pre>
	*/
	public Long get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* The total number of probes sent.
	* </pre>
	*/
	public Long get_totalprobes() throws Exception {
		return this.totalprobes;
	}

	/**
	* <pre>
	* The total number of failed probes.
	* </pre>
	*/
	public Long get_totalfailedprobes() throws Exception {
		return this.totalfailedprobes;
	}

	/**
	* <pre>
	* Number of the current failed monitoring probes.
	* </pre>
	*/
	public Long get_failedprobes() throws Exception {
		return this.failedprobes;
	}

	/**
	* <pre>
	* The code indicating the monitor response.
	* </pre>
	*/
	public Integer get_monstatcode() throws Exception {
		return this.monstatcode;
	}

	/**
	* <pre>
	* First parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam1() throws Exception {
		return this.monstatparam1;
	}

	/**
	* <pre>
	* Second parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam2() throws Exception {
		return this.monstatparam2;
	}

	/**
	* <pre>
	* Third parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam3() throws Exception {
		return this.monstatparam3;
	}

	/**
	* <pre>
	* Internal data of this route.
	* </pre>
	*/
	public Boolean get_data() throws Exception {
		return this.data;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nspbr_response result = (nspbr_response) service.get_payload_formatter().string_to_resource(nspbr_response.class, response);
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
		return result.nspbr;
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
	* Use this API to add nspbr.
	*/
	public static base_response add(nitro_service client, nspbr resource) throws Exception {
		nspbr addresource = new nspbr();
		addresource.name = resource.name;
		addresource.action = resource.action;
		addresource.srcip = resource.srcip;
		addresource.srcipop = resource.srcipop;
		addresource.srcipval = resource.srcipval;
		addresource.srcport = resource.srcport;
		addresource.srcportop = resource.srcportop;
		addresource.srcportval = resource.srcportval;
		addresource.destip = resource.destip;
		addresource.destipop = resource.destipop;
		addresource.destipval = resource.destipval;
		addresource.destport = resource.destport;
		addresource.destportop = resource.destportop;
		addresource.destportval = resource.destportval;
		addresource.nexthop = resource.nexthop;
		addresource.nexthopval = resource.nexthopval;
		addresource.srcmac = resource.srcmac;
		addresource.protocol = resource.protocol;
		addresource.protocolnumber = resource.protocolnumber;
		addresource.vlan = resource.vlan;
		addresource.Interface = resource.Interface;
		addresource.priority = resource.priority;
		addresource.msr = resource.msr;
		addresource.monitor = resource.monitor;
		addresource.state = resource.state;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nspbr resources.
	*/
	public static base_responses add(nitro_service client, nspbr resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr addresources[] = new nspbr[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nspbr();
				addresources[i].name = resources[i].name;
				addresources[i].action = resources[i].action;
				addresources[i].srcip = resources[i].srcip;
				addresources[i].srcipop = resources[i].srcipop;
				addresources[i].srcipval = resources[i].srcipval;
				addresources[i].srcport = resources[i].srcport;
				addresources[i].srcportop = resources[i].srcportop;
				addresources[i].srcportval = resources[i].srcportval;
				addresources[i].destip = resources[i].destip;
				addresources[i].destipop = resources[i].destipop;
				addresources[i].destipval = resources[i].destipval;
				addresources[i].destport = resources[i].destport;
				addresources[i].destportop = resources[i].destportop;
				addresources[i].destportval = resources[i].destportval;
				addresources[i].nexthop = resources[i].nexthop;
				addresources[i].nexthopval = resources[i].nexthopval;
				addresources[i].srcmac = resources[i].srcmac;
				addresources[i].protocol = resources[i].protocol;
				addresources[i].protocolnumber = resources[i].protocolnumber;
				addresources[i].vlan = resources[i].vlan;
				addresources[i].Interface = resources[i].Interface;
				addresources[i].priority = resources[i].priority;
				addresources[i].msr = resources[i].msr;
				addresources[i].monitor = resources[i].monitor;
				addresources[i].state = resources[i].state;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nspbr of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		nspbr deleteresource = new nspbr();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nspbr.
	*/
	public static base_response delete(nitro_service client, nspbr resource) throws Exception {
		nspbr deleteresource = new nspbr();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nspbr resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nspbr deleteresources[] = new nspbr[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new nspbr();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nspbr resources.
	*/
	public static base_responses delete(nitro_service client, nspbr resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr deleteresources[] = new nspbr[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nspbr();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nspbr.
	*/
	public static base_response update(nitro_service client, nspbr resource) throws Exception {
		nspbr updateresource = new nspbr();
		updateresource.name = resource.name;
		updateresource.action = resource.action;
		updateresource.srcip = resource.srcip;
		updateresource.srcipop = resource.srcipop;
		updateresource.srcipval = resource.srcipval;
		updateresource.srcport = resource.srcport;
		updateresource.srcportop = resource.srcportop;
		updateresource.srcportval = resource.srcportval;
		updateresource.destip = resource.destip;
		updateresource.destipop = resource.destipop;
		updateresource.destipval = resource.destipval;
		updateresource.destport = resource.destport;
		updateresource.destportop = resource.destportop;
		updateresource.destportval = resource.destportval;
		updateresource.nexthop = resource.nexthop;
		updateresource.nexthopval = resource.nexthopval;
		updateresource.srcmac = resource.srcmac;
		updateresource.protocol = resource.protocol;
		updateresource.protocolnumber = resource.protocolnumber;
		updateresource.vlan = resource.vlan;
		updateresource.Interface = resource.Interface;
		updateresource.priority = resource.priority;
		updateresource.msr = resource.msr;
		updateresource.monitor = resource.monitor;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nspbr resources.
	*/
	public static base_responses update(nitro_service client, nspbr resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr updateresources[] = new nspbr[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nspbr();
				updateresources[i].name = resources[i].name;
				updateresources[i].action = resources[i].action;
				updateresources[i].srcip = resources[i].srcip;
				updateresources[i].srcipop = resources[i].srcipop;
				updateresources[i].srcipval = resources[i].srcipval;
				updateresources[i].srcport = resources[i].srcport;
				updateresources[i].srcportop = resources[i].srcportop;
				updateresources[i].srcportval = resources[i].srcportval;
				updateresources[i].destip = resources[i].destip;
				updateresources[i].destipop = resources[i].destipop;
				updateresources[i].destipval = resources[i].destipval;
				updateresources[i].destport = resources[i].destport;
				updateresources[i].destportop = resources[i].destportop;
				updateresources[i].destportval = resources[i].destportval;
				updateresources[i].nexthop = resources[i].nexthop;
				updateresources[i].nexthopval = resources[i].nexthopval;
				updateresources[i].srcmac = resources[i].srcmac;
				updateresources[i].protocol = resources[i].protocol;
				updateresources[i].protocolnumber = resources[i].protocolnumber;
				updateresources[i].vlan = resources[i].vlan;
				updateresources[i].Interface = resources[i].Interface;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].msr = resources[i].msr;
				updateresources[i].monitor = resources[i].monitor;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nspbr resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		nspbr unsetresource = new nspbr();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of nspbr resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nspbr resource, String[] args) throws Exception{
		nspbr unsetresource = new nspbr();
		unsetresource.name = resource.name;
		unsetresource.srcip = resource.srcip;
		unsetresource.srcport = resource.srcport;
		unsetresource.destip = resource.destip;
		unsetresource.destport = resource.destport;
		unsetresource.nexthop = resource.nexthop;
		unsetresource.srcmac = resource.srcmac;
		unsetresource.protocol = resource.protocol;
		unsetresource.vlan = resource.vlan;
		unsetresource.Interface = resource.Interface;
		unsetresource.msr = resource.msr;
		unsetresource.monitor = resource.monitor;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nspbr resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nspbr unsetresources[] = new nspbr[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new nspbr();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nspbr resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nspbr resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr unsetresources[] = new nspbr[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nspbr();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].srcip = resources[i].srcip;
				unsetresources[i].srcport = resources[i].srcport;
				unsetresources[i].destip = resources[i].destip;
				unsetresources[i].destport = resources[i].destport;
				unsetresources[i].nexthop = resources[i].nexthop;
				unsetresources[i].srcmac = resources[i].srcmac;
				unsetresources[i].protocol = resources[i].protocol;
				unsetresources[i].vlan = resources[i].vlan;
				unsetresources[i].Interface = resources[i].Interface;
				unsetresources[i].msr = resources[i].msr;
				unsetresources[i].monitor = resources[i].monitor;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable nspbr of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		nspbr enableresource = new nspbr();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nspbr.
	*/
	public static base_response enable(nitro_service client, nspbr resource) throws Exception {
		nspbr enableresource = new nspbr();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nspbr resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nspbr enableresources[] = new nspbr[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new nspbr();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable nspbr resources.
	*/
	public static base_responses enable(nitro_service client, nspbr resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr enableresources[] = new nspbr[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new nspbr();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable nspbr of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		nspbr disableresource = new nspbr();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nspbr.
	*/
	public static base_response disable(nitro_service client, nspbr resource) throws Exception {
		nspbr disableresource = new nspbr();
		disableresource.name = resource.name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nspbr resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nspbr disableresources[] = new nspbr[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new nspbr();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable nspbr resources.
	*/
	public static base_responses disable(nitro_service client, nspbr resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr disableresources[] = new nspbr[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new nspbr();
				disableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to fetch all the nspbr resources that are configured on netscaler.
	*/
	public static nspbr[] get(nitro_service service) throws Exception{
		nspbr obj = new nspbr();
		nspbr[] response = (nspbr[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nspbr resources that are configured on netscaler.
	*/
	public static nspbr[] get(nitro_service service, options option) throws Exception{
		nspbr obj = new nspbr();
		nspbr[] response = (nspbr[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the nspbr resources that are configured on netscaler.
	* This uses nspbr_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static nspbr[] get(nitro_service service, nspbr_args args) throws Exception{
		nspbr obj = new nspbr();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		nspbr[] response = (nspbr[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch nspbr resource of given name .
	*/
	public static nspbr get(nitro_service service, String name) throws Exception{
		nspbr obj = new nspbr();
		obj.set_name(name);
		nspbr response = (nspbr) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nspbr resources of given names .
	*/
	public static nspbr[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nspbr response[] = new nspbr[name.length];
			nspbr obj[] = new nspbr[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nspbr();
				obj[i].set_name(name[i]);
				response[i] = (nspbr) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nspbr resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nspbr[] get_filtered(nitro_service service, String filter) throws Exception{
		nspbr obj = new nspbr();
		options option = new options();
		option.set_filter(filter);
		nspbr[] response = (nspbr[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nspbr resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nspbr[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nspbr obj = new nspbr();
		options option = new options();
		option.set_filter(filter);
		nspbr[] response = (nspbr[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nspbr resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nspbr obj = new nspbr();
		options option = new options();
		option.set_count(true);
		nspbr[] response = (nspbr[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nspbr resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nspbr obj = new nspbr();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nspbr[] response = (nspbr[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nspbr resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nspbr obj = new nspbr();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nspbr[] response = (nspbr[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class protocolEnum {
		public static final String ICMP = "ICMP";
		public static final String IGMP = "IGMP";
		public static final String TCP = "TCP";
		public static final String EGP = "EGP";
		public static final String IGP = "IGP";
		public static final String ARGUS = "ARGUS";
		public static final String UDP = "UDP";
		public static final String RDP = "RDP";
		public static final String RSVP = "RSVP";
		public static final String EIGRP = "EIGRP";
		public static final String L2TP = "L2TP";
		public static final String ISIS = "ISIS";
	}
	public static class srcipopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
	public static class destipopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
		public static final String REMOVED = "REMOVED";
	}
	public static class kernelstateEnum {
		public static final String APPLIED = "APPLIED";
		public static final String NOTAPPLIED = "NOTAPPLIED";
		public static final String RE_APPLY = "RE-APPLY";
		public static final String SFAPPLIED = "SFAPPLIED";
		public static final String SFNOTAPPLIED = "SFNOTAPPLIED";
		public static final String SFAPPLIED61 = "SFAPPLIED61";
		public static final String SFNOTAPPLIED61 = "SFNOTAPPLIED61";
	}
	public static class msrEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class destportopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
	public static class actionEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
	}
	public static class srcportopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
}
