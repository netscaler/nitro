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

package com.citrix.netscaler.nitro.resource.stat.dos;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dos_response extends base_response
{
	public dos_stats dos;
}

public class dos_stats extends base_resource
{
	private Long dostotconditiontriggered;
	private Long dosconditiontriggeredrate;
	private Long dostotvalidcookies;
	private Long dosvalidcookiesrate;
	private Long dostotdospriorityclients;
	private Long dosdospriorityclientsrate;

	/**
	* <pre>
	* Number of clients from whom the NetScaler appliance received a valid DOS cookie.
	* </pre>
	*/
	public Long get_dostotvalidcookies() throws Exception {
		return this.dostotvalidcookies;
	}

	/**
	* <pre>
	* Number of clients from whom the NetScaler appliance received a valid DOS cookie.
	* </pre>
	*/
	public Long get_dosvalidcookiesrate() throws Exception {
		return this.dosvalidcookiesrate;
	}

	/**
	* <pre>
	* Number of valid clients that were given DOS priority.
	* </pre>
	*/
	public Long get_dosdospriorityclientsrate() throws Exception {
		return this.dosdospriorityclientsrate;
	}

	/**
	* <pre>
	* Number of times the NetScaler appliance triggered the DOS JavaScript due to a condition match.
	* </pre>
	*/
	public Long get_dosconditiontriggeredrate() throws Exception {
		return this.dosconditiontriggeredrate;
	}

	/**
	* <pre>
	* Number of times the NetScaler appliance triggered the DOS JavaScript due to a condition match.
	* </pre>
	*/
	public Long get_dostotconditiontriggered() throws Exception {
		return this.dostotconditiontriggered;
	}

	/**
	* <pre>
	* Number of valid clients that were given DOS priority.
	* </pre>
	*/
	public Long get_dostotdospriorityclients() throws Exception {
		return this.dostotdospriorityclients;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		dos_stats[] resources = new dos_stats[1];
		dos_response result = (dos_response) service.get_payload_formatter().string_to_resource(dos_response.class, response);
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
		resources[0] = result.dos;
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
	* Use this API to fetch the statistics of all dos_stats resources that are configured on netscaler.
	*/
	public static dos_stats get(nitro_service service) throws Exception{
		dos_stats obj = new dos_stats();
		dos_stats[] response = (dos_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all dos_stats resources that are configured on netscaler.
	*/
	public static dos_stats get(nitro_service service,  options option) throws Exception{
		dos_stats obj = new dos_stats();
		dos_stats[] response = (dos_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
