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

class auditsyslogaction_response extends base_response
{
	public auditsyslogaction[] auditsyslogaction;
}
/**
* Configuration for system log action resource.
*/

public class auditsyslogaction extends base_resource
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
	* Name of the syslog action. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the syslog action is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my syslog action” or ‘my syslog action).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the syslog action. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the syslog action is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my syslog action” or ‘my syslog action).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* IP address of the syslog server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* IP address of the syslog server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* Port on which the syslog server accepts connections.<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* Port on which the syslog server accepts connections.<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* Port on which the syslog server accepts connections.<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* Audit log level, which specifies the types of events to log. 
Available values function as follows: 
* ALL - All events.
* EMERGENCY - Events that indicate an immediate crisis on the server.
* ALERT - Events that might require action.
* CRITICAL - Events that indicate an imminent server crisis.
* ERROR - Events that indicate some type of error.
* WARNING - Events that require action in the near future.
* NOTICE - Events that the administrator should know about.
* INFORMATIONAL - All but low-level events.
* DEBUG - All events, in extreme detail.
* NONE - No events.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public void set_loglevel(String[] loglevel) throws Exception{
		this.loglevel = loglevel;
	}

	/**
	* <pre>
	* Audit log level, which specifies the types of events to log. 
Available values function as follows: 
* ALL - All events.
* EMERGENCY - Events that indicate an immediate crisis on the server.
* ALERT - Events that might require action.
* CRITICAL - Events that indicate an imminent server crisis.
* ERROR - Events that indicate some type of error.
* WARNING - Events that require action in the near future.
* NOTICE - Events that the administrator should know about.
* INFORMATIONAL - All but low-level events.
* DEBUG - All events, in extreme detail.
* NONE - No events.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public String[] get_loglevel() throws Exception {
		return this.loglevel;
	}

	/**
	* <pre>
	* Format of dates in the logs.
Supported formats are: 
* MMDDYYYY. -U.S. style month/date/year format.
* DDMMYYYY - European style date/month/year format.
* YYYYMMDD - ISO style year/month/date format.<br> Possible values = MMDDYYYY, DDMMYYYY, YYYYMMDD
	* </pre>
	*/
	public void set_dateformat(String dateformat) throws Exception{
		this.dateformat = dateformat;
	}

	/**
	* <pre>
	* Format of dates in the logs.
Supported formats are: 
* MMDDYYYY. -U.S. style month/date/year format.
* DDMMYYYY - European style date/month/year format.
* YYYYMMDD - ISO style year/month/date format.<br> Possible values = MMDDYYYY, DDMMYYYY, YYYYMMDD
	* </pre>
	*/
	public String get_dateformat() throws Exception {
		return this.dateformat;
	}

	/**
	* <pre>
	* Facility value, as defined in RFC 3164, assigned to the log message. 
Log facility values are numbers 0 to 7 (LOCAL0 through LOCAL7). Each number indicates where a specific message originated from, such as the NetScaler appliance itself, the VPN, or external.<br> Possible values = LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7
	* </pre>
	*/
	public void set_logfacility(String logfacility) throws Exception{
		this.logfacility = logfacility;
	}

	/**
	* <pre>
	* Facility value, as defined in RFC 3164, assigned to the log message. 
Log facility values are numbers 0 to 7 (LOCAL0 through LOCAL7). Each number indicates where a specific message originated from, such as the NetScaler appliance itself, the VPN, or external.<br> Possible values = LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7
	* </pre>
	*/
	public String get_logfacility() throws Exception {
		return this.logfacility;
	}

	/**
	* <pre>
	* Log TCP messages.<br> Possible values = NONE, ALL
	* </pre>
	*/
	public void set_tcp(String tcp) throws Exception{
		this.tcp = tcp;
	}

	/**
	* <pre>
	* Log TCP messages.<br> Possible values = NONE, ALL
	* </pre>
	*/
	public String get_tcp() throws Exception {
		return this.tcp;
	}

	/**
	* <pre>
	* Log access control list (ACL) messages.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_acl(String acl) throws Exception{
		this.acl = acl;
	}

	/**
	* <pre>
	* Log access control list (ACL) messages.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_acl() throws Exception {
		return this.acl;
	}

	/**
	* <pre>
	* Time zone used for date and timestamps in the logs. 
Supported settings are: 
* GMT_TIME. Coordinated Universal time.
* LOCAL_TIME. Use the server’s timezone setting.<br> Possible values = GMT_TIME, LOCAL_TIME
	* </pre>
	*/
	public void set_timezone(String timezone) throws Exception{
		this.timezone = timezone;
	}

	/**
	* <pre>
	* Time zone used for date and timestamps in the logs. 
Supported settings are: 
* GMT_TIME. Coordinated Universal time.
* LOCAL_TIME. Use the server’s timezone setting.<br> Possible values = GMT_TIME, LOCAL_TIME
	* </pre>
	*/
	public String get_timezone() throws Exception {
		return this.timezone;
	}

	/**
	* <pre>
	* Log user-configurable log messages to syslog. 
Setting this parameter to NO causes auditing to ignore all user-configured message actions. Setting this parameter to YES causes auditing to log user-configured message actions that meet the other logging criteria.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_userdefinedauditlog(String userdefinedauditlog) throws Exception{
		this.userdefinedauditlog = userdefinedauditlog;
	}

	/**
	* <pre>
	* Log user-configurable log messages to syslog. 
Setting this parameter to NO causes auditing to ignore all user-configured message actions. Setting this parameter to YES causes auditing to log user-configured message actions that meet the other logging criteria.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_userdefinedauditlog() throws Exception {
		return this.userdefinedauditlog;
	}

	/**
	* <pre>
	* Export log messages to AppFlow collectors.
Appflow collectors are entities to which log messages can be sent so that some action can be performed on them.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowexport(String appflowexport) throws Exception{
		this.appflowexport = appflowexport;
	}

	/**
	* <pre>
	* Export log messages to AppFlow collectors.
Appflow collectors are entities to which log messages can be sent so that some action can be performed on them.<br> Possible values = ENABLED, DISABLED
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
		auditsyslogaction_response result = (auditsyslogaction_response) service.get_payload_formatter().string_to_resource(auditsyslogaction_response.class, response);
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
		return result.auditsyslogaction;
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
	* Use this API to add auditsyslogaction.
	*/
	public static base_response add(nitro_service client, auditsyslogaction resource) throws Exception {
		auditsyslogaction addresource = new auditsyslogaction();
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
	* Use this API to add auditsyslogaction resources.
	*/
	public static base_responses add(nitro_service client, auditsyslogaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditsyslogaction addresources[] = new auditsyslogaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new auditsyslogaction();
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
	* Use this API to delete auditsyslogaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		auditsyslogaction deleteresource = new auditsyslogaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditsyslogaction.
	*/
	public static base_response delete(nitro_service client, auditsyslogaction resource) throws Exception {
		auditsyslogaction deleteresource = new auditsyslogaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditsyslogaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			auditsyslogaction deleteresources[] = new auditsyslogaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new auditsyslogaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditsyslogaction resources.
	*/
	public static base_responses delete(nitro_service client, auditsyslogaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditsyslogaction deleteresources[] = new auditsyslogaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new auditsyslogaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update auditsyslogaction.
	*/
	public static base_response update(nitro_service client, auditsyslogaction resource) throws Exception {
		auditsyslogaction updateresource = new auditsyslogaction();
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
	* Use this API to update auditsyslogaction resources.
	*/
	public static base_responses update(nitro_service client, auditsyslogaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditsyslogaction updateresources[] = new auditsyslogaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new auditsyslogaction();
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
	* Use this API to unset the properties of auditsyslogaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, auditsyslogaction resource, String[] args) throws Exception{
		auditsyslogaction unsetresource = new auditsyslogaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of auditsyslogaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			auditsyslogaction unsetresources[] = new auditsyslogaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new auditsyslogaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of auditsyslogaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, auditsyslogaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditsyslogaction unsetresources[] = new auditsyslogaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new auditsyslogaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the auditsyslogaction resources that are configured on netscaler.
	*/
	public static auditsyslogaction[] get(nitro_service service) throws Exception{
		auditsyslogaction obj = new auditsyslogaction();
		auditsyslogaction[] response = (auditsyslogaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the auditsyslogaction resources that are configured on netscaler.
	*/
	public static auditsyslogaction[] get(nitro_service service, options option) throws Exception{
		auditsyslogaction obj = new auditsyslogaction();
		auditsyslogaction[] response = (auditsyslogaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch auditsyslogaction resource of given name .
	*/
	public static auditsyslogaction get(nitro_service service, String name) throws Exception{
		auditsyslogaction obj = new auditsyslogaction();
		obj.set_name(name);
		auditsyslogaction response = (auditsyslogaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch auditsyslogaction resources of given names .
	*/
	public static auditsyslogaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			auditsyslogaction response[] = new auditsyslogaction[name.length];
			auditsyslogaction obj[] = new auditsyslogaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new auditsyslogaction();
				obj[i].set_name(name[i]);
				response[i] = (auditsyslogaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of auditsyslogaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static auditsyslogaction[] get_filtered(nitro_service service, String filter) throws Exception{
		auditsyslogaction obj = new auditsyslogaction();
		options option = new options();
		option.set_filter(filter);
		auditsyslogaction[] response = (auditsyslogaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of auditsyslogaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static auditsyslogaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditsyslogaction obj = new auditsyslogaction();
		options option = new options();
		option.set_filter(filter);
		auditsyslogaction[] response = (auditsyslogaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the auditsyslogaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		auditsyslogaction obj = new auditsyslogaction();
		options option = new options();
		option.set_count(true);
		auditsyslogaction[] response = (auditsyslogaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of auditsyslogaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		auditsyslogaction obj = new auditsyslogaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditsyslogaction[] response = (auditsyslogaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of auditsyslogaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditsyslogaction obj = new auditsyslogaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditsyslogaction[] response = (auditsyslogaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
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
		public static final String YYYYMMDD = "YYYYMMDD";
	}
	public static class aclEnum {
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
	public static class tcpEnum {
		public static final String NONE = "NONE";
		public static final String ALL = "ALL";
	}
	public static class appflowexportEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
