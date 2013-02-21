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

package com.citrix.netscaler.nitro.resource.stat.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ssl_response extends base_response
{
	public ssl_stats ssl;
}

public class ssl_stats extends base_resource
{
	private Long sslnumcardsup;
	private Long sslcardstatus;
	private Long sslcards;
	private Long sslenginestatus;
	private Long ssltotsessions;
	private Long sslsessionsrate;
	private Long ssltottransactions;
	private Long ssltransactionsrate;
	private Long ssltotsslv2transactions;
	private Long sslsslv2transactionsrate;
	private Long ssltotsslv3transactions;
	private Long sslsslv3transactionsrate;
	private Long ssltottlsv1transactions;
	private Long ssltlsv1transactionsrate;
	private Long ssltotsslv2sessions;
	private Long sslsslv2sessionsrate;
	private Long ssltotsslv3sessions;
	private Long sslsslv3sessionsrate;
	private Long ssltottlsv1sessions;
	private Long ssltlsv1sessionsrate;
	private Long ssltotnewsessions;
	private Long sslnewsessionsrate;
	private Long ssltotsessionmiss;
	private Long sslsessionmissrate;
	private Long ssltotsessionhits;
	private Long sslsessionhitsrate;
	private Long sslbetotsessions;
	private Long sslbesessionsrate;
	private Long sslbetotsslv3sessions;
	private Long sslbesslv3sessionsrate;
	private Long sslbetottlsv1sessions;
	private Long sslbetlsv1sessionsrate;
	private Long sslbetotsessionmultiplexattempts;
	private Long sslbesessionmultiplexattemptsrate;
	private Long sslbetotsessionmultiplexattemptsuccess;
	private Long sslbesessionmultiplexattemptsuccessrate;
	private Long sslbetotsessionmultiplexattemptfails;
	private Long sslbesessionmultiplexattemptfailsrate;
	private Long ssltotenc;
	private Long sslencrate;
	private Long ssltotdec;
	private Long ssldecrate;
	private Long ssltotrenegsessions;
	private Long sslrenegsessionsrate;
	private Long ssltotsslv3renegsessions;
	private Long sslsslv3renegsessionsrate;
	private Long ssltottlsv1renegsessions;
	private Long ssltlsv1renegsessionsrate;
	private Long ssltotrsa512keyexchanges;
	private Long sslrsa512keyexchangesrate;
	private Long ssltotrsa1024keyexchanges;
	private Long sslrsa1024keyexchangesrate;
	private Long ssltotrsa2048keyexchanges;
	private Long sslrsa2048keyexchangesrate;
	private Long ssltotrsa4096keyexchanges;
	private Long sslrsa4096keyexchangesrate;
	private Long ssltotdh512keyexchanges;
	private Long ssldh512keyexchangesrate;
	private Long ssltotdh1024keyexchanges;
	private Long ssldh1024keyexchangesrate;
	private Long ssltotdh2048keyexchanges;
	private Long ssldh2048keyexchangesrate;
	private Long ssltot40bitrc4ciphers;
	private Long ssl40bitrc4ciphersrate;
	private Long ssltot56bitrc4ciphers;
	private Long ssl56bitrc4ciphersrate;
	private Long ssltot64bitrc4ciphers;
	private Long ssl64bitrc4ciphersrate;
	private Long ssltot128bitrc4ciphers;
	private Long ssl128bitrc4ciphersrate;
	private Long ssltot40bitdesciphers;
	private Long ssl40bitdesciphersrate;
	private Long ssltot56bitdesciphers;
	private Long ssl56bitdesciphersrate;
	private Long ssltot168bit3desciphers;
	private Long ssl168bit3desciphersrate;
	private Long ssltotcipheraes128;
	private Long sslcipheraes128rate;
	private Long ssltotcipheraes256;
	private Long sslcipheraes256rate;
	private Long ssltot40bitrc2ciphers;
	private Long ssl40bitrc2ciphersrate;
	private Long ssltot56bitrc2ciphers;
	private Long ssl56bitrc2ciphersrate;
	private Long ssltot128bitrc2ciphers;
	private Long ssl128bitrc2ciphersrate;
	private Long ssltotnullciphers;
	private Long sslnullciphersrate;
	private Long ssltotmd5mac;
	private Long sslmd5macrate;
	private Long ssltotshamac;
	private Long sslshamacrate;
	private Long ssltotsslv2handshakes;
	private Long sslsslv2handshakesrate;
	private Long ssltotsslv3handshakes;
	private Long sslsslv3handshakesrate;
	private Long ssltottlsv1handshakes;
	private Long ssltlsv1handshakesrate;
	private Long ssltotsslv2clientauthentications;
	private Long sslsslv2clientauthenticationsrate;
	private Long ssltotsslv3clientauthentications;
	private Long sslsslv3clientauthenticationsrate;
	private Long ssltottlsv1clientauthentications;
	private Long ssltlsv1clientauthenticationsrate;
	private Long ssltotrsaauthorizations;
	private Long sslrsaauthorizationsrate;
	private Long ssltotdhauthorizations;
	private Long ssldhauthorizationsrate;
	private Long ssltotdssauthorizations;
	private Long ssldssauthorizationsrate;
	private Long ssltotnullauthorizations;
	private Long sslnullauthorizationsrate;
	private Long ssltotbkendsessionrenegotiate;
	private Long sslbkendsessionrenegotiaterate;
	private Long ssltotbkendsslv3renego;
	private Long sslbkendsslv3renegorate;
	private Long ssltotbkendtlsvlrenego;
	private Long sslbkendtlsvlrenegorate;
	private Long sslbetotrsa512keyexchanges;
	private Long sslbersa512keyexchangesrate;
	private Long sslbetotrsa1024keyexchanges;
	private Long sslbersa1024keyexchangesrate;
	private Long sslbetotrsa2048keyexchanges;
	private Long sslbersa2048keyexchangesrate;
	private Long sslbetotdh512keyexchanges;
	private Long sslbedh512keyexchangesrate;
	private Long sslbetotdh1024keyexchanges;
	private Long sslbedh1024keyexchangesrate;
	private Long sslbetotdh2048keyexchanges;
	private Long sslbedh2048keyexchangesrate;
	private Long sslbetot40bitrc4ciphers;
	private Long sslbe40bitrc4ciphersrate;
	private Long sslbetot56bitrc4ciphers;
	private Long sslbe56bitrc4ciphersrate;
	private Long sslbetot64bitrc4ciphers;
	private Long sslbe64bitrc4ciphersrate;
	private Long sslbetot128bitrc4ciphers;
	private Long sslbe128bitrc4ciphersrate;
	private Long sslbetot40bitdesciphers;
	private Long sslbe40bitdesciphersrate;
	private Long sslbetot56bitdesciphers;
	private Long sslbe56bitdesciphersrate;
	private Long sslbetot168bit3desciphers;
	private Long sslbe168bit3desciphersrate;
	private Long ssltotbkendcipheraes128;
	private Long sslbkendcipheraes128rate;
	private Long ssltotbkendcipheraes256;
	private Long sslbkendcipheraes256rate;
	private Long sslbetot40bitrc2ciphers;
	private Long sslbe40bitrc2ciphersrate;
	private Long sslbetot56bitrc2ciphers;
	private Long sslbe56bitrc2ciphersrate;
	private Long sslbetot128bitrc2ciphers;
	private Long sslbe128bitrc2ciphersrate;
	private Long sslbetotnullciphers;
	private Long sslbenullciphersrate;
	private Long sslbetotmd5mac;
	private Long sslbemd5macrate;
	private Long sslbetotshamac;
	private Long sslbeshamacrate;
	private Long sslbetotsslv3handshakes;
	private Long sslbesslv3handshakesrate;
	private Long sslbetottlsv1handshakes;
	private Long sslbetlsv1handshakesrate;
	private Long sslbetotsslv3clientauthentications;
	private Long sslbesslv3clientauthenticationsrate;
	private Long sslbetottlsv1clientauthentications;
	private Long sslbetlsv1clientauthenticationsrate;
	private Long sslbetotrsaauthorizations;
	private Long sslbersaauthorizationsrate;
	private Long sslbetotdhauthorizations;
	private Long sslbedhauthorizationsrate;
	private Long sslbetotdssauthorizations;
	private Long sslbedssauthorizationsrate;
	private Long sslbetotnullauthorizations;
	private Long sslbenullauthorizationsrate;
	private Long ssltotoffloadrsakeyexchanges;
	private Long ssloffloadrsakeyexchangesrate;
	private Long ssltotoffloadsignrsa;
	private Long ssloffloadsignrsarate;
	private Long ssltotoffloaddhkeyexchanges;
	private Long ssloffloaddhkeyexchangesrate;
	private Long ssltotoffloadbulkrc4;
	private Long ssloffloadbulkrc4rate;
	private Long ssltotoffloadbulkdes;
	private Long ssloffloadbulkdesrate;
	private Long ssltotoffloadbulkaes;
	private Long ssloffloadbulkaesrate;
	private Long ssltotenchw;
	private Long sslenchwrate;
	private Long ssltotencsw;
	private Long sslencswrate;
	private Long ssltotencfe;
	private Long sslencferate;
	private Long ssltothwencfe;
	private Long sslhwencferate;
	private Long ssltotswencfe;
	private Long sslswencferate;
	private Long ssltotencbe;
	private Long sslencberate;
	private Long ssltothwencbe;
	private Long sslhwencberate;
	private Long ssltotswencbe;
	private Long sslswencberate;
	private Long ssltotdechw;
	private Long ssldechwrate;
	private Long ssltotdecsw;
	private Long ssldecswrate;
	private Long ssltotdecfe;
	private Long ssldecferate;
	private Long ssltothwdecfe;
	private Long sslhwdecferate;
	private Long ssltotswdecfe;
	private Long sslswdecferate;
	private Long ssltotdecbe;
	private Long ssldecberate;
	private Long ssltothwdecbe;
	private Long sslhwdecberate;
	private Long ssltotswdecbe;
	private Long sslswdecberate;
	private Long sslbemaxmultiplexedsessions;
	private Long sslbemaxmultiplexedsessionsrate;
	private Long ssltot128bitideaciphers;
	private Long ssl128bitideaciphersrate;
	private Long sslbetot128bitideaciphers;
	private Long sslbe128bitideaciphersrate;

	/**
	* <pre>
	* Number of Diffie-Helman 512-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssldh512keyexchangesrate() throws Exception {
		return this.ssldh512keyexchangesrate;
	}

	/**
	* <pre>
	* Number of back-end TLSv1 handshakes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetottlsv1handshakes() throws Exception {
		return this.sslbetottlsv1handshakes;
	}

	/**
	* <pre>
	* Number of RSA 512-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotrsa512keyexchanges() throws Exception {
		return this.ssltotrsa512keyexchanges;
	}

	/**
	* <pre>
	* Number of back-end null cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotnullciphers() throws Exception {
		return this.sslbetotnullciphers;
	}

	/**
	* <pre>
	* Number of bytes decrypted in software on back-end
	* </pre>
	*/
	public Long get_sslswdecberate() throws Exception {
		return this.sslswdecberate;
	}

	/**
	* <pre>
	* Number of bytes encrypted in software.
	* </pre>
	*/
	public Long get_ssltotencsw() throws Exception {
		return this.ssltotencsw;
	}

	/**
	* <pre>
	* Number of bytes encrypted on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslencrate() throws Exception {
		return this.sslencrate;
	}

	/**
	* <pre>
	* Number of SSL transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltottransactions() throws Exception {
		return this.ssltottransactions;
	}

	/**
	* <pre>
	* Back-end AES 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotbkendcipheraes128() throws Exception {
		return this.ssltotbkendcipheraes128;
	}

	/**
	* <pre>
	* Number of back-end RC4 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot40bitrc4ciphers() throws Exception {
		return this.sslbetot40bitrc4ciphers;
	}

	/**
	* <pre>
	* Number of SSL session renegotiations done on TLSv1.
	* </pre>
	*/
	public Long get_ssltottlsv1renegsessions() throws Exception {
		return this.ssltottlsv1renegsessions;
	}

	/**
	* <pre>
	* Number of SSL cards that are UP. If the number of cards UP is lower than a threshold, a failover is initiated.
	* </pre>
	*/
	public Long get_sslnumcardsup() throws Exception {
		return this.sslnumcardsup;
	}

	/**
	* <pre>
	* Number of AES 256-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotcipheraes256() throws Exception {
		return this.ssltotcipheraes256;
	}

	/**
	* <pre>
	* Number of back-end TLSv1 client authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetlsv1clientauthenticationsrate() throws Exception {
		return this.sslbetlsv1clientauthenticationsrate;
	}

	/**
	* <pre>
	* Total number of SSLv3 transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsslv3transactions() throws Exception {
		return this.ssltotsslv3transactions;
	}

	/**
	* <pre>
	* Number of SSL session renegotiations on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslrenegsessionsrate() throws Exception {
		return this.sslrenegsessionsrate;
	}

	/**
	* <pre>
	* Number of bytes decrypted on the back end.
	* </pre>
	*/
	public Long get_ssltotdecbe() throws Exception {
		return this.ssltotdecbe;
	}

	/**
	* <pre>
	* Number of DES encryptions offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssloffloadbulkdesrate() throws Exception {
		return this.ssloffloadbulkdesrate;
	}

	/**
	* <pre>
	* Number of back-end SSL sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotsessions() throws Exception {
		return this.sslbetotsessions;
	}

	/**
	* <pre>
	* Number of back-end RC4 64-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot64bitrc4ciphers() throws Exception {
		return this.sslbetot64bitrc4ciphers;
	}

	/**
	* <pre>
	* Number of back-end RSA 2048-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbersa2048keyexchangesrate() throws Exception {
		return this.sslbersa2048keyexchangesrate;
	}

	/**
	* <pre>
	* Number of back-end TLSv1 client authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetottlsv1clientauthentications() throws Exception {
		return this.sslbetottlsv1clientauthentications;
	}

	/**
	* <pre>
	* Number of bytes encrypted in hardware on the back end.
	* </pre>
	*/
	public Long get_ssltothwencbe() throws Exception {
		return this.ssltothwencbe;
	}

	/**
	* <pre>
	* Number of back-end DH 512-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotdh512keyexchanges() throws Exception {
		return this.sslbetotdh512keyexchanges;
	}

	/**
	* <pre>
	* Number of back-end SSL sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbesessionsrate() throws Exception {
		return this.sslbesessionsrate;
	}

	/**
	* <pre>
	* Number of IDEA 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot128bitideaciphers() throws Exception {
		return this.ssltot128bitideaciphers;
	}

	/**
	* <pre>
	* Number of bytes decrypted on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotdec() throws Exception {
		return this.ssltotdec;
	}

	/**
	* <pre>
	* Number of back-end RC2 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot56bitrc2ciphers() throws Exception {
		return this.sslbetot56bitrc2ciphers;
	}

	/**
	* <pre>
	* Number of DES 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl56bitdesciphersrate() throws Exception {
		return this.ssl56bitdesciphersrate;
	}

	/**
	* <pre>
	* Back-end AES 256-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbkendcipheraes256rate() throws Exception {
		return this.sslbkendcipheraes256rate;
	}

	/**
	* <pre>
	* Number of back-end RSA authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotrsaauthorizations() throws Exception {
		return this.sslbetotrsaauthorizations;
	}

	/**
	* <pre>
	* Number of back-end DH 2048-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbedh2048keyexchangesrate() throws Exception {
		return this.sslbedh2048keyexchangesrate;
	}

	/**
	* <pre>
	* Number of back-end 3DES 168-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe168bit3desciphersrate() throws Exception {
		return this.sslbe168bit3desciphersrate;
	}

	/**
	* <pre>
	* Number of RSA authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotrsaauthorizations() throws Exception {
		return this.ssltotrsaauthorizations;
	}

	/**
	* <pre>
	* Number of AES 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslcipheraes128rate() throws Exception {
		return this.sslcipheraes128rate;
	}

	/**
	* <pre>
	* Number of SSLv2 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsslv2sessions() throws Exception {
		return this.ssltotsslv2sessions;
	}

	/**
	* <pre>
	* Number of SSLv2 transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsslv2transactionsrate() throws Exception {
		return this.sslsslv2transactionsrate;
	}

	/**
	* <pre>
	* Number of RSA 1024-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslrsa1024keyexchangesrate() throws Exception {
		return this.sslrsa1024keyexchangesrate;
	}

	/**
	* <pre>
	* Number of back-end DH 512-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbedh512keyexchangesrate() throws Exception {
		return this.sslbedh512keyexchangesrate;
	}

	/**
	* <pre>
	* Number of bytes decrypted in hardware on the front end.
	* </pre>
	*/
	public Long get_ssltothwdecfe() throws Exception {
		return this.ssltothwdecfe;
	}

	/**
	* <pre>
	* Number of RC4 encryptions offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssloffloadbulkrc4rate() throws Exception {
		return this.ssloffloadbulkrc4rate;
	}

	/**
	* <pre>
	* Number of client authentications done on TLSv1.
	* </pre>
	*/
	public Long get_ssltottlsv1clientauthentications() throws Exception {
		return this.ssltottlsv1clientauthentications;
	}

	/**
	* <pre>
	* Number of back-end RC4 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe128bitrc4ciphersrate() throws Exception {
		return this.sslbe128bitrc4ciphersrate;
	}

	/**
	* <pre>
	* Number of bytes decrypted in software.
	* </pre>
	*/
	public Long get_ssltotdecsw() throws Exception {
		return this.ssltotdecsw;
	}

	/**
	* <pre>
	* Number of back-end RC2 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot40bitrc2ciphers() throws Exception {
		return this.sslbetot40bitrc2ciphers;
	}

	/**
	* <pre>
	* Number of RC2 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl128bitrc2ciphersrate() throws Exception {
		return this.ssl128bitrc2ciphersrate;
	}

	/**
	* <pre>
	* Number of DES 168-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl168bit3desciphersrate() throws Exception {
		return this.ssl168bit3desciphersrate;
	}

	/**
	* <pre>
	* Number of AES encryptions offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssloffloadbulkaesrate() throws Exception {
		return this.ssloffloadbulkaesrate;
	}

	/**
	* <pre>
	* Number of RSA 512-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslrsa512keyexchangesrate() throws Exception {
		return this.sslrsa512keyexchangesrate;
	}

	/**
	* <pre>
	* Number of back-end RC2 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe56bitrc2ciphersrate() throws Exception {
		return this.sslbe56bitrc2ciphersrate;
	}

	/**
	* <pre>
	* Number of RSA 4096-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotrsa4096keyexchanges() throws Exception {
		return this.ssltotrsa4096keyexchanges;
	}

	/**
	* <pre>
	* Number of bytes encrypted in software on the front end.
	* </pre>
	*/
	public Long get_ssltotswencfe() throws Exception {
		return this.ssltotswencfe;
	}

	/**
	* <pre>
	* Number of RC4 64-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot64bitrc4ciphers() throws Exception {
		return this.ssltot64bitrc4ciphers;
	}

	/**
	* <pre>
	* Number of back-end SSLv3 client authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotsslv3clientauthentications() throws Exception {
		return this.sslbetotsslv3clientauthentications;
	}

	/**
	* <pre>
	* Number of client authentications done on SSLv2.
	* </pre>
	*/
	public Long get_ssltotsslv2clientauthentications() throws Exception {
		return this.ssltotsslv2clientauthentications;
	}

	/**
	* <pre>
	* Number of bytes decrypted in software.
	* </pre>
	*/
	public Long get_ssldecswrate() throws Exception {
		return this.ssldecswrate;
	}

	/**
	* <pre>
	* Number of Diffie-Helman authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotdhauthorizations() throws Exception {
		return this.ssltotdhauthorizations;
	}

	/**
	* <pre>
	* Number of SSL session reuse misses on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsessionmiss() throws Exception {
		return this.ssltotsessionmiss;
	}

	/**
	* <pre>
	* Number of bytes decrypted on the front end.
	* </pre>
	*/
	public Long get_ssltotdecfe() throws Exception {
		return this.ssltotdecfe;
	}

	/**
	* <pre>
	* Number of back-end SSLv3 handshakes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbesslv3handshakesrate() throws Exception {
		return this.sslbesslv3handshakesrate;
	}

	/**
	* <pre>
	* Number of Diffie-Helman 1024-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssldh1024keyexchangesrate() throws Exception {
		return this.ssldh1024keyexchangesrate;
	}

	/**
	* <pre>
	* Number of bytes encrypted in software.
	* </pre>
	*/
	public Long get_sslencswrate() throws Exception {
		return this.sslencswrate;
	}

	/**
	* <pre>
	* Number of MD5 hashes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotmd5mac() throws Exception {
		return this.ssltotmd5mac;
	}

	/**
	* <pre>
	* Number of back-end null authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotnullauthorizations() throws Exception {
		return this.sslbetotnullauthorizations;
	}

	/**
	* <pre>
	* Number of bytes encrypted in hardware on the front end.
	* </pre>
	*/
	public Long get_sslhwencferate() throws Exception {
		return this.sslhwencferate;
	}

	/**
	* <pre>
	* Number of back-end SSL session multiplex attempts on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbesessionmultiplexattemptsrate() throws Exception {
		return this.sslbesessionmultiplexattemptsrate;
	}

	/**
	* <pre>
	* Number of handshakes on SSLv2 on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsslv2handshakesrate() throws Exception {
		return this.sslsslv2handshakesrate;
	}

	/**
	* <pre>
	* Number of back-end SSL session multiplex failures on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbesessionmultiplexattemptfailsrate() throws Exception {
		return this.sslbesessionmultiplexattemptfailsrate;
	}

	/**
	* <pre>
	* Number of back-end IDEA 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe128bitideaciphersrate() throws Exception {
		return this.sslbe128bitideaciphersrate;
	}

	/**
	* <pre>
	* Number of DH key exchanges offloaded to the cryptography card.d
	* </pre>
	*/
	public Long get_ssltotoffloaddhkeyexchanges() throws Exception {
		return this.ssltotoffloaddhkeyexchanges;
	}

	/**
	* <pre>
	* Total number of times DSS authorization is used on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssldssauthorizationsrate() throws Exception {
		return this.ssldssauthorizationsrate;
	}

	/**
	* <pre>
	* Number of client authentications done on TLSv1.
	* </pre>
	*/
	public Long get_ssltlsv1clientauthenticationsrate() throws Exception {
		return this.ssltlsv1clientauthenticationsrate;
	}

	/**
	* <pre>
	* Number of back-end SSL sessions reused on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbemaxmultiplexedsessionsrate() throws Exception {
		return this.sslbemaxmultiplexedsessionsrate;
	}

	/**
	* <pre>
	* Number of RC4 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot56bitrc4ciphers() throws Exception {
		return this.ssltot56bitrc4ciphers;
	}

	/**
	* <pre>
	* Number of back-end RC2 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe40bitrc2ciphersrate() throws Exception {
		return this.sslbe40bitrc2ciphersrate;
	}

	/**
	* <pre>
	* Number of bytes encrypted in hardware.
	* </pre>
	*/
	public Long get_sslenchwrate() throws Exception {
		return this.sslenchwrate;
	}

	/**
	* <pre>
	* Number of back-end SSL session renegotiations on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbkendsessionrenegotiaterate() throws Exception {
		return this.sslbkendsessionrenegotiaterate;
	}

	/**
	* <pre>
	* Number of back-end RSA 512-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotrsa512keyexchanges() throws Exception {
		return this.sslbetotrsa512keyexchanges;
	}

	/**
	* <pre>
	* Number of back-end TLSv1 handshakes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetlsv1handshakesrate() throws Exception {
		return this.sslbetlsv1handshakesrate;
	}

	/**
	* <pre>
	* Number of SSL session renegotiations done on TLSv1.
	* </pre>
	*/
	public Long get_ssltlsv1renegsessionsrate() throws Exception {
		return this.ssltlsv1renegsessionsrate;
	}

	/**
	* <pre>
	* Number of handshakes on SSLv3 on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsslv3handshakes() throws Exception {
		return this.ssltotsslv3handshakes;
	}

	/**
	* <pre>
	* Number of back-end null cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbenullciphersrate() throws Exception {
		return this.sslbenullciphersrate;
	}

	/**
	* <pre>
	* Number of DES 168-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot168bit3desciphers() throws Exception {
		return this.ssltot168bit3desciphers;
	}

	/**
	* <pre>
	* Number of SSL sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsessionsrate() throws Exception {
		return this.sslsessionsrate;
	}

	/**
	* <pre>
	* Number of RC4 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl56bitrc4ciphersrate() throws Exception {
		return this.ssl56bitrc4ciphersrate;
	}

	/**
	* <pre>
	* Number of SSL handshakes on TLSv1 on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltottlsv1handshakes() throws Exception {
		return this.ssltottlsv1handshakes;
	}

	/**
	* <pre>
	* Number of bytes decrypted on the back end.
	* </pre>
	*/
	public Long get_ssldecberate() throws Exception {
		return this.ssldecberate;
	}

	/**
	* <pre>
	* Number of back-end DSS authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbedssauthorizationsrate() throws Exception {
		return this.sslbedssauthorizationsrate;
	}

	/**
	* <pre>
	* Number of back-end DES 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot56bitdesciphers() throws Exception {
		return this.sslbetot56bitdesciphers;
	}

	/**
	* <pre>
	* Number of back-end RC2 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe128bitrc2ciphersrate() throws Exception {
		return this.sslbe128bitrc2ciphersrate;
	}

	/**
	* <pre>
	* Number of DES 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot56bitdesciphers() throws Exception {
		return this.ssltot56bitdesciphers;
	}

	/**
	* <pre>
	* Number of RSA 2048-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslrsa2048keyexchangesrate() throws Exception {
		return this.sslrsa2048keyexchangesrate;
	}

	/**
	* <pre>
	* Number of SSL session reuse hits on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsessionhits() throws Exception {
		return this.ssltotsessionhits;
	}

	/**
	* <pre>
	* Number of DES 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl40bitdesciphersrate() throws Exception {
		return this.ssl40bitdesciphersrate;
	}

	/**
	* <pre>
	* Number of bytes encrypted on the front end.
	* </pre>
	*/
	public Long get_ssltotencfe() throws Exception {
		return this.ssltotencfe;
	}

	/**
	* <pre>
	* Number of RC4 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl40bitrc4ciphersrate() throws Exception {
		return this.ssl40bitrc4ciphersrate;
	}

	/**
	* <pre>
	* Number of back-end RC4 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe56bitrc4ciphersrate() throws Exception {
		return this.sslbe56bitrc4ciphersrate;
	}

	/**
	* <pre>
	* Number of back-end TLSv1 session renegotiations on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbkendtlsvlrenegorate() throws Exception {
		return this.sslbkendtlsvlrenegorate;
	}

	/**
	* <pre>
	* Number of bytes decrypted on the front end.
	* </pre>
	*/
	public Long get_ssldecferate() throws Exception {
		return this.ssldecferate;
	}

	/**
	* <pre>
	* Number of back-end null authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbenullauthorizationsrate() throws Exception {
		return this.sslbenullauthorizationsrate;
	}

	/**
	* <pre>
	* Number of bytes encrypted in hardware.
	* </pre>
	*/
	public Long get_ssltotenchw() throws Exception {
		return this.ssltotenchw;
	}

	/**
	* <pre>
	* Number of RSA 2048-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotrsa2048keyexchanges() throws Exception {
		return this.ssltotrsa2048keyexchanges;
	}

	/**
	* <pre>
	* Number of back-end SSL session multiplex failures on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotsessionmultiplexattemptfails() throws Exception {
		return this.sslbetotsessionmultiplexattemptfails;
	}

	/**
	* <pre>
	* Number of DES encryptions offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssltotoffloadbulkdes() throws Exception {
		return this.ssltotoffloadbulkdes;
	}

	/**
	* <pre>
	* Number of Null cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotnullciphers() throws Exception {
		return this.ssltotnullciphers;
	}

	/**
	* <pre>
	* Number of Diffie-Helman 512-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotdh512keyexchanges() throws Exception {
		return this.ssltotdh512keyexchanges;
	}

	/**
	* <pre>
	* Number of TLSv1 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltlsv1sessionsrate() throws Exception {
		return this.ssltlsv1sessionsrate;
	}

	/**
	* <pre>
	* Number of bytes decrypted in hardware on the back end.
	* </pre>
	*/
	public Long get_ssltothwdecbe() throws Exception {
		return this.ssltothwdecbe;
	}

	/**
	* <pre>
	* Number of bytes encrypted on the back end.
	* </pre>
	*/
	public Long get_ssltotencbe() throws Exception {
		return this.ssltotencbe;
	}

	/**
	* <pre>
	* Number of RSA sign operations offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssltotoffloadsignrsa() throws Exception {
		return this.ssltotoffloadsignrsa;
	}

	/**
	* <pre>
	* Number of bytes encrypted in software on the front end.
	* </pre>
	*/
	public Long get_sslswencferate() throws Exception {
		return this.sslswencferate;
	}

	/**
	* <pre>
	* Number of handshakes on SSLv2 on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsslv2handshakes() throws Exception {
		return this.ssltotsslv2handshakes;
	}

	/**
	* <pre>
	* Number of AES 256-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslcipheraes256rate() throws Exception {
		return this.sslcipheraes256rate;
	}

	/**
	* <pre>
	* Number of back-end SHA hashes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotshamac() throws Exception {
		return this.sslbetotshamac;
	}

	/**
	* <pre>
	* Number of AES 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotcipheraes128() throws Exception {
		return this.ssltotcipheraes128;
	}

	/**
	* <pre>
	* Number of bytes encrypted on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotenc() throws Exception {
		return this.ssltotenc;
	}

	/**
	* <pre>
	* Number of back-end SSLv3 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotsslv3sessions() throws Exception {
		return this.sslbetotsslv3sessions;
	}

	/**
	* <pre>
	* Number of bytes encrypted on the back end.
	* </pre>
	*/
	public Long get_sslencberate() throws Exception {
		return this.sslencberate;
	}

	/**
	* <pre>
	* Number of back-end SSLv3 session renegotiations on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotbkendsslv3renego() throws Exception {
		return this.ssltotbkendsslv3renego;
	}

	/**
	* <pre>
	* Number of RC4 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot128bitrc4ciphers() throws Exception {
		return this.ssltot128bitrc4ciphers;
	}

	/**
	* <pre>
	* Number of back-end DSS authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotdssauthorizations() throws Exception {
		return this.sslbetotdssauthorizations;
	}

	/**
	* <pre>
	* Number of back-end RC4 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot56bitrc4ciphers() throws Exception {
		return this.sslbetot56bitrc4ciphers;
	}

	/**
	* <pre>
	* Number of back-end SSL sessions reused on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbemaxmultiplexedsessions() throws Exception {
		return this.sslbemaxmultiplexedsessions;
	}

	/**
	* <pre>
	* Number of back-end DES 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot40bitdesciphers() throws Exception {
		return this.sslbetot40bitdesciphers;
	}

	/**
	* <pre>
	* Number of session renegotiations done on SSLv3.
	* </pre>
	*/
	public Long get_ssltotsslv3renegsessions() throws Exception {
		return this.ssltotsslv3renegsessions;
	}

	/**
	* <pre>
	* Number of back-end RSA authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbersaauthorizationsrate() throws Exception {
		return this.sslbersaauthorizationsrate;
	}

	/**
	* <pre>
	* Number of SSL sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsessions() throws Exception {
		return this.ssltotsessions;
	}

	/**
	* <pre>
	* Number of RC4 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot40bitrc4ciphers() throws Exception {
		return this.ssltot40bitrc4ciphers;
	}

	/**
	* <pre>
	* Number of SSLv2 transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsslv2transactions() throws Exception {
		return this.ssltotsslv2transactions;
	}

	/**
	* <pre>
	* Number of back-end DH 1024-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbedh1024keyexchangesrate() throws Exception {
		return this.sslbedh1024keyexchangesrate;
	}

	/**
	* <pre>
	* Number of RC4 64-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl64bitrc4ciphersrate() throws Exception {
		return this.ssl64bitrc4ciphersrate;
	}

	/**
	* <pre>
	* Number of new SSL sessions created on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslnewsessionsrate() throws Exception {
		return this.sslnewsessionsrate;
	}

	/**
	* <pre>
	* Status of the SSL card(s). The value should be interpreted in binary form, with each set bit indicates a card as UP.
	* </pre>
	*/
	public Long get_sslcardstatus() throws Exception {
		return this.sslcardstatus;
	}

	/**
	* <pre>
	* Number of back-end IDEA 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot128bitideaciphers() throws Exception {
		return this.sslbetot128bitideaciphers;
	}

	/**
	* <pre>
	* Number of bytes decrypted in hardware.
	* </pre>
	*/
	public Long get_ssltotdechw() throws Exception {
		return this.ssltotdechw;
	}

	/**
	* <pre>
	* Number of SSL transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltransactionsrate() throws Exception {
		return this.ssltransactionsrate;
	}

	/**
	* <pre>
	* Number of client authentications done on SSLv3.
	* </pre>
	*/
	public Long get_sslsslv3clientauthenticationsrate() throws Exception {
		return this.sslsslv3clientauthenticationsrate;
	}

	/**
	* <pre>
	* Number of bytes decrypted in hardware on the front end.
	* </pre>
	*/
	public Long get_sslhwdecferate() throws Exception {
		return this.sslhwdecferate;
	}

	/**
	* <pre>
	* Number of SSL session reuse misses on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsessionmissrate() throws Exception {
		return this.sslsessionmissrate;
	}

	/**
	* <pre>
	* Number of back-end DH authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotdhauthorizations() throws Exception {
		return this.sslbetotdhauthorizations;
	}

	/**
	* <pre>
	* Number of back-end MD5 hashes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbemd5macrate() throws Exception {
		return this.sslbemd5macrate;
	}

	/**
	* <pre>
	* Number of back-end TLSv1 session renegotiations on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotbkendtlsvlrenego() throws Exception {
		return this.ssltotbkendtlsvlrenego;
	}

	/**
	* <pre>
	* Number of back-end SSLv3 handshakes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotsslv3handshakes() throws Exception {
		return this.sslbetotsslv3handshakes;
	}

	/**
	* <pre>
	* Number of back-end MD5 hashes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotmd5mac() throws Exception {
		return this.sslbetotmd5mac;
	}

	/**
	* <pre>
	* Number of back-end TLSv1 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetlsv1sessionsrate() throws Exception {
		return this.sslbetlsv1sessionsrate;
	}

	/**
	* <pre>
	* Number of Diffie-Helman authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssldhauthorizationsrate() throws Exception {
		return this.ssldhauthorizationsrate;
	}

	/**
	* <pre>
	* Number of handshakes on SSLv3 on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsslv3handshakesrate() throws Exception {
		return this.sslsslv3handshakesrate;
	}

	/**
	* <pre>
	* Number of SHA hashes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslshamacrate() throws Exception {
		return this.sslshamacrate;
	}

	/**
	* <pre>
	* Number of back-end SSL session multiplex attempts on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotsessionmultiplexattempts() throws Exception {
		return this.sslbetotsessionmultiplexattempts;
	}

	/**
	* <pre>
	* Total number of times DSS authorization is used on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotdssauthorizations() throws Exception {
		return this.ssltotdssauthorizations;
	}

	/**
	* <pre>
	* Number of bytes decrypted in hardware on the back end.
	* </pre>
	*/
	public Long get_sslhwdecberate() throws Exception {
		return this.sslhwdecberate;
	}

	/**
	* <pre>
	* Number of Null authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslnullauthorizationsrate() throws Exception {
		return this.sslnullauthorizationsrate;
	}

	/**
	* <pre>
	* Number of SHA hashes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotshamac() throws Exception {
		return this.ssltotshamac;
	}

	/**
	* <pre>
	* Number of RSA 4096-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslrsa4096keyexchangesrate() throws Exception {
		return this.sslrsa4096keyexchangesrate;
	}

	/**
	* <pre>
	* Number of back-end RC2 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot128bitrc2ciphers() throws Exception {
		return this.sslbetot128bitrc2ciphers;
	}

	/**
	* <pre>
	* Number of SSLv3 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsslv3sessionsrate() throws Exception {
		return this.sslsslv3sessionsrate;
	}

	/**
	* <pre>
	* Number of bytes decrypted in software on the front end.
	* </pre>
	*/
	public Long get_ssltotswdecfe() throws Exception {
		return this.ssltotswdecfe;
	}

	/**
	* <pre>
	* Number of Diffie-Helman 1024-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotdh1024keyexchanges() throws Exception {
		return this.ssltotdh1024keyexchanges;
	}

	/**
	* <pre>
	* Number of back-end SSL session renegotiations on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotbkendsessionrenegotiate() throws Exception {
		return this.ssltotbkendsessionrenegotiate;
	}

	/**
	* <pre>
	* Number of Null authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotnullauthorizations() throws Exception {
		return this.ssltotnullauthorizations;
	}

	/**
	* <pre>
	* Number of RSA 1024-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotrsa1024keyexchanges() throws Exception {
		return this.ssltotrsa1024keyexchanges;
	}

	/**
	* <pre>
	* Number of SSL session reuse hits on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsessionhitsrate() throws Exception {
		return this.sslsessionhitsrate;
	}

	/**
	* <pre>
	* Number of RSA key exchanges offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssltotoffloadrsakeyexchanges() throws Exception {
		return this.ssltotoffloadrsakeyexchanges;
	}

	/**
	* <pre>
	* Number of session renegotiations done on SSLv3.
	* </pre>
	*/
	public Long get_sslsslv3renegsessionsrate() throws Exception {
		return this.sslsslv3renegsessionsrate;
	}

	/**
	* <pre>
	* Number of bytes decrypted in hardware.
	* </pre>
	*/
	public Long get_ssldechwrate() throws Exception {
		return this.ssldechwrate;
	}

	/**
	* <pre>
	* Number of back-end DH authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbedhauthorizationsrate() throws Exception {
		return this.sslbedhauthorizationsrate;
	}

	/**
	* <pre>
	* Number of MD5 hashes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslmd5macrate() throws Exception {
		return this.sslmd5macrate;
	}

	/**
	* <pre>
	* Number of bytes decrypted in software on the front end.
	* </pre>
	*/
	public Long get_sslswdecferate() throws Exception {
		return this.sslswdecferate;
	}

	/**
	* <pre>
	* Number of client authentications done on SSLv3.
	* </pre>
	*/
	public Long get_ssltotsslv3clientauthentications() throws Exception {
		return this.ssltotsslv3clientauthentications;
	}

	/**
	* <pre>
	* Number of bytes decrypted on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssldecrate() throws Exception {
		return this.ssldecrate;
	}

	/**
	* <pre>
	* Number of Diffie-Helman 2048-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssldh2048keyexchangesrate() throws Exception {
		return this.ssldh2048keyexchangesrate;
	}

	/**
	* <pre>
	* Number of bytes encrypted in hardware on the back end.
	* </pre>
	*/
	public Long get_sslhwencberate() throws Exception {
		return this.sslhwencberate;
	}

	/**
	* <pre>
	* Number of SSL crypto cards present on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslcards() throws Exception {
		return this.sslcards;
	}

	/**
	* <pre>
	* Number of back-end SSLv3 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbesslv3sessionsrate() throws Exception {
		return this.sslbesslv3sessionsrate;
	}

	/**
	* <pre>
	* Number of back-end RC4 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot128bitrc4ciphers() throws Exception {
		return this.sslbetot128bitrc4ciphers;
	}

	/**
	* <pre>
	* Number of Null cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslnullciphersrate() throws Exception {
		return this.sslnullciphersrate;
	}

	/**
	* <pre>
	* Number of RC2 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl40bitrc2ciphersrate() throws Exception {
		return this.ssl40bitrc2ciphersrate;
	}

	/**
	* <pre>
	* Number of back-end DES 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe40bitdesciphersrate() throws Exception {
		return this.sslbe40bitdesciphersrate;
	}

	/**
	* <pre>
	* Number of back-end DH 1024-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotdh1024keyexchanges() throws Exception {
		return this.sslbetotdh1024keyexchanges;
	}

	/**
	* <pre>
	* Number of SSL handshakes on TLSv1 on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltlsv1handshakesrate() throws Exception {
		return this.ssltlsv1handshakesrate;
	}

	/**
	* <pre>
	* Number of Diffie-Helman 2048-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotdh2048keyexchanges() throws Exception {
		return this.ssltotdh2048keyexchanges;
	}

	/**
	* <pre>
	* Number of back-end SSL session multiplex successes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotsessionmultiplexattemptsuccess() throws Exception {
		return this.sslbetotsessionmultiplexattemptsuccess;
	}

	/**
	* <pre>
	* Number of SSLv3 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsslv3sessions() throws Exception {
		return this.ssltotsslv3sessions;
	}

	/**
	* <pre>
	* Number of bytes decrypted in software on back-end
	* </pre>
	*/
	public Long get_ssltotswdecbe() throws Exception {
		return this.ssltotswdecbe;
	}

	/**
	* <pre>
	* Number of new SSL sessions created on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotnewsessions() throws Exception {
		return this.ssltotnewsessions;
	}

	/**
	* <pre>
	* Number of RSA key exchanges offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssloffloadrsakeyexchangesrate() throws Exception {
		return this.ssloffloadrsakeyexchangesrate;
	}

	/**
	* <pre>
	* Number of back-end DH 2048-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotdh2048keyexchanges() throws Exception {
		return this.sslbetotdh2048keyexchanges;
	}

	/**
	* <pre>
	* Number of RC2 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot128bitrc2ciphers() throws Exception {
		return this.ssltot128bitrc2ciphers;
	}

	/**
	* <pre>
	* Number of TLSv1 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltottlsv1sessions() throws Exception {
		return this.ssltottlsv1sessions;
	}

	/**
	* <pre>
	* Number of back-end RC4 64-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe64bitrc4ciphersrate() throws Exception {
		return this.sslbe64bitrc4ciphersrate;
	}

	/**
	* <pre>
	* Number of back-end RSA 1024-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotrsa1024keyexchanges() throws Exception {
		return this.sslbetotrsa1024keyexchanges;
	}

	/**
	* <pre>
	* Number of back-end SSL session multiplex successes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbesessionmultiplexattemptsuccessrate() throws Exception {
		return this.sslbesessionmultiplexattemptsuccessrate;
	}

	/**
	* <pre>
	* Number of back-end RC4 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe40bitrc4ciphersrate() throws Exception {
		return this.sslbe40bitrc4ciphersrate;
	}

	/**
	* <pre>
	* Number of back-end TLSv1 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetottlsv1sessions() throws Exception {
		return this.sslbetottlsv1sessions;
	}

	/**
	* <pre>
	* Number of back-end RSA 1024-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbersa1024keyexchangesrate() throws Exception {
		return this.sslbersa1024keyexchangesrate;
	}

	/**
	* <pre>
	* Number of AES encryptions offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssltotoffloadbulkaes() throws Exception {
		return this.ssltotoffloadbulkaes;
	}

	/**
	* <pre>
	* Back-end AES 256-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotbkendcipheraes256() throws Exception {
		return this.ssltotbkendcipheraes256;
	}

	/**
	* <pre>
	* State of the SSL Engine (1=UP/0=DOWN). This state is decided based on SSL Feature/License status and minimum number of cards UP.
	* </pre>
	*/
	public Long get_sslenginestatus() throws Exception {
		return this.sslenginestatus;
	}

	/**
	* <pre>
	* Number of back-end 3DES 168-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetot168bit3desciphers() throws Exception {
		return this.sslbetot168bit3desciphers;
	}

	/**
	* <pre>
	* Number of bytes encrypted in software on the back end.
	* </pre>
	*/
	public Long get_ssltotswencbe() throws Exception {
		return this.ssltotswencbe;
	}

	/**
	* <pre>
	* Number of SSL session renegotiations on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotrenegsessions() throws Exception {
		return this.ssltotrenegsessions;
	}

	/**
	* <pre>
	* Number of back-end RSA 512-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbersa512keyexchangesrate() throws Exception {
		return this.sslbersa512keyexchangesrate;
	}

	/**
	* <pre>
	* Number of TLSv1 transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltlsv1transactionsrate() throws Exception {
		return this.ssltlsv1transactionsrate;
	}

	/**
	* <pre>
	* Number of back-end DES 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbe56bitdesciphersrate() throws Exception {
		return this.sslbe56bitdesciphersrate;
	}

	/**
	* <pre>
	* Number of back-end SSLv3 session renegotiations on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbkendsslv3renegorate() throws Exception {
		return this.sslbkendsslv3renegorate;
	}

	/**
	* <pre>
	* Total number of SSLv3 transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsslv3transactionsrate() throws Exception {
		return this.sslsslv3transactionsrate;
	}

	/**
	* <pre>
	* Number of client authentications done on SSLv2.
	* </pre>
	*/
	public Long get_sslsslv2clientauthenticationsrate() throws Exception {
		return this.sslsslv2clientauthenticationsrate;
	}

	/**
	* <pre>
	* Number of back-end RSA 2048-bit key exchanges on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbetotrsa2048keyexchanges() throws Exception {
		return this.sslbetotrsa2048keyexchanges;
	}

	/**
	* <pre>
	* Number of RC2 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl56bitrc2ciphersrate() throws Exception {
		return this.ssl56bitrc2ciphersrate;
	}

	/**
	* <pre>
	* Number of DH key exchanges offloaded to the cryptography card.d
	* </pre>
	*/
	public Long get_ssloffloaddhkeyexchangesrate() throws Exception {
		return this.ssloffloaddhkeyexchangesrate;
	}

	/**
	* <pre>
	* Number of RSA authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslrsaauthorizationsrate() throws Exception {
		return this.sslrsaauthorizationsrate;
	}

	/**
	* <pre>
	* Number of RC2 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot40bitrc2ciphers() throws Exception {
		return this.ssltot40bitrc2ciphers;
	}

	/**
	* <pre>
	* Number of RC2 56-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot56bitrc2ciphers() throws Exception {
		return this.ssltot56bitrc2ciphers;
	}

	/**
	* <pre>
	* Number of SSLv2 sessions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslsslv2sessionsrate() throws Exception {
		return this.sslsslv2sessionsrate;
	}

	/**
	* <pre>
	* Number of bytes encrypted in software on the back end.
	* </pre>
	*/
	public Long get_sslswencberate() throws Exception {
		return this.sslswencberate;
	}

	/**
	* <pre>
	* Number of RC4 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl128bitrc4ciphersrate() throws Exception {
		return this.ssl128bitrc4ciphersrate;
	}

	/**
	* <pre>
	* Number of bytes encrypted in hardware on the front end.
	* </pre>
	*/
	public Long get_ssltothwencfe() throws Exception {
		return this.ssltothwencfe;
	}

	/**
	* <pre>
	* Number of bytes encrypted on the front end.
	* </pre>
	*/
	public Long get_sslencferate() throws Exception {
		return this.sslencferate;
	}

	/**
	* <pre>
	* Number of RSA sign operations offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssloffloadsignrsarate() throws Exception {
		return this.ssloffloadsignrsarate;
	}

	/**
	* <pre>
	* Number of DES 40-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltot40bitdesciphers() throws Exception {
		return this.ssltot40bitdesciphers;
	}

	/**
	* <pre>
	* Number of back-end SSLv3 client authentications on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbesslv3clientauthenticationsrate() throws Exception {
		return this.sslbesslv3clientauthenticationsrate;
	}

	/**
	* <pre>
	* Number of RC4 encryptions offloaded to the cryptography card.
	* </pre>
	*/
	public Long get_ssltotoffloadbulkrc4() throws Exception {
		return this.ssltotoffloadbulkrc4;
	}

	/**
	* <pre>
	* Number of IDEA 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssl128bitideaciphersrate() throws Exception {
		return this.ssl128bitideaciphersrate;
	}

	/**
	* <pre>
	* Number of back-end SHA hashes on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbeshamacrate() throws Exception {
		return this.sslbeshamacrate;
	}

	/**
	* <pre>
	* Back-end AES 128-bit cipher encryptions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslbkendcipheraes128rate() throws Exception {
		return this.sslbkendcipheraes128rate;
	}

	/**
	* <pre>
	* Number of TLSv1 transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltottlsv1transactions() throws Exception {
		return this.ssltottlsv1transactions;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ssl_stats[] resources = new ssl_stats[1];
		ssl_response result = (ssl_response) service.get_payload_formatter().string_to_resource(ssl_response.class, response);
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
		resources[0] = result.ssl;
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
	* Use this API to fetch the statistics of all ssl_stats resources that are configured on netscaler.
	*/
	public static ssl_stats get(nitro_service service) throws Exception{
		ssl_stats obj = new ssl_stats();
		ssl_stats[] response = (ssl_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all ssl_stats resources that are configured on netscaler.
	*/
	public static ssl_stats get(nitro_service service,  options option) throws Exception{
		ssl_stats obj = new ssl_stats();
		ssl_stats[] response = (ssl_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
