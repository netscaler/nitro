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

class nsmode_response extends base_response
{
	public nsmode nsmode;
}
/**
* Configuration for ns mode resource.
*/

public class nsmode extends base_resource
{
	private String[] mode;

	//------- Read only Parameter ---------;

	private Boolean fr;
	private Boolean l2;
	private Boolean usip;
	private Boolean cka;
	private Boolean tcpb;
	private Boolean mbf;
	private Boolean edge;
	private Boolean usnip;
	private Boolean l3;
	private Boolean pmtud;
	private Boolean sradv;
	private Boolean dradv;
	private Boolean iradv;
	private Boolean sradv6;
	private Boolean dradv6;
	private Boolean bridgebpdus;

	/**
	* <pre>
	* Mode to be enabled. Multiple modes can be specified by providing a blank space between each mode.<br> Possible values = FR, FastRamp, L2, L2mode, L3, L3mode, USIP, UseSourceIP, CKA, ClientKeepAlive, TCPB, TCPBuffering, MBF, MACbasedforwarding, Edge, USNIP, SRADV, DRADV, IRADV, SRADV6, DRADV6, PMTUD, BridgeBPDUs
	* </pre>
	*/
	public void set_mode(String[] mode) throws Exception{
		this.mode = mode;
	}

	/**
	* <pre>
	* Mode to be enabled. Multiple modes can be specified by providing a blank space between each mode.<br> Possible values = FR, FastRamp, L2, L2mode, L3, L3mode, USIP, UseSourceIP, CKA, ClientKeepAlive, TCPB, TCPBuffering, MBF, MACbasedforwarding, Edge, USNIP, SRADV, DRADV, IRADV, SRADV6, DRADV6, PMTUD, BridgeBPDUs
	* </pre>
	*/
	public String[] get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* Fast Ramp.
	* </pre>
	*/
	public Boolean get_fr() throws Exception {
		return this.fr;
	}

	/**
	* <pre>
	* Layer 2 mode.
	* </pre>
	*/
	public Boolean get_l2() throws Exception {
		return this.l2;
	}

	/**
	* <pre>
	* Use Source IP.
	* </pre>
	*/
	public Boolean get_usip() throws Exception {
		return this.usip;
	}

	/**
	* <pre>
	* Client Keep-alive.
	* </pre>
	*/
	public Boolean get_cka() throws Exception {
		return this.cka;
	}

	/**
	* <pre>
	* TCP Buffering.
	* </pre>
	*/
	public Boolean get_tcpb() throws Exception {
		return this.tcpb;
	}

	/**
	* <pre>
	* MAC-based forwarding.
	* </pre>
	*/
	public Boolean get_mbf() throws Exception {
		return this.mbf;
	}

	/**
	* <pre>
	* Edge configuration.
	* </pre>
	*/
	public Boolean get_edge() throws Exception {
		return this.edge;
	}

	/**
	* <pre>
	* Use Subnet IP.
	* </pre>
	*/
	public Boolean get_usnip() throws Exception {
		return this.usnip;
	}

	/**
	* <pre>
	* Layer 3 mode (ip forwarding).
	* </pre>
	*/
	public Boolean get_l3() throws Exception {
		return this.l3;
	}

	/**
	* <pre>
	* Path MTU Discovery.
	* </pre>
	*/
	public Boolean get_pmtud() throws Exception {
		return this.pmtud;
	}

	/**
	* <pre>
	* Static Route Advertisement.
	* </pre>
	*/
	public Boolean get_sradv() throws Exception {
		return this.sradv;
	}

	/**
	* <pre>
	* Direct Route Advertisement.
	* </pre>
	*/
	public Boolean get_dradv() throws Exception {
		return this.dradv;
	}

	/**
	* <pre>
	* Intranet Route Advertisement.
	* </pre>
	*/
	public Boolean get_iradv() throws Exception {
		return this.iradv;
	}

	/**
	* <pre>
	* Ipv6 Static Route Advertisement.
	* </pre>
	*/
	public Boolean get_sradv6() throws Exception {
		return this.sradv6;
	}

	/**
	* <pre>
	* Ipv6 Direct Route Advertisement.
	* </pre>
	*/
	public Boolean get_dradv6() throws Exception {
		return this.dradv6;
	}

	/**
	* <pre>
	* BPDU Bridging Mode.
	* </pre>
	*/
	public Boolean get_bridgebpdus() throws Exception {
		return this.bridgebpdus;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsmode[] resources = new nsmode[1];
		nsmode_response result = (nsmode_response) service.get_payload_formatter().string_to_resource(nsmode_response.class, response);
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
		resources[0] = result.nsmode;
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
	* Use this API to enable nsmode.
	*/
	public static base_response enable(nitro_service client, nsmode resource) throws Exception {
		nsmode enableresource = new nsmode();
		enableresource.mode = resource.mode;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to disable nsmode.
	*/
	public static base_response disable(nitro_service client, nsmode resource) throws Exception {
		nsmode disableresource = new nsmode();
		disableresource.mode = resource.mode;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to fetch all the nsmode resources that are configured on netscaler.
	*/
	public static nsmode get(nitro_service service) throws Exception{
		nsmode obj = new nsmode();
		nsmode[] response = (nsmode[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsmode resources that are configured on netscaler.
	*/
	public static nsmode get(nitro_service service,  options option) throws Exception{
		nsmode obj = new nsmode();
		nsmode[] response = (nsmode[])obj.get_resources(service,option);
		return response[0];
	}

	public static class modeEnum {
		public static final String FR = "FR";
		public static final String FastRamp = "FastRamp";
		public static final String L2 = "L2";
		public static final String L2mode = "L2mode";
		public static final String L3 = "L3";
		public static final String L3mode = "L3mode";
		public static final String USIP = "USIP";
		public static final String UseSourceIP = "UseSourceIP";
		public static final String CKA = "CKA";
		public static final String ClientKeepAlive = "ClientKeepAlive";
		public static final String TCPB = "TCPB";
		public static final String TCPBuffering = "TCPBuffering";
		public static final String MBF = "MBF";
		public static final String MACbasedforwarding = "MACbasedforwarding";
		public static final String Edge = "Edge";
		public static final String USNIP = "USNIP";
		public static final String SRADV = "SRADV";
		public static final String DRADV = "DRADV";
		public static final String IRADV = "IRADV";
		public static final String SRADV6 = "SRADV6";
		public static final String DRADV6 = "DRADV6";
		public static final String PMTUD = "PMTUD";
		public static final String BridgeBPDUs = "BridgeBPDUs";
	}
}
