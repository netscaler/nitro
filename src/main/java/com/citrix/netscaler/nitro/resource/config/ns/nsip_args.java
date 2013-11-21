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

/**
	* Provides additional arguments required for fetching the nsip resource.
	*/

public class nsip_args 
{
	private String type;

	/**
	* <pre>
	* Display the settings of all IPv4 addresses of a particular type.<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Display the settings of all IPv4 addresses of a particular type.<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	public static class typeEnum {
		public static final String SNIP = "SNIP";
		public static final String VIP = "VIP";
		public static final String MIP = "MIP";
		public static final String NSIP = "NSIP";
		public static final String GSLBsiteIP = "GSLBsiteIP";
		public static final String CLIP = "CLIP";
	}
}
