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

package com.citrix.netscaler.nitro.resource.stat.cache;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cache_response extends base_response
{
	public cache_stats cache;
}

public class cache_stats extends base_resource
{
	private String clearstats;
	private Long cachemaxmemorykb;
	private Long cacherecentpercentsuccessfulrevalidation;
	private Long cacherecentpercentstoreablemiss;
	private Long cacherecentpercentparameterizedhits;
	private Long cacherecentpercentoriginbandwidthsaved;
	private Long cacherecentpercenthit;
	private Long cacherecentpercentbytehit;
	private Long cacherecentpercent304hits;
	private Long cacheutilizedmemorykb;
	private Long cachemaxmemoryactivekb;
	private Long cache64maxmemorykb;
	private Long cachepercentpethits;
	private Long cachetotpethits;
	private Long cachepethitsrate;
	private Long cachepercentparameterized304hits;
	private Long cachetotparameterizedhits;
	private Long cacheparameterizedhitsrate;
	private Long cachepercentsuccessfulrevalidation;
	private Long cachepercentstoreablemiss;
	private Long cachetotfulltoconditionalrequest;
	private Long cachefulltoconditionalrequestrate;
	private Long cachetotsuccessfulrevalidation;
	private Long cachesuccessfulrevalidationrate;
	private Long cachetotrevalidationmiss;
	private Long cacherevalidationmissrate;
	private Long cachetotnonstoreablemisses;
	private Long cachenonstoreablemissesrate;
	private Long cachetotstoreablemisses;
	private Long cachestoreablemissesrate;
	private Long cachecompressedbytesserved;
	private Long cachecompressedbytesservedrate;
	private Long cachepercentbytehit;
	private Long cachebytesserved;
	private Long cachebytesservedrate;
	private Long cachetotresponsebytes;
	private Long cacheresponsebytesrate;
	private Long cachepercent304hits;
	private Long cachenummarker;
	private Long cachepercentoriginbandwidthsaved;
	private Long cachepercenthit;
	private Long cachetotmisses;
	private Long cachemissesrate;
	private Long cachetothits;
	private Long cachehitsrate;
	private Long cachetotrequests;
	private Long cacherequestsrate;
	private Long cachenumcached;
	private Long cachenumobjsavedondisk;
	private Long cachenumobjsavedondiskrate;
	private Long cachenummbreadfromdisk;
	private Long cachenummbreadfromdiskrate;
	private Long cachenummbwrittentodisk;
	private Long cachenummbwrittentodiskrate;
	private Long cachecurhits;
	private Long cachecurmisses;
	private Long cachetotnon304hits;
	private Long cachenon304hitsrate;
	private Long cachetot304hits;
	private Long cache304hitsrate;
	private Long cachetotexpireatlastbyte;
	private Long cacheexpireatlastbyterate;
	private Long cachetotflashcachemisses;
	private Long cacheflashcachemissesrate;
	private Long cachetotflashcachehits;
	private Long cacheflashcachehitsrate;
	private Long cachetotparameterizedinvalidationrequests;
	private Long cacheparameterizedinvalidationrequestsrate;
	private Long cachetotnonparameterizedinvalidationrequests;
	private Long cachenonparameterizedinvalidationrequestsrate;
	private Long cachetotinvalidationrequests;
	private Long cacheinvalidationrequestsrate;
	private Long cachetotparameterizedrequests;
	private Long cacheparameterizedrequestsrate;
	private Long cachetotparameterizednon304hits;
	private Long cacheparameterizednon304hitsrate;
	private Long cachetotparameterized304hits;
	private Long cacheparameterized304hitsrate;
	private Long cachetotpetrequests;
	private Long cachepetrequestsrate;
	private Long cacheerrmemalloc;
	private Long cachelargestresponsereceived;
	private Long cachenummbsavedondisk;
	private Long cachenummbsavedondiskrate;

	/**
	* <pre>
	* Clear the statsistics / counters
	* </pre>
	*/
	public void set_clearstats(String clearstats) throws Exception{
		this.clearstats = clearstats;
	}

	/**
	* <pre>
	* Clear the statsistics / counters.<br> Possible values = basic, full
	* </pre>
	*/
	public String get_clearstats() throws Exception {
		return this.clearstats;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetothits
	* </pre>
	*/
	public Long get_cachehitsrate() throws Exception {
		return this.cachehitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotpethits
	* </pre>
	*/
	public Long get_cachepethitsrate() throws Exception {
		return this.cachepethitsrate;
	}

	/**
	* <pre>
	* Instances of content expiring immediately after receiving the last body byte due to the Expire at Last Byte setting for the content group.
	* </pre>
	*/
	public Long get_cachetotexpireatlastbyte() throws Exception {
		return this.cachetotexpireatlastbyte;
	}

	/**
	* <pre>
	* Marker objects created when a response exceeds the maximum or minimum size for entries in its content group or has not yet received the minimum number of hits required for items in its content group.
	* </pre>
	*/
	public Long get_cachenummarker() throws Exception {
		return this.cachenummarker;
	}

	/**
	* <pre>
	* Total Number of MB written to disk since last reboot.
	* </pre>
	*/
	public Long get_cachenummbwrittentodisk() throws Exception {
		return this.cachenummbwrittentodisk;
	}

	/**
	* <pre>
	* This number should be close to the number of hits being served currently.
	* </pre>
	*/
	public Long get_cachecurhits() throws Exception {
		return this.cachecurhits;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotresponsebytes
	* </pre>
	*/
	public Long get_cacheresponsebytesrate() throws Exception {
		return this.cacheresponsebytesrate;
	}

	/**
	* <pre>
	* Amount of memory the integrated cache is currently using.
	* </pre>
	*/
	public Long get_cacheutilizedmemorykb() throws Exception {
		return this.cacheutilizedmemorykb;
	}

	/**
	* <pre>
	* Requests that match an invalidation policy where the invalGroups parameter is configured and expires one or more content groups.
	* </pre>
	*/
	public Long get_cachetotnonparameterizedinvalidationrequests() throws Exception {
		return this.cachetotnonparameterizedinvalidationrequests;
	}

	/**
	* <pre>
	* Percentage of cache hits in content groups that have Poll Every Time enabled, relative to all searches of content groups with Poll Every Time enabled. 
	* </pre>
	*/
	public Long get_cachepercentpethits() throws Exception {
		return this.cachepercentpethits;
	}

	/**
	* <pre>
	* Total number of bytes served from the integrated cache
	* </pre>
	*/
	public Long get_cachebytesserved() throws Exception {
		return this.cachebytesserved;
	}

	/**
	* <pre>
	* Parameterized requests resulting in a full response (not status code 304: Object Not Updated) served from the cache.
	* </pre>
	*/
	public Long get_cachetotparameterizednon304hits() throws Exception {
		return this.cachetotparameterizednon304hits;
	}

	/**
	* <pre>
	* Total Number of MB read from disk since last reboot.
	* </pre>
	*/
	public Long get_cachenummbreadfromdisk() throws Exception {
		return this.cachenummbreadfromdisk;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachenumobjsavedondisk
	* </pre>
	*/
	public Long get_cachenumobjsavedondiskrate() throws Exception {
		return this.cachenumobjsavedondiskrate;
	}

	/**
	* <pre>
	* Size (MB) of cached responses currently saved on disk. Includes responses fully saved to disk, and expired or flushed but not yet removed.
	* </pre>
	*/
	public Long get_cachenummbsavedondisk() throws Exception {
		return this.cachenummbsavedondisk;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachebytesserved
	* </pre>
	*/
	public Long get_cachebytesservedrate() throws Exception {
		return this.cachebytesservedrate;
	}

	/**
	* <pre>
	* 304 responses as a percentage of all responses that the NetScaler served.
	* </pre>
	*/
	public Long get_cachepercent304hits() throws Exception {
		return this.cachepercent304hits;
	}

	/**
	* <pre>
	* Bytes served from the cache divided by total bytes served to the client. If compression is On in the NetScaler, this ratio may not reflect the bytes served by the compression module. If the compression is Off, this ratio is the same as cachePercentOriginBandwidthSaved.
	* </pre>
	*/
	public Long get_cachepercentbytehit() throws Exception {
		return this.cachepercentbytehit;
	}

	/**
	* <pre>
	* Responses that were fetched from the origin, stored in the cache, and then served to the client, as a percentage of all cache misses.
	* </pre>
	*/
	public Long get_cachepercentstoreablemiss() throws Exception {
		return this.cachepercentstoreablemiss;
	}

	/**
	* <pre>
	* Requests that triggered a search of a content group that has Poll Every Time (PET) enabled (always consult the origin server before serving cached data).
	* </pre>
	*/
	public Long get_cachetotpetrequests() throws Exception {
		return this.cachetotpetrequests;
	}

	/**
	* <pre>
	* Number of compressed bytes served from the cache
	* </pre>
	*/
	public Long get_cachecompressedbytesserved() throws Exception {
		return this.cachecompressedbytesserved;
	}

	/**
	* <pre>
	* Total number of HTTP response bytes served by NetScaler from both the origin and the cache
	* </pre>
	*/
	public Long get_cachetotresponsebytes() throws Exception {
		return this.cachetotresponsebytes;
	}

	/**
	* <pre>
	* Size, in bytes, of largest response sent to client from the cache or the origin server.
	* </pre>
	*/
	public Long get_cachelargestresponsereceived() throws Exception {
		return this.cachelargestresponsereceived;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotnonparameterizedinvalidationrequests
	* </pre>
	*/
	public Long get_cachenonparameterizedinvalidationrequestsrate() throws Exception {
		return this.cachenonparameterizedinvalidationrequestsrate;
	}

	/**
	* <pre>
	* Recently recorded cache byte hit ratio expressed as percentage. Here we define byte hit ratio as ((number of bytes served from the cache)/(total number of bytes served to the client)). This is the standard definition of Byte Hit Ratio. If compression is turned ON in NS then this ratio doesn't mean much. This might under or over estimate the origin-to-cache bandwidth saving (depending upon whether bytes served by CMP in NetScaler are more or less than compressed bytes served from the cache). If CMP is turned OFF in NS then this ratio is same as cacheRecentPercentOriginBandwidthSaved.
	* </pre>
	*/
	public Long get_cacherecentpercentbytehit() throws Exception {
		return this.cacherecentpercentbytehit;
	}

	/**
	* <pre>
	* Recently recorded percentage of times stored content was successfully revalidated by a 304 response rather than by a full response
	* </pre>
	*/
	public Long get_cacherecentpercentsuccessfulrevalidation() throws Exception {
		return this.cacherecentpercentsuccessfulrevalidation;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotsuccessfulrevalidation
	* </pre>
	*/
	public Long get_cachesuccessfulrevalidationrate() throws Exception {
		return this.cachesuccessfulrevalidationrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotrequests
	* </pre>
	*/
	public Long get_cacherequestsrate() throws Exception {
		return this.cacherequestsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotmisses
	* </pre>
	*/
	public Long get_cachemissesrate() throws Exception {
		return this.cachemissesrate;
	}

	/**
	* <pre>
	* Largest amount of memory the NetScaler can dedicate to caching, up to 50% of available memory. A 0 value disables caching, but the caching module continues to run. 
	* </pre>
	*/
	public Long get_cachemaxmemorykb() throws Exception {
		return this.cachemaxmemorykb;
	}

	/**
	* <pre>
	* Responses currently in integrated cache. Includes responses fully downloaded, in the process of being downloaded, and expired or flushed but not yet removed.
	* </pre>
	*/
	public Long get_cachenumcached() throws Exception {
		return this.cachenumcached;
	}

	/**
	* <pre>
	* Responses served from the integrated cache. These responses match a policy with a CACHE action.
	* </pre>
	*/
	public Long get_cachetothits() throws Exception {
		return this.cachetothits;
	}

	/**
	* <pre>
	* Total number of times stored content was successfully revalidated by a 304 Not Modified response from the origin.
	* </pre>
	*/
	public Long get_cachetotsuccessfulrevalidation() throws Exception {
		return this.cachetotsuccessfulrevalidation;
	}

	/**
	* <pre>
	* Percentage of parameterized 304 hits relative to all parameterized hits.
	* </pre>
	*/
	public Long get_cachepercentparameterized304hits() throws Exception {
		return this.cachepercentparameterized304hits;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotflashcachehits
	* </pre>
	*/
	public Long get_cacheflashcachehitsrate() throws Exception {
		return this.cacheflashcachehitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotstoreablemisses
	* </pre>
	*/
	public Long get_cachestoreablemissesrate() throws Exception {
		return this.cachestoreablemissesrate;
	}

	/**
	* <pre>
	* Number of requests to a content group with flash cache enabled that were cache hits. The flash cache setting queues requests that arrive simultaneously and distributes the response to all the clients in the queue.
	* </pre>
	*/
	public Long get_cachetotflashcachehits() throws Exception {
		return this.cachetotflashcachehits;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachenummbwrittentodisk
	* </pre>
	*/
	public Long get_cachenummbwrittentodiskrate() throws Exception {
		return this.cachenummbwrittentodiskrate;
	}

	/**
	* <pre>
	* Responses that an intervening cache revalidated with the integrated cache before serving, as determined by a Cache-Control: Max-Age header configurable in the integrated cache
	* </pre>
	*/
	public Long get_cachetotrevalidationmiss() throws Exception {
		return this.cachetotrevalidationmiss;
	}

	/**
	* <pre>
	* Currently active value of maximum memory
	* </pre>
	*/
	public Long get_cachemaxmemoryactivekb() throws Exception {
		return this.cachemaxmemoryactivekb;
	}

	/**
	* <pre>
	* Cache misses for which the fetched response is stored in the cache before serving it to the client. Storable misses conform to a built-in or user-defined caching policy that contains a CACHE action.
	* </pre>
	*/
	public Long get_cachetotstoreablemisses() throws Exception {
		return this.cachetotstoreablemisses;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotparameterizedhits
	* </pre>
	*/
	public Long get_cacheparameterizedhitsrate() throws Exception {
		return this.cacheparameterizedhitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotparameterized304hits
	* </pre>
	*/
	public Long get_cacheparameterized304hitsrate() throws Exception {
		return this.cacheparameterized304hitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotexpireatlastbyte
	* </pre>
	*/
	public Long get_cacheexpireatlastbyterate() throws Exception {
		return this.cacheexpireatlastbyterate;
	}

	/**
	* <pre>
	* Responses fetched from the origin and served from the cache. Should approximate storable misses. Does not include non-storable misses.
	* </pre>
	*/
	public Long get_cachecurmisses() throws Exception {
		return this.cachecurmisses;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotrevalidationmiss
	* </pre>
	*/
	public Long get_cacherevalidationmissrate() throws Exception {
		return this.cacherevalidationmissrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotnon304hits
	* </pre>
	*/
	public Long get_cachenon304hitsrate() throws Exception {
		return this.cachenon304hitsrate;
	}

	/**
	* <pre>
	* Percentage of times stored content was successfully revalidated by a 304 (Object Not Modifed) response rather than by a full response
	* </pre>
	*/
	public Long get_cachepercentsuccessfulrevalidation() throws Exception {
		return this.cachepercentsuccessfulrevalidation;
	}

	/**
	* <pre>
	* Total number of full (non-304) responses served from the cache. A 304 status code indicates that a response has not been modified since the last time it was served
	* </pre>
	*/
	public Long get_cachetotnon304hits() throws Exception {
		return this.cachetotnon304hits;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotfulltoconditionalrequest
	* </pre>
	*/
	public Long get_cachefulltoconditionalrequestrate() throws Exception {
		return this.cachefulltoconditionalrequestrate;
	}

	/**
	* <pre>
	* Bytes served from cache divided by total bytes served to client. This ratio can be greater than 1 because of the assumption that all compression has been done in the NetScaler.
	* </pre>
	*/
	public Long get_cacherecentpercentoriginbandwidthsaved() throws Exception {
		return this.cacherecentpercentoriginbandwidthsaved;
	}

	/**
	* <pre>
	* Recently recorded ratio of parameterized 304 hits to all parameterized hits expressed as a percentage
	* </pre>
	*/
	public Long get_cacherecentpercentparameterizedhits() throws Exception {
		return this.cacherecentpercentparameterizedhits;
	}

	/**
	* <pre>
	* Requests matching a policy with an invalidation (INVAL) action and a content group that uses an invalidation selector or parameters.
	* </pre>
	*/
	public Long get_cachetotparameterizedinvalidationrequests() throws Exception {
		return this.cachetotparameterizedinvalidationrequests;
	}

	/**
	* <pre>
	* Cached responses currently saved on disk. Includes responses fully saved to disk, and expired or flushed but not yet removed.
	* </pre>
	*/
	public Long get_cachenumobjsavedondisk() throws Exception {
		return this.cachenumobjsavedondisk;
	}

	/**
	* <pre>
	* Number of requests to a content group with flash cache enabled that were cache misses. Flash cache distributes the response to all the clients in aqueue.
	* </pre>
	*/
	public Long get_cachetotflashcachemisses() throws Exception {
		return this.cachetotflashcachemisses;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachenummbreadfromdisk
	* </pre>
	*/
	public Long get_cachenummbreadfromdiskrate() throws Exception {
		return this.cachenummbreadfromdiskrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotparameterizedrequests
	* </pre>
	*/
	public Long get_cacheparameterizedrequestsrate() throws Exception {
		return this.cacheparameterizedrequestsrate;
	}

	/**
	* <pre>
	* Total number of times the cache failed to allocate memory to store responses.
	* </pre>
	*/
	public Long get_cacheerrmemalloc() throws Exception {
		return this.cacheerrmemalloc;
	}

	/**
	* <pre>
	* Recently recorded cache hit ratio expressed as percentage
	* </pre>
	*/
	public Long get_cacherecentpercenthit() throws Exception {
		return this.cacherecentpercenthit;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachenummbsavedondisk
	* </pre>
	*/
	public Long get_cachenummbsavedondiskrate() throws Exception {
		return this.cachenummbsavedondiskrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachecompressedbytesserved
	* </pre>
	*/
	public Long get_cachecompressedbytesservedrate() throws Exception {
		return this.cachecompressedbytesservedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetot304hits
	* </pre>
	*/
	public Long get_cache304hitsrate() throws Exception {
		return this.cache304hitsrate;
	}

	/**
	* <pre>
	* Cache hits as percentage of the total number of requests
	* </pre>
	*/
	public Long get_cachepercenthit() throws Exception {
		return this.cachepercenthit;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotnonstoreablemisses
	* </pre>
	*/
	public Long get_cachenonstoreablemissesrate() throws Exception {
		return this.cachenonstoreablemissesrate;
	}

	/**
	* <pre>
	* Requests that match an invalidation policy and result in expiration of specific cached responses or entire content groups.
	* </pre>
	*/
	public Long get_cachetotinvalidationrequests() throws Exception {
		return this.cachetotinvalidationrequests;
	}

	/**
	* <pre>
	* Largest amount of memory the NetScaler can dedicate to caching, up to 50% of available memory. A 0 value disables caching, but the caching module continues to run. 
	* </pre>
	*/
	public Long get_cache64maxmemorykb() throws Exception {
		return this.cache64maxmemorykb;
	}

	/**
	* <pre>
	* Object not modified responses served from the cache. (Status code 304 served instead of the full response.)
	* </pre>
	*/
	public Long get_cachetot304hits() throws Exception {
		return this.cachetot304hits;
	}

	/**
	* <pre>
	* Number of user-agent requests for a cached  Poll Every Time (PET) response that were sent to the origin server as conditional requests. 
	* </pre>
	*/
	public Long get_cachetotfulltoconditionalrequest() throws Exception {
		return this.cachetotfulltoconditionalrequest;
	}

	/**
	* <pre>
	* Parameterized requests resulting in either a 304 or non-304 hit.
	* </pre>
	*/
	public Long get_cachetotparameterizedhits() throws Exception {
		return this.cachetotparameterizedhits;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotpetrequests
	* </pre>
	*/
	public Long get_cachepetrequestsrate() throws Exception {
		return this.cachepetrequestsrate;
	}

	/**
	* <pre>
	* Recently recorded ratio of 304 hits to all hits expressed as percentage
	* </pre>
	*/
	public Long get_cacherecentpercent304hits() throws Exception {
		return this.cacherecentpercent304hits;
	}

	/**
	* <pre>
	* Cache misses for which the fetched response is not stored in the cache. These responses match policies with a NOCACHE action or are affected by Poll Every Time.
	* </pre>
	*/
	public Long get_cachetotnonstoreablemisses() throws Exception {
		return this.cachetotnonstoreablemisses;
	}

	/**
	* <pre>
	* Total number of requests where the content group has hit and invalidation parameters or selectors.
	* </pre>
	*/
	public Long get_cachetotparameterizedrequests() throws Exception {
		return this.cachetotparameterizedrequests;
	}

	/**
	* <pre>
	* Percentage of origin bandwidth saved, expressed as number of bytes served from the integrated cache divided by all bytes served. The assumption is that all compression is done in the NetScaler.
	* </pre>
	*/
	public Long get_cachepercentoriginbandwidthsaved() throws Exception {
		return this.cachepercentoriginbandwidthsaved;
	}

	/**
	* <pre>
	* Total cache hits plus total cache misses.
	* </pre>
	*/
	public Long get_cachetotrequests() throws Exception {
		return this.cachetotrequests;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotparameterizednon304hits
	* </pre>
	*/
	public Long get_cacheparameterizednon304hitsrate() throws Exception {
		return this.cacheparameterizednon304hitsrate;
	}

	/**
	* <pre>
	* Intercepted HTTP requests requiring fetches from origin server.
	* </pre>
	*/
	public Long get_cachetotmisses() throws Exception {
		return this.cachetotmisses;
	}

	/**
	* <pre>
	* Number of times a cache hit was found during a search of a content group that has Poll Every Time enabled.
	* </pre>
	*/
	public Long get_cachetotpethits() throws Exception {
		return this.cachetotpethits;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotparameterizedinvalidationrequests
	* </pre>
	*/
	public Long get_cacheparameterizedinvalidationrequestsrate() throws Exception {
		return this.cacheparameterizedinvalidationrequestsrate;
	}

	/**
	* <pre>
	* Recently recorded ratio of store-able misses to all misses expressed as percentage.
	* </pre>
	*/
	public Long get_cacherecentpercentstoreablemiss() throws Exception {
		return this.cacherecentpercentstoreablemiss;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotflashcachemisses
	* </pre>
	*/
	public Long get_cacheflashcachemissesrate() throws Exception {
		return this.cacheflashcachemissesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotinvalidationrequests
	* </pre>
	*/
	public Long get_cacheinvalidationrequestsrate() throws Exception {
		return this.cacheinvalidationrequestsrate;
	}

	/**
	* <pre>
	* Parameterized requests resulting in an object not modified (status code 304) response. 
	* </pre>
	*/
	public Long get_cachetotparameterized304hits() throws Exception {
		return this.cachetotparameterized304hits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		cache_stats[] resources = new cache_stats[1];
		cache_response result = (cache_response) service.get_payload_formatter().string_to_resource(cache_response.class, response);
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
		resources[0] = result.cache;
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
	* Use this API to fetch the statistics of all cache_stats resources that are configured on netscaler.
	*/
	public static cache_stats get(nitro_service service) throws Exception{
		cache_stats obj = new cache_stats();
		cache_stats[] response = (cache_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all cache_stats resources that are configured on netscaler.
	*/
	public static cache_stats get(nitro_service service,  options option) throws Exception{
		cache_stats obj = new cache_stats();
		cache_stats[] response = (cache_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
