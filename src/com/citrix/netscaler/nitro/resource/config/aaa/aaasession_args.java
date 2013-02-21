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

package com.citrix.netscaler.nitro.resource.config.aaa;

/**
	* Provides additional arguments required for fetching the aaasession resource.
	*/

public class aaasession_args 
{
	private String username;
	private String groupname;
	private String iip;
	private String netmask;

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* The group name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* The group name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* Intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_iip(String iip) throws Exception{
		this.iip = iip;
	}

	/**
	* <pre>
	* Intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_iip() throws Exception {
		return this.iip;
	}

	/**
	* <pre>
	* The netmask associated with the intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The netmask associated with the intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

}
