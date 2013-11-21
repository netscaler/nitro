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

package com.citrix.netscaler.nitro.service;

import java.lang.reflect.Method;
import java.util.ArrayList;

import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.base.base_response;
import com.citrix.netscaler.nitro.resource.base.login;
import com.citrix.netscaler.nitro.resource.base.loginchallengeresponse;
import com.citrix.netscaler.nitro.resource.base.logout;
import com.citrix.netscaler.nitro.resource.config.ha.hafailover;
import com.citrix.netscaler.nitro.resource.config.ha.hasync;
import com.citrix.netscaler.nitro.resource.config.ns.nsconfig;
import com.citrix.netscaler.nitro.resource.config.ns.nsfeature;
import com.citrix.netscaler.nitro.resource.config.ns.nsmode;
import com.citrix.netscaler.nitro.resource.config.ns.reboot;
import com.citrix.netscaler.nitro.resource.base.ipayload_formatter;
import com.citrix.netscaler.nitro.resource.base.Json;

/**
 * nitro_service is client interface through which Nitro operations are performed on resources. 
 */
public class nitro_service
{
	private String user_name;
	private String password;
	private String ipaddress;
	private String version;
	private String sessionid;
	private String protocol;
	private Boolean warning;
	private ipayload_formatter format;
	private Long timeout;
	private OnerrorEnum onerror;
	private Boolean certvalidation = true;
	private Boolean hostnameverification = true;
	
	
	public enum OnerrorEnum {
	    EXIT, CONTINUE, ROLLBACK 
	}

	/**
	 * nitro_service class constructor specifying ip. 
	 * @param ip Ipadress of the netscaler on which configuration is to be run.
	 */
	public nitro_service(String ip) throws nitro_exception
	{
		this(ip, new Json(),"http");
	}

	/**
	 * nitro_service class constructor specifying ip and protocol.
	 * @param ip Ipadress of the netscaler on which configuration is to be run.
	 * @param protocol Protocol.
	 */
	public nitro_service(String ip, String protocol) throws nitro_exception
	{
		this(ip, new Json(),protocol);
	}

	/**
	 * nitro_service class constructor specifying ip and format.
	 * @param ip Ipadress of the netscaler on which configuration is to be run.
	 * @param format payload format, eg: Json,XML
	 */
	public nitro_service(String ip, ipayload_formatter format)throws nitro_exception
	{
		this(ip, format,"http");
	}

	/**
	 * nitro_service class constructor specifying ip, format and protocol.
	 * @param ip Ipadress of the netscaler on which configuration is to be run.
	 * @param format format wire language to be used. eg: Json,XML
	 * @param protocol Protocol.
	 */
	public nitro_service(String ip, ipayload_formatter format,String protocol)throws nitro_exception
	{
		if (protocol == null || !(protocol.equalsIgnoreCase("http")|| protocol.equalsIgnoreCase("https"))) {
			throw new nitro_exception("error: protocol value " + protocol + " is not supported");
		}
		this.ipaddress = ip;
		this.version = "v1";
		this.protocol = protocol;
		this.format = format;
		if(this.format == null)
			this.format = (ipayload_formatter) new Json();
	}

	/**
	 * sets the credentials for the netscaler. 
	 * @param username Username of the netscaler
	 * @param password Password for the netscaler.
	 */
	public void set_credential(String username, String password)
	{
		this.user_name = username;
		this.password = password;
	}
	
	/**
	 * sets the session inactivity timeout for the netscaler. 
	 * @param timeout session timeout of the netscaler.Default is 30mins.
	 */
	public void set_timeout(long timeout)
	{
		this.timeout = new Long(timeout);
	}
	
	/**
	 * sets the session inactivity timeout for the netscaler. 
	 * @param timeout session timeout of the netscaler.Default is 30mins.
	 */
	public void set_timeout(Long timeout)
	{
		this.timeout = timeout;
	}

	/**
	 * sets the flag for warning. 
	 * @param warning set this to true for getting warnings in nitro response.
	 */
	public void set_warning(Boolean warning)
	{
		this.warning = warning;
	}
	
	/**
	 * Gets the warning status.
	 * @return warning status.
	 */
	public Boolean get_warning()
	{
		return this.warning;
	}
	
	/**
	 * sets the flag for certificate validation. 
	 * @param certvalidation set this to true for validating server certificates.
	 */
	public void set_certvalidation(Boolean certvalidate)
	{
		this.certvalidation = certvalidate;
	}
	
	/**
	 * Gets certificate validation flag status. 
	 * @return certvalidation status
	 */
	public Boolean get_certvalidation()
	{
		return this.certvalidation;
	}
	
	/**
	 * sets the flag for host name verification. 
	 * @param hostnameverifier set this to true for verifying certificate host name.
	 */
	public void set_hostnameverification(Boolean hostnameverification)
	{
		this.hostnameverification = hostnameverification;
	}
	
	/**
	 * Gets host name verification flag status. 
	 * @return hostnameverification status
	 */
	public Boolean get_hostnameverification()
	{
		return this.hostnameverification;
	}

	/**
	 * Checks login status.
	 * @return true if logged-in else false.
	 */
	public  boolean isLogin()
	{
		if (this.sessionid == null)
			return false;

		return true;
	}

	/**
	 * Gets the Ipaddress of the netscaler.
	 * @return Ipadress.
	 */
	public String get_ipaddress()
	{
		return this.ipaddress;
	}
	
	/**
	 * Gets the onerror status of the netscaler.
	 * @return onerror status.
	 */
	public String get_onerror()
	{
		if(this.onerror != null)
		{
		return this.onerror.toString();
		}
		return "";
	}
	
	/**
	 * Sets the onerror status of the netscaler.
	 * @set onerror This option is applicable for bulk requests.
	 * possible values: EXIT, CONTINUE, ROLLBACK.
	 * if set with EXIT: exists on the first encountered error.
	 * if set with CONTINUE: executes all the requests irrespective of individual response status.
	 * if set with ROLLBACK: rolls back the successful requests upon encountering an error. 
	 */
	public void set_onerror(OnerrorEnum val)
	{
		this.onerror = val;
	}
	
	/**
	 * Gets the nitro version.
	 * @return Nitro version.
	 */
	public String get_version()
	{
		return this.version;
	}

	/**
	 * Gets the sessionId.
	 * @return sessionId.
	 */
	public String get_sessionid()
	{
		return this.sessionid;
	}
	
	/**
	* <pre>
	* Use this API to login into Netscaler.
	* @return status of the operation performed.
	* @throws nitro_exception nitro exception is thrown.
	* </pre>
	*/
	public base_response login() throws Exception
	{
		login login = new login(this.user_name, this.password, this.timeout);
		base_response result = login.perform_operation(this);
		if (result.errorcode == 0 || result.errorcode == 1034)
			this.sessionid = result.sessionid;

		return result;
	}
	
	/**
	* <pre>
	* Use this API to loginchallengeresponse into Netscaler with challenge response.
	* @return status of the operation performed.
	* @throws nitro_exception nitro exception is thrown.
	* </pre>
	*/
	public base_response loginchallengeresponse(String response) throws Exception
	{
		loginchallengeresponse logincr = new loginchallengeresponse(response);
		base_response result = logincr.perform_operation(this);
		if (result.errorcode == 0)
			this.sessionid = result.sessionid;
		return result;
	}
	
	/**
	* <pre>
	* Use this API to reboot Netscaler.
	* @param warm set this to true for warm reboot.
	* @return status of the operation performed.
	* </pre>
	*/
	public base_response reboot(boolean warm) throws Exception
	{
		reboot resource = new reboot();
		resource.set_warm(warm);
		base_response result = resource.perform_operation(this);
		return result;
	}

	/**
	* <pre>
	* Use this API to force the sync in secondary Netscaler.
	* @param force set this to true for forcesync
	* @param save set this to YES,if want to save the configuration after sync.
	* @return status of the operation performed.
	* </pre>
	*/
	public base_response forcehasync(Boolean force, String save) throws Exception
	{
		hasync resource = new hasync();
		resource.set_force(force) ;
		resource.set_save(save);
		options option = new options();
		option.set_action("force");
		base_response result = resource.perform_operation(this,option);
		return result;
	}

	/**
	* <pre>
	* Use this API to invoke force failover in primary Netscaler.
	* @param force set this to true if force failover is needed.
	* @return status of the operation performed.
	* </pre>
	*/
	public base_response forcehafailover(Boolean force) throws Exception
	{
		hafailover resource = new hafailover();
		resource.set_force(force);
		options option = new options();
		option.set_action("force");
		base_response result = resource.perform_operation(this,option);
		return result;
	}

	/**
	* <pre>
	* Use this API to clear configuration.
	* @return status of the operation performed.
	* </pre>
	*/
	public base_response clear_config() throws Exception
	{
		return clear_config(true,"basic");
	}
	
	/**
	* <pre>
	* Use this API to clear configuration.
	* @param force clear confirmation without prompting.
	* @return status of the operation performed.
	* </pre>
	*/
	public base_response clear_config(Boolean force) throws Exception
	{
		return clear_config(force, "basic");
	}

	/**
	 * Use this API to clear configuration on netscaler.
	 * @param force clear confirmation without prompting.
	 * @param level clear config according to the level. eg: basic, extended, full
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */
	public base_response clear_config(Boolean force, String level) throws Exception
	{
		base_response result = null;
		nsconfig resource = new nsconfig();
		if (force)
			resource.set_force(force);

		resource.set_level(level);
		options option = new options();
		option.set_action("clear");
		result = resource.perform_operation(this, option);
		return result;
	}
	
	/**
	* <pre>
	* Use this API to save configuration on Netscaler.
	* @return status of the operation performed.
	* </pre>
	*/
	public base_response save_config() throws Exception
	{
		nsconfig resource = new nsconfig();
		options option = new options();
		option.set_action("save");
		base_response result = resource.perform_operation(this, option);
		return result;
	}

	public String[] get_features() throws Exception
	{
		String[] strArr;
		int counter = 0;
		ArrayList<String> features = new ArrayList<String>();
		String prefix = "get_";
		
		Method[] methods = nsfeature.class.getDeclaredMethods();
		//Loop through the methods and find the ones that correspond to
		// feature names.
		for (Method method : methods)
		{
			String method_name = method.getName();
			
			if (method_name.startsWith(prefix) && (! method_name.equals("get_object_name")))
	        {
				String returntype_name = method.getReturnType().getName();
				if (returntype_name.equals("java.lang.Boolean"))
				{
					String feature_name = method_name.substring(prefix.length());
					features.add(feature_name);
					counter++;
				}
	        }
	    }
	    strArr = new String[counter];
	    return features.toArray(strArr);
	}

	public String[] get_enabled_features() throws Exception {
		String[] strArr;
		ArrayList<String> features = new ArrayList<String>();
		String prefix = "get_";
		int counter = 0;
		
		Method[] methods = nsfeature.class.getDeclaredMethods();
		nsfeature feature = nsfeature.get(this);
        //Loop through the methods and find the ones that correspond to
       // feature names.
		for (Method method : methods) {
			String method_name = method.getName();
			if (method_name.startsWith(prefix) && (! method_name.equals("get_object_name"))) {
				String returntype_name = method.getReturnType().getName();
				if (returntype_name.equals("java.lang.Boolean")) {
					String feature_name; 
					Method methd = nsfeature.class.getMethod(method_name, null);
					Boolean value = (Boolean) methd.invoke(feature, new Class[0]);
					if (value != null && value)
					{
						feature_name = method_name.substring(prefix.length());
						features.add(feature_name);
						counter++;
					}
				}
			}
		}
		strArr = new String[counter];
		return features.toArray(strArr);
	} 
	
	/**
	 * Use this API to enable the feature on Netscaler.
	 * @param feature feature to be enabled.
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception. 
	 */
	public base_response enable_features(String[] features) throws Exception
	{
		base_response result = null;
		nsfeature resource = new nsfeature();
		resource.set_feature(features);
		options option = new options();
		option.set_action("enable");
		result = resource.perform_operation(this, option);
		return result;
	}

	/**
	 * Use this API to disable the feature on Netscaler.
	 * @param feature feature to be enabled.
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception. 
	 */
	public base_response disable_features(String[] features) throws Exception
	{
		base_response result = null;
		nsfeature resource = new nsfeature();
		resource.set_feature(features);
		options option = new options();
		option.set_action("disable");
		result = resource.perform_operation(this, option);
		return result;
	}
	
	public String[] get_modes() throws Exception
	{
		String[] strArr;
		int counter = 0;
		ArrayList<String> modes = new ArrayList<String>();
		String prefix = "get_";
		
		Method[] methods = nsmode.class.getDeclaredMethods();
		//Loop through the methods and find the ones that correspond to
		// mode names.
		for (Method method : methods)
		{
			String method_name = method.getName();
			
			if (method_name.startsWith(prefix) && (! method_name.equals("get_object_name")))
	        {
				String returntype_name = method.getReturnType().getName();
				if (returntype_name.equals("java.lang.Boolean"))
				{
					String mode_name = method_name.substring(prefix.length());
					modes.add(mode_name);
					counter++;
				}
	        }
	    }
	    strArr = new String[counter];
	    return modes.toArray(strArr);
	}

	public String[] get_enabled_modes() throws Exception {
		String[] strArr;
		ArrayList<String> modes = new ArrayList<String>();
		String prefix = "get_";
		int counter = 0;
		
		Method[] methods = nsmode.class.getDeclaredMethods();
		nsmode mode = nsmode.get(this);
        //Loop through the methods and find the ones that correspond to
       // mode names.
		for (Method method : methods) {
			String method_name = method.getName();
			if (method_name.startsWith(prefix) && (! method_name.equals("get_object_name"))) {
				String returntype_name = method.getReturnType().getName();
				if (returntype_name.equals("java.lang.Boolean")) {
					String mode_name; 
					Method methd = nsmode.class.getMethod(method_name, null);
					Boolean value = (Boolean) methd.invoke(mode, new Class[0]);
					if ((value != null) && value)
					{
						mode_name = method_name.substring(prefix.length());
						modes.add(mode_name);
						counter++;
					}
				}
			}
		}
		strArr = new String[counter];
		return modes.toArray(strArr);
	} 
	
	/**
	 * Use this API to enable the mode on Netscaler.
	 * @param mode mode to be enabled.
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception. 
	 */
	public base_response enable_modes(String[] modes) throws Exception
	{
		base_response result = null;
		nsmode resource = new nsmode();
		resource.set_mode(modes);
		options option = new options();
		option.set_action("enable");
		result = resource.perform_operation(this, option);
		return result;
	}

	/**
	 * Use this API to disable the mode on Netscaler.
	 * @param mode mode to be enabled.
	 * @return status of the operation performed.
	 * @throws Exception Nitro exception. 
	 */
	public base_response disable_modes(String[] modes) throws Exception
	{
		base_response result = null;
		nsmode resource = new nsmode();
		resource.set_mode(modes);
		options option = new options();
		option.set_action("disable");
		result = resource.perform_operation(this, option);
		return result;
	}
	
	 /**
     * Use this API to clear the current session.
     */
    public void clear_session() {
        this.sessionid = null;
    }
	
	/**
	 * Use this to API to re login into Netsclaer.
	 * @return status of the operation performed.
	 * @throws Exception nitro exception is thrown.
	 */
	public base_response relogin() throws Exception
	{
		this.sessionid = null;
		return this.login();
	}

	/**
	 * Use this API to login into Netscaler.
	 * @param username Username
	 * @param password Password for the Netscaler.
	 * @return status of the operation performed.
	 * @throws Exception nitro exception is thrown.
	 */
	public base_response login(String username, String password) throws Exception
	{
		this.set_credential(username, password);
		return this.login();
	}
	
	/**
	 * Use this API to login into Netscaler.
	 * @param username Username
	 * @param password Password for the Netscaler.
	 * @param timeout timeout for netscaler session.Default is 1800secs
	 * @return status of the operation performed.
	 * @throws Exception nitro exception is thrown.
	 */
	public base_response login(String username, String password, Long timeout) throws Exception
	{
		this.set_credential(username, password);
		this.set_timeout(timeout);
		return this.login();
	}

	/**
	* <pre>
	* Use this API to logout from current session.
	* @return status of the operation performed.
	* </pre>
	*/
	public base_response logout() throws Exception
	{
		base_response result = null;
		logout logout = new logout();
		result = logout.perform_operation(this);
        sessionid = null;
        user_name = null;
        password = null;
		return result;
	}

	/**
	 * Gets the protocol.
	 * @return Returns the protocol.
	 */
	public String get_protocol()
	{
		return protocol;
	}
	/**
	 * Sets the protocol.
	 * @param protocol The protocol to be set.
	 */
	public void set_protocol(String protocol) throws nitro_exception
	{
		if (protocol == null || !(protocol.equalsIgnoreCase("http") ||protocol.equalsIgnoreCase("https"))) {
			throw new nitro_exception("error: protocol value " + protocol + " is not supported");
		}
		this.protocol = protocol;
	}
	/**
	 * Returns payload format.
	 * @return Returns the ijson.
	 */
	public ipayload_formatter get_payload_formatter()
	{
		return this.format;
	}
}

