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
	* Provides additional arguments required for fetching the aaagroup resource.
	*/

public class aaagroup_args 
{
	private Boolean loggedin;

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of the users in a group if at least one user in the group is logged in. When used with a group name, the system lists the users in the group who are logged in.
	* </pre>
	*/
	public void set_loggedin(boolean loggedin) throws Exception {
		this.loggedin = new Boolean(loggedin);
	}

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of the users in a group if at least one user in the group is logged in. When used with a group name, the system lists the users in the group who are logged in.
	* </pre>
	*/
	public void set_loggedin(Boolean loggedin) throws Exception{
		this.loggedin = loggedin;
	}

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of the users in a group if at least one user in the group is logged in. When used with a group name, the system lists the users in the group who are logged in.
	* </pre>
	*/
	public Boolean get_loggedin() throws Exception {
		return this.loggedin;
	}

}
