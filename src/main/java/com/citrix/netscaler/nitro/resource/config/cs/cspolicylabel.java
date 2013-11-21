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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cspolicylabel_response extends base_response
{
	public cspolicylabel[] cspolicylabel;
}
/**
* Configuration for CS policy label resource.
*/

public class cspolicylabel extends base_resource
{
	private String labelname;
	private String cspolicylabeltype;
	private String newname;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private String policyname;
	private Long priority;
	private String targetvserver;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private Long __count;

	/**
	* <pre>
	* Name for the policy label. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. 
The label name must be unique within the list of policy labels for content switching.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, \“my label\” or \‘my policylabel\’).
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name for the policy label. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. 
The label name must be unique within the list of policy labels for content switching.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, \“my label\” or \‘my policylabel\’).
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Protocol supported by the policy label. All policies bound to the policy label must either match the specified protocol or be a subtype of that protocol. Available settings function as follows:
* HTTP - Supports policies that process HTTP traffic. Used to access unencrypted Web sites. (The default.)
* SSL - Supports policies that process HTTPS/SSL encrypted traffic. Used to access encrypted Web sites.
* TCP - Supports policies that process any type of TCP traffic, including HTTP.
* SSL_TCP - Supports policies that process SSL-encrypted TCP traffic, including SSL.
* UDP - Supports policies that process any type of UDP-based traffic, including DNS.
* DNS - Supports policies that process DNS traffic.
* ANY - Supports all types of policies except HTTP, SSL, and TCP.             
* SIP_UDP - Supports policies that process UDP based Session Initiation Protocol (SIP) traffic. SIP initiates, manages, and terminates multimedia communications sessions, and has emerged as the standard for Internet telephony (VoIP).
* RTSP - Supports policies that process Real Time Streaming Protocol (RTSP) traffic. RTSP provides delivery of multimedia and other streaming data, such as audio, video, and other types of streamed media.
* RADIUS - Supports policies that process Remote Authentication Dial In User Service (RADIUS) traffic. RADIUS supports combined authentication, authorization, and auditing services for network management.
* MYSQL - Supports policies that process MYSQL traffic.
* MSSQL - Supports policies that process Microsoft SQL traffic.<br> Possible values = HTTP, TCP, RTSP, SSL, SSL_TCP, UDP, DNS, SIP_UDP, ANY, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER, FTP
	* </pre>
	*/
	public void set_cspolicylabeltype(String cspolicylabeltype) throws Exception{
		this.cspolicylabeltype = cspolicylabeltype;
	}

	/**
	* <pre>
	* Protocol supported by the policy label. All policies bound to the policy label must either match the specified protocol or be a subtype of that protocol. Available settings function as follows:
* HTTP - Supports policies that process HTTP traffic. Used to access unencrypted Web sites. (The default.)
* SSL - Supports policies that process HTTPS/SSL encrypted traffic. Used to access encrypted Web sites.
* TCP - Supports policies that process any type of TCP traffic, including HTTP.
* SSL_TCP - Supports policies that process SSL-encrypted TCP traffic, including SSL.
* UDP - Supports policies that process any type of UDP-based traffic, including DNS.
* DNS - Supports policies that process DNS traffic.
* ANY - Supports all types of policies except HTTP, SSL, and TCP.             
* SIP_UDP - Supports policies that process UDP based Session Initiation Protocol (SIP) traffic. SIP initiates, manages, and terminates multimedia communications sessions, and has emerged as the standard for Internet telephony (VoIP).
* RTSP - Supports policies that process Real Time Streaming Protocol (RTSP) traffic. RTSP provides delivery of multimedia and other streaming data, such as audio, video, and other types of streamed media.
* RADIUS - Supports policies that process Remote Authentication Dial In User Service (RADIUS) traffic. RADIUS supports combined authentication, authorization, and auditing services for network management.
* MYSQL - Supports policies that process MYSQL traffic.
* MSSQL - Supports policies that process Microsoft SQL traffic.<br> Possible values = HTTP, TCP, RTSP, SSL, SSL_TCP, UDP, DNS, SIP_UDP, ANY, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER, FTP
	* </pre>
	*/
	public String get_cspolicylabeltype() throws Exception {
		return this.cspolicylabeltype;
	}

	/**
	* <pre>
	* The new name of the content switching policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the content switching policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* number of polices bound to label.
	* </pre>
	*/
	public Long get_numpol() throws Exception {
		return this.numpol;
	}

	/**
	* <pre>
	* Number of times policy label was invoked.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Name of the content switching policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Name of the virtual server to which to forward requests that match the policy.
	* </pre>
	*/
	public String get_targetvserver() throws Exception {
		return this.targetvserver;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cspolicylabel_response result = (cspolicylabel_response) service.get_payload_formatter().string_to_resource(cspolicylabel_response.class, response);
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
		return result.cspolicylabel;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to add cspolicylabel.
	*/
	public static base_response add(nitro_service client, cspolicylabel resource) throws Exception {
		cspolicylabel addresource = new cspolicylabel();
		addresource.labelname = resource.labelname;
		addresource.cspolicylabeltype = resource.cspolicylabeltype;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cspolicylabel resources.
	*/
	public static base_responses add(nitro_service client, cspolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cspolicylabel addresources[] = new cspolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cspolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].cspolicylabeltype = resources[i].cspolicylabeltype;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cspolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		cspolicylabel deleteresource = new cspolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cspolicylabel.
	*/
	public static base_response delete(nitro_service client, cspolicylabel resource) throws Exception {
		cspolicylabel deleteresource = new cspolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cspolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			cspolicylabel deleteresources[] = new cspolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new cspolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cspolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, cspolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cspolicylabel deleteresources[] = new cspolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cspolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a cspolicylabel resource.
	*/
	public static base_response rename(nitro_service client, cspolicylabel resource, String new_labelname) throws Exception {
		cspolicylabel renameresource = new cspolicylabel();
		renameresource.labelname = resource.labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to rename a cspolicylabel resource.
	*/
	public static base_response rename(nitro_service client, String labelname, String new_labelname) throws Exception {
		cspolicylabel renameresource = new cspolicylabel();
		renameresource.labelname = labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to fetch all the cspolicylabel resources that are configured on netscaler.
	*/
	public static cspolicylabel[] get(nitro_service service) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		cspolicylabel[] response = (cspolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cspolicylabel resources that are configured on netscaler.
	*/
	public static cspolicylabel[] get(nitro_service service, options option) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		cspolicylabel[] response = (cspolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cspolicylabel resource of given name .
	*/
	public static cspolicylabel get(nitro_service service, String labelname) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		obj.set_labelname(labelname);
		cspolicylabel response = (cspolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cspolicylabel resources of given names .
	*/
	public static cspolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			cspolicylabel response[] = new cspolicylabel[labelname.length];
			cspolicylabel obj[] = new cspolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new cspolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (cspolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cspolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cspolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_filter(filter);
		cspolicylabel[] response = (cspolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cspolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cspolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_filter(filter);
		cspolicylabel[] response = (cspolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cspolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_count(true);
		cspolicylabel[] response = (cspolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cspolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cspolicylabel[] response = (cspolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cspolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cspolicylabel[] response = (cspolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cspolicylabeltypeEnum {
		public static final String HTTP = "HTTP";
		public static final String TCP = "TCP";
		public static final String RTSP = "RTSP";
		public static final String SSL = "SSL";
		public static final String SSL_TCP = "SSL_TCP";
		public static final String UDP = "UDP";
		public static final String DNS = "DNS";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String ANY = "ANY";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
		public static final String FTP = "FTP";
	}
	public static class labeltypeEnum {
		public static final String policylabel = "policylabel";
	}
}
