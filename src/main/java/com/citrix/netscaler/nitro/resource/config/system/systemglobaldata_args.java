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

/**
	* Provides additional arguments required for fetching the systemglobaldata resource.
	*/

public class systemglobaldata_args 
{
	private String counters;
	private String countergroup;
	private String starttime;
	private String endtime;
	private Integer last;
	private String unit;
	private String datasource;
	private Integer core;

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
	* Specify the (counter) group name which contains all the counters specific to this particular group.
	* </pre>
	*/
	public void set_countergroup(String countergroup) throws Exception{
		this.countergroup = countergroup;
	}

	/**
	* <pre>
	* Specify the (counter) group name which contains all the counters specific to this particular group.
	* </pre>
	*/
	public String get_countergroup() throws Exception {
		return this.countergroup;
	}

	/**
	* <pre>
	* Specify start time in mmddyyyyhhmm to satrt collecting values from that timestamp.
	* </pre>
	*/
	public void set_starttime(String starttime) throws Exception{
		this.starttime = starttime;
	}

	/**
	* <pre>
	* Specify start time in mmddyyyyhhmm to satrt collecting values from that timestamp.
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
	* Specify the  time period from current moment. Example 1 x where x = hours/ days/ years.<br> Possible values = HOURS, DAYS, MONTHS
	* </pre>
	*/
	public void set_unit(String unit) throws Exception{
		this.unit = unit;
	}

	/**
	* <pre>
	* Specify the  time period from current moment. Example 1 x where x = hours/ days/ years.<br> Possible values = HOURS, DAYS, MONTHS
	* </pre>
	*/
	public String get_unit() throws Exception {
		return this.unit;
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

	public static class unitEnum {
		public static final String HOURS = "HOURS";
		public static final String DAYS = "DAYS";
		public static final String MONTHS = "MONTHS";
	}
}
