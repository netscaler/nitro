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

package com.citrix.netscaler.nitro.resource.config.audit;

/**
	* Provides additional arguments required for fetching the auditmessages resource.
	*/

public class auditmessages_args 
{
	private String[] loglevel;
	private Long numofmesgs;

	/**
	* <pre>
	* The log level filter.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public void set_loglevel(String[] loglevel) throws Exception{
		this.loglevel = loglevel;
	}

	/**
	* <pre>
	* The log level filter.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public String[] get_loglevel() throws Exception {
		return this.loglevel;
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public void set_numofmesgs(long numofmesgs) throws Exception {
		this.numofmesgs = new Long(numofmesgs);
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public void set_numofmesgs(Long numofmesgs) throws Exception{
		this.numofmesgs = numofmesgs;
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public Long get_numofmesgs() throws Exception {
		return this.numofmesgs;
	}

	public static class loglevelEnum {
		public static final String ALL = "ALL";
		public static final String EMERGENCY = "EMERGENCY";
		public static final String ALERT = "ALERT";
		public static final String CRITICAL = "CRITICAL";
		public static final String ERROR = "ERROR";
		public static final String WARNING = "WARNING";
		public static final String NOTICE = "NOTICE";
		public static final String INFORMATIONAL = "INFORMATIONAL";
		public static final String DEBUG = "DEBUG";
		public static final String NONE = "NONE";
	}
}
