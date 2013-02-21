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

/**
	* Provides additional arguments required for fetching the appfwlearningdata resource.
	*/

public class appfwlearningdata_args 
{
	private String profilename;
	private String securitycheck;

	/**
	* <pre>
	* Application Firewall profile name.
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* Application Firewall profile name.
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Security check.<br> Possible values = startURL, cookieConsistency, fieldConsistency, crossSiteScripting, SQLInjection, fieldFormat, CSRFtag, XMLDoSCheck, XMLWSICheck, XMLAttachmentCheck, TotalXMLRequests
	* </pre>
	*/
	public void set_securitycheck(String securitycheck) throws Exception{
		this.securitycheck = securitycheck;
	}

	/**
	* <pre>
	* Security check.<br> Possible values = startURL, cookieConsistency, fieldConsistency, crossSiteScripting, SQLInjection, fieldFormat, CSRFtag, XMLDoSCheck, XMLWSICheck, XMLAttachmentCheck, TotalXMLRequests
	* </pre>
	*/
	public String get_securitycheck() throws Exception {
		return this.securitycheck;
	}

	public static class securitycheckEnum {
		public static final String startURL = "startURL";
		public static final String cookieConsistency = "cookieConsistency";
		public static final String fieldConsistency = "fieldConsistency";
		public static final String crossSiteScripting = "crossSiteScripting";
		public static final String SQLInjection = "SQLInjection";
		public static final String fieldFormat = "fieldFormat";
		public static final String CSRFtag = "CSRFtag";
		public static final String XMLDoSCheck = "XMLDoSCheck";
		public static final String XMLWSICheck = "XMLWSICheck";
		public static final String XMLAttachmentCheck = "XMLAttachmentCheck";
		public static final String TotalXMLRequests = "TotalXMLRequests";
	}
}
