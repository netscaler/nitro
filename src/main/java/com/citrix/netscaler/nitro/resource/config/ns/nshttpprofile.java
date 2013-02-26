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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nshttpprofile_response extends base_response
{
	public nshttpprofile[] nshttpprofile;
}
/**
* Configuration for HTTP profile resource.
*/

public class nshttpprofile extends base_resource
{
	private String name;
	private String dropinvalreqs;
	private String markhttp09inval;
	private String markconnreqinval;
	private String cmponpush;
	private String conmultiplex;
	private Long maxreusepool;
	private String dropextracrlf;
	private Long incomphdrdelay;
	private String websocket;
	private Long reqtimeout;
	private String adpttimeout;
	private String reqtimeoutaction;
	private String dropextradata;
	private String weblog;
	private String clientiphdrexpr;
	private Long maxreq;
	private String persistentetag;

	//------- Read only Parameter ---------;

	private Long refcnt;
	private Long __count;

	/**
	* <pre>
	* Name of the HTTP profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the HTTP profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Enable/disable dropping of invalid HTTP requests/responses.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dropinvalreqs(String dropinvalreqs) throws Exception{
		this.dropinvalreqs = dropinvalreqs;
	}

	/**
	* <pre>
	* Enable/disable dropping of invalid HTTP requests/responses.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dropinvalreqs() throws Exception {
		return this.dropinvalreqs;
	}

	/**
	* <pre>
	* Enable/disable invalidating HTTP 0.9 requests.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_markhttp09inval(String markhttp09inval) throws Exception{
		this.markhttp09inval = markhttp09inval;
	}

	/**
	* <pre>
	* Enable/disable invalidating HTTP 0.9 requests.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_markhttp09inval() throws Exception {
		return this.markhttp09inval;
	}

	/**
	* <pre>
	* Enable/disable invalidating CONNECT HTTP requests.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_markconnreqinval(String markconnreqinval) throws Exception{
		this.markconnreqinval = markconnreqinval;
	}

	/**
	* <pre>
	* Enable/disable invalidating CONNECT HTTP requests.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_markconnreqinval() throws Exception {
		return this.markconnreqinval;
	}

	/**
	* <pre>
	* Enable/disable compression on PUSH packet.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cmponpush(String cmponpush) throws Exception{
		this.cmponpush = cmponpush;
	}

	/**
	* <pre>
	* Enable/disable compression on PUSH packet.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cmponpush() throws Exception {
		return this.cmponpush;
	}

	/**
	* <pre>
	* Connection multiplexing.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_conmultiplex(String conmultiplex) throws Exception{
		this.conmultiplex = conmultiplex;
	}

	/**
	* <pre>
	* Connection multiplexing.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_conmultiplex() throws Exception {
		return this.conmultiplex;
	}

	/**
	* <pre>
	* Maximum connections in reusepool. If set to zero, limit will not be applied.<br> Minimum value =  0<br> Maximum value =  360000
	* </pre>
	*/
	public void set_maxreusepool(long maxreusepool) throws Exception {
		this.maxreusepool = new Long(maxreusepool);
	}

	/**
	* <pre>
	* Maximum connections in reusepool. If set to zero, limit will not be applied.<br> Minimum value =  0<br> Maximum value =  360000
	* </pre>
	*/
	public void set_maxreusepool(Long maxreusepool) throws Exception{
		this.maxreusepool = maxreusepool;
	}

	/**
	* <pre>
	* Maximum connections in reusepool. If set to zero, limit will not be applied.<br> Minimum value =  0<br> Maximum value =  360000
	* </pre>
	*/
	public Long get_maxreusepool() throws Exception {
		return this.maxreusepool;
	}

	/**
	* <pre>
	* Drop extra CRLF after header is complete.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dropextracrlf(String dropextracrlf) throws Exception{
		this.dropextracrlf = dropextracrlf;
	}

	/**
	* <pre>
	* Drop extra CRLF after header is complete.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dropextracrlf() throws Exception {
		return this.dropextracrlf;
	}

	/**
	* <pre>
	* Maximum time to wait between incomplete header packets (ms ticks).<br> Default value: 7000<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_incomphdrdelay(long incomphdrdelay) throws Exception {
		this.incomphdrdelay = new Long(incomphdrdelay);
	}

	/**
	* <pre>
	* Maximum time to wait between incomplete header packets (ms ticks).<br> Default value: 7000<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_incomphdrdelay(Long incomphdrdelay) throws Exception{
		this.incomphdrdelay = incomphdrdelay;
	}

	/**
	* <pre>
	* Maximum time to wait between incomplete header packets (ms ticks).<br> Default value: 7000<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public Long get_incomphdrdelay() throws Exception {
		return this.incomphdrdelay;
	}

	/**
	* <pre>
	* Enable or disable WebSocket connections.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_websocket(String websocket) throws Exception{
		this.websocket = websocket;
	}

	/**
	* <pre>
	* Enable or disable WebSocket connections.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_websocket() throws Exception {
		return this.websocket;
	}

	/**
	* <pre>
	* The time (in seconds) within which the HTTP request must complete.<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public void set_reqtimeout(long reqtimeout) throws Exception {
		this.reqtimeout = new Long(reqtimeout);
	}

	/**
	* <pre>
	* The time (in seconds) within which the HTTP request must complete.<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public void set_reqtimeout(Long reqtimeout) throws Exception{
		this.reqtimeout = reqtimeout;
	}

	/**
	* <pre>
	* The time (in seconds) within which the HTTP request must complete.<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public Long get_reqtimeout() throws Exception {
		return this.reqtimeout;
	}

	/**
	* <pre>
	* The configured request timeout changed to adapt to the flow conditions.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_adpttimeout(String adpttimeout) throws Exception{
		this.adpttimeout = adpttimeout;
	}

	/**
	* <pre>
	* The configured request timeout changed to adapt to the flow conditions.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_adpttimeout() throws Exception {
		return this.adpttimeout;
	}

	/**
	* <pre>
	* The responder action to respond to the client when timeout occurs. It can be either of RESET|DROP|Custom Responder Action. Connection is dropped silently if no action is set.
RESET: Send RST to client when timeout occurs.
DROP: Drop the connection when timeout occurs.
Responder Action: Name of the responder action to trigger when timeout occurs, used to send custom message.
	* </pre>
	*/
	public void set_reqtimeoutaction(String reqtimeoutaction) throws Exception{
		this.reqtimeoutaction = reqtimeoutaction;
	}

	/**
	* <pre>
	* The responder action to respond to the client when timeout occurs. It can be either of RESET|DROP|Custom Responder Action. Connection is dropped silently if no action is set.
RESET: Send RST to client when timeout occurs.
DROP: Drop the connection when timeout occurs.
Responder Action: Name of the responder action to trigger when timeout occurs, used to send custom message.
	* </pre>
	*/
	public String get_reqtimeoutaction() throws Exception {
		return this.reqtimeoutaction;
	}

	/**
	* <pre>
	* Enable or disable dropping extra data from server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dropextradata(String dropextradata) throws Exception{
		this.dropextradata = dropextradata;
	}

	/**
	* <pre>
	* Enable or disable dropping extra data from server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dropextradata() throws Exception {
		return this.dropextradata;
	}

	/**
	* <pre>
	* Enable or disable weblogging.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_weblog(String weblog) throws Exception{
		this.weblog = weblog;
	}

	/**
	* <pre>
	* Enable or disable weblogging.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_weblog() throws Exception {
		return this.weblog;
	}

	/**
	* <pre>
	* Name of the header that contains real client IP.
	* </pre>
	*/
	public void set_clientiphdrexpr(String clientiphdrexpr) throws Exception{
		this.clientiphdrexpr = clientiphdrexpr;
	}

	/**
	* <pre>
	* Name of the header that contains real client IP.
	* </pre>
	*/
	public String get_clientiphdrexpr() throws Exception {
		return this.clientiphdrexpr;
	}

	/**
	* <pre>
	* Maximum requests allowed on a single connection.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_maxreq(long maxreq) throws Exception {
		this.maxreq = new Long(maxreq);
	}

	/**
	* <pre>
	* Maximum requests allowed on a single connection.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_maxreq(Long maxreq) throws Exception{
		this.maxreq = maxreq;
	}

	/**
	* <pre>
	* Maximum requests allowed on a single connection.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_maxreq() throws Exception {
		return this.maxreq;
	}

	/**
	* <pre>
	* Generate the persistent NetScaler specific ETag for the HTTP response with ETag header.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_persistentetag(String persistentetag) throws Exception{
		this.persistentetag = persistentetag;
	}

	/**
	* <pre>
	* Generate the persistent NetScaler specific ETag for the HTTP response with ETag header.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_persistentetag() throws Exception {
		return this.persistentetag;
	}

	/**
	* <pre>
	* Number of entities using this profile.
	* </pre>
	*/
	public Long get_refcnt() throws Exception {
		return this.refcnt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nshttpprofile_response result = (nshttpprofile_response) service.get_payload_formatter().string_to_resource(nshttpprofile_response.class, response);
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
		return result.nshttpprofile;
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
	* Use this API to add nshttpprofile.
	*/
	public static base_response add(nitro_service client, nshttpprofile resource) throws Exception {
		nshttpprofile addresource = new nshttpprofile();
		addresource.name = resource.name;
		addresource.dropinvalreqs = resource.dropinvalreqs;
		addresource.markhttp09inval = resource.markhttp09inval;
		addresource.markconnreqinval = resource.markconnreqinval;
		addresource.cmponpush = resource.cmponpush;
		addresource.conmultiplex = resource.conmultiplex;
		addresource.maxreusepool = resource.maxreusepool;
		addresource.dropextracrlf = resource.dropextracrlf;
		addresource.incomphdrdelay = resource.incomphdrdelay;
		addresource.websocket = resource.websocket;
		addresource.reqtimeout = resource.reqtimeout;
		addresource.adpttimeout = resource.adpttimeout;
		addresource.reqtimeoutaction = resource.reqtimeoutaction;
		addresource.dropextradata = resource.dropextradata;
		addresource.weblog = resource.weblog;
		addresource.clientiphdrexpr = resource.clientiphdrexpr;
		addresource.maxreq = resource.maxreq;
		addresource.persistentetag = resource.persistentetag;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nshttpprofile resources.
	*/
	public static base_responses add(nitro_service client, nshttpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshttpprofile addresources[] = new nshttpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nshttpprofile();
				addresources[i].name = resources[i].name;
				addresources[i].dropinvalreqs = resources[i].dropinvalreqs;
				addresources[i].markhttp09inval = resources[i].markhttp09inval;
				addresources[i].markconnreqinval = resources[i].markconnreqinval;
				addresources[i].cmponpush = resources[i].cmponpush;
				addresources[i].conmultiplex = resources[i].conmultiplex;
				addresources[i].maxreusepool = resources[i].maxreusepool;
				addresources[i].dropextracrlf = resources[i].dropextracrlf;
				addresources[i].incomphdrdelay = resources[i].incomphdrdelay;
				addresources[i].websocket = resources[i].websocket;
				addresources[i].reqtimeout = resources[i].reqtimeout;
				addresources[i].adpttimeout = resources[i].adpttimeout;
				addresources[i].reqtimeoutaction = resources[i].reqtimeoutaction;
				addresources[i].dropextradata = resources[i].dropextradata;
				addresources[i].weblog = resources[i].weblog;
				addresources[i].clientiphdrexpr = resources[i].clientiphdrexpr;
				addresources[i].maxreq = resources[i].maxreq;
				addresources[i].persistentetag = resources[i].persistentetag;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nshttpprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		nshttpprofile deleteresource = new nshttpprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nshttpprofile.
	*/
	public static base_response delete(nitro_service client, nshttpprofile resource) throws Exception {
		nshttpprofile deleteresource = new nshttpprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nshttpprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nshttpprofile deleteresources[] = new nshttpprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new nshttpprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nshttpprofile resources.
	*/
	public static base_responses delete(nitro_service client, nshttpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshttpprofile deleteresources[] = new nshttpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nshttpprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nshttpprofile.
	*/
	public static base_response update(nitro_service client, nshttpprofile resource) throws Exception {
		nshttpprofile updateresource = new nshttpprofile();
		updateresource.name = resource.name;
		updateresource.dropinvalreqs = resource.dropinvalreqs;
		updateresource.markhttp09inval = resource.markhttp09inval;
		updateresource.markconnreqinval = resource.markconnreqinval;
		updateresource.cmponpush = resource.cmponpush;
		updateresource.conmultiplex = resource.conmultiplex;
		updateresource.maxreusepool = resource.maxreusepool;
		updateresource.dropextracrlf = resource.dropextracrlf;
		updateresource.incomphdrdelay = resource.incomphdrdelay;
		updateresource.websocket = resource.websocket;
		updateresource.reqtimeout = resource.reqtimeout;
		updateresource.adpttimeout = resource.adpttimeout;
		updateresource.reqtimeoutaction = resource.reqtimeoutaction;
		updateresource.dropextradata = resource.dropextradata;
		updateresource.weblog = resource.weblog;
		updateresource.clientiphdrexpr = resource.clientiphdrexpr;
		updateresource.maxreq = resource.maxreq;
		updateresource.persistentetag = resource.persistentetag;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nshttpprofile resources.
	*/
	public static base_responses update(nitro_service client, nshttpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshttpprofile updateresources[] = new nshttpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nshttpprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].dropinvalreqs = resources[i].dropinvalreqs;
				updateresources[i].markhttp09inval = resources[i].markhttp09inval;
				updateresources[i].markconnreqinval = resources[i].markconnreqinval;
				updateresources[i].cmponpush = resources[i].cmponpush;
				updateresources[i].conmultiplex = resources[i].conmultiplex;
				updateresources[i].maxreusepool = resources[i].maxreusepool;
				updateresources[i].dropextracrlf = resources[i].dropextracrlf;
				updateresources[i].incomphdrdelay = resources[i].incomphdrdelay;
				updateresources[i].websocket = resources[i].websocket;
				updateresources[i].reqtimeout = resources[i].reqtimeout;
				updateresources[i].adpttimeout = resources[i].adpttimeout;
				updateresources[i].reqtimeoutaction = resources[i].reqtimeoutaction;
				updateresources[i].dropextradata = resources[i].dropextradata;
				updateresources[i].weblog = resources[i].weblog;
				updateresources[i].clientiphdrexpr = resources[i].clientiphdrexpr;
				updateresources[i].maxreq = resources[i].maxreq;
				updateresources[i].persistentetag = resources[i].persistentetag;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nshttpprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		nshttpprofile unsetresource = new nshttpprofile();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of nshttpprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nshttpprofile resource, String[] args) throws Exception{
		nshttpprofile unsetresource = new nshttpprofile();
		unsetresource.name = resource.name;
		unsetresource.dropinvalreqs = resource.dropinvalreqs;
		unsetresource.markhttp09inval = resource.markhttp09inval;
		unsetresource.markconnreqinval = resource.markconnreqinval;
		unsetresource.cmponpush = resource.cmponpush;
		unsetresource.conmultiplex = resource.conmultiplex;
		unsetresource.maxreusepool = resource.maxreusepool;
		unsetresource.dropextracrlf = resource.dropextracrlf;
		unsetresource.incomphdrdelay = resource.incomphdrdelay;
		unsetresource.websocket = resource.websocket;
		unsetresource.dropextradata = resource.dropextradata;
		unsetresource.clientiphdrexpr = resource.clientiphdrexpr;
		unsetresource.reqtimeout = resource.reqtimeout;
		unsetresource.adpttimeout = resource.adpttimeout;
		unsetresource.reqtimeoutaction = resource.reqtimeoutaction;
		unsetresource.weblog = resource.weblog;
		unsetresource.maxreq = resource.maxreq;
		unsetresource.persistentetag = resource.persistentetag;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nshttpprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nshttpprofile unsetresources[] = new nshttpprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new nshttpprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nshttpprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nshttpprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshttpprofile unsetresources[] = new nshttpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nshttpprofile();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].dropinvalreqs = resources[i].dropinvalreqs;
				unsetresources[i].markhttp09inval = resources[i].markhttp09inval;
				unsetresources[i].markconnreqinval = resources[i].markconnreqinval;
				unsetresources[i].cmponpush = resources[i].cmponpush;
				unsetresources[i].conmultiplex = resources[i].conmultiplex;
				unsetresources[i].maxreusepool = resources[i].maxreusepool;
				unsetresources[i].dropextracrlf = resources[i].dropextracrlf;
				unsetresources[i].incomphdrdelay = resources[i].incomphdrdelay;
				unsetresources[i].websocket = resources[i].websocket;
				unsetresources[i].dropextradata = resources[i].dropextradata;
				unsetresources[i].clientiphdrexpr = resources[i].clientiphdrexpr;
				unsetresources[i].reqtimeout = resources[i].reqtimeout;
				unsetresources[i].adpttimeout = resources[i].adpttimeout;
				unsetresources[i].reqtimeoutaction = resources[i].reqtimeoutaction;
				unsetresources[i].weblog = resources[i].weblog;
				unsetresources[i].maxreq = resources[i].maxreq;
				unsetresources[i].persistentetag = resources[i].persistentetag;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nshttpprofile resources that are configured on netscaler.
	*/
	public static nshttpprofile[] get(nitro_service service) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		nshttpprofile[] response = (nshttpprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nshttpprofile resources that are configured on netscaler.
	*/
	public static nshttpprofile[] get(nitro_service service, options option) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		nshttpprofile[] response = (nshttpprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nshttpprofile resource of given name .
	*/
	public static nshttpprofile get(nitro_service service, String name) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		obj.set_name(name);
		nshttpprofile response = (nshttpprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nshttpprofile resources of given names .
	*/
	public static nshttpprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nshttpprofile response[] = new nshttpprofile[name.length];
			nshttpprofile obj[] = new nshttpprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nshttpprofile();
				obj[i].set_name(name[i]);
				response[i] = (nshttpprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nshttpprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nshttpprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_filter(filter);
		nshttpprofile[] response = (nshttpprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nshttpprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nshttpprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_filter(filter);
		nshttpprofile[] response = (nshttpprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nshttpprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_count(true);
		nshttpprofile[] response = (nshttpprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nshttpprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nshttpprofile[] response = (nshttpprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nshttpprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nshttpprofile[] response = (nshttpprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class conmultiplexEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class markhttp09invalEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class adpttimeoutEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class markconnreqinvalEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class persistentetagEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dropinvalreqsEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dropextracrlfEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dropextradataEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class websocketEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cmponpushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class weblogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
