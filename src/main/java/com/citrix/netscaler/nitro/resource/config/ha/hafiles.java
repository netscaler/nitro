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

package com.citrix.netscaler.nitro.resource.config.ha;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class hafiles_response extends base_response
{
	public hafiles hafiles;
}
/**
* Configuration for files resource.
*/

public class hafiles extends base_resource
{
	private String[] mode;

	/**
	* <pre>
	* Specify one of the following modes of synchronization.
* all - Synchronize files related to system configuration, Access Gateway bookmarks, SSL certificates, SSL CRL lists, HTML injection scripts, and Application Firewall XML objects. 
* bookmarks - Synchronize all Access Gateway bookmarks.
* ssl - Synchronize all certificates, keys, and CRLs for the SSL feature. 
* htmlinjection. Synchronize all scripts configured for the HTML injection feature. 
* imports. Synchronize all XML objects (for example, WSDLs, schemas, error pages) configured for the application firewall. 
* misc - Synchronize all license files and the rc.conf file. 
* all_plus_misc - Synchronize files related to system configuration, Access Gateway bookmarks, SSL certificates, SSL CRL lists, HTML injection scripts, application firewall XML objects, licenses, and the rc.conf file.<br> Possible values = all, bookmarks, ssl, htmlinjection, imports, misc, dns, krb, all_plus_misc
	* </pre>
	*/
	public void set_mode(String[] mode) throws Exception{
		this.mode = mode;
	}

	/**
	* <pre>
	* Specify one of the following modes of synchronization.
* all - Synchronize files related to system configuration, Access Gateway bookmarks, SSL certificates, SSL CRL lists, HTML injection scripts, and Application Firewall XML objects. 
* bookmarks - Synchronize all Access Gateway bookmarks.
* ssl - Synchronize all certificates, keys, and CRLs for the SSL feature. 
* htmlinjection. Synchronize all scripts configured for the HTML injection feature. 
* imports. Synchronize all XML objects (for example, WSDLs, schemas, error pages) configured for the application firewall. 
* misc - Synchronize all license files and the rc.conf file. 
* all_plus_misc - Synchronize files related to system configuration, Access Gateway bookmarks, SSL certificates, SSL CRL lists, HTML injection scripts, application firewall XML objects, licenses, and the rc.conf file.<br> Possible values = all, bookmarks, ssl, htmlinjection, imports, misc, dns, krb, all_plus_misc
	* </pre>
	*/
	public String[] get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		hafiles[] resources = new hafiles[1];
		hafiles_response result = (hafiles_response) service.get_payload_formatter().string_to_resource(hafiles_response.class, response);
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
		resources[0] = result.hafiles;
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
	* Use this API to sync hafiles.
	*/
	public static base_response sync(nitro_service client, hafiles resource) throws Exception {
		hafiles syncresource = new hafiles();
		syncresource.mode = resource.mode;
		return syncresource.perform_operation(client,"sync");
	}

	public static class modeEnum {
		public static final String all = "all";
		public static final String bookmarks = "bookmarks";
		public static final String ssl = "ssl";
		public static final String htmlinjection = "htmlinjection";
		public static final String imports = "imports";
		public static final String misc = "misc";
		public static final String dns = "dns";
		public static final String krb = "krb";
		public static final String all_plus_misc = "all_plus_misc";
	}
}
