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
	* Provides additional arguments required for fetching the ip6tunnel resource.
	*/

public class ip6tunnel_args 
{
	private String remote;

	/**
	* <pre>
	* The remote IP address or subnet of the tunnel.<br> Minimum length =  1
	* </pre>
	*/
	public void set_remote(String remote) throws Exception{
		this.remote = remote;
	}

	/**
	* <pre>
	* The remote IP address or subnet of the tunnel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_remote() throws Exception {
		return this.remote;
	}

}
