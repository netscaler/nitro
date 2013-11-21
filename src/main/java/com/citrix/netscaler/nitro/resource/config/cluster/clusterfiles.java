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

package com.citrix.netscaler.nitro.resource.config.cluster;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class clusterfiles_response extends base_response
{
	public clusterfiles clusterfiles;
}
/**
* Configuration for files resource.
*/

public class clusterfiles extends base_resource
{
	private String[] mode;

	/**
	* <pre>
	* The directories and files to be synchronized. The available settings function as follows:
 Mode    Paths
 all           /nsconfig/ssl/
                /var/netscaler/ssl/
                /var/vpn/bookmark/
                /nsconfig/dns/
                /nsconfig/htmlinjection/
                /netscaler/htmlinjection/ens/
                /nsconfig/monitors/
                /nsconfig/nstemplates/
                /nsconfig/ssh/
                /nsconfig/rc.netscaler
                /nsconfig/resolv.conf
                /nsconfig/inetd.conf
                /nsconfig/syslog.conf
                /nsconfig/snmpd.conf
                /nsconfig/ntp.conf
                /nsconfig/httpd.conf
                /nsconfig/sshd_config
                /nsconfig/hosts
                /nsconfig/enckey
                /var/nslw.bin/etc/krb5.conf
                /var/nslw.bin/etc/krb5.keytab
                /var/lib/likewise/db/
                /var/download/
                /var/wi/tomcat/webapps/
                /var/wi/tomcat/conf/Catalina/localhost/
                /var/wi/java_home/lib/security/cacerts
                /var/wi/java_home/jre/lib/security/cacerts
ssl            /nsconfig/ssl/
                 /var/netscaler/ssl/
bookmarks     /var/vpn/bookmark/
dns                  /nsconfig/dns/
htmlinjection    /nsconfig/htmlinjection/
imports          /var/download/
misc               /nsconfig/license/
                       /nsconfig/rc.conf
all_plus_misc    Includes *all* files and /nsconfig/license/ and /nsconfig/rc.conf.
Default value: all.<br> Possible values = all, bookmarks, ssl, htmlinjection, imports, misc, dns, krb, all_plus_misc
	* </pre>
	*/
	public void set_mode(String[] mode) throws Exception{
		this.mode = mode;
	}

	/**
	* <pre>
	* The directories and files to be synchronized. The available settings function as follows:
 Mode    Paths
 all           /nsconfig/ssl/
                /var/netscaler/ssl/
                /var/vpn/bookmark/
                /nsconfig/dns/
                /nsconfig/htmlinjection/
                /netscaler/htmlinjection/ens/
                /nsconfig/monitors/
                /nsconfig/nstemplates/
                /nsconfig/ssh/
                /nsconfig/rc.netscaler
                /nsconfig/resolv.conf
                /nsconfig/inetd.conf
                /nsconfig/syslog.conf
                /nsconfig/snmpd.conf
                /nsconfig/ntp.conf
                /nsconfig/httpd.conf
                /nsconfig/sshd_config
                /nsconfig/hosts
                /nsconfig/enckey
                /var/nslw.bin/etc/krb5.conf
                /var/nslw.bin/etc/krb5.keytab
                /var/lib/likewise/db/
                /var/download/
                /var/wi/tomcat/webapps/
                /var/wi/tomcat/conf/Catalina/localhost/
                /var/wi/java_home/lib/security/cacerts
                /var/wi/java_home/jre/lib/security/cacerts
ssl            /nsconfig/ssl/
                 /var/netscaler/ssl/
bookmarks     /var/vpn/bookmark/
dns                  /nsconfig/dns/
htmlinjection    /nsconfig/htmlinjection/
imports          /var/download/
misc               /nsconfig/license/
                       /nsconfig/rc.conf
all_plus_misc    Includes *all* files and /nsconfig/license/ and /nsconfig/rc.conf.
Default value: all.<br> Possible values = all, bookmarks, ssl, htmlinjection, imports, misc, dns, krb, all_plus_misc
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
		clusterfiles[] resources = new clusterfiles[1];
		clusterfiles_response result = (clusterfiles_response) service.get_payload_formatter().string_to_resource(clusterfiles_response.class, response);
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
		resources[0] = result.clusterfiles;
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
	* Use this API to sync clusterfiles.
	*/
	public static base_response sync(nitro_service client, clusterfiles resource) throws Exception {
		clusterfiles syncresource = new clusterfiles();
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
