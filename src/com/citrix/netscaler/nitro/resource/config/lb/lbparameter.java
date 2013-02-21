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

class lbparameter_response extends base_response
{
	public lbparameter lbparameter;
}
/**
* Configuration for LB parameter resource.
*/

public class lbparameter extends base_resource
{
	private String httponlycookieflag;
	private String consolidatedlconn;
	private String useportforhashlb;
	private String preferdirectroute;
	private Long startuprrfactor;
	private String monitorskipmaxclient;
	private String monitorconnectionclose;
	private String vserverspecificmac;

	/**
	* <pre>
	* enable/disable httponly flag for persistence cookie.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httponlycookieflag(String httponlycookieflag) throws Exception{
		this.httponlycookieflag = httponlycookieflag;
	}

	/**
	* <pre>
	* enable/disable httponly flag for persistence cookie.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httponlycookieflag() throws Exception {
		return this.httponlycookieflag;
	}

	/**
	* <pre>
	* Indicates whether use consolidate stats to find the least connection service.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_consolidatedlconn(String consolidatedlconn) throws Exception{
		this.consolidatedlconn = consolidatedlconn;
	}

	/**
	* <pre>
	* Indicates whether use consolidate stats to find the least connection service.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_consolidatedlconn() throws Exception {
		return this.consolidatedlconn;
	}

	/**
	* <pre>
	* Indicates whether to consider port of the service for hash based lb methods.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_useportforhashlb(String useportforhashlb) throws Exception{
		this.useportforhashlb = useportforhashlb;
	}

	/**
	* <pre>
	* Indicates whether to consider port of the service for hash based lb methods.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_useportforhashlb() throws Exception {
		return this.useportforhashlb;
	}

	/**
	* <pre>
	* If enabled, will do route lookup incase of wildcard server.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_preferdirectroute(String preferdirectroute) throws Exception{
		this.preferdirectroute = preferdirectroute;
	}

	/**
	* <pre>
	* If enabled, will do route lookup incase of wildcard server.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_preferdirectroute() throws Exception {
		return this.preferdirectroute;
	}

	/**
	* <pre>
	* Factor used to decide the number of requests the vserver will be serving in Round Robin mode, before switching to configured LB method.
	* </pre>
	*/
	public void set_startuprrfactor(long startuprrfactor) throws Exception {
		this.startuprrfactor = new Long(startuprrfactor);
	}

	/**
	* <pre>
	* Factor used to decide the number of requests the vserver will be serving in Round Robin mode, before switching to configured LB method.
	* </pre>
	*/
	public void set_startuprrfactor(Long startuprrfactor) throws Exception{
		this.startuprrfactor = startuprrfactor;
	}

	/**
	* <pre>
	* Factor used to decide the number of requests the vserver will be serving in Round Robin mode, before switching to configured LB method.
	* </pre>
	*/
	public Long get_startuprrfactor() throws Exception {
		return this.startuprrfactor;
	}

	/**
	* <pre>
	* Enabling this option will skip maxClients limit check for monitoring connections.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_monitorskipmaxclient(String monitorskipmaxclient) throws Exception{
		this.monitorskipmaxclient = monitorskipmaxclient;
	}

	/**
	* <pre>
	* Enabling this option will skip maxClients limit check for monitoring connections.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_monitorskipmaxclient() throws Exception {
		return this.monitorskipmaxclient;
	}

	/**
	* <pre>
	* This option is used to control the way the monitoring connections will be closed, either by FIN or RST . Default is FIN.<br> Default value: FIN<br> Possible values = RESET, FIN
	* </pre>
	*/
	public void set_monitorconnectionclose(String monitorconnectionclose) throws Exception{
		this.monitorconnectionclose = monitorconnectionclose;
	}

	/**
	* <pre>
	* This option is used to control the way the monitoring connections will be closed, either by FIN or RST . Default is FIN.<br> Default value: FIN<br> Possible values = RESET, FIN
	* </pre>
	*/
	public String get_monitorconnectionclose() throws Exception {
		return this.monitorconnectionclose;
	}

	/**
	* <pre>
	* Incase of FW LB deployments, we might want that the return traffic from firewall should be send to another FW. NS defualt behavior is that we never reload balance the trafic returned from the services. However turning this knob ON, it willl make sure that NS lets other mac mode LB vserver to pick up this return traffic. The loop however is avoided as we dont pick the same vserver again.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_vserverspecificmac(String vserverspecificmac) throws Exception{
		this.vserverspecificmac = vserverspecificmac;
	}

	/**
	* <pre>
	* Incase of FW LB deployments, we might want that the return traffic from firewall should be send to another FW. NS defualt behavior is that we never reload balance the trafic returned from the services. However turning this knob ON, it willl make sure that NS lets other mac mode LB vserver to pick up this return traffic. The loop however is avoided as we dont pick the same vserver again.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_vserverspecificmac() throws Exception {
		return this.vserverspecificmac;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		lbparameter[] resources = new lbparameter[1];
		lbparameter_response result = (lbparameter_response) service.get_payload_formatter().string_to_resource(lbparameter_response.class, response);
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
		resources[0] = result.lbparameter;
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
	* Use this API to update lbparameter.
	*/
	public static base_response update(nitro_service client, lbparameter resource) throws Exception {
		lbparameter updateresource = new lbparameter();
		updateresource.httponlycookieflag = resource.httponlycookieflag;
		updateresource.consolidatedlconn = resource.consolidatedlconn;
		updateresource.useportforhashlb = resource.useportforhashlb;
		updateresource.preferdirectroute = resource.preferdirectroute;
		updateresource.startuprrfactor = resource.startuprrfactor;
		updateresource.monitorskipmaxclient = resource.monitorskipmaxclient;
		updateresource.monitorconnectionclose = resource.monitorconnectionclose;
		updateresource.vserverspecificmac = resource.vserverspecificmac;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of lbparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, lbparameter resource, String[] args) throws Exception{
		lbparameter unsetresource = new lbparameter();
		unsetresource.httponlycookieflag = resource.httponlycookieflag;
		unsetresource.consolidatedlconn = resource.consolidatedlconn;
		unsetresource.useportforhashlb = resource.useportforhashlb;
		unsetresource.preferdirectroute = resource.preferdirectroute;
		unsetresource.startuprrfactor = resource.startuprrfactor;
		unsetresource.monitorskipmaxclient = resource.monitorskipmaxclient;
		unsetresource.monitorconnectionclose = resource.monitorconnectionclose;
		unsetresource.vserverspecificmac = resource.vserverspecificmac;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the lbparameter resources that are configured on netscaler.
	*/
	public static lbparameter get(nitro_service service) throws Exception{
		lbparameter obj = new lbparameter();
		lbparameter[] response = (lbparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the lbparameter resources that are configured on netscaler.
	*/
	public static lbparameter get(nitro_service service,  options option) throws Exception{
		lbparameter obj = new lbparameter();
		lbparameter[] response = (lbparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class consolidatedlconnEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class httponlycookieflagEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class vserverspecificmacEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class monitorconnectioncloseEnum {
		public static final String RESET = "RESET";
		public static final String FIN = "FIN";
	}
	public static class monitorskipmaxclientEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class preferdirectrouteEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class useportforhashlbEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
