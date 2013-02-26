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

class nslimitidentifier_response extends base_response
{
	public nslimitidentifier[] nslimitidentifier;
}
/**
* Configuration for limit Indetifier resource.
*/

public class nslimitidentifier extends base_resource
{
	private String limitidentifier;
	private Long threshold;
	private Long timeslice;
	private String mode;
	private String limittype;
	private String selectorname;
	private Long maxbandwidth;
	private Long trapsintimeslice;

	//------- Read only Parameter ---------;

	private Long flags;
	private Long hits;
	private Long drop;
	private String[] rule;
	private Long time;
	private Long total;
	private Long trapscomputedintimeslice;
	private Long computedtraptimeslice;
	private Long referencecount;
	private Long __count;

	/**
	* <pre>
	* The name of rate limit identifier.
	* </pre>
	*/
	public void set_limitidentifier(String limitidentifier) throws Exception{
		this.limitidentifier = limitidentifier;
	}

	/**
	* <pre>
	* The name of rate limit identifier.
	* </pre>
	*/
	public String get_limitidentifier() throws Exception {
		return this.limitidentifier;
	}

	/**
	* <pre>
	* The maximum number of requests that are allowed in the given timeslice when requests are tracked per timeslice. When connections (-mode CONNECTION)are tracked its the total number of connections that would be let through.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_threshold(long threshold) throws Exception {
		this.threshold = new Long(threshold);
	}

	/**
	* <pre>
	* The maximum number of requests that are allowed in the given timeslice when requests are tracked per timeslice. When connections (-mode CONNECTION)are tracked its the total number of connections that would be let through.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_threshold(Long threshold) throws Exception{
		this.threshold = threshold;
	}

	/**
	* <pre>
	* The maximum number of requests that are allowed in the given timeslice when requests are tracked per timeslice. When connections (-mode CONNECTION)are tracked its the total number of connections that would be let through.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_threshold() throws Exception {
		return this.threshold;
	}

	/**
	* <pre>
	* Defines the time interval in msecs specified in multiples of 10 msec during which the requests are tracked to see if they cross the threshold. It is used only when the mode is REQUEST_RATE while tracking request rate and for defining the trap timeslice.<br> Default value: 1000<br> Minimum value =  10
	* </pre>
	*/
	public void set_timeslice(long timeslice) throws Exception {
		this.timeslice = new Long(timeslice);
	}

	/**
	* <pre>
	* Defines the time interval in msecs specified in multiples of 10 msec during which the requests are tracked to see if they cross the threshold. It is used only when the mode is REQUEST_RATE while tracking request rate and for defining the trap timeslice.<br> Default value: 1000<br> Minimum value =  10
	* </pre>
	*/
	public void set_timeslice(Long timeslice) throws Exception{
		this.timeslice = timeslice;
	}

	/**
	* <pre>
	* Defines the time interval in msecs specified in multiples of 10 msec during which the requests are tracked to see if they cross the threshold. It is used only when the mode is REQUEST_RATE while tracking request rate and for defining the trap timeslice.<br> Default value: 1000<br> Minimum value =  10
	* </pre>
	*/
	public Long get_timeslice() throws Exception {
		return this.timeslice;
	}

	/**
	* <pre>
	* Defines what is tracked - request rate, connections or none. Request rate is used to track requests/timeslice, connections will track active transactions. For DNS please use the mode as either NONE or REQUEST_RATE as CONNECTION is not supported.
Eg:  1) add limitidentifier limit_req -mode request_rate
        -limitType smooth -timeslice 1000 -Threshold 2000
        -trapsInTimeSlice 200
        will permit 20 requests in 10 ms and 2 Traps in 10 ms
     2) set  limitidentifier limit_req -timeslice 1000
        -Threshold 5000 -limitType smooTH
        will permit 50 Requests in 10 ms
     3) set limitidentifier limit_req -mode smooth -timeslice
        2000 -Threshold 50
        will permit 1  request  in  40 ms
     4) set limitidentifier limit_req -timeslice 1000
        -Threshold 5 -limitType smooth -trapsInTimeSlice 8
        will permit 1 request in 200 ms and 1 Trap in 130 ms
     5) set limitidentifier limit_req  -timeslice 1000
        -Threshold 5000 -limitType BURSTY
        will permit 5000 Requests in 1000 ms and 200 Traps in
        1000 ms

As you see in the above examples smooth mode is used when one wants the permitted number of requests in a given interval of time to be spread evenly across the timeslice while bursty is used when one is ok to let the permitted number of requests to exhaust the quota anytime within the timeslice.
								.<br> Default value: PEMGMT_RLT_MODE_REQ_RATE<br> Possible values = CONNECTION, REQUEST_RATE, NONE
	* </pre>
	*/
	public void set_mode(String mode) throws Exception{
		this.mode = mode;
	}

	/**
	* <pre>
	* Defines what is tracked - request rate, connections or none. Request rate is used to track requests/timeslice, connections will track active transactions. For DNS please use the mode as either NONE or REQUEST_RATE as CONNECTION is not supported.
Eg:  1) add limitidentifier limit_req -mode request_rate
        -limitType smooth -timeslice 1000 -Threshold 2000
        -trapsInTimeSlice 200
        will permit 20 requests in 10 ms and 2 Traps in 10 ms
     2) set  limitidentifier limit_req -timeslice 1000
        -Threshold 5000 -limitType smooTH
        will permit 50 Requests in 10 ms
     3) set limitidentifier limit_req -mode smooth -timeslice
        2000 -Threshold 50
        will permit 1  request  in  40 ms
     4) set limitidentifier limit_req -timeslice 1000
        -Threshold 5 -limitType smooth -trapsInTimeSlice 8
        will permit 1 request in 200 ms and 1 Trap in 130 ms
     5) set limitidentifier limit_req  -timeslice 1000
        -Threshold 5000 -limitType BURSTY
        will permit 5000 Requests in 1000 ms and 200 Traps in
        1000 ms

As you see in the above examples smooth mode is used when one wants the permitted number of requests in a given interval of time to be spread evenly across the timeslice while bursty is used when one is ok to let the permitted number of requests to exhaust the quota anytime within the timeslice.
								.<br> Default value: PEMGMT_RLT_MODE_REQ_RATE<br> Possible values = CONNECTION, REQUEST_RATE, NONE
	* </pre>
	*/
	public String get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* Specifies if it is a smooth or bursty request type. If the smooth mode of operation is chosen requests are tracked at the rate of 10 ms. To be specified with -mode REQUEST_RATE .<br> Default value: PEMGMT_RLT_REQ_RATE_TYPE_BURSTY<br> Possible values = BURSTY, SMOOTH
	* </pre>
	*/
	public void set_limittype(String limittype) throws Exception{
		this.limittype = limittype;
	}

	/**
	* <pre>
	* Specifies if it is a smooth or bursty request type. If the smooth mode of operation is chosen requests are tracked at the rate of 10 ms. To be specified with -mode REQUEST_RATE .<br> Default value: PEMGMT_RLT_REQ_RATE_TYPE_BURSTY<br> Possible values = BURSTY, SMOOTH
	* </pre>
	*/
	public String get_limittype() throws Exception {
		return this.limittype;
	}

	/**
	* <pre>
	* The name of rate limit selector.<br> Minimum length =  1
	* </pre>
	*/
	public void set_selectorname(String selectorname) throws Exception{
		this.selectorname = selectorname;
	}

	/**
	* <pre>
	* The name of rate limit selector.<br> Minimum length =  1
	* </pre>
	*/
	public String get_selectorname() throws Exception {
		return this.selectorname;
	}

	/**
	* <pre>
	* The maximum bandwidth permitted in kbps.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_maxbandwidth(long maxbandwidth) throws Exception {
		this.maxbandwidth = new Long(maxbandwidth);
	}

	/**
	* <pre>
	* The maximum bandwidth permitted in kbps.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_maxbandwidth(Long maxbandwidth) throws Exception{
		this.maxbandwidth = maxbandwidth;
	}

	/**
	* <pre>
	* The maximum bandwidth permitted in kbps.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public Long get_maxbandwidth() throws Exception {
		return this.maxbandwidth;
	}

	/**
	* <pre>
	* Number of traps that would be sent in the timeslice configured. A value of zero means that the traps are disabled.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_trapsintimeslice(long trapsintimeslice) throws Exception {
		this.trapsintimeslice = new Long(trapsintimeslice);
	}

	/**
	* <pre>
	* Number of traps that would be sent in the timeslice configured. A value of zero means that the traps are disabled.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_trapsintimeslice(Long trapsintimeslice) throws Exception{
		this.trapsintimeslice = trapsintimeslice;
	}

	/**
	* <pre>
	* Number of traps that would be sent in the timeslice configured. A value of zero means that the traps are disabled.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_trapsintimeslice() throws Exception {
		return this.trapsintimeslice;
	}

	/**
	* <pre>
	* This is used internally to identify ip addresses returned.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* The number of times this identifier was evaluated.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of times action was taken.
	* </pre>
	*/
	public Long get_drop() throws Exception {
		return this.drop;
	}

	/**
	* <pre>
	* Rule.
	* </pre>
	*/
	public String[] get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Time interval considered for rate limiting.
	* </pre>
	*/
	public Long get_time() throws Exception {
		return this.time;
	}

	/**
	* <pre>
	* Maximum number of requests permitted in the computed timeslice.
	* </pre>
	*/
	public Long get_total() throws Exception {
		return this.total;
	}

	/**
	* <pre>
	* The number of traps that would be sent in the timeslice configured. .
	* </pre>
	*/
	public Long get_trapscomputedintimeslice() throws Exception {
		return this.trapscomputedintimeslice;
	}

	/**
	* <pre>
	* The time interval computed for sending traps.
	* </pre>
	*/
	public Long get_computedtraptimeslice() throws Exception {
		return this.computedtraptimeslice;
	}

	/**
	* <pre>
	* Total number of transactions pointing to this entry.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nslimitidentifier_response result = (nslimitidentifier_response) service.get_payload_formatter().string_to_resource(nslimitidentifier_response.class, response);
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
		return result.nslimitidentifier;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.limitidentifier;
	}

	/**
	* Use this API to add nslimitidentifier.
	*/
	public static base_response add(nitro_service client, nslimitidentifier resource) throws Exception {
		nslimitidentifier addresource = new nslimitidentifier();
		addresource.limitidentifier = resource.limitidentifier;
		addresource.threshold = resource.threshold;
		addresource.timeslice = resource.timeslice;
		addresource.mode = resource.mode;
		addresource.limittype = resource.limittype;
		addresource.selectorname = resource.selectorname;
		addresource.maxbandwidth = resource.maxbandwidth;
		addresource.trapsintimeslice = resource.trapsintimeslice;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nslimitidentifier resources.
	*/
	public static base_responses add(nitro_service client, nslimitidentifier resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitidentifier addresources[] = new nslimitidentifier[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nslimitidentifier();
				addresources[i].limitidentifier = resources[i].limitidentifier;
				addresources[i].threshold = resources[i].threshold;
				addresources[i].timeslice = resources[i].timeslice;
				addresources[i].mode = resources[i].mode;
				addresources[i].limittype = resources[i].limittype;
				addresources[i].selectorname = resources[i].selectorname;
				addresources[i].maxbandwidth = resources[i].maxbandwidth;
				addresources[i].trapsintimeslice = resources[i].trapsintimeslice;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nslimitidentifier of given name.
	*/
	public static base_response delete(nitro_service client, String limitidentifier) throws Exception {
		nslimitidentifier deleteresource = new nslimitidentifier();
		deleteresource.limitidentifier = limitidentifier;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nslimitidentifier.
	*/
	public static base_response delete(nitro_service client, nslimitidentifier resource) throws Exception {
		nslimitidentifier deleteresource = new nslimitidentifier();
		deleteresource.limitidentifier = resource.limitidentifier;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nslimitidentifier resources of given names.
	*/
	public static base_responses delete(nitro_service client, String limitidentifier[]) throws Exception {
		base_responses result = null;
		if (limitidentifier != null && limitidentifier.length > 0) {
			nslimitidentifier deleteresources[] = new nslimitidentifier[limitidentifier.length];
			for (int i=0;i<limitidentifier.length;i++){
				deleteresources[i] = new nslimitidentifier();
				deleteresources[i].limitidentifier = limitidentifier[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nslimitidentifier resources.
	*/
	public static base_responses delete(nitro_service client, nslimitidentifier resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitidentifier deleteresources[] = new nslimitidentifier[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nslimitidentifier();
				deleteresources[i].limitidentifier = resources[i].limitidentifier;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nslimitidentifier.
	*/
	public static base_response update(nitro_service client, nslimitidentifier resource) throws Exception {
		nslimitidentifier updateresource = new nslimitidentifier();
		updateresource.limitidentifier = resource.limitidentifier;
		updateresource.threshold = resource.threshold;
		updateresource.timeslice = resource.timeslice;
		updateresource.mode = resource.mode;
		updateresource.limittype = resource.limittype;
		updateresource.selectorname = resource.selectorname;
		updateresource.maxbandwidth = resource.maxbandwidth;
		updateresource.trapsintimeslice = resource.trapsintimeslice;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nslimitidentifier resources.
	*/
	public static base_responses update(nitro_service client, nslimitidentifier resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitidentifier updateresources[] = new nslimitidentifier[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nslimitidentifier();
				updateresources[i].limitidentifier = resources[i].limitidentifier;
				updateresources[i].threshold = resources[i].threshold;
				updateresources[i].timeslice = resources[i].timeslice;
				updateresources[i].mode = resources[i].mode;
				updateresources[i].limittype = resources[i].limittype;
				updateresources[i].selectorname = resources[i].selectorname;
				updateresources[i].maxbandwidth = resources[i].maxbandwidth;
				updateresources[i].trapsintimeslice = resources[i].trapsintimeslice;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nslimitidentifier resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String limitidentifier, String args[]) throws Exception {
		nslimitidentifier unsetresource = new nslimitidentifier();
		unsetresource.limitidentifier = limitidentifier;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of nslimitidentifier resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nslimitidentifier resource, String[] args) throws Exception{
		nslimitidentifier unsetresource = new nslimitidentifier();
		unsetresource.limitidentifier = resource.limitidentifier;
		unsetresource.selectorname = resource.selectorname;
		unsetresource.threshold = resource.threshold;
		unsetresource.timeslice = resource.timeslice;
		unsetresource.mode = resource.mode;
		unsetresource.limittype = resource.limittype;
		unsetresource.maxbandwidth = resource.maxbandwidth;
		unsetresource.trapsintimeslice = resource.trapsintimeslice;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nslimitidentifier resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String limitidentifier[], String args[]) throws Exception {
		base_responses result = null;
		if (limitidentifier != null && limitidentifier.length > 0) {
			nslimitidentifier unsetresources[] = new nslimitidentifier[limitidentifier.length];
			for (int i=0;i<limitidentifier.length;i++){
				unsetresources[i] = new nslimitidentifier();
				unsetresources[i].limitidentifier = limitidentifier[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nslimitidentifier resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nslimitidentifier resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitidentifier unsetresources[] = new nslimitidentifier[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nslimitidentifier();
				unsetresources[i].limitidentifier = resources[i].limitidentifier;
				unsetresources[i].selectorname = resources[i].selectorname;
				unsetresources[i].threshold = resources[i].threshold;
				unsetresources[i].timeslice = resources[i].timeslice;
				unsetresources[i].mode = resources[i].mode;
				unsetresources[i].limittype = resources[i].limittype;
				unsetresources[i].maxbandwidth = resources[i].maxbandwidth;
				unsetresources[i].trapsintimeslice = resources[i].trapsintimeslice;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nslimitidentifier resources that are configured on netscaler.
	*/
	public static nslimitidentifier[] get(nitro_service service) throws Exception{
		nslimitidentifier obj = new nslimitidentifier();
		nslimitidentifier[] response = (nslimitidentifier[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nslimitidentifier resources that are configured on netscaler.
	*/
	public static nslimitidentifier[] get(nitro_service service, options option) throws Exception{
		nslimitidentifier obj = new nslimitidentifier();
		nslimitidentifier[] response = (nslimitidentifier[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nslimitidentifier resource of given name .
	*/
	public static nslimitidentifier get(nitro_service service, String limitidentifier) throws Exception{
		nslimitidentifier obj = new nslimitidentifier();
		obj.set_limitidentifier(limitidentifier);
		nslimitidentifier response = (nslimitidentifier) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nslimitidentifier resources of given names .
	*/
	public static nslimitidentifier[] get(nitro_service service, String limitidentifier[]) throws Exception{
		if (limitidentifier !=null && limitidentifier.length>0) {
			nslimitidentifier response[] = new nslimitidentifier[limitidentifier.length];
			nslimitidentifier obj[] = new nslimitidentifier[limitidentifier.length];
			for (int i=0;i<limitidentifier.length;i++) {
				obj[i] = new nslimitidentifier();
				obj[i].set_limitidentifier(limitidentifier[i]);
				response[i] = (nslimitidentifier) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nslimitidentifier resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nslimitidentifier[] get_filtered(nitro_service service, String filter) throws Exception{
		nslimitidentifier obj = new nslimitidentifier();
		options option = new options();
		option.set_filter(filter);
		nslimitidentifier[] response = (nslimitidentifier[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nslimitidentifier resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nslimitidentifier[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nslimitidentifier obj = new nslimitidentifier();
		options option = new options();
		option.set_filter(filter);
		nslimitidentifier[] response = (nslimitidentifier[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nslimitidentifier resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nslimitidentifier obj = new nslimitidentifier();
		options option = new options();
		option.set_count(true);
		nslimitidentifier[] response = (nslimitidentifier[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nslimitidentifier resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nslimitidentifier obj = new nslimitidentifier();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nslimitidentifier[] response = (nslimitidentifier[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nslimitidentifier resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nslimitidentifier obj = new nslimitidentifier();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nslimitidentifier[] response = (nslimitidentifier[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class modeEnum {
		public static final String CONNECTION = "CONNECTION";
		public static final String REQUEST_RATE = "REQUEST_RATE";
		public static final String NONE = "NONE";
	}
	public static class limittypeEnum {
		public static final String BURSTY = "BURSTY";
		public static final String SMOOTH = "SMOOTH";
	}
}
