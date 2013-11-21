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

package com.citrix.netscaler.nitro.resource.stat.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nslimitidentifier_response extends base_response
{
	public nslimitidentifier_stats[] nslimitidentifier;
}
/**
* Statistics for limit Indetifier resource.
*/

public class nslimitidentifier_stats extends base_resource
{
	private String name;
	private String[] pattern;
	private String clearstats;
	private String sortby;
	private String sortorder;
	private Long ratelmtobjhits;
	private Long ratelmtobjdrops;
	private Long ratelmtsessionobjhits;

	/**
	* <pre>
	* The name of the identifier.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the identifier.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Pattern for the selector field, ? means field is required, * means field value does not matter, anything else is a regular pattern
	* </pre>
	*/
	public void set_pattern(String[] pattern) throws Exception{
		this.pattern = pattern;
	}

	/**
	* <pre>
	* Pattern for the selector field, ? means field is required, * means field value does not matter, anything else is a regular pattern.
	* </pre>
	*/
	public String[] get_pattern() throws Exception {
		return this.pattern;
	}

	/**
	* <pre>
	* Clear the statsistics / counters
	* </pre>
	*/
	public void set_clearstats(String clearstats) throws Exception{
		this.clearstats = clearstats;
	}

	/**
	* <pre>
	* Clear the statsistics / counters.<br> Possible values = basic, full
	* </pre>
	*/
	public String get_clearstats() throws Exception {
		return this.clearstats;
	}

	/**
	* <pre>
	* use this argument to sort by specific key
	* </pre>
	*/
	public void set_sortby(String sortby) throws Exception{
		this.sortby = sortby;
	}

	/**
	* <pre>
	* use this argument to sort by specific key.<br> Possible values = 
	* </pre>
	*/
	public String get_sortby() throws Exception {
		return this.sortby;
	}

	/**
	* <pre>
	* use this argument to specify sort order
	* </pre>
	*/
	public void set_sortorder(String sortorder) throws Exception{
		this.sortorder = sortorder;
	}

	/**
	* <pre>
	* use this argument to specify sort order.<br> Default value: SORT_DESCENDING<br> Possible values = ascending, descending
	* </pre>
	*/
	public String get_sortorder() throws Exception {
		return this.sortorder;
	}

	/**
	* <pre>
	* Total hits.
	* </pre>
	*/
	public Long get_ratelmtobjhits() throws Exception {
		return this.ratelmtobjhits;
	}

	/**
	* <pre>
	* Total hits.
	* </pre>
	*/
	public Long get_ratelmtsessionobjhits() throws Exception {
		return this.ratelmtsessionobjhits;
	}

	/**
	* <pre>
	* Total drops
	* </pre>
	*/
	public Long get_ratelmtobjdrops() throws Exception {
		return this.ratelmtobjdrops;
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
		return this.name;
	}

	/**
	* Use this API to fetch the statistics of all nslimitidentifier_stats resources that are configured on netscaler.
	*/
	public static nslimitidentifier_stats[] get(nitro_service service) throws Exception{
		nslimitidentifier_stats obj = new nslimitidentifier_stats();
		nslimitidentifier_stats[] response = (nslimitidentifier_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all nslimitidentifier_stats resources that are configured on netscaler.
	*/
	public static nslimitidentifier_stats[] get(nitro_service service, options option) throws Exception{
		nslimitidentifier_stats obj = new nslimitidentifier_stats();
		nslimitidentifier_stats[] response = (nslimitidentifier_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of nslimitidentifier_stats resource of given name .
	*/
	public static nslimitidentifier_stats get(nitro_service service, String name) throws Exception{
		nslimitidentifier_stats obj = new nslimitidentifier_stats();
		obj.set_name(name);
		nslimitidentifier_stats response = (nslimitidentifier_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
	public static class sortorderEnum {
		public static final String ascending = "ascending";
		public static final String descending = "descending";
	}
}
