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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbsipparameters_response extends base_response
{
	public lbsipparameters lbsipparameters;
}
/**
* Configuration for SIP parameters resource.
*/

public class lbsipparameters extends base_resource
{
	private Integer rnatsrcport;
	private Integer rnatdstport;
	private Integer retrydur;
	private String addrportvip;
	private Long sip503ratethreshold;

	/**
	* <pre>
	* Port number with which to match the source port in server-initiated SIP traffic. The rport parameter is added, without a value, to SIP packets that have a matching source port number, and CALL-ID based persistence is implemented for the responses received by the virtual server.
	* </pre>
	*/
	public void set_rnatsrcport(int rnatsrcport) throws Exception {
		this.rnatsrcport = new Integer(rnatsrcport);
	}

	/**
	* <pre>
	* Port number with which to match the source port in server-initiated SIP traffic. The rport parameter is added, without a value, to SIP packets that have a matching source port number, and CALL-ID based persistence is implemented for the responses received by the virtual server.
	* </pre>
	*/
	public void set_rnatsrcport(Integer rnatsrcport) throws Exception{
		this.rnatsrcport = rnatsrcport;
	}

	/**
	* <pre>
	* Port number with which to match the source port in server-initiated SIP traffic. The rport parameter is added, without a value, to SIP packets that have a matching source port number, and CALL-ID based persistence is implemented for the responses received by the virtual server.
	* </pre>
	*/
	public Integer get_rnatsrcport() throws Exception {
		return this.rnatsrcport;
	}

	/**
	* <pre>
	* Port number with which to match the destination port in server-initiated SIP traffic. The rport parameter is added, without a value, to SIP packets that have a matching source port number, and CALL-ID based persistence is implemented for the responses received by the virtual server.
	* </pre>
	*/
	public void set_rnatdstport(int rnatdstport) throws Exception {
		this.rnatdstport = new Integer(rnatdstport);
	}

	/**
	* <pre>
	* Port number with which to match the destination port in server-initiated SIP traffic. The rport parameter is added, without a value, to SIP packets that have a matching source port number, and CALL-ID based persistence is implemented for the responses received by the virtual server.
	* </pre>
	*/
	public void set_rnatdstport(Integer rnatdstport) throws Exception{
		this.rnatdstport = rnatdstport;
	}

	/**
	* <pre>
	* Port number with which to match the destination port in server-initiated SIP traffic. The rport parameter is added, without a value, to SIP packets that have a matching source port number, and CALL-ID based persistence is implemented for the responses received by the virtual server.
	* </pre>
	*/
	public Integer get_rnatdstport() throws Exception {
		return this.rnatdstport;
	}

	/**
	* <pre>
	* Time, in seconds, for which a client must wait before initiating a connection after receiving a 503 Service Unavailable response from the SIP server. The time value is sent in the "Retry-After" header in the 503 response.<br> Default value: 120<br> Minimum value =  1
	* </pre>
	*/
	public void set_retrydur(int retrydur) throws Exception {
		this.retrydur = new Integer(retrydur);
	}

	/**
	* <pre>
	* Time, in seconds, for which a client must wait before initiating a connection after receiving a 503 Service Unavailable response from the SIP server. The time value is sent in the "Retry-After" header in the 503 response.<br> Default value: 120<br> Minimum value =  1
	* </pre>
	*/
	public void set_retrydur(Integer retrydur) throws Exception{
		this.retrydur = retrydur;
	}

	/**
	* <pre>
	* Time, in seconds, for which a client must wait before initiating a connection after receiving a 503 Service Unavailable response from the SIP server. The time value is sent in the "Retry-After" header in the 503 response.<br> Default value: 120<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_retrydur() throws Exception {
		return this.retrydur;
	}

	/**
	* <pre>
	* Add the rport parameter to the VIA headers of SIP requests that virtual servers receive from clients or servers.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_addrportvip(String addrportvip) throws Exception{
		this.addrportvip = addrportvip;
	}

	/**
	* <pre>
	* Add the rport parameter to the VIA headers of SIP requests that virtual servers receive from clients or servers.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_addrportvip() throws Exception {
		return this.addrportvip;
	}

	/**
	* <pre>
	* Maximum number of 503 Service Unavailable responses to generate, once every 10 milliseconds, when a SIP virtual server becomes unavailable.<br> Default value: 100
	* </pre>
	*/
	public void set_sip503ratethreshold(long sip503ratethreshold) throws Exception {
		this.sip503ratethreshold = new Long(sip503ratethreshold);
	}

	/**
	* <pre>
	* Maximum number of 503 Service Unavailable responses to generate, once every 10 milliseconds, when a SIP virtual server becomes unavailable.<br> Default value: 100
	* </pre>
	*/
	public void set_sip503ratethreshold(Long sip503ratethreshold) throws Exception{
		this.sip503ratethreshold = sip503ratethreshold;
	}

	/**
	* <pre>
	* Maximum number of 503 Service Unavailable responses to generate, once every 10 milliseconds, when a SIP virtual server becomes unavailable.<br> Default value: 100
	* </pre>
	*/
	public Long get_sip503ratethreshold() throws Exception {
		return this.sip503ratethreshold;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		lbsipparameters[] resources = new lbsipparameters[1];
		lbsipparameters_response result = (lbsipparameters_response) service.get_payload_formatter().string_to_resource(lbsipparameters_response.class, response);
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
		resources[0] = result.lbsipparameters;
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
	* Use this API to update lbsipparameters.
	*/
	public static base_response update(nitro_service client, lbsipparameters resource) throws Exception {
		lbsipparameters updateresource = new lbsipparameters();
		updateresource.rnatsrcport = resource.rnatsrcport;
		updateresource.rnatdstport = resource.rnatdstport;
		updateresource.retrydur = resource.retrydur;
		updateresource.addrportvip = resource.addrportvip;
		updateresource.sip503ratethreshold = resource.sip503ratethreshold;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of lbsipparameters resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, lbsipparameters resource, String[] args) throws Exception{
		lbsipparameters unsetresource = new lbsipparameters();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the lbsipparameters resources that are configured on netscaler.
	*/
	public static lbsipparameters get(nitro_service service) throws Exception{
		lbsipparameters obj = new lbsipparameters();
		lbsipparameters[] response = (lbsipparameters[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the lbsipparameters resources that are configured on netscaler.
	*/
	public static lbsipparameters get(nitro_service service,  options option) throws Exception{
		lbsipparameters obj = new lbsipparameters();
		lbsipparameters[] response = (lbsipparameters[])obj.get_resources(service,option);
		return response[0];
	}

	public static class addrportvipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
