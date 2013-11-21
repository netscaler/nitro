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

class nshttpparam_response extends base_response
{
	public nshttpparam nshttpparam;
}
/**
* Configuration for HTTP parameter resource.
*/

public class nshttpparam extends base_resource
{
	private String dropinvalreqs;
	private String markhttp09inval;
	private String markconnreqinval;
	private String insnssrvrhdr;
	private String nssrvrhdr;
	private String logerrresp;
	private String conmultiplex;
	private Long maxreusepool;

	/**
	* <pre>
	* Drop invalid HTTP requests or responses.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_dropinvalreqs(String dropinvalreqs) throws Exception{
		this.dropinvalreqs = dropinvalreqs;
	}

	/**
	* <pre>
	* Drop invalid HTTP requests or responses.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_dropinvalreqs() throws Exception {
		return this.dropinvalreqs;
	}

	/**
	* <pre>
	* Mark HTTP/0.9 requests as invalid.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_markhttp09inval(String markhttp09inval) throws Exception{
		this.markhttp09inval = markhttp09inval;
	}

	/**
	* <pre>
	* Mark HTTP/0.9 requests as invalid.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_markhttp09inval() throws Exception {
		return this.markhttp09inval;
	}

	/**
	* <pre>
	* Mark CONNECT requests as invalid.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_markconnreqinval(String markconnreqinval) throws Exception{
		this.markconnreqinval = markconnreqinval;
	}

	/**
	* <pre>
	* Mark CONNECT requests as invalid.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_markconnreqinval() throws Exception {
		return this.markconnreqinval;
	}

	/**
	* <pre>
	* Enable or disable NetScaler server header insertion for NetScaler generated HTTP responses.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_insnssrvrhdr(String insnssrvrhdr) throws Exception{
		this.insnssrvrhdr = insnssrvrhdr;
	}

	/**
	* <pre>
	* Enable or disable NetScaler server header insertion for NetScaler generated HTTP responses.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_insnssrvrhdr() throws Exception {
		return this.insnssrvrhdr;
	}

	/**
	* <pre>
	* The server header value to be inserted. If no explicit header is specified then NSBUILD.RELEASE is used as default server header.<br> Minimum length =  1
	* </pre>
	*/
	public void set_nssrvrhdr(String nssrvrhdr) throws Exception{
		this.nssrvrhdr = nssrvrhdr;
	}

	/**
	* <pre>
	* The server header value to be inserted. If no explicit header is specified then NSBUILD.RELEASE is used as default server header.<br> Minimum length =  1
	* </pre>
	*/
	public String get_nssrvrhdr() throws Exception {
		return this.nssrvrhdr;
	}

	/**
	* <pre>
	* Server header value to be inserted.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_logerrresp(String logerrresp) throws Exception{
		this.logerrresp = logerrresp;
	}

	/**
	* <pre>
	* Server header value to be inserted.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_logerrresp() throws Exception {
		return this.logerrresp;
	}

	/**
	* <pre>
	* Reuse server connections for requests from more than one client connections.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_conmultiplex(String conmultiplex) throws Exception{
		this.conmultiplex = conmultiplex;
	}

	/**
	* <pre>
	* Reuse server connections for requests from more than one client connections.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_conmultiplex() throws Exception {
		return this.conmultiplex;
	}

	/**
	* <pre>
	* Maximum limit on the number of connections, from the NetScaler to a particular server that are kept in the reuse pool. This setting is helpful for optimal memory utilization and for reducing the idle connections to the server just after the peak time.
	* </pre>
	*/
	public void set_maxreusepool(long maxreusepool) throws Exception {
		this.maxreusepool = new Long(maxreusepool);
	}

	/**
	* <pre>
	* Maximum limit on the number of connections, from the NetScaler to a particular server that are kept in the reuse pool. This setting is helpful for optimal memory utilization and for reducing the idle connections to the server just after the peak time.
	* </pre>
	*/
	public void set_maxreusepool(Long maxreusepool) throws Exception{
		this.maxreusepool = maxreusepool;
	}

	/**
	* <pre>
	* Maximum limit on the number of connections, from the NetScaler to a particular server that are kept in the reuse pool. This setting is helpful for optimal memory utilization and for reducing the idle connections to the server just after the peak time.
	* </pre>
	*/
	public Long get_maxreusepool() throws Exception {
		return this.maxreusepool;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nshttpparam[] resources = new nshttpparam[1];
		nshttpparam_response result = (nshttpparam_response) service.get_payload_formatter().string_to_resource(nshttpparam_response.class, response);
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
		resources[0] = result.nshttpparam;
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
	* Use this API to update nshttpparam.
	*/
	public static base_response update(nitro_service client, nshttpparam resource) throws Exception {
		nshttpparam updateresource = new nshttpparam();
		updateresource.dropinvalreqs = resource.dropinvalreqs;
		updateresource.markhttp09inval = resource.markhttp09inval;
		updateresource.markconnreqinval = resource.markconnreqinval;
		updateresource.insnssrvrhdr = resource.insnssrvrhdr;
		updateresource.nssrvrhdr = resource.nssrvrhdr;
		updateresource.logerrresp = resource.logerrresp;
		updateresource.conmultiplex = resource.conmultiplex;
		updateresource.maxreusepool = resource.maxreusepool;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nshttpparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nshttpparam resource, String[] args) throws Exception{
		nshttpparam unsetresource = new nshttpparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nshttpparam resources that are configured on netscaler.
	*/
	public static nshttpparam get(nitro_service service) throws Exception{
		nshttpparam obj = new nshttpparam();
		nshttpparam[] response = (nshttpparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nshttpparam resources that are configured on netscaler.
	*/
	public static nshttpparam get(nitro_service service,  options option) throws Exception{
		nshttpparam obj = new nshttpparam();
		nshttpparam[] response = (nshttpparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class conmultiplexEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class logerrrespEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class markhttp09invalEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class dropinvalreqsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class insnssrvrhdrEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class markconnreqinvalEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
