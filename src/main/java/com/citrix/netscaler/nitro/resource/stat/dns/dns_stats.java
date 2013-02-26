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

package com.citrix.netscaler.nitro.resource.stat.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dns_response extends base_response
{
	public dns_stats dns;
}

public class dns_stats extends base_resource
{
	private Long dnstotqueries;
	private Long dnsqueriesrate;
	private Long dnstotmultiquery;
	private Long dnstotanswers;
	private Long dnsanswersrate;
	private Long dnstotserverresponse;
	private Long dnsserverresponserate;
	private Long dnstotrecupdate;
	private Long dnstotauthans;
	private Long dnstotserverquery;
	private Long dnsserverqueryrate;
	private Long dnstotcacheflush;
	private Long dnstotcacheentriesflush;
	private Long dnscurnoauthentries;
	private Long dnscurauthentries;
	private Long dnstotauthnonames;
	private Long dnstotunsupportedresponseclass;
	private Long dnstotinvalidqueryformat;
	private Long dnstotstrayanswer;
	private Long dnstotresponsebadlen;
	private Long dnstotreqrefusals;
	private Long dnstotunsupportedresponsetype;
	private Long dnstotunsupportedqueryclass;
	private Long dnstotnonauthnodatas;
	private Long dnstotnodataresps;
	private Long dnstotmultiquerydisableerror;
	private Long dnstotothererrors;
	private Long dnstotnsrecqueries;
	private Long dnsnsrecqueriesrate;
	private Long dnstotsoarecqueries;
	private Long dnssoarecqueriesrate;
	private Long dnstotptrrecqueries;
	private Long dnsptrrecqueriesrate;
	private Long dnstotsrvrecqueries;
	private Long dnssrvrecqueriesrate;
	private Long dnstotaresponse;
	private Long dnsaresponserate;
	private Long dnstotcnameresponse;
	private Long dnscnameresponserate;
	private Long dnstotmxresponse;
	private Long dnsmxresponserate;
	private Long dnstotanyresponse;
	private Long dnsanyresponserate;
	private Long dnstotnsrecupdate;
	private Long dnstotsoarecupdate;
	private Long dnstotptrrecupdate;
	private Long dnstotsrvrecupdate;
	private Long dnstotaaaarecqueries;
	private Long dnsaaaarecqueriesrate;
	private Long dnstotarecqueries;
	private Long dnsarecqueriesrate;
	private Long dnstotcnamerecqueries;
	private Long dnscnamerecqueriesrate;
	private Long dnstotmxrecqueries;
	private Long dnsmxrecqueriesrate;
	private Long dnstotanyqueries;
	private Long dnsanyqueriesrate;
	private Long dnstotaaaaresponse;
	private Long dnsaaaaresponserate;
	private Long dnstotnsresponse;
	private Long dnsnsresponserate;
	private Long dnstotsoaresponse;
	private Long dnssoaresponserate;
	private Long dnstotptrresponse;
	private Long dnsptrresponserate;
	private Long dnstotsrvresponse;
	private Long dnssrvresponserate;
	private Long dnstotaaaarecupdate;
	private Long dnstotarecupdate;
	private Long dnstotmxrecupdate;
	private Long dnstotcnamerecupdate;
	private Long dnscuraaaarecord;
	private Long dnscurarecord;
	private Long dnscurmxrecord;
	private Long dnscurcnamerecord;
	private Long dnscurnsrecord;
	private Long dnscursoarecord;
	private Long dnscurptrrecord;
	private Long dnscursrvrecord;
	private Long dnstotaaaarecfailed;
	private Long dnstotarecfailed;
	private Long dnstotmxrecfailed;
	private Long dnstotptrrecfailed;
	private Long dnstotnsrecfailed;
	private Long dnstotcnamerecfailed;
	private Long dnstotsoarecfailed;
	private Long dnstotsrvrecfailed;
	private Long dnstotanyrecfailed;
	private Long dnstotunsupportedqueries;

	/**
	* <pre>
	* Total number of CNAME responses received.
	* </pre>
	*/
	public Long get_dnstotcnameresponse() throws Exception {
		return this.dnstotcnameresponse;
	}

	/**
	* <pre>
	* Total number of A responses received.
	* </pre>
	*/
	public Long get_dnsaresponserate() throws Exception {
		return this.dnsaresponserate;
	}

	/**
	* <pre>
	* Total number of AAAA record updates.
	* </pre>
	*/
	public Long get_dnstotaaaarecupdate() throws Exception {
		return this.dnstotaaaarecupdate;
	}

	/**
	* <pre>
	* Total number of PTR record updates.
	* </pre>
	*/
	public Long get_dnstotptrrecupdate() throws Exception {
		return this.dnstotptrrecupdate;
	}

	/**
	* <pre>
	* Total number of requests for which query type requested was unsupported.
	* </pre>
	*/
	public Long get_dnstotunsupportedqueries() throws Exception {
		return this.dnstotunsupportedqueries;
	}

	/**
	* <pre>
	* Number of queries for which no record was found.
	* </pre>
	*/
	public Long get_dnstotauthnonames() throws Exception {
		return this.dnstotauthnonames;
	}

	/**
	* <pre>
	* Total number of MX record updates.
	* </pre>
	*/
	public Long get_dnstotmxrecupdate() throws Exception {
		return this.dnstotmxrecupdate;
	}

	/**
	* <pre>
	* Total number of ANY queries received.
	* </pre>
	*/
	public Long get_dnstotanyqueries() throws Exception {
		return this.dnstotanyqueries;
	}

	/**
	* <pre>
	* Total number of stray answers.
	* </pre>
	*/
	public Long get_dnstotstrayanswer() throws Exception {
		return this.dnstotstrayanswer;
	}

	/**
	* <pre>
	* Total number of times PTR record lookup failed.
	* </pre>
	*/
	public Long get_dnstotptrrecfailed() throws Exception {
		return this.dnstotptrrecfailed;
	}

	/**
	* <pre>
	* Total number of CNAME record updates.
	* </pre>
	*/
	public Long get_dnstotcnamerecupdate() throws Exception {
		return this.dnstotcnamerecupdate;
	}

	/**
	* <pre>
	* Total number of SOA records.
	* </pre>
	*/
	public Long get_dnscursoarecord() throws Exception {
		return this.dnscursoarecord;
	}

	/**
	* <pre>
	* Total number of cache entries flushed.
	* </pre>
	*/
	public Long get_dnstotcacheentriesflush() throws Exception {
		return this.dnstotcacheentriesflush;
	}

	/**
	* <pre>
	* Total number of AAAA responses received.
	* </pre>
	*/
	public Long get_dnsaaaaresponserate() throws Exception {
		return this.dnsaaaaresponserate;
	}

	/**
	* <pre>
	* Total number of AAAA queries received.
	* </pre>
	*/
	public Long get_dnsaaaarecqueriesrate() throws Exception {
		return this.dnsaaaarecqueriesrate;
	}

	/**
	* <pre>
	* Total number of MX queries received.
	* </pre>
	*/
	public Long get_dnstotmxrecqueries() throws Exception {
		return this.dnstotmxrecqueries;
	}

	/**
	* <pre>
	* Total number of SOA queries received.
	* </pre>
	*/
	public Long get_dnstotsoarecqueries() throws Exception {
		return this.dnstotsoarecqueries;
	}

	/**
	* <pre>
	* Total number of A records.
	* </pre>
	*/
	public Long get_dnscurarecord() throws Exception {
		return this.dnscurarecord;
	}

	/**
	* <pre>
	* Total number of queries whose format was invalid.
	* </pre>
	*/
	public Long get_dnstotinvalidqueryformat() throws Exception {
		return this.dnstotinvalidqueryformat;
	}

	/**
	* <pre>
	* Total number of times SRV record lookup failed.
	* </pre>
	*/
	public Long get_dnstotsrvrecfailed() throws Exception {
		return this.dnstotsrvrecfailed;
	}

	/**
	* <pre>
	* Total number of A queries received.
	* </pre>
	*/
	public Long get_dnsarecqueriesrate() throws Exception {
		return this.dnsarecqueriesrate;
	}

	/**
	* <pre>
	* Total number of SOA responses received.
	* </pre>
	*/
	public Long get_dnstotsoaresponse() throws Exception {
		return this.dnstotsoaresponse;
	}

	/**
	* <pre>
	* Total number of Server responses received.
	* </pre>
	*/
	public Long get_dnstotserverresponse() throws Exception {
		return this.dnstotserverresponse;
	}

	/**
	* <pre>
	* Total number of ANY queries received.
	* </pre>
	*/
	public Long get_dnsanyqueriesrate() throws Exception {
		return this.dnsanyqueriesrate;
	}

	/**
	* <pre>
	* Total number of authoritative entries.
	* </pre>
	*/
	public Long get_dnscurauthentries() throws Exception {
		return this.dnscurauthentries;
	}

	/**
	* <pre>
	* Total number of MX responses received.
	* </pre>
	*/
	public Long get_dnstotmxresponse() throws Exception {
		return this.dnstotmxresponse;
	}

	/**
	* <pre>
	* Total number of PTR queries received.
	* </pre>
	*/
	public Long get_dnstotptrrecqueries() throws Exception {
		return this.dnstotptrrecqueries;
	}

	/**
	* <pre>
	* Total number of queries for which query class was unsupported.
	* </pre>
	*/
	public Long get_dnstotunsupportedqueryclass() throws Exception {
		return this.dnstotunsupportedqueryclass;
	}

	/**
	* <pre>
	* Total number of PTR responses received.
	* </pre>
	*/
	public Long get_dnsptrresponserate() throws Exception {
		return this.dnsptrresponserate;
	}

	/**
	* <pre>
	* Total number of SOA queries received.
	* </pre>
	*/
	public Long get_dnssoarecqueriesrate() throws Exception {
		return this.dnssoarecqueriesrate;
	}

	/**
	* <pre>
	* Total number of PTR queries received.
	* </pre>
	*/
	public Long get_dnsptrrecqueriesrate() throws Exception {
		return this.dnsptrrecqueriesrate;
	}

	/**
	* <pre>
	* Total number of times SOA record lookup failed.
	* </pre>
	*/
	public Long get_dnstotsoarecfailed() throws Exception {
		return this.dnstotsoarecfailed;
	}

	/**
	* <pre>
	* Total number of AAAA queries received.
	* </pre>
	*/
	public Long get_dnstotaaaarecqueries() throws Exception {
		return this.dnstotaaaarecqueries;
	}

	/**
	* <pre>
	* Total number of times MX record lookup failed.
	* </pre>
	*/
	public Long get_dnstotmxrecfailed() throws Exception {
		return this.dnstotmxrecfailed;
	}

	/**
	* <pre>
	* Total number of times AAAA record lookup failed.
	* </pre>
	*/
	public Long get_dnstotaaaarecfailed() throws Exception {
		return this.dnstotaaaarecfailed;
	}

	/**
	* <pre>
	* Total number of SRV responses received.
	* </pre>
	*/
	public Long get_dnssrvresponserate() throws Exception {
		return this.dnssrvresponserate;
	}

	/**
	* <pre>
	* Total number of NS queries received.
	* </pre>
	*/
	public Long get_dnsnsrecqueriesrate() throws Exception {
		return this.dnsnsrecqueriesrate;
	}

	/**
	* <pre>
	* Total number of Server queries sent.
	* </pre>
	*/
	public Long get_dnstotserverquery() throws Exception {
		return this.dnstotserverquery;
	}

	/**
	* <pre>
	* Total number of SOA responses received.
	* </pre>
	*/
	public Long get_dnssoaresponserate() throws Exception {
		return this.dnssoaresponserate;
	}

	/**
	* <pre>
	* Total number of Multi Query request received.
	* </pre>
	*/
	public Long get_dnstotmultiquery() throws Exception {
		return this.dnstotmultiquery;
	}

	/**
	* <pre>
	* Total number of AAAA records.
	* </pre>
	*/
	public Long get_dnscuraaaarecord() throws Exception {
		return this.dnscuraaaarecord;
	}

	/**
	* <pre>
	* Total number of DNS queries received.
	* </pre>
	*/
	public Long get_dnsqueriesrate() throws Exception {
		return this.dnsqueriesrate;
	}

	/**
	* <pre>
	* Total number of ANY responses received.
	* </pre>
	*/
	public Long get_dnsanyresponserate() throws Exception {
		return this.dnsanyresponserate;
	}

	/**
	* <pre>
	* Total number of DNS responses received.
	* </pre>
	*/
	public Long get_dnsanswersrate() throws Exception {
		return this.dnsanswersrate;
	}

	/**
	* <pre>
	* Total number of A record updates.
	* </pre>
	*/
	public Long get_dnstotarecupdate() throws Exception {
		return this.dnstotarecupdate;
	}

	/**
	* <pre>
	* Total number of CNAME responses received.
	* </pre>
	*/
	public Long get_dnscnameresponserate() throws Exception {
		return this.dnscnameresponserate;
	}

	/**
	* <pre>
	* Total number of other errors. 
	* </pre>
	*/
	public Long get_dnstotothererrors() throws Exception {
		return this.dnstotothererrors;
	}

	/**
	* <pre>
	* Total number of times NS record lookup failed.
	* </pre>
	*/
	public Long get_dnstotnsrecfailed() throws Exception {
		return this.dnstotnsrecfailed;
	}

	/**
	* <pre>
	* Total number of CNAME records.
	* </pre>
	*/
	public Long get_dnscurcnamerecord() throws Exception {
		return this.dnscurcnamerecord;
	}

	/**
	* <pre>
	* Total number of non-authoritative entries.
	* </pre>
	*/
	public Long get_dnscurnoauthentries() throws Exception {
		return this.dnscurnoauthentries;
	}

	/**
	* <pre>
	* Number of DNS responses received with invalid resoure data length.
	* </pre>
	*/
	public Long get_dnstotresponsebadlen() throws Exception {
		return this.dnstotresponsebadlen;
	}

	/**
	* <pre>
	* Total number of AAAA responses received.
	* </pre>
	*/
	public Long get_dnstotaaaaresponse() throws Exception {
		return this.dnstotaaaaresponse;
	}

	/**
	* <pre>
	* Total number of responses for which response type requested was unsupported.
	* </pre>
	*/
	public Long get_dnstotunsupportedresponsetype() throws Exception {
		return this.dnstotunsupportedresponsetype;
	}

	/**
	* <pre>
	* Total number of NS queries received.
	* </pre>
	*/
	public Long get_dnstotnsrecqueries() throws Exception {
		return this.dnstotnsrecqueries;
	}

	/**
	* <pre>
	* Total number of SRV records.
	* </pre>
	*/
	public Long get_dnscursrvrecord() throws Exception {
		return this.dnscursrvrecord;
	}

	/**
	* <pre>
	* Total number of PTR records.
	* </pre>
	*/
	public Long get_dnscurptrrecord() throws Exception {
		return this.dnscurptrrecord;
	}

	/**
	* <pre>
	* Total number of ANY responses received.
	* </pre>
	*/
	public Long get_dnstotanyresponse() throws Exception {
		return this.dnstotanyresponse;
	}

	/**
	* <pre>
	* Total number of times ANY query lookup failed.
	* </pre>
	*/
	public Long get_dnstotanyrecfailed() throws Exception {
		return this.dnstotanyrecfailed;
	}

	/**
	* <pre>
	* Total number of NS responses received.
	* </pre>
	*/
	public Long get_dnstotnsresponse() throws Exception {
		return this.dnstotnsresponse;
	}

	/**
	* <pre>
	* Total number of SRV queries received.
	* </pre>
	*/
	public Long get_dnssrvrecqueriesrate() throws Exception {
		return this.dnssrvrecqueriesrate;
	}

	/**
	* <pre>
	* Total number of NS record updates.
	* </pre>
	*/
	public Long get_dnstotnsrecupdate() throws Exception {
		return this.dnstotnsrecupdate;
	}

	/**
	* <pre>
	* Total number of CNAME queries received.
	* </pre>
	*/
	public Long get_dnstotcnamerecqueries() throws Exception {
		return this.dnstotcnamerecqueries;
	}

	/**
	* <pre>
	* Total number of times a multi query was disabled and received a multi query.
	* </pre>
	*/
	public Long get_dnstotmultiquerydisableerror() throws Exception {
		return this.dnstotmultiquerydisableerror;
	}

	/**
	* <pre>
	* Total number of A queries received.
	* </pre>
	*/
	public Long get_dnstotarecqueries() throws Exception {
		return this.dnstotarecqueries;
	}

	/**
	* <pre>
	* Total number of Server responses received.
	* </pre>
	*/
	public Long get_dnsserverresponserate() throws Exception {
		return this.dnsserverresponserate;
	}

	/**
	* <pre>
	* Total number of NS responses received.
	* </pre>
	*/
	public Long get_dnsnsresponserate() throws Exception {
		return this.dnsnsresponserate;
	}

	/**
	* <pre>
	* Total number of DNS responses received.
	* </pre>
	*/
	public Long get_dnstotanswers() throws Exception {
		return this.dnstotanswers;
	}

	/**
	* <pre>
	* Total number of MX queries received.
	* </pre>
	*/
	public Long get_dnsmxrecqueriesrate() throws Exception {
		return this.dnsmxrecqueriesrate;
	}

	/**
	* <pre>
	* Total number of times CNAME record lookup failed.
	* </pre>
	*/
	public Long get_dnstotcnamerecfailed() throws Exception {
		return this.dnstotcnamerecfailed;
	}

	/**
	* <pre>
	* Total number of SRV queries received.
	* </pre>
	*/
	public Long get_dnstotsrvrecqueries() throws Exception {
		return this.dnstotsrvrecqueries;
	}

	/**
	* <pre>
	* Total number of A responses received.
	* </pre>
	*/
	public Long get_dnstotaresponse() throws Exception {
		return this.dnstotaresponse;
	}

	/**
	* <pre>
	* Total number of CNAME queries received.
	* </pre>
	*/
	public Long get_dnscnamerecqueriesrate() throws Exception {
		return this.dnscnamerecqueriesrate;
	}

	/**
	* <pre>
	* Total number of DNS queries received.
	* </pre>
	*/
	public Long get_dnstotqueries() throws Exception {
		return this.dnstotqueries;
	}

	/**
	* <pre>
	* Total number of SRV responses received.
	* </pre>
	*/
	public Long get_dnstotsrvresponse() throws Exception {
		return this.dnstotsrvresponse;
	}

	/**
	* <pre>
	* Total number of responses for which response types were unsupported.
	* </pre>
	*/
	public Long get_dnstotunsupportedresponseclass() throws Exception {
		return this.dnstotunsupportedresponseclass;
	}

	/**
	* <pre>
	* Total number of times cache was flushed.
	* </pre>
	*/
	public Long get_dnstotcacheflush() throws Exception {
		return this.dnstotcacheflush;
	}

	/**
	* <pre>
	* Total number of times A record lookup failed.
	* </pre>
	*/
	public Long get_dnstotarecfailed() throws Exception {
		return this.dnstotarecfailed;
	}

	/**
	* <pre>
	* Total number of SRV record updates.
	* </pre>
	*/
	public Long get_dnstotsrvrecupdate() throws Exception {
		return this.dnstotsrvrecupdate;
	}

	/**
	* <pre>
	* Total number of Server queries sent.
	* </pre>
	*/
	public Long get_dnsserverqueryrate() throws Exception {
		return this.dnsserverqueryrate;
	}

	/**
	* <pre>
	* Total number of NS records.
	* </pre>
	*/
	public Long get_dnscurnsrecord() throws Exception {
		return this.dnscurnsrecord;
	}

	/**
	* <pre>
	* Total number of SOA record updates.
	* </pre>
	*/
	public Long get_dnstotsoarecupdate() throws Exception {
		return this.dnstotsoarecupdate;
	}

	/**
	* <pre>
	* Total number of responses for which there was a format error.
	* </pre>
	*/
	public Long get_dnstotnonauthnodatas() throws Exception {
		return this.dnstotnonauthnodatas;
	}

	/**
	* <pre>
	* Number of queries which were authoritatively answered.
	* </pre>
	*/
	public Long get_dnstotauthans() throws Exception {
		return this.dnstotauthans;
	}

	/**
	* <pre>
	* Number of DNS requests refused.
	* </pre>
	*/
	public Long get_dnstotreqrefusals() throws Exception {
		return this.dnstotreqrefusals;
	}

	/**
	* <pre>
	* Total number of MX records.
	* </pre>
	*/
	public Long get_dnscurmxrecord() throws Exception {
		return this.dnscurmxrecord;
	}

	/**
	* <pre>
	* Total number of record updates.
	* </pre>
	*/
	public Long get_dnstotrecupdate() throws Exception {
		return this.dnstotrecupdate;
	}

	/**
	* <pre>
	* Number of DNS responses received without answer.
	* </pre>
	*/
	public Long get_dnstotnodataresps() throws Exception {
		return this.dnstotnodataresps;
	}

	/**
	* <pre>
	* Total number of PTR responses received.
	* </pre>
	*/
	public Long get_dnstotptrresponse() throws Exception {
		return this.dnstotptrresponse;
	}

	/**
	* <pre>
	* Total number of MX responses received.
	* </pre>
	*/
	public Long get_dnsmxresponserate() throws Exception {
		return this.dnsmxresponserate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		dns_stats[] resources = new dns_stats[1];
		dns_response result = (dns_response) service.get_payload_formatter().string_to_resource(dns_response.class, response);
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
		resources[0] = result.dns;
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
	* Use this API to fetch the statistics of all dns_stats resources that are configured on netscaler.
	*/
	public static dns_stats get(nitro_service service) throws Exception{
		dns_stats obj = new dns_stats();
		dns_stats[] response = (dns_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all dns_stats resources that are configured on netscaler.
	*/
	public static dns_stats get(nitro_service service,  options option) throws Exception{
		dns_stats obj = new dns_stats();
		dns_stats[] response = (dns_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
