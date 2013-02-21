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

import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.stat.basic.service_stats;
import com.citrix.netscaler.nitro.resource.stat.basic.servicegroupmember_stats;
import com.citrix.netscaler.nitro.resource.stat.lb.lbvserver_stats;
import com.citrix.netscaler.nitro.resource.stat.network.Interface_stats;
import com.citrix.netscaler.nitro.resource.stat.ns.ns_stats;
import com.citrix.netscaler.nitro.resource.stat.system.system_stats;
import com.citrix.netscaler.nitro.resource.stat.vpn.vpn_stats;
import com.citrix.netscaler.nitro.service.nitro_service;


public class stats {
	String ip ;
	String username ;
	String password ;
	   
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Usage: run.bat <ip> <username> <password>");
			return;
		}  
		stats config = new stats();
	   	config.ip = args[0]; 
	   	config.username = args[1];
	  	config.password = args[2];
	  	
	  	nitro_service client = null;
  		 try
    	 {
  			 client = new nitro_service(config.ip,"https");
    		 client.set_credential(config.username,config.password);
    		 config.run_sample(client);
    		 client.logout();
        } catch (nitro_exception e) {
			System.out.println("Exception::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		 } catch (Exception e)
		 {
			System.out.println("Exception::message="+e.getMessage());
		 }
	    return;
	}
	public void run_sample(nitro_service client) {
		statlbvserver(client);
		statlbvserver_byname(client);
		statservice_byname(client);
		statvpn(client);
		statsystem(client);
		statinterface(client);
		statns(client);
		statservicegrpmem(client);
	}
	
	public  void statservicegrpmem(nitro_service client)
	{
		try 
		{
			servicegroupmember_stats obj = new servicegroupmember_stats();
			obj.set_servicegroupname("svcgrp");
			obj.set_ip("1.1.1.1");
			obj.set_port(77);
			servicegroupmember_stats obj1 = servicegroupmember_stats.get(client,obj);
			System.out.println("statservicegrpmem result::req="+obj1.get_servicegroupname()+", curClintConnctions="+obj1.get_curclntconnections());
		}catch (nitro_exception e)
		{
			System.out.println("Exception::statservicegrpmem::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::statservicegrpmem::message="+e);
		}
	}
	
	public  void statns(nitro_service client)
	{
		try 
		{
			ns_stats obj = ns_stats.get(client);
			System.out.println("statns result::req="+obj.get_httptotrxrequestbytes()+", res="+obj.get_httptotrxresponsebytes() +", tcpclient="+obj.get_tcpcurclientconn()+ ", tcp_esta_client"+obj.get_tcpcurclientconnestablished());
		}catch (nitro_exception e)
		{
			System.out.println("Exception::statns::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::statns::message="+e);
		}
	}
	
	public  void statlbvserver_byname(nitro_service client)
	{
		try 
		{
			lbvserver_stats obj = lbvserver_stats.get(client, "lb_vip");
			System.out.println("statlbvserver_byname result::name="+obj.get_name()+", servicetype="+obj.get_type() +",totalpktsrecvd="+obj.get_totalpktsrecvd());
		}catch (nitro_exception e)
		{
			System.out.println("Exception::statlbvserver_byname::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::statlbvserver_byname::message="+e);
		}
	}
	
	public  void statinterface(nitro_service client)
	{
		try 
		{
			Interface_stats obj = Interface_stats.get(client, "1/3");
			System.out.println("statinterface result::id="+obj.get_id()+", curlinkdwntime="+obj.get_curlinkdowntime());
		}catch (nitro_exception e)
		{
			System.out.println("Exception::statinterface::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::statinterface::message="+e);
		}
	}
	
	public  void statservice_byname(nitro_service client)
	{
		try 
		{
			service_stats obj = service_stats.get(client, "svc_1");
			System.out.println("statservice_byname result::name="+obj.get_name()+", servicetype="+obj.get_servicetype() +",requestbytes="+obj.get_totalrequestbytes());
		}catch (nitro_exception e)
		{
			System.out.println("Exception::statservice_byname::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::statservice_byname::message="+e);
		}
	}

	public  void statlbvserver(nitro_service client)
	{
		try 
		{		
			lbvserver_stats[] result = lbvserver_stats.get(client);
			System.out.println("statlbvserver result::length="+result.length);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::statlbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::statlbvserver::message="+e);
		}
	}

		
	public  void statvpn(nitro_service client)
	{
		try 
		{
			vpn_stats result = vpn_stats.get(client);
			System.out.println("statvpn result::totalcsconnsucc="+result.get_totalcsconnsucc());
		}catch (nitro_exception e)
		{
			System.out.println("Exception::statvpn::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::statvpn::message="+e);
		}
	}

	public  void statsystem(nitro_service client) {
		try 
		{	
			system_stats obj = system_stats.get(client);
			System.out.println("statsystem result::cpuUsage="+obj.get_cpuusage()+",Memsize(MB)="+obj.get_memsizemb()+", memusage(MB)="+obj.get_memuseinmb());
		}catch (nitro_exception e)
		{
			System.out.println("Exception::statsystem::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::statsystem::message="+e);
		}
	}

}
