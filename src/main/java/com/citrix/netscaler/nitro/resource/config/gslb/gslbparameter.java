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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbparameter_response extends base_response
{
	public gslbparameter gslbparameter;
}
/**
* Configuration for GSLB parameter resource.
*/

public class gslbparameter extends base_resource
{
	private Long ldnsentrytimeout;
	private Long rtttolerance;
	private String ldnsmask;
	private Long v6ldnsmasklen;
	private String[] ldnsprobeorder;
	private String dropldnsreq;

	//------- Read only Parameter ---------;

	private Long flags;

	/**
	* <pre>
	* The idle timeout in seconds of the learnt LDNS entry. If no new DNS request is made within this interval, then the LDNS entry is aged out.<br> Default value: 180<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_ldnsentrytimeout(long ldnsentrytimeout) throws Exception {
		this.ldnsentrytimeout = new Long(ldnsentrytimeout);
	}

	/**
	* <pre>
	* The idle timeout in seconds of the learnt LDNS entry. If no new DNS request is made within this interval, then the LDNS entry is aged out.<br> Default value: 180<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_ldnsentrytimeout(Long ldnsentrytimeout) throws Exception{
		this.ldnsentrytimeout = ldnsentrytimeout;
	}

	/**
	* <pre>
	* The idle timeout in seconds of the learnt LDNS entry. If no new DNS request is made within this interval, then the LDNS entry is aged out.<br> Default value: 180<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_ldnsentrytimeout() throws Exception {
		return this.ldnsentrytimeout;
	}

	/**
	* <pre>
	* The RTT Tolerance in milli seconds. When the RTT is calculated for an LDNS entry, and if the difference between the old RTT and the newly computed one is less than or equal to the RTT Tolerance value, the network metric table is not updated with the new value for this LDNS entry. This is done to prevent exchange of metric when there is small variation in RTT.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_rtttolerance(long rtttolerance) throws Exception {
		this.rtttolerance = new Long(rtttolerance);
	}

	/**
	* <pre>
	* The RTT Tolerance in milli seconds. When the RTT is calculated for an LDNS entry, and if the difference between the old RTT and the newly computed one is less than or equal to the RTT Tolerance value, the network metric table is not updated with the new value for this LDNS entry. This is done to prevent exchange of metric when there is small variation in RTT.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_rtttolerance(Long rtttolerance) throws Exception{
		this.rtttolerance = rtttolerance;
	}

	/**
	* <pre>
	* The RTT Tolerance in milli seconds. When the RTT is calculated for an LDNS entry, and if the difference between the old RTT and the newly computed one is less than or equal to the RTT Tolerance value, the network metric table is not updated with the new value for this LDNS entry. This is done to prevent exchange of metric when there is small variation in RTT.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_rtttolerance() throws Exception {
		return this.rtttolerance;
	}

	/**
	* <pre>
	* The Netmask. The Netmask specified here is used to store the LDNS IP addresses in the hash table and these are used in dynamic proximity-based GSLB.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ldnsmask(String ldnsmask) throws Exception{
		this.ldnsmask = ldnsmask;
	}

	/**
	* <pre>
	* The Netmask. The Netmask specified here is used to store the LDNS IP addresses in the hash table and these are used in dynamic proximity-based GSLB.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ldnsmask() throws Exception {
		return this.ldnsmask;
	}

	/**
	* <pre>
	* The V6 ldns mask prefix length.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6ldnsmasklen(long v6ldnsmasklen) throws Exception {
		this.v6ldnsmasklen = new Long(v6ldnsmasklen);
	}

	/**
	* <pre>
	* The V6 ldns mask prefix length.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6ldnsmasklen(Long v6ldnsmasklen) throws Exception{
		this.v6ldnsmasklen = v6ldnsmasklen;
	}

	/**
	* <pre>
	* The V6 ldns mask prefix length.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public Long get_v6ldnsmasklen() throws Exception {
		return this.v6ldnsmasklen;
	}

	/**
	* <pre>
	* The order in which monitors should be initiated to calculate RTT.<br> Possible values = PING, DNS, TCP
	* </pre>
	*/
	public void set_ldnsprobeorder(String[] ldnsprobeorder) throws Exception{
		this.ldnsprobeorder = ldnsprobeorder;
	}

	/**
	* <pre>
	* The order in which monitors should be initiated to calculate RTT.<br> Possible values = PING, DNS, TCP
	* </pre>
	*/
	public String[] get_ldnsprobeorder() throws Exception {
		return this.ldnsprobeorder;
	}

	/**
	* <pre>
	* Drop LDNS requests if no RTT info available.Effective state will be not be considered when services are down or saturated too.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dropldnsreq(String dropldnsreq) throws Exception{
		this.dropldnsreq = dropldnsreq;
	}

	/**
	* <pre>
	* Drop LDNS requests if no RTT info available.Effective state will be not be considered when services are down or saturated too.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dropldnsreq() throws Exception {
		return this.dropldnsreq;
	}

	/**
	* <pre>
	* State of the GSLB parameter.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		gslbparameter[] resources = new gslbparameter[1];
		gslbparameter_response result = (gslbparameter_response) service.get_payload_formatter().string_to_resource(gslbparameter_response.class, response);
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
		resources[0] = result.gslbparameter;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update gslbparameter.
	*/
	public static base_response update(nitro_service client, gslbparameter resource) throws Exception {
		gslbparameter updateresource = new gslbparameter();
		updateresource.ldnsentrytimeout = resource.ldnsentrytimeout;
		updateresource.rtttolerance = resource.rtttolerance;
		updateresource.ldnsmask = resource.ldnsmask;
		updateresource.v6ldnsmasklen = resource.v6ldnsmasklen;
		updateresource.ldnsprobeorder = resource.ldnsprobeorder;
		updateresource.dropldnsreq = resource.dropldnsreq;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of gslbparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, gslbparameter resource, String[] args) throws Exception{
		gslbparameter unsetresource = new gslbparameter();
		unsetresource.ldnsentrytimeout = resource.ldnsentrytimeout;
		unsetresource.rtttolerance = resource.rtttolerance;
		unsetresource.ldnsmask = resource.ldnsmask;
		unsetresource.v6ldnsmasklen = resource.v6ldnsmasklen;
		unsetresource.ldnsprobeorder = resource.ldnsprobeorder;
		unsetresource.dropldnsreq = resource.dropldnsreq;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the gslbparameter resources that are configured on netscaler.
	*/
	public static gslbparameter get(nitro_service service) throws Exception{
		gslbparameter obj = new gslbparameter();
		gslbparameter[] response = (gslbparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the gslbparameter resources that are configured on netscaler.
	*/
	public static gslbparameter get(nitro_service service,  options option) throws Exception{
		gslbparameter obj = new gslbparameter();
		gslbparameter[] response = (gslbparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class dropldnsreqEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ldnsprobeorderEnum {
		public static final String PING = "PING";
		public static final String DNS = "DNS";
		public static final String TCP = "TCP";
	}
}
