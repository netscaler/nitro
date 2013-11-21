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

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cacheobject_response extends base_response
{
	public cacheobject[] cacheobject;
}
/**
* Configuration for cache object resource.
*/

public class cacheobject extends base_resource
{
	private String url;
	private Long locator;
	private Long httpstatus;
	private String host;
	private Integer port;
	private String groupname;
	private String httpmethod;
	private String group;
	private String ignoremarkerobjects;
	private String includenotreadyobjects;
	private Boolean force;

	//------- Read only Parameter ---------;

	private Long cacheressize;
	private Long cachereshdrsize;
	private String cacheetag;
	private Long httpstatusoutput;
	private String cachereslastmod;
	private String cachecontrol;
	private String cacheresdate;
	private String contentgroup;
	private String destipv46;
	private Integer destport;
	private String cachecellcomplex;
	private String[] hitparams;
	private String[] hitvalues;
	private Long cachecellreqtime;
	private Long cachecellrestime;
	private Long cachecurage;
	private Long cachecellexpires;
	private Long cachecellexpiresmillisec;
	private String flushed;
	private String prefetch;
	private Long prefetchperiod;
	private Long prefetchperiodmillisec;
	private Long cachecellcurreaders;
	private Long cachecellcurmisses;
	private Long cachecellhits;
	private Long cachecellmisses;
	private Long cachecelldhits;
	private String cachecellcompressionformat;
	private String cachecellappfwmetadataexists;
	private String cachecellhttp11;
	private String cachecellweaketag;
	private String cachecellresbadsize;
	private String markerreason;
	private String cachecellpolleverytime;
	private String cachecelletaginserted;
	private String cachecellreadywithlastbyte;
	private String cacheinmemory;
	private String cacheindisk;
	private String cachedirname;
	private String cachefilename;
	private String cachecelldestipverified;
	private String cachecellfwpxyobj;
	private String cachecellbasefile;
	private String cachecellminhitflag;
	private Integer cachecellminhit;
	private Integer policy;
	private String policyname;
	private String[] selectorname;
	private String[] rule;
	private String[] selectorvalue;
	private String cacheurls;
	private Long warnbucketskip;
	private Long totalobjs;
	private String httpcalloutcell;
	private String httpcalloutname;
	private String returntype;
	private String httpcalloutresult;
	private Long ceflags;
	private Long __count;

	/**
	* <pre>
	* URL of the particular object whose details is required. Parameter "host" must be specified along with the URL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_url(String url) throws Exception{
		this.url = url;
	}

	/**
	* <pre>
	* URL of the particular object whose details is required. Parameter "host" must be specified along with the URL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* ID of the cached object.
	* </pre>
	*/
	public void set_locator(long locator) throws Exception {
		this.locator = new Long(locator);
	}

	/**
	* <pre>
	* ID of the cached object.
	* </pre>
	*/
	public void set_locator(Long locator) throws Exception{
		this.locator = locator;
	}

	/**
	* <pre>
	* ID of the cached object.
	* </pre>
	*/
	public Long get_locator() throws Exception {
		return this.locator;
	}

	/**
	* <pre>
	* HTTP status of the object.
	* </pre>
	*/
	public void set_httpstatus(long httpstatus) throws Exception {
		this.httpstatus = new Long(httpstatus);
	}

	/**
	* <pre>
	* HTTP status of the object.
	* </pre>
	*/
	public void set_httpstatus(Long httpstatus) throws Exception{
		this.httpstatus = httpstatus;
	}

	/**
	* <pre>
	* HTTP status of the object.
	* </pre>
	*/
	public Long get_httpstatus() throws Exception {
		return this.httpstatus;
	}

	/**
	* <pre>
	* Host name of the object. Parameter "url" must be specified.<br> Minimum length =  1
	* </pre>
	*/
	public void set_host(String host) throws Exception{
		this.host = host;
	}

	/**
	* <pre>
	* Host name of the object. Parameter "url" must be specified.<br> Minimum length =  1
	* </pre>
	*/
	public String get_host() throws Exception {
		return this.host;
	}

	/**
	* <pre>
	* Host port of the object. You must also set the Host parameter.<br> Default value: 80<br> Minimum value =  1
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Host port of the object. You must also set the Host parameter.<br> Default value: 80<br> Minimum value =  1
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Host port of the object. You must also set the Host parameter.<br> Default value: 80<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Name of the content group to which the object belongs. It will display only the objects belonging to the specified content group. You must also set the Host parameter.
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* Name of the content group to which the object belongs. It will display only the objects belonging to the specified content group. You must also set the Host parameter.
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* HTTP request method that caused the object to be stored.<br> Default value: GET<br> Possible values = GET, POST
	* </pre>
	*/
	public void set_httpmethod(String httpmethod) throws Exception{
		this.httpmethod = httpmethod;
	}

	/**
	* <pre>
	* HTTP request method that caused the object to be stored.<br> Default value: GET<br> Possible values = GET, POST
	* </pre>
	*/
	public String get_httpmethod() throws Exception {
		return this.httpmethod;
	}

	/**
	* <pre>
	* Name of the content group whose objects should be listed.
	* </pre>
	*/
	public void set_group(String group) throws Exception{
		this.group = group;
	}

	/**
	* <pre>
	* Name of the content group whose objects should be listed.
	* </pre>
	*/
	public String get_group() throws Exception {
		return this.group;
	}

	/**
	* <pre>
	* Ignore marker objects. Marker objects are created when a response exceeds the maximum or minimum response size for the content group or has not yet received the minimum number of hits for the content group.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_ignoremarkerobjects(String ignoremarkerobjects) throws Exception{
		this.ignoremarkerobjects = ignoremarkerobjects;
	}

	/**
	* <pre>
	* Ignore marker objects. Marker objects are created when a response exceeds the maximum or minimum response size for the content group or has not yet received the minimum number of hits for the content group.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_ignoremarkerobjects() throws Exception {
		return this.ignoremarkerobjects;
	}

	/**
	* <pre>
	* Include responses that have not yet reached a minimum number of hits before being cached.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_includenotreadyobjects(String includenotreadyobjects) throws Exception{
		this.includenotreadyobjects = includenotreadyobjects;
	}

	/**
	* <pre>
	* Include responses that have not yet reached a minimum number of hits before being cached.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_includenotreadyobjects() throws Exception {
		return this.includenotreadyobjects;
	}

	/**
	* <pre>
	* Force all copies to be flushed including on disk.
	* </pre>
	*/
	public void set_force(boolean force) throws Exception {
		this.force = new Boolean(force);
	}

	/**
	* <pre>
	* Force all copies to be flushed including on disk.
	* </pre>
	*/
	public void set_force(Boolean force) throws Exception{
		this.force = force;
	}

	/**
	* <pre>
	* Force all copies to be flushed including on disk.
	* </pre>
	*/
	public Boolean get_force() throws Exception {
		return this.force;
	}

	/**
	* <pre>
	* Cache response size of the object.
	* </pre>
	*/
	public Long get_cacheressize() throws Exception {
		return this.cacheressize;
	}

	/**
	* <pre>
	* Cache response header size of the object.
	* </pre>
	*/
	public Long get_cachereshdrsize() throws Exception {
		return this.cachereshdrsize;
	}

	/**
	* <pre>
	* Cache ETag of the object.
	* </pre>
	*/
	public String get_cacheetag() throws Exception {
		return this.cacheetag;
	}

	/**
	* <pre>
	* HTTP status of the object.
	* </pre>
	*/
	public Long get_httpstatusoutput() throws Exception {
		return this.httpstatusoutput;
	}

	/**
	* <pre>
	* Value of "Last-modified" header.
	* </pre>
	*/
	public String get_cachereslastmod() throws Exception {
		return this.cachereslastmod;
	}

	/**
	* <pre>
	* Cache-Control header of the object.
	* </pre>
	*/
	public String get_cachecontrol() throws Exception {
		return this.cachecontrol;
	}

	/**
	* <pre>
	* Value of "Date" header.
	* </pre>
	*/
	public String get_cacheresdate() throws Exception {
		return this.cacheresdate;
	}

	/**
	* <pre>
	* Name of the contentgroup in which it is stored.
	* </pre>
	*/
	public String get_contentgroup() throws Exception {
		return this.contentgroup;
	}

	/**
	* <pre>
	* Destination IP.
	* </pre>
	*/
	public String get_destipv46() throws Exception {
		return this.destipv46;
	}

	/**
	* <pre>
	* Destination Port.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* The state of the parameterized caching on this cell.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellcomplex() throws Exception {
		return this.cachecellcomplex;
	}

	/**
	* <pre>
	* Parameterized hit evaluation of an object.
	* </pre>
	*/
	public String[] get_hitparams() throws Exception {
		return this.hitparams;
	}

	/**
	* <pre>
	* Values of hitparams for this object.
	* </pre>
	*/
	public String[] get_hitvalues() throws Exception {
		return this.hitvalues;
	}

	/**
	* <pre>
	* Required time of the cache cell object.
	* </pre>
	*/
	public Long get_cachecellreqtime() throws Exception {
		return this.cachecellreqtime;
	}

	/**
	* <pre>
	* Response time to the cache cell object.
	* </pre>
	*/
	public Long get_cachecellrestime() throws Exception {
		return this.cachecellrestime;
	}

	/**
	* <pre>
	* Current age of the cache object.
	* </pre>
	*/
	public Long get_cachecurage() throws Exception {
		return this.cachecurage;
	}

	/**
	* <pre>
	* Expiry time of the cache cell object in seconds.
	* </pre>
	*/
	public Long get_cachecellexpires() throws Exception {
		return this.cachecellexpires;
	}

	/**
	* <pre>
	* Expiry time of the cache cell object in milliseconds.
	* </pre>
	*/
	public Long get_cachecellexpiresmillisec() throws Exception {
		return this.cachecellexpiresmillisec;
	}

	/**
	* <pre>
	* Specifies whether the object is flushed.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_flushed() throws Exception {
		return this.flushed;
	}

	/**
	* <pre>
	* Specifies whether Integrated Cache should attempt to refresh an object immediately before it goes stale.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_prefetch() throws Exception {
		return this.prefetch;
	}

	/**
	* <pre>
	* The duration in seconds of the period during which prefetch should be attempted, immediately before the object's calculated expiry time.
	* </pre>
	*/
	public Long get_prefetchperiod() throws Exception {
		return this.prefetchperiod;
	}

	/**
	* <pre>
	* The duration in milliseconds of the period during which prefetch should be attempted, immediately before the object's calculated expiry time.
	* </pre>
	*/
	public Long get_prefetchperiodmillisec() throws Exception {
		return this.prefetchperiodmillisec;
	}

	/**
	* <pre>
	* Current readers of the cache cell object.
	* </pre>
	*/
	public Long get_cachecellcurreaders() throws Exception {
		return this.cachecellcurreaders;
	}

	/**
	* <pre>
	* Current misses of the cache cell object.
	* </pre>
	*/
	public Long get_cachecellcurmisses() throws Exception {
		return this.cachecellcurmisses;
	}

	/**
	* <pre>
	* Cache cell hits.
	* </pre>
	*/
	public Long get_cachecellhits() throws Exception {
		return this.cachecellhits;
	}

	/**
	* <pre>
	* Cache cell misses.
	* </pre>
	*/
	public Long get_cachecellmisses() throws Exception {
		return this.cachecellmisses;
	}

	/**
	* <pre>
	* Cache cell disk hits.
	* </pre>
	*/
	public Long get_cachecelldhits() throws Exception {
		return this.cachecelldhits;
	}

	/**
	* <pre>
	* Compression format of this object. Identity means not compressed.
	* </pre>
	*/
	public String get_cachecellcompressionformat() throws Exception {
		return this.cachecellcompressionformat;
	}

	/**
	* <pre>
	* AppFirewall cache object.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellappfwmetadataexists() throws Exception {
		return this.cachecellappfwmetadataexists;
	}

	/**
	* <pre>
	* The state of the response to be HTTP/1.1.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellhttp11() throws Exception {
		return this.cachecellhttp11;
	}

	/**
	* <pre>
	* The state of the weak HTTP Entity Tag in the cell.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellweaketag() throws Exception {
		return this.cachecellweaketag;
	}

	/**
	* <pre>
	* The marked state of the cell.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellresbadsize() throws Exception {
		return this.cachecellresbadsize;
	}

	/**
	* <pre>
	* Reason for marking the cell.<br> Possible values = Waiting for min hit, Response header is too big, Content-length header said response size is not in group size limit, Content-length response received more data, Content-length response received less data, Content-length response data is not in group size limit, Chunk response received more data, Chunk response data is not in group size limit, Bad chunk format, Fin terminated response data is not in group size limit
	* </pre>
	*/
	public String get_markerreason() throws Exception {
		return this.markerreason;
	}

	/**
	* <pre>
	* The state to poll every time on object.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellpolleverytime() throws Exception {
		return this.cachecellpolleverytime;
	}

	/**
	* <pre>
	* The state of the ETag to be inserted by IC for this object.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecelletaginserted() throws Exception {
		return this.cachecelletaginserted;
	}

	/**
	* <pre>
	* The state of the complete arrived response.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellreadywithlastbyte() throws Exception {
		return this.cachecellreadywithlastbyte;
	}

	/**
	* <pre>
	* The cache data is available in memory.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cacheinmemory() throws Exception {
		return this.cacheinmemory;
	}

	/**
	* <pre>
	* The cache data is available in disk.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cacheindisk() throws Exception {
		return this.cacheindisk;
	}

	/**
	* <pre>
	* The directory name used if saved.
	* </pre>
	*/
	public String get_cachedirname() throws Exception {
		return this.cachedirname;
	}

	/**
	* <pre>
	* The filename used if saved.
	* </pre>
	*/
	public String get_cachefilename() throws Exception {
		return this.cachefilename;
	}

	/**
	* <pre>
	* The state of DNS verification.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecelldestipverified() throws Exception {
		return this.cachecelldestipverified;
	}

	/**
	* <pre>
	* The state of the object to be stored on a request to a forward proxy.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellfwpxyobj() throws Exception {
		return this.cachecellfwpxyobj;
	}

	/**
	* <pre>
	* The state of delta being used as a basefile.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellbasefile() throws Exception {
		return this.cachecellbasefile;
	}

	/**
	* <pre>
	* The state of the minhit feature on this cell.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachecellminhitflag() throws Exception {
		return this.cachecellminhitflag;
	}

	/**
	* <pre>
	* Min hit value for the object.
	* </pre>
	*/
	public Integer get_cachecellminhit() throws Exception {
		return this.cachecellminhit;
	}

	/**
	* <pre>
	* Policy info for the object.
	* </pre>
	*/
	public Integer get_policy() throws Exception {
		return this.policy;
	}

	/**
	* <pre>
	* Policy which created the object.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The hit selector for the object.
	* </pre>
	*/
	public String[] get_selectorname() throws Exception {
		return this.selectorname;
	}

	/**
	* <pre>
	* Selectors for this object.
	* </pre>
	*/
	public String[] get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The HTTP request method that caused the object to be stored.
	* </pre>
	*/
	public String[] get_selectorvalue() throws Exception {
		return this.selectorvalue;
	}

	/**
	* <pre>
	* List of cache object URLs.
	* </pre>
	*/
	public String get_cacheurls() throws Exception {
		return this.cacheurls;
	}

	/**
	* <pre>
	* Bucket skipped warning.
	* </pre>
	*/
	public Long get_warnbucketskip() throws Exception {
		return this.warnbucketskip;
	}

	/**
	* <pre>
	* Total objects.
	* </pre>
	*/
	public Long get_totalobjs() throws Exception {
		return this.totalobjs;
	}

	/**
	* <pre>
	* Is it a http callout cell ?.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_httpcalloutcell() throws Exception {
		return this.httpcalloutcell;
	}

	/**
	* <pre>
	* Name of the http callout.
	* </pre>
	*/
	public String get_httpcalloutname() throws Exception {
		return this.httpcalloutname;
	}

	/**
	* <pre>
	* Return type of the http callout.<br> Possible values = BOOL, NUM, TEXT
	* </pre>
	*/
	public String get_returntype() throws Exception {
		return this.returntype;
	}

	/**
	* <pre>
	* First few bytes of http callout response.
	* </pre>
	*/
	public String get_httpcalloutresult() throws Exception {
		return this.httpcalloutresult;
	}

	/**
	* <pre>
	* Indicates state and type of cached cell.
	* </pre>
	*/
	public Long get_ceflags() throws Exception {
		return this.ceflags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cacheobject_response result = (cacheobject_response) service.get_payload_formatter().string_to_resource(cacheobject_response.class, response);
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
		return result.cacheobject;
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
	* Use this API to expire cacheobject.
	*/
	public static base_response expire(nitro_service client, cacheobject resource) throws Exception {
		cacheobject expireresource = new cacheobject();
		expireresource.locator = resource.locator;
		expireresource.url = resource.url;
		expireresource.host = resource.host;
		expireresource.port = resource.port;
		expireresource.groupname = resource.groupname;
		expireresource.httpmethod = resource.httpmethod;
		return expireresource.perform_operation(client,"expire");
	}

	/**
	* Use this API to expire cacheobject resources.
	*/
	public static base_responses expire(nitro_service client, cacheobject resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cacheobject expireresources[] = new cacheobject[resources.length];
			for (int i=0;i<resources.length;i++){
				expireresources[i] = new cacheobject();
				expireresources[i].locator = resources[i].locator;
				expireresources[i].url = resources[i].url;
				expireresources[i].host = resources[i].host;
				expireresources[i].port = resources[i].port;
				expireresources[i].groupname = resources[i].groupname;
				expireresources[i].httpmethod = resources[i].httpmethod;
			}
			result = perform_operation_bulk_request(client, expireresources,"expire");
		}
		return result;
	}

	/**
	* Use this API to flush cacheobject.
	*/
	public static base_response flush(nitro_service client, cacheobject resource) throws Exception {
		cacheobject flushresource = new cacheobject();
		flushresource.locator = resource.locator;
		flushresource.url = resource.url;
		flushresource.host = resource.host;
		flushresource.port = resource.port;
		flushresource.groupname = resource.groupname;
		flushresource.httpmethod = resource.httpmethod;
		flushresource.force = resource.force;
		return flushresource.perform_operation(client,"flush");
	}

	/**
	* Use this API to flush cacheobject resources.
	*/
	public static base_responses flush(nitro_service client, cacheobject resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cacheobject flushresources[] = new cacheobject[resources.length];
			for (int i=0;i<resources.length;i++){
				flushresources[i] = new cacheobject();
				flushresources[i].locator = resources[i].locator;
				flushresources[i].url = resources[i].url;
				flushresources[i].host = resources[i].host;
				flushresources[i].port = resources[i].port;
				flushresources[i].groupname = resources[i].groupname;
				flushresources[i].httpmethod = resources[i].httpmethod;
				flushresources[i].force = resources[i].force;
			}
			result = perform_operation_bulk_request(client, flushresources,"flush");
		}
		return result;
	}

	/**
	* Use this API to save cacheobject.
	*/
	public static base_response save(nitro_service client, cacheobject resource) throws Exception {
		cacheobject saveresource = new cacheobject();
		saveresource.locator = resource.locator;
		return saveresource.perform_operation(client,"save");
	}

	/**
	* Use this API to save cacheobject resources.
	*/
	public static base_responses save(nitro_service client, cacheobject resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cacheobject saveresources[] = new cacheobject[resources.length];
			for (int i=0;i<resources.length;i++){
				saveresources[i] = new cacheobject();
				saveresources[i].locator = resources[i].locator;
			}
			result = perform_operation_bulk_request(client, saveresources,"save");
		}
		return result;
	}

	/**
	* Use this API to fetch all the cacheobject resources that are configured on netscaler.
	*/
	public static cacheobject[] get(nitro_service service) throws Exception{
		cacheobject obj = new cacheobject();
		cacheobject[] response = (cacheobject[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cacheobject resources that are configured on netscaler.
	*/
	public static cacheobject[] get(nitro_service service, options option) throws Exception{
		cacheobject obj = new cacheobject();
		cacheobject[] response = (cacheobject[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the cacheobject resources that are configured on netscaler.
	* This uses cacheobject_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static cacheobject[] get(nitro_service service, cacheobject_args args) throws Exception{
		cacheobject obj = new cacheobject();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		cacheobject[] response = (cacheobject[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cacheobject resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cacheobject[] get_filtered(nitro_service service, String filter) throws Exception{
		cacheobject obj = new cacheobject();
		options option = new options();
		option.set_filter(filter);
		cacheobject[] response = (cacheobject[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cacheobject resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cacheobject[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cacheobject obj = new cacheobject();
		options option = new options();
		option.set_filter(filter);
		cacheobject[] response = (cacheobject[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cacheobject resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cacheobject obj = new cacheobject();
		options option = new options();
		option.set_count(true);
		cacheobject[] response = (cacheobject[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cacheobject resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cacheobject obj = new cacheobject();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cacheobject[] response = (cacheobject[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cacheobject resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cacheobject obj = new cacheobject();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cacheobject[] response = (cacheobject[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cachecellfwpxyobjEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class markerreasonEnum {
		public static final String Waiting_for_min_hit = "Waiting for min hit";
		public static final String Response_header_is_too_big = "Response header is too big";
		public static final String Content_length_header_said_response_size_is_not_in_group_size_limit = "Content-length header said response size is not in group size limit";
		public static final String Content_length_response_received_more_data = "Content-length response received more data";
		public static final String Content_length_response_received_less_data = "Content-length response received less data";
		public static final String Content_length_response_data_is_not_in_group_size_limit = "Content-length response data is not in group size limit";
		public static final String Chunk_response_received_more_data = "Chunk response received more data";
		public static final String Chunk_response_data_is_not_in_group_size_limit = "Chunk response data is not in group size limit";
		public static final String Bad_chunk_format = "Bad chunk format";
		public static final String Fin_terminated_response_data_is_not_in_group_size_limit = "Fin terminated response data is not in group size limit";
	}
	public static class cachecellbasefileEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cachecellpolleverytimeEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class httpmethodEnum {
		public static final String GET = "GET";
		public static final String POST = "POST";
	}
	public static class cachecellcomplexEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class returntypeEnum {
		public static final String BOOL = "BOOL";
		public static final String NUM = "NUM";
		public static final String TEXT = "TEXT";
	}
	public static class httpcalloutcellEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cachecelletaginsertedEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cachecellweaketagEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cacheinmemoryEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class ignoremarkerobjectsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class cachecellreadywithlastbyteEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cachecellappfwmetadataexistsEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class flushedEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cachecelldestipverifiedEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cachecellhttp11Enum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class includenotreadyobjectsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class cachecellresbadsizeEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class prefetchEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cachecellminhitflagEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cacheindiskEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
