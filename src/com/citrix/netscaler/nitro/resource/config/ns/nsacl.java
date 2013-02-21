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

class nsacl_response extends base_response
{
	public nsacl[] nsacl;
}
/**
* Configuration for ACL entry resource.
*/

public class nsacl extends base_resource
{
	private String aclname;
	private String aclaction;
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
	private Long ttl;
	private String srcmac;
	private String protocol;
	private Long protocolnumber;
	private Long vlan;
	private String Interface;
	private Boolean established;
	private Long icmptype;
	private Long icmpcode;
	private Long priority;
	private String state;
	private String logstate;
	private Long ratelimit;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private String kernelstate;
	private Long __count;

	/**
	* <pre>
	* The alphanumeric name of the ACL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_aclname(String aclname) throws Exception{
		this.aclname = aclname;
	}

	/**
	* <pre>
	* The alphanumeric name of the ACL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_aclname() throws Exception {
		return this.aclname;
	}

	/**
	* <pre>
	* The action associated with the ACL.<br> Possible values = BRIDGE, DENY, ALLOW
	* </pre>
	*/
	public void set_aclaction(String aclaction) throws Exception{
		this.aclaction = aclaction;
	}

	/**
	* <pre>
	* The action associated with the ACL.<br> Possible values = BRIDGE, DENY, ALLOW
	* </pre>
	*/
	public String get_aclaction() throws Exception {
		return this.aclaction;
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
	* The source Port (range).
	* </pre>
	*/
	public void set_srcport(boolean srcport) throws Exception {
		this.srcport = new Boolean(srcport);
	}

	/**
	* <pre>
	* The source Port (range).
	* </pre>
	*/
	public void set_srcport(Boolean srcport) throws Exception{
		this.srcport = srcport;
	}

	/**
	* <pre>
	* The source Port (range).
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
	* The source Port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public void set_srcportval(String srcportval) throws Exception{
		this.srcportval = srcportval;
	}

	/**
	* <pre>
	* The source Port (range).<br> Maximum length =  65535
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
	* The destination Port (range).
	* </pre>
	*/
	public void set_destport(boolean destport) throws Exception {
		this.destport = new Boolean(destport);
	}

	/**
	* <pre>
	* The destination Port (range).
	* </pre>
	*/
	public void set_destport(Boolean destport) throws Exception{
		this.destport = destport;
	}

	/**
	* <pre>
	* The destination Port (range).
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
	* The destination Port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public void set_destportval(String destportval) throws Exception{
		this.destportval = destportval;
	}

	/**
	* <pre>
	* The destination Port (range).<br> Maximum length =  65535
	* </pre>
	*/
	public String get_destportval() throws Exception {
		return this.destportval;
	}

	/**
	* <pre>
	* The time to expire this ACL(in seconds).<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* The time to expire this ACL(in seconds).<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* The time to expire this ACL(in seconds).<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
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
	* This argument indicates that the ACL should be used for TCP response traffic only.
	* </pre>
	*/
	public void set_established(boolean established) throws Exception {
		this.established = new Boolean(established);
	}

	/**
	* <pre>
	* This argument indicates that the ACL should be used for TCP response traffic only.
	* </pre>
	*/
	public void set_established(Boolean established) throws Exception{
		this.established = established;
	}

	/**
	* <pre>
	* This argument indicates that the ACL should be used for TCP response traffic only.
	* </pre>
	*/
	public Boolean get_established() throws Exception {
		return this.established;
	}

	/**
	* <pre>
	* The ICMP message type, valid values are 0-255.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmptype(long icmptype) throws Exception {
		this.icmptype = new Long(icmptype);
	}

	/**
	* <pre>
	* The ICMP message type, valid values are 0-255.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmptype(Long icmptype) throws Exception{
		this.icmptype = icmptype;
	}

	/**
	* <pre>
	* The ICMP message type, valid values are 0-255.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public Long get_icmptype() throws Exception {
		return this.icmptype;
	}

	/**
	* <pre>
	* The ICMP message code, valid values are 0-255.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmpcode(long icmpcode) throws Exception {
		this.icmpcode = new Long(icmpcode);
	}

	/**
	* <pre>
	* The ICMP message code, valid values are 0-255.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmpcode(Long icmpcode) throws Exception{
		this.icmpcode = icmpcode;
	}

	/**
	* <pre>
	* The ICMP message code, valid values are 0-255.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public Long get_icmpcode() throws Exception {
		return this.icmpcode;
	}

	/**
	* <pre>
	* The priority of the ACL.<br> Minimum value =  1<br> Maximum value =  100000
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the ACL.<br> Minimum value =  1<br> Maximum value =  100000
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the ACL.<br> Minimum value =  1<br> Maximum value =  100000
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The state of the ACL.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, REMOVED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the ACL.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, REMOVED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The logging state of the ACL.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_logstate(String logstate) throws Exception{
		this.logstate = logstate;
	}

	/**
	* <pre>
	* The logging state of the ACL.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_logstate() throws Exception {
		return this.logstate;
	}

	/**
	* <pre>
	* log message rate limit for acl rule.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  10000
	* </pre>
	*/
	public void set_ratelimit(long ratelimit) throws Exception {
		this.ratelimit = new Long(ratelimit);
	}

	/**
	* <pre>
	* log message rate limit for acl rule.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  10000
	* </pre>
	*/
	public void set_ratelimit(Long ratelimit) throws Exception{
		this.ratelimit = ratelimit;
	}

	/**
	* <pre>
	* log message rate limit for acl rule.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  10000
	* </pre>
	*/
	public Long get_ratelimit() throws Exception {
		return this.ratelimit;
	}

	/**
	* <pre>
	* The new name of the ACL rule.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the ACL rule.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The hits of this ACL.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The commit status of the ACL.<br> Default value: XACLNAPPLIED<br> Possible values = APPLIED, NOTAPPLIED, RE-APPLY, SFAPPLIED, SFNOTAPPLIED, SFAPPLIED61, SFNOTAPPLIED61
	* </pre>
	*/
	public String get_kernelstate() throws Exception {
		return this.kernelstate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsacl_response result = (nsacl_response) service.get_payload_formatter().string_to_resource(nsacl_response.class, response);
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
		return result.nsacl;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.aclname;
	}

	/**
	* Use this API to add nsacl.
	*/
	public static base_response add(nitro_service client, nsacl resource) throws Exception {
		nsacl addresource = new nsacl();
		addresource.aclname = resource.aclname;
		addresource.aclaction = resource.aclaction;
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
		addresource.ttl = resource.ttl;
		addresource.srcmac = resource.srcmac;
		addresource.protocol = resource.protocol;
		addresource.protocolnumber = resource.protocolnumber;
		addresource.vlan = resource.vlan;
		addresource.Interface = resource.Interface;
		addresource.established = resource.established;
		addresource.icmptype = resource.icmptype;
		addresource.icmpcode = resource.icmpcode;
		addresource.priority = resource.priority;
		addresource.state = resource.state;
		addresource.logstate = resource.logstate;
		addresource.ratelimit = resource.ratelimit;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nsacl resources.
	*/
	public static base_responses add(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl addresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nsacl();
				addresources[i].aclname = resources[i].aclname;
				addresources[i].aclaction = resources[i].aclaction;
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
				addresources[i].ttl = resources[i].ttl;
				addresources[i].srcmac = resources[i].srcmac;
				addresources[i].protocol = resources[i].protocol;
				addresources[i].protocolnumber = resources[i].protocolnumber;
				addresources[i].vlan = resources[i].vlan;
				addresources[i].Interface = resources[i].Interface;
				addresources[i].established = resources[i].established;
				addresources[i].icmptype = resources[i].icmptype;
				addresources[i].icmpcode = resources[i].icmpcode;
				addresources[i].priority = resources[i].priority;
				addresources[i].state = resources[i].state;
				addresources[i].logstate = resources[i].logstate;
				addresources[i].ratelimit = resources[i].ratelimit;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsacl of given name.
	*/
	public static base_response delete(nitro_service client, String aclname) throws Exception {
		nsacl deleteresource = new nsacl();
		deleteresource.aclname = aclname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsacl.
	*/
	public static base_response delete(nitro_service client, nsacl resource) throws Exception {
		nsacl deleteresource = new nsacl();
		deleteresource.aclname = resource.aclname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsacl resources of given names.
	*/
	public static base_responses delete(nitro_service client, String aclname[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nsacl deleteresources[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++){
				deleteresources[i] = new nsacl();
				deleteresources[i].aclname = aclname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsacl resources.
	*/
	public static base_responses delete(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl deleteresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nsacl();
				deleteresources[i].aclname = resources[i].aclname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nsacl.
	*/
	public static base_response update(nitro_service client, nsacl resource) throws Exception {
		nsacl updateresource = new nsacl();
		updateresource.aclname = resource.aclname;
		updateresource.aclaction = resource.aclaction;
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
		updateresource.srcmac = resource.srcmac;
		updateresource.protocol = resource.protocol;
		updateresource.protocolnumber = resource.protocolnumber;
		updateresource.icmptype = resource.icmptype;
		updateresource.icmpcode = resource.icmpcode;
		updateresource.vlan = resource.vlan;
		updateresource.Interface = resource.Interface;
		updateresource.priority = resource.priority;
		updateresource.logstate = resource.logstate;
		updateresource.ratelimit = resource.ratelimit;
		updateresource.established = resource.established;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nsacl resources.
	*/
	public static base_responses update(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl updateresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nsacl();
				updateresources[i].aclname = resources[i].aclname;
				updateresources[i].aclaction = resources[i].aclaction;
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
				updateresources[i].srcmac = resources[i].srcmac;
				updateresources[i].protocol = resources[i].protocol;
				updateresources[i].protocolnumber = resources[i].protocolnumber;
				updateresources[i].icmptype = resources[i].icmptype;
				updateresources[i].icmpcode = resources[i].icmpcode;
				updateresources[i].vlan = resources[i].vlan;
				updateresources[i].Interface = resources[i].Interface;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].logstate = resources[i].logstate;
				updateresources[i].ratelimit = resources[i].ratelimit;
				updateresources[i].established = resources[i].established;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsacl resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String aclname, String args[]) throws Exception {
		nsacl unsetresource = new nsacl();
		unsetresource.aclname = aclname;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of nsacl resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsacl resource, String[] args) throws Exception{
		nsacl unsetresource = new nsacl();
		unsetresource.aclname = resource.aclname;
		unsetresource.srcip = resource.srcip;
		unsetresource.srcport = resource.srcport;
		unsetresource.destip = resource.destip;
		unsetresource.destport = resource.destport;
		unsetresource.srcmac = resource.srcmac;
		unsetresource.protocol = resource.protocol;
		unsetresource.icmptype = resource.icmptype;
		unsetresource.icmpcode = resource.icmpcode;
		unsetresource.vlan = resource.vlan;
		unsetresource.Interface = resource.Interface;
		unsetresource.logstate = resource.logstate;
		unsetresource.ratelimit = resource.ratelimit;
		unsetresource.established = resource.established;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nsacl resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String aclname[], String args[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nsacl unsetresources[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++){
				unsetresources[i] = new nsacl();
				unsetresources[i].aclname = aclname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsacl resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nsacl resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl unsetresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nsacl();
				unsetresources[i].aclname = resources[i].aclname;
				unsetresources[i].srcip = resources[i].srcip;
				unsetresources[i].srcport = resources[i].srcport;
				unsetresources[i].destip = resources[i].destip;
				unsetresources[i].destport = resources[i].destport;
				unsetresources[i].srcmac = resources[i].srcmac;
				unsetresources[i].protocol = resources[i].protocol;
				unsetresources[i].icmptype = resources[i].icmptype;
				unsetresources[i].icmpcode = resources[i].icmpcode;
				unsetresources[i].vlan = resources[i].vlan;
				unsetresources[i].Interface = resources[i].Interface;
				unsetresources[i].logstate = resources[i].logstate;
				unsetresources[i].ratelimit = resources[i].ratelimit;
				unsetresources[i].established = resources[i].established;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable nsacl of given name.
	*/
	public static base_response enable(nitro_service client, String aclname) throws Exception {
		nsacl enableresource = new nsacl();
		enableresource.aclname = aclname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nsacl.
	*/
	public static base_response enable(nitro_service client, nsacl resource) throws Exception {
		nsacl enableresource = new nsacl();
		enableresource.aclname = resource.aclname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nsacl resources of given names.
	*/
	public static base_responses enable(nitro_service client, String aclname[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nsacl enableresources[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++){
				enableresources[i] = new nsacl();
				enableresources[i].aclname = aclname[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable nsacl resources.
	*/
	public static base_responses enable(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl enableresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new nsacl();
				enableresources[i].aclname = resources[i].aclname;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable nsacl of given name.
	*/
	public static base_response disable(nitro_service client, String aclname) throws Exception {
		nsacl disableresource = new nsacl();
		disableresource.aclname = aclname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nsacl.
	*/
	public static base_response disable(nitro_service client, nsacl resource) throws Exception {
		nsacl disableresource = new nsacl();
		disableresource.aclname = resource.aclname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nsacl resources of given names.
	*/
	public static base_responses disable(nitro_service client, String aclname[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nsacl disableresources[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++){
				disableresources[i] = new nsacl();
				disableresources[i].aclname = aclname[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable nsacl resources.
	*/
	public static base_responses disable(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl disableresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new nsacl();
				disableresources[i].aclname = resources[i].aclname;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a nsacl resource.
	*/
	public static base_response rename(nitro_service client, nsacl resource, String new_aclname) throws Exception {
		nsacl renameresource = new nsacl();
		renameresource.aclname = resource.aclname;
		return renameresource.rename_resource(client,new_aclname);
	}

	/**
	* Use this API to rename a nsacl resource.
	*/
	public static base_response rename(nitro_service client, String aclname, String new_aclname) throws Exception {
		nsacl renameresource = new nsacl();
		renameresource.aclname = aclname;
		return renameresource.rename_resource(client,new_aclname);
	}

	/**
	* Use this API to fetch all the nsacl resources that are configured on netscaler.
	*/
	public static nsacl[] get(nitro_service service) throws Exception{
		nsacl obj = new nsacl();
		nsacl[] response = (nsacl[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsacl resources that are configured on netscaler.
	*/
	public static nsacl[] get(nitro_service service, options option) throws Exception{
		nsacl obj = new nsacl();
		nsacl[] response = (nsacl[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nsacl resource of given name .
	*/
	public static nsacl get(nitro_service service, String aclname) throws Exception{
		nsacl obj = new nsacl();
		obj.set_aclname(aclname);
		nsacl response = (nsacl) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nsacl resources of given names .
	*/
	public static nsacl[] get(nitro_service service, String aclname[]) throws Exception{
		if (aclname !=null && aclname.length>0) {
			nsacl response[] = new nsacl[aclname.length];
			nsacl obj[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++) {
				obj[i] = new nsacl();
				obj[i].set_aclname(aclname[i]);
				response[i] = (nsacl) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nsacl resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsacl[] get_filtered(nitro_service service, String filter) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_filter(filter);
		nsacl[] response = (nsacl[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsacl resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsacl[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_filter(filter);
		nsacl[] response = (nsacl[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsacl resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_count(true);
		nsacl[] response = (nsacl[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsacl resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsacl[] response = (nsacl[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsacl resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsacl[] response = (nsacl[]) obj.getfiltered(service, option);
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
	public static class logstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class destportopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
	public static class aclactionEnum {
		public static final String BRIDGE = "BRIDGE";
		public static final String DENY = "DENY";
		public static final String ALLOW = "ALLOW";
	}
	public static class srcportopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
}
