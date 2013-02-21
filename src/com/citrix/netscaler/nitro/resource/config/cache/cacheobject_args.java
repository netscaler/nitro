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

package com.citrix.netscaler.nitro.resource.config.cache;

/**
	* Provides additional arguments required for fetching the cacheobject resource.
	*/

public class cacheobject_args 
{
	private String url;
	private Long locator;
	private Long httpstatus;
	private String host;
	private Integer port;
	private String groupname;
	private String httpmethod;
	private String group;
	private String ignoremarkerobjects;
	private String includenotreadyobjects;

	/**
	* <pre>
	* The URL of the object.<br> Minimum length =  1
	* </pre>
	*/
	public void set_url(String url) throws Exception{
		this.url = url;
	}

	/**
	* <pre>
	* The URL of the object.<br> Minimum length =  1
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* The id of the cached object.
	* </pre>
	*/
	public void set_locator(long locator) throws Exception {
		this.locator = new Long(locator);
	}

	/**
	* <pre>
	* The id of the cached object.
	* </pre>
	*/
	public void set_locator(Long locator) throws Exception{
		this.locator = locator;
	}

	/**
	* <pre>
	* The id of the cached object.
	* </pre>
	*/
	public Long get_locator() throws Exception {
		return this.locator;
	}

	/**
	* <pre>
	* HTTP status of the object.
	* </pre>
	*/
	public void set_httpstatus(long httpstatus) throws Exception {
		this.httpstatus = new Long(httpstatus);
	}

	/**
	* <pre>
	* HTTP status of the object.
	* </pre>
	*/
	public void set_httpstatus(Long httpstatus) throws Exception{
		this.httpstatus = httpstatus;
	}

	/**
	* <pre>
	* HTTP status of the object.
	* </pre>
	*/
	public Long get_httpstatus() throws Exception {
		return this.httpstatus;
	}

	/**
	* <pre>
	* The hostname of the object.<br> Minimum length =  1
	* </pre>
	*/
	public void set_host(String host) throws Exception{
		this.host = host;
	}

	/**
	* <pre>
	* The hostname of the object.<br> Minimum length =  1
	* </pre>
	*/
	public String get_host() throws Exception {
		return this.host;
	}

	/**
	* <pre>
	* The host port of the object.<br> Default value: 80<br> Minimum value =  1
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* The host port of the object.<br> Default value: 80<br> Minimum value =  1
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* The host port of the object.<br> Default value: 80<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The name of the content group to be in which the cell is present.
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* The name of the content group to be in which the cell is present.
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* The HTTP request method that caused the object to be stored.<br> Default value: NS_HTTP_METHOD_GET<br> Possible values = GET, POST
	* </pre>
	*/
	public void set_httpmethod(String httpmethod) throws Exception{
		this.httpmethod = httpmethod;
	}

	/**
	* <pre>
	* The HTTP request method that caused the object to be stored.<br> Default value: NS_HTTP_METHOD_GET<br> Possible values = GET, POST
	* </pre>
	*/
	public String get_httpmethod() throws Exception {
		return this.httpmethod;
	}

	/**
	* <pre>
	* The name of the content group whose objects should be listed.
	* </pre>
	*/
	public void set_group(String group) throws Exception{
		this.group = group;
	}

	/**
	* <pre>
	* The name of the content group whose objects should be listed.
	* </pre>
	*/
	public String get_group() throws Exception {
		return this.group;
	}

	/**
	* <pre>
	* Ignore marker objects.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_ignoremarkerobjects(String ignoremarkerobjects) throws Exception{
		this.ignoremarkerobjects = ignoremarkerobjects;
	}

	/**
	* <pre>
	* Ignore marker objects.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_ignoremarkerobjects() throws Exception {
		return this.ignoremarkerobjects;
	}

	/**
	* <pre>
	* Include objects not-ready for a cache hit.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_includenotreadyobjects(String includenotreadyobjects) throws Exception{
		this.includenotreadyobjects = includenotreadyobjects;
	}

	/**
	* <pre>
	* Include objects not-ready for a cache hit.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_includenotreadyobjects() throws Exception {
		return this.includenotreadyobjects;
	}

	public static class includenotreadyobjectsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class httpmethodEnum {
		public static final String GET = "GET";
		public static final String POST = "POST";
	}
	public static class ignoremarkerobjectsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
