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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwprofile_response extends base_response
{
	public appfwprofile[] appfwprofile;
}
/**
* Configuration for application firewall profile resource.
*/

public class appfwprofile extends base_resource
{
	private String name;
	private String defaults;
	private String[] starturlaction;
	private String starturlclosure;
	private String[] denyurlaction;
	private String refererheadercheck;
	private String[] cookieconsistencyaction;
	private String cookietransforms;
	private String cookieencryption;
	private String cookieproxying;
	private String addcookieflags;
	private String[] fieldconsistencyaction;
	private String[] csrftagaction;
	private String[] crosssitescriptingaction;
	private String crosssitescriptingtransformunsafehtml;
	private String crosssitescriptingcheckcompleteurls;
	private String[] sqlinjectionaction;
	private String sqlinjectiontransformspecialchars;
	private String sqlinjectiononlycheckfieldswithsqlchars;
	private String[] fieldformataction;
	private String defaultfieldformattype;
	private Long defaultfieldformatminlength;
	private Long defaultfieldformatmaxlength;
	private String[] bufferoverflowaction;
	private Long bufferoverflowmaxurllength;
	private Long bufferoverflowmaxheaderlength;
	private Long bufferoverflowmaxcookielength;
	private String[] creditcardaction;
	private String[] creditcard;
	private Long creditcardmaxallowed;
	private String creditcardxout;
	private String requestcontenttype;
	private String responsecontenttype;
	private String[] xmldosaction;
	private String[] xmlformataction;
	private String[] xmlsqlinjectionaction;
	private String xmlsqlinjectiononlycheckfieldswithsqlchars;
	private String xmlsqlinjectionparsecomments;
	private String[] xmlxssaction;
	private String[] xmlwsiaction;
	private String[] xmlattachmentaction;
	private String[] xmlvalidationaction;
	private String xmlerrorobject;
	private String customsettings;
	private String signatures;
	private String[] xmlsoapfaultaction;
	private String usehtmlerrorobject;
	private String errorurl;
	private String htmlerrorobject;
	private String logeverypolicyhit;
	private String stripcomments;
	private String striphtmlcomments;
	private String stripxmlcomments;
	private String exemptclosureurlsfromsecuritychecks;
	private String defaultcharset;
	private Long postbodylimit;
	private Long fileuploadmaxnum;
	private String canonicalizehtmlresponse;
	private String enableformtagging;
	private String sessionlessfieldconsistency;
	private String sessionlessurlclosure;
	private String semicolonfieldseparator;
	private String excludefileuploadfromchecks;
	private String sqlinjectionparsecomments;
	private String invalidpercenthandling;
	private String[] type;
	private String checkrequestheaders;
	private String comment;
	private String archivename;

	//------- Read only Parameter ---------;

	private String csrftag;
	private String state;
	private Boolean builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the profile. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.), pound (#), space ( ), at (@), equals (=), colon (:), and underscore (_) characters. Cannot be changed after the profile is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my profile" or 'my profile').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the profile. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.), pound (#), space ( ), at (@), equals (=), colon (:), and underscore (_) characters. Cannot be changed after the profile is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my profile" or 'my profile').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Default configuration to apply to the profile. Basic defaults are intended for standard content that requires little further configuration, such as static web site content. Advanced defaults are intended for specialized content that requires significant specialized configuration, such as heavily scripted or dynamic content.

CLI users: When adding an application firewall profile, you can set either the defaults or the type, but not both. To set both options, create the profile by using the add appfw profile command, and then use the set appfw profile command to configure the other option.<br> Possible values = basic, advanced
	* </pre>
	*/
	public void set_defaults(String defaults) throws Exception{
		this.defaults = defaults;
	}

	/**
	* <pre>
	* Default configuration to apply to the profile. Basic defaults are intended for standard content that requires little further configuration, such as static web site content. Advanced defaults are intended for specialized content that requires significant specialized configuration, such as heavily scripted or dynamic content.

CLI users: When adding an application firewall profile, you can set either the defaults or the type, but not both. To set both options, create the profile by using the add appfw profile command, and then use the set appfw profile command to configure the other option.<br> Possible values = basic, advanced
	* </pre>
	*/
	public String get_defaults() throws Exception {
		return this.defaults;
	}

	/**
	* <pre>
	* One or more Start URL actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -startURLaction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -startURLaction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_starturlaction(String[] starturlaction) throws Exception{
		this.starturlaction = starturlaction;
	}

	/**
	* <pre>
	* One or more Start URL actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -startURLaction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -startURLaction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_starturlaction() throws Exception {
		return this.starturlaction;
	}

	/**
	* <pre>
	* Toggle  the state of Start URL Closure.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_starturlclosure(String starturlclosure) throws Exception{
		this.starturlclosure = starturlclosure;
	}

	/**
	* <pre>
	* Toggle  the state of Start URL Closure.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_starturlclosure() throws Exception {
		return this.starturlclosure;
	}

	/**
	* <pre>
	* One or more Deny URL actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

NOTE: The Deny URL check takes precedence over the Start URL check. If you enable blocking for the Deny URL check, the application firewall blocks any URL that is explicitly blocked by a Deny URL, even if the same URL would otherwise be allowed by the Start URL check.

CLI users: To enable one or more actions, type "set appfw profile -denyURLaction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -denyURLaction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_denyurlaction(String[] denyurlaction) throws Exception{
		this.denyurlaction = denyurlaction;
	}

	/**
	* <pre>
	* One or more Deny URL actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

NOTE: The Deny URL check takes precedence over the Start URL check. If you enable blocking for the Deny URL check, the application firewall blocks any URL that is explicitly blocked by a Deny URL, even if the same URL would otherwise be allowed by the Start URL check.

CLI users: To enable one or more actions, type "set appfw profile -denyURLaction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -denyURLaction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_denyurlaction() throws Exception {
		return this.denyurlaction;
	}

	/**
	* <pre>
	* Enable validation of Referer headers. 
Referer validation ensures that a web form that a user sends to your web site originally came from your web site, not an outside attacker. 
Although this parameter is part of the Start URL check, referer validation protects against cross-site request forgery (CSRF) attacks, not Start URL attacks.<br> Default value: OFF<br> Possible values = OFF, if_present, always
	* </pre>
	*/
	public void set_refererheadercheck(String refererheadercheck) throws Exception{
		this.refererheadercheck = refererheadercheck;
	}

	/**
	* <pre>
	* Enable validation of Referer headers. 
Referer validation ensures that a web form that a user sends to your web site originally came from your web site, not an outside attacker. 
Although this parameter is part of the Start URL check, referer validation protects against cross-site request forgery (CSRF) attacks, not Start URL attacks.<br> Default value: OFF<br> Possible values = OFF, if_present, always
	* </pre>
	*/
	public String get_refererheadercheck() throws Exception {
		return this.refererheadercheck;
	}

	/**
	* <pre>
	* One or more Cookie Consistency actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -cookieConsistencyAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -cookieConsistencyAction none".<br> Default value: none<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_cookieconsistencyaction(String[] cookieconsistencyaction) throws Exception{
		this.cookieconsistencyaction = cookieconsistencyaction;
	}

	/**
	* <pre>
	* One or more Cookie Consistency actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -cookieConsistencyAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -cookieConsistencyAction none".<br> Default value: none<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_cookieconsistencyaction() throws Exception {
		return this.cookieconsistencyaction;
	}

	/**
	* <pre>
	* Perform the specified type of cookie transformation. 
Available settings function as follows: 
* Encryption - Encrypt cookies.
* Proxying - Mask contents of server cookies by sending proxy cookie to users.
* Cookie flags - Flag cookies as HTTP only to prevent scripts on user's browser from accessing and possibly modifying them.
CAUTION: Make sure that this parameter is set to ON if you are configuring any cookie transformations. If it is set to OFF, no cookie transformations are performed regardless of any other settings.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_cookietransforms(String cookietransforms) throws Exception{
		this.cookietransforms = cookietransforms;
	}

	/**
	* <pre>
	* Perform the specified type of cookie transformation. 
Available settings function as follows: 
* Encryption - Encrypt cookies.
* Proxying - Mask contents of server cookies by sending proxy cookie to users.
* Cookie flags - Flag cookies as HTTP only to prevent scripts on user's browser from accessing and possibly modifying them.
CAUTION: Make sure that this parameter is set to ON if you are configuring any cookie transformations. If it is set to OFF, no cookie transformations are performed regardless of any other settings.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_cookietransforms() throws Exception {
		return this.cookietransforms;
	}

	/**
	* <pre>
	* Type of cookie encryption. Available settings function as follows:
* None - Do not encrypt cookies.
* Decrypt Only - Decrypt encrypted cookies, but do not encrypt cookies.
* Encrypt Session Only - Encrypt session cookies, but not permanent cookies.
* Encrypt All - Encrypt all cookies.<br> Default value: none<br> Possible values = none, decryptOnly, encryptSessionOnly, encryptAll
	* </pre>
	*/
	public void set_cookieencryption(String cookieencryption) throws Exception{
		this.cookieencryption = cookieencryption;
	}

	/**
	* <pre>
	* Type of cookie encryption. Available settings function as follows:
* None - Do not encrypt cookies.
* Decrypt Only - Decrypt encrypted cookies, but do not encrypt cookies.
* Encrypt Session Only - Encrypt session cookies, but not permanent cookies.
* Encrypt All - Encrypt all cookies.<br> Default value: none<br> Possible values = none, decryptOnly, encryptSessionOnly, encryptAll
	* </pre>
	*/
	public String get_cookieencryption() throws Exception {
		return this.cookieencryption;
	}

	/**
	* <pre>
	* Cookie proxy setting. Available settings function as follows:
* None - Do not proxy cookies.
* Session Only - Proxy session cookies by using the NetScaler session ID, but do not proxy permanent cookies.<br> Default value: none<br> Possible values = none, sessionOnly
	* </pre>
	*/
	public void set_cookieproxying(String cookieproxying) throws Exception{
		this.cookieproxying = cookieproxying;
	}

	/**
	* <pre>
	* Cookie proxy setting. Available settings function as follows:
* None - Do not proxy cookies.
* Session Only - Proxy session cookies by using the NetScaler session ID, but do not proxy permanent cookies.<br> Default value: none<br> Possible values = none, sessionOnly
	* </pre>
	*/
	public String get_cookieproxying() throws Exception {
		return this.cookieproxying;
	}

	/**
	* <pre>
	* Add the specified flags to cookies. Available settings function as follows:
* None - Do not add flags to cookies.
* HTTP Only - Add the HTTP Only flag to cookies, which prevents scripts from accessing cookies.
* Secure - Add Secure flag to cookies.
* All - Add both HTTPOnly and Secure flags to cookies.<br> Default value: none<br> Possible values = none, httpOnly, secure, all
	* </pre>
	*/
	public void set_addcookieflags(String addcookieflags) throws Exception{
		this.addcookieflags = addcookieflags;
	}

	/**
	* <pre>
	* Add the specified flags to cookies. Available settings function as follows:
* None - Do not add flags to cookies.
* HTTP Only - Add the HTTP Only flag to cookies, which prevents scripts from accessing cookies.
* Secure - Add Secure flag to cookies.
* All - Add both HTTPOnly and Secure flags to cookies.<br> Default value: none<br> Possible values = none, httpOnly, secure, all
	* </pre>
	*/
	public String get_addcookieflags() throws Exception {
		return this.addcookieflags;
	}

	/**
	* <pre>
	* One or more Form Field Consistency actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -fieldConsistencyaction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -fieldConsistencyAction none".<br> Default value: none<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_fieldconsistencyaction(String[] fieldconsistencyaction) throws Exception{
		this.fieldconsistencyaction = fieldconsistencyaction;
	}

	/**
	* <pre>
	* One or more Form Field Consistency actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -fieldConsistencyaction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -fieldConsistencyAction none".<br> Default value: none<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_fieldconsistencyaction() throws Exception {
		return this.fieldconsistencyaction;
	}

	/**
	* <pre>
	* One or more Cross-Site Request Forgery (CSRF) Tagging actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -CSRFTagAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -CSRFTagAction none".<br> Default value: none<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_csrftagaction(String[] csrftagaction) throws Exception{
		this.csrftagaction = csrftagaction;
	}

	/**
	* <pre>
	* One or more Cross-Site Request Forgery (CSRF) Tagging actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -CSRFTagAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -CSRFTagAction none".<br> Default value: none<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_csrftagaction() throws Exception {
		return this.csrftagaction;
	}

	/**
	* <pre>
	* One or more Cross-Site Scripting (XSS) actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -crossSiteScriptingAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -crossSiteScriptingAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_crosssitescriptingaction(String[] crosssitescriptingaction) throws Exception{
		this.crosssitescriptingaction = crosssitescriptingaction;
	}

	/**
	* <pre>
	* One or more Cross-Site Scripting (XSS) actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -crossSiteScriptingAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -crossSiteScriptingAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_crosssitescriptingaction() throws Exception {
		return this.crosssitescriptingaction;
	}

	/**
	* <pre>
	* Transform cross-site scripts. This setting configures the application firewall to disable dangerous HTML instead of blocking the request. 
CAUTION: Make sure that this parameter is set to ON if you are configuring any cross-site scripting transformations. If it is set to OFF, no cross-site scripting transformations are performed regardless of any other settings.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_crosssitescriptingtransformunsafehtml(String crosssitescriptingtransformunsafehtml) throws Exception{
		this.crosssitescriptingtransformunsafehtml = crosssitescriptingtransformunsafehtml;
	}

	/**
	* <pre>
	* Transform cross-site scripts. This setting configures the application firewall to disable dangerous HTML instead of blocking the request. 
CAUTION: Make sure that this parameter is set to ON if you are configuring any cross-site scripting transformations. If it is set to OFF, no cross-site scripting transformations are performed regardless of any other settings.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_crosssitescriptingtransformunsafehtml() throws Exception {
		return this.crosssitescriptingtransformunsafehtml;
	}

	/**
	* <pre>
	* Check complete URLs for cross-site scripts, instead of just the query portions of URLs.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_crosssitescriptingcheckcompleteurls(String crosssitescriptingcheckcompleteurls) throws Exception{
		this.crosssitescriptingcheckcompleteurls = crosssitescriptingcheckcompleteurls;
	}

	/**
	* <pre>
	* Check complete URLs for cross-site scripts, instead of just the query portions of URLs.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_crosssitescriptingcheckcompleteurls() throws Exception {
		return this.crosssitescriptingcheckcompleteurls;
	}

	/**
	* <pre>
	* One or more HTML SQL Injection actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -SQLInjectionAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -SQLInjectionAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_sqlinjectionaction(String[] sqlinjectionaction) throws Exception{
		this.sqlinjectionaction = sqlinjectionaction;
	}

	/**
	* <pre>
	* One or more HTML SQL Injection actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -SQLInjectionAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -SQLInjectionAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_sqlinjectionaction() throws Exception {
		return this.sqlinjectionaction;
	}

	/**
	* <pre>
	* Transform injected SQL code. This setting configures the application firewall to disable SQL special strings instead of blocking the request. Since most SQL servers require a special string to activate an SQL keyword, in most cases a request that contains injected SQL code is safe if special strings are disabled.
CAUTION: Make sure that this parameter is set to ON if you are configuring any SQL injection transformations. If it is set to OFF, no SQL injection transformations are performed regardless of any other settings.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sqlinjectiontransformspecialchars(String sqlinjectiontransformspecialchars) throws Exception{
		this.sqlinjectiontransformspecialchars = sqlinjectiontransformspecialchars;
	}

	/**
	* <pre>
	* Transform injected SQL code. This setting configures the application firewall to disable SQL special strings instead of blocking the request. Since most SQL servers require a special string to activate an SQL keyword, in most cases a request that contains injected SQL code is safe if special strings are disabled.
CAUTION: Make sure that this parameter is set to ON if you are configuring any SQL injection transformations. If it is set to OFF, no SQL injection transformations are performed regardless of any other settings.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sqlinjectiontransformspecialchars() throws Exception {
		return this.sqlinjectiontransformspecialchars;
	}

	/**
	* <pre>
	* Check only form fields that contain SQL special strings (characters) for injected SQL code.
Most SQL servers require a special string to activate an SQL request, so SQL code without a special string is harmless to most SQL servers.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sqlinjectiononlycheckfieldswithsqlchars(String sqlinjectiononlycheckfieldswithsqlchars) throws Exception{
		this.sqlinjectiononlycheckfieldswithsqlchars = sqlinjectiononlycheckfieldswithsqlchars;
	}

	/**
	* <pre>
	* Check only form fields that contain SQL special strings (characters) for injected SQL code.
Most SQL servers require a special string to activate an SQL request, so SQL code without a special string is harmless to most SQL servers.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sqlinjectiononlycheckfieldswithsqlchars() throws Exception {
		return this.sqlinjectiononlycheckfieldswithsqlchars;
	}

	/**
	* <pre>
	* One or more Field Format actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of suggested web form fields and field format assignments.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -fieldFormatAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -fieldFormatAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_fieldformataction(String[] fieldformataction) throws Exception{
		this.fieldformataction = fieldformataction;
	}

	/**
	* <pre>
	* One or more Field Format actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of suggested web form fields and field format assignments.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -fieldFormatAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -fieldFormatAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_fieldformataction() throws Exception {
		return this.fieldformataction;
	}

	/**
	* <pre>
	* Designate a default field type to be applied to web form fields that do not have a field type explicitly assigned to them.<br> Minimum length =  1
	* </pre>
	*/
	public void set_defaultfieldformattype(String defaultfieldformattype) throws Exception{
		this.defaultfieldformattype = defaultfieldformattype;
	}

	/**
	* <pre>
	* Designate a default field type to be applied to web form fields that do not have a field type explicitly assigned to them.<br> Minimum length =  1
	* </pre>
	*/
	public String get_defaultfieldformattype() throws Exception {
		return this.defaultfieldformattype;
	}

	/**
	* <pre>
	* Minimum length, in characters, for data entered into a field that is assigned the default field type. 
To disable the minimum and maximum length settings and allow data of any length to be entered into the field, set this parameter to zero (0).<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_defaultfieldformatminlength(long defaultfieldformatminlength) throws Exception {
		this.defaultfieldformatminlength = new Long(defaultfieldformatminlength);
	}

	/**
	* <pre>
	* Minimum length, in characters, for data entered into a field that is assigned the default field type. 
To disable the minimum and maximum length settings and allow data of any length to be entered into the field, set this parameter to zero (0).<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_defaultfieldformatminlength(Long defaultfieldformatminlength) throws Exception{
		this.defaultfieldformatminlength = defaultfieldformatminlength;
	}

	/**
	* <pre>
	* Minimum length, in characters, for data entered into a field that is assigned the default field type. 
To disable the minimum and maximum length settings and allow data of any length to be entered into the field, set this parameter to zero (0).<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_defaultfieldformatminlength() throws Exception {
		return this.defaultfieldformatminlength;
	}

	/**
	* <pre>
	* Maximum length, in characters, for data entered into a field that is assigned the default field type.<br> Default value: 65535<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_defaultfieldformatmaxlength(long defaultfieldformatmaxlength) throws Exception {
		this.defaultfieldformatmaxlength = new Long(defaultfieldformatmaxlength);
	}

	/**
	* <pre>
	* Maximum length, in characters, for data entered into a field that is assigned the default field type.<br> Default value: 65535<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_defaultfieldformatmaxlength(Long defaultfieldformatmaxlength) throws Exception{
		this.defaultfieldformatmaxlength = defaultfieldformatmaxlength;
	}

	/**
	* <pre>
	* Maximum length, in characters, for data entered into a field that is assigned the default field type.<br> Default value: 65535<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_defaultfieldformatmaxlength() throws Exception {
		return this.defaultfieldformatmaxlength;
	}

	/**
	* <pre>
	* One or more Buffer Overflow actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -bufferOverflowAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -bufferOverflowAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_bufferoverflowaction(String[] bufferoverflowaction) throws Exception{
		this.bufferoverflowaction = bufferoverflowaction;
	}

	/**
	* <pre>
	* One or more Buffer Overflow actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -bufferOverflowAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -bufferOverflowAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_bufferoverflowaction() throws Exception {
		return this.bufferoverflowaction;
	}

	/**
	* <pre>
	* Maximum length, in characters, for URLs on your protected web sites. Requests with longer URLs are blocked.<br> Default value: 1024<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_bufferoverflowmaxurllength(long bufferoverflowmaxurllength) throws Exception {
		this.bufferoverflowmaxurllength = new Long(bufferoverflowmaxurllength);
	}

	/**
	* <pre>
	* Maximum length, in characters, for URLs on your protected web sites. Requests with longer URLs are blocked.<br> Default value: 1024<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_bufferoverflowmaxurllength(Long bufferoverflowmaxurllength) throws Exception{
		this.bufferoverflowmaxurllength = bufferoverflowmaxurllength;
	}

	/**
	* <pre>
	* Maximum length, in characters, for URLs on your protected web sites. Requests with longer URLs are blocked.<br> Default value: 1024<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_bufferoverflowmaxurllength() throws Exception {
		return this.bufferoverflowmaxurllength;
	}

	/**
	* <pre>
	* Maximum length, in characters, for HTTP headers in requests sent to your protected web sites. Requests with longer headers are blocked.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_bufferoverflowmaxheaderlength(long bufferoverflowmaxheaderlength) throws Exception {
		this.bufferoverflowmaxheaderlength = new Long(bufferoverflowmaxheaderlength);
	}

	/**
	* <pre>
	* Maximum length, in characters, for HTTP headers in requests sent to your protected web sites. Requests with longer headers are blocked.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_bufferoverflowmaxheaderlength(Long bufferoverflowmaxheaderlength) throws Exception{
		this.bufferoverflowmaxheaderlength = bufferoverflowmaxheaderlength;
	}

	/**
	* <pre>
	* Maximum length, in characters, for HTTP headers in requests sent to your protected web sites. Requests with longer headers are blocked.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_bufferoverflowmaxheaderlength() throws Exception {
		return this.bufferoverflowmaxheaderlength;
	}

	/**
	* <pre>
	* Maximum length, in characters, for cookies sent to your protected web sites. Requests with longer cookies are blocked.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_bufferoverflowmaxcookielength(long bufferoverflowmaxcookielength) throws Exception {
		this.bufferoverflowmaxcookielength = new Long(bufferoverflowmaxcookielength);
	}

	/**
	* <pre>
	* Maximum length, in characters, for cookies sent to your protected web sites. Requests with longer cookies are blocked.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_bufferoverflowmaxcookielength(Long bufferoverflowmaxcookielength) throws Exception{
		this.bufferoverflowmaxcookielength = bufferoverflowmaxcookielength;
	}

	/**
	* <pre>
	* Maximum length, in characters, for cookies sent to your protected web sites. Requests with longer cookies are blocked.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_bufferoverflowmaxcookielength() throws Exception {
		return this.bufferoverflowmaxcookielength;
	}

	/**
	* <pre>
	* One or more Credit Card actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -creditCardAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -creditCardAction none".<br> Default value: none<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_creditcardaction(String[] creditcardaction) throws Exception{
		this.creditcardaction = creditcardaction;
	}

	/**
	* <pre>
	* One or more Credit Card actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -creditCardAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -creditCardAction none".<br> Default value: none<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_creditcardaction() throws Exception {
		return this.creditcardaction;
	}

	/**
	* <pre>
	* Credit card types that the application firewall should protect.<br> Possible values = visa, mastercard, discover, amex, jcb, dinersclub
	* </pre>
	*/
	public void set_creditcard(String[] creditcard) throws Exception{
		this.creditcard = creditcard;
	}

	/**
	* <pre>
	* Credit card types that the application firewall should protect.<br> Possible values = visa, mastercard, discover, amex, jcb, dinersclub
	* </pre>
	*/
	public String[] get_creditcard() throws Exception {
		return this.creditcard;
	}

	/**
	* <pre>
	* Maximum number of credit card numbers that can appear on a web page served by your protected web sites. Pages that contain more credit card numbers are blocked, or the credit card numbers are masked.<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_creditcardmaxallowed(long creditcardmaxallowed) throws Exception {
		this.creditcardmaxallowed = new Long(creditcardmaxallowed);
	}

	/**
	* <pre>
	* Maximum number of credit card numbers that can appear on a web page served by your protected web sites. Pages that contain more credit card numbers are blocked, or the credit card numbers are masked.<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_creditcardmaxallowed(Long creditcardmaxallowed) throws Exception{
		this.creditcardmaxallowed = creditcardmaxallowed;
	}

	/**
	* <pre>
	* Maximum number of credit card numbers that can appear on a web page served by your protected web sites. Pages that contain more credit card numbers are blocked, or the credit card numbers are masked.<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public Long get_creditcardmaxallowed() throws Exception {
		return this.creditcardmaxallowed;
	}

	/**
	* <pre>
	* Mask any credit card number detected in a response by replacing each digit, except the digits in the final group, with the letter "X.".<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_creditcardxout(String creditcardxout) throws Exception{
		this.creditcardxout = creditcardxout;
	}

	/**
	* <pre>
	* Mask any credit card number detected in a response by replacing each digit, except the digits in the final group, with the letter "X.".<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_creditcardxout() throws Exception {
		return this.creditcardxout;
	}

	/**
	* <pre>
	* Default Content-Type header for requests. 
A Content-Type header can contain 0-255 letters, numbers, and the hyphen (-) and underscore (_) characters.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_requestcontenttype(String requestcontenttype) throws Exception{
		this.requestcontenttype = requestcontenttype;
	}

	/**
	* <pre>
	* Default Content-Type header for requests. 
A Content-Type header can contain 0-255 letters, numbers, and the hyphen (-) and underscore (_) characters.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_requestcontenttype() throws Exception {
		return this.requestcontenttype;
	}

	/**
	* <pre>
	* Default Content-Type header for responses. 
A Content-Type header can contain 0-255 letters, numbers, and the hyphen (-) and underscore (_) characters.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_responsecontenttype(String responsecontenttype) throws Exception{
		this.responsecontenttype = responsecontenttype;
	}

	/**
	* <pre>
	* Default Content-Type header for responses. 
A Content-Type header can contain 0-255 letters, numbers, and the hyphen (-) and underscore (_) characters.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_responsecontenttype() throws Exception {
		return this.responsecontenttype;
	}

	/**
	* <pre>
	* One or more XML Denial-of-Service (XDoS) actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLDoSAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLDoSAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_xmldosaction(String[] xmldosaction) throws Exception{
		this.xmldosaction = xmldosaction;
	}

	/**
	* <pre>
	* One or more XML Denial-of-Service (XDoS) actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLDoSAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLDoSAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_xmldosaction() throws Exception {
		return this.xmldosaction;
	}

	/**
	* <pre>
	* One or more XML Format actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLFormatAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLFormatAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_xmlformataction(String[] xmlformataction) throws Exception{
		this.xmlformataction = xmlformataction;
	}

	/**
	* <pre>
	* One or more XML Format actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLFormatAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLFormatAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_xmlformataction() throws Exception {
		return this.xmlformataction;
	}

	/**
	* <pre>
	* One or more XML SQL Injection actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLSQLInjectionAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLSQLInjectionAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_xmlsqlinjectionaction(String[] xmlsqlinjectionaction) throws Exception{
		this.xmlsqlinjectionaction = xmlsqlinjectionaction;
	}

	/**
	* <pre>
	* One or more XML SQL Injection actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLSQLInjectionAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLSQLInjectionAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_xmlsqlinjectionaction() throws Exception {
		return this.xmlsqlinjectionaction;
	}

	/**
	* <pre>
	* Check only form fields that contain SQL special characters, which most SQL servers require before accepting an SQL command, for injected SQL.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlsqlinjectiononlycheckfieldswithsqlchars(String xmlsqlinjectiononlycheckfieldswithsqlchars) throws Exception{
		this.xmlsqlinjectiononlycheckfieldswithsqlchars = xmlsqlinjectiononlycheckfieldswithsqlchars;
	}

	/**
	* <pre>
	* Check only form fields that contain SQL special characters, which most SQL servers require before accepting an SQL command, for injected SQL.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlsqlinjectiononlycheckfieldswithsqlchars() throws Exception {
		return this.xmlsqlinjectiononlycheckfieldswithsqlchars;
	}

	/**
	* <pre>
	* Parse comments in XML Data and exempt those sections of the request that are from the XML SQL Injection check. You must configure the type of comments that the application firewall is to detect and exempt from this security check. Available settings function as follows:
* Check all - Check all content.
* ANSI - Exempt content that is part of an ANSI (Mozilla-style) comment. 
* Nested - Exempt content that is part of a nested (Microsoft-style) comment.
* ANSI Nested - Exempt content that is part of any type of comment.<br> Default value: checkall<br> Possible values = checkall, ansi, nested, ansinested
	* </pre>
	*/
	public void set_xmlsqlinjectionparsecomments(String xmlsqlinjectionparsecomments) throws Exception{
		this.xmlsqlinjectionparsecomments = xmlsqlinjectionparsecomments;
	}

	/**
	* <pre>
	* Parse comments in XML Data and exempt those sections of the request that are from the XML SQL Injection check. You must configure the type of comments that the application firewall is to detect and exempt from this security check. Available settings function as follows:
* Check all - Check all content.
* ANSI - Exempt content that is part of an ANSI (Mozilla-style) comment. 
* Nested - Exempt content that is part of a nested (Microsoft-style) comment.
* ANSI Nested - Exempt content that is part of any type of comment.<br> Default value: checkall<br> Possible values = checkall, ansi, nested, ansinested
	* </pre>
	*/
	public String get_xmlsqlinjectionparsecomments() throws Exception {
		return this.xmlsqlinjectionparsecomments;
	}

	/**
	* <pre>
	* One or more XML Cross-Site Scripting actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLXSSAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLXSSAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_xmlxssaction(String[] xmlxssaction) throws Exception{
		this.xmlxssaction = xmlxssaction;
	}

	/**
	* <pre>
	* One or more XML Cross-Site Scripting actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLXSSAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLXSSAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_xmlxssaction() throws Exception {
		return this.xmlxssaction;
	}

	/**
	* <pre>
	* One or more Web Services Interoperability (WSI) actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLWSIAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLWSIAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_xmlwsiaction(String[] xmlwsiaction) throws Exception{
		this.xmlwsiaction = xmlwsiaction;
	}

	/**
	* <pre>
	* One or more Web Services Interoperability (WSI) actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLWSIAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLWSIAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_xmlwsiaction() throws Exception {
		return this.xmlwsiaction;
	}

	/**
	* <pre>
	* One or more XML Attachment actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLAttachmentAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLAttachmentAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_xmlattachmentaction(String[] xmlattachmentaction) throws Exception{
		this.xmlattachmentaction = xmlattachmentaction;
	}

	/**
	* <pre>
	* One or more XML Attachment actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Learn - Use the learning engine to generate a list of exceptions to this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLAttachmentAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLAttachmentAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_xmlattachmentaction() throws Exception {
		return this.xmlattachmentaction;
	}

	/**
	* <pre>
	* One or more XML Validation actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check. 

CLI users: To enable one or more actions, type "set appfw profile -XMLValidationAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLValidationAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public void set_xmlvalidationaction(String[] xmlvalidationaction) throws Exception{
		this.xmlvalidationaction = xmlvalidationaction;
	}

	/**
	* <pre>
	* One or more XML Validation actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check. 

CLI users: To enable one or more actions, type "set appfw profile -XMLValidationAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLValidationAction none".<br> Possible values = none, block, learn, log, stats
	* </pre>
	*/
	public String[] get_xmlvalidationaction() throws Exception {
		return this.xmlvalidationaction;
	}

	/**
	* <pre>
	* Name to assign to the XML Error Object, which the application firewall displays when a user request is blocked.
Must begin with a letter, number, or the underscore character \(_\), and must contain only letters, numbers, and the hyphen \(-\), period \(.\) pound \(\#\), space \( \), at (@), equals \(=\), colon \(:\), and underscore characters. Cannot be changed after the XML error object is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my XML error object" or 'my XML error object'\).<br> Minimum length =  1
	* </pre>
	*/
	public void set_xmlerrorobject(String xmlerrorobject) throws Exception{
		this.xmlerrorobject = xmlerrorobject;
	}

	/**
	* <pre>
	* Name to assign to the XML Error Object, which the application firewall displays when a user request is blocked.
Must begin with a letter, number, or the underscore character \(_\), and must contain only letters, numbers, and the hyphen \(-\), period \(.\) pound \(\#\), space \( \), at (@), equals \(=\), colon \(:\), and underscore characters. Cannot be changed after the XML error object is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my XML error object" or 'my XML error object'\).<br> Minimum length =  1
	* </pre>
	*/
	public String get_xmlerrorobject() throws Exception {
		return this.xmlerrorobject;
	}

	/**
	* <pre>
	* Object name for custom settings.
This check is applicable to Profile Type: HTML, XML. .<br> Minimum length =  1
	* </pre>
	*/
	public void set_customsettings(String customsettings) throws Exception{
		this.customsettings = customsettings;
	}

	/**
	* <pre>
	* Object name for custom settings.
This check is applicable to Profile Type: HTML, XML. .<br> Minimum length =  1
	* </pre>
	*/
	public String get_customsettings() throws Exception {
		return this.customsettings;
	}

	/**
	* <pre>
	* Object name for signatures.
This check is applicable to Profile Type: HTML, XML. .<br> Minimum length =  1
	* </pre>
	*/
	public void set_signatures(String signatures) throws Exception{
		this.signatures = signatures;
	}

	/**
	* <pre>
	* Object name for signatures.
This check is applicable to Profile Type: HTML, XML. .<br> Minimum length =  1
	* </pre>
	*/
	public String get_signatures() throws Exception {
		return this.signatures;
	}

	/**
	* <pre>
	* One or more XML SOAP Fault Filtering actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.
* Remove - Remove all violations for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLSOAPFaultAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLSOAPFaultAction none".<br> Possible values = none, block, log, remove, stats
	* </pre>
	*/
	public void set_xmlsoapfaultaction(String[] xmlsoapfaultaction) throws Exception{
		this.xmlsoapfaultaction = xmlsoapfaultaction;
	}

	/**
	* <pre>
	* One or more XML SOAP Fault Filtering actions. Available settings function as follows:
* Block - Block connections that violate this security check.
* Log - Log violations of this security check.
* Stats - Generate statistics for this security check.
* None - Disable all actions for this security check.
* Remove - Remove all violations for this security check.

CLI users: To enable one or more actions, type "set appfw profile -XMLSOAPFaultAction" followed by the actions to be enabled. To turn off all actions, type "set appfw profile -XMLSOAPFaultAction none".<br> Possible values = none, block, log, remove, stats
	* </pre>
	*/
	public String[] get_xmlsoapfaultaction() throws Exception {
		return this.xmlsoapfaultaction;
	}

	/**
	* <pre>
	* Send an imported HTML Error object to a user when a request is blocked, instead of redirecting the user to the designated Error URL.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_usehtmlerrorobject(String usehtmlerrorobject) throws Exception{
		this.usehtmlerrorobject = usehtmlerrorobject;
	}

	/**
	* <pre>
	* Send an imported HTML Error object to a user when a request is blocked, instead of redirecting the user to the designated Error URL.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_usehtmlerrorobject() throws Exception {
		return this.usehtmlerrorobject;
	}

	/**
	* <pre>
	* URL that application firewall uses as the Error URL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_errorurl(String errorurl) throws Exception{
		this.errorurl = errorurl;
	}

	/**
	* <pre>
	* URL that application firewall uses as the Error URL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_errorurl() throws Exception {
		return this.errorurl;
	}

	/**
	* <pre>
	* Name to assign to the HTML Error Object. 
Must begin with a letter, number, or the underscore character \(_\), and must contain only letters, numbers, and the hyphen \(-\), period \(.\) pound \(\#\), space \( \), at (@), equals \(=\), colon \(:\), and underscore characters. Cannot be changed after the HTML error object is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my HTML error object" or 'my HTML error object'\).<br> Minimum length =  1
	* </pre>
	*/
	public void set_htmlerrorobject(String htmlerrorobject) throws Exception{
		this.htmlerrorobject = htmlerrorobject;
	}

	/**
	* <pre>
	* Name to assign to the HTML Error Object. 
Must begin with a letter, number, or the underscore character \(_\), and must contain only letters, numbers, and the hyphen \(-\), period \(.\) pound \(\#\), space \( \), at (@), equals \(=\), colon \(:\), and underscore characters. Cannot be changed after the HTML error object is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my HTML error object" or 'my HTML error object'\).<br> Minimum length =  1
	* </pre>
	*/
	public String get_htmlerrorobject() throws Exception {
		return this.htmlerrorobject;
	}

	/**
	* <pre>
	* Log every profile match, regardless of security checks results.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_logeverypolicyhit(String logeverypolicyhit) throws Exception{
		this.logeverypolicyhit = logeverypolicyhit;
	}

	/**
	* <pre>
	* Log every profile match, regardless of security checks results.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_logeverypolicyhit() throws Exception {
		return this.logeverypolicyhit;
	}

	/**
	* <pre>
	* Strip HTML comments.
This check is applicable to Profile Type: HTML. .<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_stripcomments(String stripcomments) throws Exception{
		this.stripcomments = stripcomments;
	}

	/**
	* <pre>
	* Strip HTML comments.
This check is applicable to Profile Type: HTML. .<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_stripcomments() throws Exception {
		return this.stripcomments;
	}

	/**
	* <pre>
	* Strip HTML comments before forwarding a web page sent by a protected web site in response to a user request.<br> Default value: none<br> Possible values = none, all, exclude_script_tag
	* </pre>
	*/
	public void set_striphtmlcomments(String striphtmlcomments) throws Exception{
		this.striphtmlcomments = striphtmlcomments;
	}

	/**
	* <pre>
	* Strip HTML comments before forwarding a web page sent by a protected web site in response to a user request.<br> Default value: none<br> Possible values = none, all, exclude_script_tag
	* </pre>
	*/
	public String get_striphtmlcomments() throws Exception {
		return this.striphtmlcomments;
	}

	/**
	* <pre>
	* Exempt URLs that pass the Start URL closure check from additional security checks.<br> Default value: none<br> Possible values = none, all
	* </pre>
	*/
	public void set_stripxmlcomments(String stripxmlcomments) throws Exception{
		this.stripxmlcomments = stripxmlcomments;
	}

	/**
	* <pre>
	* Exempt URLs that pass the Start URL closure check from additional security checks.<br> Default value: none<br> Possible values = none, all
	* </pre>
	*/
	public String get_stripxmlcomments() throws Exception {
		return this.stripxmlcomments;
	}

	/**
	* <pre>
	* Exempt URLs that pass the Start URL closure check from additional security checks.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_exemptclosureurlsfromsecuritychecks(String exemptclosureurlsfromsecuritychecks) throws Exception{
		this.exemptclosureurlsfromsecuritychecks = exemptclosureurlsfromsecuritychecks;
	}

	/**
	* <pre>
	* Exempt URLs that pass the Start URL closure check from additional security checks.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_exemptclosureurlsfromsecuritychecks() throws Exception {
		return this.exemptclosureurlsfromsecuritychecks;
	}

	/**
	* <pre>
	* Default character set for protected web pages. Web pages sent by your protected web sites in response to user requests are assigned this character set if the page does not already specify a character set. The character sets supported by the application firewall are: 
* iso-8859-1 (English US)
* big5 (Chinese Traditional)
* gb2312 (Chinese Simplified)
* sjis (Japanese Shift-JIS)
* euc-jp (Japanese EUC-JP)
* iso-8859-9 (Turkish)
* utf-8 (Unicode)
* euc-kr (Korean).<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_defaultcharset(String defaultcharset) throws Exception{
		this.defaultcharset = defaultcharset;
	}

	/**
	* <pre>
	* Default character set for protected web pages. Web pages sent by your protected web sites in response to user requests are assigned this character set if the page does not already specify a character set. The character sets supported by the application firewall are: 
* iso-8859-1 (English US)
* big5 (Chinese Traditional)
* gb2312 (Chinese Simplified)
* sjis (Japanese Shift-JIS)
* euc-jp (Japanese EUC-JP)
* iso-8859-9 (Turkish)
* utf-8 (Unicode)
* euc-kr (Korean).<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_defaultcharset() throws Exception {
		return this.defaultcharset;
	}

	/**
	* <pre>
	* Maximum allowed HTTP post body size, in bytes.<br> Default value: 20000000<br> Minimum value =  0<br> Maximum value =  1000000000
	* </pre>
	*/
	public void set_postbodylimit(long postbodylimit) throws Exception {
		this.postbodylimit = new Long(postbodylimit);
	}

	/**
	* <pre>
	* Maximum allowed HTTP post body size, in bytes.<br> Default value: 20000000<br> Minimum value =  0<br> Maximum value =  1000000000
	* </pre>
	*/
	public void set_postbodylimit(Long postbodylimit) throws Exception{
		this.postbodylimit = postbodylimit;
	}

	/**
	* <pre>
	* Maximum allowed HTTP post body size, in bytes.<br> Default value: 20000000<br> Minimum value =  0<br> Maximum value =  1000000000
	* </pre>
	*/
	public Long get_postbodylimit() throws Exception {
		return this.postbodylimit;
	}

	/**
	* <pre>
	* Maximum allowed number of file uploads per form-submission request. The maximum setting (65535) allows an unlimited number of uploads.<br> Default value: 65535<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_fileuploadmaxnum(long fileuploadmaxnum) throws Exception {
		this.fileuploadmaxnum = new Long(fileuploadmaxnum);
	}

	/**
	* <pre>
	* Maximum allowed number of file uploads per form-submission request. The maximum setting (65535) allows an unlimited number of uploads.<br> Default value: 65535<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_fileuploadmaxnum(Long fileuploadmaxnum) throws Exception{
		this.fileuploadmaxnum = fileuploadmaxnum;
	}

	/**
	* <pre>
	* Maximum allowed number of file uploads per form-submission request. The maximum setting (65535) allows an unlimited number of uploads.<br> Default value: 65535<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_fileuploadmaxnum() throws Exception {
		return this.fileuploadmaxnum;
	}

	/**
	* <pre>
	* Perform HTML entity encoding for any special characters in responses sent by your protected web sites.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_canonicalizehtmlresponse(String canonicalizehtmlresponse) throws Exception{
		this.canonicalizehtmlresponse = canonicalizehtmlresponse;
	}

	/**
	* <pre>
	* Perform HTML entity encoding for any special characters in responses sent by your protected web sites.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_canonicalizehtmlresponse() throws Exception {
		return this.canonicalizehtmlresponse;
	}

	/**
	* <pre>
	* Enable tagging of web form fields for use by the Form Field Consistency and CSRF Form Tagging checks.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_enableformtagging(String enableformtagging) throws Exception{
		this.enableformtagging = enableformtagging;
	}

	/**
	* <pre>
	* Enable tagging of web form fields for use by the Form Field Consistency and CSRF Form Tagging checks.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_enableformtagging() throws Exception {
		return this.enableformtagging;
	}

	/**
	* <pre>
	* Perform sessionless Field Consistency Checks.<br> Default value: OFF<br> Possible values = OFF, ON, postOnly
	* </pre>
	*/
	public void set_sessionlessfieldconsistency(String sessionlessfieldconsistency) throws Exception{
		this.sessionlessfieldconsistency = sessionlessfieldconsistency;
	}

	/**
	* <pre>
	* Perform sessionless Field Consistency Checks.<br> Default value: OFF<br> Possible values = OFF, ON, postOnly
	* </pre>
	*/
	public String get_sessionlessfieldconsistency() throws Exception {
		return this.sessionlessfieldconsistency;
	}

	/**
	* <pre>
	* Enable session less URL Closure Checks.
This check is applicable to Profile Type: HTML. .<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sessionlessurlclosure(String sessionlessurlclosure) throws Exception{
		this.sessionlessurlclosure = sessionlessurlclosure;
	}

	/**
	* <pre>
	* Enable session less URL Closure Checks.
This check is applicable to Profile Type: HTML. .<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sessionlessurlclosure() throws Exception {
		return this.sessionlessurlclosure;
	}

	/**
	* <pre>
	* Allow ';' as a form field separator in URL queries and POST form bodies. .<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_semicolonfieldseparator(String semicolonfieldseparator) throws Exception{
		this.semicolonfieldseparator = semicolonfieldseparator;
	}

	/**
	* <pre>
	* Allow ';' as a form field separator in URL queries and POST form bodies. .<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_semicolonfieldseparator() throws Exception {
		return this.semicolonfieldseparator;
	}

	/**
	* <pre>
	* Exclude uploaded files from Form checks.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_excludefileuploadfromchecks(String excludefileuploadfromchecks) throws Exception{
		this.excludefileuploadfromchecks = excludefileuploadfromchecks;
	}

	/**
	* <pre>
	* Exclude uploaded files from Form checks.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_excludefileuploadfromchecks() throws Exception {
		return this.excludefileuploadfromchecks;
	}

	/**
	* <pre>
	* Parse HTML comments and exempt them from the HTML SQL Injection check. You must specify the type of comments that the application firewall is to detect and exempt from this security check. Available settings function as follows:
* Check all - Check all content.
* ANSI - Exempt content that is part of an ANSI (Mozilla-style) comment. 
* Nested - Exempt content that is part of a nested (Microsoft-style) comment.
* ANSI Nested - Exempt content that is part of any type of comment.<br> Possible values = checkall, ansi, nested, ansinested
	* </pre>
	*/
	public void set_sqlinjectionparsecomments(String sqlinjectionparsecomments) throws Exception{
		this.sqlinjectionparsecomments = sqlinjectionparsecomments;
	}

	/**
	* <pre>
	* Parse HTML comments and exempt them from the HTML SQL Injection check. You must specify the type of comments that the application firewall is to detect and exempt from this security check. Available settings function as follows:
* Check all - Check all content.
* ANSI - Exempt content that is part of an ANSI (Mozilla-style) comment. 
* Nested - Exempt content that is part of a nested (Microsoft-style) comment.
* ANSI Nested - Exempt content that is part of any type of comment.<br> Possible values = checkall, ansi, nested, ansinested
	* </pre>
	*/
	public String get_sqlinjectionparsecomments() throws Exception {
		return this.sqlinjectionparsecomments;
	}

	/**
	* <pre>
	* Configure the method that the application firewall uses to handle percent-encoded names and values. Available settings function as follows: 
* apache_mode - Apache format.
* asp_mode - Microsoft ASP format.
* secure_mode - Secure format.<br> Default value: secure_mode<br> Possible values = apache_mode, asp_mode, secure_mode
	* </pre>
	*/
	public void set_invalidpercenthandling(String invalidpercenthandling) throws Exception{
		this.invalidpercenthandling = invalidpercenthandling;
	}

	/**
	* <pre>
	* Configure the method that the application firewall uses to handle percent-encoded names and values. Available settings function as follows: 
* apache_mode - Apache format.
* asp_mode - Microsoft ASP format.
* secure_mode - Secure format.<br> Default value: secure_mode<br> Possible values = apache_mode, asp_mode, secure_mode
	* </pre>
	*/
	public String get_invalidpercenthandling() throws Exception {
		return this.invalidpercenthandling;
	}

	/**
	* <pre>
	* Application firewall profile type, which controls which security checks and settings are applied to content that is filtered with the profile. Available settings function as follows:
* HTML - HTML-based web sites.
* XML - XML-based web sites and services.
* HTML XML (Web 2.0) - Sites that contain both HTML and XML content, such as ATOM feeds, blogs, and RSS feeds.<br> Default value: HTML<br> Possible values = HTML, XML
	* </pre>
	*/
	public void set_type(String[] type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Application firewall profile type, which controls which security checks and settings are applied to content that is filtered with the profile. Available settings function as follows:
* HTML - HTML-based web sites.
* XML - XML-based web sites and services.
* HTML XML (Web 2.0) - Sites that contain both HTML and XML content, such as ATOM feeds, blogs, and RSS feeds.<br> Default value: HTML<br> Possible values = HTML, XML
	* </pre>
	*/
	public String[] get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Check request headers as well as web forms for injected SQL and cross-site scripts.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_checkrequestheaders(String checkrequestheaders) throws Exception{
		this.checkrequestheaders = checkrequestheaders;
	}

	/**
	* <pre>
	* Check request headers as well as web forms for injected SQL and cross-site scripts.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_checkrequestheaders() throws Exception {
		return this.checkrequestheaders;
	}

	/**
	* <pre>
	* Any comments about the purpose of profile, or other useful information about the profile.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments about the purpose of profile, or other useful information about the profile.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Source for tar archive.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_archivename(String archivename) throws Exception{
		this.archivename = archivename;
	}

	/**
	* <pre>
	* Source for tar archive.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_archivename() throws Exception {
		return this.archivename;
	}

	/**
	* <pre>
	* The web form originating URL.
	* </pre>
	*/
	public String get_csrftag() throws Exception {
		return this.csrftag;
	}

	/**
	* <pre>
	* Enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Indicates that a profile is a built-in entity.
	* </pre>
	*/
	public Boolean get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwprofile_response result = (appfwprofile_response) service.get_payload_formatter().string_to_resource(appfwprofile_response.class, response);
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
		return result.appfwprofile;
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
	* Use this API to add appfwprofile.
	*/
	public static base_response add(nitro_service client, appfwprofile resource) throws Exception {
		appfwprofile addresource = new appfwprofile();
		addresource.name = resource.name;
		addresource.defaults = resource.defaults;
		addresource.starturlaction = resource.starturlaction;
		addresource.starturlclosure = resource.starturlclosure;
		addresource.denyurlaction = resource.denyurlaction;
		addresource.refererheadercheck = resource.refererheadercheck;
		addresource.cookieconsistencyaction = resource.cookieconsistencyaction;
		addresource.cookietransforms = resource.cookietransforms;
		addresource.cookieencryption = resource.cookieencryption;
		addresource.cookieproxying = resource.cookieproxying;
		addresource.addcookieflags = resource.addcookieflags;
		addresource.fieldconsistencyaction = resource.fieldconsistencyaction;
		addresource.csrftagaction = resource.csrftagaction;
		addresource.crosssitescriptingaction = resource.crosssitescriptingaction;
		addresource.crosssitescriptingtransformunsafehtml = resource.crosssitescriptingtransformunsafehtml;
		addresource.crosssitescriptingcheckcompleteurls = resource.crosssitescriptingcheckcompleteurls;
		addresource.sqlinjectionaction = resource.sqlinjectionaction;
		addresource.sqlinjectiontransformspecialchars = resource.sqlinjectiontransformspecialchars;
		addresource.sqlinjectiononlycheckfieldswithsqlchars = resource.sqlinjectiononlycheckfieldswithsqlchars;
		addresource.fieldformataction = resource.fieldformataction;
		addresource.defaultfieldformattype = resource.defaultfieldformattype;
		addresource.defaultfieldformatminlength = resource.defaultfieldformatminlength;
		addresource.defaultfieldformatmaxlength = resource.defaultfieldformatmaxlength;
		addresource.bufferoverflowaction = resource.bufferoverflowaction;
		addresource.bufferoverflowmaxurllength = resource.bufferoverflowmaxurllength;
		addresource.bufferoverflowmaxheaderlength = resource.bufferoverflowmaxheaderlength;
		addresource.bufferoverflowmaxcookielength = resource.bufferoverflowmaxcookielength;
		addresource.creditcardaction = resource.creditcardaction;
		addresource.creditcard = resource.creditcard;
		addresource.creditcardmaxallowed = resource.creditcardmaxallowed;
		addresource.creditcardxout = resource.creditcardxout;
		addresource.requestcontenttype = resource.requestcontenttype;
		addresource.responsecontenttype = resource.responsecontenttype;
		addresource.xmldosaction = resource.xmldosaction;
		addresource.xmlformataction = resource.xmlformataction;
		addresource.xmlsqlinjectionaction = resource.xmlsqlinjectionaction;
		addresource.xmlsqlinjectiononlycheckfieldswithsqlchars = resource.xmlsqlinjectiononlycheckfieldswithsqlchars;
		addresource.xmlsqlinjectionparsecomments = resource.xmlsqlinjectionparsecomments;
		addresource.xmlxssaction = resource.xmlxssaction;
		addresource.xmlwsiaction = resource.xmlwsiaction;
		addresource.xmlattachmentaction = resource.xmlattachmentaction;
		addresource.xmlvalidationaction = resource.xmlvalidationaction;
		addresource.xmlerrorobject = resource.xmlerrorobject;
		addresource.customsettings = resource.customsettings;
		addresource.signatures = resource.signatures;
		addresource.xmlsoapfaultaction = resource.xmlsoapfaultaction;
		addresource.usehtmlerrorobject = resource.usehtmlerrorobject;
		addresource.errorurl = resource.errorurl;
		addresource.htmlerrorobject = resource.htmlerrorobject;
		addresource.logeverypolicyhit = resource.logeverypolicyhit;
		addresource.stripcomments = resource.stripcomments;
		addresource.striphtmlcomments = resource.striphtmlcomments;
		addresource.stripxmlcomments = resource.stripxmlcomments;
		addresource.exemptclosureurlsfromsecuritychecks = resource.exemptclosureurlsfromsecuritychecks;
		addresource.defaultcharset = resource.defaultcharset;
		addresource.postbodylimit = resource.postbodylimit;
		addresource.fileuploadmaxnum = resource.fileuploadmaxnum;
		addresource.canonicalizehtmlresponse = resource.canonicalizehtmlresponse;
		addresource.enableformtagging = resource.enableformtagging;
		addresource.sessionlessfieldconsistency = resource.sessionlessfieldconsistency;
		addresource.sessionlessurlclosure = resource.sessionlessurlclosure;
		addresource.semicolonfieldseparator = resource.semicolonfieldseparator;
		addresource.excludefileuploadfromchecks = resource.excludefileuploadfromchecks;
		addresource.sqlinjectionparsecomments = resource.sqlinjectionparsecomments;
		addresource.invalidpercenthandling = resource.invalidpercenthandling;
		addresource.type = resource.type;
		addresource.checkrequestheaders = resource.checkrequestheaders;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appfwprofile resources.
	*/
	public static base_responses add(nitro_service client, appfwprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile addresources[] = new appfwprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appfwprofile();
				addresources[i].name = resources[i].name;
				addresources[i].defaults = resources[i].defaults;
				addresources[i].starturlaction = resources[i].starturlaction;
				addresources[i].starturlclosure = resources[i].starturlclosure;
				addresources[i].denyurlaction = resources[i].denyurlaction;
				addresources[i].refererheadercheck = resources[i].refererheadercheck;
				addresources[i].cookieconsistencyaction = resources[i].cookieconsistencyaction;
				addresources[i].cookietransforms = resources[i].cookietransforms;
				addresources[i].cookieencryption = resources[i].cookieencryption;
				addresources[i].cookieproxying = resources[i].cookieproxying;
				addresources[i].addcookieflags = resources[i].addcookieflags;
				addresources[i].fieldconsistencyaction = resources[i].fieldconsistencyaction;
				addresources[i].csrftagaction = resources[i].csrftagaction;
				addresources[i].crosssitescriptingaction = resources[i].crosssitescriptingaction;
				addresources[i].crosssitescriptingtransformunsafehtml = resources[i].crosssitescriptingtransformunsafehtml;
				addresources[i].crosssitescriptingcheckcompleteurls = resources[i].crosssitescriptingcheckcompleteurls;
				addresources[i].sqlinjectionaction = resources[i].sqlinjectionaction;
				addresources[i].sqlinjectiontransformspecialchars = resources[i].sqlinjectiontransformspecialchars;
				addresources[i].sqlinjectiononlycheckfieldswithsqlchars = resources[i].sqlinjectiononlycheckfieldswithsqlchars;
				addresources[i].fieldformataction = resources[i].fieldformataction;
				addresources[i].defaultfieldformattype = resources[i].defaultfieldformattype;
				addresources[i].defaultfieldformatminlength = resources[i].defaultfieldformatminlength;
				addresources[i].defaultfieldformatmaxlength = resources[i].defaultfieldformatmaxlength;
				addresources[i].bufferoverflowaction = resources[i].bufferoverflowaction;
				addresources[i].bufferoverflowmaxurllength = resources[i].bufferoverflowmaxurllength;
				addresources[i].bufferoverflowmaxheaderlength = resources[i].bufferoverflowmaxheaderlength;
				addresources[i].bufferoverflowmaxcookielength = resources[i].bufferoverflowmaxcookielength;
				addresources[i].creditcardaction = resources[i].creditcardaction;
				addresources[i].creditcard = resources[i].creditcard;
				addresources[i].creditcardmaxallowed = resources[i].creditcardmaxallowed;
				addresources[i].creditcardxout = resources[i].creditcardxout;
				addresources[i].requestcontenttype = resources[i].requestcontenttype;
				addresources[i].responsecontenttype = resources[i].responsecontenttype;
				addresources[i].xmldosaction = resources[i].xmldosaction;
				addresources[i].xmlformataction = resources[i].xmlformataction;
				addresources[i].xmlsqlinjectionaction = resources[i].xmlsqlinjectionaction;
				addresources[i].xmlsqlinjectiononlycheckfieldswithsqlchars = resources[i].xmlsqlinjectiononlycheckfieldswithsqlchars;
				addresources[i].xmlsqlinjectionparsecomments = resources[i].xmlsqlinjectionparsecomments;
				addresources[i].xmlxssaction = resources[i].xmlxssaction;
				addresources[i].xmlwsiaction = resources[i].xmlwsiaction;
				addresources[i].xmlattachmentaction = resources[i].xmlattachmentaction;
				addresources[i].xmlvalidationaction = resources[i].xmlvalidationaction;
				addresources[i].xmlerrorobject = resources[i].xmlerrorobject;
				addresources[i].customsettings = resources[i].customsettings;
				addresources[i].signatures = resources[i].signatures;
				addresources[i].xmlsoapfaultaction = resources[i].xmlsoapfaultaction;
				addresources[i].usehtmlerrorobject = resources[i].usehtmlerrorobject;
				addresources[i].errorurl = resources[i].errorurl;
				addresources[i].htmlerrorobject = resources[i].htmlerrorobject;
				addresources[i].logeverypolicyhit = resources[i].logeverypolicyhit;
				addresources[i].stripcomments = resources[i].stripcomments;
				addresources[i].striphtmlcomments = resources[i].striphtmlcomments;
				addresources[i].stripxmlcomments = resources[i].stripxmlcomments;
				addresources[i].exemptclosureurlsfromsecuritychecks = resources[i].exemptclosureurlsfromsecuritychecks;
				addresources[i].defaultcharset = resources[i].defaultcharset;
				addresources[i].postbodylimit = resources[i].postbodylimit;
				addresources[i].fileuploadmaxnum = resources[i].fileuploadmaxnum;
				addresources[i].canonicalizehtmlresponse = resources[i].canonicalizehtmlresponse;
				addresources[i].enableformtagging = resources[i].enableformtagging;
				addresources[i].sessionlessfieldconsistency = resources[i].sessionlessfieldconsistency;
				addresources[i].sessionlessurlclosure = resources[i].sessionlessurlclosure;
				addresources[i].semicolonfieldseparator = resources[i].semicolonfieldseparator;
				addresources[i].excludefileuploadfromchecks = resources[i].excludefileuploadfromchecks;
				addresources[i].sqlinjectionparsecomments = resources[i].sqlinjectionparsecomments;
				addresources[i].invalidpercenthandling = resources[i].invalidpercenthandling;
				addresources[i].type = resources[i].type;
				addresources[i].checkrequestheaders = resources[i].checkrequestheaders;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appfwprofile deleteresource = new appfwprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwprofile.
	*/
	public static base_response delete(nitro_service client, appfwprofile resource) throws Exception {
		appfwprofile deleteresource = new appfwprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appfwprofile deleteresources[] = new appfwprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appfwprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwprofile resources.
	*/
	public static base_responses delete(nitro_service client, appfwprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile deleteresources[] = new appfwprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update appfwprofile.
	*/
	public static base_response update(nitro_service client, appfwprofile resource) throws Exception {
		appfwprofile updateresource = new appfwprofile();
		updateresource.name = resource.name;
		updateresource.starturlaction = resource.starturlaction;
		updateresource.starturlclosure = resource.starturlclosure;
		updateresource.denyurlaction = resource.denyurlaction;
		updateresource.refererheadercheck = resource.refererheadercheck;
		updateresource.cookieconsistencyaction = resource.cookieconsistencyaction;
		updateresource.cookietransforms = resource.cookietransforms;
		updateresource.cookieencryption = resource.cookieencryption;
		updateresource.cookieproxying = resource.cookieproxying;
		updateresource.addcookieflags = resource.addcookieflags;
		updateresource.fieldconsistencyaction = resource.fieldconsistencyaction;
		updateresource.csrftagaction = resource.csrftagaction;
		updateresource.crosssitescriptingaction = resource.crosssitescriptingaction;
		updateresource.crosssitescriptingtransformunsafehtml = resource.crosssitescriptingtransformunsafehtml;
		updateresource.crosssitescriptingcheckcompleteurls = resource.crosssitescriptingcheckcompleteurls;
		updateresource.sqlinjectionaction = resource.sqlinjectionaction;
		updateresource.sqlinjectiontransformspecialchars = resource.sqlinjectiontransformspecialchars;
		updateresource.sqlinjectiononlycheckfieldswithsqlchars = resource.sqlinjectiononlycheckfieldswithsqlchars;
		updateresource.fieldformataction = resource.fieldformataction;
		updateresource.defaultfieldformattype = resource.defaultfieldformattype;
		updateresource.defaultfieldformatminlength = resource.defaultfieldformatminlength;
		updateresource.defaultfieldformatmaxlength = resource.defaultfieldformatmaxlength;
		updateresource.bufferoverflowaction = resource.bufferoverflowaction;
		updateresource.bufferoverflowmaxurllength = resource.bufferoverflowmaxurllength;
		updateresource.bufferoverflowmaxheaderlength = resource.bufferoverflowmaxheaderlength;
		updateresource.bufferoverflowmaxcookielength = resource.bufferoverflowmaxcookielength;
		updateresource.creditcardaction = resource.creditcardaction;
		updateresource.creditcard = resource.creditcard;
		updateresource.creditcardmaxallowed = resource.creditcardmaxallowed;
		updateresource.creditcardxout = resource.creditcardxout;
		updateresource.requestcontenttype = resource.requestcontenttype;
		updateresource.responsecontenttype = resource.responsecontenttype;
		updateresource.xmldosaction = resource.xmldosaction;
		updateresource.xmlformataction = resource.xmlformataction;
		updateresource.xmlsqlinjectionaction = resource.xmlsqlinjectionaction;
		updateresource.xmlsqlinjectiononlycheckfieldswithsqlchars = resource.xmlsqlinjectiononlycheckfieldswithsqlchars;
		updateresource.xmlsqlinjectionparsecomments = resource.xmlsqlinjectionparsecomments;
		updateresource.xmlxssaction = resource.xmlxssaction;
		updateresource.xmlwsiaction = resource.xmlwsiaction;
		updateresource.xmlattachmentaction = resource.xmlattachmentaction;
		updateresource.xmlvalidationaction = resource.xmlvalidationaction;
		updateresource.xmlerrorobject = resource.xmlerrorobject;
		updateresource.customsettings = resource.customsettings;
		updateresource.signatures = resource.signatures;
		updateresource.xmlsoapfaultaction = resource.xmlsoapfaultaction;
		updateresource.usehtmlerrorobject = resource.usehtmlerrorobject;
		updateresource.errorurl = resource.errorurl;
		updateresource.htmlerrorobject = resource.htmlerrorobject;
		updateresource.logeverypolicyhit = resource.logeverypolicyhit;
		updateresource.stripcomments = resource.stripcomments;
		updateresource.striphtmlcomments = resource.striphtmlcomments;
		updateresource.stripxmlcomments = resource.stripxmlcomments;
		updateresource.exemptclosureurlsfromsecuritychecks = resource.exemptclosureurlsfromsecuritychecks;
		updateresource.defaultcharset = resource.defaultcharset;
		updateresource.postbodylimit = resource.postbodylimit;
		updateresource.fileuploadmaxnum = resource.fileuploadmaxnum;
		updateresource.canonicalizehtmlresponse = resource.canonicalizehtmlresponse;
		updateresource.enableformtagging = resource.enableformtagging;
		updateresource.sessionlessfieldconsistency = resource.sessionlessfieldconsistency;
		updateresource.sessionlessurlclosure = resource.sessionlessurlclosure;
		updateresource.semicolonfieldseparator = resource.semicolonfieldseparator;
		updateresource.excludefileuploadfromchecks = resource.excludefileuploadfromchecks;
		updateresource.sqlinjectionparsecomments = resource.sqlinjectionparsecomments;
		updateresource.invalidpercenthandling = resource.invalidpercenthandling;
		updateresource.type = resource.type;
		updateresource.checkrequestheaders = resource.checkrequestheaders;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appfwprofile resources.
	*/
	public static base_responses update(nitro_service client, appfwprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile updateresources[] = new appfwprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].starturlaction = resources[i].starturlaction;
				updateresources[i].starturlclosure = resources[i].starturlclosure;
				updateresources[i].denyurlaction = resources[i].denyurlaction;
				updateresources[i].refererheadercheck = resources[i].refererheadercheck;
				updateresources[i].cookieconsistencyaction = resources[i].cookieconsistencyaction;
				updateresources[i].cookietransforms = resources[i].cookietransforms;
				updateresources[i].cookieencryption = resources[i].cookieencryption;
				updateresources[i].cookieproxying = resources[i].cookieproxying;
				updateresources[i].addcookieflags = resources[i].addcookieflags;
				updateresources[i].fieldconsistencyaction = resources[i].fieldconsistencyaction;
				updateresources[i].csrftagaction = resources[i].csrftagaction;
				updateresources[i].crosssitescriptingaction = resources[i].crosssitescriptingaction;
				updateresources[i].crosssitescriptingtransformunsafehtml = resources[i].crosssitescriptingtransformunsafehtml;
				updateresources[i].crosssitescriptingcheckcompleteurls = resources[i].crosssitescriptingcheckcompleteurls;
				updateresources[i].sqlinjectionaction = resources[i].sqlinjectionaction;
				updateresources[i].sqlinjectiontransformspecialchars = resources[i].sqlinjectiontransformspecialchars;
				updateresources[i].sqlinjectiononlycheckfieldswithsqlchars = resources[i].sqlinjectiononlycheckfieldswithsqlchars;
				updateresources[i].fieldformataction = resources[i].fieldformataction;
				updateresources[i].defaultfieldformattype = resources[i].defaultfieldformattype;
				updateresources[i].defaultfieldformatminlength = resources[i].defaultfieldformatminlength;
				updateresources[i].defaultfieldformatmaxlength = resources[i].defaultfieldformatmaxlength;
				updateresources[i].bufferoverflowaction = resources[i].bufferoverflowaction;
				updateresources[i].bufferoverflowmaxurllength = resources[i].bufferoverflowmaxurllength;
				updateresources[i].bufferoverflowmaxheaderlength = resources[i].bufferoverflowmaxheaderlength;
				updateresources[i].bufferoverflowmaxcookielength = resources[i].bufferoverflowmaxcookielength;
				updateresources[i].creditcardaction = resources[i].creditcardaction;
				updateresources[i].creditcard = resources[i].creditcard;
				updateresources[i].creditcardmaxallowed = resources[i].creditcardmaxallowed;
				updateresources[i].creditcardxout = resources[i].creditcardxout;
				updateresources[i].requestcontenttype = resources[i].requestcontenttype;
				updateresources[i].responsecontenttype = resources[i].responsecontenttype;
				updateresources[i].xmldosaction = resources[i].xmldosaction;
				updateresources[i].xmlformataction = resources[i].xmlformataction;
				updateresources[i].xmlsqlinjectionaction = resources[i].xmlsqlinjectionaction;
				updateresources[i].xmlsqlinjectiononlycheckfieldswithsqlchars = resources[i].xmlsqlinjectiononlycheckfieldswithsqlchars;
				updateresources[i].xmlsqlinjectionparsecomments = resources[i].xmlsqlinjectionparsecomments;
				updateresources[i].xmlxssaction = resources[i].xmlxssaction;
				updateresources[i].xmlwsiaction = resources[i].xmlwsiaction;
				updateresources[i].xmlattachmentaction = resources[i].xmlattachmentaction;
				updateresources[i].xmlvalidationaction = resources[i].xmlvalidationaction;
				updateresources[i].xmlerrorobject = resources[i].xmlerrorobject;
				updateresources[i].customsettings = resources[i].customsettings;
				updateresources[i].signatures = resources[i].signatures;
				updateresources[i].xmlsoapfaultaction = resources[i].xmlsoapfaultaction;
				updateresources[i].usehtmlerrorobject = resources[i].usehtmlerrorobject;
				updateresources[i].errorurl = resources[i].errorurl;
				updateresources[i].htmlerrorobject = resources[i].htmlerrorobject;
				updateresources[i].logeverypolicyhit = resources[i].logeverypolicyhit;
				updateresources[i].stripcomments = resources[i].stripcomments;
				updateresources[i].striphtmlcomments = resources[i].striphtmlcomments;
				updateresources[i].stripxmlcomments = resources[i].stripxmlcomments;
				updateresources[i].exemptclosureurlsfromsecuritychecks = resources[i].exemptclosureurlsfromsecuritychecks;
				updateresources[i].defaultcharset = resources[i].defaultcharset;
				updateresources[i].postbodylimit = resources[i].postbodylimit;
				updateresources[i].fileuploadmaxnum = resources[i].fileuploadmaxnum;
				updateresources[i].canonicalizehtmlresponse = resources[i].canonicalizehtmlresponse;
				updateresources[i].enableformtagging = resources[i].enableformtagging;
				updateresources[i].sessionlessfieldconsistency = resources[i].sessionlessfieldconsistency;
				updateresources[i].sessionlessurlclosure = resources[i].sessionlessurlclosure;
				updateresources[i].semicolonfieldseparator = resources[i].semicolonfieldseparator;
				updateresources[i].excludefileuploadfromchecks = resources[i].excludefileuploadfromchecks;
				updateresources[i].sqlinjectionparsecomments = resources[i].sqlinjectionparsecomments;
				updateresources[i].invalidpercenthandling = resources[i].invalidpercenthandling;
				updateresources[i].type = resources[i].type;
				updateresources[i].checkrequestheaders = resources[i].checkrequestheaders;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appfwprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appfwprofile resource, String[] args) throws Exception{
		appfwprofile unsetresource = new appfwprofile();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of appfwprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appfwprofile unsetresources[] = new appfwprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new appfwprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appfwprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, appfwprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile unsetresources[] = new appfwprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new appfwprofile();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to restore appfwprofile.
	*/
	public static base_response restore(nitro_service client, appfwprofile resource) throws Exception {
		appfwprofile restoreresource = new appfwprofile();
		restoreresource.archivename = resource.archivename;
		return restoreresource.perform_operation(client,"restore");
	}

	/**
	* Use this API to restore appfwprofile resources.
	*/
	public static base_responses restore(nitro_service client, appfwprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile restoreresources[] = new appfwprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				restoreresources[i] = new appfwprofile();
				restoreresources[i].archivename = resources[i].archivename;
			}
			result = perform_operation_bulk_request(client, restoreresources,"restore");
		}
		return result;
	}

	/**
	* Use this API to fetch all the appfwprofile resources that are configured on netscaler.
	*/
	public static appfwprofile[] get(nitro_service service) throws Exception{
		appfwprofile obj = new appfwprofile();
		appfwprofile[] response = (appfwprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwprofile resources that are configured on netscaler.
	*/
	public static appfwprofile[] get(nitro_service service, options option) throws Exception{
		appfwprofile obj = new appfwprofile();
		appfwprofile[] response = (appfwprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appfwprofile resource of given name .
	*/
	public static appfwprofile get(nitro_service service, String name) throws Exception{
		appfwprofile obj = new appfwprofile();
		obj.set_name(name);
		appfwprofile response = (appfwprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwprofile resources of given names .
	*/
	public static appfwprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appfwprofile response[] = new appfwprofile[name.length];
			appfwprofile obj[] = new appfwprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appfwprofile();
				obj[i].set_name(name[i]);
				response[i] = (appfwprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appfwprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwprofile obj = new appfwprofile();
		options option = new options();
		option.set_filter(filter);
		appfwprofile[] response = (appfwprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwprofile obj = new appfwprofile();
		options option = new options();
		option.set_filter(filter);
		appfwprofile[] response = (appfwprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwprofile obj = new appfwprofile();
		options option = new options();
		option.set_count(true);
		appfwprofile[] response = (appfwprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwprofile obj = new appfwprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile[] response = (appfwprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwprofile obj = new appfwprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile[] response = (appfwprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cookieconsistencyactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class denyurlactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class xmlsqlinjectionparsecommentsEnum {
		public static final String checkall = "checkall";
		public static final String ansi = "ansi";
		public static final String nested = "nested";
		public static final String ansinested = "ansinested";
	}
	public static class sessionlessfieldconsistencyEnum {
		public static final String OFF = "OFF";
		public static final String ON = "ON";
		public static final String postOnly = "postOnly";
	}
	public static class checkrequestheadersEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class creditcardactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stripxmlcommentsEnum {
		public static final String none = "none";
		public static final String all = "all";
	}
	public static class sqlinjectiononlycheckfieldswithsqlcharsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class striphtmlcommentsEnum {
		public static final String none = "none";
		public static final String all = "all";
		public static final String exclude_script_tag = "exclude_script_tag";
	}
	public static class starturlactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class sqlinjectiontransformspecialcharsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class enableformtaggingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class fieldconsistencyactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class excludefileuploadfromchecksEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class refererheadercheckEnum {
		public static final String OFF = "OFF";
		public static final String if_present = "if_present";
		public static final String always = "always";
	}
	public static class exemptclosureurlsfromsecuritychecksEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class usehtmlerrorobjectEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class creditcardxoutEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlwsiactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class canonicalizehtmlresponseEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlattachmentactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class csrftagactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class cookieproxyingEnum {
		public static final String none = "none";
		public static final String sessionOnly = "sessionOnly";
	}
	public static class fieldformatactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class cookietransformsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class logeverypolicyhitEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class typeEnum {
		public static final String HTML = "HTML";
		public static final String XML = "XML";
	}
	public static class crosssitescriptingtransformunsafehtmlEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class stripcommentsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class defaultsEnum {
		public static final String basic = "basic";
		public static final String advanced = "advanced";
	}
	public static class xmlsqlinjectionactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class semicolonfieldseparatorEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class crosssitescriptingcheckcompleteurlsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmldosactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class xmlxssactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class xmlvalidationactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class sqlinjectionactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class xmlformatactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class creditcardEnum {
		public static final String visa = "visa";
		public static final String mastercard = "mastercard";
		public static final String discover = "discover";
		public static final String amex = "amex";
		public static final String jcb = "jcb";
		public static final String dinersclub = "dinersclub";
	}
	public static class starturlclosureEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class bufferoverflowactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class addcookieflagsEnum {
		public static final String none = "none";
		public static final String httpOnly = "httpOnly";
		public static final String secure = "secure";
		public static final String all = "all";
	}
	public static class xmlsqlinjectiononlycheckfieldswithsqlcharsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class sessionlessurlclosureEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class sqlinjectionparsecommentsEnum {
		public static final String checkall = "checkall";
		public static final String ansi = "ansi";
		public static final String nested = "nested";
		public static final String ansinested = "ansinested";
	}
	public static class cookieencryptionEnum {
		public static final String none = "none";
		public static final String decryptOnly = "decryptOnly";
		public static final String encryptSessionOnly = "encryptSessionOnly";
		public static final String encryptAll = "encryptAll";
	}
	public static class xmlsoapfaultactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String log = "log";
		public static final String remove = "remove";
		public static final String stats = "stats";
	}
	public static class crosssitescriptingactionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String learn = "learn";
		public static final String log = "log";
		public static final String stats = "stats";
	}
	public static class invalidpercenthandlingEnum {
		public static final String apache_mode = "apache_mode";
		public static final String asp_mode = "asp_mode";
		public static final String secure_mode = "secure_mode";
	}
}
