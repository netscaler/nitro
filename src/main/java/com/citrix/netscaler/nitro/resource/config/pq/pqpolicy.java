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

package com.citrix.netscaler.nitro.resource.config.pq;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class pqpolicy_response extends base_response
{
	public pqpolicy[] pqpolicy;
}
/**
* Configuration for PQ policy resource.
*/

public class pqpolicy extends base_resource
{
	private String policyname;
	private String rule;
	private Long priority;
	private Long weight;
	private Long qdepth;
	private Long polqdepth;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long __count;

	/**
	* <pre>
	* Name for the priority queuing policy. Must begin with a letter, number, or the underscore symbol (_). Other characters allowed, after the first character, are the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), and colon (:) characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name for the priority queuing policy. Must begin with a letter, number, or the underscore symbol (_). Other characters allowed, after the first character, are the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), and colon (:) characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Expression or name of a named expression, against which the request is evaluated. The priority queuing policy is applied if the rule evaluates to true.

Note:
* On the command line interface, if the expression includes blank spaces, the entire expression must be enclosed in double quotation marks.
* If the expression itself includes double quotation marks, you must escape the quotations by using the \ character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you will not have to escape the double quotation marks.
* Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression or name of a named expression, against which the request is evaluated. The priority queuing policy is applied if the rule evaluates to true.

Note:
* On the command line interface, if the expression includes blank spaces, the entire expression must be enclosed in double quotation marks.
* If the expression itself includes double quotation marks, you must escape the quotations by using the \ character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you will not have to escape the double quotation marks.
* Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Priority for queuing the request. If server resources are not available for a request that matches the configured rule, this option specifies a priority for queuing the request until the server resources are available again. Enter the value of positive_integer as 1, 2 or 3. The highest priority level is 1 and the lowest priority value is 3.<br> Minimum value =  1<br> Maximum value =  3
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority for queuing the request. If server resources are not available for a request that matches the configured rule, this option specifies a priority for queuing the request until the server resources are available again. Enter the value of positive_integer as 1, 2 or 3. The highest priority level is 1 and the lowest priority value is 3.<br> Minimum value =  1<br> Maximum value =  3
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority for queuing the request. If server resources are not available for a request that matches the configured rule, this option specifies a priority for queuing the request until the server resources are available again. Enter the value of positive_integer as 1, 2 or 3. The highest priority level is 1 and the lowest priority value is 3.<br> Minimum value =  1<br> Maximum value =  3
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Weight of the priority. Each priority is assigned a weight according to which it is served when server resources are available. The weight for a higher priority request must be set higher than that of a lower priority request.
To prevent delays for low-priority requests across multiple priority levels, you can configure weighted queuing for serving requests. The default weights for the priorities
are:
* Gold - Priority 1 - Weight 3
* Silver - Priority 2 - Weight 2
* Bronze - Priority 3 - Weight 1
Specify the weights as 0 through 101. A weight of 0 indicates that the particular priority level should be served only when there are no requests in any of the priority queues.
A weight of 101 specifies a weight of infinity. This means that this priority level is served irrespective of the number of clients waiting in other priority queues.<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Weight of the priority. Each priority is assigned a weight according to which it is served when server resources are available. The weight for a higher priority request must be set higher than that of a lower priority request.
To prevent delays for low-priority requests across multiple priority levels, you can configure weighted queuing for serving requests. The default weights for the priorities
are:
* Gold - Priority 1 - Weight 3
* Silver - Priority 2 - Weight 2
* Bronze - Priority 3 - Weight 1
Specify the weights as 0 through 101. A weight of 0 indicates that the particular priority level should be served only when there are no requests in any of the priority queues.
A weight of 101 specifies a weight of infinity. This means that this priority level is served irrespective of the number of clients waiting in other priority queues.<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Weight of the priority. Each priority is assigned a weight according to which it is served when server resources are available. The weight for a higher priority request must be set higher than that of a lower priority request.
To prevent delays for low-priority requests across multiple priority levels, you can configure weighted queuing for serving requests. The default weights for the priorities
are:
* Gold - Priority 1 - Weight 3
* Silver - Priority 2 - Weight 2
* Bronze - Priority 3 - Weight 1
Specify the weights as 0 through 101. A weight of 0 indicates that the particular priority level should be served only when there are no requests in any of the priority queues.
A weight of 101 specifies a weight of infinity. This means that this priority level is served irrespective of the number of clients waiting in other priority queues.<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* Queue depth threshold value. When the queue size (number of requests in the queue) on the virtual server to which this policy is bound, increases to the specified qDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_qdepth(long qdepth) throws Exception {
		this.qdepth = new Long(qdepth);
	}

	/**
	* <pre>
	* Queue depth threshold value. When the queue size (number of requests in the queue) on the virtual server to which this policy is bound, increases to the specified qDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_qdepth(Long qdepth) throws Exception{
		this.qdepth = qdepth;
	}

	/**
	* <pre>
	* Queue depth threshold value. When the queue size (number of requests in the queue) on the virtual server to which this policy is bound, increases to the specified qDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_qdepth() throws Exception {
		return this.qdepth;
	}

	/**
	* <pre>
	* Policy queue depth threshold value. When the policy queue size (number of requests in all the queues belonging to this policy) increases to the specified polqDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_polqdepth(long polqdepth) throws Exception {
		this.polqdepth = new Long(polqdepth);
	}

	/**
	* <pre>
	* Policy queue depth threshold value. When the policy queue size (number of requests in all the queues belonging to this policy) increases to the specified polqDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_polqdepth(Long polqdepth) throws Exception{
		this.polqdepth = polqdepth;
	}

	/**
	* <pre>
	* Policy queue depth threshold value. When the policy queue size (number of requests in all the queues belonging to this policy) increases to the specified polqDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_polqdepth() throws Exception {
		return this.polqdepth;
	}

	/**
	* <pre>
	* Total number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		pqpolicy_response result = (pqpolicy_response) service.get_payload_formatter().string_to_resource(pqpolicy_response.class, response);
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
		return result.pqpolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.policyname;
	}

	/**
	* Use this API to add pqpolicy.
	*/
	public static base_response add(nitro_service client, pqpolicy resource) throws Exception {
		pqpolicy addresource = new pqpolicy();
		addresource.policyname = resource.policyname;
		addresource.rule = resource.rule;
		addresource.priority = resource.priority;
		addresource.weight = resource.weight;
		addresource.qdepth = resource.qdepth;
		addresource.polqdepth = resource.polqdepth;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add pqpolicy resources.
	*/
	public static base_responses add(nitro_service client, pqpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			pqpolicy addresources[] = new pqpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new pqpolicy();
				addresources[i].policyname = resources[i].policyname;
				addresources[i].rule = resources[i].rule;
				addresources[i].priority = resources[i].priority;
				addresources[i].weight = resources[i].weight;
				addresources[i].qdepth = resources[i].qdepth;
				addresources[i].polqdepth = resources[i].polqdepth;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete pqpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String policyname) throws Exception {
		pqpolicy deleteresource = new pqpolicy();
		deleteresource.policyname = policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete pqpolicy.
	*/
	public static base_response delete(nitro_service client, pqpolicy resource) throws Exception {
		pqpolicy deleteresource = new pqpolicy();
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete pqpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String policyname[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			pqpolicy deleteresources[] = new pqpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				deleteresources[i] = new pqpolicy();
				deleteresources[i].policyname = policyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete pqpolicy resources.
	*/
	public static base_responses delete(nitro_service client, pqpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			pqpolicy deleteresources[] = new pqpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new pqpolicy();
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update pqpolicy.
	*/
	public static base_response update(nitro_service client, pqpolicy resource) throws Exception {
		pqpolicy updateresource = new pqpolicy();
		updateresource.policyname = resource.policyname;
		updateresource.weight = resource.weight;
		updateresource.qdepth = resource.qdepth;
		updateresource.polqdepth = resource.polqdepth;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update pqpolicy resources.
	*/
	public static base_responses update(nitro_service client, pqpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			pqpolicy updateresources[] = new pqpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new pqpolicy();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].qdepth = resources[i].qdepth;
				updateresources[i].polqdepth = resources[i].polqdepth;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of pqpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, pqpolicy resource, String[] args) throws Exception{
		pqpolicy unsetresource = new pqpolicy();
		unsetresource.policyname = resource.policyname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of pqpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String policyname[], String args[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			pqpolicy unsetresources[] = new pqpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				unsetresources[i] = new pqpolicy();
				unsetresources[i].policyname = policyname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of pqpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, pqpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			pqpolicy unsetresources[] = new pqpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new pqpolicy();
				unsetresources[i].policyname = resources[i].policyname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the pqpolicy resources that are configured on netscaler.
	*/
	public static pqpolicy[] get(nitro_service service) throws Exception{
		pqpolicy obj = new pqpolicy();
		pqpolicy[] response = (pqpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the pqpolicy resources that are configured on netscaler.
	*/
	public static pqpolicy[] get(nitro_service service, options option) throws Exception{
		pqpolicy obj = new pqpolicy();
		pqpolicy[] response = (pqpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch pqpolicy resource of given name .
	*/
	public static pqpolicy get(nitro_service service, String policyname) throws Exception{
		pqpolicy obj = new pqpolicy();
		obj.set_policyname(policyname);
		pqpolicy response = (pqpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch pqpolicy resources of given names .
	*/
	public static pqpolicy[] get(nitro_service service, String policyname[]) throws Exception{
		if (policyname !=null && policyname.length>0) {
			pqpolicy response[] = new pqpolicy[policyname.length];
			pqpolicy obj[] = new pqpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++) {
				obj[i] = new pqpolicy();
				obj[i].set_policyname(policyname[i]);
				response[i] = (pqpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of pqpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static pqpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_filter(filter);
		pqpolicy[] response = (pqpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of pqpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static pqpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_filter(filter);
		pqpolicy[] response = (pqpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the pqpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_count(true);
		pqpolicy[] response = (pqpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of pqpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		pqpolicy[] response = (pqpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of pqpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		pqpolicy[] response = (pqpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
