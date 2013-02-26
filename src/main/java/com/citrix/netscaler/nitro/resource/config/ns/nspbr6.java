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

class nspbr6_response extends base_response
{
	public nspbr6[] nspbr6;
}
/**
* Configuration for PBR6 entry resource.
*/

public class nspbr6 extends base_resource
{
	private String name;
	private String action;
	private Boolean srcipv6;
	private String srcipop;
	private String srcipv6val;
	private Boolean srcport;
	private String srcportop;
	private String srcportval;
	private Boolean destipv6;
	private String destipop;
	private String destipv6val;
	private Boolean destport;
	private String destportop;
	private String destportval;
	private String srcmac;
	private String protocol;
	private Long protocolnumber;
	private Long vlan;
	private String Interface;
	private Long priority;
	private String state;
	private String msr;
	private String monitor;
	private Boolean nexthop;
	private String nexthopval;
	private Long nexthopvlan;
	private Boolean detail;

	//------- Read only Parameter ---------;

	private String kernelstate;
	private Long hits;
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
	* Alphanumeric name of the PBR6.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Alphanumeric name of the PBR6.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Action associated with the PBR6.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Action associated with the PBR6.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Source IPv6 address (range).
	* </pre>
	*/
	public void set_srcipv6(boolean srcipv6) throws Exception {
		this.srcipv6 = new Boolean(srcipv6);
	}

	/**
	* <pre>
	* Source IPv6 address (range).
	* </pre>
	*/
	public void set_srcipv6(Boolean srcipv6) throws Exception{
		this.srcipv6 = srcipv6;
	}

	/**
	* <pre>
	* Source IPv6 address (range).
	* </pre>
	*/
	public Boolean get_srcipv6() throws Exception {
		return this.srcipv6;
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
	* Source IPv6 address (range).
	* </pre>
	*/
	public void set_srcipv6val(String srcipv6val) throws Exception{
		this.srcipv6val = srcipv6val;
	}

	/**
	* <pre>
	* Source IPv6 address (range).
	* </pre>
	*/
	public String get_srcipv6val() throws Exception {
		return this.srcipv6val;
	}

	/**
	* <pre>
	* Source port (range).
	* </pre>
	*/
	public void set_srcport(boolean srcport) throws Exception {
		this.srcport = new Boolean(srcport);
	}

	/**
	* <pre>
	* Source port (range).
	* </pre>
	*/
	public void set_srcport(Boolean srcport) throws Exception{
		this.srcport = srcport;
	}

	/**
	* <pre>
	* Source port (range).
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
	* Source port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public void set_srcportval(String srcportval) throws Exception{
		this.srcportval = srcportval;
	}

	/**
	* <pre>
	* Source port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public String get_srcportval() throws Exception {
		return this.srcportval;
	}

	/**
	* <pre>
	* Destination IPv6 address (range).
	* </pre>
	*/
	public void set_destipv6(boolean destipv6) throws Exception {
		this.destipv6 = new Boolean(destipv6);
	}

	/**
	* <pre>
	* Destination IPv6 address (range).
	* </pre>
	*/
	public void set_destipv6(Boolean destipv6) throws Exception{
		this.destipv6 = destipv6;
	}

	/**
	* <pre>
	* Destination IPv6 address (range).
	* </pre>
	*/
	public Boolean get_destipv6() throws Exception {
		return this.destipv6;
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
	* Destination IPv6 address (range).
	* </pre>
	*/
	public void set_destipv6val(String destipv6val) throws Exception{
		this.destipv6val = destipv6val;
	}

	/**
	* <pre>
	* Destination IPv6 address (range).
	* </pre>
	*/
	public String get_destipv6val() throws Exception {
		return this.destipv6val;
	}

	/**
	* <pre>
	* Destination port (range).
	* </pre>
	*/
	public void set_destport(boolean destport) throws Exception {
		this.destport = new Boolean(destport);
	}

	/**
	* <pre>
	* Destination port (range).
	* </pre>
	*/
	public void set_destport(Boolean destport) throws Exception{
		this.destport = destport;
	}

	/**
	* <pre>
	* Destination port (range).
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
	* Destination port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public void set_destportval(String destportval) throws Exception{
		this.destportval = destportval;
	}

	/**
	* <pre>
	* Destination port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public String get_destportval() throws Exception {
		return this.destportval;
	}

	/**
	* <pre>
	* Source MAC address.
	* </pre>
	*/
	public void set_srcmac(String srcmac) throws Exception{
		this.srcmac = srcmac;
	}

	/**
	* <pre>
	* Source MAC address.
	* </pre>
	*/
	public String get_srcmac() throws Exception {
		return this.srcmac;
	}

	/**
	* <pre>
	* IPv6 protocol name.<br> Possible values = ICMPV6, TCP, UDP
	* </pre>
	*/
	public void set_protocol(String protocol) throws Exception{
		this.protocol = protocol;
	}

	/**
	* <pre>
	* IPv6 protocol name.<br> Possible values = ICMPV6, TCP, UDP
	* </pre>
	*/
	public String get_protocol() throws Exception {
		return this.protocol;
	}

	/**
	* <pre>
	* IPv6 protocol number (decimal).<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_protocolnumber(long protocolnumber) throws Exception {
		this.protocolnumber = new Long(protocolnumber);
	}

	/**
	* <pre>
	* IPv6 protocol number (decimal).<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_protocolnumber(Long protocolnumber) throws Exception{
		this.protocolnumber = protocolnumber;
	}

	/**
	* <pre>
	* IPv6 protocol number (decimal).<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_protocolnumber() throws Exception {
		return this.protocolnumber;
	}

	/**
	* <pre>
	* VLAN number.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* VLAN number.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* VLAN number.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* Physical interface name.
	* </pre>
	*/
	public void set_Interface(String Interface) throws Exception{
		this.Interface = Interface;
	}

	/**
	* <pre>
	* Physical interface name.
	* </pre>
	*/
	public String get_Interface() throws Exception {
		return this.Interface;
	}

	/**
	* <pre>
	* Priority of the PBR6. (Sequence of execution).<br> Minimum value =  1<br> Maximum value =  80000
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority of the PBR6. (Sequence of execution).<br> Minimum value =  1<br> Maximum value =  80000
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority of the PBR6. (Sequence of execution).<br> Minimum value =  1<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* State of the PBR6.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, REMOVED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* State of the PBR6.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, REMOVED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
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
	* The Next Hop IPv6 address.
	* </pre>
	*/
	public void set_nexthop(boolean nexthop) throws Exception {
		this.nexthop = new Boolean(nexthop);
	}

	/**
	* <pre>
	* The Next Hop IPv6 address.
	* </pre>
	*/
	public void set_nexthop(Boolean nexthop) throws Exception{
		this.nexthop = nexthop;
	}

	/**
	* <pre>
	* The Next Hop IPv6 address.
	* </pre>
	*/
	public Boolean get_nexthop() throws Exception {
		return this.nexthop;
	}

	/**
	* <pre>
	* The Next Hop IPv6 address.
	* </pre>
	*/
	public void set_nexthopval(String nexthopval) throws Exception{
		this.nexthopval = nexthopval;
	}

	/**
	* <pre>
	* The Next Hop IPv6 address.
	* </pre>
	*/
	public String get_nexthopval() throws Exception {
		return this.nexthopval;
	}

	/**
	* <pre>
	* VLAN number to be used for link local nexthop .<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_nexthopvlan(long nexthopvlan) throws Exception {
		this.nexthopvlan = new Long(nexthopvlan);
	}

	/**
	* <pre>
	* VLAN number to be used for link local nexthop .<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_nexthopvlan(Long nexthopvlan) throws Exception{
		this.nexthopvlan = nexthopvlan;
	}

	/**
	* <pre>
	* VLAN number to be used for link local nexthop .<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_nexthopvlan() throws Exception {
		return this.nexthopvlan;
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
	* Commit status of the PBR6.<br> Default value: ACL6NAPPLIED<br> Possible values = APPLIED, NOTAPPLIED, RE-APPLY, SFAPPLIED, SFNOTAPPLIED
	* </pre>
	*/
	public String get_kernelstate() throws Exception {
		return this.kernelstate;
	}

	/**
	* <pre>
	* Number of hits of this PBR6.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
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
		nspbr6_response result = (nspbr6_response) service.get_payload_formatter().string_to_resource(nspbr6_response.class, response);
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
		return result.nspbr6;
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
	* Use this API to add nspbr6.
	*/
	public static base_response add(nitro_service client, nspbr6 resource) throws Exception {
		nspbr6 addresource = new nspbr6();
		addresource.name = resource.name;
		addresource.action = resource.action;
		addresource.srcipv6 = resource.srcipv6;
		addresource.srcipop = resource.srcipop;
		addresource.srcipv6val = resource.srcipv6val;
		addresource.srcport = resource.srcport;
		addresource.srcportop = resource.srcportop;
		addresource.srcportval = resource.srcportval;
		addresource.destipv6 = resource.destipv6;
		addresource.destipop = resource.destipop;
		addresource.destipv6val = resource.destipv6val;
		addresource.destport = resource.destport;
		addresource.destportop = resource.destportop;
		addresource.destportval = resource.destportval;
		addresource.srcmac = resource.srcmac;
		addresource.protocol = resource.protocol;
		addresource.protocolnumber = resource.protocolnumber;
		addresource.vlan = resource.vlan;
		addresource.Interface = resource.Interface;
		addresource.priority = resource.priority;
		addresource.state = resource.state;
		addresource.msr = resource.msr;
		addresource.monitor = resource.monitor;
		addresource.nexthop = resource.nexthop;
		addresource.nexthopval = resource.nexthopval;
		addresource.nexthopvlan = resource.nexthopvlan;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nspbr6 resources.
	*/
	public static base_responses add(nitro_service client, nspbr6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 addresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nspbr6();
				addresources[i].name = resources[i].name;
				addresources[i].action = resources[i].action;
				addresources[i].srcipv6 = resources[i].srcipv6;
				addresources[i].srcipop = resources[i].srcipop;
				addresources[i].srcipv6val = resources[i].srcipv6val;
				addresources[i].srcport = resources[i].srcport;
				addresources[i].srcportop = resources[i].srcportop;
				addresources[i].srcportval = resources[i].srcportval;
				addresources[i].destipv6 = resources[i].destipv6;
				addresources[i].destipop = resources[i].destipop;
				addresources[i].destipv6val = resources[i].destipv6val;
				addresources[i].destport = resources[i].destport;
				addresources[i].destportop = resources[i].destportop;
				addresources[i].destportval = resources[i].destportval;
				addresources[i].srcmac = resources[i].srcmac;
				addresources[i].protocol = resources[i].protocol;
				addresources[i].protocolnumber = resources[i].protocolnumber;
				addresources[i].vlan = resources[i].vlan;
				addresources[i].Interface = resources[i].Interface;
				addresources[i].priority = resources[i].priority;
				addresources[i].state = resources[i].state;
				addresources[i].msr = resources[i].msr;
				addresources[i].monitor = resources[i].monitor;
				addresources[i].nexthop = resources[i].nexthop;
				addresources[i].nexthopval = resources[i].nexthopval;
				addresources[i].nexthopvlan = resources[i].nexthopvlan;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to renumber nspbr6.
	*/
	public static base_response renumber(nitro_service client) throws Exception {
		nspbr6 renumberresource = new nspbr6();
		return renumberresource.perform_operation(client,"renumber");
	}

	/**
	* Use this API to renumber nspbr6 resources.
	*/
	public static base_responses renumber(nitro_service client, nspbr6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 renumberresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				renumberresources[i] = new nspbr6();
			}
			result = perform_operation_bulk_request(client, renumberresources,"renumber");
		}
		return result;
	}

	/**
	* Use this API to delete nspbr6 of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		nspbr6 deleteresource = new nspbr6();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nspbr6.
	*/
	public static base_response delete(nitro_service client, nspbr6 resource) throws Exception {
		nspbr6 deleteresource = new nspbr6();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nspbr6 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nspbr6 deleteresources[] = new nspbr6[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new nspbr6();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nspbr6 resources.
	*/
	public static base_responses delete(nitro_service client, nspbr6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 deleteresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nspbr6();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nspbr6.
	*/
	public static base_response update(nitro_service client, nspbr6 resource) throws Exception {
		nspbr6 updateresource = new nspbr6();
		updateresource.name = resource.name;
		updateresource.action = resource.action;
		updateresource.srcipv6 = resource.srcipv6;
		updateresource.srcipop = resource.srcipop;
		updateresource.srcipv6val = resource.srcipv6val;
		updateresource.srcport = resource.srcport;
		updateresource.srcportop = resource.srcportop;
		updateresource.srcportval = resource.srcportval;
		updateresource.destipv6 = resource.destipv6;
		updateresource.destipop = resource.destipop;
		updateresource.destipv6val = resource.destipv6val;
		updateresource.destport = resource.destport;
		updateresource.destportop = resource.destportop;
		updateresource.destportval = resource.destportval;
		updateresource.srcmac = resource.srcmac;
		updateresource.protocol = resource.protocol;
		updateresource.protocolnumber = resource.protocolnumber;
		updateresource.vlan = resource.vlan;
		updateresource.Interface = resource.Interface;
		updateresource.priority = resource.priority;
		updateresource.msr = resource.msr;
		updateresource.monitor = resource.monitor;
		updateresource.nexthop = resource.nexthop;
		updateresource.nexthopval = resource.nexthopval;
		updateresource.nexthopvlan = resource.nexthopvlan;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nspbr6 resources.
	*/
	public static base_responses update(nitro_service client, nspbr6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 updateresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nspbr6();
				updateresources[i].name = resources[i].name;
				updateresources[i].action = resources[i].action;
				updateresources[i].srcipv6 = resources[i].srcipv6;
				updateresources[i].srcipop = resources[i].srcipop;
				updateresources[i].srcipv6val = resources[i].srcipv6val;
				updateresources[i].srcport = resources[i].srcport;
				updateresources[i].srcportop = resources[i].srcportop;
				updateresources[i].srcportval = resources[i].srcportval;
				updateresources[i].destipv6 = resources[i].destipv6;
				updateresources[i].destipop = resources[i].destipop;
				updateresources[i].destipv6val = resources[i].destipv6val;
				updateresources[i].destport = resources[i].destport;
				updateresources[i].destportop = resources[i].destportop;
				updateresources[i].destportval = resources[i].destportval;
				updateresources[i].srcmac = resources[i].srcmac;
				updateresources[i].protocol = resources[i].protocol;
				updateresources[i].protocolnumber = resources[i].protocolnumber;
				updateresources[i].vlan = resources[i].vlan;
				updateresources[i].Interface = resources[i].Interface;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].msr = resources[i].msr;
				updateresources[i].monitor = resources[i].monitor;
				updateresources[i].nexthop = resources[i].nexthop;
				updateresources[i].nexthopval = resources[i].nexthopval;
				updateresources[i].nexthopvlan = resources[i].nexthopvlan;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nspbr6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		nspbr6 unsetresource = new nspbr6();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of nspbr6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nspbr6 resource, String[] args) throws Exception{
		nspbr6 unsetresource = new nspbr6();
		unsetresource.name = resource.name;
		unsetresource.srcipv6 = resource.srcipv6;
		unsetresource.srcport = resource.srcport;
		unsetresource.destipv6 = resource.destipv6;
		unsetresource.destport = resource.destport;
		unsetresource.srcmac = resource.srcmac;
		unsetresource.protocol = resource.protocol;
		unsetresource.Interface = resource.Interface;
		unsetresource.vlan = resource.vlan;
		unsetresource.msr = resource.msr;
		unsetresource.monitor = resource.monitor;
		unsetresource.nexthop = resource.nexthop;
		unsetresource.nexthopvlan = resource.nexthopvlan;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nspbr6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nspbr6 unsetresources[] = new nspbr6[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new nspbr6();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nspbr6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nspbr6 resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 unsetresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nspbr6();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].srcipv6 = resources[i].srcipv6;
				unsetresources[i].srcport = resources[i].srcport;
				unsetresources[i].destipv6 = resources[i].destipv6;
				unsetresources[i].destport = resources[i].destport;
				unsetresources[i].srcmac = resources[i].srcmac;
				unsetresources[i].protocol = resources[i].protocol;
				unsetresources[i].Interface = resources[i].Interface;
				unsetresources[i].vlan = resources[i].vlan;
				unsetresources[i].msr = resources[i].msr;
				unsetresources[i].monitor = resources[i].monitor;
				unsetresources[i].nexthop = resources[i].nexthop;
				unsetresources[i].nexthopvlan = resources[i].nexthopvlan;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable nspbr6 of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		nspbr6 enableresource = new nspbr6();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nspbr6.
	*/
	public static base_response enable(nitro_service client, nspbr6 resource) throws Exception {
		nspbr6 enableresource = new nspbr6();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nspbr6 resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nspbr6 enableresources[] = new nspbr6[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new nspbr6();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable nspbr6 resources.
	*/
	public static base_responses enable(nitro_service client, nspbr6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 enableresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new nspbr6();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable nspbr6 of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		nspbr6 disableresource = new nspbr6();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nspbr6.
	*/
	public static base_response disable(nitro_service client, nspbr6 resource) throws Exception {
		nspbr6 disableresource = new nspbr6();
		disableresource.name = resource.name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nspbr6 resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nspbr6 disableresources[] = new nspbr6[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new nspbr6();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable nspbr6 resources.
	*/
	public static base_responses disable(nitro_service client, nspbr6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 disableresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new nspbr6();
				disableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to clear nspbr6.
	*/
	public static base_response clear(nitro_service client) throws Exception {
		nspbr6 clearresource = new nspbr6();
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear nspbr6 resources.
	*/
	public static base_responses clear(nitro_service client, nspbr6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 clearresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new nspbr6();
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to apply nspbr6.
	*/
	public static base_response apply(nitro_service client) throws Exception {
		nspbr6 applyresource = new nspbr6();
		return applyresource.perform_operation(client,"apply");
	}

	/**
	* Use this API to apply nspbr6 resources.
	*/
	public static base_responses apply(nitro_service client, nspbr6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nspbr6 applyresources[] = new nspbr6[resources.length];
			for (int i=0;i<resources.length;i++){
				applyresources[i] = new nspbr6();
			}
			result = perform_operation_bulk_request(client, applyresources,"apply");
		}
		return result;
	}

	/**
	* Use this API to fetch all the nspbr6 resources that are configured on netscaler.
	*/
	public static nspbr6[] get(nitro_service service) throws Exception{
		nspbr6 obj = new nspbr6();
		nspbr6[] response = (nspbr6[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nspbr6 resources that are configured on netscaler.
	*/
	public static nspbr6[] get(nitro_service service, options option) throws Exception{
		nspbr6 obj = new nspbr6();
		nspbr6[] response = (nspbr6[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the nspbr6 resources that are configured on netscaler.
	* This uses nspbr6_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static nspbr6[] get(nitro_service service, nspbr6_args args) throws Exception{
		nspbr6 obj = new nspbr6();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		nspbr6[] response = (nspbr6[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch nspbr6 resource of given name .
	*/
	public static nspbr6 get(nitro_service service, String name) throws Exception{
		nspbr6 obj = new nspbr6();
		obj.set_name(name);
		nspbr6 response = (nspbr6) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nspbr6 resources of given names .
	*/
	public static nspbr6[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nspbr6 response[] = new nspbr6[name.length];
			nspbr6 obj[] = new nspbr6[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nspbr6();
				obj[i].set_name(name[i]);
				response[i] = (nspbr6) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nspbr6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nspbr6[] get_filtered(nitro_service service, String filter) throws Exception{
		nspbr6 obj = new nspbr6();
		options option = new options();
		option.set_filter(filter);
		nspbr6[] response = (nspbr6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nspbr6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nspbr6[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nspbr6 obj = new nspbr6();
		options option = new options();
		option.set_filter(filter);
		nspbr6[] response = (nspbr6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nspbr6 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nspbr6 obj = new nspbr6();
		options option = new options();
		option.set_count(true);
		nspbr6[] response = (nspbr6[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nspbr6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nspbr6 obj = new nspbr6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nspbr6[] response = (nspbr6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nspbr6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nspbr6 obj = new nspbr6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nspbr6[] response = (nspbr6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class protocolEnum {
		public static final String ICMPV6 = "ICMPV6";
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
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
	}
	public static class msrEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class srcportopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
	public static class srcipopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
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
}
