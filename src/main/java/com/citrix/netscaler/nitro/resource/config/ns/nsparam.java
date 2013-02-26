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

class nsparam_response extends base_response
{
	public nsparam nsparam;
}
/**
* Configuration for netscaler parameters resource.
*/

public class nsparam extends base_resource
{
	private Integer[] httpport;
	private Long maxconn;
	private Long maxreq;
	private String cip;
	private String cipheader;
	private String cookieversion;
	private String securecookie;
	private Long pmtumin;
	private Long pmtutimeout;
	private String ftpportrange;
	private String crportrange;
	private String timezone;
	private Long grantquotamaxclient;
	private Long exclusivequotamaxclient;
	private Long grantquotaspillover;
	private Long exclusivequotaspillover;

	/**
	* <pre>
	* The HTTP ports on the Web server. This allows the system to perform connection off-load for any client request that has a destination port matching one of these configured ports.<br> Minimum value =  1
	* </pre>
	*/
	public void set_httpport(Integer[] httpport) throws Exception{
		this.httpport = httpport;
	}

	/**
	* <pre>
	* The HTTP ports on the Web server. This allows the system to perform connection off-load for any client request that has a destination port matching one of these configured ports.<br> Minimum value =  1
	* </pre>
	*/
	public Integer[] get_httpport() throws Exception {
		return this.httpport;
	}

	/**
	* <pre>
	* The maximum number of connections that will be made from the system to the web server(s) attached to it. The value entered here is applied globally to all attached servers.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxconn(long maxconn) throws Exception {
		this.maxconn = new Long(maxconn);
	}

	/**
	* <pre>
	* The maximum number of connections that will be made from the system to the web server(s) attached to it. The value entered here is applied globally to all attached servers.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxconn(Long maxconn) throws Exception{
		this.maxconn = maxconn;
	}

	/**
	* <pre>
	* The maximum number of connections that will be made from the system to the web server(s) attached to it. The value entered here is applied globally to all attached servers.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_maxconn() throws Exception {
		return this.maxconn;
	}

	/**
	* <pre>
	* The maximum number of requests that the system can pass on a particular connection between the system and a server attached to it. Setting this value to 0 allows an unlimited number of requests to be passed.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxreq(long maxreq) throws Exception {
		this.maxreq = new Long(maxreq);
	}

	/**
	* <pre>
	* The maximum number of requests that the system can pass on a particular connection between the system and a server attached to it. Setting this value to 0 allows an unlimited number of requests to be passed.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxreq(Long maxreq) throws Exception{
		this.maxreq = maxreq;
	}

	/**
	* <pre>
	* The maximum number of requests that the system can pass on a particular connection between the system and a server attached to it. Setting this value to 0 allows an unlimited number of requests to be passed.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxreq() throws Exception {
		return this.maxreq;
	}

	/**
	* <pre>
	* The option to control (enable or disable) the insertion of the actual client IP address into the HTTP header request passed from the client to one, some, or all servers attached to the system.
The passed address can then be accessed through a minor modification to the server.
l	If cipHeader is specified, it will be used as the client IP header.
l	If it is not specified, then the value that has been set by the set ns param CLI command will be used as the client IP header.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cip(String cip) throws Exception{
		this.cip = cip;
	}

	/**
	* <pre>
	* The option to control (enable or disable) the insertion of the actual client IP address into the HTTP header request passed from the client to one, some, or all servers attached to the system.
The passed address can then be accessed through a minor modification to the server.
l	If cipHeader is specified, it will be used as the client IP header.
l	If it is not specified, then the value that has been set by the set ns param CLI command will be used as the client IP header.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cip() throws Exception {
		return this.cip;
	}

	/**
	* <pre>
	* The text that will be used as the client IP header.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cipheader(String cipheader) throws Exception{
		this.cipheader = cipheader;
	}

	/**
	* <pre>
	* The text that will be used as the client IP header.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cipheader() throws Exception {
		return this.cipheader;
	}

	/**
	* <pre>
	* The version of the cookie inserted by system.<br> Possible values = 0, 1
	* </pre>
	*/
	public void set_cookieversion(String cookieversion) throws Exception{
		this.cookieversion = cookieversion;
	}

	/**
	* <pre>
	* The version of the cookie inserted by system.<br> Possible values = 0, 1
	* </pre>
	*/
	public String get_cookieversion() throws Exception {
		return this.cookieversion;
	}

	/**
	* <pre>
	* enable/disable secure flag for persistence cookie.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_securecookie(String securecookie) throws Exception{
		this.securecookie = securecookie;
	}

	/**
	* <pre>
	* enable/disable secure flag for persistence cookie.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_securecookie() throws Exception {
		return this.securecookie;
	}

	/**
	* <pre>
	* The minimum Path MTU.<br> Default value: 576<br> Minimum value =  168<br> Maximum value =  1500
	* </pre>
	*/
	public void set_pmtumin(long pmtumin) throws Exception {
		this.pmtumin = new Long(pmtumin);
	}

	/**
	* <pre>
	* The minimum Path MTU.<br> Default value: 576<br> Minimum value =  168<br> Maximum value =  1500
	* </pre>
	*/
	public void set_pmtumin(Long pmtumin) throws Exception{
		this.pmtumin = pmtumin;
	}

	/**
	* <pre>
	* The minimum Path MTU.<br> Default value: 576<br> Minimum value =  168<br> Maximum value =  1500
	* </pre>
	*/
	public Long get_pmtumin() throws Exception {
		return this.pmtumin;
	}

	/**
	* <pre>
	* The timeout value in minutes.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_pmtutimeout(long pmtutimeout) throws Exception {
		this.pmtutimeout = new Long(pmtutimeout);
	}

	/**
	* <pre>
	* The timeout value in minutes.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_pmtutimeout(Long pmtutimeout) throws Exception{
		this.pmtutimeout = pmtutimeout;
	}

	/**
	* <pre>
	* The timeout value in minutes.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_pmtutimeout() throws Exception {
		return this.pmtutimeout;
	}

	/**
	* <pre>
	* Port range configured for FTP services.<br> Minimum length =  1024<br> Maximum length =  64000
	* </pre>
	*/
	public void set_ftpportrange(String ftpportrange) throws Exception{
		this.ftpportrange = ftpportrange;
	}

	/**
	* <pre>
	* Port range configured for FTP services.<br> Minimum length =  1024<br> Maximum length =  64000
	* </pre>
	*/
	public String get_ftpportrange() throws Exception {
		return this.ftpportrange;
	}

	/**
	* <pre>
	* Port range for cache redirection services.<br> Minimum length =  1<br> Maximum length =  65535
	* </pre>
	*/
	public void set_crportrange(String crportrange) throws Exception{
		this.crportrange = crportrange;
	}

	/**
	* <pre>
	* Port range for cache redirection services.<br> Minimum length =  1<br> Maximum length =  65535
	* </pre>
	*/
	public String get_crportrange() throws Exception {
		return this.crportrange;
	}

	/**
	* <pre>
	* Name of the timezone.<br> Possible values = GMT+01:00-CET-Europe/Andorra, GMT+04:00-GST-Asia/Dubai, GMT+04:30-AFT-Asia/Kabul, GMT-04:00-AST-America/Antigua, GMT-04:00-AST-America/Anguilla, GMT+01:00-CET-Europe/Tirane, GMT+04:00-AMT-Asia/Yerevan, GMT+01:00-WAT-Africa/Luanda, GMT+13:00-NZDT-Antarctica/McMurdo, GMT+13:00-NZDT-Antarctica/South_Pole, GMT-03:00-ROTT-Antarctica/Rothera, GMT-04:00-CLT-Antarctica/Palmer, GMT+05:00-MAWT-Antarctica/Mawson, GMT+07:00-DAVT-Antarctica/Davis, GMT+08:00-WST-Antarctica/Casey, GMT+06:00-VOST-Antarctica/Vostok, GMT+10:00-DDUT-Antarctica/DumontDUrville, GMT+03:00-SYOT-Antarctica/Syowa, GMT+11:00-MIST-Antarctica/Macquarie, GMT-03:00-ART-America/Argentina/Buenos_Aires, GMT-03:00-ART-America/Argentina/Cordoba, GMT-03:00-ART-America/Argentina/Salta, GMT-03:00-ART-America/Argentina/Jujuy, GMT-03:00-ART-America/Argentina/Tucuman, GMT-03:00-ART-America/Argentina/Catamarca, GMT-03:00-ART-America/Argentina/La_Rioja, GMT-03:00-ART-America/Argentina/San_Juan, GMT-03:00-ART-America/Argentina/Mendoza, GMT-03:00-WARST-America/Argentina/San_Luis, GMT-03:00-ART-America/Argentina/Rio_Gallegos, GMT-03:00-ART-America/Argentina/Ushuaia, GMT-11:00-SST-Pacific/Pago_Pago, GMT+01:00-CET-Europe/Vienna, GMT+11:00-LHST-Australia/Lord_Howe, GMT+11:00-EST-Australia/Hobart, GMT+11:00-EST-Australia/Currie, GMT+11:00-EST-Australia/Melbourne, GMT+11:00-EST-Australia/Sydney, GMT+10:30-CST-Australia/Broken_Hill, GMT+10:00-EST-Australia/Brisbane, GMT+10:00-EST-Australia/Lindeman, GMT+10:30-CST-Australia/Adelaide, GMT+09:30-CST-Australia/Darwin, GMT+08:00-WST-Australia/Perth, GMT+08:45-CWST-Australia/Eucla, GMT-04:00-AST-America/Aruba, GMT+02:00-EET-Europe/Mariehamn, GMT+04:00-AZT-Asia/Baku, GMT+01:00-CET-Europe/Sarajevo, GMT-04:00-AST-America/Barbados, GMT+06:00-BDT-Asia/Dhaka, GMT+01:00-CET-Europe/Brussels, GMT+00:00-GMT-Africa/Ouagadougou, GMT+02:00-EET-Europe/Sofia, GMT+03:00-AST-Asia/Bahrain, GMT+02:00-CAT-Africa/Bujumbura, GMT+01:00-WAT-Africa/Porto-Novo, GMT-04:00-AST-America/St_Barthelemy, GMT-03:00-ADT-Atlantic/Bermuda, GMT+08:00-BNT-Asia/Brunei, GMT-04:00-BOT-America/La_Paz, GMT-02:00-FNT-America/Noronha, GMT-03:00-BRT-America/Belem, GMT-03:00-BRT-America/Fortaleza, GMT-03:00-BRT-America/Recife, GMT-03:00-BRT-America/Araguaina, GMT-03:00-BRT-America/Maceio, GMT-03:00-BRT-America/Bahia, GMT-03:00-BRT-America/Sao_Paulo, GMT-04:00-AMT-America/Campo_Grande, GMT-04:00-AMT-America/Cuiaba, GMT-03:00-BRT-America/Santarem, GMT-04:00-AMT-America/Porto_Velho, GMT-04:00-AMT-America/Boa_Vista, GMT-04:00-AMT-America/Manaus, GMT-04:00-AMT-America/Eirunepe, GMT-04:00-AMT-America/Rio_Branco, GMT-04:00-EDT-America/Nassau, GMT+06:00-BTT-Asia/Thimphu, GMT+02:00-CAT-Africa/Gaborone, GMT+03:00-FET-Europe/Minsk, GMT-06:00-CST-America/Belize, GMT-02:30-NDT-America/St_Johns, GMT-03:00-ADT-America/Halifax, GMT-03:00-ADT-America/Glace_Bay, GMT-03:00-ADT-America/Moncton, GMT-03:00-ADT-America/Goose_Bay, GMT-04:00-AST-America/Blanc-Sablon, GMT-04:00-EDT-America/Montreal, GMT-04:00-EDT-America/Toronto, GMT-04:00-EDT-America/Nipigon, GMT-04:00-EDT-America/Thunder_Bay, GMT-04:00-EDT-America/Iqaluit, GMT-04:00-EDT-America/Pangnirtung, GMT-05:00-CDT-America/Resolute, GMT-05:00-EST-America/Atikokan, GMT-05:00-CDT-America/Rankin_Inlet, GMT-05:00-CDT-America/Winnipeg, GMT-05:00-CDT-America/Rainy_River, GMT-06:00-CST-America/Regina, GMT-06:00-CST-America/Swift_Current, GMT-06:00-MDT-America/Edmonton, GMT-06:00-MDT-America/Cambridge_Bay, GMT-06:00-MDT-America/Yellowknife, GMT-06:00-MDT-America/Inuvik, GMT-07:00-MST-America/Dawson_Creek, GMT-07:00-PDT-America/Vancouver, GMT-07:00-PDT-America/Whitehorse, GMT-07:00-PDT-America/Dawson, GMT+06:30-CCT-Indian/Cocos, GMT+01:00-WAT-Africa/Kinshasa, GMT+02:00-CAT-Africa/Lubumbashi, GMT+01:00-WAT-Africa/Bangui, GMT+01:00-WAT-Africa/Brazzaville, GMT+01:00-CET-Europe/Zurich, GMT+00:00-GMT-Africa/Abidjan, GMT-10:00-CKT-Pacific/Rarotonga, GMT-04:00-CLT-America/Santiago, GMT-06:00-EAST-Pacific/Easter, GMT+01:00-WAT-Africa/Douala, GMT+08:00-CST-Asia/Shanghai, GMT+08:00-CST-Asia/Harbin, GMT+08:00-CST-Asia/Chongqing, GMT+08:00-CST-Asia/Urumqi, GMT+08:00-CST-Asia/Kashgar, GMT-05:00-COT-America/Bogota, GMT-06:00-CST-America/Costa_Rica, GMT-04:00-CDT-America/Havana, GMT-01:00-CVT-Atlantic/Cape_Verde, GMT+07:00-CXT-Indian/Christmas, GMT+02:00-EET-Asia/Nicosia, GMT+01:00-CET-Europe/Prague, GMT+01:00-CET-Europe/Berlin, GMT+03:00-EAT-Africa/Djibouti, GMT+01:00-CET-Europe/Copenhagen, GMT-04:00-AST-America/Dominica, GMT-04:00-AST-America/Santo_Domingo, GMT+01:00-CET-Africa/Algiers, GMT-05:00-ECT-America/Guayaquil, GMT-06:00-GALT-Pacific/Galapagos, GMT+02:00-EET-Europe/Tallinn, GMT+02:00-EET-Africa/Cairo, GMT+00:00-WET-Africa/El_Aaiun, GMT+03:00-EAT-Africa/Asmara, GMT+01:00-CET-Europe/Madrid, GMT+01:00-CET-Africa/Ceuta, GMT+00:00-WET-Atlantic/Canary, GMT+03:00-EAT-Africa/Addis_Ababa, GMT+02:00-EET-Europe/Helsinki, GMT+12:00-FJT-Pacific/Fiji, GMT-03:00-FKST-Atlantic/Stanley, GMT+10:00-CHUT-Pacific/Chuuk, GMT+11:00-PONT-Pacific/Pohnpei, GMT+11:00-KOST-Pacific/Kosrae, GMT+00:00-WET-Atlantic/Faroe, GMT+01:00-CET-Europe/Paris, GMT+01:00-WAT-Africa/Libreville, GMT+00:00-GMT-Europe/London, GMT-04:00-AST-America/Grenada, GMT+04:00-GET-Asia/Tbilisi, GMT-03:00-GFT-America/Cayenne, GMT+00:00-GMT-Europe/Guernsey, GMT+00:00-GMT-Africa/Accra, GMT+01:00-CET-Europe/Gibraltar, GMT-03:00-WGT-America/Godthab, GMT+00:00-GMT-America/Danmarkshavn, GMT-01:00-EGT-America/Scoresbysund, GMT-03:00-ADT-America/Thule, GMT+00:00-GMT-Africa/Banjul, GMT+00:00-GMT-Africa/Conakry, GMT-04:00-AST-America/Guadeloupe, GMT+01:00-WAT-Africa/Malabo, GMT+02:00-EET-Europe/Athens, GMT-02:00-GST-Atlantic/South_Georgia, GMT-06:00-CST-America/Guatemala, GMT+10:00-ChST-Pacific/Guam, GMT+00:00-GMT-Africa/Bissau, GMT-04:00-GYT-America/Guyana, GMT+08:00-HKT-Asia/Hong_Kong, GMT-06:00-CST-America/Tegucigalpa, GMT+01:00-CET-Europe/Zagreb, GMT-05:00-EST-America/Port-au-Prince, GMT+01:00-CET-Europe/Budapest, GMT+07:00-WIT-Asia/Jakarta, GMT+07:00-WIT-Asia/Pontianak, GMT+08:00-CIT-Asia/Makassar, GMT+09:00-EIT-Asia/Jayapura, GMT+00:00-GMT-Europe/Dublin, GMT+02:00-IST-Asia/Jerusalem, GMT+00:00-GMT-Europe/Isle_of_Man, GMT+05:30-IST-Asia/Kolkata, GMT+06:00-IOT-Indian/Chagos, GMT+03:00-AST-Asia/Baghdad, GMT+03:30-IRST-Asia/Tehran, GMT+00:00-GMT-Atlantic/Reykjavik, GMT+01:00-CET-Europe/Rome, GMT+00:00-GMT-Europe/Jersey, GMT-05:00-EST-America/Jamaica, GMT+02:00-EET-Asia/Amman, GMT+09:00-JST-Asia/Tokyo, GMT+03:00-EAT-Africa/Nairobi, GMT+06:00-KGT-Asia/Bishkek, GMT+07:00-ICT-Asia/Phnom_Penh, GMT+12:00-GILT-Pacific/Tarawa, GMT+13:00-PHOT-Pacific/Enderbury, GMT+14:00-LINT-Pacific/Kiritimati, GMT+03:00-EAT-Indian/Comoro, GMT-04:00-AST-America/St_Kitts, GMT+09:00-KST-Asia/Pyongyang, GMT+09:00-KST-Asia/Seoul, GMT+03:00-AST-Asia/Kuwait, GMT-05:00-EST-America/Cayman, GMT+06:00-ALMT-Asia/Almaty, GMT+06:00-QYZT-Asia/Qyzylorda, GMT+05:00-AQTT-Asia/Aqtobe, GMT+05:00-AQTT-Asia/Aqtau, GMT+05:00-ORAT-Asia/Oral, GMT+07:00-ICT-Asia/Vientiane, GMT+02:00-EET-Asia/Beirut, GMT-04:00-AST-America/St_Lucia, GMT+01:00-CET-Europe/Vaduz, GMT+05:30-IST-Asia/Colombo, GMT+00:00-GMT-Africa/Monrovia, GMT+02:00-SAST-Africa/Maseru, GMT+02:00-EET-Europe/Vilnius, GMT+01:00-CET-Europe/Luxembourg, GMT+02:00-EET-Europe/Riga, GMT+02:00-EET-Africa/Tripoli, GMT+00:00-WET-Africa/Casablanca, GMT+01:00-CET-Europe/Monaco, GMT+02:00-EET-Europe/Chisinau, GMT+01:00-CET-Europe/Podgorica, GMT-04:00-AST-America/Marigot, GMT+03:00-EAT-Indian/Antananarivo, GMT+12:00-MHT-Pacific/Majuro, GMT+12:00-MHT-Pacific/Kwajalein, GMT+01:00-CET-Europe/Skopje, GMT+00:00-GMT-Africa/Bamako, GMT+06:30-MMT-Asia/Rangoon, GMT+08:00-ULAT-Asia/Ulaanbaatar, GMT+07:00-HOVT-Asia/Hovd, GMT+08:00-CHOT-Asia/Choibalsan, GMT+08:00-CST-Asia/Macau, GMT+10:00-ChST-Pacific/Saipan, GMT-04:00-AST-America/Martinique, GMT+00:00-GMT-Africa/Nouakchott, GMT-04:00-AST-America/Montserrat, GMT+01:00-CET-Europe/Malta, GMT+04:00-MUT-Indian/Mauritius, GMT+05:00-MVT-Indian/Maldives, GMT+02:00-CAT-Africa/Blantyre, GMT-06:00-CST-America/Mexico_City, GMT-06:00-CST-America/Cancun, GMT-06:00-CST-America/Merida, GMT-06:00-CST-America/Monterrey, GMT-05:00-CDT-America/Matamoros, GMT-07:00-MST-America/Mazatlan, GMT-07:00-MST-America/Chihuahua, GMT-06:00-MDT-America/Ojinaga, GMT-07:00-MST-America/Hermosillo, GMT-07:00-PDT-America/Tijuana, GMT-08:00-PST-America/Santa_Isabel, GMT-06:00-CST-America/Bahia_Banderas, GMT+08:00-MYT-Asia/Kuala_Lumpur, GMT+08:00-MYT-Asia/Kuching, GMT+02:00-CAT-Africa/Maputo, GMT+02:00-WAST-Africa/Windhoek, GMT+11:00-NCT-Pacific/Noumea, GMT+01:00-WAT-Africa/Niamey, GMT+11:30-NFT-Pacific/Norfolk, GMT+01:00-WAT-Africa/Lagos, GMT-06:00-CST-America/Managua, GMT+01:00-CET-Europe/Amsterdam, GMT+01:00-CET-Europe/Oslo, GMT+05:45-NPT-Asia/Kathmandu, GMT+12:00-NRT-Pacific/Nauru, GMT-11:00-NUT-Pacific/Niue, GMT+13:00-NZDT-Pacific/Auckland, GMT+13:45-CHADT-Pacific/Chatham, GMT+04:00-GST-Asia/Muscat, GMT-05:00-EST-America/Panama, GMT-05:00-PET-America/Lima, GMT-10:00-TAHT-Pacific/Tahiti, GMT-09:30-MART-Pacific/Marquesas, GMT-09:00-GAMT-Pacific/Gambier, GMT+10:00-PGT-Pacific/Port_Moresby, GMT+08:00-PHT-Asia/Manila, GMT+05:00-PKT-Asia/Karachi, GMT+01:00-CET-Europe/Warsaw, GMT-02:00-PMDT-America/Miquelon, GMT-08:00-PST-Pacific/Pitcairn, GMT-04:00-AST-America/Puerto_Rico, GMT+02:00-EET-Asia/Gaza, GMT+02:00-EET-Asia/Hebron, GMT+00:00-WET-Europe/Lisbon, GMT+00:00-WET-Atlantic/Madeira, GMT-01:00-AZOT-Atlantic/Azores, GMT+09:00-PWT-Pacific/Palau, GMT-03:00-PYST-America/Asuncion, GMT+03:00-AST-Asia/Qatar, GMT+04:00-RET-Indian/Reunion, GMT+02:00-EET-Europe/Bucharest, GMT+01:00-CET-Europe/Belgrade, GMT+03:00-FET-Europe/Kaliningrad, GMT+04:00-MSK-Europe/Moscow, GMT+04:00-VOLT-Europe/Volgograd, GMT+04:00-SAMT-Europe/Samara, GMT+06:00-YEKT-Asia/Yekaterinburg, GMT+07:00-OMST-Asia/Omsk, GMT+07:00-NOVT-Asia/Novosibirsk, GMT+07:00-NOVT-Asia/Novokuznetsk, GMT+08:00-KRAT-Asia/Krasnoyarsk, GMT+09:00-IRKT-Asia/Irkutsk, GMT+10:00-YAKT-Asia/Yakutsk, GMT+11:00-VLAT-Asia/Vladivostok, GMT+11:00-SAKT-Asia/Sakhalin, GMT+12:00-MAGT-Asia/Magadan, GMT+12:00-PETT-Asia/Kamchatka, GMT+12:00-ANAT-Asia/Anadyr, GMT+02:00-CAT-Africa/Kigali, GMT+03:00-AST-Asia/Riyadh, GMT+11:00-SBT-Pacific/Guadalcanal, GMT+04:00-SCT-Indian/Mahe, GMT+03:00-EAT-Africa/Khartoum, GMT+01:00-CET-Europe/Stockholm, GMT+08:00-SGT-Asia/Singapore, GMT+00:00-GMT-Atlantic/St_Helena, GMT+01:00-CET-Europe/Ljubljana, GMT+01:00-CET-Arctic/Longyearbyen, GMT+01:00-CET-Europe/Bratislava, GMT+00:00-GMT-Africa/Freetown, GMT+01:00-CET-Europe/San_Marino, GMT+00:00-GMT-Africa/Dakar, GMT+03:00-EAT-Africa/Mogadishu, GMT-03:00-SRT-America/Paramaribo, GMT+00:00-GMT-Africa/Sao_Tome, GMT-06:00-CST-America/El_Salvador, GMT+02:00-EET-Asia/Damascus, GMT+02:00-SAST-Africa/Mbabane, GMT-04:00-EDT-America/Grand_Turk, GMT+01:00-WAT-Africa/Ndjamena, GMT+05:00-TFT-Indian/Kerguelen, GMT+00:00-GMT-Africa/Lome, GMT+07:00-ICT-Asia/Bangkok, GMT+05:00-TJT-Asia/Dushanbe, GMT-10:00-TKT-Pacific/Fakaofo, GMT+09:00-TLT-Asia/Dili, GMT+05:00-TMT-Asia/Ashgabat, GMT+01:00-CET-Africa/Tunis, GMT+13:00-TOT-Pacific/Tongatapu, GMT+02:00-EET-Europe/Istanbul, GMT-04:00-AST-America/Port_of_Spain, GMT+12:00-TVT-Pacific/Funafuti, GMT+08:00-CST-Asia/Taipei, GMT+03:00-EAT-Africa/Dar_es_Salaam, GMT+02:00-EET-Europe/Kiev, GMT+02:00-EET-Europe/Uzhgorod, GMT+02:00-EET-Europe/Zaporozhye, GMT+02:00-EET-Europe/Simferopol, GMT+03:00-EAT-Africa/Kampala, GMT-10:00-HST-Pacific/Johnston, GMT-11:00-SST-Pacific/Midway, GMT+12:00-WAKT-Pacific/Wake, GMT-04:00-EDT-America/New_York, GMT-04:00-EDT-America/Detroit, GMT-04:00-EDT-America/Kentucky/Louisville, GMT-04:00-EDT-America/Kentucky/Monticello, GMT-04:00-EDT-America/Indiana/Indianapolis, GMT-04:00-EDT-America/Indiana/Vincennes, GMT-04:00-EDT-America/Indiana/Winamac, GMT-04:00-EDT-America/Indiana/Marengo, GMT-04:00-EDT-America/Indiana/Petersburg, GMT-04:00-EDT-America/Indiana/Vevay, GMT-05:00-CDT-America/Chicago, GMT-05:00-CDT-America/Indiana/Tell_City, GMT-05:00-CDT-America/Indiana/Knox, GMT-05:00-CDT-America/Menominee, GMT-05:00-CDT-America/North_Dakota/Center, GMT-05:00-CDT-America/North_Dakota/New_Salem, GMT-05:00-CDT-America/North_Dakota/Beulah, GMT-06:00-MDT-America/Denver, GMT-06:00-MDT-America/Boise, GMT-06:00-MDT-America/Shiprock, GMT-07:00-MST-America/Phoenix, GMT-07:00-PDT-America/Los_Angeles, GMT-08:00-AKDT-America/Anchorage, GMT-08:00-AKDT-America/Juneau, GMT-08:00-AKDT-America/Sitka, GMT-08:00-AKDT-America/Yakutat, GMT-08:00-AKDT-America/Nome, GMT-09:00-HADT-America/Adak, GMT-08:00-MeST-America/Metlakatla, GMT-10:00-HST-Pacific/Honolulu, GMT-03:00-UYT-America/Montevideo, GMT+05:00-UZT-Asia/Samarkand, GMT+05:00-UZT-Asia/Tashkent, GMT+01:00-CET-Europe/Vatican, GMT-04:00-AST-America/St_Vincent, GMT-04:30-VET-America/Caracas, GMT-04:00-AST-America/Tortola, GMT-04:00-AST-America/St_Thomas, GMT+07:00-ICT-Asia/Ho_Chi_Minh, GMT+11:00-VUT-Pacific/Efate, GMT+12:00-WFT-Pacific/Wallis, GMT+14:00-WSDT-Pacific/Apia, GMT+03:00-AST-Asia/Aden, GMT+03:00-EAT-Indian/Mayotte, GMT+02:00-SAST-Africa/Johannesburg, GMT+02:00-CAT-Africa/Lusaka, GMT+02:00-CAT-Africa/Harare
	* </pre>
	*/
	public void set_timezone(String timezone) throws Exception{
		this.timezone = timezone;
	}

	/**
	* <pre>
	* Name of the timezone.<br> Possible values = GMT+01:00-CET-Europe/Andorra, GMT+04:00-GST-Asia/Dubai, GMT+04:30-AFT-Asia/Kabul, GMT-04:00-AST-America/Antigua, GMT-04:00-AST-America/Anguilla, GMT+01:00-CET-Europe/Tirane, GMT+04:00-AMT-Asia/Yerevan, GMT+01:00-WAT-Africa/Luanda, GMT+13:00-NZDT-Antarctica/McMurdo, GMT+13:00-NZDT-Antarctica/South_Pole, GMT-03:00-ROTT-Antarctica/Rothera, GMT-04:00-CLT-Antarctica/Palmer, GMT+05:00-MAWT-Antarctica/Mawson, GMT+07:00-DAVT-Antarctica/Davis, GMT+08:00-WST-Antarctica/Casey, GMT+06:00-VOST-Antarctica/Vostok, GMT+10:00-DDUT-Antarctica/DumontDUrville, GMT+03:00-SYOT-Antarctica/Syowa, GMT+11:00-MIST-Antarctica/Macquarie, GMT-03:00-ART-America/Argentina/Buenos_Aires, GMT-03:00-ART-America/Argentina/Cordoba, GMT-03:00-ART-America/Argentina/Salta, GMT-03:00-ART-America/Argentina/Jujuy, GMT-03:00-ART-America/Argentina/Tucuman, GMT-03:00-ART-America/Argentina/Catamarca, GMT-03:00-ART-America/Argentina/La_Rioja, GMT-03:00-ART-America/Argentina/San_Juan, GMT-03:00-ART-America/Argentina/Mendoza, GMT-03:00-WARST-America/Argentina/San_Luis, GMT-03:00-ART-America/Argentina/Rio_Gallegos, GMT-03:00-ART-America/Argentina/Ushuaia, GMT-11:00-SST-Pacific/Pago_Pago, GMT+01:00-CET-Europe/Vienna, GMT+11:00-LHST-Australia/Lord_Howe, GMT+11:00-EST-Australia/Hobart, GMT+11:00-EST-Australia/Currie, GMT+11:00-EST-Australia/Melbourne, GMT+11:00-EST-Australia/Sydney, GMT+10:30-CST-Australia/Broken_Hill, GMT+10:00-EST-Australia/Brisbane, GMT+10:00-EST-Australia/Lindeman, GMT+10:30-CST-Australia/Adelaide, GMT+09:30-CST-Australia/Darwin, GMT+08:00-WST-Australia/Perth, GMT+08:45-CWST-Australia/Eucla, GMT-04:00-AST-America/Aruba, GMT+02:00-EET-Europe/Mariehamn, GMT+04:00-AZT-Asia/Baku, GMT+01:00-CET-Europe/Sarajevo, GMT-04:00-AST-America/Barbados, GMT+06:00-BDT-Asia/Dhaka, GMT+01:00-CET-Europe/Brussels, GMT+00:00-GMT-Africa/Ouagadougou, GMT+02:00-EET-Europe/Sofia, GMT+03:00-AST-Asia/Bahrain, GMT+02:00-CAT-Africa/Bujumbura, GMT+01:00-WAT-Africa/Porto-Novo, GMT-04:00-AST-America/St_Barthelemy, GMT-03:00-ADT-Atlantic/Bermuda, GMT+08:00-BNT-Asia/Brunei, GMT-04:00-BOT-America/La_Paz, GMT-02:00-FNT-America/Noronha, GMT-03:00-BRT-America/Belem, GMT-03:00-BRT-America/Fortaleza, GMT-03:00-BRT-America/Recife, GMT-03:00-BRT-America/Araguaina, GMT-03:00-BRT-America/Maceio, GMT-03:00-BRT-America/Bahia, GMT-03:00-BRT-America/Sao_Paulo, GMT-04:00-AMT-America/Campo_Grande, GMT-04:00-AMT-America/Cuiaba, GMT-03:00-BRT-America/Santarem, GMT-04:00-AMT-America/Porto_Velho, GMT-04:00-AMT-America/Boa_Vista, GMT-04:00-AMT-America/Manaus, GMT-04:00-AMT-America/Eirunepe, GMT-04:00-AMT-America/Rio_Branco, GMT-04:00-EDT-America/Nassau, GMT+06:00-BTT-Asia/Thimphu, GMT+02:00-CAT-Africa/Gaborone, GMT+03:00-FET-Europe/Minsk, GMT-06:00-CST-America/Belize, GMT-02:30-NDT-America/St_Johns, GMT-03:00-ADT-America/Halifax, GMT-03:00-ADT-America/Glace_Bay, GMT-03:00-ADT-America/Moncton, GMT-03:00-ADT-America/Goose_Bay, GMT-04:00-AST-America/Blanc-Sablon, GMT-04:00-EDT-America/Montreal, GMT-04:00-EDT-America/Toronto, GMT-04:00-EDT-America/Nipigon, GMT-04:00-EDT-America/Thunder_Bay, GMT-04:00-EDT-America/Iqaluit, GMT-04:00-EDT-America/Pangnirtung, GMT-05:00-CDT-America/Resolute, GMT-05:00-EST-America/Atikokan, GMT-05:00-CDT-America/Rankin_Inlet, GMT-05:00-CDT-America/Winnipeg, GMT-05:00-CDT-America/Rainy_River, GMT-06:00-CST-America/Regina, GMT-06:00-CST-America/Swift_Current, GMT-06:00-MDT-America/Edmonton, GMT-06:00-MDT-America/Cambridge_Bay, GMT-06:00-MDT-America/Yellowknife, GMT-06:00-MDT-America/Inuvik, GMT-07:00-MST-America/Dawson_Creek, GMT-07:00-PDT-America/Vancouver, GMT-07:00-PDT-America/Whitehorse, GMT-07:00-PDT-America/Dawson, GMT+06:30-CCT-Indian/Cocos, GMT+01:00-WAT-Africa/Kinshasa, GMT+02:00-CAT-Africa/Lubumbashi, GMT+01:00-WAT-Africa/Bangui, GMT+01:00-WAT-Africa/Brazzaville, GMT+01:00-CET-Europe/Zurich, GMT+00:00-GMT-Africa/Abidjan, GMT-10:00-CKT-Pacific/Rarotonga, GMT-04:00-CLT-America/Santiago, GMT-06:00-EAST-Pacific/Easter, GMT+01:00-WAT-Africa/Douala, GMT+08:00-CST-Asia/Shanghai, GMT+08:00-CST-Asia/Harbin, GMT+08:00-CST-Asia/Chongqing, GMT+08:00-CST-Asia/Urumqi, GMT+08:00-CST-Asia/Kashgar, GMT-05:00-COT-America/Bogota, GMT-06:00-CST-America/Costa_Rica, GMT-04:00-CDT-America/Havana, GMT-01:00-CVT-Atlantic/Cape_Verde, GMT+07:00-CXT-Indian/Christmas, GMT+02:00-EET-Asia/Nicosia, GMT+01:00-CET-Europe/Prague, GMT+01:00-CET-Europe/Berlin, GMT+03:00-EAT-Africa/Djibouti, GMT+01:00-CET-Europe/Copenhagen, GMT-04:00-AST-America/Dominica, GMT-04:00-AST-America/Santo_Domingo, GMT+01:00-CET-Africa/Algiers, GMT-05:00-ECT-America/Guayaquil, GMT-06:00-GALT-Pacific/Galapagos, GMT+02:00-EET-Europe/Tallinn, GMT+02:00-EET-Africa/Cairo, GMT+00:00-WET-Africa/El_Aaiun, GMT+03:00-EAT-Africa/Asmara, GMT+01:00-CET-Europe/Madrid, GMT+01:00-CET-Africa/Ceuta, GMT+00:00-WET-Atlantic/Canary, GMT+03:00-EAT-Africa/Addis_Ababa, GMT+02:00-EET-Europe/Helsinki, GMT+12:00-FJT-Pacific/Fiji, GMT-03:00-FKST-Atlantic/Stanley, GMT+10:00-CHUT-Pacific/Chuuk, GMT+11:00-PONT-Pacific/Pohnpei, GMT+11:00-KOST-Pacific/Kosrae, GMT+00:00-WET-Atlantic/Faroe, GMT+01:00-CET-Europe/Paris, GMT+01:00-WAT-Africa/Libreville, GMT+00:00-GMT-Europe/London, GMT-04:00-AST-America/Grenada, GMT+04:00-GET-Asia/Tbilisi, GMT-03:00-GFT-America/Cayenne, GMT+00:00-GMT-Europe/Guernsey, GMT+00:00-GMT-Africa/Accra, GMT+01:00-CET-Europe/Gibraltar, GMT-03:00-WGT-America/Godthab, GMT+00:00-GMT-America/Danmarkshavn, GMT-01:00-EGT-America/Scoresbysund, GMT-03:00-ADT-America/Thule, GMT+00:00-GMT-Africa/Banjul, GMT+00:00-GMT-Africa/Conakry, GMT-04:00-AST-America/Guadeloupe, GMT+01:00-WAT-Africa/Malabo, GMT+02:00-EET-Europe/Athens, GMT-02:00-GST-Atlantic/South_Georgia, GMT-06:00-CST-America/Guatemala, GMT+10:00-ChST-Pacific/Guam, GMT+00:00-GMT-Africa/Bissau, GMT-04:00-GYT-America/Guyana, GMT+08:00-HKT-Asia/Hong_Kong, GMT-06:00-CST-America/Tegucigalpa, GMT+01:00-CET-Europe/Zagreb, GMT-05:00-EST-America/Port-au-Prince, GMT+01:00-CET-Europe/Budapest, GMT+07:00-WIT-Asia/Jakarta, GMT+07:00-WIT-Asia/Pontianak, GMT+08:00-CIT-Asia/Makassar, GMT+09:00-EIT-Asia/Jayapura, GMT+00:00-GMT-Europe/Dublin, GMT+02:00-IST-Asia/Jerusalem, GMT+00:00-GMT-Europe/Isle_of_Man, GMT+05:30-IST-Asia/Kolkata, GMT+06:00-IOT-Indian/Chagos, GMT+03:00-AST-Asia/Baghdad, GMT+03:30-IRST-Asia/Tehran, GMT+00:00-GMT-Atlantic/Reykjavik, GMT+01:00-CET-Europe/Rome, GMT+00:00-GMT-Europe/Jersey, GMT-05:00-EST-America/Jamaica, GMT+02:00-EET-Asia/Amman, GMT+09:00-JST-Asia/Tokyo, GMT+03:00-EAT-Africa/Nairobi, GMT+06:00-KGT-Asia/Bishkek, GMT+07:00-ICT-Asia/Phnom_Penh, GMT+12:00-GILT-Pacific/Tarawa, GMT+13:00-PHOT-Pacific/Enderbury, GMT+14:00-LINT-Pacific/Kiritimati, GMT+03:00-EAT-Indian/Comoro, GMT-04:00-AST-America/St_Kitts, GMT+09:00-KST-Asia/Pyongyang, GMT+09:00-KST-Asia/Seoul, GMT+03:00-AST-Asia/Kuwait, GMT-05:00-EST-America/Cayman, GMT+06:00-ALMT-Asia/Almaty, GMT+06:00-QYZT-Asia/Qyzylorda, GMT+05:00-AQTT-Asia/Aqtobe, GMT+05:00-AQTT-Asia/Aqtau, GMT+05:00-ORAT-Asia/Oral, GMT+07:00-ICT-Asia/Vientiane, GMT+02:00-EET-Asia/Beirut, GMT-04:00-AST-America/St_Lucia, GMT+01:00-CET-Europe/Vaduz, GMT+05:30-IST-Asia/Colombo, GMT+00:00-GMT-Africa/Monrovia, GMT+02:00-SAST-Africa/Maseru, GMT+02:00-EET-Europe/Vilnius, GMT+01:00-CET-Europe/Luxembourg, GMT+02:00-EET-Europe/Riga, GMT+02:00-EET-Africa/Tripoli, GMT+00:00-WET-Africa/Casablanca, GMT+01:00-CET-Europe/Monaco, GMT+02:00-EET-Europe/Chisinau, GMT+01:00-CET-Europe/Podgorica, GMT-04:00-AST-America/Marigot, GMT+03:00-EAT-Indian/Antananarivo, GMT+12:00-MHT-Pacific/Majuro, GMT+12:00-MHT-Pacific/Kwajalein, GMT+01:00-CET-Europe/Skopje, GMT+00:00-GMT-Africa/Bamako, GMT+06:30-MMT-Asia/Rangoon, GMT+08:00-ULAT-Asia/Ulaanbaatar, GMT+07:00-HOVT-Asia/Hovd, GMT+08:00-CHOT-Asia/Choibalsan, GMT+08:00-CST-Asia/Macau, GMT+10:00-ChST-Pacific/Saipan, GMT-04:00-AST-America/Martinique, GMT+00:00-GMT-Africa/Nouakchott, GMT-04:00-AST-America/Montserrat, GMT+01:00-CET-Europe/Malta, GMT+04:00-MUT-Indian/Mauritius, GMT+05:00-MVT-Indian/Maldives, GMT+02:00-CAT-Africa/Blantyre, GMT-06:00-CST-America/Mexico_City, GMT-06:00-CST-America/Cancun, GMT-06:00-CST-America/Merida, GMT-06:00-CST-America/Monterrey, GMT-05:00-CDT-America/Matamoros, GMT-07:00-MST-America/Mazatlan, GMT-07:00-MST-America/Chihuahua, GMT-06:00-MDT-America/Ojinaga, GMT-07:00-MST-America/Hermosillo, GMT-07:00-PDT-America/Tijuana, GMT-08:00-PST-America/Santa_Isabel, GMT-06:00-CST-America/Bahia_Banderas, GMT+08:00-MYT-Asia/Kuala_Lumpur, GMT+08:00-MYT-Asia/Kuching, GMT+02:00-CAT-Africa/Maputo, GMT+02:00-WAST-Africa/Windhoek, GMT+11:00-NCT-Pacific/Noumea, GMT+01:00-WAT-Africa/Niamey, GMT+11:30-NFT-Pacific/Norfolk, GMT+01:00-WAT-Africa/Lagos, GMT-06:00-CST-America/Managua, GMT+01:00-CET-Europe/Amsterdam, GMT+01:00-CET-Europe/Oslo, GMT+05:45-NPT-Asia/Kathmandu, GMT+12:00-NRT-Pacific/Nauru, GMT-11:00-NUT-Pacific/Niue, GMT+13:00-NZDT-Pacific/Auckland, GMT+13:45-CHADT-Pacific/Chatham, GMT+04:00-GST-Asia/Muscat, GMT-05:00-EST-America/Panama, GMT-05:00-PET-America/Lima, GMT-10:00-TAHT-Pacific/Tahiti, GMT-09:30-MART-Pacific/Marquesas, GMT-09:00-GAMT-Pacific/Gambier, GMT+10:00-PGT-Pacific/Port_Moresby, GMT+08:00-PHT-Asia/Manila, GMT+05:00-PKT-Asia/Karachi, GMT+01:00-CET-Europe/Warsaw, GMT-02:00-PMDT-America/Miquelon, GMT-08:00-PST-Pacific/Pitcairn, GMT-04:00-AST-America/Puerto_Rico, GMT+02:00-EET-Asia/Gaza, GMT+02:00-EET-Asia/Hebron, GMT+00:00-WET-Europe/Lisbon, GMT+00:00-WET-Atlantic/Madeira, GMT-01:00-AZOT-Atlantic/Azores, GMT+09:00-PWT-Pacific/Palau, GMT-03:00-PYST-America/Asuncion, GMT+03:00-AST-Asia/Qatar, GMT+04:00-RET-Indian/Reunion, GMT+02:00-EET-Europe/Bucharest, GMT+01:00-CET-Europe/Belgrade, GMT+03:00-FET-Europe/Kaliningrad, GMT+04:00-MSK-Europe/Moscow, GMT+04:00-VOLT-Europe/Volgograd, GMT+04:00-SAMT-Europe/Samara, GMT+06:00-YEKT-Asia/Yekaterinburg, GMT+07:00-OMST-Asia/Omsk, GMT+07:00-NOVT-Asia/Novosibirsk, GMT+07:00-NOVT-Asia/Novokuznetsk, GMT+08:00-KRAT-Asia/Krasnoyarsk, GMT+09:00-IRKT-Asia/Irkutsk, GMT+10:00-YAKT-Asia/Yakutsk, GMT+11:00-VLAT-Asia/Vladivostok, GMT+11:00-SAKT-Asia/Sakhalin, GMT+12:00-MAGT-Asia/Magadan, GMT+12:00-PETT-Asia/Kamchatka, GMT+12:00-ANAT-Asia/Anadyr, GMT+02:00-CAT-Africa/Kigali, GMT+03:00-AST-Asia/Riyadh, GMT+11:00-SBT-Pacific/Guadalcanal, GMT+04:00-SCT-Indian/Mahe, GMT+03:00-EAT-Africa/Khartoum, GMT+01:00-CET-Europe/Stockholm, GMT+08:00-SGT-Asia/Singapore, GMT+00:00-GMT-Atlantic/St_Helena, GMT+01:00-CET-Europe/Ljubljana, GMT+01:00-CET-Arctic/Longyearbyen, GMT+01:00-CET-Europe/Bratislava, GMT+00:00-GMT-Africa/Freetown, GMT+01:00-CET-Europe/San_Marino, GMT+00:00-GMT-Africa/Dakar, GMT+03:00-EAT-Africa/Mogadishu, GMT-03:00-SRT-America/Paramaribo, GMT+00:00-GMT-Africa/Sao_Tome, GMT-06:00-CST-America/El_Salvador, GMT+02:00-EET-Asia/Damascus, GMT+02:00-SAST-Africa/Mbabane, GMT-04:00-EDT-America/Grand_Turk, GMT+01:00-WAT-Africa/Ndjamena, GMT+05:00-TFT-Indian/Kerguelen, GMT+00:00-GMT-Africa/Lome, GMT+07:00-ICT-Asia/Bangkok, GMT+05:00-TJT-Asia/Dushanbe, GMT-10:00-TKT-Pacific/Fakaofo, GMT+09:00-TLT-Asia/Dili, GMT+05:00-TMT-Asia/Ashgabat, GMT+01:00-CET-Africa/Tunis, GMT+13:00-TOT-Pacific/Tongatapu, GMT+02:00-EET-Europe/Istanbul, GMT-04:00-AST-America/Port_of_Spain, GMT+12:00-TVT-Pacific/Funafuti, GMT+08:00-CST-Asia/Taipei, GMT+03:00-EAT-Africa/Dar_es_Salaam, GMT+02:00-EET-Europe/Kiev, GMT+02:00-EET-Europe/Uzhgorod, GMT+02:00-EET-Europe/Zaporozhye, GMT+02:00-EET-Europe/Simferopol, GMT+03:00-EAT-Africa/Kampala, GMT-10:00-HST-Pacific/Johnston, GMT-11:00-SST-Pacific/Midway, GMT+12:00-WAKT-Pacific/Wake, GMT-04:00-EDT-America/New_York, GMT-04:00-EDT-America/Detroit, GMT-04:00-EDT-America/Kentucky/Louisville, GMT-04:00-EDT-America/Kentucky/Monticello, GMT-04:00-EDT-America/Indiana/Indianapolis, GMT-04:00-EDT-America/Indiana/Vincennes, GMT-04:00-EDT-America/Indiana/Winamac, GMT-04:00-EDT-America/Indiana/Marengo, GMT-04:00-EDT-America/Indiana/Petersburg, GMT-04:00-EDT-America/Indiana/Vevay, GMT-05:00-CDT-America/Chicago, GMT-05:00-CDT-America/Indiana/Tell_City, GMT-05:00-CDT-America/Indiana/Knox, GMT-05:00-CDT-America/Menominee, GMT-05:00-CDT-America/North_Dakota/Center, GMT-05:00-CDT-America/North_Dakota/New_Salem, GMT-05:00-CDT-America/North_Dakota/Beulah, GMT-06:00-MDT-America/Denver, GMT-06:00-MDT-America/Boise, GMT-06:00-MDT-America/Shiprock, GMT-07:00-MST-America/Phoenix, GMT-07:00-PDT-America/Los_Angeles, GMT-08:00-AKDT-America/Anchorage, GMT-08:00-AKDT-America/Juneau, GMT-08:00-AKDT-America/Sitka, GMT-08:00-AKDT-America/Yakutat, GMT-08:00-AKDT-America/Nome, GMT-09:00-HADT-America/Adak, GMT-08:00-MeST-America/Metlakatla, GMT-10:00-HST-Pacific/Honolulu, GMT-03:00-UYT-America/Montevideo, GMT+05:00-UZT-Asia/Samarkand, GMT+05:00-UZT-Asia/Tashkent, GMT+01:00-CET-Europe/Vatican, GMT-04:00-AST-America/St_Vincent, GMT-04:30-VET-America/Caracas, GMT-04:00-AST-America/Tortola, GMT-04:00-AST-America/St_Thomas, GMT+07:00-ICT-Asia/Ho_Chi_Minh, GMT+11:00-VUT-Pacific/Efate, GMT+12:00-WFT-Pacific/Wallis, GMT+14:00-WSDT-Pacific/Apia, GMT+03:00-AST-Asia/Aden, GMT+03:00-EAT-Indian/Mayotte, GMT+02:00-SAST-Africa/Johannesburg, GMT+02:00-CAT-Africa/Lusaka, GMT+02:00-CAT-Africa/Harare
	* </pre>
	*/
	public String get_timezone() throws Exception {
		return this.timezone;
	}

	/**
	* <pre>
	* The percentage of shared quota to be granted at a time for maxClient.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_grantquotamaxclient(long grantquotamaxclient) throws Exception {
		this.grantquotamaxclient = new Long(grantquotamaxclient);
	}

	/**
	* <pre>
	* The percentage of shared quota to be granted at a time for maxClient.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_grantquotamaxclient(Long grantquotamaxclient) throws Exception{
		this.grantquotamaxclient = grantquotamaxclient;
	}

	/**
	* <pre>
	* The percentage of shared quota to be granted at a time for maxClient.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_grantquotamaxclient() throws Exception {
		return this.grantquotamaxclient;
	}

	/**
	* <pre>
	* The percentage of maxClient to be given to PEs.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_exclusivequotamaxclient(long exclusivequotamaxclient) throws Exception {
		this.exclusivequotamaxclient = new Long(exclusivequotamaxclient);
	}

	/**
	* <pre>
	* The percentage of maxClient to be given to PEs.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_exclusivequotamaxclient(Long exclusivequotamaxclient) throws Exception{
		this.exclusivequotamaxclient = exclusivequotamaxclient;
	}

	/**
	* <pre>
	* The percentage of maxClient to be given to PEs.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_exclusivequotamaxclient() throws Exception {
		return this.exclusivequotamaxclient;
	}

	/**
	* <pre>
	* The percentage of shared quota to be granted at a time for spillover.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_grantquotaspillover(long grantquotaspillover) throws Exception {
		this.grantquotaspillover = new Long(grantquotaspillover);
	}

	/**
	* <pre>
	* The percentage of shared quota to be granted at a time for spillover.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_grantquotaspillover(Long grantquotaspillover) throws Exception{
		this.grantquotaspillover = grantquotaspillover;
	}

	/**
	* <pre>
	* The percentage of shared quota to be granted at a time for spillover.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_grantquotaspillover() throws Exception {
		return this.grantquotaspillover;
	}

	/**
	* <pre>
	* The percentage of max limit to be given to PEs.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_exclusivequotaspillover(long exclusivequotaspillover) throws Exception {
		this.exclusivequotaspillover = new Long(exclusivequotaspillover);
	}

	/**
	* <pre>
	* The percentage of max limit to be given to PEs.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_exclusivequotaspillover(Long exclusivequotaspillover) throws Exception{
		this.exclusivequotaspillover = exclusivequotaspillover;
	}

	/**
	* <pre>
	* The percentage of max limit to be given to PEs.<br> Default value: 80<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_exclusivequotaspillover() throws Exception {
		return this.exclusivequotaspillover;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsparam[] resources = new nsparam[1];
		nsparam_response result = (nsparam_response) service.get_payload_formatter().string_to_resource(nsparam_response.class, response);
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
		resources[0] = result.nsparam;
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
	* Use this API to update nsparam.
	*/
	public static base_response update(nitro_service client, nsparam resource) throws Exception {
		nsparam updateresource = new nsparam();
		updateresource.httpport = resource.httpport;
		updateresource.maxconn = resource.maxconn;
		updateresource.maxreq = resource.maxreq;
		updateresource.cip = resource.cip;
		updateresource.cipheader = resource.cipheader;
		updateresource.cookieversion = resource.cookieversion;
		updateresource.securecookie = resource.securecookie;
		updateresource.pmtumin = resource.pmtumin;
		updateresource.pmtutimeout = resource.pmtutimeout;
		updateresource.ftpportrange = resource.ftpportrange;
		updateresource.crportrange = resource.crportrange;
		updateresource.timezone = resource.timezone;
		updateresource.grantquotamaxclient = resource.grantquotamaxclient;
		updateresource.exclusivequotamaxclient = resource.exclusivequotamaxclient;
		updateresource.grantquotaspillover = resource.grantquotaspillover;
		updateresource.exclusivequotaspillover = resource.exclusivequotaspillover;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nsparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsparam resource, String[] args) throws Exception{
		nsparam unsetresource = new nsparam();
		unsetresource.ftpportrange = resource.ftpportrange;
		unsetresource.crportrange = resource.crportrange;
		unsetresource.timezone = resource.timezone;
		unsetresource.httpport = resource.httpport;
		unsetresource.maxconn = resource.maxconn;
		unsetresource.maxreq = resource.maxreq;
		unsetresource.cip = resource.cip;
		unsetresource.cipheader = resource.cipheader;
		unsetresource.cookieversion = resource.cookieversion;
		unsetresource.securecookie = resource.securecookie;
		unsetresource.pmtumin = resource.pmtumin;
		unsetresource.pmtutimeout = resource.pmtutimeout;
		unsetresource.grantquotamaxclient = resource.grantquotamaxclient;
		unsetresource.exclusivequotamaxclient = resource.exclusivequotamaxclient;
		unsetresource.grantquotaspillover = resource.grantquotaspillover;
		unsetresource.exclusivequotaspillover = resource.exclusivequotaspillover;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nsparam resources that are configured on netscaler.
	*/
	public static nsparam get(nitro_service service) throws Exception{
		nsparam obj = new nsparam();
		nsparam[] response = (nsparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsparam resources that are configured on netscaler.
	*/
	public static nsparam get(nitro_service service,  options option) throws Exception{
		nsparam obj = new nsparam();
		nsparam[] response = (nsparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class timezoneEnum {
		public static final String GMT_01_00_CET_Europe_Andorra = "GMT+01:00-CET-Europe/Andorra";
		public static final String GMT_04_00_GST_Asia_Dubai = "GMT+04:00-GST-Asia/Dubai";
		public static final String GMT_04_30_AFT_Asia_Kabul = "GMT+04:30-AFT-Asia/Kabul";
		public static final String GMT_04_00_AST_America_Antigua = "GMT-04:00-AST-America/Antigua";
		public static final String GMT_04_00_AST_America_Anguilla = "GMT-04:00-AST-America/Anguilla";
		public static final String GMT_01_00_CET_Europe_Tirane = "GMT+01:00-CET-Europe/Tirane";
		public static final String GMT_04_00_AMT_Asia_Yerevan = "GMT+04:00-AMT-Asia/Yerevan";
		public static final String GMT_01_00_WAT_Africa_Luanda = "GMT+01:00-WAT-Africa/Luanda";
		public static final String GMT_13_00_NZDT_Antarctica_McMurdo = "GMT+13:00-NZDT-Antarctica/McMurdo";
		public static final String GMT_13_00_NZDT_Antarctica_South_Pole = "GMT+13:00-NZDT-Antarctica/South_Pole";
		public static final String GMT_03_00_ROTT_Antarctica_Rothera = "GMT-03:00-ROTT-Antarctica/Rothera";
		public static final String GMT_04_00_CLT_Antarctica_Palmer = "GMT-04:00-CLT-Antarctica/Palmer";
		public static final String GMT_05_00_MAWT_Antarctica_Mawson = "GMT+05:00-MAWT-Antarctica/Mawson";
		public static final String GMT_07_00_DAVT_Antarctica_Davis = "GMT+07:00-DAVT-Antarctica/Davis";
		public static final String GMT_08_00_WST_Antarctica_Casey = "GMT+08:00-WST-Antarctica/Casey";
		public static final String GMT_06_00_VOST_Antarctica_Vostok = "GMT+06:00-VOST-Antarctica/Vostok";
		public static final String GMT_10_00_DDUT_Antarctica_DumontDUrville = "GMT+10:00-DDUT-Antarctica/DumontDUrville";
		public static final String GMT_03_00_SYOT_Antarctica_Syowa = "GMT+03:00-SYOT-Antarctica/Syowa";
		public static final String GMT_11_00_MIST_Antarctica_Macquarie = "GMT+11:00-MIST-Antarctica/Macquarie";
		public static final String GMT_03_00_ART_America_Argentina_Buenos_Aires = "GMT-03:00-ART-America/Argentina/Buenos_Aires";
		public static final String GMT_03_00_ART_America_Argentina_Cordoba = "GMT-03:00-ART-America/Argentina/Cordoba";
		public static final String GMT_03_00_ART_America_Argentina_Salta = "GMT-03:00-ART-America/Argentina/Salta";
		public static final String GMT_03_00_ART_America_Argentina_Jujuy = "GMT-03:00-ART-America/Argentina/Jujuy";
		public static final String GMT_03_00_ART_America_Argentina_Tucuman = "GMT-03:00-ART-America/Argentina/Tucuman";
		public static final String GMT_03_00_ART_America_Argentina_Catamarca = "GMT-03:00-ART-America/Argentina/Catamarca";
		public static final String GMT_03_00_ART_America_Argentina_La_Rioja = "GMT-03:00-ART-America/Argentina/La_Rioja";
		public static final String GMT_03_00_ART_America_Argentina_San_Juan = "GMT-03:00-ART-America/Argentina/San_Juan";
		public static final String GMT_03_00_ART_America_Argentina_Mendoza = "GMT-03:00-ART-America/Argentina/Mendoza";
		public static final String GMT_03_00_WARST_America_Argentina_San_Luis = "GMT-03:00-WARST-America/Argentina/San_Luis";
		public static final String GMT_03_00_ART_America_Argentina_Rio_Gallegos = "GMT-03:00-ART-America/Argentina/Rio_Gallegos";
		public static final String GMT_03_00_ART_America_Argentina_Ushuaia = "GMT-03:00-ART-America/Argentina/Ushuaia";
		public static final String GMT_11_00_SST_Pacific_Pago_Pago = "GMT-11:00-SST-Pacific/Pago_Pago";
		public static final String GMT_01_00_CET_Europe_Vienna = "GMT+01:00-CET-Europe/Vienna";
		public static final String GMT_11_00_LHST_Australia_Lord_Howe = "GMT+11:00-LHST-Australia/Lord_Howe";
		public static final String GMT_11_00_EST_Australia_Hobart = "GMT+11:00-EST-Australia/Hobart";
		public static final String GMT_11_00_EST_Australia_Currie = "GMT+11:00-EST-Australia/Currie";
		public static final String GMT_11_00_EST_Australia_Melbourne = "GMT+11:00-EST-Australia/Melbourne";
		public static final String GMT_11_00_EST_Australia_Sydney = "GMT+11:00-EST-Australia/Sydney";
		public static final String GMT_10_30_CST_Australia_Broken_Hill = "GMT+10:30-CST-Australia/Broken_Hill";
		public static final String GMT_10_00_EST_Australia_Brisbane = "GMT+10:00-EST-Australia/Brisbane";
		public static final String GMT_10_00_EST_Australia_Lindeman = "GMT+10:00-EST-Australia/Lindeman";
		public static final String GMT_10_30_CST_Australia_Adelaide = "GMT+10:30-CST-Australia/Adelaide";
		public static final String GMT_09_30_CST_Australia_Darwin = "GMT+09:30-CST-Australia/Darwin";
		public static final String GMT_08_00_WST_Australia_Perth = "GMT+08:00-WST-Australia/Perth";
		public static final String GMT_08_45_CWST_Australia_Eucla = "GMT+08:45-CWST-Australia/Eucla";
		public static final String GMT_04_00_AST_America_Aruba = "GMT-04:00-AST-America/Aruba";
		public static final String GMT_02_00_EET_Europe_Mariehamn = "GMT+02:00-EET-Europe/Mariehamn";
		public static final String GMT_04_00_AZT_Asia_Baku = "GMT+04:00-AZT-Asia/Baku";
		public static final String GMT_01_00_CET_Europe_Sarajevo = "GMT+01:00-CET-Europe/Sarajevo";
		public static final String GMT_04_00_AST_America_Barbados = "GMT-04:00-AST-America/Barbados";
		public static final String GMT_06_00_BDT_Asia_Dhaka = "GMT+06:00-BDT-Asia/Dhaka";
		public static final String GMT_01_00_CET_Europe_Brussels = "GMT+01:00-CET-Europe/Brussels";
		public static final String GMT_00_00_GMT_Africa_Ouagadougou = "GMT+00:00-GMT-Africa/Ouagadougou";
		public static final String GMT_02_00_EET_Europe_Sofia = "GMT+02:00-EET-Europe/Sofia";
		public static final String GMT_03_00_AST_Asia_Bahrain = "GMT+03:00-AST-Asia/Bahrain";
		public static final String GMT_02_00_CAT_Africa_Bujumbura = "GMT+02:00-CAT-Africa/Bujumbura";
		public static final String GMT_01_00_WAT_Africa_Porto_Novo = "GMT+01:00-WAT-Africa/Porto-Novo";
		public static final String GMT_04_00_AST_America_St_Barthelemy = "GMT-04:00-AST-America/St_Barthelemy";
		public static final String GMT_03_00_ADT_Atlantic_Bermuda = "GMT-03:00-ADT-Atlantic/Bermuda";
		public static final String GMT_08_00_BNT_Asia_Brunei = "GMT+08:00-BNT-Asia/Brunei";
		public static final String GMT_04_00_BOT_America_La_Paz = "GMT-04:00-BOT-America/La_Paz";
		public static final String GMT_02_00_FNT_America_Noronha = "GMT-02:00-FNT-America/Noronha";
		public static final String GMT_03_00_BRT_America_Belem = "GMT-03:00-BRT-America/Belem";
		public static final String GMT_03_00_BRT_America_Fortaleza = "GMT-03:00-BRT-America/Fortaleza";
		public static final String GMT_03_00_BRT_America_Recife = "GMT-03:00-BRT-America/Recife";
		public static final String GMT_03_00_BRT_America_Araguaina = "GMT-03:00-BRT-America/Araguaina";
		public static final String GMT_03_00_BRT_America_Maceio = "GMT-03:00-BRT-America/Maceio";
		public static final String GMT_03_00_BRT_America_Bahia = "GMT-03:00-BRT-America/Bahia";
		public static final String GMT_03_00_BRT_America_Sao_Paulo = "GMT-03:00-BRT-America/Sao_Paulo";
		public static final String GMT_04_00_AMT_America_Campo_Grande = "GMT-04:00-AMT-America/Campo_Grande";
		public static final String GMT_04_00_AMT_America_Cuiaba = "GMT-04:00-AMT-America/Cuiaba";
		public static final String GMT_03_00_BRT_America_Santarem = "GMT-03:00-BRT-America/Santarem";
		public static final String GMT_04_00_AMT_America_Porto_Velho = "GMT-04:00-AMT-America/Porto_Velho";
		public static final String GMT_04_00_AMT_America_Boa_Vista = "GMT-04:00-AMT-America/Boa_Vista";
		public static final String GMT_04_00_AMT_America_Manaus = "GMT-04:00-AMT-America/Manaus";
		public static final String GMT_04_00_AMT_America_Eirunepe = "GMT-04:00-AMT-America/Eirunepe";
		public static final String GMT_04_00_AMT_America_Rio_Branco = "GMT-04:00-AMT-America/Rio_Branco";
		public static final String GMT_04_00_EDT_America_Nassau = "GMT-04:00-EDT-America/Nassau";
		public static final String GMT_06_00_BTT_Asia_Thimphu = "GMT+06:00-BTT-Asia/Thimphu";
		public static final String GMT_02_00_CAT_Africa_Gaborone = "GMT+02:00-CAT-Africa/Gaborone";
		public static final String GMT_03_00_FET_Europe_Minsk = "GMT+03:00-FET-Europe/Minsk";
		public static final String GMT_06_00_CST_America_Belize = "GMT-06:00-CST-America/Belize";
		public static final String GMT_02_30_NDT_America_St_Johns = "GMT-02:30-NDT-America/St_Johns";
		public static final String GMT_03_00_ADT_America_Halifax = "GMT-03:00-ADT-America/Halifax";
		public static final String GMT_03_00_ADT_America_Glace_Bay = "GMT-03:00-ADT-America/Glace_Bay";
		public static final String GMT_03_00_ADT_America_Moncton = "GMT-03:00-ADT-America/Moncton";
		public static final String GMT_03_00_ADT_America_Goose_Bay = "GMT-03:00-ADT-America/Goose_Bay";
		public static final String GMT_04_00_AST_America_Blanc_Sablon = "GMT-04:00-AST-America/Blanc-Sablon";
		public static final String GMT_04_00_EDT_America_Montreal = "GMT-04:00-EDT-America/Montreal";
		public static final String GMT_04_00_EDT_America_Toronto = "GMT-04:00-EDT-America/Toronto";
		public static final String GMT_04_00_EDT_America_Nipigon = "GMT-04:00-EDT-America/Nipigon";
		public static final String GMT_04_00_EDT_America_Thunder_Bay = "GMT-04:00-EDT-America/Thunder_Bay";
		public static final String GMT_04_00_EDT_America_Iqaluit = "GMT-04:00-EDT-America/Iqaluit";
		public static final String GMT_04_00_EDT_America_Pangnirtung = "GMT-04:00-EDT-America/Pangnirtung";
		public static final String GMT_05_00_CDT_America_Resolute = "GMT-05:00-CDT-America/Resolute";
		public static final String GMT_05_00_EST_America_Atikokan = "GMT-05:00-EST-America/Atikokan";
		public static final String GMT_05_00_CDT_America_Rankin_Inlet = "GMT-05:00-CDT-America/Rankin_Inlet";
		public static final String GMT_05_00_CDT_America_Winnipeg = "GMT-05:00-CDT-America/Winnipeg";
		public static final String GMT_05_00_CDT_America_Rainy_River = "GMT-05:00-CDT-America/Rainy_River";
		public static final String GMT_06_00_CST_America_Regina = "GMT-06:00-CST-America/Regina";
		public static final String GMT_06_00_CST_America_Swift_Current = "GMT-06:00-CST-America/Swift_Current";
		public static final String GMT_06_00_MDT_America_Edmonton = "GMT-06:00-MDT-America/Edmonton";
		public static final String GMT_06_00_MDT_America_Cambridge_Bay = "GMT-06:00-MDT-America/Cambridge_Bay";
		public static final String GMT_06_00_MDT_America_Yellowknife = "GMT-06:00-MDT-America/Yellowknife";
		public static final String GMT_06_00_MDT_America_Inuvik = "GMT-06:00-MDT-America/Inuvik";
		public static final String GMT_07_00_MST_America_Dawson_Creek = "GMT-07:00-MST-America/Dawson_Creek";
		public static final String GMT_07_00_PDT_America_Vancouver = "GMT-07:00-PDT-America/Vancouver";
		public static final String GMT_07_00_PDT_America_Whitehorse = "GMT-07:00-PDT-America/Whitehorse";
		public static final String GMT_07_00_PDT_America_Dawson = "GMT-07:00-PDT-America/Dawson";
		public static final String GMT_06_30_CCT_Indian_Cocos = "GMT+06:30-CCT-Indian/Cocos";
		public static final String GMT_01_00_WAT_Africa_Kinshasa = "GMT+01:00-WAT-Africa/Kinshasa";
		public static final String GMT_02_00_CAT_Africa_Lubumbashi = "GMT+02:00-CAT-Africa/Lubumbashi";
		public static final String GMT_01_00_WAT_Africa_Bangui = "GMT+01:00-WAT-Africa/Bangui";
		public static final String GMT_01_00_WAT_Africa_Brazzaville = "GMT+01:00-WAT-Africa/Brazzaville";
		public static final String GMT_01_00_CET_Europe_Zurich = "GMT+01:00-CET-Europe/Zurich";
		public static final String GMT_00_00_GMT_Africa_Abidjan = "GMT+00:00-GMT-Africa/Abidjan";
		public static final String GMT_10_00_CKT_Pacific_Rarotonga = "GMT-10:00-CKT-Pacific/Rarotonga";
		public static final String GMT_04_00_CLT_America_Santiago = "GMT-04:00-CLT-America/Santiago";
		public static final String GMT_06_00_EAST_Pacific_Easter = "GMT-06:00-EAST-Pacific/Easter";
		public static final String GMT_01_00_WAT_Africa_Douala = "GMT+01:00-WAT-Africa/Douala";
		public static final String GMT_08_00_CST_Asia_Shanghai = "GMT+08:00-CST-Asia/Shanghai";
		public static final String GMT_08_00_CST_Asia_Harbin = "GMT+08:00-CST-Asia/Harbin";
		public static final String GMT_08_00_CST_Asia_Chongqing = "GMT+08:00-CST-Asia/Chongqing";
		public static final String GMT_08_00_CST_Asia_Urumqi = "GMT+08:00-CST-Asia/Urumqi";
		public static final String GMT_08_00_CST_Asia_Kashgar = "GMT+08:00-CST-Asia/Kashgar";
		public static final String GMT_05_00_COT_America_Bogota = "GMT-05:00-COT-America/Bogota";
		public static final String GMT_06_00_CST_America_Costa_Rica = "GMT-06:00-CST-America/Costa_Rica";
		public static final String GMT_04_00_CDT_America_Havana = "GMT-04:00-CDT-America/Havana";
		public static final String GMT_01_00_CVT_Atlantic_Cape_Verde = "GMT-01:00-CVT-Atlantic/Cape_Verde";
		public static final String GMT_07_00_CXT_Indian_Christmas = "GMT+07:00-CXT-Indian/Christmas";
		public static final String GMT_02_00_EET_Asia_Nicosia = "GMT+02:00-EET-Asia/Nicosia";
		public static final String GMT_01_00_CET_Europe_Prague = "GMT+01:00-CET-Europe/Prague";
		public static final String GMT_01_00_CET_Europe_Berlin = "GMT+01:00-CET-Europe/Berlin";
		public static final String GMT_03_00_EAT_Africa_Djibouti = "GMT+03:00-EAT-Africa/Djibouti";
		public static final String GMT_01_00_CET_Europe_Copenhagen = "GMT+01:00-CET-Europe/Copenhagen";
		public static final String GMT_04_00_AST_America_Dominica = "GMT-04:00-AST-America/Dominica";
		public static final String GMT_04_00_AST_America_Santo_Domingo = "GMT-04:00-AST-America/Santo_Domingo";
		public static final String GMT_01_00_CET_Africa_Algiers = "GMT+01:00-CET-Africa/Algiers";
		public static final String GMT_05_00_ECT_America_Guayaquil = "GMT-05:00-ECT-America/Guayaquil";
		public static final String GMT_06_00_GALT_Pacific_Galapagos = "GMT-06:00-GALT-Pacific/Galapagos";
		public static final String GMT_02_00_EET_Europe_Tallinn = "GMT+02:00-EET-Europe/Tallinn";
		public static final String GMT_02_00_EET_Africa_Cairo = "GMT+02:00-EET-Africa/Cairo";
		public static final String GMT_00_00_WET_Africa_El_Aaiun = "GMT+00:00-WET-Africa/El_Aaiun";
		public static final String GMT_03_00_EAT_Africa_Asmara = "GMT+03:00-EAT-Africa/Asmara";
		public static final String GMT_01_00_CET_Europe_Madrid = "GMT+01:00-CET-Europe/Madrid";
		public static final String GMT_01_00_CET_Africa_Ceuta = "GMT+01:00-CET-Africa/Ceuta";
		public static final String GMT_00_00_WET_Atlantic_Canary = "GMT+00:00-WET-Atlantic/Canary";
		public static final String GMT_03_00_EAT_Africa_Addis_Ababa = "GMT+03:00-EAT-Africa/Addis_Ababa";
		public static final String GMT_02_00_EET_Europe_Helsinki = "GMT+02:00-EET-Europe/Helsinki";
		public static final String GMT_12_00_FJT_Pacific_Fiji = "GMT+12:00-FJT-Pacific/Fiji";
		public static final String GMT_03_00_FKST_Atlantic_Stanley = "GMT-03:00-FKST-Atlantic/Stanley";
		public static final String GMT_10_00_CHUT_Pacific_Chuuk = "GMT+10:00-CHUT-Pacific/Chuuk";
		public static final String GMT_11_00_PONT_Pacific_Pohnpei = "GMT+11:00-PONT-Pacific/Pohnpei";
		public static final String GMT_11_00_KOST_Pacific_Kosrae = "GMT+11:00-KOST-Pacific/Kosrae";
		public static final String GMT_00_00_WET_Atlantic_Faroe = "GMT+00:00-WET-Atlantic/Faroe";
		public static final String GMT_01_00_CET_Europe_Paris = "GMT+01:00-CET-Europe/Paris";
		public static final String GMT_01_00_WAT_Africa_Libreville = "GMT+01:00-WAT-Africa/Libreville";
		public static final String GMT_00_00_GMT_Europe_London = "GMT+00:00-GMT-Europe/London";
		public static final String GMT_04_00_AST_America_Grenada = "GMT-04:00-AST-America/Grenada";
		public static final String GMT_04_00_GET_Asia_Tbilisi = "GMT+04:00-GET-Asia/Tbilisi";
		public static final String GMT_03_00_GFT_America_Cayenne = "GMT-03:00-GFT-America/Cayenne";
		public static final String GMT_00_00_GMT_Europe_Guernsey = "GMT+00:00-GMT-Europe/Guernsey";
		public static final String GMT_00_00_GMT_Africa_Accra = "GMT+00:00-GMT-Africa/Accra";
		public static final String GMT_01_00_CET_Europe_Gibraltar = "GMT+01:00-CET-Europe/Gibraltar";
		public static final String GMT_03_00_WGT_America_Godthab = "GMT-03:00-WGT-America/Godthab";
		public static final String GMT_00_00_GMT_America_Danmarkshavn = "GMT+00:00-GMT-America/Danmarkshavn";
		public static final String GMT_01_00_EGT_America_Scoresbysund = "GMT-01:00-EGT-America/Scoresbysund";
		public static final String GMT_03_00_ADT_America_Thule = "GMT-03:00-ADT-America/Thule";
		public static final String GMT_00_00_GMT_Africa_Banjul = "GMT+00:00-GMT-Africa/Banjul";
		public static final String GMT_00_00_GMT_Africa_Conakry = "GMT+00:00-GMT-Africa/Conakry";
		public static final String GMT_04_00_AST_America_Guadeloupe = "GMT-04:00-AST-America/Guadeloupe";
		public static final String GMT_01_00_WAT_Africa_Malabo = "GMT+01:00-WAT-Africa/Malabo";
		public static final String GMT_02_00_EET_Europe_Athens = "GMT+02:00-EET-Europe/Athens";
		public static final String GMT_02_00_GST_Atlantic_South_Georgia = "GMT-02:00-GST-Atlantic/South_Georgia";
		public static final String GMT_06_00_CST_America_Guatemala = "GMT-06:00-CST-America/Guatemala";
		public static final String GMT_10_00_ChST_Pacific_Guam = "GMT+10:00-ChST-Pacific/Guam";
		public static final String GMT_00_00_GMT_Africa_Bissau = "GMT+00:00-GMT-Africa/Bissau";
		public static final String GMT_04_00_GYT_America_Guyana = "GMT-04:00-GYT-America/Guyana";
		public static final String GMT_08_00_HKT_Asia_Hong_Kong = "GMT+08:00-HKT-Asia/Hong_Kong";
		public static final String GMT_06_00_CST_America_Tegucigalpa = "GMT-06:00-CST-America/Tegucigalpa";
		public static final String GMT_01_00_CET_Europe_Zagreb = "GMT+01:00-CET-Europe/Zagreb";
		public static final String GMT_05_00_EST_America_Port_au_Prince = "GMT-05:00-EST-America/Port-au-Prince";
		public static final String GMT_01_00_CET_Europe_Budapest = "GMT+01:00-CET-Europe/Budapest";
		public static final String GMT_07_00_WIT_Asia_Jakarta = "GMT+07:00-WIT-Asia/Jakarta";
		public static final String GMT_07_00_WIT_Asia_Pontianak = "GMT+07:00-WIT-Asia/Pontianak";
		public static final String GMT_08_00_CIT_Asia_Makassar = "GMT+08:00-CIT-Asia/Makassar";
		public static final String GMT_09_00_EIT_Asia_Jayapura = "GMT+09:00-EIT-Asia/Jayapura";
		public static final String GMT_00_00_GMT_Europe_Dublin = "GMT+00:00-GMT-Europe/Dublin";
		public static final String GMT_02_00_IST_Asia_Jerusalem = "GMT+02:00-IST-Asia/Jerusalem";
		public static final String GMT_00_00_GMT_Europe_Isle_of_Man = "GMT+00:00-GMT-Europe/Isle_of_Man";
		public static final String GMT_05_30_IST_Asia_Kolkata = "GMT+05:30-IST-Asia/Kolkata";
		public static final String GMT_06_00_IOT_Indian_Chagos = "GMT+06:00-IOT-Indian/Chagos";
		public static final String GMT_03_00_AST_Asia_Baghdad = "GMT+03:00-AST-Asia/Baghdad";
		public static final String GMT_03_30_IRST_Asia_Tehran = "GMT+03:30-IRST-Asia/Tehran";
		public static final String GMT_00_00_GMT_Atlantic_Reykjavik = "GMT+00:00-GMT-Atlantic/Reykjavik";
		public static final String GMT_01_00_CET_Europe_Rome = "GMT+01:00-CET-Europe/Rome";
		public static final String GMT_00_00_GMT_Europe_Jersey = "GMT+00:00-GMT-Europe/Jersey";
		public static final String GMT_05_00_EST_America_Jamaica = "GMT-05:00-EST-America/Jamaica";
		public static final String GMT_02_00_EET_Asia_Amman = "GMT+02:00-EET-Asia/Amman";
		public static final String GMT_09_00_JST_Asia_Tokyo = "GMT+09:00-JST-Asia/Tokyo";
		public static final String GMT_03_00_EAT_Africa_Nairobi = "GMT+03:00-EAT-Africa/Nairobi";
		public static final String GMT_06_00_KGT_Asia_Bishkek = "GMT+06:00-KGT-Asia/Bishkek";
		public static final String GMT_07_00_ICT_Asia_Phnom_Penh = "GMT+07:00-ICT-Asia/Phnom_Penh";
		public static final String GMT_12_00_GILT_Pacific_Tarawa = "GMT+12:00-GILT-Pacific/Tarawa";
		public static final String GMT_13_00_PHOT_Pacific_Enderbury = "GMT+13:00-PHOT-Pacific/Enderbury";
		public static final String GMT_14_00_LINT_Pacific_Kiritimati = "GMT+14:00-LINT-Pacific/Kiritimati";
		public static final String GMT_03_00_EAT_Indian_Comoro = "GMT+03:00-EAT-Indian/Comoro";
		public static final String GMT_04_00_AST_America_St_Kitts = "GMT-04:00-AST-America/St_Kitts";
		public static final String GMT_09_00_KST_Asia_Pyongyang = "GMT+09:00-KST-Asia/Pyongyang";
		public static final String GMT_09_00_KST_Asia_Seoul = "GMT+09:00-KST-Asia/Seoul";
		public static final String GMT_03_00_AST_Asia_Kuwait = "GMT+03:00-AST-Asia/Kuwait";
		public static final String GMT_05_00_EST_America_Cayman = "GMT-05:00-EST-America/Cayman";
		public static final String GMT_06_00_ALMT_Asia_Almaty = "GMT+06:00-ALMT-Asia/Almaty";
		public static final String GMT_06_00_QYZT_Asia_Qyzylorda = "GMT+06:00-QYZT-Asia/Qyzylorda";
		public static final String GMT_05_00_AQTT_Asia_Aqtobe = "GMT+05:00-AQTT-Asia/Aqtobe";
		public static final String GMT_05_00_AQTT_Asia_Aqtau = "GMT+05:00-AQTT-Asia/Aqtau";
		public static final String GMT_05_00_ORAT_Asia_Oral = "GMT+05:00-ORAT-Asia/Oral";
		public static final String GMT_07_00_ICT_Asia_Vientiane = "GMT+07:00-ICT-Asia/Vientiane";
		public static final String GMT_02_00_EET_Asia_Beirut = "GMT+02:00-EET-Asia/Beirut";
		public static final String GMT_04_00_AST_America_St_Lucia = "GMT-04:00-AST-America/St_Lucia";
		public static final String GMT_01_00_CET_Europe_Vaduz = "GMT+01:00-CET-Europe/Vaduz";
		public static final String GMT_05_30_IST_Asia_Colombo = "GMT+05:30-IST-Asia/Colombo";
		public static final String GMT_00_00_GMT_Africa_Monrovia = "GMT+00:00-GMT-Africa/Monrovia";
		public static final String GMT_02_00_SAST_Africa_Maseru = "GMT+02:00-SAST-Africa/Maseru";
		public static final String GMT_02_00_EET_Europe_Vilnius = "GMT+02:00-EET-Europe/Vilnius";
		public static final String GMT_01_00_CET_Europe_Luxembourg = "GMT+01:00-CET-Europe/Luxembourg";
		public static final String GMT_02_00_EET_Europe_Riga = "GMT+02:00-EET-Europe/Riga";
		public static final String GMT_02_00_EET_Africa_Tripoli = "GMT+02:00-EET-Africa/Tripoli";
		public static final String GMT_00_00_WET_Africa_Casablanca = "GMT+00:00-WET-Africa/Casablanca";
		public static final String GMT_01_00_CET_Europe_Monaco = "GMT+01:00-CET-Europe/Monaco";
		public static final String GMT_02_00_EET_Europe_Chisinau = "GMT+02:00-EET-Europe/Chisinau";
		public static final String GMT_01_00_CET_Europe_Podgorica = "GMT+01:00-CET-Europe/Podgorica";
		public static final String GMT_04_00_AST_America_Marigot = "GMT-04:00-AST-America/Marigot";
		public static final String GMT_03_00_EAT_Indian_Antananarivo = "GMT+03:00-EAT-Indian/Antananarivo";
		public static final String GMT_12_00_MHT_Pacific_Majuro = "GMT+12:00-MHT-Pacific/Majuro";
		public static final String GMT_12_00_MHT_Pacific_Kwajalein = "GMT+12:00-MHT-Pacific/Kwajalein";
		public static final String GMT_01_00_CET_Europe_Skopje = "GMT+01:00-CET-Europe/Skopje";
		public static final String GMT_00_00_GMT_Africa_Bamako = "GMT+00:00-GMT-Africa/Bamako";
		public static final String GMT_06_30_MMT_Asia_Rangoon = "GMT+06:30-MMT-Asia/Rangoon";
		public static final String GMT_08_00_ULAT_Asia_Ulaanbaatar = "GMT+08:00-ULAT-Asia/Ulaanbaatar";
		public static final String GMT_07_00_HOVT_Asia_Hovd = "GMT+07:00-HOVT-Asia/Hovd";
		public static final String GMT_08_00_CHOT_Asia_Choibalsan = "GMT+08:00-CHOT-Asia/Choibalsan";
		public static final String GMT_08_00_CST_Asia_Macau = "GMT+08:00-CST-Asia/Macau";
		public static final String GMT_10_00_ChST_Pacific_Saipan = "GMT+10:00-ChST-Pacific/Saipan";
		public static final String GMT_04_00_AST_America_Martinique = "GMT-04:00-AST-America/Martinique";
		public static final String GMT_00_00_GMT_Africa_Nouakchott = "GMT+00:00-GMT-Africa/Nouakchott";
		public static final String GMT_04_00_AST_America_Montserrat = "GMT-04:00-AST-America/Montserrat";
		public static final String GMT_01_00_CET_Europe_Malta = "GMT+01:00-CET-Europe/Malta";
		public static final String GMT_04_00_MUT_Indian_Mauritius = "GMT+04:00-MUT-Indian/Mauritius";
		public static final String GMT_05_00_MVT_Indian_Maldives = "GMT+05:00-MVT-Indian/Maldives";
		public static final String GMT_02_00_CAT_Africa_Blantyre = "GMT+02:00-CAT-Africa/Blantyre";
		public static final String GMT_06_00_CST_America_Mexico_City = "GMT-06:00-CST-America/Mexico_City";
		public static final String GMT_06_00_CST_America_Cancun = "GMT-06:00-CST-America/Cancun";
		public static final String GMT_06_00_CST_America_Merida = "GMT-06:00-CST-America/Merida";
		public static final String GMT_06_00_CST_America_Monterrey = "GMT-06:00-CST-America/Monterrey";
		public static final String GMT_05_00_CDT_America_Matamoros = "GMT-05:00-CDT-America/Matamoros";
		public static final String GMT_07_00_MST_America_Mazatlan = "GMT-07:00-MST-America/Mazatlan";
		public static final String GMT_07_00_MST_America_Chihuahua = "GMT-07:00-MST-America/Chihuahua";
		public static final String GMT_06_00_MDT_America_Ojinaga = "GMT-06:00-MDT-America/Ojinaga";
		public static final String GMT_07_00_MST_America_Hermosillo = "GMT-07:00-MST-America/Hermosillo";
		public static final String GMT_07_00_PDT_America_Tijuana = "GMT-07:00-PDT-America/Tijuana";
		public static final String GMT_08_00_PST_America_Santa_Isabel = "GMT-08:00-PST-America/Santa_Isabel";
		public static final String GMT_06_00_CST_America_Bahia_Banderas = "GMT-06:00-CST-America/Bahia_Banderas";
		public static final String GMT_08_00_MYT_Asia_Kuala_Lumpur = "GMT+08:00-MYT-Asia/Kuala_Lumpur";
		public static final String GMT_08_00_MYT_Asia_Kuching = "GMT+08:00-MYT-Asia/Kuching";
		public static final String GMT_02_00_CAT_Africa_Maputo = "GMT+02:00-CAT-Africa/Maputo";
		public static final String GMT_02_00_WAST_Africa_Windhoek = "GMT+02:00-WAST-Africa/Windhoek";
		public static final String GMT_11_00_NCT_Pacific_Noumea = "GMT+11:00-NCT-Pacific/Noumea";
		public static final String GMT_01_00_WAT_Africa_Niamey = "GMT+01:00-WAT-Africa/Niamey";
		public static final String GMT_11_30_NFT_Pacific_Norfolk = "GMT+11:30-NFT-Pacific/Norfolk";
		public static final String GMT_01_00_WAT_Africa_Lagos = "GMT+01:00-WAT-Africa/Lagos";
		public static final String GMT_06_00_CST_America_Managua = "GMT-06:00-CST-America/Managua";
		public static final String GMT_01_00_CET_Europe_Amsterdam = "GMT+01:00-CET-Europe/Amsterdam";
		public static final String GMT_01_00_CET_Europe_Oslo = "GMT+01:00-CET-Europe/Oslo";
		public static final String GMT_05_45_NPT_Asia_Kathmandu = "GMT+05:45-NPT-Asia/Kathmandu";
		public static final String GMT_12_00_NRT_Pacific_Nauru = "GMT+12:00-NRT-Pacific/Nauru";
		public static final String GMT_11_00_NUT_Pacific_Niue = "GMT-11:00-NUT-Pacific/Niue";
		public static final String GMT_13_00_NZDT_Pacific_Auckland = "GMT+13:00-NZDT-Pacific/Auckland";
		public static final String GMT_13_45_CHADT_Pacific_Chatham = "GMT+13:45-CHADT-Pacific/Chatham";
		public static final String GMT_04_00_GST_Asia_Muscat = "GMT+04:00-GST-Asia/Muscat";
		public static final String GMT_05_00_EST_America_Panama = "GMT-05:00-EST-America/Panama";
		public static final String GMT_05_00_PET_America_Lima = "GMT-05:00-PET-America/Lima";
		public static final String GMT_10_00_TAHT_Pacific_Tahiti = "GMT-10:00-TAHT-Pacific/Tahiti";
		public static final String GMT_09_30_MART_Pacific_Marquesas = "GMT-09:30-MART-Pacific/Marquesas";
		public static final String GMT_09_00_GAMT_Pacific_Gambier = "GMT-09:00-GAMT-Pacific/Gambier";
		public static final String GMT_10_00_PGT_Pacific_Port_Moresby = "GMT+10:00-PGT-Pacific/Port_Moresby";
		public static final String GMT_08_00_PHT_Asia_Manila = "GMT+08:00-PHT-Asia/Manila";
		public static final String GMT_05_00_PKT_Asia_Karachi = "GMT+05:00-PKT-Asia/Karachi";
		public static final String GMT_01_00_CET_Europe_Warsaw = "GMT+01:00-CET-Europe/Warsaw";
		public static final String GMT_02_00_PMDT_America_Miquelon = "GMT-02:00-PMDT-America/Miquelon";
		public static final String GMT_08_00_PST_Pacific_Pitcairn = "GMT-08:00-PST-Pacific/Pitcairn";
		public static final String GMT_04_00_AST_America_Puerto_Rico = "GMT-04:00-AST-America/Puerto_Rico";
		public static final String GMT_02_00_EET_Asia_Gaza = "GMT+02:00-EET-Asia/Gaza";
		public static final String GMT_02_00_EET_Asia_Hebron = "GMT+02:00-EET-Asia/Hebron";
		public static final String GMT_00_00_WET_Europe_Lisbon = "GMT+00:00-WET-Europe/Lisbon";
		public static final String GMT_00_00_WET_Atlantic_Madeira = "GMT+00:00-WET-Atlantic/Madeira";
		public static final String GMT_01_00_AZOT_Atlantic_Azores = "GMT-01:00-AZOT-Atlantic/Azores";
		public static final String GMT_09_00_PWT_Pacific_Palau = "GMT+09:00-PWT-Pacific/Palau";
		public static final String GMT_03_00_PYST_America_Asuncion = "GMT-03:00-PYST-America/Asuncion";
		public static final String GMT_03_00_AST_Asia_Qatar = "GMT+03:00-AST-Asia/Qatar";
		public static final String GMT_04_00_RET_Indian_Reunion = "GMT+04:00-RET-Indian/Reunion";
		public static final String GMT_02_00_EET_Europe_Bucharest = "GMT+02:00-EET-Europe/Bucharest";
		public static final String GMT_01_00_CET_Europe_Belgrade = "GMT+01:00-CET-Europe/Belgrade";
		public static final String GMT_03_00_FET_Europe_Kaliningrad = "GMT+03:00-FET-Europe/Kaliningrad";
		public static final String GMT_04_00_MSK_Europe_Moscow = "GMT+04:00-MSK-Europe/Moscow";
		public static final String GMT_04_00_VOLT_Europe_Volgograd = "GMT+04:00-VOLT-Europe/Volgograd";
		public static final String GMT_04_00_SAMT_Europe_Samara = "GMT+04:00-SAMT-Europe/Samara";
		public static final String GMT_06_00_YEKT_Asia_Yekaterinburg = "GMT+06:00-YEKT-Asia/Yekaterinburg";
		public static final String GMT_07_00_OMST_Asia_Omsk = "GMT+07:00-OMST-Asia/Omsk";
		public static final String GMT_07_00_NOVT_Asia_Novosibirsk = "GMT+07:00-NOVT-Asia/Novosibirsk";
		public static final String GMT_07_00_NOVT_Asia_Novokuznetsk = "GMT+07:00-NOVT-Asia/Novokuznetsk";
		public static final String GMT_08_00_KRAT_Asia_Krasnoyarsk = "GMT+08:00-KRAT-Asia/Krasnoyarsk";
		public static final String GMT_09_00_IRKT_Asia_Irkutsk = "GMT+09:00-IRKT-Asia/Irkutsk";
		public static final String GMT_10_00_YAKT_Asia_Yakutsk = "GMT+10:00-YAKT-Asia/Yakutsk";
		public static final String GMT_11_00_VLAT_Asia_Vladivostok = "GMT+11:00-VLAT-Asia/Vladivostok";
		public static final String GMT_11_00_SAKT_Asia_Sakhalin = "GMT+11:00-SAKT-Asia/Sakhalin";
		public static final String GMT_12_00_MAGT_Asia_Magadan = "GMT+12:00-MAGT-Asia/Magadan";
		public static final String GMT_12_00_PETT_Asia_Kamchatka = "GMT+12:00-PETT-Asia/Kamchatka";
		public static final String GMT_12_00_ANAT_Asia_Anadyr = "GMT+12:00-ANAT-Asia/Anadyr";
		public static final String GMT_02_00_CAT_Africa_Kigali = "GMT+02:00-CAT-Africa/Kigali";
		public static final String GMT_03_00_AST_Asia_Riyadh = "GMT+03:00-AST-Asia/Riyadh";
		public static final String GMT_11_00_SBT_Pacific_Guadalcanal = "GMT+11:00-SBT-Pacific/Guadalcanal";
		public static final String GMT_04_00_SCT_Indian_Mahe = "GMT+04:00-SCT-Indian/Mahe";
		public static final String GMT_03_00_EAT_Africa_Khartoum = "GMT+03:00-EAT-Africa/Khartoum";
		public static final String GMT_01_00_CET_Europe_Stockholm = "GMT+01:00-CET-Europe/Stockholm";
		public static final String GMT_08_00_SGT_Asia_Singapore = "GMT+08:00-SGT-Asia/Singapore";
		public static final String GMT_00_00_GMT_Atlantic_St_Helena = "GMT+00:00-GMT-Atlantic/St_Helena";
		public static final String GMT_01_00_CET_Europe_Ljubljana = "GMT+01:00-CET-Europe/Ljubljana";
		public static final String GMT_01_00_CET_Arctic_Longyearbyen = "GMT+01:00-CET-Arctic/Longyearbyen";
		public static final String GMT_01_00_CET_Europe_Bratislava = "GMT+01:00-CET-Europe/Bratislava";
		public static final String GMT_00_00_GMT_Africa_Freetown = "GMT+00:00-GMT-Africa/Freetown";
		public static final String GMT_01_00_CET_Europe_San_Marino = "GMT+01:00-CET-Europe/San_Marino";
		public static final String GMT_00_00_GMT_Africa_Dakar = "GMT+00:00-GMT-Africa/Dakar";
		public static final String GMT_03_00_EAT_Africa_Mogadishu = "GMT+03:00-EAT-Africa/Mogadishu";
		public static final String GMT_03_00_SRT_America_Paramaribo = "GMT-03:00-SRT-America/Paramaribo";
		public static final String GMT_00_00_GMT_Africa_Sao_Tome = "GMT+00:00-GMT-Africa/Sao_Tome";
		public static final String GMT_06_00_CST_America_El_Salvador = "GMT-06:00-CST-America/El_Salvador";
		public static final String GMT_02_00_EET_Asia_Damascus = "GMT+02:00-EET-Asia/Damascus";
		public static final String GMT_02_00_SAST_Africa_Mbabane = "GMT+02:00-SAST-Africa/Mbabane";
		public static final String GMT_04_00_EDT_America_Grand_Turk = "GMT-04:00-EDT-America/Grand_Turk";
		public static final String GMT_01_00_WAT_Africa_Ndjamena = "GMT+01:00-WAT-Africa/Ndjamena";
		public static final String GMT_05_00_TFT_Indian_Kerguelen = "GMT+05:00-TFT-Indian/Kerguelen";
		public static final String GMT_00_00_GMT_Africa_Lome = "GMT+00:00-GMT-Africa/Lome";
		public static final String GMT_07_00_ICT_Asia_Bangkok = "GMT+07:00-ICT-Asia/Bangkok";
		public static final String GMT_05_00_TJT_Asia_Dushanbe = "GMT+05:00-TJT-Asia/Dushanbe";
		public static final String GMT_10_00_TKT_Pacific_Fakaofo = "GMT-10:00-TKT-Pacific/Fakaofo";
		public static final String GMT_09_00_TLT_Asia_Dili = "GMT+09:00-TLT-Asia/Dili";
		public static final String GMT_05_00_TMT_Asia_Ashgabat = "GMT+05:00-TMT-Asia/Ashgabat";
		public static final String GMT_01_00_CET_Africa_Tunis = "GMT+01:00-CET-Africa/Tunis";
		public static final String GMT_13_00_TOT_Pacific_Tongatapu = "GMT+13:00-TOT-Pacific/Tongatapu";
		public static final String GMT_02_00_EET_Europe_Istanbul = "GMT+02:00-EET-Europe/Istanbul";
		public static final String GMT_04_00_AST_America_Port_of_Spain = "GMT-04:00-AST-America/Port_of_Spain";
		public static final String GMT_12_00_TVT_Pacific_Funafuti = "GMT+12:00-TVT-Pacific/Funafuti";
		public static final String GMT_08_00_CST_Asia_Taipei = "GMT+08:00-CST-Asia/Taipei";
		public static final String GMT_03_00_EAT_Africa_Dar_es_Salaam = "GMT+03:00-EAT-Africa/Dar_es_Salaam";
		public static final String GMT_02_00_EET_Europe_Kiev = "GMT+02:00-EET-Europe/Kiev";
		public static final String GMT_02_00_EET_Europe_Uzhgorod = "GMT+02:00-EET-Europe/Uzhgorod";
		public static final String GMT_02_00_EET_Europe_Zaporozhye = "GMT+02:00-EET-Europe/Zaporozhye";
		public static final String GMT_02_00_EET_Europe_Simferopol = "GMT+02:00-EET-Europe/Simferopol";
		public static final String GMT_03_00_EAT_Africa_Kampala = "GMT+03:00-EAT-Africa/Kampala";
		public static final String GMT_10_00_HST_Pacific_Johnston = "GMT-10:00-HST-Pacific/Johnston";
		public static final String GMT_11_00_SST_Pacific_Midway = "GMT-11:00-SST-Pacific/Midway";
		public static final String GMT_12_00_WAKT_Pacific_Wake = "GMT+12:00-WAKT-Pacific/Wake";
		public static final String GMT_04_00_EDT_America_New_York = "GMT-04:00-EDT-America/New_York";
		public static final String GMT_04_00_EDT_America_Detroit = "GMT-04:00-EDT-America/Detroit";
		public static final String GMT_04_00_EDT_America_Kentucky_Louisville = "GMT-04:00-EDT-America/Kentucky/Louisville";
		public static final String GMT_04_00_EDT_America_Kentucky_Monticello = "GMT-04:00-EDT-America/Kentucky/Monticello";
		public static final String GMT_04_00_EDT_America_Indiana_Indianapolis = "GMT-04:00-EDT-America/Indiana/Indianapolis";
		public static final String GMT_04_00_EDT_America_Indiana_Vincennes = "GMT-04:00-EDT-America/Indiana/Vincennes";
		public static final String GMT_04_00_EDT_America_Indiana_Winamac = "GMT-04:00-EDT-America/Indiana/Winamac";
		public static final String GMT_04_00_EDT_America_Indiana_Marengo = "GMT-04:00-EDT-America/Indiana/Marengo";
		public static final String GMT_04_00_EDT_America_Indiana_Petersburg = "GMT-04:00-EDT-America/Indiana/Petersburg";
		public static final String GMT_04_00_EDT_America_Indiana_Vevay = "GMT-04:00-EDT-America/Indiana/Vevay";
		public static final String GMT_05_00_CDT_America_Chicago = "GMT-05:00-CDT-America/Chicago";
		public static final String GMT_05_00_CDT_America_Indiana_Tell_City = "GMT-05:00-CDT-America/Indiana/Tell_City";
		public static final String GMT_05_00_CDT_America_Indiana_Knox = "GMT-05:00-CDT-America/Indiana/Knox";
		public static final String GMT_05_00_CDT_America_Menominee = "GMT-05:00-CDT-America/Menominee";
		public static final String GMT_05_00_CDT_America_North_Dakota_Center = "GMT-05:00-CDT-America/North_Dakota/Center";
		public static final String GMT_05_00_CDT_America_North_Dakota_New_Salem = "GMT-05:00-CDT-America/North_Dakota/New_Salem";
		public static final String GMT_05_00_CDT_America_North_Dakota_Beulah = "GMT-05:00-CDT-America/North_Dakota/Beulah";
		public static final String GMT_06_00_MDT_America_Denver = "GMT-06:00-MDT-America/Denver";
		public static final String GMT_06_00_MDT_America_Boise = "GMT-06:00-MDT-America/Boise";
		public static final String GMT_06_00_MDT_America_Shiprock = "GMT-06:00-MDT-America/Shiprock";
		public static final String GMT_07_00_MST_America_Phoenix = "GMT-07:00-MST-America/Phoenix";
		public static final String GMT_07_00_PDT_America_Los_Angeles = "GMT-07:00-PDT-America/Los_Angeles";
		public static final String GMT_08_00_AKDT_America_Anchorage = "GMT-08:00-AKDT-America/Anchorage";
		public static final String GMT_08_00_AKDT_America_Juneau = "GMT-08:00-AKDT-America/Juneau";
		public static final String GMT_08_00_AKDT_America_Sitka = "GMT-08:00-AKDT-America/Sitka";
		public static final String GMT_08_00_AKDT_America_Yakutat = "GMT-08:00-AKDT-America/Yakutat";
		public static final String GMT_08_00_AKDT_America_Nome = "GMT-08:00-AKDT-America/Nome";
		public static final String GMT_09_00_HADT_America_Adak = "GMT-09:00-HADT-America/Adak";
		public static final String GMT_08_00_MeST_America_Metlakatla = "GMT-08:00-MeST-America/Metlakatla";
		public static final String GMT_10_00_HST_Pacific_Honolulu = "GMT-10:00-HST-Pacific/Honolulu";
		public static final String GMT_03_00_UYT_America_Montevideo = "GMT-03:00-UYT-America/Montevideo";
		public static final String GMT_05_00_UZT_Asia_Samarkand = "GMT+05:00-UZT-Asia/Samarkand";
		public static final String GMT_05_00_UZT_Asia_Tashkent = "GMT+05:00-UZT-Asia/Tashkent";
		public static final String GMT_01_00_CET_Europe_Vatican = "GMT+01:00-CET-Europe/Vatican";
		public static final String GMT_04_00_AST_America_St_Vincent = "GMT-04:00-AST-America/St_Vincent";
		public static final String GMT_04_30_VET_America_Caracas = "GMT-04:30-VET-America/Caracas";
		public static final String GMT_04_00_AST_America_Tortola = "GMT-04:00-AST-America/Tortola";
		public static final String GMT_04_00_AST_America_St_Thomas = "GMT-04:00-AST-America/St_Thomas";
		public static final String GMT_07_00_ICT_Asia_Ho_Chi_Minh = "GMT+07:00-ICT-Asia/Ho_Chi_Minh";
		public static final String GMT_11_00_VUT_Pacific_Efate = "GMT+11:00-VUT-Pacific/Efate";
		public static final String GMT_12_00_WFT_Pacific_Wallis = "GMT+12:00-WFT-Pacific/Wallis";
		public static final String GMT_14_00_WSDT_Pacific_Apia = "GMT+14:00-WSDT-Pacific/Apia";
		public static final String GMT_03_00_AST_Asia_Aden = "GMT+03:00-AST-Asia/Aden";
		public static final String GMT_03_00_EAT_Indian_Mayotte = "GMT+03:00-EAT-Indian/Mayotte";
		public static final String GMT_02_00_SAST_Africa_Johannesburg = "GMT+02:00-SAST-Africa/Johannesburg";
		public static final String GMT_02_00_CAT_Africa_Lusaka = "GMT+02:00-CAT-Africa/Lusaka";
		public static final String GMT_02_00_CAT_Africa_Harare = "GMT+02:00-CAT-Africa/Harare";
	}
	public static class securecookieEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cookieversionEnum {
		public static final String _0 = "0";
		public static final String _1 = "1";
	}
}
