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

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systementitydata_response extends base_response
{
	public systementitydata systementitydata;
}
/**
* Configuration for entity data resource.
*/

public class systementitydata extends base_resource
{
	private String type;
	private String name;
	private Boolean alldeleted;
	private Boolean allinactive;
	private String datasource;
	private Integer core;
	private String counters;
	private String starttime;
	private String endtime;
	private Integer last;
	private String unit;

	//------- Read only Parameter ---------;

	private String response;
	private Long startupdate;
	private Long lastupdate;

	/**
	* <pre>
	* Specify the entity type.
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Specify the entity type.
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Specify the entity name.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Specify the entity name.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Specify this if you would like to delete information about all deleted entities from the database.
	* </pre>
	*/
	public void set_alldeleted(boolean alldeleted) throws Exception {
		this.alldeleted = new Boolean(alldeleted);
	}

	/**
	* <pre>
	* Specify this if you would like to delete information about all deleted entities from the database.
	* </pre>
	*/
	public void set_alldeleted(Boolean alldeleted) throws Exception{
		this.alldeleted = alldeleted;
	}

	/**
	* <pre>
	* Specify this if you would like to delete information about all deleted entities from the database.
	* </pre>
	*/
	public Boolean get_alldeleted() throws Exception {
		return this.alldeleted;
	}

	/**
	* <pre>
	* Specify this if you would like to delete information about all inactive entities from the database.
	* </pre>
	*/
	public void set_allinactive(boolean allinactive) throws Exception {
		this.allinactive = new Boolean(allinactive);
	}

	/**
	* <pre>
	* Specify this if you would like to delete information about all inactive entities from the database.
	* </pre>
	*/
	public void set_allinactive(Boolean allinactive) throws Exception{
		this.allinactive = allinactive;
	}

	/**
	* <pre>
	* Specify this if you would like to delete information about all inactive entities from the database.
	* </pre>
	*/
	public Boolean get_allinactive() throws Exception {
		return this.allinactive;
	}

	/**
	* <pre>
	* Specifies the source which contains all the stored counter values.
	* </pre>
	*/
	public void set_datasource(String datasource) throws Exception{
		this.datasource = datasource;
	}

	/**
	* <pre>
	* Specifies the source which contains all the stored counter values.
	* </pre>
	*/
	public String get_datasource() throws Exception {
		return this.datasource;
	}

	/**
	* <pre>
	* Specify core ID of the PE in nCore.
	* </pre>
	*/
	public void set_core(int core) throws Exception {
		this.core = new Integer(core);
	}

	/**
	* <pre>
	* Specify core ID of the PE in nCore.
	* </pre>
	*/
	public void set_core(Integer core) throws Exception{
		this.core = core;
	}

	/**
	* <pre>
	* Specify core ID of the PE in nCore.
	* </pre>
	*/
	public Integer get_core() throws Exception {
		return this.core;
	}

	/**
	* <pre>
	* Specify the counters to be collected.
	* </pre>
	*/
	public void set_counters(String counters) throws Exception{
		this.counters = counters;
	}

	/**
	* <pre>
	* Specify the counters to be collected.
	* </pre>
	*/
	public String get_counters() throws Exception {
		return this.counters;
	}

	/**
	* <pre>
	* Specify start time in mmddyyyyhhmm to start collecting values from that timestamp.
	* </pre>
	*/
	public void set_starttime(String starttime) throws Exception{
		this.starttime = starttime;
	}

	/**
	* <pre>
	* Specify start time in mmddyyyyhhmm to start collecting values from that timestamp.
	* </pre>
	*/
	public String get_starttime() throws Exception {
		return this.starttime;
	}

	/**
	* <pre>
	* Specify end time in mmddyyyyhhmm upto which values have to be collected.
	* </pre>
	*/
	public void set_endtime(String endtime) throws Exception{
		this.endtime = endtime;
	}

	/**
	* <pre>
	* Specify end time in mmddyyyyhhmm upto which values have to be collected.
	* </pre>
	*/
	public String get_endtime() throws Exception {
		return this.endtime;
	}

	/**
	* <pre>
	* Last is literal way of saying a certain time period from the current moment. Example: -last 1 hour, -last 1 day, et cetera.<br> Default value: 1
	* </pre>
	*/
	public void set_last(int last) throws Exception {
		this.last = new Integer(last);
	}

	/**
	* <pre>
	* Last is literal way of saying a certain time period from the current moment. Example: -last 1 hour, -last 1 day, et cetera.<br> Default value: 1
	* </pre>
	*/
	public void set_last(Integer last) throws Exception{
		this.last = last;
	}

	/**
	* <pre>
	* Last is literal way of saying a certain time period from the current moment. Example: -last 1 hour, -last 1 day, et cetera.<br> Default value: 1
	* </pre>
	*/
	public Integer get_last() throws Exception {
		return this.last;
	}

	/**
	* <pre>
	* Specify the time period from current moment. Example 1 x where x = hours/ days/ years.<br> Possible values = HOURS, DAYS, MONTHS
	* </pre>
	*/
	public void set_unit(String unit) throws Exception{
		this.unit = unit;
	}

	/**
	* <pre>
	* Specify the time period from current moment. Example 1 x where x = hours/ days/ years.<br> Possible values = HOURS, DAYS, MONTHS
	* </pre>
	*/
	public String get_unit() throws Exception {
		return this.unit;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_response() throws Exception {
		return this.response;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_startupdate() throws Exception {
		return this.startupdate;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_lastupdate() throws Exception {
		return this.lastupdate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		systementitydata[] resources = new systementitydata[1];
		systementitydata_response result = (systementitydata_response) service.get_payload_formatter().string_to_resource(systementitydata_response.class, response);
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
		resources[0] = result.systementitydata;
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
	* Use this API to delete systementitydata.
	*/
	public static base_response delete(nitro_service client, systementitydata resource) throws Exception {
		systementitydata deleteresource = new systementitydata();
		deleteresource.type = resource.type;
		deleteresource.name = resource.name;
		deleteresource.alldeleted = resource.alldeleted;
		deleteresource.allinactive = resource.allinactive;
		deleteresource.datasource = resource.datasource;
		deleteresource.core = resource.core;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to fetch a systementitydata resource.
	*/
	public static systementitydata get(nitro_service service, systementitydata obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		systementitydata response = (systementitydata) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch all the systementitydata resources that are configured on netscaler.
	* This uses systementitydata_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static systementitydata[] get(nitro_service service, systementitydata_args args) throws Exception{
		systementitydata obj = new systementitydata();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		systementitydata[] response = (systementitydata[])obj.get_resources(service, option);
		return response;
	}

	public static class unitEnum {
		public static final String HOURS = "HOURS";
		public static final String DAYS = "DAYS";
		public static final String MONTHS = "MONTHS";
	}
}
