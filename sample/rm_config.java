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
import com.citrix.netscaler.nitro.resource.base.base_response;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwconfidfield;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile;
import com.citrix.netscaler.nitro.resource.config.basic.service;
import com.citrix.netscaler.nitro.resource.config.basic.servicegroup;
import com.citrix.netscaler.nitro.resource.config.basic.servicegroup_servicegroupmember_binding;
import com.citrix.netscaler.nitro.resource.config.cs.cspolicy;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver;
import com.citrix.netscaler.nitro.resource.config.filter.filterprebodyinjection;
import com.citrix.netscaler.nitro.resource.config.lb.lbmonitor;
import com.citrix.netscaler.nitro.resource.config.lb.lbmonitor_service_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_service_binding;
import com.citrix.netscaler.nitro.resource.config.network.channel;
import com.citrix.netscaler.nitro.resource.config.network.route6;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpengineid;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpgroup;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpmanager;
import com.citrix.netscaler.nitro.resource.config.snmp.snmptrap;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.nitro_service.OnerrorEnum;

public class rm_config
{
	String ip ;
	String username ;
	String password ;
	   
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Usage: run.bat <ip> <username> <password>");
			return;
		}  
		rm_config config = new rm_config();
	   	config.ip = args[0]; 
	   	config.username = args[1];
	  	config.password = args[2];
	  	
	  	nitro_service client = null;
  		 try
    	 {
  			 client = new nitro_service(config.ip,"http");
    		 client.set_credential(config.username,config.password);
    		 client.set_warning(true);
    		 client.set_onerror(OnerrorEnum.CONTINUE);
    		 //client.set_timeout(1);
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
                unset_lbvserver(client);		
                rmlbvserver(client);
		rmlbmonitor(client);
		rm_appfw_confidField(client);
		unset_snmp_engineId(client);
		rmcsvserver(client);
		unset_cspolicy_domain(client);
		rmcspolicy(client);
		rm_appfwprofile(client);
		rm_snmpgroup(client);
		rm_channel(client);
	    //rmlbvserver_spaces(client);
		rm_route6(client);
		rm_snmptrap(client);
		rm_snmpmanager(client);
		unset_snmptrap(client);
		unset_filterprebody(client);
		unset_channel(client);
		unbind_svcgrp_svgrpmem(client);
		unset_bulk_service(client);
                rmlbvserver_bulk(client);
		rmcsvserver_bulk(client);
		unbind_lbmonitor_service(client);
		rmcsvserver_bulk_1(client);
	}
	
	public static void rmcsvserver_bulk_1(nitro_service service)
	{

		try {
			String str[] = {"cs1","cs2","cs3","cs4","cs5"};
			csvserver.delete(service,str);

			System.out.println("rmcsvserver_bulk::rc= done");
		} catch (nitro_exception e) {
			System.out.println("Exception::rmcsvserver_bulk::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception::rmcsvserver_bulk::message="+e);
		}
	}
	
	public static void rmcsvserver_bulk(nitro_service service)
	{

		try {
			csvserver csvs[] = new csvserver[5];
			for(int i=0;i<5;i++)
			{
				csvs[i] = new csvserver();
				csvs[i].set_name("csvserver"+i);
			}
			csvserver.delete(service,csvs);

			System.out.println("rmcsvserver_bulk::rc= done");
		} catch (nitro_exception e) {
			System.out.println("Exception::rmcsvserver_bulk::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception::rmcsvserver_bulk::message="+e);
		}
	}
	
	public static void rmlbvserver_bulk(nitro_service service)
	{

		try {
			lbvserver lbvs[] = new lbvserver[5];
			for(int i=0;i<5;i++)
			{
				lbvs[i] = new lbvserver();
				lbvs[i].set_name("v"+i);
			}
			lbvserver.delete(service,lbvs);

			System.out.println("rmlbvserver_bulk::rc= done");
		} catch (nitro_exception e) {
			System.out.println("Exception::rmlbvserver_bulk::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception::rmlbvserver_bulk::message="+e);
		}
	}
	
	public static void unbind_lbmonitor_service(nitro_service service)
	{

	try {
		lbmonitor_service_binding lbmonitor_service_binding1[] = new lbmonitor_service_binding[5];
	for(int i=0;i<5;i++)
	{
		lbmonitor_service_binding1[i] = new lbmonitor_service_binding();
		lbmonitor_service_binding1[i].set_monitorname("dns"+i);
		lbmonitor_service_binding1[i].set_servicename("svc_"+i);
	}
	lbmonitor_service_binding.delete(service,lbmonitor_service_binding1);

	System.out.println("unbind_lbmonitor_service::rc= done");
	} catch (nitro_exception e) {
	System.out.println("Exception::unbind_lbmonitor_service::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
	} catch (Exception e) {
		System.err.println("Exception::unbind_lbmonitor_service::message="+e);
	}

	}

	
	public static void unset_bulk_service(nitro_service client)
	{		 
		try {
			String arr[]={"cmp","cacheable","usip","healthmonitor"};
			servicegroup []servicegroup1=new servicegroup[5];		 
			for(int i=0;i<5;i++)
			{
				servicegroup1[i]=new servicegroup();
				servicegroup1[i].set_servicegroupname("sg_"+i);
			}
				servicegroup.unset(client,servicegroup1,arr);
				System.out.println("unset_bulk_service - DONE");
			} catch (nitro_exception e) {
				System.out.println("Exception::unset_bulk_service::rc="+e.getErrorCode()+" ,Message ="+ e.getMessage());
			} catch (Exception e) {
				System.err.println("Exception::unset_bulk_service::Message="+e);
			}
		}
	
	public static void unbind_svcgrp_svgrpmem(nitro_service client)
	{
		try {
			servicegroup_servicegroupmember_binding obj[] = new servicegroup_servicegroupmember_binding[2];
			obj[0] = new servicegroup_servicegroupmember_binding();
			obj[0].set_servicegroupname("sg1");
			obj[0].set_ip("1.1.1.7");
			obj[0].set_port(77);
			
			obj[1] = new servicegroup_servicegroupmember_binding();
			obj[1].set_servicegroupname("sg2");
			obj[1].set_ip("1.1.1.8");
			obj[1].set_port(78);			
			
			servicegroup_servicegroupmember_binding.delete(client, obj);
			System.out.println("unbind_svcgrp_svgrpmem - Done");
		} catch (nitro_exception e) {
			System.out.println("Exception:: unbind_svcgrp_svgrpmem::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception:: unbind_svcgrp_svgrpmem::message="+e);
		}
	}
	
	public static void unset_filterprebody(nitro_service client)
	{
		try {
			filterprebodyinjection.unset(client, null);
			System.out.println("unset_filterprebody - Done");
		} catch (nitro_exception e) {
			System.out.println("Exception:: unset_filterprebody::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception:: unset_filterprebody::message="+e);
		}
	}
	
	public static void unset_channel(nitro_service client)
	{
		try {
			String[] args = {"state", "speed"};
			channel.unset(client, "LA/1", args);
			System.out.println("unset_channel - Done");
		} catch (nitro_exception e) {
			System.out.println("Exception:: unset_channel::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception:: unset_channel::message="+e);
		}
	}
	
	
	public void unset_snmptrap(nitro_service client) {
		try
		{
			String str = "10.102.1.2";
			snmptrap obj = new snmptrap();
			obj.set_trapclass("generic");
			obj.set_trapdestination(str);
			String args[] = {"destport"};
			snmptrap.unset(client, obj, args);
			System.out.println("unset_snmptrap - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::unset_snmptrap::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::unset_snmptrap::message="+e);
		}

	}
	
	public  void rm_snmpmanager(nitro_service client)
	{
		try
		{
			String str = "10.102.31.19";
			snmpmanager.delete(client, str);
			System.out.println("rm_snmpmanager - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rm_snmpmanager::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rm_snmpmanager::message="+e);
		}
	}
	
	public  void rm_snmptrap(nitro_service client)
	{
		try
		{
			String str = "10.102.1.3";
			snmptrap obj = new snmptrap();
			obj.set_trapclass("generic");
			obj.set_trapdestination(str);
			snmptrap.delete(client, obj);
			System.out.println("rm_snmptrap - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rm_snmptrap::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rm_snmptrap::message="+e);
		}
	}
	
	public  void rm_route6(nitro_service client)
	{
		try
		{
			route6 obj = new route6();
			obj.set_network("::/0");
			obj.set_gateway("1234::1");
			route6.delete(client, obj);
			System.out.println("rm_route6 - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rm_route6::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rm_route6::message="+e);
		}
	}
	
	public  void rmlbvserver_spaces(nitro_service client)
	{
		try
		{
			lbvserver.delete(client, "x y");
			System.out.println("rmlbvserver_spaces - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rmlbvserver_spaces::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rmlbvserver_spaces::message="+e);
		}
	}
	
	public  void rm_channel(nitro_service client)
	{
		try
		{
			channel obj = new channel();
			obj.set_id("LA/1");
			channel.delete(client, "LA/1");
			System.out.println("rm_channel - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rm_channel::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rm_channel::message="+e);
		}
	}
	
	public  void rm_snmpgroup(nitro_service client)
	{
		try
		{
			snmpgroup obj = new snmpgroup();
			obj.set_name("snmp_grp");
			obj.set_securitylevel("noAuthNoPriv");
			snmpgroup.delete(client, obj);
			System.out.println("rm_snmpgroup - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rm_snmpgroup::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rm_snmpgroup::message="+e);
		}
	}
	
	public  void rm_appfwprofile(nitro_service client)
	{
		try
		{
			appfwprofile.delete(client, "pr1");
			System.out.println("rm_appfwprofile - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rm_appfwprofile::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rm_appfwprofile::message="+e);
		}
	}
	public  void rmlbvserver(nitro_service client)
	{
	
		try
		{
			base_response response;
			service svcobj1 = new service();
			service svcobj2 = new service();
			svcobj1.set_name("svc_1");
			svcobj2.set_name("svc_2");

			lbvserver obj = new lbvserver();
			obj.set_name("lb_vip");

			lbvserver_service_binding lb_service1 = new lbvserver_service_binding();
			lb_service1.set_name("lb_vip");
			lb_service1.set_servicename("svc_1");
			

			lbvserver_service_binding lb_service2 = new lbvserver_service_binding();
			lb_service2.set_name("lb_vip");
			lb_service2.set_servicename("svc_2");

			lbvserver_service_binding.delete(client,lb_service1);
			lbvserver_service_binding.delete(client,lb_service2);
	
			service.delete(client,"svc_1");
			service.delete(client,"svc_2");
			
			response =lbvserver.delete(client,"lb_vip_post");
			if(response.severity != null && response.severity.equals("WARNING"))
			{
				System.out.println("Warning : " + response.message);
			}
			System.out.println("rmlbvserver - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rmlbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rmlbvserver::message="+e);
		}
	}
	
	public  void rmcspolicy(nitro_service client)
	{
		try
		{
			cspolicy.delete(client,"cs_pol");
			System.out.println("rmcspolicy - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rmcspolicy::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rmcspolicy::message="+e);
		}
	}
	
	public  void rmlbmonitor(nitro_service client)
	{
		try
		{
		    lbmonitor mon = new lbmonitor();
			mon.set_monitorname("dns1");
			mon.set_type("DNS");
			lbmonitor.delete(client, mon);
			System.out.println("rmlbmonitor - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rmlbmonitor::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rmlbmonitor::message="+e);
		}
	}
		
	public  void rmcsvserver(nitro_service client) {
		try
		{
			csvserver.delete(client, "cs_vip");
			System.out.println("rmcsvserver - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rmcsvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rmcsvserver::message="+e);
		}
	}

	public  void unset_cspolicy_domain(nitro_service client){
		try
		{
			String args[] = {"domain"};
			cspolicy.unset(client, "cs_pol", args);
			System.out.println("unset_cspolicy_domain - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::unset_cspolicy_domain::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::unset_cspolicy_domain::message="+e);
		}
	}
	
	public  void rm_appfw_confidField(nitro_service client) {
		try
		{
			appfwconfidfield obj = new appfwconfidfield();
			obj.set_fieldname("ap_con");
			obj.set_url("/test1");
			appfwconfidfield.delete(client, obj);
			System.out.println("rm_appfw_confidField - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rm_appfw_confidField::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rm_appfw_confidField::message="+e);
		}
	}

	public  void unset_lbvserver(nitro_service client)
	{
		try
		{
			lbvserver[] lb1 = new lbvserver[2];
			lb1[0] = new lbvserver();
			lb1[0].set_name("lb2");
			lb1[1] = new lbvserver();
			lb1[1].set_name("lb1");
			String args[] = {"comment", "lbmethod"};
			lbvserver.unset(client, lb1, args);			
			System.out.println("unset_lbvserver - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::unset_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::unset_lbvserver::message="+e);
		}
	}

	public  void unset_snmp_engineId (nitro_service client){
		try {
			snmpengineid.unset(client, null);
			System.out.println("unset_snmp_engineId - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::unset_snmp_engineId::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::unset_snmp_engineId::message="+e);
		}
	}

}