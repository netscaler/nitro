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
import com.citrix.netscaler.nitro.resource.config.lb.lbmonitor;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver.*;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_rewritepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_service_binding;
import com.citrix.netscaler.nitro.resource.config.network.rnat;
import com.citrix.netscaler.nitro.resource.config.ns.nsacls;
import com.citrix.netscaler.nitro.resource.config.ns.nsconfig;
import com.citrix.netscaler.nitro.resource.config.ns.nsmode;
import com.citrix.netscaler.nitro.resource.config.ns.nspbrs;
import com.citrix.netscaler.nitro.resource.config.ns.nsfeature.featureEnum;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpgroup;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcertkey;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcipher;
import com.citrix.netscaler.nitro.resource.config.ssl.ssldhparam;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpkcs12;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpkcs8;
import com.citrix.netscaler.nitro.resource.config.ssl.sslvserver;
import com.citrix.netscaler.nitro.resource.config.ssl.sslvserver_sslcertkey_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemgroup_systemuser_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_vpnclientlessaccesspolicy_binding;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.nitro_service.OnerrorEnum;
import com.citrix.netscaler.nitro.resource.config.aaa.aaaglobal_aaapreauthenticationpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaapreauthenticationaction;
import com.citrix.netscaler.nitro.resource.config.aaa.aaapreauthenticationpolicy;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwconfidfield;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_authenticationlocalpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.basic.service;
import com.citrix.netscaler.nitro.resource.config.basic.servicegroup;
import com.citrix.netscaler.nitro.resource.config.basic.servicegroup_servicegroupmember_binding;
import com.citrix.netscaler.nitro.resource.config.cs.cspolicy;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_cmppolicy_binding;
import com.citrix.netscaler.nitro.resource.config.filter.filterpolicy;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbvserver_domain_binding;
import com.citrix.netscaler.nitro.resource.base.base_response;
import com.citrix.netscaler.nitro.resource.base.base_responses;

public class set_config
{
	String ip ;
	String username ;
	String password ;
	   
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Usage: run.bat <ip> <username> <password>");
			return;
		}
  
		set_config config = new set_config();
	   	config.ip = args[0]; 
	   	config.username = args[1];
	  	config.password = args[2];

	  	nitro_service client = null;
  		try
    	{
  			 client = new nitro_service(config.ip,"http");
    		 client.set_credential(config.username,config.password);
    		 //client.set_timeout(1);
    		 client.set_onerror(OnerrorEnum.CONTINUE);
    		 client.set_warning(true);
   			 client.login();
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
		//clearconfig(client);
		nsconfig_diff(client);
		saveconfig(client);
                add_lbvserver(client);
		update_appfwprofile(client);
	    add_monitor(client);
	    add_appfw_confidField(client);
        add_lbvserver_post(client);
	    update_lbvserver(client);
            addlbvserver_bindings(client);
            add_lbvs_bulk(client);
	    enable_lbvserver(client);
	    disable_lbvserver(client);
	    rename_lbvserver(client,"lb_vip", "lb_vip2");
	    rename_lbvserver(client,"lb_vip2", "lb_vip");
        saveconfig(client);	
        enable_nsfeature(client);
        disable_nsfeature(client);
        //bindlbvserver_rewritepol(client);
        add_csvserver(client); 
        enable_nsmode(client);
        disable_nsmode(client);
        addcspolicy(client);
        add_appfwprofile(client);
        add_snmpgroup(client);
        bind_gslbvs_domain(client);
        unbind_gslbvs_domain(client);
        add_sslcipher(client);
        bind_authvs_authlocalpolicy(client);
        renumber_nsacls(client);
        add_filter_pol(client); 
    	Update_certkey(client);
		bind_csvs_cmppol(client);
		bind_vpnvserver_vpnclientlessacesspolicy(client);
		bind_systemgroup_systemuser(client);
		bind_aaaglobal_aaapreauthpol(client);
		bind_servicegroup_server(client);
		apply_nspbrs(client);
		clear_nspbrs(client);
		bind_authvs_nspol(client);
		set_filter_policy(client);
		creat_ssldhparam(client);
		create_sslpkcs12(client);
		create_sslpkcs12_import(client);
		convert_sslpkcs8(client);
		setrnat_acl(client);
		bindsslvs_cert(client);
	}

	
	public void nsconfig_diff(nitro_service client){
   		try
   		{
   			nsconfig obj = new nsconfig();
   			nsconfig result = nsconfig.diff(client, obj);
   			if(result!=null)
   			{
   				System.out.println("nsconfig_diff - response = " + result.get_response());
   			}
   			else
   			{
   				System.out.println("nsconfig_diff - Done");
   			}
   		} catch (nitro_exception e)
   		{
   			System.out.println("Exception::nsconfig_diff::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		} catch (Exception e)
   		{
   			System.err.println("Exception::nsconfig_diff::message="+e);
   		}
      }
     
	
	public void update_appfwprofile (nitro_service client) {
		try
		{
			base_response response;
			appfwprofile myprofile = new appfwprofile();		
			String a[] = new String[1];
			a[0]="xml";
			myprofile.set_name("p1");
			myprofile.set_type(a);
			client.set_warning(true);
			response = appfwprofile.update(client, myprofile);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::update_appfwprofile::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::update_appfwprofile::message="+e);
		}
		
	}
	
	public void bindsslvs_cert (nitro_service client) {
		try
		{
			lbvserver  lbvs = new lbvserver();
			lbvs.set_name("ssl_vs");
			lbvs.set_servicetype(lbvserver.servicetypeEnum.SSL);
			lbvs.set_ipv46("1.1.1.1");
			lbvs.set_port(443);
			lbvserver.add(client, lbvs);
			
			sslvserver_sslcertkey_binding obj[] = new  sslvserver_sslcertkey_binding[2];
			obj[0]= new sslvserver_sslcertkey_binding();			
			obj[0].set_vservername("ssl_vs");
			obj[0].set_certkeyname("xx");
			obj[1]= new sslvserver_sslcertkey_binding();			
			obj[1].set_vservername("ssl_vs");
			obj[1].set_certkeyname("yy");
			
			sslvserver_sslcertkey_binding.add(client, obj);	
			System.out.println("bindsslvs_cert - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::bindsslvs_cert::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::bindsslvs_cert::message="+e);
		}
	}
	
	public void setrnat_acl (nitro_service client) {
		try
		{
			rnat obj = new  rnat();
			obj.set_aclname("acl1");
			obj.set_natip2("1.1.1.7");

			rnat.update(client, obj);	
			System.out.println("setrnat_acl - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::setrnat_acl::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::setrnat_acl::message="+e);
		}
	}
	
	public void convert_sslpkcs8 (nitro_service client) {
		try
		{
			sslpkcs8 obj = new  sslpkcs8();
			obj.set_pkcs8file("swetha1.pk8");
			obj.set_keyfile("swetha-key2.pem");
			obj.set_keyform(sslpkcs8.keyformEnum.PEM);
			obj.set_password("asas");

			sslpkcs8.convert(client, obj);	
			System.out.println("convert_sslpkcs8 - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::convert_sslpkcs8::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::convert_sslpkcs8::message="+e);
		}
	}
	
	public void create_sslpkcs12_import (nitro_service client) {
		try
		{
			sslpkcs12 obj = new  sslpkcs12();
			obj.set_outfile("sss3.pem");
			obj.set_Import(true);
			obj.set_des(true);
			obj.set_pkcs12file("sss1.pk12");
			obj.set_password("abcd");
			obj.set_pempassphrase("aaaa");

			sslpkcs12.convert(client, obj);	
			System.out.println("create_sslpkcs12_import - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::create_sslpkcs12_import::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::create_sslpkcs12_import::message="+e);
		}
	}
	
	public void create_sslpkcs12 (nitro_service client) {
		try
		{
			sslpkcs12 obj = new  sslpkcs12();
			obj.set_outfile("aaa.pk12");
			obj.set_export(true);
			obj.set_certfile("cacert.pem");
			obj.set_keyfile("cakey.pem");
			obj.set_password("abcd");

			sslpkcs12.convert(client, obj);	
			System.out.println("create_sslpkcs12 - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::create_sslpkcs12::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::create_sslpkcs12::message="+e);
		}
	}
	
	public void creat_ssldhparam (nitro_service client) {
		try
		{
			ssldhparam obj = new  ssldhparam();
			obj.set_dhfile("fipskey1024");
			obj.set_bits(787);
			ssldhparam.create(client, obj);	
			System.out.println("creat_ssldhparam - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::creat_ssldhparam::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::creat_ssldhparam::message="+e);
		}
	}
	
	public void bind_authvs_nspol (nitro_service client) {
		try
		{
			authenticationvserver_auditnslogpolicy_binding obj = new authenticationvserver_auditnslogpolicy_binding();
			obj.set_name("auth_vs");
			obj.set_policy("audit_pol");
			obj.set_priority(77);
			authenticationvserver_auditnslogpolicy_binding.add(client, obj);			
			System.out.println("bind_authvs_nspol - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::bind_authvs_nspol::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::bind_authvs_nspol::message="+e);
		}
	}
	
	public void apply_nspbrs (nitro_service client) {
		try
		{
			nspbrs.apply(client);
			System.out.println("apply_nspbrs - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::apply_nspbrs::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::apply_nspbrs::message="+e);
		}
	}
	
	public void clear_nspbrs(nitro_service client) {
		try
		{
			nspbrs.clear(client);
			System.out.println("clear_nspbrs - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::clear_nspbrs::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::clear_nspbrs::message="+e);
		}
	}
	
	public void bind_servicegroup_server (nitro_service client) {
		try
		{
			servicegroup grp = new servicegroup();
			grp.set_servicegroupname("svcgrp1");
			grp.set_servicetype(servicegroup.servicetypeEnum.HTTP);
			servicegroup.add(client, grp);
			servicegroup_servicegroupmember_binding obj = new servicegroup_servicegroupmember_binding();
			obj.set_servicegroupname("svcgrp1");
			obj.set_ip("1.1.2.79");
			obj.set_port(77);
			servicegroup_servicegroupmember_binding.add(client, obj);
			System.out.println("bind_servicegroup_server - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::bind_servicegroup_server::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::bind_aaaglobal_aaapreauthpol::message="+e);
		}
	}
	
	public void bind_aaaglobal_aaapreauthpol (nitro_service session) {
		
		try
		{
			aaapreauthenticationaction preauth_act1;
			aaapreauthenticationpolicy preauth_pol1;
			aaaglobal_aaapreauthenticationpolicy_binding glob_binding;
			
			/*preauth_act1 = new aaapreauthenticationaction();
			preauth_act1.set_name("preauth_act1");
			preauth_act1.set_preauthenticationaction("ALLOW");
			aaapreauthenticationaction.add(session, preauth_act1);*/
			
			//preauth_pol1 = new aaapreauthenticationpolicy();
			//preauth_pol1.set_name("preauth_pol1");
			//preauth_pol1.set_rule("CLIENT.APPLICATION.PROCESS(antivirus.exe)EXISTS");
			//preauth_pol1.set_reqaction("preauth_act1");
			//aaapreauthenticationpolicy.add(session, preauth_pol1);
			
			glob_binding = new aaaglobal_aaapreauthenticationpolicy_binding();
			glob_binding.set_policy("preautpol1");
			glob_binding.set_priority(200);
			aaaglobal_aaapreauthenticationpolicy_binding.add(session,glob_binding);
			
			System.out.println("bind_aaaglobal_aaapreauthpol - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::bind_aaaglobal_aaapreauthpol::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::bind_aaaglobal_aaapreauthpol::message="+e);
		}
	}
	
	public  void bind_csvs_cmppol(nitro_service client)
	{
		try
		{
			csvserver_cmppolicy_binding obj = new csvserver_cmppolicy_binding();
			obj.set_name("cs1");
			obj.set_policyname("pdf_cmp");
			csvserver_cmppolicy_binding.add(client, obj);
			System.out.println("bind_csvs_cmppol - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::bind_csvs_cmppol::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::bind_csvs_cmppol::message="+e);
		}
	}

	 public static void Update_certkey(nitro_service service)
     {
		 String certkey="cert1";
		 try {
		     sslcertkey sslcertkey1=new sslcertkey();
		     sslcertkey1.set_certkey(certkey);
		     sslcertkey1.set_cert("/nsconfig/ssl/geetika.cert");
		     sslcertkey1.set_key("/nsconfig/ssl/geetika.key");
		     sslcertkey1.set_nodomaincheck(true);
		     sslcertkey.change(service,sslcertkey1);
		     System.out.println("Update certkey - Done");
		 } catch (nitro_exception e) {
			 System.out.println("Exception::Update certkey::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
		 } catch (Exception e) {
			 System.err.println("Exception::Update certkey::message="+e);
		 }
     }      
	
	public  void add_filter_pol(nitro_service client)
	{
		try
		{
			filterpolicy obj = new filterpolicy();
			obj.set_name("f1");
			obj.set_rule("method == get && url == /testsite/*");
			obj.set_reqaction("DROP");
			filterpolicy.add(client, obj);
			System.out.println("add_filter_pol - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_filter_pol::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_filter_pol::message="+e);
		}
	}
	
	public  void set_filter_policy(nitro_service client)
	{
		try
		{
			filterpolicy obj = new filterpolicy();
			obj.set_name("f2");
			obj.set_rule("method == post && url == /testsite/*");
			filterpolicy.update(client, obj);
			System.out.println("set_filter_policy - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::set_filter_policy::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::set_filter_policy::message="+e);
		}
	}
	
	public  void clearconfig(nitro_service client)
	{
		try
		{
			client.clear_config(true, nsconfig.levelEnum.basic);
			System.out.println("clearconfig - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::clearconfig::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::clearconfig::message="+e);
		}
	}

	public  void saveconfig(nitro_service client)
	{
		try
		{
			nsconfig.save(client);
			System.out.println("saveconfig - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::saveconfig::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::saveconfig::message="+e);
		}
	}

	public void renumber_nsacls(nitro_service client){
		try
		{
			nsacls.renumber(client);
			System.out.println("renumber_nsacls - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::renumber_nsacls::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::renumber_nsacls::message="+e);
		}
	}
	public  void bind_authvs_authlocalpolicy(nitro_service client)
	{
		try
		{
			authenticationvserver_authenticationlocalpolicy_binding obj = new authenticationvserver_authenticationlocalpolicy_binding();
			obj.set_name("auth1");
			obj.set_policy("auth-localpol");
			authenticationvserver_authenticationlocalpolicy_binding.add(client, obj);
			System.out.println("bind_authvs_authlocalpolicy - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::bind_authvs_authlocalpolicy::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::bind_authvs_authlocalpolicy::message="+e);
		}
	}
	
	public  void add_lbvserver(nitro_service client)
	{
		try
		{
			base_response response;
			lbvserver obj = new lbvserver();			
			obj.set_name("lb_vip");
			obj.set_servicetype(servicetypeEnum.HTTP);
			response = lbvserver.add(client, obj);
			
			System.out.println("add_lbvserver - Done");
			if(response.severity != null && response.severity.equals("WARNING"))
			{
				System.out.println("\tWarning : " + response.message);
			}
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_lbvserver::message="+e);
		}
	}
	
	public  void add_sslcipher(nitro_service client)
	{
		try
		{
			//sslcipher obj = new sslcipher();
			/*String[] cipherAlias = {"FIPS", "AES"};
			obj.set_ciphergroupname("mygrp");
			obj.set_ciphgrpalias(cipherAlias);
			sslcipher.add(client, obj);
			System.out.println("add_sslcipher - Done");
			*/
			//,"TLS1-AES-128-CBC-SHA"};
			
			sslcipher obj1 = new sslcipher();
			String cipher = "TLS1-AES-256-CBC-SHA";
			obj1.set_ciphergroupname("mygrp1");
			obj1.set_ciphgrpalias(cipher);
			base_response result1 = sslcipher.add(client, obj1);
			
			
			System.out.println("add_sslcipher by cipher - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_sslcipher::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_sslcipher::message="+e);
		}
	}

	public  void add_appfwprofile(nitro_service client)
	{
		try
		{
			appfwprofile obj = new appfwprofile();
			obj.set_name("pr1");
			String[] type = new String[1];
			type[0] = appfwprofile.typeEnum.XML;
			obj.set_type(type);
			appfwprofile.add(client, obj);
			System.out.println("add_appfwprofile - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_appfwprofile::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_appfwprofile::message="+e);
		}
	}
	
	public  void add_snmpgroup(nitro_service client)
	{
		try
		{
			snmpgroup obj = new snmpgroup();
			obj.set_name("snmp_grp");
			obj.set_securitylevel(snmpgroup.securitylevelEnum.noAuthNoPriv);
			obj.set_readviewname("tmp");
			snmpgroup.add(client,obj);
			System.out.println("add_snmpgroup - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_snmpgroup::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_snmpgroup::message="+e);
		}
	}
	
	public  void add_monitor(nitro_service client)
	{
		try
		{
			lbmonitor obj = new lbmonitor();
			obj.set_monitorname("dns1");
			obj.set_type(lbmonitor.typeEnum.DNS);
			lbmonitor.add(client,obj);
			System.out.println("add_monitor - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_monitor::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_monitor::message="+e);
		}
	}

	public  void add_lbvserver_post(nitro_service client)
	{
		try
		{
			lbvserver obj = new lbvserver();
			obj.set_name("lb_vip_post");
			obj.set_servicetype(lbvserver.servicetypeEnum.HTTP);
			lbvserver.add(client,obj); 
			System.out.println("add_lbvserver_post - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_lbvserver_post::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_lbvserver_post::message="+e);
		}
	}
	
	public  void add_appfw_confidField(nitro_service client)
	{
		try
		{
			appfwconfidfield obj = new appfwconfidfield();
			obj.set_fieldname("ap_con");
			obj.set_url("/test1");
			appfwconfidfield.add(client,obj); 
			System.out.println("add_appfw_confidField - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_appfw_confidField::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_appfw_confidField::message="+e);
		}
	}

	public  void add_csvserver(nitro_service client)
	{
		try
		{
			csvserver obj = new csvserver();
			obj.set_name("cs_vip");
			obj.set_servicetype(csvserver.servicetypeEnum.HTTP);
			obj.set_ipv46("9.1.1.8");
			obj.set_port(80);
			csvserver.add(client, obj);
			System.out.println("add_csvserver - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_csvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_csvserver::message="+e);
		}
	}
	
	public  void update_lbvserver(nitro_service client)
	{
		try
		{
			lbvserver obj = lbvserver.get(client, "lb_vip");
			obj.set_comment("Modified the comments. update resources works fine.");
			obj.set_lbmethod(lbmethodEnum.LEASTBANDWIDTH);
			lbvserver.update(client, obj);
			System.out.println("update_lbvserver - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::update_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::update_lbvserver::message="+e);
		}
	}
	
	
	public  void bindlbvserver_rewritepol(nitro_service client)
	{
		try
		{
			lbvserver_rewritepolicy_binding bindrwpol = new lbvserver_rewritepolicy_binding();
			bindrwpol.set_name("lb_vip");
			bindrwpol.set_policyname("pol9");
			bindrwpol.set_priority(77);
			bindrwpol.set_bindpoint(lbvserver_rewritepolicy_binding.bindpointEnum.REQUEST);
			lbvserver_rewritepolicy_binding.add(client, bindrwpol);
			System.out.println("bindlbvserver_rewritepol - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::bindlbvserver_rewritepol::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::bindlbvserver_rewritepol::message="+e);
		}
	}

	public void add_lbvs_bulk(nitro_service client) {
		try
		{
			lbvserver[] lb = new lbvserver[2];
			lb[0] = new lbvserver();
			lb[0].set_name("lb1");
			lb[0].set_servicetype(lbvserver.servicetypeEnum.HTTP);
			
			lb[1] = new lbvserver();
			lb[1].set_name("lb2");
			lb[1].set_servicetype(lbvserver.servicetypeEnum.SSL);
			
			lbvserver.add(client, lb);
			System.out.println("add_lbvs_bulk - Done");
			lbvserver.enable(client, lb);
			System.out.println("enable bulk resources - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::add_lbvs_bulk::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::add_lbvs_bulk::message="+e);
		}
	}
	
	public static void bind_systemgroup_systemuser(nitro_service service)
	{

	try {
	systemgroup_systemuser_binding systemgroup_systemuser_binding1=new systemgroup_systemuser_binding();
	systemgroup_systemuser_binding1.set_groupname("g1");
	systemgroup_systemuser_binding1.set_username("user1");

	base_response result = systemgroup_systemuser_binding.add(service,systemgroup_systemuser_binding1);
	System.out.println("bind_systemgroup_systemuser::rc="+result.errorcode+ ", Message ="+result.message);
	} catch (nitro_exception e) {
	System.out.println("Exception::bind_systemgroup_systemuser::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
	} catch (Exception e) {
		System.err.println("Exception::bind_systemgroup_systemuser::message="+e);
	}
	} 
	
	public static void bind_vpnvserver_vpnclientlessacesspolicy(nitro_service service)
	{
	try{
		vpnvserver_vpnclientlessaccesspolicy_binding vpnvserver_vpnclientlessaccesspolicy_binding1 = new vpnvserver_vpnclientlessaccesspolicy_binding();
		vpnvserver_vpnclientlessaccesspolicy_binding1.set_policy("clientlesspol1");
		vpnvserver_vpnclientlessaccesspolicy_binding1.set_priority(1);
		vpnvserver_vpnclientlessaccesspolicy_binding1.set_name("vpnvserver1");

		base_response result =vpnvserver_vpnclientlessaccesspolicy_binding.add(service,vpnvserver_vpnclientlessaccesspolicy_binding1);
		System.out.println("bind_vpnvserver_vpnclientlessacesspolicy::rc="+result.errorcode+ ", Message ="+result.message);
	} catch (nitro_exception e) {
		System.out.println("Exception::bind_vpnvserver_vpnclientlessacesspolicy::rc="+e.getErrorCode()+" , Message ="+ e.getMessage());
	} catch (Exception e) {
		System.err.println("Exception::bind_vpnvserver_vpnclientlessacesspolicy::message="+e);
	}
	}
	
	public  void addlbvserver_bindings(nitro_service client)
	{
		try
		{
			
			/*lbvserver_service_binding obj = new lbvserver_service_binding();
			obj.set_name("lb1");
			obj.set_servicename("svc1");
			obj.set_weight(77);
			lbvserver_service_binding.add(client, obj);
			lbvserver_service_binding.delete(client, obj);
			System.out.println("addlbvserver_bindings - Done");*/
			service[] svc = new service[2];
			svc[0] = new service();
			svc[0].set_name("svc_1");
			svc[0].set_ip("1.1.1.1");
			svc[0].set_port(80);
			svc[0].set_servicetype(service.servicetypeEnum.HTTP);

			svc[1] = new service();
			svc[1].set_name("svc_2");
			svc[1].set_ip("1.1.1.1");
			svc[1].set_port(81);
			svc[1].set_servicetype(service.servicetypeEnum.HTTP);

			lbvserver_service_binding[] bindsvc = new lbvserver_service_binding[2];
			bindsvc[0] = new lbvserver_service_binding();
			bindsvc[0].set_name("lb_vip");
			bindsvc[0].set_servicename("svc_1");
			bindsvc[0].set_weight ((long)20);

			bindsvc[1] = new lbvserver_service_binding();
			bindsvc[1].set_name("lb_vip");
			bindsvc[1].set_servicename("svc_2");
			bindsvc[1].set_weight((long)30);

			base_responses result = service.add(client, svc);
			result = lbvserver_service_binding.add(client, bindsvc);			
			System.out.println("addlbvserver_bindings - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::addlbvserver_bindings::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::addlbvserver_bindings::message="+e);
		}
	}

	public  void enable_lbvserver(nitro_service client)
	{
		try
		{
			lbvserver.enable(client,"lb_vip");
			System.out.println("enable_lbvserver - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::enable_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::enable_lbvserver::message="+e);
		}
	}

	public  void disable_lbvserver(nitro_service client)
	{
		try
		{
			lbvserver.disable(client, "lb_vip");
			System.out.println("disable_lbvserver - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::disable_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::disable_lbvserver::message="+e);
		}
	}

	public  void rename_lbvserver(nitro_service client,String name, String newname)
	{
		try
		{
			lbvserver obj = new lbvserver();
			obj.set_name(name);
			lbvserver.rename(client, obj, newname);
			System.out.println("rename_lbvserver - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rename_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::rename_lbvserver::message="+e);
		}
	}

	public  void enable_nsfeature(nitro_service client)
	{
		try {
			String[] feature = new String[2];
			feature[0] = featureEnum.BGP;
			feature[1] = featureEnum.REWRITE;
			client.enable_features(feature);
			System.out.println("enable_nsfeature - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::enable_nsfeature::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::enable_nsfeature::message="+e);
		}
	}
	
	public  void disable_nsfeature(nitro_service client)
	{
		try {
			String[] feature = new String[2];
			feature[0] = featureEnum.BGP;
			feature[1] = featureEnum.REWRITE;
			client.disable_features(feature);
			System.out.println("disable_nsfeature - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::disable_nsfeature::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::disable_nsfeature::message="+e);
		}
	}
    
	public  void enable_nsmode(nitro_service client) {
		try {
			nsmode obj = new nsmode();
			String[] mode = new String[2];
			mode[0] = nsmode.modeEnum.L2;
			mode[1] = nsmode.modeEnum.CKA;
			obj.set_mode(mode);
			nsmode.enable(client, obj);
			System.out.println("enable_nsmode - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::enable_nsmode::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::enable_nsmode::message="+e);
		}
	}
	
	public  void disable_nsmode(nitro_service client) {
		try {
			nsmode obj = new nsmode();
			String[] mode = new String[1];
			mode[0] = nsmode.modeEnum.L3;
			obj.set_mode(mode);
			nsmode.disable(client, obj);
			System.out.println("disable_nsmode - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::disable_nsmode::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::disable_nsmode::message="+e);
		}
	}
	
	public  void addcspolicy(nitro_service client) {
		try {
			cspolicy obj = new cspolicy();
			obj.set_policyname("cs_pol");
			obj.set_rule("HTTP.REQ.HEADER(\"host\").Length != 7");
			cspolicy.add(client, obj);
			System.out.println("addcspolicy - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::addcspolicy::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::addcspolicy::message="+e);
		}
	}
	
	public void bind_gslbvs_domain(nitro_service client) {
		try {
			gslbvserver_domain_binding obj = new gslbvserver_domain_binding();
			obj.set_name("gsv1");
			obj.set_domainname("my.dd.com");
			gslbvserver_domain_binding.add(client, obj);
			System.out.println("bind_gslbvs_domain - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::bind_gslbvs_domain::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::bind_gslbvs_domain::message="+e);
		}
	}
	
	public void unbind_gslbvs_domain(nitro_service client) {
		try {
			gslbvserver_domain_binding obj = new gslbvserver_domain_binding();
			obj.set_name("gsv1");
			obj.set_domainname("my.dd.com");
			gslbvserver_domain_binding.delete(client, obj);
			System.out.println("unbind_gslbvs_domain - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::unbind_gslbvs_domain::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::unbind_gslbvs_domain::message="+e);
		}
	}
	
	public  void forceha_sync(nitro_service client) {
		try {
			client.forcehasync(true, "YES");
			System.out.println("forceha_sync - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::forceha_sync::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::forceha_sync::message="+e);
		}
	}

	public  void forceha_failover(nitro_service client) {
		try {
			client.forcehafailover(true);
			System.out.println("forceha_failover - Done");
		}catch (nitro_exception e)
		{
			System.out.println("Exception::forceha_failover::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::forceha_failover::message="+e);
		}
	}
	
}
