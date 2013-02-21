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
 * Provides the classes necessary to create nitro_exception.
 */
package com.citrix.netscaler.nitro.exception;

import com.citrix.netscaler.nitro.resource.base.base_response;

@SuppressWarnings("serial")
/**
 * nitro_exception class is used to handle Nitro exceptions.
 */
public class nitro_exception extends Exception 
{
	private int errorcode;
	public base_response[] response;
	
	/**
	 * nitro_exception Class constructor.
	 */
	public nitro_exception() 
	{
		this.errorcode = -1;
    }
	
	/**
	 * nitro_exception Class constructor specifying the error message.
	 */
	public nitro_exception(String msg)
	{
		this(msg,-1);
    }

	/**
	 * nitro_exception Class constructor specifying the error message and error code.
	 */
	public nitro_exception(String msg,int errcode) 
	{
		super(msg);
		this.errorcode = errcode;
    }
	
	/**
	 * nitro_exception Class constructor specifying the error message and error code.
	 */
	public nitro_exception(String msg,int errcode,base_response[] response) 
	{
		super(msg);
		this.errorcode = errcode;
		this.response = response;
    }

	/**
	 * Gets the error code.
	 * @return gets the error code.
 	 */
	public int getErrorCode() 
	{
		return this.errorcode;
	}
}
