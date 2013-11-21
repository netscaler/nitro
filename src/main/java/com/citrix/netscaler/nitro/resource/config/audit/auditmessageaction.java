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

class auditmessageaction_response extends base_response
{
	public auditmessageaction[] auditmessageaction;
}
/**
* Configuration for message action resource.
*/

public class auditmessageaction extends base_resource
{
	private String name;
	private String loglevel;
	private String stringbuilderexpr;
	private String logtonewnslog;
	private String bypasssafetycheck;

	//------- Read only Parameter ---------;

	private String loglevel1;
	private Long hits;
	private Long undefhits;
	private Long referencecount;
	private Long __count;

	/**
	* <pre>
	* Name of the audit message action. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the message action is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my message action” or ‘my message action’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the audit message action. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the message action is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my message action” or ‘my message action’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Audit log level, which specifies the severity level of the log message being generated.. 
The following loglevels are valid: 
* EMERGENCY - Events that indicate an immediate crisis on the server.
* ALERT - Events that might require action.
* CRITICAL - Events that indicate an imminent server crisis.
* ERROR - Events that indicate some type of error.
* WARNING - Events that require action in the near future.
* NOTICE - Events that the administrator should know about.
* INFORMATIONAL - All but low-level events.
* DEBUG - All events, in extreme detail.<br> Possible values = EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG
	* </pre>
	*/
	public void set_loglevel(String loglevel) throws Exception{
		this.loglevel = loglevel;
	}

	/**
	* <pre>
	* Audit log level, which specifies the severity level of the log message being generated.. 
The following loglevels are valid: 
* EMERGENCY - Events that indicate an immediate crisis on the server.
* ALERT - Events that might require action.
* CRITICAL - Events that indicate an imminent server crisis.
* ERROR - Events that indicate some type of error.
* WARNING - Events that require action in the near future.
* NOTICE - Events that the administrator should know about.
* INFORMATIONAL - All but low-level events.
* DEBUG - All events, in extreme detail.<br> Possible values = EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG
	* </pre>
	*/
	public String get_loglevel() throws Exception {
		return this.loglevel;
	}

	/**
	* <pre>
	* Default-syntax expression that defines the format and content of the log message.
	* </pre>
	*/
	public void set_stringbuilderexpr(String stringbuilderexpr) throws Exception{
		this.stringbuilderexpr = stringbuilderexpr;
	}

	/**
	* <pre>
	* Default-syntax expression that defines the format and content of the log message.
	* </pre>
	*/
	public String get_stringbuilderexpr() throws Exception {
		return this.stringbuilderexpr;
	}

	/**
	* <pre>
	* Send the message to the new nslog.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_logtonewnslog(String logtonewnslog) throws Exception{
		this.logtonewnslog = logtonewnslog;
	}

	/**
	* <pre>
	* Send the message to the new nslog.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_logtonewnslog() throws Exception {
		return this.logtonewnslog;
	}

	/**
	* <pre>
	* Bypass the safety check and allow unsafe expressions.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_bypasssafetycheck(String bypasssafetycheck) throws Exception{
		this.bypasssafetycheck = bypasssafetycheck;
	}

	/**
	* <pre>
	* Bypass the safety check and allow unsafe expressions.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_bypasssafetycheck() throws Exception {
		return this.bypasssafetycheck;
	}

	/**
	* <pre>
	* .<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public String get_loglevel1() throws Exception {
		return this.loglevel1;
	}

	/**
	* <pre>
	* The number of times the action has been taken.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of times the action resulted in UNDEF.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* The number of references to the action.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		auditmessageaction_response result = (auditmessageaction_response) service.get_payload_formatter().string_to_resource(auditmessageaction_response.class, response);
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
		return result.auditmessageaction;
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
	* Use this API to add auditmessageaction.
	*/
	public static base_response add(nitro_service client, auditmessageaction resource) throws Exception {
		auditmessageaction addresource = new auditmessageaction();
		addresource.name = resource.name;
		addresource.loglevel = resource.loglevel;
		addresource.stringbuilderexpr = resource.stringbuilderexpr;
		addresource.logtonewnslog = resource.logtonewnslog;
		addresource.bypasssafetycheck = resource.bypasssafetycheck;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add auditmessageaction resources.
	*/
	public static base_responses add(nitro_service client, auditmessageaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditmessageaction addresources[] = new auditmessageaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new auditmessageaction();
				addresources[i].name = resources[i].name;
				addresources[i].loglevel = resources[i].loglevel;
				addresources[i].stringbuilderexpr = resources[i].stringbuilderexpr;
				addresources[i].logtonewnslog = resources[i].logtonewnslog;
				addresources[i].bypasssafetycheck = resources[i].bypasssafetycheck;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditmessageaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		auditmessageaction deleteresource = new auditmessageaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditmessageaction.
	*/
	public static base_response delete(nitro_service client, auditmessageaction resource) throws Exception {
		auditmessageaction deleteresource = new auditmessageaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditmessageaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			auditmessageaction deleteresources[] = new auditmessageaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new auditmessageaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditmessageaction resources.
	*/
	public static base_responses delete(nitro_service client, auditmessageaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditmessageaction deleteresources[] = new auditmessageaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new auditmessageaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update auditmessageaction.
	*/
	public static base_response update(nitro_service client, auditmessageaction resource) throws Exception {
		auditmessageaction updateresource = new auditmessageaction();
		updateresource.name = resource.name;
		updateresource.loglevel = resource.loglevel;
		updateresource.stringbuilderexpr = resource.stringbuilderexpr;
		updateresource.logtonewnslog = resource.logtonewnslog;
		updateresource.bypasssafetycheck = resource.bypasssafetycheck;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update auditmessageaction resources.
	*/
	public static base_responses update(nitro_service client, auditmessageaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditmessageaction updateresources[] = new auditmessageaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new auditmessageaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].loglevel = resources[i].loglevel;
				updateresources[i].stringbuilderexpr = resources[i].stringbuilderexpr;
				updateresources[i].logtonewnslog = resources[i].logtonewnslog;
				updateresources[i].bypasssafetycheck = resources[i].bypasssafetycheck;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of auditmessageaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, auditmessageaction resource, String[] args) throws Exception{
		auditmessageaction unsetresource = new auditmessageaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of auditmessageaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			auditmessageaction unsetresources[] = new auditmessageaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new auditmessageaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of auditmessageaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, auditmessageaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditmessageaction unsetresources[] = new auditmessageaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new auditmessageaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the auditmessageaction resources that are configured on netscaler.
	*/
	public static auditmessageaction[] get(nitro_service service) throws Exception{
		auditmessageaction obj = new auditmessageaction();
		auditmessageaction[] response = (auditmessageaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the auditmessageaction resources that are configured on netscaler.
	*/
	public static auditmessageaction[] get(nitro_service service, options option) throws Exception{
		auditmessageaction obj = new auditmessageaction();
		auditmessageaction[] response = (auditmessageaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch auditmessageaction resource of given name .
	*/
	public static auditmessageaction get(nitro_service service, String name) throws Exception{
		auditmessageaction obj = new auditmessageaction();
		obj.set_name(name);
		auditmessageaction response = (auditmessageaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch auditmessageaction resources of given names .
	*/
	public static auditmessageaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			auditmessageaction response[] = new auditmessageaction[name.length];
			auditmessageaction obj[] = new auditmessageaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new auditmessageaction();
				obj[i].set_name(name[i]);
				response[i] = (auditmessageaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of auditmessageaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static auditmessageaction[] get_filtered(nitro_service service, String filter) throws Exception{
		auditmessageaction obj = new auditmessageaction();
		options option = new options();
		option.set_filter(filter);
		auditmessageaction[] response = (auditmessageaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of auditmessageaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static auditmessageaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditmessageaction obj = new auditmessageaction();
		options option = new options();
		option.set_filter(filter);
		auditmessageaction[] response = (auditmessageaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the auditmessageaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		auditmessageaction obj = new auditmessageaction();
		options option = new options();
		option.set_count(true);
		auditmessageaction[] response = (auditmessageaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of auditmessageaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		auditmessageaction obj = new auditmessageaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditmessageaction[] response = (auditmessageaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of auditmessageaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditmessageaction obj = new auditmessageaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditmessageaction[] response = (auditmessageaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class loglevel1Enum {
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
	public static class loglevelEnum {
		public static final String EMERGENCY = "EMERGENCY";
		public static final String ALERT = "ALERT";
		public static final String CRITICAL = "CRITICAL";
		public static final String ERROR = "ERROR";
		public static final String WARNING = "WARNING";
		public static final String NOTICE = "NOTICE";
		public static final String INFORMATIONAL = "INFORMATIONAL";
		public static final String DEBUG = "DEBUG";
	}
	public static class bypasssafetycheckEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class logtonewnslogEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
