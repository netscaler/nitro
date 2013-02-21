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

package com.citrix.netscaler.nitro.service;

import com.citrix.netscaler.nitro.util.filtervalue;
import  com.citrix.netscaler.nitro.util.nitro_util;

/**
 * options class provides a way to specify additional arguments required while fetching the resource.
 */
public class options 
{
	
	private int pageno;
	private int pagesize;
	private boolean detailview;
	private boolean compression;
	private String action;
	private String args;
	private String filter;
	private boolean count;
	
	/**
	 * options class constructor.
	 */
	public options()
	{
		this.compression =  true;
		this.detailview = true;
		this.pageno = 0;
		this.pagesize = 0;
		this.action = null;
		this.filter = null;
		this.count = false;
	}
	
	/**
	 * sets page number.
	 * @param no page number.
	 */
	public void set_pageno(int no)
	{
		this.pageno = no;
	}
	
	/**
	 * sets the pagesize.
	 * @param size number of pages to be retrieved.
	 */
	public void set_pagesize(int size) 
	{
		this.pagesize = size;
	}

	public int get_pageno() 
	{
		return this.pageno;
	}
	
	/**
	 * @return action.
	 */
	public String get_action() 
	{
		return this.action;
	}
	
	/**
	 * sets the action to be performed.
	 * @param action action.
	 */
	public void set_action(String action) 
	{
		this.action = action;
	}
	
	public int get_pagesize() 
	{
		return this.pagesize;
	}

	public boolean get_compression() 
	{
		return this.compression;
	}

	public void set_compression(boolean flag) 
	{
		compression = flag;
	}
	
	/**
	 * @return detail view.
	 */
	public boolean get_detailview() 
	{
		return this.detailview;
	}
	
	/**
	 * sets the detail view. if detail view is needed set it to true.
	 * @param flag
	 */
	public void set_detailview(boolean flag) 
	{
		this.detailview = flag;
	}
	
	/**
	 * @return count.
	 */
	public boolean get_count() 
	{
		return this.count;
	}
	
	/**
	 * sets the count. 
	 * @param flag set this to true to find the number of resources of a type configured on NS
	 */
	public void set_count(boolean flag) 
	{
		this.count = flag;
	}
	
	/**
	 * sets args field.
	 * @param args optional args required for any operation. This is in json format.
	 */
	public void set_args(String args) 
	{
		this.args = args;
	}
	

	/**
	 * sets filter field.
	 * @param filter set this with the filter string to perform filtered get operation on specific type of resource. This is in json format.example: "port:80,servicetype:HTTP".
	 */
	public void set_filter(String filter) 
	{
		this.filter = filter;
	}
	
	/**
	 * sets filter field.
	 * @param filter set this with the filter string to perform filtered get operation. 
	 * 	Set the filter parameters in filtervalue object which is then converted to json string.
	 */
	public void set_filter(filtervalue[] filter) {
		String str = null;
		for (int i = 0 ;i<filter.length;i++){
			if (str != null)
				str = str + ",";
			if (str == null)
			{
				str = filter[i].get_name() + ":" + nitro_util.encode(filter[i].get_value());
			}
			else
			{
				str = str + filter[i].get_name() + ":" + nitro_util.encode(filter[i].get_value());;
			}
		}
		this.filter = str;
	}
	
	
	/**
	 * 
	 * @return returns filter.
	 */
	public String get_filter(){
		return this.filter;
	}
	
	/**
	 * constructs a string for options object.
	 * @return String to be concatenated to the URL.
	 */
	public String to_string() 
	{
		String str = "";
		if (pageno > 0) 
			str = "pageno="+pageno;
		
		if (pagesize > 0) 
		{
			if (str.length() > 0)
				str = str + "&";
			
			str = str +"pagesize="+pagesize;
		}
		
		if (detailview) 
		{
			if (str.length() > 0)
				str = str + "&";
			
			str = str +"view=detail";
		}
		
		if (count) 
		{
			if (str.length() > 0)
				str = str + "&";
			
			str = str +"count=yes";
		}
		
		if (args != null) {
			if (str.length() > 0)
				str = str + "&";
			str = str+"args="+args;
		}
		if (filter != null) {
			if (filter.length() > 0)
				str = str + "&";
			str = str+"filter="+filter;
		}
		return str;
	}
}
