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

class nd6ravariables_response extends base_response
{
	public nd6ravariables[] nd6ravariables;
}
/**
* Configuration for nd6 Router Advertisment configuration variables resource.
*/

public class nd6ravariables extends base_resource
{
	private Long vlan;
	private String ceaserouteradv;
	private String sendrouteradv;
	private String srclinklayeraddroption;
	private String onlyunicastrtadvresponse;
	private String managedaddrconfig;
	private String otheraddrconfig;
	private Long currhoplimit;
	private Long maxrtadvinterval;
	private Long minrtadvinterval;
	private Long linkmtu;
	private Long reachabletime;
	private Long retranstime;
	private Integer defaultlifetime;

	//------- Read only Parameter ---------;

	private Long lastrtadvtime;
	private Long nextrtadvdelay;
	private Long __count;

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* Cease router advertisements on this vlan.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_ceaserouteradv(String ceaserouteradv) throws Exception{
		this.ceaserouteradv = ceaserouteradv;
	}

	/**
	* <pre>
	* Cease router advertisements on this vlan.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_ceaserouteradv() throws Exception {
		return this.ceaserouteradv;
	}

	/**
	* <pre>
	* whether the router sends periodic RAs and responds to Router Solicitations.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_sendrouteradv(String sendrouteradv) throws Exception{
		this.sendrouteradv = sendrouteradv;
	}

	/**
	* <pre>
	* whether the router sends periodic RAs and responds to Router Solicitations.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_sendrouteradv() throws Exception {
		return this.sendrouteradv;
	}

	/**
	* <pre>
	* Include source link layer address option in RA messages.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_srclinklayeraddroption(String srclinklayeraddroption) throws Exception{
		this.srclinklayeraddroption = srclinklayeraddroption;
	}

	/**
	* <pre>
	* Include source link layer address option in RA messages.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_srclinklayeraddroption() throws Exception {
		return this.srclinklayeraddroption;
	}

	/**
	* <pre>
	* Send only Unicast Router Advertisements in respond to Router Solicitations.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_onlyunicastrtadvresponse(String onlyunicastrtadvresponse) throws Exception{
		this.onlyunicastrtadvresponse = onlyunicastrtadvresponse;
	}

	/**
	* <pre>
	* Send only Unicast Router Advertisements in respond to Router Solicitations.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_onlyunicastrtadvresponse() throws Exception {
		return this.onlyunicastrtadvresponse;
	}

	/**
	* <pre>
	* Value to be placed in the Managed address configuration flag field.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_managedaddrconfig(String managedaddrconfig) throws Exception{
		this.managedaddrconfig = managedaddrconfig;
	}

	/**
	* <pre>
	* Value to be placed in the Managed address configuration flag field.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_managedaddrconfig() throws Exception {
		return this.managedaddrconfig;
	}

	/**
	* <pre>
	* Value to be placed in the Other configuration flag field.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_otheraddrconfig(String otheraddrconfig) throws Exception{
		this.otheraddrconfig = otheraddrconfig;
	}

	/**
	* <pre>
	* Value to be placed in the Other configuration flag field.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_otheraddrconfig() throws Exception {
		return this.otheraddrconfig;
	}

	/**
	* <pre>
	* Current Hop limit.<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_currhoplimit(long currhoplimit) throws Exception {
		this.currhoplimit = new Long(currhoplimit);
	}

	/**
	* <pre>
	* Current Hop limit.<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_currhoplimit(Long currhoplimit) throws Exception{
		this.currhoplimit = currhoplimit;
	}

	/**
	* <pre>
	* Current Hop limit.<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public Long get_currhoplimit() throws Exception {
		return this.currhoplimit;
	}

	/**
	* <pre>
	* Maximum time allowed between unsolicited multicast RAs, in seconds.<br> Default value: 600<br> Minimum value =  4<br> Maximum value =  1800
	* </pre>
	*/
	public void set_maxrtadvinterval(long maxrtadvinterval) throws Exception {
		this.maxrtadvinterval = new Long(maxrtadvinterval);
	}

	/**
	* <pre>
	* Maximum time allowed between unsolicited multicast RAs, in seconds.<br> Default value: 600<br> Minimum value =  4<br> Maximum value =  1800
	* </pre>
	*/
	public void set_maxrtadvinterval(Long maxrtadvinterval) throws Exception{
		this.maxrtadvinterval = maxrtadvinterval;
	}

	/**
	* <pre>
	* Maximum time allowed between unsolicited multicast RAs, in seconds.<br> Default value: 600<br> Minimum value =  4<br> Maximum value =  1800
	* </pre>
	*/
	public Long get_maxrtadvinterval() throws Exception {
		return this.maxrtadvinterval;
	}

	/**
	* <pre>
	* Minimum time interval between RA messages, in seconds.<br> Default value: 198<br> Minimum value =  3<br> Maximum value =  1350
	* </pre>
	*/
	public void set_minrtadvinterval(long minrtadvinterval) throws Exception {
		this.minrtadvinterval = new Long(minrtadvinterval);
	}

	/**
	* <pre>
	* Minimum time interval between RA messages, in seconds.<br> Default value: 198<br> Minimum value =  3<br> Maximum value =  1350
	* </pre>
	*/
	public void set_minrtadvinterval(Long minrtadvinterval) throws Exception{
		this.minrtadvinterval = minrtadvinterval;
	}

	/**
	* <pre>
	* Minimum time interval between RA messages, in seconds.<br> Default value: 198<br> Minimum value =  3<br> Maximum value =  1350
	* </pre>
	*/
	public Long get_minrtadvinterval() throws Exception {
		return this.minrtadvinterval;
	}

	/**
	* <pre>
	* The Link MTU.<br> Minimum value =  0<br> Maximum value =  1500
	* </pre>
	*/
	public void set_linkmtu(long linkmtu) throws Exception {
		this.linkmtu = new Long(linkmtu);
	}

	/**
	* <pre>
	* The Link MTU.<br> Minimum value =  0<br> Maximum value =  1500
	* </pre>
	*/
	public void set_linkmtu(Long linkmtu) throws Exception{
		this.linkmtu = linkmtu;
	}

	/**
	* <pre>
	* The Link MTU.<br> Minimum value =  0<br> Maximum value =  1500
	* </pre>
	*/
	public Long get_linkmtu() throws Exception {
		return this.linkmtu;
	}

	/**
	* <pre>
	* Reachable time, in milliseconds.<br> Minimum value =  0<br> Maximum value =  3600000
	* </pre>
	*/
	public void set_reachabletime(long reachabletime) throws Exception {
		this.reachabletime = new Long(reachabletime);
	}

	/**
	* <pre>
	* Reachable time, in milliseconds.<br> Minimum value =  0<br> Maximum value =  3600000
	* </pre>
	*/
	public void set_reachabletime(Long reachabletime) throws Exception{
		this.reachabletime = reachabletime;
	}

	/**
	* <pre>
	* Reachable time, in milliseconds.<br> Minimum value =  0<br> Maximum value =  3600000
	* </pre>
	*/
	public Long get_reachabletime() throws Exception {
		return this.reachabletime;
	}

	/**
	* <pre>
	* Retransmission time, in milliseconds.
	* </pre>
	*/
	public void set_retranstime(long retranstime) throws Exception {
		this.retranstime = new Long(retranstime);
	}

	/**
	* <pre>
	* Retransmission time, in milliseconds.
	* </pre>
	*/
	public void set_retranstime(Long retranstime) throws Exception{
		this.retranstime = retranstime;
	}

	/**
	* <pre>
	* Retransmission time, in milliseconds.
	* </pre>
	*/
	public Long get_retranstime() throws Exception {
		return this.retranstime;
	}

	/**
	* <pre>
	* Default life time, in seconds.<br> Default value: 1800<br> Minimum value =  0<br> Maximum value =  9000
	* </pre>
	*/
	public void set_defaultlifetime(int defaultlifetime) throws Exception {
		this.defaultlifetime = new Integer(defaultlifetime);
	}

	/**
	* <pre>
	* Default life time, in seconds.<br> Default value: 1800<br> Minimum value =  0<br> Maximum value =  9000
	* </pre>
	*/
	public void set_defaultlifetime(Integer defaultlifetime) throws Exception{
		this.defaultlifetime = defaultlifetime;
	}

	/**
	* <pre>
	* Default life time, in seconds.<br> Default value: 1800<br> Minimum value =  0<br> Maximum value =  9000
	* </pre>
	*/
	public Integer get_defaultlifetime() throws Exception {
		return this.defaultlifetime;
	}

	/**
	* <pre>
	* Last RA sent timestamp.
	* </pre>
	*/
	public Long get_lastrtadvtime() throws Exception {
		return this.lastrtadvtime;
	}

	/**
	* <pre>
	* Next RA delay.
	* </pre>
	*/
	public Long get_nextrtadvdelay() throws Exception {
		return this.nextrtadvdelay;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nd6ravariables_response result = (nd6ravariables_response) service.get_payload_formatter().string_to_resource(nd6ravariables_response.class, response);
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
		return result.nd6ravariables;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.vlan != null) {
			return this.vlan.toString();
		}
		return null;
	}

	/**
	* Use this API to update nd6ravariables.
	*/
	public static base_response update(nitro_service client, nd6ravariables resource) throws Exception {
		nd6ravariables updateresource = new nd6ravariables();
		updateresource.vlan = resource.vlan;
		updateresource.ceaserouteradv = resource.ceaserouteradv;
		updateresource.sendrouteradv = resource.sendrouteradv;
		updateresource.srclinklayeraddroption = resource.srclinklayeraddroption;
		updateresource.onlyunicastrtadvresponse = resource.onlyunicastrtadvresponse;
		updateresource.managedaddrconfig = resource.managedaddrconfig;
		updateresource.otheraddrconfig = resource.otheraddrconfig;
		updateresource.currhoplimit = resource.currhoplimit;
		updateresource.maxrtadvinterval = resource.maxrtadvinterval;
		updateresource.minrtadvinterval = resource.minrtadvinterval;
		updateresource.linkmtu = resource.linkmtu;
		updateresource.reachabletime = resource.reachabletime;
		updateresource.retranstime = resource.retranstime;
		updateresource.defaultlifetime = resource.defaultlifetime;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nd6ravariables resources.
	*/
	public static base_responses update(nitro_service client, nd6ravariables resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nd6ravariables updateresources[] = new nd6ravariables[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nd6ravariables();
				updateresources[i].vlan = resources[i].vlan;
				updateresources[i].ceaserouteradv = resources[i].ceaserouteradv;
				updateresources[i].sendrouteradv = resources[i].sendrouteradv;
				updateresources[i].srclinklayeraddroption = resources[i].srclinklayeraddroption;
				updateresources[i].onlyunicastrtadvresponse = resources[i].onlyunicastrtadvresponse;
				updateresources[i].managedaddrconfig = resources[i].managedaddrconfig;
				updateresources[i].otheraddrconfig = resources[i].otheraddrconfig;
				updateresources[i].currhoplimit = resources[i].currhoplimit;
				updateresources[i].maxrtadvinterval = resources[i].maxrtadvinterval;
				updateresources[i].minrtadvinterval = resources[i].minrtadvinterval;
				updateresources[i].linkmtu = resources[i].linkmtu;
				updateresources[i].reachabletime = resources[i].reachabletime;
				updateresources[i].retranstime = resources[i].retranstime;
				updateresources[i].defaultlifetime = resources[i].defaultlifetime;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nd6ravariables resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nd6ravariables resource, String[] args) throws Exception{
		nd6ravariables unsetresource = new nd6ravariables();
		unsetresource.vlan = resource.vlan;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nd6ravariables resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Long vlan[], String args[]) throws Exception {
		base_responses result = null;
		if (vlan != null && vlan.length > 0) {
			nd6ravariables unsetresources[] = new nd6ravariables[vlan.length];
			for (int i=0;i<vlan.length;i++){
				unsetresources[i] = new nd6ravariables();
				unsetresources[i].vlan = vlan[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nd6ravariables resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nd6ravariables resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nd6ravariables unsetresources[] = new nd6ravariables[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nd6ravariables();
				unsetresources[i].vlan = resources[i].vlan;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nd6ravariables resources that are configured on netscaler.
	*/
	public static nd6ravariables[] get(nitro_service service) throws Exception{
		nd6ravariables obj = new nd6ravariables();
		nd6ravariables[] response = (nd6ravariables[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nd6ravariables resources that are configured on netscaler.
	*/
	public static nd6ravariables[] get(nitro_service service, options option) throws Exception{
		nd6ravariables obj = new nd6ravariables();
		nd6ravariables[] response = (nd6ravariables[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nd6ravariables resource of given name .
	*/
	public static nd6ravariables get(nitro_service service, Long vlan) throws Exception{
		nd6ravariables obj = new nd6ravariables();
		obj.set_vlan(vlan);
		nd6ravariables response = (nd6ravariables) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nd6ravariables resources of given names .
	*/
	public static nd6ravariables[] get(nitro_service service, Long vlan[]) throws Exception{
		if (vlan !=null && vlan.length>0) {
			nd6ravariables response[] = new nd6ravariables[vlan.length];
			nd6ravariables obj[] = new nd6ravariables[vlan.length];
			for (int i=0;i<vlan.length;i++) {
				obj[i] = new nd6ravariables();
				obj[i].set_vlan(vlan[i]);
				response[i] = (nd6ravariables) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nd6ravariables resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nd6ravariables[] get_filtered(nitro_service service, String filter) throws Exception{
		nd6ravariables obj = new nd6ravariables();
		options option = new options();
		option.set_filter(filter);
		nd6ravariables[] response = (nd6ravariables[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nd6ravariables resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nd6ravariables[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nd6ravariables obj = new nd6ravariables();
		options option = new options();
		option.set_filter(filter);
		nd6ravariables[] response = (nd6ravariables[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nd6ravariables resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nd6ravariables obj = new nd6ravariables();
		options option = new options();
		option.set_count(true);
		nd6ravariables[] response = (nd6ravariables[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nd6ravariables resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nd6ravariables obj = new nd6ravariables();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nd6ravariables[] response = (nd6ravariables[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nd6ravariables resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nd6ravariables obj = new nd6ravariables();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nd6ravariables[] response = (nd6ravariables[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class managedaddrconfigEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class onlyunicastrtadvresponseEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class sendrouteradvEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class otheraddrconfigEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class srclinklayeraddroptionEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class ceaserouteradvEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
