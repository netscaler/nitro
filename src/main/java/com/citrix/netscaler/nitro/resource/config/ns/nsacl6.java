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

class nsacl6_response extends base_response
{
	public nsacl6[] nsacl6;
}
/**
* Configuration for ACL6 entry resource.
*/

public class nsacl6 extends base_resource
{
	private String acl6name;
	private String acl6action;
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
	private String aclaction;
	private String newname;

	//------- Read only Parameter ---------;

	private String kernelstate;
	private Long hits;
	private Long __count;

	/**
	* <pre>
	* Alphanumeric name of the ACL6.<br> Minimum length =  1
	* </pre>
	*/
	public void set_acl6name(String acl6name) throws Exception{
		this.acl6name = acl6name;
	}

	/**
	* <pre>
	* Alphanumeric name of the ACL6.<br> Minimum length =  1
	* </pre>
	*/
	public String get_acl6name() throws Exception {
		return this.acl6name;
	}

	/**
	* <pre>
	* Action associated with the ACL6.<br> Possible values = BRIDGE, DENY, ALLOW
	* </pre>
	*/
	public void set_acl6action(String acl6action) throws Exception{
		this.acl6action = acl6action;
	}

	/**
	* <pre>
	* Action associated with the ACL6.<br> Possible values = BRIDGE, DENY, ALLOW
	* </pre>
	*/
	public String get_acl6action() throws Exception {
		return this.acl6action;
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
	* Time to expire this ACL6 (in seconds).<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Time to expire this ACL6 (in seconds).<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Time to expire this ACL6 (in seconds).<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
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
	* This argument indicates that the ACL6 should be used for TCP response traffic only.
	* </pre>
	*/
	public void set_established(boolean established) throws Exception {
		this.established = new Boolean(established);
	}

	/**
	* <pre>
	* This argument indicates that the ACL6 should be used for TCP response traffic only.
	* </pre>
	*/
	public void set_established(Boolean established) throws Exception{
		this.established = established;
	}

	/**
	* <pre>
	* This argument indicates that the ACL6 should be used for TCP response traffic only.
	* </pre>
	*/
	public Boolean get_established() throws Exception {
		return this.established;
	}

	/**
	* <pre>
	* ICMPv6 message type.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmptype(long icmptype) throws Exception {
		this.icmptype = new Long(icmptype);
	}

	/**
	* <pre>
	* ICMPv6 message type.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmptype(Long icmptype) throws Exception{
		this.icmptype = icmptype;
	}

	/**
	* <pre>
	* ICMPv6 message type.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public Long get_icmptype() throws Exception {
		return this.icmptype;
	}

	/**
	* <pre>
	* ICMPv6 message code.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmpcode(long icmpcode) throws Exception {
		this.icmpcode = new Long(icmpcode);
	}

	/**
	* <pre>
	* ICMPv6 message code.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmpcode(Long icmpcode) throws Exception{
		this.icmpcode = icmpcode;
	}

	/**
	* <pre>
	* ICMPv6 message code.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public Long get_icmpcode() throws Exception {
		return this.icmpcode;
	}

	/**
	* <pre>
	* Priority of the ACL6. (Sequence of execution).<br> Minimum value =  1<br> Maximum value =  80000
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority of the ACL6. (Sequence of execution).<br> Minimum value =  1<br> Maximum value =  80000
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority of the ACL6. (Sequence of execution).<br> Minimum value =  1<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* State of the ACL6.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, REMOVED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* State of the ACL6.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, REMOVED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Action associated with the ACL6.<br> Possible values = BRIDGE, DENY, ALLOW
	* </pre>
	*/
	public void set_aclaction(String aclaction) throws Exception{
		this.aclaction = aclaction;
	}

	/**
	* <pre>
	* Action associated with the ACL6.<br> Possible values = BRIDGE, DENY, ALLOW
	* </pre>
	*/
	public String get_aclaction() throws Exception {
		return this.aclaction;
	}

	/**
	* <pre>
	* The new name of the ACL6 rule.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the ACL6 rule.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Commit status of the ACL6.<br> Default value: ACL6NAPPLIED<br> Possible values = APPLIED, NOTAPPLIED, RE-APPLY, SFAPPLIED, SFNOTAPPLIED
	* </pre>
	*/
	public String get_kernelstate() throws Exception {
		return this.kernelstate;
	}

	/**
	* <pre>
	* Number of hits of this ACL6.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsacl6_response result = (nsacl6_response) service.get_payload_formatter().string_to_resource(nsacl6_response.class, response);
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
		return result.nsacl6;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.acl6name;
	}

	/**
	* Use this API to add nsacl6.
	*/
	public static base_response add(nitro_service client, nsacl6 resource) throws Exception {
		nsacl6 addresource = new nsacl6();
		addresource.acl6name = resource.acl6name;
		addresource.acl6action = resource.acl6action;
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
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nsacl6 resources.
	*/
	public static base_responses add(nitro_service client, nsacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl6 addresources[] = new nsacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nsacl6();
				addresources[i].acl6name = resources[i].acl6name;
				addresources[i].acl6action = resources[i].acl6action;
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
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsacl6 of given name.
	*/
	public static base_response delete(nitro_service client, String acl6name) throws Exception {
		nsacl6 deleteresource = new nsacl6();
		deleteresource.acl6name = acl6name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsacl6.
	*/
	public static base_response delete(nitro_service client, nsacl6 resource) throws Exception {
		nsacl6 deleteresource = new nsacl6();
		deleteresource.acl6name = resource.acl6name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsacl6 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String acl6name[]) throws Exception {
		base_responses result = null;
		if (acl6name != null && acl6name.length > 0) {
			nsacl6 deleteresources[] = new nsacl6[acl6name.length];
			for (int i=0;i<acl6name.length;i++){
				deleteresources[i] = new nsacl6();
				deleteresources[i].acl6name = acl6name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsacl6 resources.
	*/
	public static base_responses delete(nitro_service client, nsacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl6 deleteresources[] = new nsacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nsacl6();
				deleteresources[i].acl6name = resources[i].acl6name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nsacl6.
	*/
	public static base_response update(nitro_service client, nsacl6 resource) throws Exception {
		nsacl6 updateresource = new nsacl6();
		updateresource.acl6name = resource.acl6name;
		updateresource.aclaction = resource.aclaction;
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
		updateresource.icmptype = resource.icmptype;
		updateresource.icmpcode = resource.icmpcode;
		updateresource.vlan = resource.vlan;
		updateresource.Interface = resource.Interface;
		updateresource.priority = resource.priority;
		updateresource.established = resource.established;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nsacl6 resources.
	*/
	public static base_responses update(nitro_service client, nsacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl6 updateresources[] = new nsacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nsacl6();
				updateresources[i].acl6name = resources[i].acl6name;
				updateresources[i].aclaction = resources[i].aclaction;
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
				updateresources[i].icmptype = resources[i].icmptype;
				updateresources[i].icmpcode = resources[i].icmpcode;
				updateresources[i].vlan = resources[i].vlan;
				updateresources[i].Interface = resources[i].Interface;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].established = resources[i].established;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsacl6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String acl6name, String args[]) throws Exception {
		nsacl6 unsetresource = new nsacl6();
		unsetresource.acl6name = acl6name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of nsacl6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsacl6 resource, String[] args) throws Exception{
		nsacl6 unsetresource = new nsacl6();
		unsetresource.acl6name = resource.acl6name;
		unsetresource.srcipv6 = resource.srcipv6;
		unsetresource.srcport = resource.srcport;
		unsetresource.destipv6 = resource.destipv6;
		unsetresource.destport = resource.destport;
		unsetresource.srcmac = resource.srcmac;
		unsetresource.protocol = resource.protocol;
		unsetresource.icmptype = resource.icmptype;
		unsetresource.icmpcode = resource.icmpcode;
		unsetresource.vlan = resource.vlan;
		unsetresource.Interface = resource.Interface;
		unsetresource.established = resource.established;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nsacl6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String acl6name[], String args[]) throws Exception {
		base_responses result = null;
		if (acl6name != null && acl6name.length > 0) {
			nsacl6 unsetresources[] = new nsacl6[acl6name.length];
			for (int i=0;i<acl6name.length;i++){
				unsetresources[i] = new nsacl6();
				unsetresources[i].acl6name = acl6name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsacl6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nsacl6 resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl6 unsetresources[] = new nsacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nsacl6();
				unsetresources[i].acl6name = resources[i].acl6name;
				unsetresources[i].srcipv6 = resources[i].srcipv6;
				unsetresources[i].srcport = resources[i].srcport;
				unsetresources[i].destipv6 = resources[i].destipv6;
				unsetresources[i].destport = resources[i].destport;
				unsetresources[i].srcmac = resources[i].srcmac;
				unsetresources[i].protocol = resources[i].protocol;
				unsetresources[i].icmptype = resources[i].icmptype;
				unsetresources[i].icmpcode = resources[i].icmpcode;
				unsetresources[i].vlan = resources[i].vlan;
				unsetresources[i].Interface = resources[i].Interface;
				unsetresources[i].established = resources[i].established;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable nsacl6 of given name.
	*/
	public static base_response enable(nitro_service client, String acl6name) throws Exception {
		nsacl6 enableresource = new nsacl6();
		enableresource.acl6name = acl6name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nsacl6.
	*/
	public static base_response enable(nitro_service client, nsacl6 resource) throws Exception {
		nsacl6 enableresource = new nsacl6();
		enableresource.acl6name = resource.acl6name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nsacl6 resources of given names.
	*/
	public static base_responses enable(nitro_service client, String acl6name[]) throws Exception {
		base_responses result = null;
		if (acl6name != null && acl6name.length > 0) {
			nsacl6 enableresources[] = new nsacl6[acl6name.length];
			for (int i=0;i<acl6name.length;i++){
				enableresources[i] = new nsacl6();
				enableresources[i].acl6name = acl6name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable nsacl6 resources.
	*/
	public static base_responses enable(nitro_service client, nsacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl6 enableresources[] = new nsacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new nsacl6();
				enableresources[i].acl6name = resources[i].acl6name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable nsacl6 of given name.
	*/
	public static base_response disable(nitro_service client, String acl6name) throws Exception {
		nsacl6 disableresource = new nsacl6();
		disableresource.acl6name = acl6name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nsacl6.
	*/
	public static base_response disable(nitro_service client, nsacl6 resource) throws Exception {
		nsacl6 disableresource = new nsacl6();
		disableresource.acl6name = resource.acl6name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nsacl6 resources of given names.
	*/
	public static base_responses disable(nitro_service client, String acl6name[]) throws Exception {
		base_responses result = null;
		if (acl6name != null && acl6name.length > 0) {
			nsacl6 disableresources[] = new nsacl6[acl6name.length];
			for (int i=0;i<acl6name.length;i++){
				disableresources[i] = new nsacl6();
				disableresources[i].acl6name = acl6name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable nsacl6 resources.
	*/
	public static base_responses disable(nitro_service client, nsacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl6 disableresources[] = new nsacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new nsacl6();
				disableresources[i].acl6name = resources[i].acl6name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a nsacl6 resource.
	*/
	public static base_response rename(nitro_service client, nsacl6 resource, String new_acl6name) throws Exception {
		nsacl6 renameresource = new nsacl6();
		renameresource.acl6name = resource.acl6name;
		return renameresource.rename_resource(client,new_acl6name);
	}

	/**
	* Use this API to rename a nsacl6 resource.
	*/
	public static base_response rename(nitro_service client, String acl6name, String new_acl6name) throws Exception {
		nsacl6 renameresource = new nsacl6();
		renameresource.acl6name = acl6name;
		return renameresource.rename_resource(client,new_acl6name);
	}

	/**
	* Use this API to fetch all the nsacl6 resources that are configured on netscaler.
	*/
	public static nsacl6[] get(nitro_service service) throws Exception{
		nsacl6 obj = new nsacl6();
		nsacl6[] response = (nsacl6[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsacl6 resources that are configured on netscaler.
	*/
	public static nsacl6[] get(nitro_service service, options option) throws Exception{
		nsacl6 obj = new nsacl6();
		nsacl6[] response = (nsacl6[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nsacl6 resource of given name .
	*/
	public static nsacl6 get(nitro_service service, String acl6name) throws Exception{
		nsacl6 obj = new nsacl6();
		obj.set_acl6name(acl6name);
		nsacl6 response = (nsacl6) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nsacl6 resources of given names .
	*/
	public static nsacl6[] get(nitro_service service, String acl6name[]) throws Exception{
		if (acl6name !=null && acl6name.length>0) {
			nsacl6 response[] = new nsacl6[acl6name.length];
			nsacl6 obj[] = new nsacl6[acl6name.length];
			for (int i=0;i<acl6name.length;i++) {
				obj[i] = new nsacl6();
				obj[i].set_acl6name(acl6name[i]);
				response[i] = (nsacl6) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nsacl6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsacl6[] get_filtered(nitro_service service, String filter) throws Exception{
		nsacl6 obj = new nsacl6();
		options option = new options();
		option.set_filter(filter);
		nsacl6[] response = (nsacl6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsacl6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsacl6[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsacl6 obj = new nsacl6();
		options option = new options();
		option.set_filter(filter);
		nsacl6[] response = (nsacl6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsacl6 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsacl6 obj = new nsacl6();
		options option = new options();
		option.set_count(true);
		nsacl6[] response = (nsacl6[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsacl6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsacl6 obj = new nsacl6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsacl6[] response = (nsacl6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsacl6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsacl6 obj = new nsacl6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsacl6[] response = (nsacl6[]) obj.getfiltered(service, option);
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
	public static class acl6actionEnum {
		public static final String BRIDGE = "BRIDGE";
		public static final String DENY = "DENY";
		public static final String ALLOW = "ALLOW";
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
}
