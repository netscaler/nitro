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

package com.citrix.netscaler.nitro.resource.config.snmp;

/**
	* Provides additional arguments required for fetching the snmpoid resource.
	*/

public class snmpoid_args 
{
	private String entitytype;

	/**
	* <pre>
	* The type of entity whose SNMP OIDs you want to displayType of entity whose SNMP OIDs you want the NetScaler appliance to display.<br> Possible values = VSERVER, SERVICE, SERVICEGROUP
	* </pre>
	*/
	public void set_entitytype(String entitytype) throws Exception{
		this.entitytype = entitytype;
	}

	/**
	* <pre>
	* The type of entity whose SNMP OIDs you want to displayType of entity whose SNMP OIDs you want the NetScaler appliance to display.<br> Possible values = VSERVER, SERVICE, SERVICEGROUP
	* </pre>
	*/
	public String get_entitytype() throws Exception {
		return this.entitytype;
	}

	public static class entitytypeEnum {
		public static final String VSERVER = "VSERVER";
		public static final String SERVICE = "SERVICE";
		public static final String SERVICEGROUP = "SERVICEGROUP";
	}
}
