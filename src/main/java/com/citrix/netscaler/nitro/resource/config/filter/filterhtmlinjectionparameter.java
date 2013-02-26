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

package com.citrix.netscaler.nitro.resource.config.filter;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class filterhtmlinjectionparameter_response extends base_response
{
	public filterhtmlinjectionparameter filterhtmlinjectionparameter;
}
/**
* Configuration for HTML injection parameter resource.
*/

public class filterhtmlinjectionparameter extends base_resource
{
	private Long rate;
	private Long frequency;
	private String strict;
	private Long htmlsearchlen;

	/**
	* <pre>
	* if rate is X, HTML injection will be done for 1 out of X policy matches.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_rate(long rate) throws Exception {
		this.rate = new Long(rate);
	}

	/**
	* <pre>
	* if rate is X, HTML injection will be done for 1 out of X policy matches.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_rate(Long rate) throws Exception{
		this.rate = rate;
	}

	/**
	* <pre>
	* if rate is X, HTML injection will be done for 1 out of X policy matches.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_rate() throws Exception {
		return this.rate;
	}

	/**
	* <pre>
	* if frequency is X, HTML injection will be done atleast once per X milisecond.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_frequency(long frequency) throws Exception {
		this.frequency = new Long(frequency);
	}

	/**
	* <pre>
	* if frequency is X, HTML injection will be done atleast once per X milisecond.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_frequency(Long frequency) throws Exception{
		this.frequency = frequency;
	}

	/**
	* <pre>
	* if frequency is X, HTML injection will be done atleast once per X milisecond.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_frequency() throws Exception {
		return this.frequency;
	}

	/**
	* <pre>
	* enable/disable searching for <html> tag for HTML injection.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_strict(String strict) throws Exception{
		this.strict = strict;
	}

	/**
	* <pre>
	* enable/disable searching for <html> tag for HTML injection.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_strict() throws Exception {
		return this.strict;
	}

	/**
	* <pre>
	* HTTP body length in which to search for <html> tag.<br> Default value: 1024<br> Minimum value =  1
	* </pre>
	*/
	public void set_htmlsearchlen(long htmlsearchlen) throws Exception {
		this.htmlsearchlen = new Long(htmlsearchlen);
	}

	/**
	* <pre>
	* HTTP body length in which to search for <html> tag.<br> Default value: 1024<br> Minimum value =  1
	* </pre>
	*/
	public void set_htmlsearchlen(Long htmlsearchlen) throws Exception{
		this.htmlsearchlen = htmlsearchlen;
	}

	/**
	* <pre>
	* HTTP body length in which to search for <html> tag.<br> Default value: 1024<br> Minimum value =  1
	* </pre>
	*/
	public Long get_htmlsearchlen() throws Exception {
		return this.htmlsearchlen;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		filterhtmlinjectionparameter[] resources = new filterhtmlinjectionparameter[1];
		filterhtmlinjectionparameter_response result = (filterhtmlinjectionparameter_response) service.get_payload_formatter().string_to_resource(filterhtmlinjectionparameter_response.class, response);
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
		resources[0] = result.filterhtmlinjectionparameter;
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
	* Use this API to update filterhtmlinjectionparameter.
	*/
	public static base_response update(nitro_service client, filterhtmlinjectionparameter resource) throws Exception {
		filterhtmlinjectionparameter updateresource = new filterhtmlinjectionparameter();
		updateresource.rate = resource.rate;
		updateresource.frequency = resource.frequency;
		updateresource.strict = resource.strict;
		updateresource.htmlsearchlen = resource.htmlsearchlen;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of filterhtmlinjectionparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, filterhtmlinjectionparameter resource, String[] args) throws Exception{
		filterhtmlinjectionparameter unsetresource = new filterhtmlinjectionparameter();
		unsetresource.rate = resource.rate;
		unsetresource.frequency = resource.frequency;
		unsetresource.strict = resource.strict;
		unsetresource.htmlsearchlen = resource.htmlsearchlen;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the filterhtmlinjectionparameter resources that are configured on netscaler.
	*/
	public static filterhtmlinjectionparameter get(nitro_service service) throws Exception{
		filterhtmlinjectionparameter obj = new filterhtmlinjectionparameter();
		filterhtmlinjectionparameter[] response = (filterhtmlinjectionparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the filterhtmlinjectionparameter resources that are configured on netscaler.
	*/
	public static filterhtmlinjectionparameter get(nitro_service service,  options option) throws Exception{
		filterhtmlinjectionparameter obj = new filterhtmlinjectionparameter();
		filterhtmlinjectionparameter[] response = (filterhtmlinjectionparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class strictEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
