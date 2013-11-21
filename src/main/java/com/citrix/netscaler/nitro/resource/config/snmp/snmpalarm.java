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

package com.citrix.netscaler.nitro.resource.config.snmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class snmpalarm_response extends base_response
{
	public snmpalarm[] snmpalarm;
}
/**
* Configuration for alarm resource.
*/

public class snmpalarm extends base_resource
{
	private String trapname;
	private Long thresholdvalue;
	private Long normalvalue;
	private Long time;
	private String state;
	private String severity;
	private String logging;

	//------- Read only Parameter ---------;

	private Long timeout;
	private Long __count;

	/**
	* <pre>
	* Name of the SNMP alarm. This parameter is required for identifying the SNMP alarm and cannot be modified.<br> Possible values = CPU-USAGE, AVERAGE-CPU, MEMORY, MGMT-CPU-USAGE, SYNFLOOD, VSERVER-REQRATE, SERVICE-REQRATE, ENTITY-RXRATE, ENTITY-TXRATE, ENTITY-SYNFLOOD, SERVICE-MAXCLIENTS, HA-STATE-CHANGE, ENTITY-STATE, CONFIG-CHANGE, CONFIG-SAVE, SERVICEGROUP-MEMBER-REQRATE, SERVICEGROUP-MEMBER-MAXCLIENTS, MONITOR-RTO-THRESHOLD, LOGIN-FAILURE, SSL-CERT-EXPIRY, FAN-SPEED-LOW, VOLTAGE-LOW, VOLTAGE-HIGH, TEMPERATURE-HIGH, CPU-TEMPERATURE-HIGH, POWER-SUPPLY-FAILURE, DISK-USAGE-HIGH, INTERFACE-THROUGHPUT-LOW, MON_PROBE_FAILED, HA-VERSION-MISMATCH, HA-SYNC-FAILURE, HA-NO-HEARTBEATS, HA-BAD-SECONDARY-STATE, INTERFACE-BW-USAGE, RATE-LIMIT-THRESHOLD-EXCEEDED, ENTITY-NAME-CHANGE, HA-PROP-FAILURE, IP-CONFLICT, PF-RL-RATE-THRESHOLD, PF-RL-PPS-THRESHOLD, PF-RL-RATE-PKTS-DROPPED, PF-RL-PPS-PKTS-DROPPED, APPFW-START-URL, APPFW-DENY-URL, APPFW-VIOLATIONS-TYPE, APPFW-REFERER-HEADER, APPFW-CSRF-TAG, APPFW-COOKIE, APPFW-FIELD-CONSISTENCY, APPFW-BUFFER-OVERFLOW, APPFW-FIELD-FORMAT, APPFW-SAFE-COMMERCE, APPFW-SAFE-OBJECT, APPFW-POLICY-HIT, APPFW-XSS, APPFW-XML-XSS, APPFW-SQL, APPFW-XML-SQL, APPFW-XML-ATTACHMENT, APPFW-XML-DOS, APPFW-XML-VALIDATION, APPFW-XML-WSI, APPFW-XML-SCHEMA-COMPILE, APPFW-XML-SOAP-FAULT, DNSKEY-EXPIRY, DATASTREAM-RATE-LIMIT-HIT, HA-LICENSE-MISMATCH, SSL-CARD-FAILED, SSL-CARD-NORMAL, WARM-RESTART-EVENT, HARD-DISK-DRIVE-ERRORS, COMPACT-FLASH-ERRORS, CALLHOME-UPLOAD-EVENT, 1024KEY-EXCHANGE-RATE, 2048KEY-EXCHANGE-RATE, 4096KEY-EXCHANGE-RATE, SSL-CUR-SESSION-INUSE, CLUSTER-NODE-HEALTH, CLUSTER-NODE-QUORUM, CLUSTER-VERSION-MISMATCH, CLUSTER-CCO-CHANGE, CLUSTER-OVS-CHANGE, CLUSTER-SYNC-FAILURE, CLUSTER-PROP-FAILURE, HA-STICKY-PRIMARY, INBAND-PROTOCOL-VERSION-MISMATCH, SSL-CHIP-REINIT, VRID-STATE-CHANGE
	* </pre>
	*/
	public void set_trapname(String trapname) throws Exception{
		this.trapname = trapname;
	}

	/**
	* <pre>
	* Name of the SNMP alarm. This parameter is required for identifying the SNMP alarm and cannot be modified.<br> Possible values = CPU-USAGE, AVERAGE-CPU, MEMORY, MGMT-CPU-USAGE, SYNFLOOD, VSERVER-REQRATE, SERVICE-REQRATE, ENTITY-RXRATE, ENTITY-TXRATE, ENTITY-SYNFLOOD, SERVICE-MAXCLIENTS, HA-STATE-CHANGE, ENTITY-STATE, CONFIG-CHANGE, CONFIG-SAVE, SERVICEGROUP-MEMBER-REQRATE, SERVICEGROUP-MEMBER-MAXCLIENTS, MONITOR-RTO-THRESHOLD, LOGIN-FAILURE, SSL-CERT-EXPIRY, FAN-SPEED-LOW, VOLTAGE-LOW, VOLTAGE-HIGH, TEMPERATURE-HIGH, CPU-TEMPERATURE-HIGH, POWER-SUPPLY-FAILURE, DISK-USAGE-HIGH, INTERFACE-THROUGHPUT-LOW, MON_PROBE_FAILED, HA-VERSION-MISMATCH, HA-SYNC-FAILURE, HA-NO-HEARTBEATS, HA-BAD-SECONDARY-STATE, INTERFACE-BW-USAGE, RATE-LIMIT-THRESHOLD-EXCEEDED, ENTITY-NAME-CHANGE, HA-PROP-FAILURE, IP-CONFLICT, PF-RL-RATE-THRESHOLD, PF-RL-PPS-THRESHOLD, PF-RL-RATE-PKTS-DROPPED, PF-RL-PPS-PKTS-DROPPED, APPFW-START-URL, APPFW-DENY-URL, APPFW-VIOLATIONS-TYPE, APPFW-REFERER-HEADER, APPFW-CSRF-TAG, APPFW-COOKIE, APPFW-FIELD-CONSISTENCY, APPFW-BUFFER-OVERFLOW, APPFW-FIELD-FORMAT, APPFW-SAFE-COMMERCE, APPFW-SAFE-OBJECT, APPFW-POLICY-HIT, APPFW-XSS, APPFW-XML-XSS, APPFW-SQL, APPFW-XML-SQL, APPFW-XML-ATTACHMENT, APPFW-XML-DOS, APPFW-XML-VALIDATION, APPFW-XML-WSI, APPFW-XML-SCHEMA-COMPILE, APPFW-XML-SOAP-FAULT, DNSKEY-EXPIRY, DATASTREAM-RATE-LIMIT-HIT, HA-LICENSE-MISMATCH, SSL-CARD-FAILED, SSL-CARD-NORMAL, WARM-RESTART-EVENT, HARD-DISK-DRIVE-ERRORS, COMPACT-FLASH-ERRORS, CALLHOME-UPLOAD-EVENT, 1024KEY-EXCHANGE-RATE, 2048KEY-EXCHANGE-RATE, 4096KEY-EXCHANGE-RATE, SSL-CUR-SESSION-INUSE, CLUSTER-NODE-HEALTH, CLUSTER-NODE-QUORUM, CLUSTER-VERSION-MISMATCH, CLUSTER-CCO-CHANGE, CLUSTER-OVS-CHANGE, CLUSTER-SYNC-FAILURE, CLUSTER-PROP-FAILURE, HA-STICKY-PRIMARY, INBAND-PROTOCOL-VERSION-MISMATCH, SSL-CHIP-REINIT, VRID-STATE-CHANGE
	* </pre>
	*/
	public String get_trapname() throws Exception {
		return this.trapname;
	}

	/**
	* <pre>
	* Value for the high threshold. The NetScaler appliance generates an SNMP trap message when the value of the attribute associated with the alarm is greater than or equal to the specified high threshold value.<br> Minimum value =  1
	* </pre>
	*/
	public void set_thresholdvalue(long thresholdvalue) throws Exception {
		this.thresholdvalue = new Long(thresholdvalue);
	}

	/**
	* <pre>
	* Value for the high threshold. The NetScaler appliance generates an SNMP trap message when the value of the attribute associated with the alarm is greater than or equal to the specified high threshold value.<br> Minimum value =  1
	* </pre>
	*/
	public void set_thresholdvalue(Long thresholdvalue) throws Exception{
		this.thresholdvalue = thresholdvalue;
	}

	/**
	* <pre>
	* Value for the high threshold. The NetScaler appliance generates an SNMP trap message when the value of the attribute associated with the alarm is greater than or equal to the specified high threshold value.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_thresholdvalue() throws Exception {
		return this.thresholdvalue;
	}

	/**
	* <pre>
	* Value for the normal threshold. A trap message is generated if the value of the respective attribute falls to or below this value after exceeding the high threshold.<br> Minimum value =  1
	* </pre>
	*/
	public void set_normalvalue(long normalvalue) throws Exception {
		this.normalvalue = new Long(normalvalue);
	}

	/**
	* <pre>
	* Value for the normal threshold. A trap message is generated if the value of the respective attribute falls to or below this value after exceeding the high threshold.<br> Minimum value =  1
	* </pre>
	*/
	public void set_normalvalue(Long normalvalue) throws Exception{
		this.normalvalue = normalvalue;
	}

	/**
	* <pre>
	* Value for the normal threshold. A trap message is generated if the value of the respective attribute falls to or below this value after exceeding the high threshold.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_normalvalue() throws Exception {
		return this.normalvalue;
	}

	/**
	* <pre>
	* Interval, in seconds, at which the NetScaler appliance generates SNMP trap messages when the conditions specified in the SNMP alarm are met. Can be specified for the following alarms: SYNFLOOD, HA-VERSION-MISMATCH, HA-SYNC-FAILURE, HA-NO-HEARTBEATS, HA-BAD-SECONDARY-STATE, HA-PROP-FAILURE, IP-CONFLICT, and APPFW.<br> Default value: 1
	* </pre>
	*/
	public void set_time(long time) throws Exception {
		this.time = new Long(time);
	}

	/**
	* <pre>
	* Interval, in seconds, at which the NetScaler appliance generates SNMP trap messages when the conditions specified in the SNMP alarm are met. Can be specified for the following alarms: SYNFLOOD, HA-VERSION-MISMATCH, HA-SYNC-FAILURE, HA-NO-HEARTBEATS, HA-BAD-SECONDARY-STATE, HA-PROP-FAILURE, IP-CONFLICT, and APPFW.<br> Default value: 1
	* </pre>
	*/
	public void set_time(Long time) throws Exception{
		this.time = time;
	}

	/**
	* <pre>
	* Interval, in seconds, at which the NetScaler appliance generates SNMP trap messages when the conditions specified in the SNMP alarm are met. Can be specified for the following alarms: SYNFLOOD, HA-VERSION-MISMATCH, HA-SYNC-FAILURE, HA-NO-HEARTBEATS, HA-BAD-SECONDARY-STATE, HA-PROP-FAILURE, IP-CONFLICT, and APPFW.<br> Default value: 1
	* </pre>
	*/
	public Long get_time() throws Exception {
		return this.time;
	}

	/**
	* <pre>
	* Current state of the SNMP alarm. The NetScaler appliance generates trap messages only for SNMP alarms that are enabled. Some alarms are enabled by default, but you can disable them.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, UNSET
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Current state of the SNMP alarm. The NetScaler appliance generates trap messages only for SNMP alarms that are enabled. Some alarms are enabled by default, but you can disable them.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED, UNSET
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Severity level assigned to trap messages generated by this alarm. The severity levels are, in increasing order of severity, Informational, Warning, Minor, Major, and Critical.
This parameter is useful when you want the NetScaler appliance to send trap messages to a trap listener on the basis of severity level. Trap messages with a severity level lower than the specified level (in the trap listener entry) are not sent.<br> Default value: Unknown<br> Possible values = Critical, Major, Minor, Warning, Informational
	* </pre>
	*/
	public void set_severity(String severity) throws Exception{
		this.severity = severity;
	}

	/**
	* <pre>
	* Severity level assigned to trap messages generated by this alarm. The severity levels are, in increasing order of severity, Informational, Warning, Minor, Major, and Critical.
This parameter is useful when you want the NetScaler appliance to send trap messages to a trap listener on the basis of severity level. Trap messages with a severity level lower than the specified level (in the trap listener entry) are not sent.<br> Default value: Unknown<br> Possible values = Critical, Major, Minor, Warning, Informational
	* </pre>
	*/
	public String get_severity() throws Exception {
		return this.severity;
	}

	/**
	* <pre>
	* Logging status of the alarm. When logging is enabled, the NetScaler appliance logs every trap message that is generated for this alarm.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_logging(String logging) throws Exception{
		this.logging = logging;
	}

	/**
	* <pre>
	* Logging status of the alarm. When logging is enabled, the NetScaler appliance logs every trap message that is generated for this alarm.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_logging() throws Exception {
		return this.logging;
	}

	/**
	* <pre>
	* If DB is enabled and clear config is fired, then to reset timeinterval of alarm, corresponding default time value is needed. This hidden argument holds the default time value for the corresponding alarm.
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmpalarm_response result = (snmpalarm_response) service.get_payload_formatter().string_to_resource(snmpalarm_response.class, response);
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
		return result.snmpalarm;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.trapname;
	}

	/**
	* Use this API to update snmpalarm.
	*/
	public static base_response update(nitro_service client, snmpalarm resource) throws Exception {
		snmpalarm updateresource = new snmpalarm();
		updateresource.trapname = resource.trapname;
		updateresource.thresholdvalue = resource.thresholdvalue;
		updateresource.normalvalue = resource.normalvalue;
		updateresource.time = resource.time;
		updateresource.state = resource.state;
		updateresource.severity = resource.severity;
		updateresource.logging = resource.logging;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update snmpalarm resources.
	*/
	public static base_responses update(nitro_service client, snmpalarm resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpalarm updateresources[] = new snmpalarm[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new snmpalarm();
				updateresources[i].trapname = resources[i].trapname;
				updateresources[i].thresholdvalue = resources[i].thresholdvalue;
				updateresources[i].normalvalue = resources[i].normalvalue;
				updateresources[i].time = resources[i].time;
				updateresources[i].state = resources[i].state;
				updateresources[i].severity = resources[i].severity;
				updateresources[i].logging = resources[i].logging;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpalarm resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, snmpalarm resource, String[] args) throws Exception{
		snmpalarm unsetresource = new snmpalarm();
		unsetresource.trapname = resource.trapname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of snmpalarm resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String trapname[], String args[]) throws Exception {
		base_responses result = null;
		if (trapname != null && trapname.length > 0) {
			snmpalarm unsetresources[] = new snmpalarm[trapname.length];
			for (int i=0;i<trapname.length;i++){
				unsetresources[i] = new snmpalarm();
				unsetresources[i].trapname = trapname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpalarm resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, snmpalarm resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpalarm unsetresources[] = new snmpalarm[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new snmpalarm();
				unsetresources[i].trapname = resources[i].trapname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable snmpalarm of given name.
	*/
	public static base_response enable(nitro_service client, String trapname) throws Exception {
		snmpalarm enableresource = new snmpalarm();
		enableresource.trapname = trapname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable snmpalarm.
	*/
	public static base_response enable(nitro_service client, snmpalarm resource) throws Exception {
		snmpalarm enableresource = new snmpalarm();
		enableresource.trapname = resource.trapname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable snmpalarm resources of given names.
	*/
	public static base_responses enable(nitro_service client, String trapname[]) throws Exception {
		base_responses result = null;
		if (trapname != null && trapname.length > 0) {
			snmpalarm enableresources[] = new snmpalarm[trapname.length];
			for (int i=0;i<trapname.length;i++){
				enableresources[i] = new snmpalarm();
				enableresources[i].trapname = trapname[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable snmpalarm resources.
	*/
	public static base_responses enable(nitro_service client, snmpalarm resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpalarm enableresources[] = new snmpalarm[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new snmpalarm();
				enableresources[i].trapname = resources[i].trapname;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable snmpalarm of given name.
	*/
	public static base_response disable(nitro_service client, String trapname) throws Exception {
		snmpalarm disableresource = new snmpalarm();
		disableresource.trapname = trapname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable snmpalarm.
	*/
	public static base_response disable(nitro_service client, snmpalarm resource) throws Exception {
		snmpalarm disableresource = new snmpalarm();
		disableresource.trapname = resource.trapname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable snmpalarm resources of given names.
	*/
	public static base_responses disable(nitro_service client, String trapname[]) throws Exception {
		base_responses result = null;
		if (trapname != null && trapname.length > 0) {
			snmpalarm disableresources[] = new snmpalarm[trapname.length];
			for (int i=0;i<trapname.length;i++){
				disableresources[i] = new snmpalarm();
				disableresources[i].trapname = trapname[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable snmpalarm resources.
	*/
	public static base_responses disable(nitro_service client, snmpalarm resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpalarm disableresources[] = new snmpalarm[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new snmpalarm();
				disableresources[i].trapname = resources[i].trapname;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmpalarm resources that are configured on netscaler.
	*/
	public static snmpalarm[] get(nitro_service service) throws Exception{
		snmpalarm obj = new snmpalarm();
		snmpalarm[] response = (snmpalarm[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmpalarm resources that are configured on netscaler.
	*/
	public static snmpalarm[] get(nitro_service service, options option) throws Exception{
		snmpalarm obj = new snmpalarm();
		snmpalarm[] response = (snmpalarm[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch snmpalarm resource of given name .
	*/
	public static snmpalarm get(nitro_service service, String trapname) throws Exception{
		snmpalarm obj = new snmpalarm();
		obj.set_trapname(trapname);
		snmpalarm response = (snmpalarm) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch snmpalarm resources of given names .
	*/
	public static snmpalarm[] get(nitro_service service, String trapname[]) throws Exception{
		if (trapname !=null && trapname.length>0) {
			snmpalarm response[] = new snmpalarm[trapname.length];
			snmpalarm obj[] = new snmpalarm[trapname.length];
			for (int i=0;i<trapname.length;i++) {
				obj[i] = new snmpalarm();
				obj[i].set_trapname(trapname[i]);
				response[i] = (snmpalarm) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmpalarm resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpalarm[] get_filtered(nitro_service service, String filter) throws Exception{
		snmpalarm obj = new snmpalarm();
		options option = new options();
		option.set_filter(filter);
		snmpalarm[] response = (snmpalarm[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpalarm resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpalarm[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpalarm obj = new snmpalarm();
		options option = new options();
		option.set_filter(filter);
		snmpalarm[] response = (snmpalarm[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpalarm resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmpalarm obj = new snmpalarm();
		options option = new options();
		option.set_count(true);
		snmpalarm[] response = (snmpalarm[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpalarm resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmpalarm obj = new snmpalarm();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpalarm[] response = (snmpalarm[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpalarm resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpalarm obj = new snmpalarm();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpalarm[] response = (snmpalarm[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class trapnameEnum {
		public static final String CPU_USAGE = "CPU-USAGE";
		public static final String AVERAGE_CPU = "AVERAGE-CPU";
		public static final String MEMORY = "MEMORY";
		public static final String MGMT_CPU_USAGE = "MGMT-CPU-USAGE";
		public static final String SYNFLOOD = "SYNFLOOD";
		public static final String VSERVER_REQRATE = "VSERVER-REQRATE";
		public static final String SERVICE_REQRATE = "SERVICE-REQRATE";
		public static final String ENTITY_RXRATE = "ENTITY-RXRATE";
		public static final String ENTITY_TXRATE = "ENTITY-TXRATE";
		public static final String ENTITY_SYNFLOOD = "ENTITY-SYNFLOOD";
		public static final String SERVICE_MAXCLIENTS = "SERVICE-MAXCLIENTS";
		public static final String HA_STATE_CHANGE = "HA-STATE-CHANGE";
		public static final String ENTITY_STATE = "ENTITY-STATE";
		public static final String CONFIG_CHANGE = "CONFIG-CHANGE";
		public static final String CONFIG_SAVE = "CONFIG-SAVE";
		public static final String SERVICEGROUP_MEMBER_REQRATE = "SERVICEGROUP-MEMBER-REQRATE";
		public static final String SERVICEGROUP_MEMBER_MAXCLIENTS = "SERVICEGROUP-MEMBER-MAXCLIENTS";
		public static final String MONITOR_RTO_THRESHOLD = "MONITOR-RTO-THRESHOLD";
		public static final String LOGIN_FAILURE = "LOGIN-FAILURE";
		public static final String SSL_CERT_EXPIRY = "SSL-CERT-EXPIRY";
		public static final String FAN_SPEED_LOW = "FAN-SPEED-LOW";
		public static final String VOLTAGE_LOW = "VOLTAGE-LOW";
		public static final String VOLTAGE_HIGH = "VOLTAGE-HIGH";
		public static final String TEMPERATURE_HIGH = "TEMPERATURE-HIGH";
		public static final String CPU_TEMPERATURE_HIGH = "CPU-TEMPERATURE-HIGH";
		public static final String POWER_SUPPLY_FAILURE = "POWER-SUPPLY-FAILURE";
		public static final String DISK_USAGE_HIGH = "DISK-USAGE-HIGH";
		public static final String INTERFACE_THROUGHPUT_LOW = "INTERFACE-THROUGHPUT-LOW";
		public static final String MON_PROBE_FAILED = "MON_PROBE_FAILED";
		public static final String HA_VERSION_MISMATCH = "HA-VERSION-MISMATCH";
		public static final String HA_SYNC_FAILURE = "HA-SYNC-FAILURE";
		public static final String HA_NO_HEARTBEATS = "HA-NO-HEARTBEATS";
		public static final String HA_BAD_SECONDARY_STATE = "HA-BAD-SECONDARY-STATE";
		public static final String INTERFACE_BW_USAGE = "INTERFACE-BW-USAGE";
		public static final String RATE_LIMIT_THRESHOLD_EXCEEDED = "RATE-LIMIT-THRESHOLD-EXCEEDED";
		public static final String ENTITY_NAME_CHANGE = "ENTITY-NAME-CHANGE";
		public static final String HA_PROP_FAILURE = "HA-PROP-FAILURE";
		public static final String IP_CONFLICT = "IP-CONFLICT";
		public static final String PF_RL_RATE_THRESHOLD = "PF-RL-RATE-THRESHOLD";
		public static final String PF_RL_PPS_THRESHOLD = "PF-RL-PPS-THRESHOLD";
		public static final String PF_RL_RATE_PKTS_DROPPED = "PF-RL-RATE-PKTS-DROPPED";
		public static final String PF_RL_PPS_PKTS_DROPPED = "PF-RL-PPS-PKTS-DROPPED";
		public static final String APPFW_START_URL = "APPFW-START-URL";
		public static final String APPFW_DENY_URL = "APPFW-DENY-URL";
		public static final String APPFW_VIOLATIONS_TYPE = "APPFW-VIOLATIONS-TYPE";
		public static final String APPFW_REFERER_HEADER = "APPFW-REFERER-HEADER";
		public static final String APPFW_CSRF_TAG = "APPFW-CSRF-TAG";
		public static final String APPFW_COOKIE = "APPFW-COOKIE";
		public static final String APPFW_FIELD_CONSISTENCY = "APPFW-FIELD-CONSISTENCY";
		public static final String APPFW_BUFFER_OVERFLOW = "APPFW-BUFFER-OVERFLOW";
		public static final String APPFW_FIELD_FORMAT = "APPFW-FIELD-FORMAT";
		public static final String APPFW_SAFE_COMMERCE = "APPFW-SAFE-COMMERCE";
		public static final String APPFW_SAFE_OBJECT = "APPFW-SAFE-OBJECT";
		public static final String APPFW_POLICY_HIT = "APPFW-POLICY-HIT";
		public static final String APPFW_XSS = "APPFW-XSS";
		public static final String APPFW_XML_XSS = "APPFW-XML-XSS";
		public static final String APPFW_SQL = "APPFW-SQL";
		public static final String APPFW_XML_SQL = "APPFW-XML-SQL";
		public static final String APPFW_XML_ATTACHMENT = "APPFW-XML-ATTACHMENT";
		public static final String APPFW_XML_DOS = "APPFW-XML-DOS";
		public static final String APPFW_XML_VALIDATION = "APPFW-XML-VALIDATION";
		public static final String APPFW_XML_WSI = "APPFW-XML-WSI";
		public static final String APPFW_XML_SCHEMA_COMPILE = "APPFW-XML-SCHEMA-COMPILE";
		public static final String APPFW_XML_SOAP_FAULT = "APPFW-XML-SOAP-FAULT";
		public static final String DNSKEY_EXPIRY = "DNSKEY-EXPIRY";
		public static final String DATASTREAM_RATE_LIMIT_HIT = "DATASTREAM-RATE-LIMIT-HIT";
		public static final String HA_LICENSE_MISMATCH = "HA-LICENSE-MISMATCH";
		public static final String SSL_CARD_FAILED = "SSL-CARD-FAILED";
		public static final String SSL_CARD_NORMAL = "SSL-CARD-NORMAL";
		public static final String WARM_RESTART_EVENT = "WARM-RESTART-EVENT";
		public static final String HARD_DISK_DRIVE_ERRORS = "HARD-DISK-DRIVE-ERRORS";
		public static final String COMPACT_FLASH_ERRORS = "COMPACT-FLASH-ERRORS";
		public static final String CALLHOME_UPLOAD_EVENT = "CALLHOME-UPLOAD-EVENT";
		public static final String _1024KEY_EXCHANGE_RATE = "1024KEY-EXCHANGE-RATE";
		public static final String _2048KEY_EXCHANGE_RATE = "2048KEY-EXCHANGE-RATE";
		public static final String _4096KEY_EXCHANGE_RATE = "4096KEY-EXCHANGE-RATE";
		public static final String SSL_CUR_SESSION_INUSE = "SSL-CUR-SESSION-INUSE";
		public static final String CLUSTER_NODE_HEALTH = "CLUSTER-NODE-HEALTH";
		public static final String CLUSTER_NODE_QUORUM = "CLUSTER-NODE-QUORUM";
		public static final String CLUSTER_VERSION_MISMATCH = "CLUSTER-VERSION-MISMATCH";
		public static final String CLUSTER_CCO_CHANGE = "CLUSTER-CCO-CHANGE";
		public static final String CLUSTER_OVS_CHANGE = "CLUSTER-OVS-CHANGE";
		public static final String CLUSTER_SYNC_FAILURE = "CLUSTER-SYNC-FAILURE";
		public static final String CLUSTER_PROP_FAILURE = "CLUSTER-PROP-FAILURE";
		public static final String HA_STICKY_PRIMARY = "HA-STICKY-PRIMARY";
		public static final String INBAND_PROTOCOL_VERSION_MISMATCH = "INBAND-PROTOCOL-VERSION-MISMATCH";
		public static final String SSL_CHIP_REINIT = "SSL-CHIP-REINIT";
		public static final String VRID_STATE_CHANGE = "VRID-STATE-CHANGE";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
		public static final String UNSET = "UNSET";
	}
	public static class severityEnum {
		public static final String Critical = "Critical";
		public static final String Major = "Major";
		public static final String Minor = "Minor";
		public static final String Warning = "Warning";
		public static final String Informational = "Informational";
	}
	public static class loggingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
