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
 * Util package.
 */
package com.citrix.netscaler.nitro.util;

import java.lang.reflect.Field;
/**
 * 
 * nitro_util class provides a way to create a string out of the object fields that are set. 
 */
public class nitro_util {

	/**
	 * encodes the given string using URLEncoder.
	 * @param str String that is to be encoded.
	 * @return  encoded string.
	 */
	public static String encode(String str)
	{
		try
		{
			return java.net.URLEncoder.encode(str, "UTF-8");
		}
		catch(java.io.UnsupportedEncodingException ue)
		{
			return str;
		}
	}
	/**
	 * create a string out of the object fields that are set
	 * @param obj Object
	 * @return String in Json format.
	 * @throws Exception Nitro exception is thrown.
	 */
	public static String object_to_string(java.lang.Object obj) throws Exception {
		String str = null;

		Class<?> c = obj.getClass();
		Field[] flds = c.getDeclaredFields();
		if (flds != null) {
			for (int i = 0; i < flds.length; i++)
			{
				flds[i].setAccessible(true);
				if (flds[i].get(obj) != null)
				{
					String strtmp = "";
					Object tmp = flds[i].get(obj);
					if (flds[i].getType().isArray()) {
						if (tmp instanceof String[]) {
							String[] tmp1 = (String[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j] + " "; 
							}
						} else if (tmp instanceof Integer[]) {
							Integer[] tmp1 = (Integer[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if (tmp instanceof Long[]) {
							Long[] tmp1 = (Long[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if (tmp instanceof Double[]) {
							Double[] tmp1 = (Double[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if(tmp instanceof Boolean[]) {
							Boolean[] tmp1 = (Boolean[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						}						
						strtmp = strtmp.trim();
					} else {
						strtmp = flds[i].get(obj).toString();
					}
					if (str != null)
						str = str + ",";
					if (str == null)
					{
						str = "\""+flds[i].getName()+"\"" + ":" + "\""+strtmp+"\"";
					}
					else
					{
						str = str + "\""+flds[i].getName()+"\"" + ":" +"\""+ strtmp+"\"";
					}
				}
			}
		}
		return str;
	}
	
	/**
	 * create a string (without quotes)out of the object fields that are set
	 * @param obj Object
	 * @return String in Json format.
	 * @throws Exception Nitro exception is thrown.
	 */
	public static String object_to_string_withoutquotes(java.lang.Object obj) throws Exception {
		String str = null;

		Class<?> c = obj.getClass();
		Field[] flds = c.getDeclaredFields();
		if (flds != null) {
			for (int i = 0; i < flds.length; i++)
			{
				flds[i].setAccessible(true);
				if (flds[i].get(obj) != null)
				{
					String strtmp = "";
					if (flds[i].getType().isArray()) {
						Object tmp = flds[i].get(obj);
						if (tmp instanceof String[]) {
							String[] tmp1 = (String[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j] + " "; 
							}
						} else if (tmp instanceof Integer[]) {
							Integer[] tmp1 = (Integer[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if (tmp instanceof Long[]) {
							Long[] tmp1 = (Long[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if (tmp instanceof Double[]) {
							Double[] tmp1 = (Double[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if(tmp instanceof Boolean[]) {
							Boolean[] tmp1 = (Boolean[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						}						
						strtmp = strtmp.trim();
					} else {
						strtmp = flds[i].get(obj).toString();
					}
					if (str != null)
						str = str + ",";
					if (str == null)
					{
						str = flds[i].getName() + ":" + encode(strtmp);
					}
					else
					{
						str = str +flds[i].getName() + ":" + encode(strtmp);
					}
				}
			}
		}
		return str;
	}
}
