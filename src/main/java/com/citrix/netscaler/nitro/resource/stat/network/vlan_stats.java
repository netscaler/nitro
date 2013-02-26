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

package com.citrix.netscaler.nitro.resource.stat.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vlan_response extends base_response
{
	public vlan_stats[] vlan;
}
/**
* Statistics for "VLAN" resource.
*/

public class vlan_stats extends base_resource
{
	private Long id;
	private Long vlantotrxpkts;
	private Long vlanrxpktsrate;
	private Long vlantotrxbytes;
	private Long vlanrxbytesrate;
	private Long vlantottxpkts;
	private Long vlantxpktsrate;
	private Long vlantottxbytes;
	private Long vlantxbytesrate;
	private Long vlantotdroppedpkts;
	private Long vlantotbroadcastpkts;

	/**
	* <pre>
	* An integer specifying the VLAN identification number (VID). Possible values: 1 through 4094.
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* An integer specifying the VLAN identification number (VID). Possible values: 1 through 4094.
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* An integer specifying the VLAN identification number (VID). Possible values: 1 through 4094.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* Bytes of data received on the VLAN.
	* </pre>
	*/
	public Long get_vlanrxbytesrate() throws Exception {
		return this.vlanrxbytesrate;
	}

	/**
	* <pre>
	* Packets transmitted on the VLAN.
	* </pre>
	*/
	public Long get_vlantottxpkts() throws Exception {
		return this.vlantottxpkts;
	}

	/**
	* <pre>
	* Inbound packets dropped by the VLAN upon reception.
	* </pre>
	*/
	public Long get_vlantotdroppedpkts() throws Exception {
		return this.vlantotdroppedpkts;
	}

	/**
	* <pre>
	* Packets received on the VLAN.
	* </pre>
	*/
	public Long get_vlanrxpktsrate() throws Exception {
		return this.vlanrxpktsrate;
	}

	/**
	* <pre>
	* Packets received on the VLAN.
	* </pre>
	*/
	public Long get_vlantotrxpkts() throws Exception {
		return this.vlantotrxpkts;
	}

	/**
	* <pre>
	* Packets transmitted on the VLAN.
	* </pre>
	*/
	public Long get_vlantxpktsrate() throws Exception {
		return this.vlantxpktsrate;
	}

	/**
	* <pre>
	* Broadcast packets sent and received on the VLAN.
	* </pre>
	*/
	public Long get_vlantotbroadcastpkts() throws Exception {
		return this.vlantotbroadcastpkts;
	}

	/**
	* <pre>
	* Bytes of data transmitted on the VLAN.
	* </pre>
	*/
	public Long get_vlantxbytesrate() throws Exception {
		return this.vlantxbytesrate;
	}

	/**
	* <pre>
	* Bytes of data received on the VLAN.
	* </pre>
	*/
	public Long get_vlantotrxbytes() throws Exception {
		return this.vlantotrxbytes;
	}

	/**
	* <pre>
	* Bytes of data transmitted on the VLAN.
	* </pre>
	*/
	public Long get_vlantottxbytes() throws Exception {
		return this.vlantottxbytes;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vlan_response result = (vlan_response) service.get_payload_formatter().string_to_resource(vlan_response.class, response);
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
		return result.vlan;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch the statistics of all vlan_stats resources that are configured on netscaler.
	*/
	public static vlan_stats[] get(nitro_service service) throws Exception{
		vlan_stats obj = new vlan_stats();
		vlan_stats[] response = (vlan_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all vlan_stats resources that are configured on netscaler.
	*/
	public static vlan_stats[] get(nitro_service service, options option) throws Exception{
		vlan_stats obj = new vlan_stats();
		vlan_stats[] response = (vlan_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of vlan_stats resource of given name .
	*/
	public static vlan_stats get(nitro_service service, Long id) throws Exception{
		vlan_stats obj = new vlan_stats();
		obj.set_id(id);
		vlan_stats response = (vlan_stats) obj.stat_resource(service);
		return response;
	}

}
