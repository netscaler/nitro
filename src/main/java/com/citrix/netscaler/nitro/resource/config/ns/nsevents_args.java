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
	* Provides additional arguments required for fetching the nsevents resource.
	*/

public class nsevents_args 
{
	private Long eventno;

	/**
	* <pre>
	* Event number starting from which events must be shown.
	* </pre>
	*/
	public void set_eventno(long eventno) throws Exception {
		this.eventno = new Long(eventno);
	}

	/**
	* <pre>
	* Event number starting from which events must be shown.
	* </pre>
	*/
	public void set_eventno(Long eventno) throws Exception{
		this.eventno = eventno;
	}

	/**
	* <pre>
	* Event number starting from which events must be shown.
	* </pre>
	*/
	public Long get_eventno() throws Exception {
		return this.eventno;
	}

}
