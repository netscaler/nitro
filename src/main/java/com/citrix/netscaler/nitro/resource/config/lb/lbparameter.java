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

	//------- Read only Parameter ---------;

	private Long sessionsthreshold;

	/**
	* <pre>
	* Include the HttpOnly attribute in persistence cookies. The HttpOnly attribute limits the scope of a cookie to HTTP requests and helps mitigate the risk of cross-site scripting attacks.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httponlycookieflag(String httponlycookieflag) throws Exception{
		this.httponlycookieflag = httponlycookieflag;
	}

	/**
	* <pre>
	* Include the HttpOnly attribute in persistence cookies. The HttpOnly attribute limits the scope of a cookie to HTTP requests and helps mitigate the risk of cross-site scripting attacks.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httponlycookieflag() throws Exception {
		return this.httponlycookieflag;
	}

	/**
	* <pre>
	* To find the service with the fewest connections, the virtual server uses the consolidated connection statistics from all the packet engines. The NO setting allows consideration of only the number of connections on the packet engine that received the new connection.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_consolidatedlconn(String consolidatedlconn) throws Exception{
		this.consolidatedlconn = consolidatedlconn;
	}

	/**
	* <pre>
	* To find the service with the fewest connections, the virtual server uses the consolidated connection statistics from all the packet engines. The NO setting allows consideration of only the number of connections on the packet engine that received the new connection.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_consolidatedlconn() throws Exception {
		return this.consolidatedlconn;
	}

	/**
	* <pre>
	* Include the port number of the service when creating a hash for hash based load balancing methods. With the NO setting, only the IP address of the service is considered when creating a hash.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_useportforhashlb(String useportforhashlb) throws Exception{
		this.useportforhashlb = useportforhashlb;
	}

	/**
	* <pre>
	* Include the port number of the service when creating a hash for hash based load balancing methods. With the NO setting, only the IP address of the service is considered when creating a hash.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_useportforhashlb() throws Exception {
		return this.useportforhashlb;
	}

	/**
	* <pre>
	* Perform route lookup for traffic received by the NetScaler appliance, and forward the traffic according to configured routes. Do not set this parameter if you want a wildcard virtual server to direct packets received by the appliance to an intermediary device, such as a firewall, even if their destination is directly connected to the appliance. Route lookup is performed after the packets have been processed and returned by the intermediary device.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_preferdirectroute(String preferdirectroute) throws Exception{
		this.preferdirectroute = preferdirectroute;
	}

	/**
	* <pre>
	* Perform route lookup for traffic received by the NetScaler appliance, and forward the traffic according to configured routes. Do not set this parameter if you want a wildcard virtual server to direct packets received by the appliance to an intermediary device, such as a firewall, even if their destination is directly connected to the appliance. Route lookup is performed after the packets have been processed and returned by the intermediary device.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_preferdirectroute() throws Exception {
		return this.preferdirectroute;
	}

	/**
	* <pre>
	* Number of requests, per service, for which to apply the round robin load balancing method before switching to the configured load balancing method, thus allowing services to ramp up gradually to full load. Until the specified number of requests is distributed, the NetScaler appliance is said to be implementing the slow start mode (or startup round robin). Implemented for a virtual server when one of the following is true:
* The virtual server is newly created.
* One or more services are newly bound to the virtual server. 
* One or more services bound to the virtual server are enabled.
* The load balancing method is changed.
This parameter applies to all the load balancing virtual servers configured on the NetScaler appliance, except for those virtual servers for which the virtual server-level slow start parameters (New Service Startup Request Rate and Increment Interval) are configured. If the global slow start parameter and the slow start parameters for a given virtual server are not set, the appliance implements a default slow start for the virtual server, as follows:
* For a newly configured virtual server, the appliance implements slow start for the first 100 requests received by the virtual server.
* For an existing virtual server, if one or more services are newly bound or newly enabled, or if the load balancing method is changed, the appliance dynamically computes the number of requests for which to implement startup round robin. It obtains this number by multiplying the request rate by the number of bound services (it includes services that are marked as DOWN). For example, if the current request rate is 20 requests/s and ten services are bound to the virtual server, the appliance performs startup round robin for 200 requests.
Not applicable to a virtual server for which a hash based load balancing method is configured.
	* </pre>
	*/
	public void set_startuprrfactor(long startuprrfactor) throws Exception {
		this.startuprrfactor = new Long(startuprrfactor);
	}

	/**
	* <pre>
	* Number of requests, per service, for which to apply the round robin load balancing method before switching to the configured load balancing method, thus allowing services to ramp up gradually to full load. Until the specified number of requests is distributed, the NetScaler appliance is said to be implementing the slow start mode (or startup round robin). Implemented for a virtual server when one of the following is true:
* The virtual server is newly created.
* One or more services are newly bound to the virtual server. 
* One or more services bound to the virtual server are enabled.
* The load balancing method is changed.
This parameter applies to all the load balancing virtual servers configured on the NetScaler appliance, except for those virtual servers for which the virtual server-level slow start parameters (New Service Startup Request Rate and Increment Interval) are configured. If the global slow start parameter and the slow start parameters for a given virtual server are not set, the appliance implements a default slow start for the virtual server, as follows:
* For a newly configured virtual server, the appliance implements slow start for the first 100 requests received by the virtual server.
* For an existing virtual server, if one or more services are newly bound or newly enabled, or if the load balancing method is changed, the appliance dynamically computes the number of requests for which to implement startup round robin. It obtains this number by multiplying the request rate by the number of bound services (it includes services that are marked as DOWN). For example, if the current request rate is 20 requests/s and ten services are bound to the virtual server, the appliance performs startup round robin for 200 requests.
Not applicable to a virtual server for which a hash based load balancing method is configured.
	* </pre>
	*/
	public void set_startuprrfactor(Long startuprrfactor) throws Exception{
		this.startuprrfactor = startuprrfactor;
	}

	/**
	* <pre>
	* Number of requests, per service, for which to apply the round robin load balancing method before switching to the configured load balancing method, thus allowing services to ramp up gradually to full load. Until the specified number of requests is distributed, the NetScaler appliance is said to be implementing the slow start mode (or startup round robin). Implemented for a virtual server when one of the following is true:
* The virtual server is newly created.
* One or more services are newly bound to the virtual server. 
* One or more services bound to the virtual server are enabled.
* The load balancing method is changed.
This parameter applies to all the load balancing virtual servers configured on the NetScaler appliance, except for those virtual servers for which the virtual server-level slow start parameters (New Service Startup Request Rate and Increment Interval) are configured. If the global slow start parameter and the slow start parameters for a given virtual server are not set, the appliance implements a default slow start for the virtual server, as follows:
* For a newly configured virtual server, the appliance implements slow start for the first 100 requests received by the virtual server.
* For an existing virtual server, if one or more services are newly bound or newly enabled, or if the load balancing method is changed, the appliance dynamically computes the number of requests for which to implement startup round robin. It obtains this number by multiplying the request rate by the number of bound services (it includes services that are marked as DOWN). For example, if the current request rate is 20 requests/s and ten services are bound to the virtual server, the appliance performs startup round robin for 200 requests.
Not applicable to a virtual server for which a hash based load balancing method is configured.
	* </pre>
	*/
	public Long get_startuprrfactor() throws Exception {
		return this.startuprrfactor;
	}

	/**
	* <pre>
	* When a monitor initiates a connection to a service, do not check to determine whether the number of connections to the service has reached the limit specified by the service's Max Clients setting. Enables monitoring to continue even if the service has reached its connection limit.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_monitorskipmaxclient(String monitorskipmaxclient) throws Exception{
		this.monitorskipmaxclient = monitorskipmaxclient;
	}

	/**
	* <pre>
	* When a monitor initiates a connection to a service, do not check to determine whether the number of connections to the service has reached the limit specified by the service's Max Clients setting. Enables monitoring to continue even if the service has reached its connection limit.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_monitorskipmaxclient() throws Exception {
		return this.monitorskipmaxclient;
	}

	/**
	* <pre>
	* Close monitoring connections by sending the service a connection termination message with the specified bit set.<br> Default value: FIN<br> Possible values = RESET, FIN
	* </pre>
	*/
	public void set_monitorconnectionclose(String monitorconnectionclose) throws Exception{
		this.monitorconnectionclose = monitorconnectionclose;
	}

	/**
	* <pre>
	* Close monitoring connections by sending the service a connection termination message with the specified bit set.<br> Default value: FIN<br> Possible values = RESET, FIN
	* </pre>
	*/
	public String get_monitorconnectionclose() throws Exception {
		return this.monitorconnectionclose;
	}

	/**
	* <pre>
	* Allow a MAC-mode virtual server to accept traffic returned by an intermediary device, such as a firewall, to which the traffic was previously forwarded by another MAC-mode virtual server. The second virtual server can then distribute that traffic across the destination server farm. Also useful when load balancing Branch Repeater appliances.
Note: The second virtual server can also send the traffic to another set of intermediary devices, such as another set of firewalls. If necessary, you can configure multiple MAC-mode virtual servers to pass traffic successively through multiple sets of intermediary devices.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_vserverspecificmac(String vserverspecificmac) throws Exception{
		this.vserverspecificmac = vserverspecificmac;
	}

	/**
	* <pre>
	* Allow a MAC-mode virtual server to accept traffic returned by an intermediary device, such as a firewall, to which the traffic was previously forwarded by another MAC-mode virtual server. The second virtual server can then distribute that traffic across the destination server farm. Also useful when load balancing Branch Repeater appliances.
Note: The second virtual server can also send the traffic to another set of intermediary devices, such as another set of firewalls. If necessary, you can configure multiple MAC-mode virtual servers to pass traffic successively through multiple sets of intermediary devices.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_vserverspecificmac() throws Exception {
		return this.vserverspecificmac;
	}

	/**
	* <pre>
	* This option is used to get the upper-limit on the number of persistent sessions set by the administrator for this system.
	* </pre>
	*/
	public Long get_sessionsthreshold() throws Exception {
		return this.sessionsthreshold;
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
