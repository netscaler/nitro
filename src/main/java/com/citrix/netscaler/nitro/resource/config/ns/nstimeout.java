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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nstimeout_response extends base_response
{
	public nstimeout nstimeout;
}
/**
* Configuration for timeout resource.
*/

public class nstimeout extends base_resource
{
	private Long zombie;
	private Long client;
	private Long server;
	private Long httpclient;
	private Long httpserver;
	private Long tcpclient;
	private Long tcpserver;
	private Long anyclient;
	private Long anyserver;
	private Long halfclose;
	private Long nontcpzombie;
	private Long reducedfintimeout;
	private Long newconnidletimeout;

	/**
	* <pre>
	* Interval, in seconds, at which the NetScaler zombie cleanup process must run. This process cleans up inactive TCP connections.<br> Default value: 120<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public void set_zombie(long zombie) throws Exception {
		this.zombie = new Long(zombie);
	}

	/**
	* <pre>
	* Interval, in seconds, at which the NetScaler zombie cleanup process must run. This process cleans up inactive TCP connections.<br> Default value: 120<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public void set_zombie(Long zombie) throws Exception{
		this.zombie = zombie;
	}

	/**
	* <pre>
	* Interval, in seconds, at which the NetScaler zombie cleanup process must run. This process cleans up inactive TCP connections.<br> Default value: 120<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public Long get_zombie() throws Exception {
		return this.zombie;
	}

	/**
	* <pre>
	* Client idle timeout (in seconds).  If zero, the service-type default value is taken when service is created.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_client(long client) throws Exception {
		this.client = new Long(client);
	}

	/**
	* <pre>
	* Client idle timeout (in seconds).  If zero, the service-type default value is taken when service is created.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_client(Long client) throws Exception{
		this.client = client;
	}

	/**
	* <pre>
	* Client idle timeout (in seconds).  If zero, the service-type default value is taken when service is created.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public Long get_client() throws Exception {
		return this.client;
	}

	/**
	* <pre>
	* Server idle timeout (in seconds).  If zero, the service-type default is taken when service is created.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_server(long server) throws Exception {
		this.server = new Long(server);
	}

	/**
	* <pre>
	* Server idle timeout (in seconds).  If zero, the service-type default is taken when service is created.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_server(Long server) throws Exception{
		this.server = server;
	}

	/**
	* <pre>
	* Server idle timeout (in seconds).  If zero, the service-type default is taken when service is created.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public Long get_server() throws Exception {
		return this.server;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for client connections of HTTP service type. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_httpclient(long httpclient) throws Exception {
		this.httpclient = new Long(httpclient);
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for client connections of HTTP service type. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_httpclient(Long httpclient) throws Exception{
		this.httpclient = httpclient;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for client connections of HTTP service type. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public Long get_httpclient() throws Exception {
		return this.httpclient;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for server connections of HTTP service type. This value is over ridden by the server timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_httpserver(long httpserver) throws Exception {
		this.httpserver = new Long(httpserver);
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for server connections of HTTP service type. This value is over ridden by the server timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_httpserver(Long httpserver) throws Exception{
		this.httpserver = httpserver;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for server connections of HTTP service type. This value is over ridden by the server timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public Long get_httpserver() throws Exception {
		return this.httpserver;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-HTTP client connections of TCP service type. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_tcpclient(long tcpclient) throws Exception {
		this.tcpclient = new Long(tcpclient);
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-HTTP client connections of TCP service type. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_tcpclient(Long tcpclient) throws Exception{
		this.tcpclient = tcpclient;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-HTTP client connections of TCP service type. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public Long get_tcpclient() throws Exception {
		return this.tcpclient;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-HTTP server connections of TCP service type. This value is over ridden by the server timeout that is configured on entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_tcpserver(long tcpserver) throws Exception {
		this.tcpserver = new Long(tcpserver);
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-HTTP server connections of TCP service type. This value is over ridden by the server timeout that is configured on entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public void set_tcpserver(Long tcpserver) throws Exception{
		this.tcpserver = tcpserver;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-HTTP server connections of TCP service type. This value is over ridden by the server timeout that is configured on entities.<br> Minimum value =  0<br> Maximum value =  18000
	* </pre>
	*/
	public Long get_tcpserver() throws Exception {
		return this.tcpserver;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-TCP client connections. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_anyclient(long anyclient) throws Exception {
		this.anyclient = new Long(anyclient);
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-TCP client connections. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_anyclient(Long anyclient) throws Exception{
		this.anyclient = anyclient;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non-TCP client connections. This value is over ridden by the client timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_anyclient() throws Exception {
		return this.anyclient;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non TCP server connections. This value is over ridden by the server timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_anyserver(long anyserver) throws Exception {
		this.anyserver = new Long(anyserver);
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non TCP server connections. This value is over ridden by the server timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_anyserver(Long anyserver) throws Exception{
		this.anyserver = anyserver;
	}

	/**
	* <pre>
	* Global idle timeout, in seconds, for non TCP server connections. This value is over ridden by the server timeout that is configured on individual entities.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_anyserver() throws Exception {
		return this.anyserver;
	}

	/**
	* <pre>
	* Idle timeout, in seconds, for connections that are in TCP half-closed state.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public void set_halfclose(long halfclose) throws Exception {
		this.halfclose = new Long(halfclose);
	}

	/**
	* <pre>
	* Idle timeout, in seconds, for connections that are in TCP half-closed state.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public void set_halfclose(Long halfclose) throws Exception{
		this.halfclose = halfclose;
	}

	/**
	* <pre>
	* Idle timeout, in seconds, for connections that are in TCP half-closed state.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public Long get_halfclose() throws Exception {
		return this.halfclose;
	}

	/**
	* <pre>
	* Interval at which the zombie clean-up process for non-TCP connections should run. Inactive IP NAT connections will be cleaned up.<br> Default value: 60<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public void set_nontcpzombie(long nontcpzombie) throws Exception {
		this.nontcpzombie = new Long(nontcpzombie);
	}

	/**
	* <pre>
	* Interval at which the zombie clean-up process for non-TCP connections should run. Inactive IP NAT connections will be cleaned up.<br> Default value: 60<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public void set_nontcpzombie(Long nontcpzombie) throws Exception{
		this.nontcpzombie = nontcpzombie;
	}

	/**
	* <pre>
	* Interval at which the zombie clean-up process for non-TCP connections should run. Inactive IP NAT connections will be cleaned up.<br> Default value: 60<br> Minimum value =  1<br> Maximum value =  600
	* </pre>
	*/
	public Long get_nontcpzombie() throws Exception {
		return this.nontcpzombie;
	}

	/**
	* <pre>
	* Alternative idle timeout for new TCP NATPCB connections.<br> Default value: 30<br> Minimum value =  1<br> Maximum value =  300
	* </pre>
	*/
	public void set_reducedfintimeout(long reducedfintimeout) throws Exception {
		this.reducedfintimeout = new Long(reducedfintimeout);
	}

	/**
	* <pre>
	* Alternative idle timeout for new TCP NATPCB connections.<br> Default value: 30<br> Minimum value =  1<br> Maximum value =  300
	* </pre>
	*/
	public void set_reducedfintimeout(Long reducedfintimeout) throws Exception{
		this.reducedfintimeout = reducedfintimeout;
	}

	/**
	* <pre>
	* Alternative idle timeout for new TCP NATPCB connections.<br> Default value: 30<br> Minimum value =  1<br> Maximum value =  300
	* </pre>
	*/
	public Long get_reducedfintimeout() throws Exception {
		return this.reducedfintimeout;
	}

	/**
	* <pre>
	* Timer interval(in seconds) for new NATPCB for tcp connections.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  20
	* </pre>
	*/
	public void set_newconnidletimeout(long newconnidletimeout) throws Exception {
		this.newconnidletimeout = new Long(newconnidletimeout);
	}

	/**
	* <pre>
	* Timer interval(in seconds) for new NATPCB for tcp connections.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  20
	* </pre>
	*/
	public void set_newconnidletimeout(Long newconnidletimeout) throws Exception{
		this.newconnidletimeout = newconnidletimeout;
	}

	/**
	* <pre>
	* Timer interval(in seconds) for new NATPCB for tcp connections.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  20
	* </pre>
	*/
	public Long get_newconnidletimeout() throws Exception {
		return this.newconnidletimeout;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nstimeout[] resources = new nstimeout[1];
		nstimeout_response result = (nstimeout_response) service.get_payload_formatter().string_to_resource(nstimeout_response.class, response);
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
		resources[0] = result.nstimeout;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update nstimeout.
	*/
	public static base_response update(nitro_service client, nstimeout resource) throws Exception {
		nstimeout updateresource = new nstimeout();
		updateresource.zombie = resource.zombie;
		updateresource.client = resource.client;
		updateresource.server = resource.server;
		updateresource.httpclient = resource.httpclient;
		updateresource.httpserver = resource.httpserver;
		updateresource.tcpclient = resource.tcpclient;
		updateresource.tcpserver = resource.tcpserver;
		updateresource.anyclient = resource.anyclient;
		updateresource.anyserver = resource.anyserver;
		updateresource.halfclose = resource.halfclose;
		updateresource.nontcpzombie = resource.nontcpzombie;
		updateresource.reducedfintimeout = resource.reducedfintimeout;
		updateresource.newconnidletimeout = resource.newconnidletimeout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nstimeout resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nstimeout resource, String[] args) throws Exception{
		nstimeout unsetresource = new nstimeout();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nstimeout resources that are configured on netscaler.
	*/
	public static nstimeout get(nitro_service service) throws Exception{
		nstimeout obj = new nstimeout();
		nstimeout[] response = (nstimeout[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nstimeout resources that are configured on netscaler.
	*/
	public static nstimeout get(nitro_service service,  options option) throws Exception{
		nstimeout obj = new nstimeout();
		nstimeout[] response = (nstimeout[])obj.get_resources(service,option);
		return response[0];
	}

}
