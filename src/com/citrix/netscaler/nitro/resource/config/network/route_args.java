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

package com.citrix.netscaler.nitro.resource.config.network;

/**
	* Provides additional arguments required for fetching the route resource.
	*/

public class route_args 
{
	private String routetype;
	private Boolean detail;

	/**
	* <pre>
	* The type of routes to be shown.<br> Possible values = CONNECTED, STATIC, DYNAMIC, OSPF, ISIS, RIP, BGP
	* </pre>
	*/
	public void set_routetype(String routetype) throws Exception{
		this.routetype = routetype;
	}

	/**
	* <pre>
	* The type of routes to be shown.<br> Possible values = CONNECTED, STATIC, DYNAMIC, OSPF, ISIS, RIP, BGP
	* </pre>
	*/
	public String get_routetype() throws Exception {
		return this.routetype;
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public void set_detail(boolean detail) throws Exception {
		this.detail = new Boolean(detail);
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public void set_detail(Boolean detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public Boolean get_detail() throws Exception {
		return this.detail;
	}

	public static class routetypeEnum {
		public static final String CONNECTED = "CONNECTED";
		public static final String STATIC = "STATIC";
		public static final String DYNAMIC = "DYNAMIC";
		public static final String OSPF = "OSPF";
		public static final String ISIS = "ISIS";
		public static final String RIP = "RIP";
		public static final String BGP = "BGP";
	}
}
