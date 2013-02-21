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

package com.citrix.netscaler.nitro.resource.stat.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsacl6_response extends base_response
{
	public nsacl6_stats[] nsacl6;
}
/**
* Statistics for ACL6 entry resource.
*/

public class nsacl6_stats extends base_resource
{
	private String acl6name;
	private Long acl6totpktsbridged;
	private Long acl6pktsbridgedrate;
	private Long acl6totpktsdenied;
	private Long acl6pktsdeniedrate;
	private Long acl6totpktsallowed;
	private Long acl6pktsallowedrate;
	private Long acl6totpktsnat;
	private Long acl6pktsnatrate;
	private Long acl6tothits;
	private Long acl6hitsrate;
	private Long acl6totmisses;
	private Long acl6missesrate;
	private Long acl6perhits;
	private Long acl6perhitsrate;

	/**
	* <pre>
	* ACL6 Name.
	* </pre>
	*/
	public void set_acl6name(String acl6name) throws Exception{
		this.acl6name = acl6name;
	}

	/**
	* <pre>
	* ACL6 Name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_acl6name() throws Exception {
		return this.acl6name;
	}

	/**
	* <pre>
	* Packets matching a NAT ACL6, resulting in a NAT session.
	* </pre>
	*/
	public Long get_acl6pktsnatrate() throws Exception {
		return this.acl6pktsnatrate;
	}

	/**
	* <pre>
	* Packets not matching any IPv6 ACL.
	* </pre>
	*/
	public Long get_acl6missesrate() throws Exception {
		return this.acl6missesrate;
	}

	/**
	* <pre>
	* Packets not matching any IPv6 ACL.
	* </pre>
	*/
	public Long get_acl6totmisses() throws Exception {
		return this.acl6totmisses;
	}

	/**
	* <pre>
	* Packets matching a NAT ACL6, resulting in a NAT session.
	* </pre>
	*/
	public Long get_acl6totpktsnat() throws Exception {
		return this.acl6totpktsnat;
	}

	/**
	* <pre>
	* Number of times the acl6 was hit
	* </pre>
	*/
	public Long get_acl6perhitsrate() throws Exception {
		return this.acl6perhitsrate;
	}

	/**
	* <pre>
	* Number of times the acl6 was hit
	* </pre>
	*/
	public Long get_acl6perhits() throws Exception {
		return this.acl6perhits;
	}

	/**
	* <pre>
	* Packets matching an IPv6 ACL.
	* </pre>
	*/
	public Long get_acl6tothits() throws Exception {
		return this.acl6tothits;
	}

	/**
	* <pre>
	* Packets matching a bridge IPv6 ACL, which is in transparent mode and bypasses service processing.
	* </pre>
	*/
	public Long get_acl6pktsbridgedrate() throws Exception {
		return this.acl6pktsbridgedrate;
	}

	/**
	* <pre>
	* Packets matching IPv6 ACLs with processing mode set to ALLOW. NetScaler processes these packets.
	* </pre>
	*/
	public Long get_acl6pktsallowedrate() throws Exception {
		return this.acl6pktsallowedrate;
	}

	/**
	* <pre>
	* Packets matching a bridge IPv6 ACL, which is in transparent mode and bypasses service processing.
	* </pre>
	*/
	public Long get_acl6totpktsbridged() throws Exception {
		return this.acl6totpktsbridged;
	}

	/**
	* <pre>
	* Packets dropped because they match IPv6 ACLs with processing mode set to DENY.
	* </pre>
	*/
	public Long get_acl6totpktsdenied() throws Exception {
		return this.acl6totpktsdenied;
	}

	/**
	* <pre>
	* Packets matching IPv6 ACLs with processing mode set to ALLOW. NetScaler processes these packets.
	* </pre>
	*/
	public Long get_acl6totpktsallowed() throws Exception {
		return this.acl6totpktsallowed;
	}

	/**
	* <pre>
	* Packets dropped because they match IPv6 ACLs with processing mode set to DENY.
	* </pre>
	*/
	public Long get_acl6pktsdeniedrate() throws Exception {
		return this.acl6pktsdeniedrate;
	}

	/**
	* <pre>
	* Packets matching an IPv6 ACL.
	* </pre>
	*/
	public Long get_acl6hitsrate() throws Exception {
		return this.acl6hitsrate;
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
	* Use this API to fetch the statistics of all nsacl6_stats resources that are configured on netscaler.
	*/
	public static nsacl6_stats[] get(nitro_service service) throws Exception{
		nsacl6_stats obj = new nsacl6_stats();
		nsacl6_stats[] response = (nsacl6_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all nsacl6_stats resources that are configured on netscaler.
	*/
	public static nsacl6_stats[] get(nitro_service service, options option) throws Exception{
		nsacl6_stats obj = new nsacl6_stats();
		nsacl6_stats[] response = (nsacl6_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of nsacl6_stats resource of given name .
	*/
	public static nsacl6_stats get(nitro_service service, String acl6name) throws Exception{
		nsacl6_stats obj = new nsacl6_stats();
		obj.set_acl6name(acl6name);
		nsacl6_stats response = (nsacl6_stats) obj.stat_resource(service);
		return response;
	}

}
