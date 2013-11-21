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
	* Provides additional arguments required for fetching the iptunnel resource.
	*/

public class iptunnel_args 
{
	private String remote;
	private String remotesubnetmask;

	/**
	* <pre>
	* Public IPv4 address, of the remote device, used to set up the tunnel. For this parameter, you can alternativelyspecify a network address if you specify IPIP (IP over IP) for the Protocol parameter.<br> Minimum length =  1
	* </pre>
	*/
	public void set_remote(String remote) throws Exception{
		this.remote = remote;
	}

	/**
	* <pre>
	* Public IPv4 address, of the remote device, used to set up the tunnel. For this parameter, you can alternativelyspecify a network address if you specify IPIP (IP over IP) for the Protocol parameter.<br> Minimum length =  1
	* </pre>
	*/
	public String get_remote() throws Exception {
		return this.remote;
	}

	/**
	* <pre>
	* Subnet mask of the remote IP address of the tunnel.
	* </pre>
	*/
	public void set_remotesubnetmask(String remotesubnetmask) throws Exception{
		this.remotesubnetmask = remotesubnetmask;
	}

	/**
	* <pre>
	* Subnet mask of the remote IP address of the tunnel.
	* </pre>
	*/
	public String get_remotesubnetmask() throws Exception {
		return this.remotesubnetmask;
	}

}
