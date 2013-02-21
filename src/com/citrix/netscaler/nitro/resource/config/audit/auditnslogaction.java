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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class auditnslogaction_response extends base_response
{
	public auditnslogaction[] auditnslogaction;
}
/**
* Configuration for ns log action resource.
*/

public class auditnslogaction extends base_resource
{
	private String name;
	private String serverip;
	private Integer serverport;
	private String[] loglevel;
	private String dateformat;
	private String logfacility;
	private String tcp;
	private String acl;
	private String timezone;
	private String userdefinedauditlog;
	private String appflowexport;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the nslog action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the nslog action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The IP address of the nslog server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* The IP address of the nslog server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* The port on which the nslog server is running.<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* The port on which the nslog server is running.<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* The port on which the nslog server is running.<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* The audit log level.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public void set_loglevel(String[] loglevel) throws Exception{
		this.loglevel = loglevel;
	}

	/**
	* <pre>
	* The audit log level.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public String[] get_loglevel() throws Exception {
		return this.loglevel;
	}

	/**
	* <pre>
	* The date format.<br> Possible values = MMDDYYYY, DDMMYYYY
	* </pre>
	*/
	public void set_dateformat(String dateformat) throws Exception{
		this.dateformat = dateformat;
	}

	/**
	* <pre>
	* The date format.<br> Possible values = MMDDYYYY, DDMMYYYY
	* </pre>
	*/
	public String get_dateformat() throws Exception {
		return this.dateformat;
	}

	/**
	* <pre>
	* The log facility (RFC 3164).<br> Possible values = LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7
	* </pre>
	*/
	public void set_logfacility(String logfacility) throws Exception{
		this.logfacility = logfacility;
	}

	/**
	* <pre>
	* The log facility (RFC 3164).<br> Possible values = LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7
	* </pre>
	*/
	public String get_logfacility() throws Exception {
		return this.logfacility;
	}

	/**
	* <pre>
	* Log the tcp messages.<br> Possible values = NONE, ALL
	* </pre>
	*/
	public void set_tcp(String tcp) throws Exception{
		this.tcp = tcp;
	}

	/**
	* <pre>
	* Log the tcp messages.<br> Possible values = NONE, ALL
	* </pre>
	*/
	public String get_tcp() throws Exception {
		return this.tcp;
	}

	/**
	* <pre>
	* Log the acl messages.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_acl(String acl) throws Exception{
		this.acl = acl;
	}

	/**
	* <pre>
	* Log the acl messages.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_acl() throws Exception {
		return this.acl;
	}

	/**
	* <pre>
	* Specifies the timezone in which the timestmps in the log messages will be generated.<br> Possible values = GMT_TIME, LOCAL_TIME
	* </pre>
	*/
	public void set_timezone(String timezone) throws Exception{
		this.timezone = timezone;
	}

	/**
	* <pre>
	* Specifies the timezone in which the timestmps in the log messages will be generated.<br> Possible values = GMT_TIME, LOCAL_TIME
	* </pre>
	*/
	public String get_timezone() throws Exception {
		return this.timezone;
	}

	/**
	* <pre>
	* Specifies whether the user configurable log messages should be done or not.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_userdefinedauditlog(String userdefinedauditlog) throws Exception{
		this.userdefinedauditlog = userdefinedauditlog;
	}

	/**
	* <pre>
	* Specifies whether the user configurable log messages should be done or not.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_userdefinedauditlog() throws Exception {
		return this.userdefinedauditlog;
	}

	/**
	* <pre>
	* Control export of log messages to AppFlow collectors.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowexport(String appflowexport) throws Exception{
		this.appflowexport = appflowexport;
	}

	/**
	* <pre>
	* Control export of log messages to AppFlow collectors.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowexport() throws Exception {
		return this.appflowexport;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		auditnslogaction_response result = (auditnslogaction_response) service.get_payload_formatter().string_to_resource(auditnslogaction_response.class, response);
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
		return result.auditnslogaction;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add auditnslogaction.
	*/
	public static base_response add(nitro_service client, auditnslogaction resource) throws Exception {
		auditnslogaction addresource = new auditnslogaction();
		addresource.name = resource.name;
		addresource.serverip = resource.serverip;
		addresource.serverport = resource.serverport;
		addresource.loglevel = resource.loglevel;
		addresource.dateformat = resource.dateformat;
		addresource.logfacility = resource.logfacility;
		addresource.tcp = resource.tcp;
		addresource.acl = resource.acl;
		addresource.timezone = resource.timezone;
		addresource.userdefinedauditlog = resource.userdefinedauditlog;
		addresource.appflowexport = resource.appflowexport;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add auditnslogaction resources.
	*/
	public static base_responses add(nitro_service client, auditnslogaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditnslogaction addresources[] = new auditnslogaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new auditnslogaction();
				addresources[i].name = resources[i].name;
				addresources[i].serverip = resources[i].serverip;
				addresources[i].serverport = resources[i].serverport;
				addresources[i].loglevel = resources[i].loglevel;
				addresources[i].dateformat = resources[i].dateformat;
				addresources[i].logfacility = resources[i].logfacility;
				addresources[i].tcp = resources[i].tcp;
				addresources[i].acl = resources[i].acl;
				addresources[i].timezone = resources[i].timezone;
				addresources[i].userdefinedauditlog = resources[i].userdefinedauditlog;
				addresources[i].appflowexport = resources[i].appflowexport;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditnslogaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		auditnslogaction deleteresource = new auditnslogaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditnslogaction.
	*/
	public static base_response delete(nitro_service client, auditnslogaction resource) throws Exception {
		auditnslogaction deleteresource = new auditnslogaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditnslogaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			auditnslogaction deleteresources[] = new auditnslogaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new auditnslogaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditnslogaction resources.
	*/
	public static base_responses delete(nitro_service client, auditnslogaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditnslogaction deleteresources[] = new auditnslogaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new auditnslogaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update auditnslogaction.
	*/
	public static base_response update(nitro_service client, auditnslogaction resource) throws Exception {
		auditnslogaction updateresource = new auditnslogaction();
		updateresource.name = resource.name;
		updateresource.serverip = resource.serverip;
		updateresource.serverport = resource.serverport;
		updateresource.loglevel = resource.loglevel;
		updateresource.dateformat = resource.dateformat;
		updateresource.logfacility = resource.logfacility;
		updateresource.tcp = resource.tcp;
		updateresource.acl = resource.acl;
		updateresource.timezone = resource.timezone;
		updateresource.userdefinedauditlog = resource.userdefinedauditlog;
		updateresource.appflowexport = resource.appflowexport;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update auditnslogaction resources.
	*/
	public static base_responses update(nitro_service client, auditnslogaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditnslogaction updateresources[] = new auditnslogaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new auditnslogaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].serverip = resources[i].serverip;
				updateresources[i].serverport = resources[i].serverport;
				updateresources[i].loglevel = resources[i].loglevel;
				updateresources[i].dateformat = resources[i].dateformat;
				updateresources[i].logfacility = resources[i].logfacility;
				updateresources[i].tcp = resources[i].tcp;
				updateresources[i].acl = resources[i].acl;
				updateresources[i].timezone = resources[i].timezone;
				updateresources[i].userdefinedauditlog = resources[i].userdefinedauditlog;
				updateresources[i].appflowexport = resources[i].appflowexport;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of auditnslogaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		auditnslogaction unsetresource = new auditnslogaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of auditnslogaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, auditnslogaction resource, String[] args) throws Exception{
		auditnslogaction unsetresource = new auditnslogaction();
		unsetresource.name = resource.name;
		unsetresource.serverport = resource.serverport;
		unsetresource.loglevel = resource.loglevel;
		unsetresource.dateformat = resource.dateformat;
		unsetresource.logfacility = resource.logfacility;
		unsetresource.tcp = resource.tcp;
		unsetresource.acl = resource.acl;
		unsetresource.timezone = resource.timezone;
		unsetresource.userdefinedauditlog = resource.userdefinedauditlog;
		unsetresource.appflowexport = resource.appflowexport;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of auditnslogaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			auditnslogaction unsetresources[] = new auditnslogaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new auditnslogaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of auditnslogaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, auditnslogaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditnslogaction unsetresources[] = new auditnslogaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new auditnslogaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].serverport = resources[i].serverport;
				unsetresources[i].loglevel = resources[i].loglevel;
				unsetresources[i].dateformat = resources[i].dateformat;
				unsetresources[i].logfacility = resources[i].logfacility;
				unsetresources[i].tcp = resources[i].tcp;
				unsetresources[i].acl = resources[i].acl;
				unsetresources[i].timezone = resources[i].timezone;
				unsetresources[i].userdefinedauditlog = resources[i].userdefinedauditlog;
				unsetresources[i].appflowexport = resources[i].appflowexport;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the auditnslogaction resources that are configured on netscaler.
	*/
	public static auditnslogaction[] get(nitro_service service) throws Exception{
		auditnslogaction obj = new auditnslogaction();
		auditnslogaction[] response = (auditnslogaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the auditnslogaction resources that are configured on netscaler.
	*/
	public static auditnslogaction[] get(nitro_service service, options option) throws Exception{
		auditnslogaction obj = new auditnslogaction();
		auditnslogaction[] response = (auditnslogaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch auditnslogaction resource of given name .
	*/
	public static auditnslogaction get(nitro_service service, String name) throws Exception{
		auditnslogaction obj = new auditnslogaction();
		obj.set_name(name);
		auditnslogaction response = (auditnslogaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch auditnslogaction resources of given names .
	*/
	public static auditnslogaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			auditnslogaction response[] = new auditnslogaction[name.length];
			auditnslogaction obj[] = new auditnslogaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new auditnslogaction();
				obj[i].set_name(name[i]);
				response[i] = (auditnslogaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of auditnslogaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static auditnslogaction[] get_filtered(nitro_service service, String filter) throws Exception{
		auditnslogaction obj = new auditnslogaction();
		options option = new options();
		option.set_filter(filter);
		auditnslogaction[] response = (auditnslogaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of auditnslogaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static auditnslogaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditnslogaction obj = new auditnslogaction();
		options option = new options();
		option.set_filter(filter);
		auditnslogaction[] response = (auditnslogaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the auditnslogaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		auditnslogaction obj = new auditnslogaction();
		options option = new options();
		option.set_count(true);
		auditnslogaction[] response = (auditnslogaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of auditnslogaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		auditnslogaction obj = new auditnslogaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditnslogaction[] response = (auditnslogaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of auditnslogaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditnslogaction obj = new auditnslogaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditnslogaction[] response = (auditnslogaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
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
	public static class userdefinedauditlogEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class timezoneEnum {
		public static final String GMT_TIME = "GMT_TIME";
		public static final String LOCAL_TIME = "LOCAL_TIME";
	}
	public static class dateformatEnum {
		public static final String MMDDYYYY = "MMDDYYYY";
		public static final String DDMMYYYY = "DDMMYYYY";
	}
	public static class aclEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class tcpEnum {
		public static final String NONE = "NONE";
		public static final String ALL = "ALL";
	}
	public static class appflowexportEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class logfacilityEnum {
		public static final String LOCAL0 = "LOCAL0";
		public static final String LOCAL1 = "LOCAL1";
		public static final String LOCAL2 = "LOCAL2";
		public static final String LOCAL3 = "LOCAL3";
		public static final String LOCAL4 = "LOCAL4";
		public static final String LOCAL5 = "LOCAL5";
		public static final String LOCAL6 = "LOCAL6";
		public static final String LOCAL7 = "LOCAL7";
	}
}
