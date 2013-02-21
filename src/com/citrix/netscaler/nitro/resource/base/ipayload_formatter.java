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

/**
 * Provides classes necessary to create base_resource,base_response,Json,
 * login,logout and reboot objects.
 */
package com.citrix.netscaler.nitro.resource.base;

import com.citrix.netscaler.nitro.service.options;

/**
 * 
 * ipayload_formatter is the interface class for Json.
 * This includes methods for converting Json to nitro resource and vice versa.
 *
 */
public interface ipayload_formatter 
{
	public String resource_to_string(base_resource resrc);
	public String resource_to_string(base_resource resrc, String id, options option, Boolean warning, String onerror);
	public String unset_string(base_resource resrc, String id, options option, String args[], Boolean warning) throws Exception;
	public String unset_string(base_resource[] resrc, String id, options option, String args[], Boolean warning, String onerror) throws Exception;
	public String resource_to_string(base_resource resrc[], String id, options option, Boolean warning, String onerror);
	public Object string_to_resource(Class<?> responseClass, String response);
}
