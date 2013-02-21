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

class cachecontentgroup_response extends base_response
{
	public cachecontentgroup[] cachecontentgroup;
}
/**
* Configuration for Integrated Cache content group resource.
*/

public class cachecontentgroup extends base_resource
{
	private String name;
	private Long weakposrelexpiry;
	private Long heurexpiryparam;
	private Long relexpiry;
	private Long relexpirymillisec;
	private String[] absexpiry;
	private String[] absexpirygmt;
	private Long weaknegrelexpiry;
	private String[] hitparams;
	private String[] invalparams;
	private String ignoreparamvaluecase;
	private String matchcookies;
	private String invalrestrictedtohost;
	private String polleverytime;
	private String ignorereloadreq;
	private String removecookies;
	private String prefetch;
	private Long prefetchperiod;
	private Long prefetchperiodmillisec;
	private Long prefetchmaxpending;
	private String flashcache;
	private String expireatlastbyte;
	private String insertvia;
	private String insertage;
	private String insertetag;
	private String cachecontrol;
	private Long quickabortsize;
	private Long minressize;
	private Long maxressize;
	private Long memlimit;
	private String ignorereqcachinghdrs;
	private Integer minhits;
	private String alwaysevalpolicies;
	private String pinned;
	private String lazydnsresolve;
	private String hitselector;
	private String invalselector;
	private String type;
	private String query;
	private String host;
	private String selectorvalue;

	//------- Read only Parameter ---------;

	private Long flags;
	private Long prefetchcur;
	private Long memusage;
	private Long cachenon304hits;
	private Long cache304hits;
	private Long cachecells;
	private Long cachegroupincarnation;
	private String[] policyname;
	private Long cachenuminvalpolicy;
	private Long markercells;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the content group to be created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the content group to be created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Use this parameter for responses with response codes between 200 and 399. (Similar to -relExpiry but has lesser precedence.).<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_weakposrelexpiry(long weakposrelexpiry) throws Exception {
		this.weakposrelexpiry = new Long(weakposrelexpiry);
	}

	/**
	* <pre>
	* Use this parameter for responses with response codes between 200 and 399. (Similar to -relExpiry but has lesser precedence.).<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_weakposrelexpiry(Long weakposrelexpiry) throws Exception{
		this.weakposrelexpiry = weakposrelexpiry;
	}

	/**
	* <pre>
	* Use this parameter for responses with response codes between 200 and 399. (Similar to -relExpiry but has lesser precedence.).<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_weakposrelexpiry() throws Exception {
		return this.weakposrelexpiry;
	}

	/**
	* <pre>
	* The heuristic expiry time, in percent of the duration since the object was last modified.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_heurexpiryparam(long heurexpiryparam) throws Exception {
		this.heurexpiryparam = new Long(heurexpiryparam);
	}

	/**
	* <pre>
	* The heuristic expiry time, in percent of the duration since the object was last modified.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_heurexpiryparam(Long heurexpiryparam) throws Exception{
		this.heurexpiryparam = heurexpiryparam;
	}

	/**
	* <pre>
	* The heuristic expiry time, in percent of the duration since the object was last modified.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_heurexpiryparam() throws Exception {
		return this.heurexpiryparam;
	}

	/**
	* <pre>
	* The relative expiry time in seconds.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_relexpiry(long relexpiry) throws Exception {
		this.relexpiry = new Long(relexpiry);
	}

	/**
	* <pre>
	* The relative expiry time in seconds.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_relexpiry(Long relexpiry) throws Exception{
		this.relexpiry = relexpiry;
	}

	/**
	* <pre>
	* The relative expiry time in seconds.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_relexpiry() throws Exception {
		return this.relexpiry;
	}

	/**
	* <pre>
	* The relative expiry time in milliseconds.<br> Minimum value =  0<br> Maximum value =  86400000
	* </pre>
	*/
	public void set_relexpirymillisec(long relexpirymillisec) throws Exception {
		this.relexpirymillisec = new Long(relexpirymillisec);
	}

	/**
	* <pre>
	* The relative expiry time in milliseconds.<br> Minimum value =  0<br> Maximum value =  86400000
	* </pre>
	*/
	public void set_relexpirymillisec(Long relexpirymillisec) throws Exception{
		this.relexpirymillisec = relexpirymillisec;
	}

	/**
	* <pre>
	* The relative expiry time in milliseconds.<br> Minimum value =  0<br> Maximum value =  86400000
	* </pre>
	*/
	public Long get_relexpirymillisec() throws Exception {
		return this.relexpirymillisec;
	}

	/**
	* <pre>
	* Up to 4 times a day (local time) when all objects in the content group must expire.
	* </pre>
	*/
	public void set_absexpiry(String[] absexpiry) throws Exception{
		this.absexpiry = absexpiry;
	}

	/**
	* <pre>
	* Up to 4 times a day (local time) when all objects in the content group must expire.
	* </pre>
	*/
	public String[] get_absexpiry() throws Exception {
		return this.absexpiry;
	}

	/**
	* <pre>
	* Up to 4 times a day (GMT), when all objects in the content group must expire.
	* </pre>
	*/
	public void set_absexpirygmt(String[] absexpirygmt) throws Exception{
		this.absexpirygmt = absexpirygmt;
	}

	/**
	* <pre>
	* Up to 4 times a day (GMT), when all objects in the content group must expire.
	* </pre>
	*/
	public String[] get_absexpirygmt() throws Exception {
		return this.absexpirygmt;
	}

	/**
	* <pre>
	* Use this parameter for all negative responses. This value will be used only if the expiry time cannot be determiend from any other source.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_weaknegrelexpiry(long weaknegrelexpiry) throws Exception {
		this.weaknegrelexpiry = new Long(weaknegrelexpiry);
	}

	/**
	* <pre>
	* Use this parameter for all negative responses. This value will be used only if the expiry time cannot be determiend from any other source.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_weaknegrelexpiry(Long weaknegrelexpiry) throws Exception{
		this.weaknegrelexpiry = weaknegrelexpiry;
	}

	/**
	* <pre>
	* Use this parameter for all negative responses. This value will be used only if the expiry time cannot be determiend from any other source.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_weaknegrelexpiry() throws Exception {
		return this.weaknegrelexpiry;
	}

	/**
	* <pre>
	* Use these parameters for parameterized hit evaluation of an object. Up to 128 parameters can be configured.<br> Minimum length =  1
	* </pre>
	*/
	public void set_hitparams(String[] hitparams) throws Exception{
		this.hitparams = hitparams;
	}

	/**
	* <pre>
	* Use these parameters for parameterized hit evaluation of an object. Up to 128 parameters can be configured.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_hitparams() throws Exception {
		return this.hitparams;
	}

	/**
	* <pre>
	* Use these parameters for parameterized invalidation of an object. Up to 8 parameters can be configured.<br> Minimum length =  1
	* </pre>
	*/
	public void set_invalparams(String[] invalparams) throws Exception{
		this.invalparams = invalparams;
	}

	/**
	* <pre>
	* Use these parameters for parameterized invalidation of an object. Up to 8 parameters can be configured.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_invalparams() throws Exception {
		return this.invalparams;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to ignore case when comparing parameter values during parameterized hit evaluation.
 (Parameter value case is always ignored during parameterized invalidation.).<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_ignoreparamvaluecase(String ignoreparamvaluecase) throws Exception{
		this.ignoreparamvaluecase = ignoreparamvaluecase;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to ignore case when comparing parameter values during parameterized hit evaluation.
 (Parameter value case is always ignored during parameterized invalidation.).<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_ignoreparamvaluecase() throws Exception {
		return this.ignoreparamvaluecase;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to look for parameters also in the cookie header.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_matchcookies(String matchcookies) throws Exception{
		this.matchcookies = matchcookies;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to look for parameters also in the cookie header.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_matchcookies() throws Exception {
		return this.matchcookies;
	}

	/**
	* <pre>
	* Use this parameter to specify whether the host header should be taken into account during parameterized invalidation.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_invalrestrictedtohost(String invalrestrictedtohost) throws Exception{
		this.invalrestrictedtohost = invalrestrictedtohost;
	}

	/**
	* <pre>
	* Use this parameter to specify whether the host header should be taken into account during parameterized invalidation.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_invalrestrictedtohost() throws Exception {
		return this.invalrestrictedtohost;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to poll every time for the objects in this content group.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_polleverytime(String polleverytime) throws Exception{
		this.polleverytime = polleverytime;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to poll every time for the objects in this content group.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_polleverytime() throws Exception {
		return this.polleverytime;
	}

	/**
	* <pre>
	* Use this parameter to specify whether a request can force the system to reload a cached object from the origin. To guard against Denial of Service attacks, you should set this flag to YES. To get RFC-compliant behavior you should set it to NO.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_ignorereloadreq(String ignorereloadreq) throws Exception{
		this.ignorereloadreq = ignorereloadreq;
	}

	/**
	* <pre>
	* Use this parameter to specify whether a request can force the system to reload a cached object from the origin. To guard against Denial of Service attacks, you should set this flag to YES. To get RFC-compliant behavior you should set it to NO.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_ignorereloadreq() throws Exception {
		return this.ignorereloadreq;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to remove cookies from a response.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_removecookies(String removecookies) throws Exception{
		this.removecookies = removecookies;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to remove cookies from a response.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_removecookies() throws Exception {
		return this.removecookies;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should attempt to refresh an object immediately before it is about to go stale.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_prefetch(String prefetch) throws Exception{
		this.prefetch = prefetch;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should attempt to refresh an object immediately before it is about to go stale.<br> Default value: YES<br> Possible values = YES, NO
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
	public void set_prefetchperiod(long prefetchperiod) throws Exception {
		this.prefetchperiod = new Long(prefetchperiod);
	}

	/**
	* <pre>
	* The duration in seconds of the period during which prefetch should be attempted, immediately before the object's calculated expiry time.
	* </pre>
	*/
	public void set_prefetchperiod(Long prefetchperiod) throws Exception{
		this.prefetchperiod = prefetchperiod;
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
	public void set_prefetchperiodmillisec(long prefetchperiodmillisec) throws Exception {
		this.prefetchperiodmillisec = new Long(prefetchperiodmillisec);
	}

	/**
	* <pre>
	* The duration in milliseconds of the period during which prefetch should be attempted, immediately before the object's calculated expiry time.
	* </pre>
	*/
	public void set_prefetchperiodmillisec(Long prefetchperiodmillisec) throws Exception{
		this.prefetchperiodmillisec = prefetchperiodmillisec;
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
	* The maximum number of outstanding prefetches on the contentgroup.
	* </pre>
	*/
	public void set_prefetchmaxpending(long prefetchmaxpending) throws Exception {
		this.prefetchmaxpending = new Long(prefetchmaxpending);
	}

	/**
	* <pre>
	* The maximum number of outstanding prefetches on the contentgroup.
	* </pre>
	*/
	public void set_prefetchmaxpending(Long prefetchmaxpending) throws Exception{
		this.prefetchmaxpending = prefetchmaxpending;
	}

	/**
	* <pre>
	* The maximum number of outstanding prefetches on the contentgroup.
	* </pre>
	*/
	public Long get_prefetchmaxpending() throws Exception {
		return this.prefetchmaxpending;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should do flash cache.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_flashcache(String flashcache) throws Exception{
		this.flashcache = flashcache;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should do flash cache.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_flashcache() throws Exception {
		return this.flashcache;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should expire the content immediately after receving the last body byte.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_expireatlastbyte(String expireatlastbyte) throws Exception{
		this.expireatlastbyte = expireatlastbyte;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should expire the content immediately after receving the last body byte.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_expireatlastbyte() throws Exception {
		return this.expireatlastbyte;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should insert a Via header.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_insertvia(String insertvia) throws Exception{
		this.insertvia = insertvia;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should insert a Via header.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_insertvia() throws Exception {
		return this.insertvia;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should insert an Age header.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_insertage(String insertage) throws Exception{
		this.insertage = insertage;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should insert an Age header.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_insertage() throws Exception {
		return this.insertage;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should insert an ETag header.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_insertetag(String insertetag) throws Exception{
		this.insertetag = insertetag;
	}

	/**
	* <pre>
	* Use this parameter to specify whether Integrated Cache should insert an ETag header.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_insertetag() throws Exception {
		return this.insertetag;
	}

	/**
	* <pre>
	* Use this parameter to specify the Cache-Control header to be inserted.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cachecontrol(String cachecontrol) throws Exception{
		this.cachecontrol = cachecontrol;
	}

	/**
	* <pre>
	* Use this parameter to specify the Cache-Control header to be inserted.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cachecontrol() throws Exception {
		return this.cachecontrol;
	}

	/**
	* <pre>
	* If the client aborts when the downloaded response size is less than or equal to quick-abort-size, then Integrated Cache will stop downloading the response.<br> Default value: 4194303<br> Minimum value =  0<br> Maximum value =  4194303
	* </pre>
	*/
	public void set_quickabortsize(long quickabortsize) throws Exception {
		this.quickabortsize = new Long(quickabortsize);
	}

	/**
	* <pre>
	* If the client aborts when the downloaded response size is less than or equal to quick-abort-size, then Integrated Cache will stop downloading the response.<br> Default value: 4194303<br> Minimum value =  0<br> Maximum value =  4194303
	* </pre>
	*/
	public void set_quickabortsize(Long quickabortsize) throws Exception{
		this.quickabortsize = quickabortsize;
	}

	/**
	* <pre>
	* If the client aborts when the downloaded response size is less than or equal to quick-abort-size, then Integrated Cache will stop downloading the response.<br> Default value: 4194303<br> Minimum value =  0<br> Maximum value =  4194303
	* </pre>
	*/
	public Long get_quickabortsize() throws Exception {
		return this.quickabortsize;
	}

	/**
	* <pre>
	* The minimum size of the response.<br> Minimum value =  0<br> Maximum value =  2097151
	* </pre>
	*/
	public void set_minressize(long minressize) throws Exception {
		this.minressize = new Long(minressize);
	}

	/**
	* <pre>
	* The minimum size of the response.<br> Minimum value =  0<br> Maximum value =  2097151
	* </pre>
	*/
	public void set_minressize(Long minressize) throws Exception{
		this.minressize = minressize;
	}

	/**
	* <pre>
	* The minimum size of the response.<br> Minimum value =  0<br> Maximum value =  2097151
	* </pre>
	*/
	public Long get_minressize() throws Exception {
		return this.minressize;
	}

	/**
	* <pre>
	* The maximum size of the response.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  2097151
	* </pre>
	*/
	public void set_maxressize(long maxressize) throws Exception {
		this.maxressize = new Long(maxressize);
	}

	/**
	* <pre>
	* The maximum size of the response.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  2097151
	* </pre>
	*/
	public void set_maxressize(Long maxressize) throws Exception{
		this.maxressize = maxressize;
	}

	/**
	* <pre>
	* The maximum size of the response.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  2097151
	* </pre>
	*/
	public Long get_maxressize() throws Exception {
		return this.maxressize;
	}

	/**
	* <pre>
	* The memory limit for the content group, in MB. The limit is not exact. At times, a group's memory utilization may overshoot the limit, only to stabilize later.<br> Default value: 65536
	* </pre>
	*/
	public void set_memlimit(long memlimit) throws Exception {
		this.memlimit = new Long(memlimit);
	}

	/**
	* <pre>
	* The memory limit for the content group, in MB. The limit is not exact. At times, a group's memory utilization may overshoot the limit, only to stabilize later.<br> Default value: 65536
	* </pre>
	*/
	public void set_memlimit(Long memlimit) throws Exception{
		this.memlimit = memlimit;
	}

	/**
	* <pre>
	* The memory limit for the content group, in MB. The limit is not exact. At times, a group's memory utilization may overshoot the limit, only to stabilize later.<br> Default value: 65536
	* </pre>
	*/
	public Long get_memlimit() throws Exception {
		return this.memlimit;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to ignore the Cache-control and Pragma headers in the incoming request.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_ignorereqcachinghdrs(String ignorereqcachinghdrs) throws Exception{
		this.ignorereqcachinghdrs = ignorereqcachinghdrs;
	}

	/**
	* <pre>
	* Use this parameter to specify whether to ignore the Cache-control and Pragma headers in the incoming request.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_ignorereqcachinghdrs() throws Exception {
		return this.ignorereqcachinghdrs;
	}

	/**
	* <pre>
	* Specify the minimum number of accesses for an object to be stored in Cache.
	* </pre>
	*/
	public void set_minhits(int minhits) throws Exception {
		this.minhits = new Integer(minhits);
	}

	/**
	* <pre>
	* Specify the minimum number of accesses for an object to be stored in Cache.
	* </pre>
	*/
	public void set_minhits(Integer minhits) throws Exception{
		this.minhits = minhits;
	}

	/**
	* <pre>
	* Specify the minimum number of accesses for an object to be stored in Cache.
	* </pre>
	*/
	public Integer get_minhits() throws Exception {
		return this.minhits;
	}

	/**
	* <pre>
	* Forces policy evaluation for each response arriving from origin.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_alwaysevalpolicies(String alwaysevalpolicies) throws Exception{
		this.alwaysevalpolicies = alwaysevalpolicies;
	}

	/**
	* <pre>
	* Forces policy evaluation for each response arriving from origin.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_alwaysevalpolicies() throws Exception {
		return this.alwaysevalpolicies;
	}

	/**
	* <pre>
	* Setting pinned to YES prevents IC from flushing objects from this contentgroup under memory pressure.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_pinned(String pinned) throws Exception{
		this.pinned = pinned;
	}

	/**
	* <pre>
	* Setting pinned to YES prevents IC from flushing objects from this contentgroup under memory pressure.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_pinned() throws Exception {
		return this.pinned;
	}

	/**
	* <pre>
	* Setting this parameter to NO causes DNS resolution for every response. Setting this parameter to YES causes DNS resolution only when the destination IP in the request does not match the destination IP of the stored object.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_lazydnsresolve(String lazydnsresolve) throws Exception{
		this.lazydnsresolve = lazydnsresolve;
	}

	/**
	* <pre>
	* Setting this parameter to NO causes DNS resolution for every response. Setting this parameter to YES causes DNS resolution only when the destination IP in the request does not match the destination IP of the stored object.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_lazydnsresolve() throws Exception {
		return this.lazydnsresolve;
	}

	/**
	* <pre>
	* The selector used for hit selection.
	* </pre>
	*/
	public void set_hitselector(String hitselector) throws Exception{
		this.hitselector = hitselector;
	}

	/**
	* <pre>
	* The selector used for hit selection.
	* </pre>
	*/
	public String get_hitselector() throws Exception {
		return this.hitselector;
	}

	/**
	* <pre>
	* The selector used for invalidation.
	* </pre>
	*/
	public void set_invalselector(String invalselector) throws Exception{
		this.invalselector = invalselector;
	}

	/**
	* <pre>
	* The selector used for invalidation.
	* </pre>
	*/
	public String get_invalselector() throws Exception {
		return this.invalselector;
	}

	/**
	* <pre>
	* This parameter will specify the type of content group.<br> Default value: NSSVC_HTTP<br> Possible values = HTTP, MYSQL, MSSQL
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* This parameter will specify the type of content group.<br> Default value: NSSVC_HTTP<br> Possible values = HTTP, MYSQL, MSSQL
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* If a query string is specified, then the selected objects in this group will be flushed using parameterized invalidation. Otherwise, all objects in the group will be flushed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_query(String query) throws Exception{
		this.query = query;
	}

	/**
	* <pre>
	* If a query string is specified, then the selected objects in this group will be flushed using parameterized invalidation. Otherwise, all objects in the group will be flushed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_query() throws Exception {
		return this.query;
	}

	/**
	* <pre>
	* To be set only if parameterized invalidation is being done. Objects belonging only to the specified host will be flushed. The host argument can be provided if and only if -invalRestrictedToHost is set to YES for the given group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_host(String host) throws Exception{
		this.host = host;
	}

	/**
	* <pre>
	* To be set only if parameterized invalidation is being done. Objects belonging only to the specified host will be flushed. The host argument can be provided if and only if -invalRestrictedToHost is set to YES for the given group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_host() throws Exception {
		return this.host;
	}

	/**
	* <pre>
	* The value of the selector to be used for flushing objects in the contentgroup.<br> Minimum length =  1
	* </pre>
	*/
	public void set_selectorvalue(String selectorvalue) throws Exception{
		this.selectorvalue = selectorvalue;
	}

	/**
	* <pre>
	* The value of the selector to be used for flushing objects in the contentgroup.<br> Minimum length =  1
	* </pre>
	*/
	public String get_selectorvalue() throws Exception {
		return this.selectorvalue;
	}

	/**
	* <pre>
	* Flags.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Current outstanding prefetches.
	* </pre>
	*/
	public Long get_prefetchcur() throws Exception {
		return this.prefetchcur;
	}

	/**
	* <pre>
	* Current memory usage.
	* </pre>
	*/
	public Long get_memusage() throws Exception {
		return this.memusage;
	}

	/**
	* <pre>
	* Cache non 304 hits.
	* </pre>
	*/
	public Long get_cachenon304hits() throws Exception {
		return this.cachenon304hits;
	}

	/**
	* <pre>
	* Cache 304 hits.
	* </pre>
	*/
	public Long get_cache304hits() throws Exception {
		return this.cache304hits;
	}

	/**
	* <pre>
	* Number of cells.
	* </pre>
	*/
	public Long get_cachecells() throws Exception {
		return this.cachecells;
	}

	/**
	* <pre>
	* Cache group incarnation.
	* </pre>
	*/
	public Long get_cachegroupincarnation() throws Exception {
		return this.cachegroupincarnation;
	}

	/**
	* <pre>
	* Active cache policies refering to this group.
	* </pre>
	*/
	public String[] get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Number of active Invalidation policies refering to this group.
	* </pre>
	*/
	public Long get_cachenuminvalpolicy() throws Exception {
		return this.cachenuminvalpolicy;
	}

	/**
	* <pre>
	* Numbers of marker cells in this group.
	* </pre>
	*/
	public Long get_markercells() throws Exception {
		return this.markercells;
	}

	/**
	* <pre>
	* .<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		cachecontentgroup_response result = (cachecontentgroup_response) service.get_payload_formatter().string_to_resource(cachecontentgroup_response.class, response);
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
		return result.cachecontentgroup;
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
	* Use this API to add cachecontentgroup.
	*/
	public static base_response add(nitro_service client, cachecontentgroup resource) throws Exception {
		cachecontentgroup addresource = new cachecontentgroup();
		addresource.name = resource.name;
		addresource.weakposrelexpiry = resource.weakposrelexpiry;
		addresource.heurexpiryparam = resource.heurexpiryparam;
		addresource.relexpiry = resource.relexpiry;
		addresource.relexpirymillisec = resource.relexpirymillisec;
		addresource.absexpiry = resource.absexpiry;
		addresource.absexpirygmt = resource.absexpirygmt;
		addresource.weaknegrelexpiry = resource.weaknegrelexpiry;
		addresource.hitparams = resource.hitparams;
		addresource.invalparams = resource.invalparams;
		addresource.ignoreparamvaluecase = resource.ignoreparamvaluecase;
		addresource.matchcookies = resource.matchcookies;
		addresource.invalrestrictedtohost = resource.invalrestrictedtohost;
		addresource.polleverytime = resource.polleverytime;
		addresource.ignorereloadreq = resource.ignorereloadreq;
		addresource.removecookies = resource.removecookies;
		addresource.prefetch = resource.prefetch;
		addresource.prefetchperiod = resource.prefetchperiod;
		addresource.prefetchperiodmillisec = resource.prefetchperiodmillisec;
		addresource.prefetchmaxpending = resource.prefetchmaxpending;
		addresource.flashcache = resource.flashcache;
		addresource.expireatlastbyte = resource.expireatlastbyte;
		addresource.insertvia = resource.insertvia;
		addresource.insertage = resource.insertage;
		addresource.insertetag = resource.insertetag;
		addresource.cachecontrol = resource.cachecontrol;
		addresource.quickabortsize = resource.quickabortsize;
		addresource.minressize = resource.minressize;
		addresource.maxressize = resource.maxressize;
		addresource.memlimit = resource.memlimit;
		addresource.ignorereqcachinghdrs = resource.ignorereqcachinghdrs;
		addresource.minhits = resource.minhits;
		addresource.alwaysevalpolicies = resource.alwaysevalpolicies;
		addresource.pinned = resource.pinned;
		addresource.lazydnsresolve = resource.lazydnsresolve;
		addresource.hitselector = resource.hitselector;
		addresource.invalselector = resource.invalselector;
		addresource.type = resource.type;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cachecontentgroup resources.
	*/
	public static base_responses add(nitro_service client, cachecontentgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachecontentgroup addresources[] = new cachecontentgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cachecontentgroup();
				addresources[i].name = resources[i].name;
				addresources[i].weakposrelexpiry = resources[i].weakposrelexpiry;
				addresources[i].heurexpiryparam = resources[i].heurexpiryparam;
				addresources[i].relexpiry = resources[i].relexpiry;
				addresources[i].relexpirymillisec = resources[i].relexpirymillisec;
				addresources[i].absexpiry = resources[i].absexpiry;
				addresources[i].absexpirygmt = resources[i].absexpirygmt;
				addresources[i].weaknegrelexpiry = resources[i].weaknegrelexpiry;
				addresources[i].hitparams = resources[i].hitparams;
				addresources[i].invalparams = resources[i].invalparams;
				addresources[i].ignoreparamvaluecase = resources[i].ignoreparamvaluecase;
				addresources[i].matchcookies = resources[i].matchcookies;
				addresources[i].invalrestrictedtohost = resources[i].invalrestrictedtohost;
				addresources[i].polleverytime = resources[i].polleverytime;
				addresources[i].ignorereloadreq = resources[i].ignorereloadreq;
				addresources[i].removecookies = resources[i].removecookies;
				addresources[i].prefetch = resources[i].prefetch;
				addresources[i].prefetchperiod = resources[i].prefetchperiod;
				addresources[i].prefetchperiodmillisec = resources[i].prefetchperiodmillisec;
				addresources[i].prefetchmaxpending = resources[i].prefetchmaxpending;
				addresources[i].flashcache = resources[i].flashcache;
				addresources[i].expireatlastbyte = resources[i].expireatlastbyte;
				addresources[i].insertvia = resources[i].insertvia;
				addresources[i].insertage = resources[i].insertage;
				addresources[i].insertetag = resources[i].insertetag;
				addresources[i].cachecontrol = resources[i].cachecontrol;
				addresources[i].quickabortsize = resources[i].quickabortsize;
				addresources[i].minressize = resources[i].minressize;
				addresources[i].maxressize = resources[i].maxressize;
				addresources[i].memlimit = resources[i].memlimit;
				addresources[i].ignorereqcachinghdrs = resources[i].ignorereqcachinghdrs;
				addresources[i].minhits = resources[i].minhits;
				addresources[i].alwaysevalpolicies = resources[i].alwaysevalpolicies;
				addresources[i].pinned = resources[i].pinned;
				addresources[i].lazydnsresolve = resources[i].lazydnsresolve;
				addresources[i].hitselector = resources[i].hitselector;
				addresources[i].invalselector = resources[i].invalselector;
				addresources[i].type = resources[i].type;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cachecontentgroup of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		cachecontentgroup deleteresource = new cachecontentgroup();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cachecontentgroup.
	*/
	public static base_response delete(nitro_service client, cachecontentgroup resource) throws Exception {
		cachecontentgroup deleteresource = new cachecontentgroup();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cachecontentgroup resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			cachecontentgroup deleteresources[] = new cachecontentgroup[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new cachecontentgroup();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cachecontentgroup resources.
	*/
	public static base_responses delete(nitro_service client, cachecontentgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachecontentgroup deleteresources[] = new cachecontentgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cachecontentgroup();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update cachecontentgroup.
	*/
	public static base_response update(nitro_service client, cachecontentgroup resource) throws Exception {
		cachecontentgroup updateresource = new cachecontentgroup();
		updateresource.name = resource.name;
		updateresource.weakposrelexpiry = resource.weakposrelexpiry;
		updateresource.heurexpiryparam = resource.heurexpiryparam;
		updateresource.relexpiry = resource.relexpiry;
		updateresource.relexpirymillisec = resource.relexpirymillisec;
		updateresource.absexpiry = resource.absexpiry;
		updateresource.absexpirygmt = resource.absexpirygmt;
		updateresource.weaknegrelexpiry = resource.weaknegrelexpiry;
		updateresource.hitparams = resource.hitparams;
		updateresource.invalparams = resource.invalparams;
		updateresource.ignoreparamvaluecase = resource.ignoreparamvaluecase;
		updateresource.matchcookies = resource.matchcookies;
		updateresource.invalrestrictedtohost = resource.invalrestrictedtohost;
		updateresource.polleverytime = resource.polleverytime;
		updateresource.ignorereloadreq = resource.ignorereloadreq;
		updateresource.removecookies = resource.removecookies;
		updateresource.prefetch = resource.prefetch;
		updateresource.prefetchperiod = resource.prefetchperiod;
		updateresource.prefetchperiodmillisec = resource.prefetchperiodmillisec;
		updateresource.prefetchmaxpending = resource.prefetchmaxpending;
		updateresource.flashcache = resource.flashcache;
		updateresource.expireatlastbyte = resource.expireatlastbyte;
		updateresource.insertvia = resource.insertvia;
		updateresource.insertage = resource.insertage;
		updateresource.insertetag = resource.insertetag;
		updateresource.cachecontrol = resource.cachecontrol;
		updateresource.quickabortsize = resource.quickabortsize;
		updateresource.minressize = resource.minressize;
		updateresource.maxressize = resource.maxressize;
		updateresource.memlimit = resource.memlimit;
		updateresource.ignorereqcachinghdrs = resource.ignorereqcachinghdrs;
		updateresource.minhits = resource.minhits;
		updateresource.alwaysevalpolicies = resource.alwaysevalpolicies;
		updateresource.pinned = resource.pinned;
		updateresource.lazydnsresolve = resource.lazydnsresolve;
		updateresource.hitselector = resource.hitselector;
		updateresource.invalselector = resource.invalselector;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update cachecontentgroup resources.
	*/
	public static base_responses update(nitro_service client, cachecontentgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachecontentgroup updateresources[] = new cachecontentgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new cachecontentgroup();
				updateresources[i].name = resources[i].name;
				updateresources[i].weakposrelexpiry = resources[i].weakposrelexpiry;
				updateresources[i].heurexpiryparam = resources[i].heurexpiryparam;
				updateresources[i].relexpiry = resources[i].relexpiry;
				updateresources[i].relexpirymillisec = resources[i].relexpirymillisec;
				updateresources[i].absexpiry = resources[i].absexpiry;
				updateresources[i].absexpirygmt = resources[i].absexpirygmt;
				updateresources[i].weaknegrelexpiry = resources[i].weaknegrelexpiry;
				updateresources[i].hitparams = resources[i].hitparams;
				updateresources[i].invalparams = resources[i].invalparams;
				updateresources[i].ignoreparamvaluecase = resources[i].ignoreparamvaluecase;
				updateresources[i].matchcookies = resources[i].matchcookies;
				updateresources[i].invalrestrictedtohost = resources[i].invalrestrictedtohost;
				updateresources[i].polleverytime = resources[i].polleverytime;
				updateresources[i].ignorereloadreq = resources[i].ignorereloadreq;
				updateresources[i].removecookies = resources[i].removecookies;
				updateresources[i].prefetch = resources[i].prefetch;
				updateresources[i].prefetchperiod = resources[i].prefetchperiod;
				updateresources[i].prefetchperiodmillisec = resources[i].prefetchperiodmillisec;
				updateresources[i].prefetchmaxpending = resources[i].prefetchmaxpending;
				updateresources[i].flashcache = resources[i].flashcache;
				updateresources[i].expireatlastbyte = resources[i].expireatlastbyte;
				updateresources[i].insertvia = resources[i].insertvia;
				updateresources[i].insertage = resources[i].insertage;
				updateresources[i].insertetag = resources[i].insertetag;
				updateresources[i].cachecontrol = resources[i].cachecontrol;
				updateresources[i].quickabortsize = resources[i].quickabortsize;
				updateresources[i].minressize = resources[i].minressize;
				updateresources[i].maxressize = resources[i].maxressize;
				updateresources[i].memlimit = resources[i].memlimit;
				updateresources[i].ignorereqcachinghdrs = resources[i].ignorereqcachinghdrs;
				updateresources[i].minhits = resources[i].minhits;
				updateresources[i].alwaysevalpolicies = resources[i].alwaysevalpolicies;
				updateresources[i].pinned = resources[i].pinned;
				updateresources[i].lazydnsresolve = resources[i].lazydnsresolve;
				updateresources[i].hitselector = resources[i].hitselector;
				updateresources[i].invalselector = resources[i].invalselector;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of cachecontentgroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		cachecontentgroup unsetresource = new cachecontentgroup();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of cachecontentgroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, cachecontentgroup resource, String[] args) throws Exception{
		cachecontentgroup unsetresource = new cachecontentgroup();
		unsetresource.name = resource.name;
		unsetresource.weakposrelexpiry = resource.weakposrelexpiry;
		unsetresource.heurexpiryparam = resource.heurexpiryparam;
		unsetresource.relexpiry = resource.relexpiry;
		unsetresource.relexpirymillisec = resource.relexpirymillisec;
		unsetresource.absexpiry = resource.absexpiry;
		unsetresource.absexpirygmt = resource.absexpirygmt;
		unsetresource.weaknegrelexpiry = resource.weaknegrelexpiry;
		unsetresource.hitparams = resource.hitparams;
		unsetresource.invalparams = resource.invalparams;
		unsetresource.ignoreparamvaluecase = resource.ignoreparamvaluecase;
		unsetresource.matchcookies = resource.matchcookies;
		unsetresource.invalrestrictedtohost = resource.invalrestrictedtohost;
		unsetresource.polleverytime = resource.polleverytime;
		unsetresource.ignorereloadreq = resource.ignorereloadreq;
		unsetresource.removecookies = resource.removecookies;
		unsetresource.prefetch = resource.prefetch;
		unsetresource.prefetchperiod = resource.prefetchperiod;
		unsetresource.prefetchperiodmillisec = resource.prefetchperiodmillisec;
		unsetresource.prefetchmaxpending = resource.prefetchmaxpending;
		unsetresource.flashcache = resource.flashcache;
		unsetresource.expireatlastbyte = resource.expireatlastbyte;
		unsetresource.insertvia = resource.insertvia;
		unsetresource.insertage = resource.insertage;
		unsetresource.insertetag = resource.insertetag;
		unsetresource.cachecontrol = resource.cachecontrol;
		unsetresource.quickabortsize = resource.quickabortsize;
		unsetresource.minressize = resource.minressize;
		unsetresource.maxressize = resource.maxressize;
		unsetresource.memlimit = resource.memlimit;
		unsetresource.ignorereqcachinghdrs = resource.ignorereqcachinghdrs;
		unsetresource.minhits = resource.minhits;
		unsetresource.alwaysevalpolicies = resource.alwaysevalpolicies;
		unsetresource.pinned = resource.pinned;
		unsetresource.lazydnsresolve = resource.lazydnsresolve;
		unsetresource.hitselector = resource.hitselector;
		unsetresource.invalselector = resource.invalselector;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of cachecontentgroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			cachecontentgroup unsetresources[] = new cachecontentgroup[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new cachecontentgroup();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of cachecontentgroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, cachecontentgroup resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachecontentgroup unsetresources[] = new cachecontentgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new cachecontentgroup();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].weakposrelexpiry = resources[i].weakposrelexpiry;
				unsetresources[i].heurexpiryparam = resources[i].heurexpiryparam;
				unsetresources[i].relexpiry = resources[i].relexpiry;
				unsetresources[i].relexpirymillisec = resources[i].relexpirymillisec;
				unsetresources[i].absexpiry = resources[i].absexpiry;
				unsetresources[i].absexpirygmt = resources[i].absexpirygmt;
				unsetresources[i].weaknegrelexpiry = resources[i].weaknegrelexpiry;
				unsetresources[i].hitparams = resources[i].hitparams;
				unsetresources[i].invalparams = resources[i].invalparams;
				unsetresources[i].ignoreparamvaluecase = resources[i].ignoreparamvaluecase;
				unsetresources[i].matchcookies = resources[i].matchcookies;
				unsetresources[i].invalrestrictedtohost = resources[i].invalrestrictedtohost;
				unsetresources[i].polleverytime = resources[i].polleverytime;
				unsetresources[i].ignorereloadreq = resources[i].ignorereloadreq;
				unsetresources[i].removecookies = resources[i].removecookies;
				unsetresources[i].prefetch = resources[i].prefetch;
				unsetresources[i].prefetchperiod = resources[i].prefetchperiod;
				unsetresources[i].prefetchperiodmillisec = resources[i].prefetchperiodmillisec;
				unsetresources[i].prefetchmaxpending = resources[i].prefetchmaxpending;
				unsetresources[i].flashcache = resources[i].flashcache;
				unsetresources[i].expireatlastbyte = resources[i].expireatlastbyte;
				unsetresources[i].insertvia = resources[i].insertvia;
				unsetresources[i].insertage = resources[i].insertage;
				unsetresources[i].insertetag = resources[i].insertetag;
				unsetresources[i].cachecontrol = resources[i].cachecontrol;
				unsetresources[i].quickabortsize = resources[i].quickabortsize;
				unsetresources[i].minressize = resources[i].minressize;
				unsetresources[i].maxressize = resources[i].maxressize;
				unsetresources[i].memlimit = resources[i].memlimit;
				unsetresources[i].ignorereqcachinghdrs = resources[i].ignorereqcachinghdrs;
				unsetresources[i].minhits = resources[i].minhits;
				unsetresources[i].alwaysevalpolicies = resources[i].alwaysevalpolicies;
				unsetresources[i].pinned = resources[i].pinned;
				unsetresources[i].lazydnsresolve = resources[i].lazydnsresolve;
				unsetresources[i].hitselector = resources[i].hitselector;
				unsetresources[i].invalselector = resources[i].invalselector;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to expire cachecontentgroup.
	*/
	public static base_response expire(nitro_service client, cachecontentgroup resource) throws Exception {
		cachecontentgroup expireresource = new cachecontentgroup();
		expireresource.name = resource.name;
		return expireresource.perform_operation(client,"expire");
	}

	/**
	* Use this API to expire cachecontentgroup resources.
	*/
	public static base_responses expire(nitro_service client, cachecontentgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachecontentgroup expireresources[] = new cachecontentgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				expireresources[i] = new cachecontentgroup();
				expireresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, expireresources,"expire");
		}
		return result;
	}

	/**
	* Use this API to flush cachecontentgroup.
	*/
	public static base_response flush(nitro_service client, cachecontentgroup resource) throws Exception {
		cachecontentgroup flushresource = new cachecontentgroup();
		flushresource.name = resource.name;
		flushresource.query = resource.query;
		flushresource.host = resource.host;
		flushresource.selectorvalue = resource.selectorvalue;
		return flushresource.perform_operation(client,"flush");
	}

	/**
	* Use this API to flush cachecontentgroup resources.
	*/
	public static base_responses flush(nitro_service client, cachecontentgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachecontentgroup flushresources[] = new cachecontentgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				flushresources[i] = new cachecontentgroup();
				flushresources[i].name = resources[i].name;
				flushresources[i].query = resources[i].query;
				flushresources[i].host = resources[i].host;
				flushresources[i].selectorvalue = resources[i].selectorvalue;
			}
			result = perform_operation_bulk_request(client, flushresources,"flush");
		}
		return result;
	}

	/**
	* Use this API to fetch all the cachecontentgroup resources that are configured on netscaler.
	*/
	public static cachecontentgroup[] get(nitro_service service) throws Exception{
		cachecontentgroup obj = new cachecontentgroup();
		cachecontentgroup[] response = (cachecontentgroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cachecontentgroup resources that are configured on netscaler.
	*/
	public static cachecontentgroup[] get(nitro_service service, options option) throws Exception{
		cachecontentgroup obj = new cachecontentgroup();
		cachecontentgroup[] response = (cachecontentgroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cachecontentgroup resource of given name .
	*/
	public static cachecontentgroup get(nitro_service service, String name) throws Exception{
		cachecontentgroup obj = new cachecontentgroup();
		obj.set_name(name);
		cachecontentgroup response = (cachecontentgroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cachecontentgroup resources of given names .
	*/
	public static cachecontentgroup[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			cachecontentgroup response[] = new cachecontentgroup[name.length];
			cachecontentgroup obj[] = new cachecontentgroup[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new cachecontentgroup();
				obj[i].set_name(name[i]);
				response[i] = (cachecontentgroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cachecontentgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cachecontentgroup[] get_filtered(nitro_service service, String filter) throws Exception{
		cachecontentgroup obj = new cachecontentgroup();
		options option = new options();
		option.set_filter(filter);
		cachecontentgroup[] response = (cachecontentgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cachecontentgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cachecontentgroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cachecontentgroup obj = new cachecontentgroup();
		options option = new options();
		option.set_filter(filter);
		cachecontentgroup[] response = (cachecontentgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cachecontentgroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cachecontentgroup obj = new cachecontentgroup();
		options option = new options();
		option.set_count(true);
		cachecontentgroup[] response = (cachecontentgroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cachecontentgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cachecontentgroup obj = new cachecontentgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cachecontentgroup[] response = (cachecontentgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cachecontentgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cachecontentgroup obj = new cachecontentgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cachecontentgroup[] response = (cachecontentgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class polleverytimeEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class alwaysevalpoliciesEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class pinnedEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class ignoreparamvaluecaseEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class ignorereqcachinghdrsEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class insertviaEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class expireatlastbyteEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class matchcookiesEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class insertetagEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class removecookiesEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class ignorereloadreqEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class lazydnsresolveEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class insertageEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class flashcacheEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class prefetchEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class invalrestrictedtohostEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class typeEnum {
		public static final String HTTP = "HTTP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
	}
}
