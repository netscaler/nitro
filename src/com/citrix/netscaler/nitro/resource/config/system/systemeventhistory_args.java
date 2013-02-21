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
	* Provides additional arguments required for fetching the systemeventhistory resource.
	*/

public class systemeventhistory_args 
{
	private String starttime;
	private String endtime;
	private Integer last;
	private String unit;
	private String datasource;

	/**
	* <pre>
	* Specify start time in mmddyyyyhhmm.
	* </pre>
	*/
	public void set_starttime(String starttime) throws Exception{
		this.starttime = starttime;
	}

	/**
	* <pre>
	* Specify start time in mmddyyyyhhmm.
	* </pre>
	*/
	public String get_starttime() throws Exception {
		return this.starttime;
	}

	/**
	* <pre>
	* Specify end time in mmddyyyyhhmm.
	* </pre>
	*/
	public void set_endtime(String endtime) throws Exception{
		this.endtime = endtime;
	}

	/**
	* <pre>
	* Specify end time in mmddyyyyhhmm.
	* </pre>
	*/
	public String get_endtime() throws Exception {
		return this.endtime;
	}

	/**
	* <pre>
	* Specify the  counters.<br> Default value: 1
	* </pre>
	*/
	public void set_last(int last) throws Exception {
		this.last = new Integer(last);
	}

	/**
	* <pre>
	* Specify the  counters.<br> Default value: 1
	* </pre>
	*/
	public void set_last(Integer last) throws Exception{
		this.last = last;
	}

	/**
	* <pre>
	* Specify the  counters.<br> Default value: 1
	* </pre>
	*/
	public Integer get_last() throws Exception {
		return this.last;
	}

	/**
	* <pre>
	* Specify the  Units.<br> Possible values = HOURS, DAYS, MONTHS
	* </pre>
	*/
	public void set_unit(String unit) throws Exception{
		this.unit = unit;
	}

	/**
	* <pre>
	* Specify the  Units.<br> Possible values = HOURS, DAYS, MONTHS
	* </pre>
	*/
	public String get_unit() throws Exception {
		return this.unit;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public void set_datasource(String datasource) throws Exception{
		this.datasource = datasource;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public String get_datasource() throws Exception {
		return this.datasource;
	}

	public static class unitEnum {
		public static final String HOURS = "HOURS";
		public static final String DAYS = "DAYS";
		public static final String MONTHS = "MONTHS";
	}
}
