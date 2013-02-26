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

class nsacl_response extends base_response
{
	public nsacl_stats[] nsacl;
}
/**
* Statistics for ACL entry resource.
*/

public class nsacl_stats extends base_resource
{
	private String aclname;
	private Long acltotpktsbridged;
	private Long aclpktsbridgedrate;
	private Long acltotpktsdenied;
	private Long aclpktsdeniedrate;
	private Long acltotpktsallowed;
	private Long aclpktsallowedrate;
	private Long acltotpktsnat;
	private Long aclpktsnatrate;
	private Long acltothits;
	private Long aclhitsrate;
	private Long acltotmisses;
	private Long aclmissesrate;
	private Long aclperhits;
	private Long aclperhitsrate;

	/**
	* <pre>
	* The ACL.
	* </pre>
	*/
	public void set_aclname(String aclname) throws Exception{
		this.aclname = aclname;
	}

	/**
	* <pre>
	* The ACL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_aclname() throws Exception {
		return this.aclname;
	}

	/**
	* <pre>
	* Packets dropped because they match ACLs with processing mode set to DENY.
	* </pre>
	*/
	public Long get_acltotpktsdenied() throws Exception {
		return this.acltotpktsdenied;
	}

	/**
	* <pre>
	* Packets matching an ACL.
	* </pre>
	*/
	public Long get_acltothits() throws Exception {
		return this.acltothits;
	}

	/**
	* <pre>
	* Number of times the acl was hit
	* </pre>
	*/
	public Long get_aclperhits() throws Exception {
		return this.aclperhits;
	}

	/**
	* <pre>
	* Packets matching a NAT ACL, resulting in a NAT session.
	* </pre>
	*/
	public Long get_acltotpktsnat() throws Exception {
		return this.acltotpktsnat;
	}

	/**
	* <pre>
	* Number of times the acl was hit
	* </pre>
	*/
	public Long get_aclperhitsrate() throws Exception {
		return this.aclperhitsrate;
	}

	/**
	* <pre>
	* Packets dropped because they match ACLs with processing mode set to DENY.
	* </pre>
	*/
	public Long get_aclpktsdeniedrate() throws Exception {
		return this.aclpktsdeniedrate;
	}

	/**
	* <pre>
	* Packets matching an ACL.
	* </pre>
	*/
	public Long get_aclhitsrate() throws Exception {
		return this.aclhitsrate;
	}

	/**
	* <pre>
	* Packets matching ACLs with processing mode set to ALLOW. NetScaler processes these packets.
	* </pre>
	*/
	public Long get_aclpktsallowedrate() throws Exception {
		return this.aclpktsallowedrate;
	}

	/**
	* <pre>
	* Packets matching a NAT ACL, resulting in a NAT session.
	* </pre>
	*/
	public Long get_aclpktsnatrate() throws Exception {
		return this.aclpktsnatrate;
	}

	/**
	* <pre>
	* Packets not matching any ACL.
	* </pre>
	*/
	public Long get_acltotmisses() throws Exception {
		return this.acltotmisses;
	}

	/**
	* <pre>
	* Packets matching ACLs with processing mode set to ALLOW. NetScaler processes these packets.
	* </pre>
	*/
	public Long get_acltotpktsallowed() throws Exception {
		return this.acltotpktsallowed;
	}

	/**
	* <pre>
	* Packets matching a bridge ACL, which is in transparent mode and bypasses service processing.
	* </pre>
	*/
	public Long get_aclpktsbridgedrate() throws Exception {
		return this.aclpktsbridgedrate;
	}

	/**
	* <pre>
	* Packets matching a bridge ACL, which is in transparent mode and bypasses service processing.
	* </pre>
	*/
	public Long get_acltotpktsbridged() throws Exception {
		return this.acltotpktsbridged;
	}

	/**
	* <pre>
	* Packets not matching any ACL.
	* </pre>
	*/
	public Long get_aclmissesrate() throws Exception {
		return this.aclmissesrate;
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
	* Use this API to fetch the statistics of all nsacl_stats resources that are configured on netscaler.
	*/
	public static nsacl_stats[] get(nitro_service service) throws Exception{
		nsacl_stats obj = new nsacl_stats();
		nsacl_stats[] response = (nsacl_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all nsacl_stats resources that are configured on netscaler.
	*/
	public static nsacl_stats[] get(nitro_service service, options option) throws Exception{
		nsacl_stats obj = new nsacl_stats();
		nsacl_stats[] response = (nsacl_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of nsacl_stats resource of given name .
	*/
	public static nsacl_stats get(nitro_service service, String aclname) throws Exception{
		nsacl_stats obj = new nsacl_stats();
		obj.set_aclname(aclname);
		nsacl_stats response = (nsacl_stats) obj.stat_resource(service);
		return response;
	}

}
