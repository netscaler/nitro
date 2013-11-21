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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class iptunnelparam_response extends base_response
{
	public iptunnelparam iptunnelparam;
}
/**
* Configuration for ip tunnel parameter resource.
*/

public class iptunnelparam extends base_resource
{
	private String srcip;
	private String dropfrag;
	private Long dropfragcputhreshold;
	private String srciproundrobin;

	/**
	* <pre>
	* Common source-IP address for all tunnels. For a specific tunnel, this global setting is overridden if you have specified another source IP address. Must be a MIP or SNIP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_srcip(String srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* Common source-IP address for all tunnels. For a specific tunnel, this global setting is overridden if you have specified another source IP address. Must be a MIP or SNIP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* Drop any IP packet that requires fragmentation before it is sent through the tunnel.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_dropfrag(String dropfrag) throws Exception{
		this.dropfrag = dropfrag;
	}

	/**
	* <pre>
	* Drop any IP packet that requires fragmentation before it is sent through the tunnel.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_dropfrag() throws Exception {
		return this.dropfrag;
	}

	/**
	* <pre>
	* Threshold value, as a percentage of CPU usage, at which to drop packets that require fragmentation to use the IP tunnel. Applies only if dropFragparameter is set to NO. The default value, 0, specifies that this parameter is not set.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dropfragcputhreshold(long dropfragcputhreshold) throws Exception {
		this.dropfragcputhreshold = new Long(dropfragcputhreshold);
	}

	/**
	* <pre>
	* Threshold value, as a percentage of CPU usage, at which to drop packets that require fragmentation to use the IP tunnel. Applies only if dropFragparameter is set to NO. The default value, 0, specifies that this parameter is not set.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dropfragcputhreshold(Long dropfragcputhreshold) throws Exception{
		this.dropfragcputhreshold = dropfragcputhreshold;
	}

	/**
	* <pre>
	* Threshold value, as a percentage of CPU usage, at which to drop packets that require fragmentation to use the IP tunnel. Applies only if dropFragparameter is set to NO. The default value, 0, specifies that this parameter is not set.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_dropfragcputhreshold() throws Exception {
		return this.dropfragcputhreshold;
	}

	/**
	* <pre>
	* Use a different source IP address for each new session through a particular IP tunnel, as determined by round robin selection of one of the SNIP addresses. This setting is ignored if a common global source IP address has been specified for all the IP tunnels. This setting does not apply to a tunnel for which a source IP address has been specified.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_srciproundrobin(String srciproundrobin) throws Exception{
		this.srciproundrobin = srciproundrobin;
	}

	/**
	* <pre>
	* Use a different source IP address for each new session through a particular IP tunnel, as determined by round robin selection of one of the SNIP addresses. This setting is ignored if a common global source IP address has been specified for all the IP tunnels. This setting does not apply to a tunnel for which a source IP address has been specified.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_srciproundrobin() throws Exception {
		return this.srciproundrobin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		iptunnelparam[] resources = new iptunnelparam[1];
		iptunnelparam_response result = (iptunnelparam_response) service.get_payload_formatter().string_to_resource(iptunnelparam_response.class, response);
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
		resources[0] = result.iptunnelparam;
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
	* Use this API to update iptunnelparam.
	*/
	public static base_response update(nitro_service client, iptunnelparam resource) throws Exception {
		iptunnelparam updateresource = new iptunnelparam();
		updateresource.srcip = resource.srcip;
		updateresource.dropfrag = resource.dropfrag;
		updateresource.dropfragcputhreshold = resource.dropfragcputhreshold;
		updateresource.srciproundrobin = resource.srciproundrobin;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of iptunnelparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, iptunnelparam resource, String[] args) throws Exception{
		iptunnelparam unsetresource = new iptunnelparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the iptunnelparam resources that are configured on netscaler.
	*/
	public static iptunnelparam get(nitro_service service) throws Exception{
		iptunnelparam obj = new iptunnelparam();
		iptunnelparam[] response = (iptunnelparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the iptunnelparam resources that are configured on netscaler.
	*/
	public static iptunnelparam get(nitro_service service,  options option) throws Exception{
		iptunnelparam obj = new iptunnelparam();
		iptunnelparam[] response = (iptunnelparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class dropfragEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class srciproundrobinEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
