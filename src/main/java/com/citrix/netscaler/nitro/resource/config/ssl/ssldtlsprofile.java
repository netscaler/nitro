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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ssldtlsprofile_response extends base_response
{
	public ssldtlsprofile[] ssldtlsprofile;
}
/**
* Configuration for DTLS profile resource.
*/

public class ssldtlsprofile extends base_resource
{
	private String name;
	private String pmtudiscovery;
	private Long maxrecordsize;
	private Long maxretrytime;
	private String helloverifyrequest;
	private String terminatesession;
	private Long maxpacketsize;
	private Long __count;

	/**
	* <pre>
	* Name of the DTLS profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the DTLS profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Enable/disable PMTU discovery.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_pmtudiscovery(String pmtudiscovery) throws Exception{
		this.pmtudiscovery = pmtudiscovery;
	}

	/**
	* <pre>
	* Enable/disable PMTU discovery.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_pmtudiscovery() throws Exception {
		return this.pmtudiscovery;
	}

	/**
	* <pre>
	* Maximum record size.<br> Default value: 1460<br> Minimum value =  0<br> Maximum value =  1472
	* </pre>
	*/
	public void set_maxrecordsize(long maxrecordsize) throws Exception {
		this.maxrecordsize = new Long(maxrecordsize);
	}

	/**
	* <pre>
	* Maximum record size.<br> Default value: 1460<br> Minimum value =  0<br> Maximum value =  1472
	* </pre>
	*/
	public void set_maxrecordsize(Long maxrecordsize) throws Exception{
		this.maxrecordsize = maxrecordsize;
	}

	/**
	* <pre>
	* Maximum record size.<br> Default value: 1460<br> Minimum value =  0<br> Maximum value =  1472
	* </pre>
	*/
	public Long get_maxrecordsize() throws Exception {
		return this.maxrecordsize;
	}

	/**
	* <pre>
	* Maximum retry time.<br> Default value: 3
	* </pre>
	*/
	public void set_maxretrytime(long maxretrytime) throws Exception {
		this.maxretrytime = new Long(maxretrytime);
	}

	/**
	* <pre>
	* Maximum retry time.<br> Default value: 3
	* </pre>
	*/
	public void set_maxretrytime(Long maxretrytime) throws Exception{
		this.maxretrytime = maxretrytime;
	}

	/**
	* <pre>
	* Maximum retry time.<br> Default value: 3
	* </pre>
	*/
	public Long get_maxretrytime() throws Exception {
		return this.maxretrytime;
	}

	/**
	* <pre>
	* Enable/disable sending of hello verify request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_helloverifyrequest(String helloverifyrequest) throws Exception{
		this.helloverifyrequest = helloverifyrequest;
	}

	/**
	* <pre>
	* Enable/disable sending of hello verify request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_helloverifyrequest() throws Exception {
		return this.helloverifyrequest;
	}

	/**
	* <pre>
	* Option to decide whether to terminate the session if bad MAC decode error happens.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_terminatesession(String terminatesession) throws Exception{
		this.terminatesession = terminatesession;
	}

	/**
	* <pre>
	* Option to decide whether to terminate the session if bad MAC decode error happens.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_terminatesession() throws Exception {
		return this.terminatesession;
	}

	/**
	* <pre>
	* Max packet count to reassemble for a fragmented record – attack protection if client send small packets.<br> Default value: 120<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public void set_maxpacketsize(long maxpacketsize) throws Exception {
		this.maxpacketsize = new Long(maxpacketsize);
	}

	/**
	* <pre>
	* Max packet count to reassemble for a fragmented record – attack protection if client send small packets.<br> Default value: 120<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public void set_maxpacketsize(Long maxpacketsize) throws Exception{
		this.maxpacketsize = maxpacketsize;
	}

	/**
	* <pre>
	* Max packet count to reassemble for a fragmented record – attack protection if client send small packets.<br> Default value: 120<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public Long get_maxpacketsize() throws Exception {
		return this.maxpacketsize;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		ssldtlsprofile_response result = (ssldtlsprofile_response) service.get_payload_formatter().string_to_resource(ssldtlsprofile_response.class, response);
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
		return result.ssldtlsprofile;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add ssldtlsprofile.
	*/
	public static base_response add(nitro_service client, ssldtlsprofile resource) throws Exception {
		ssldtlsprofile addresource = new ssldtlsprofile();
		addresource.name = resource.name;
		addresource.pmtudiscovery = resource.pmtudiscovery;
		addresource.maxrecordsize = resource.maxrecordsize;
		addresource.maxretrytime = resource.maxretrytime;
		addresource.helloverifyrequest = resource.helloverifyrequest;
		addresource.terminatesession = resource.terminatesession;
		addresource.maxpacketsize = resource.maxpacketsize;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add ssldtlsprofile resources.
	*/
	public static base_responses add(nitro_service client, ssldtlsprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ssldtlsprofile addresources[] = new ssldtlsprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new ssldtlsprofile();
				addresources[i].name = resources[i].name;
				addresources[i].pmtudiscovery = resources[i].pmtudiscovery;
				addresources[i].maxrecordsize = resources[i].maxrecordsize;
				addresources[i].maxretrytime = resources[i].maxretrytime;
				addresources[i].helloverifyrequest = resources[i].helloverifyrequest;
				addresources[i].terminatesession = resources[i].terminatesession;
				addresources[i].maxpacketsize = resources[i].maxpacketsize;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete ssldtlsprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		ssldtlsprofile deleteresource = new ssldtlsprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ssldtlsprofile.
	*/
	public static base_response delete(nitro_service client, ssldtlsprofile resource) throws Exception {
		ssldtlsprofile deleteresource = new ssldtlsprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ssldtlsprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			ssldtlsprofile deleteresources[] = new ssldtlsprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new ssldtlsprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete ssldtlsprofile resources.
	*/
	public static base_responses delete(nitro_service client, ssldtlsprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ssldtlsprofile deleteresources[] = new ssldtlsprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new ssldtlsprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update ssldtlsprofile.
	*/
	public static base_response update(nitro_service client, ssldtlsprofile resource) throws Exception {
		ssldtlsprofile updateresource = new ssldtlsprofile();
		updateresource.name = resource.name;
		updateresource.pmtudiscovery = resource.pmtudiscovery;
		updateresource.maxrecordsize = resource.maxrecordsize;
		updateresource.maxretrytime = resource.maxretrytime;
		updateresource.helloverifyrequest = resource.helloverifyrequest;
		updateresource.terminatesession = resource.terminatesession;
		updateresource.maxpacketsize = resource.maxpacketsize;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update ssldtlsprofile resources.
	*/
	public static base_responses update(nitro_service client, ssldtlsprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ssldtlsprofile updateresources[] = new ssldtlsprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new ssldtlsprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].pmtudiscovery = resources[i].pmtudiscovery;
				updateresources[i].maxrecordsize = resources[i].maxrecordsize;
				updateresources[i].maxretrytime = resources[i].maxretrytime;
				updateresources[i].helloverifyrequest = resources[i].helloverifyrequest;
				updateresources[i].terminatesession = resources[i].terminatesession;
				updateresources[i].maxpacketsize = resources[i].maxpacketsize;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of ssldtlsprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, ssldtlsprofile resource, String[] args) throws Exception{
		ssldtlsprofile unsetresource = new ssldtlsprofile();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of ssldtlsprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			ssldtlsprofile unsetresources[] = new ssldtlsprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new ssldtlsprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of ssldtlsprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, ssldtlsprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ssldtlsprofile unsetresources[] = new ssldtlsprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new ssldtlsprofile();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the ssldtlsprofile resources that are configured on netscaler.
	*/
	public static ssldtlsprofile[] get(nitro_service service) throws Exception{
		ssldtlsprofile obj = new ssldtlsprofile();
		ssldtlsprofile[] response = (ssldtlsprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the ssldtlsprofile resources that are configured on netscaler.
	*/
	public static ssldtlsprofile[] get(nitro_service service, options option) throws Exception{
		ssldtlsprofile obj = new ssldtlsprofile();
		ssldtlsprofile[] response = (ssldtlsprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch ssldtlsprofile resource of given name .
	*/
	public static ssldtlsprofile get(nitro_service service, String name) throws Exception{
		ssldtlsprofile obj = new ssldtlsprofile();
		obj.set_name(name);
		ssldtlsprofile response = (ssldtlsprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch ssldtlsprofile resources of given names .
	*/
	public static ssldtlsprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			ssldtlsprofile response[] = new ssldtlsprofile[name.length];
			ssldtlsprofile obj[] = new ssldtlsprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new ssldtlsprofile();
				obj[i].set_name(name[i]);
				response[i] = (ssldtlsprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of ssldtlsprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static ssldtlsprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		ssldtlsprofile obj = new ssldtlsprofile();
		options option = new options();
		option.set_filter(filter);
		ssldtlsprofile[] response = (ssldtlsprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ssldtlsprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ssldtlsprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ssldtlsprofile obj = new ssldtlsprofile();
		options option = new options();
		option.set_filter(filter);
		ssldtlsprofile[] response = (ssldtlsprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ssldtlsprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		ssldtlsprofile obj = new ssldtlsprofile();
		options option = new options();
		option.set_count(true);
		ssldtlsprofile[] response = (ssldtlsprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of ssldtlsprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		ssldtlsprofile obj = new ssldtlsprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ssldtlsprofile[] response = (ssldtlsprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ssldtlsprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ssldtlsprofile obj = new ssldtlsprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ssldtlsprofile[] response = (ssldtlsprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class terminatesessionEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class pmtudiscoveryEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class helloverifyrequestEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
