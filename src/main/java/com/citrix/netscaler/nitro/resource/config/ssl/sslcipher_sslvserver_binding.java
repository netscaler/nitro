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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslcipher_sslvserver_binding_response extends base_response
{
	public sslcipher_sslvserver_binding[] sslcipher_sslvserver_binding;
}
/**
	* Binding class showing the sslvserver that can be bound to sslcipher.
	*/

public class sslcipher_sslvserver_binding extends base_resource
{
	private String ciphergroupname;
	private String vservername;
	private Boolean vserver;
	private String cipheroperation;
	private String ciphgrpals;

	/**
	* <pre>
	* The name of the user-defined cipher group.
	If the cipher group does not exist on the system, a new group is created with the specified name. The ciphers are added to this group.
	If a group identified by cipherGroupName already exists on the system, the ciphers are added to it.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphergroupname(String ciphergroupname) throws Exception{
		this.ciphergroupname = ciphergroupname;
	}

	/**
	* <pre>
	* The name of the user-defined cipher group.
	If the cipher group does not exist on the system, a new group is created with the specified name. The ciphers are added to this group.
	If a group identified by cipherGroupName already exists on the system, the ciphers are added to it.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphergroupname() throws Exception {
		return this.ciphergroupname;
	}

	/**
	* <pre>
	* A cipher-suite can consist of an individual cipher name, the system predefined cipher-alias name, or user defined cipher-group name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphgrpals(String ciphgrpals) throws Exception{
		this.ciphgrpals = ciphgrpals;
	}

	/**
	* <pre>
	* A cipher-suite can consist of an individual cipher name, the system predefined cipher-alias name, or user defined cipher-group name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphgrpals() throws Exception {
		return this.ciphgrpals;
	}

	/**
	* <pre>
	* The operation that is performed when adding the cipher-suite.

Possible cipher operations are:
	ADD - Appends the given cipher-suite to the existing one configured for the virtual server.
	REM - Removes the given cipher-suite from the existing one configured for the virtual server.
	ORD - Overrides the current configured cipher-suite for the virtual server with the given cipher-suite.<br> Default value: 6<br> Possible values = ADD, REM, ORD
	* </pre>
	*/
	public void set_cipheroperation(String cipheroperation) throws Exception{
		this.cipheroperation = cipheroperation;
	}

	/**
	* <pre>
	* The operation that is performed when adding the cipher-suite.

Possible cipher operations are:
	ADD - Appends the given cipher-suite to the existing one configured for the virtual server.
	REM - Removes the given cipher-suite from the existing one configured for the virtual server.
	ORD - Overrides the current configured cipher-suite for the virtual server with the given cipher-suite.<br> Default value: 6<br> Possible values = ADD, REM, ORD
	* </pre>
	*/
	public String get_cipheroperation() throws Exception {
		return this.cipheroperation;
	}

	/**
	* <pre>
	* Select the -vServer flag when the cipher
 operation is performed on an SSL virtual server.

Note: By default the bind ssl cipher command internally assumes the flag of -vServer argument. Hence, while working with the SSL vserver, you need not specify this flag.
	* </pre>
	*/
	public void set_vserver(boolean vserver) throws Exception {
		this.vserver = new Boolean(vserver);
	}

	/**
	* <pre>
	* Select the -vServer flag when the cipher
 operation is performed on an SSL virtual server.

Note: By default the bind ssl cipher command internally assumes the flag of -vServer argument. Hence, while working with the SSL vserver, you need not specify this flag.
	* </pre>
	*/
	public void set_vserver(Boolean vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* Select the -vServer flag when the cipher
 operation is performed on an SSL virtual server.

Note: By default the bind ssl cipher command internally assumes the flag of -vServer argument. Hence, while working with the SSL vserver, you need not specify this flag.
	* </pre>
	*/
	public Boolean get_vserver() throws Exception {
		return this.vserver;
	}

	/**
	* <pre>
	* The name of the SSL virtual server to which the cipher-suite is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* The name of the SSL virtual server to which the cipher-suite is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcipher_sslvserver_binding_response result = (sslcipher_sslvserver_binding_response) service.get_payload_formatter().string_to_resource(sslcipher_sslvserver_binding_response.class, response);
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
		return result.sslcipher_sslvserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ciphergroupname;
	}

	public static class cipheroperationEnum {
		public static final String ADD = "ADD";
		public static final String REM = "REM";
		public static final String ORD = "ORD";
	}

}