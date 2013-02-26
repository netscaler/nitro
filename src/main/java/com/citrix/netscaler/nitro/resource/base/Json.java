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

package com.citrix.netscaler.nitro.resource.base;

import com.google.gson.Gson;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.nitro_util;

/**
 * 
 * Json class implements the methods in ipayload_formatter interface.
 *
 */
public class Json implements ipayload_formatter 
{	
	/**
	 * Converts netscaler resource to Json string.
	 * @param resrc nitro resource.
	 * @return returns a String
	 */
	public String resource_to_string(base_resource resrc)
	{
		Gson gson = new Gson();
		return gson.toJson(resrc);
	}
	
	/**
	 * Converts Json string to netscaler resource.
	 * @param responseClass Type of the class to which the string has to be converted to.
	 * @param response input string.
	 * @return returns nitro resource object.
	 */
	public Object string_to_resource(Class<?> responseClass, String response)
	{
		Gson gson = new Gson();
		return gson.fromJson(response, responseClass);
	}
	
	/**
	 * Converts netscaler resource to Json string.
	 * @param resrc nitro resource.
	 * @param id sessionId.
	 * @param option options class object.
	 * @return returns a String
	 */
	public String resource_to_string(base_resource resrc, String id, options option,Boolean warning, String onerror) 
	{
		String result = "{ ";
			if (option != null || (warning!=null && warning==true) || (!onerror.equals(""))) { 
				result = result + "\"params\":{";
				if(option != null)
				{
					if (option.get_action() != null) {
						result = result + "\"action\":\"" + option.get_action() + "\",";
					}					
				}
				if(warning != null && warning==true)
				{
					result = result + "\"warning\":\"yes\",";
				}
				if((!onerror.equals("")))
				{			
					result = result +"\"onerror\":\"" + onerror +"\"";			
				}		
				result  = result + "},";
			}
		
		if (id != null)
			result = result + "\"sessionid\":\"" + id + "\",";
		
		result = result + "\"" + resrc.get_object_type() + "\":" + this.resource_to_string(resrc) + "}";
		return result;
	}
	
	/**
	 * Converts netscaler resources to Json string.
	 * @param resources nitro resources.
	 * @param id sessionId.
	 * @param option options class object.
	 * @return returns a String
	 */
	public String resource_to_string(base_resource resources[], String id, options option,Boolean warning, String onerror)
	{
		String objecttype = resources[0].get_object_type();
		String request = "{";
		 
		if ( (option != null && option.get_action() != null) || (warning!=null && warning==true) || (!onerror.equals("")) )
		{
			request = request + "\"params\":{";
		
		if (option != null)
		{		
			if(option.get_action() != null)
			{	
				request = request + "\"action\":\"" + option.get_action()+"\",";
			}
		}
		if(warning != null && warning==true)
		{
			request = request + "\"warning\":\"yes\",";
		}
		if((!onerror.equals("")))
		{			
			request = request + "\"onerror\":\"" + onerror + "\"";			
		}
		request  = request + "},";
		}
		String sessionid = id;
		if (sessionid != null)
			request = request +"\"sessionid\":\""+sessionid+"\",";
		
		request = request + "\"" + objecttype + "\":[";
		for (int i = 0; i < resources.length ; i++) 
		{
			String str = this.resource_to_string(resources[i]);
			request = request + str + ",";
		}
		request = request + "]}";
		return request;
	}
	
	public String unset_string(base_resource resrc,  String args[]) throws Exception
	{
		String result = "{ ";
		
		String objstr = nitro_util.object_to_string(resrc);
		if(objstr != null) {
			result = result + objstr+",";
		}
		
		if (args != null) {
		for(int i = 0; i < args.length ; i++) 
		{
			result = result + "\"" + args[i] + "\": true,";
		}
		}
		result = result + "}";
		return result;
	}
	
	/**
	 * Converts nitro resource to Json string. This is exclusively for 
	 * forming unset string.
	 * @param resrc nitro resource.
	 * @param id sessionId.
	 * @param option options class object.
	 * @param args Array of arguments of resource that are to be unset.
	 * @return returns a String
	 */
	public String unset_string(base_resource resrc, String id, options option, String args[], Boolean warning) throws Exception
	{
		String objstr;
		String result = "{ ";
		if ((option != null && option.get_action() != null) || (warning!=null && warning==true))
		{
		result = result + "\"params\":{";
			
			if (option != null)
			{		
				if(option.get_action() != null)
				{	
					result = result + "\"action\":\"" + option.get_action()+"\",";
				}
			}
			if(warning != null && warning==true)
			{
				result = result + "\"warning\":\"yes\"";
			}
			result  = result + "},";
		}
		
		if (id != null)
			result = result + "\"sessionid\":\"" + id + "\",";
		
		result = result + "\"" + resrc.get_object_type() + "\": {" ;
		objstr = nitro_util.object_to_string(resrc);
		if(objstr != null) {
			result = result + objstr+",";
		}
		
		if (args != null) {
		for(int i = 0; i < args.length ; i++) 
		{
			result = result + "\"" + args[i] + "\": true,";
		}
		}
		result = result + "}," ;
		result = result + "}";
		return result;
	}
	public String unset_string(base_resource resources[], String id, options option, String args[], Boolean warning, String onerror) throws Exception
	{
		String objecttype = resources[0].get_object_type();
		String result = "{ ";
		
		if ((option != null && option.get_action() != null) || (warning!=null && warning==true) || (!onerror.equals("")))
		{
		result = result + "\"params\":{";
			
			if (option != null)
			{		
				if(option.get_action() != null)
				{	
					result = result + "\"action\":\"" + option.get_action()+"\",";
				}
			}
			if(warning != null && warning==true)
			{
				result = result + "\"warning\":\"yes\",";
			}
			if((!onerror.equals("")))
			{			
				result = result + "\"onerror\":\"" + onerror + "\"";			
			}
			result  = result + "},";
		}
		
		if (id != null)
			result = result + "\"sessionid\":\"" + id + "\",";
		
		result = result + "\"" + objecttype + "\": [" ;
		for (int i = 0; i < resources.length ; i++) 
		{
			String objstr = this.unset_string(resources[i],args);
			if(objstr != null) {
				result = result + objstr+",";
			}
		}
		result = result + "]}";
		return result;
	}
}
