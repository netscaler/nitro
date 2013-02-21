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

import com.google.gson.Gson;

import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_cachepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_service_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwconfidfield;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwlearningdata;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwlearningdata_args;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogaction;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogparams;
import com.citrix.netscaler.nitro.resource.config.authorization.authorizationpolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.basic.service;
import com.citrix.netscaler.nitro.resource.config.basic.service_binding;
import com.citrix.netscaler.nitro.resource.config.basic.servicegroup_servicegroupmember_binding;
import com.citrix.netscaler.nitro.resource.config.cache.cacheobject;
import com.citrix.netscaler.nitro.resource.config.cmp.cmppolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.dns.dnsnsecrec;
import com.citrix.netscaler.nitro.resource.config.dns.dnssuffix;
import com.citrix.netscaler.nitro.resource.config.dns.dnsview_dnspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.dns.dnszone;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbldnsentries;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbparameter;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbservice_binding;
import com.citrix.netscaler.nitro.resource.config.ha.hanode;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.network.Interface;
import com.citrix.netscaler.nitro.resource.config.network.channel;
import com.citrix.netscaler.nitro.resource.config.ns.nsacl;
import com.citrix.netscaler.nitro.resource.config.ns.nsip;
import com.citrix.netscaler.nitro.resource.config.ns.nsip_args;
import com.citrix.netscaler.nitro.resource.config.ns.nslimitidentifier;
import com.citrix.netscaler.nitro.resource.config.ns.nstcpbufparam;
import com.citrix.netscaler.nitro.resource.config.ns.nsversion;
import com.citrix.netscaler.nitro.resource.config.ns.nsxmlnamespace;
import com.citrix.netscaler.nitro.resource.config.policy.policyexpression;
import com.citrix.netscaler.nitro.resource.config.policy.policyexpression_args;
import com.citrix.netscaler.nitro.resource.config.protocol.protocolhttpband;
import com.citrix.netscaler.nitro.resource.config.protocol.protocolhttpband_args;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpgroup;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpmanager;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpoid;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpoid_args;
import com.citrix.netscaler.nitro.resource.config.snmp.snmptrap;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpuser;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcertkey;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcipher_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslfipskey;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemgroup_binding;
import com.citrix.netscaler.nitro.resource.config.transform.transformprofile_transformaction_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_authenticationldappolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_vpnclientlessaccesspolicy_binding;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.filtervalue;
import com.citrix.netscaler.nitro.resource.config.basic.service_lbmonitor_binding;


public class get_config
 {
	 String ip;
     String username;
     String password;
     public static void main(String args[])
     {
         if (args.length < 3)
         {
        	 System.out.println("Usage: run.bat <ip> <username> <password>");
             return;
         }

         get_config config = new get_config();
         config.ip = args[0];
         config.username = args[1];
         config.password = args[2];       
         
       	 nitro_service client = null;
   		 try
     	 {
   			 client = new nitro_service(config.ip,"http");
     		 client.set_credential(config.username,config.password);
     		// client.set_timeout(1);
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
     public void run_sample(nitro_service client)
     {
    	get_svcgrp_svr_bind(client);
    	get_protocolhttpband(client);
                get_lbvserver(client);                
                getlbvserver_byname(client);
    		getlbvserver_bindings(client);
		getlbvserver_svc_bindings(client);
		get_policyexpression(client);
		get_cacheobjects(client);
        get_snmpgroup(client);   
        get_appfwprofile(client);
        get_appfwconfield(client);
        get_auditsyslogparams(client);
        get_gslbparameter(client);
        
        // new pm file has nslimit_selector OT as selector -- change it.
        //get_nslimitselector(client);

        get_dnssuffix(client);
        get_hanode(client);
        get_sslbindings(client);
        get_cmppolicy_bindings(client);
        get_auditnslogaction(client);
        get_gslbldnsentries(client);
        get_gslbservice_binds(client);
        //get_transfmpr_binds(client);
        get_systemgrp_binds(client);
        get_auth_bindings(client);
    	get_vpnglobal_vpnclientlessaccesspolicy_bindings(client);
    	
    	// get by name method is removed due to new PM file change
		// in sslcipher the args in get cmd op is CIPHGRPALS but the uid arg is defined as CIPHERNAME.
    	get_sslcipher_binds(client);
    	
    	get_nsmode(client);
    	get_enabled_modes(client);
    	get_nsfeature(client);
    	get_enabled_nsfeature(client);
    	//get_svcmon_binds(client);
    	get_snmpoid(client);
    	get_appfwlearningdata(client);
    	count_lbvserver(client);
    	count_lbvserver_service_binding(client);
    	count_filtered_lbvserver(client);
     	getfiltered_lbvserver(client);
    	getfiltered_services(client);
	  	getfiltered_lbvserver_svc_bindings(client);    	
    	get_channel(client);
    	get_snmpmanager(client);
    	get_snmptrap(client);
    	count_lbvserver_cachepolicy_binding(client);
    	get_interface(client);
    	get_dnsview_dnspol_binding(client);
    	//get_dnsnsecrec(client); //Assigned to Saravanan.
    	//get_dnszone(client); Assigned to raviKondamuru
    	get_svc_bind(client);
    	 //get_nsip(client);
    	get_sslcertkey(client);
    	get_sslfipskey(client);
    	get_nsip(client);
    	get_nslimitidentifier(client);
    	get_nstcpbufparam(client);
    	get_nsxmlnamespace(client);
    	get_snmpuser(client);
    	get_nsacl(client);
     	get_snmpoid(client);
     	count_snmpoid(client);
     	get_nsversion(client);
     	getlbvserver_bulk(client);
    	getlbvs_svc_bind_bulk(client);
    	get_vpnglobal_authpol(client);
     }
     
     public  void   get_vpnglobal_authpol(nitro_service client){
  		try
  		{
  			vpnglobal_authenticationldappolicy_binding result[] = vpnglobal_authenticationldappolicy_binding.get(client);
  			if(result != null)
  			{
  				for(int i =0 ;i<result.length;i++) {
  					System.out.println("get_vpnglobal_authpol - version= "+result[i].get_policyname() + ", secondary= " + result[i].get_secondary());
  				}
  			}
  			else
  			{
  				System.out.println("Exception::get_vpnglobal_authpol - Done");
  			}
  		} catch (nitro_exception e)
  		{
  			System.out.println("Exception::get_vpnglobal_authpol::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
  		} catch (Exception e)
  		{
  			System.err.println("Exception::get_vpnglobal_authpol::message="+e);
  		}
     }
     
     public  void   getlbvs_svc_bind_bulk(nitro_service client){
 		try
 		{
 			String str[] = {"v1","v2"};
 			lbvserver_binding[] result = lbvserver_binding.get(client,str);
 			for(int i =0 ;i<result.length;i++) 
 			{
 				if(result[i].get_lbvserver_service_bindings() != null)
 				{
 					System.out.println("getlbvs_svc_bind_bulk - version= "+result[i].get_name() + ", services= " + result[i].get_lbvserver_service_bindings().length);
 				}
 			}
 			System.out.println("getlbvs_svc_bind_bulk - Done");	
 		} catch (nitro_exception e)
 		{
 			System.out.println("Exception::getlbvs_svc_bind_bulk::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		} catch (Exception e)
 		{
 			System.err.println("Exception::getlbvs_svc_bind_bulk::message="+e);
 		}
    }
     
     public  void   getlbvserver_bulk(nitro_service client){
    		try
    		{
    			String str[] = {"v1","v2"};
    			lbvserver[] result = lbvserver.get(client,str);
    			for(int i =0 ;i<result.length;i++) {
         			System.out.println("getlbvserver_bulk - version= "+result[i].get_name() + ", lbmethod= " + result[i].get_lbmethod());
    			}	
    		} catch (nitro_exception e)
    		{
    			System.out.println("Exception::getlbvserver_bulk::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
    		} catch (Exception e)
    		{
    			System.err.println("Exception::getlbvserver_bulk::message="+e);
    		}
       }
     
     public  void   get_nsversion(nitro_service client){
   		try
   		{
   			nsversion result = nsversion.get(client);
    			System.out.println("get_nsversion - version= "+result.get_version() + ", mode= " + result.get_mode());	
   		} catch (nitro_exception e)
   		{
   			System.out.println("Exception::get_nsversion::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		} catch (Exception e)
   		{
   			System.err.println("Exception::get_nsversion::message="+e);
   		}
      }
     
     public  void   count_snmpoid(nitro_service client){
   		try
   		{
   			snmpoid obj = new snmpoid();
   			obj.set_entitytype("VSERVER");
   			long count = snmpoid.count(client, obj);
  			System.out.println("count_snmpoid - count:"+count);	
   		} catch (nitro_exception e)
   		{
   			System.out.println("Exception::count_snmpoid::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		} catch (Exception e)
   		{
   			System.err.println("Exception::count_snmpoid::message="+e);
   		}
      }
     
     public  void   get_nsacl(nitro_service client){
  		try
  		{
  			nsacl result = nsacl.get(client,"xyz");
   			System.out.println("get_nsacl - aclname= "+result.get_aclname() + ", kernelstate= " + result.get_kernelstate());	
  		} catch (nitro_exception e)
  		{
  			System.out.println("Exception::get_nsacl::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
  		} catch (Exception e)
  		{
  			System.err.println("Exception::get_nsacl::message="+e);
  		}
     }
     
     public  void   get_nsxmlnamespace(nitro_service client){
 		try
 		{
 			nsxmlnamespace result[] = nsxmlnamespace.get(client);
 			if(result != null)
 			{
 				for(int i =0;i<result.length;i++) {
 					System.out.println("get_nsxmlnamespace - prefix= "+result[i].get_prefix() + ", namespace= " + result[i].get_Namespace());
 				}
 			}
 			else
 			{
 				System.out.println("Exception::get_nsxmlnamespace - Done");
 			}

 		} catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_nsxmlnamespace::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		} catch (Exception e)
 		{
 			System.err.println("Exception::get_nsxmlnamespace::message="+e);
 		}
 }
     
     public  void   get_nstcpbufparam(nitro_service client){
    		try
    		{
    			nstcpbufparam result = nstcpbufparam.get(client);
   				System.out.println("get_nstcpbufparam - size= "+result.get_size() + ", memlimit= " + result.get_memlimit());

    		} catch (nitro_exception e)
    		{
    			System.out.println("Exception::get_nstcpbufparam::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
    		} catch (Exception e)
    		{
    			System.err.println("Exception::get_nstcpbufparam::message="+e);
    		}
    }
     
     public  void   get_nslimitidentifier(nitro_service client){
   		try
   		{
   			nslimitidentifier result[] = nslimitidentifier.get(client);
   			if(result != null)
   			{
   				for(int i =0;i<result.length;i++) {
   					System.out.println("get_nslimitidentifier - timeslice: "+result[i].get_timeslice());
   				}
   			}
   			else
   			{
   				System.out.println("Exception::get_nslimitidentifier - Done");
   			}
   		} catch (nitro_exception e)
   		{
   			System.out.println("Exception::get_nslimitidentifier::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		} catch (Exception e)
   		{
   			System.err.println("Exception::get_nslimitidentifier::message="+e);
   		}
   }
    
     public  void   get_sslfipskey(nitro_service client){
  		try
  		{
  			sslfipskey result[] = sslfipskey.get(client);
  			for(int i =0;i<result.length;i++) {
  				System.out.println("get_sslfipskey - certkey: "+result[i].get_fipskeyname());
  			}
  		} catch (nitro_exception e)
  		{
  			System.out.println("Exception::get_sslfipskey::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
  		} catch (Exception e)
  		{
  			System.err.println("Exception::get_sslfipskey::message="+e);
  		}
  }
     
     public  void   get_sslcertkey(nitro_service client){
 		try
 		{
 			sslcertkey result[] = sslcertkey.get(client);
 			for(int i =0;i<result.length;i++) {
 				System.out.println("get_sslcertkey - certkey: "+result[i].get_certkey());
 			}
 		} catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_sslcertkey::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		} catch (Exception e)
 		{
 			System.err.println("Exception::get_sslcertkey::message="+e);
 		}
 }
     
     public  void   get_nsip(nitro_service client){
    		try
    		{
    			nsip result = nsip.get(client, "1.1.1.77");
    			System.out.println("get_nsip - metric"+result.get_metric()+ ", flags=" +result.get_flags()+ ", ospfarea"+ result.get_ospfarea()+ ", ospfareaval=" +result.get_ospfareaval());
    		} catch (nitro_exception e)
    		{
    			System.out.println("Exception::get_nsip::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
    		} catch (Exception e)
    		{
    			System.err.println("Exception::get_nsip::message="+e);
    		}
    }
     
     public  void   get_dnszone(nitro_service client){
   		try
   		{
   			dnszone result[] = dnszone.get(client);
   			System.out.println("get_dnszone - Done");
   			for (int i=0;i<result.length;i++) {
   				System.out.println("	zone:"+result[i].get_zonename());
   			}
   		} catch (nitro_exception e)
   		{
   			System.out.println("Exception::get_dnszone::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		} catch (Exception e)
   		{
   			System.err.println("Exception::get_dnszone::message="+e);
   		}
   	}
     
     public  void   get_dnsnsecrec(nitro_service client){
  		try
  		{
  			//dnsnsecrec obj = new dnsnsecrec();
  			dnsnsecrec result[] = dnsnsecrec.get(client);
  			System.out.println("get_dnsnsecrec - Done");
  			for (int i=0;i<result.length;i++) {
  				System.out.println("	host:"+result[i].get_hostname());
  			}
  		} catch (nitro_exception e)
  		{
  			System.out.println("Exception::get_dnsnsecrec::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
  		} catch (Exception e)
  		{
  			System.err.println("Exception::get_dnsnsecrec::message="+e);
  		}
  	}
     
     public  void   get_dnsview_dnspol_binding(nitro_service client){
 		try
 		{
 			dnsview_dnspolicy_binding obj = new dnsview_dnspolicy_binding();
 			obj.set_viewname("xx");
 			dnsview_dnspolicy_binding result[] = dnsview_dnspolicy_binding.get_filtered(client, "xx", "dnspolicyname:pol1");
 		
 			System.out.println("get_dnsview_dnspol_binding - Done");
 			for (int i=0;i<result.length;i++) {
 				System.out.println("	pol:"+result[i].get_dnspolicyname());
 			}
 		} catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_dnsview_dnspol_binding::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_dnsview_dnspol_binding::message="+e);
 		}
 	}
     
     
     public  void   get_snmptrap(nitro_service client){
    		try
    		{
    			String str = "10.102.1.2";
    			snmptrap obj = new snmptrap();
    			obj.set_trapclass("generic");
    			obj.set_trapdestination(str);
    			obj = snmptrap.get(client, obj);
    			System.out.println("get_snmptrap port:"+obj.get_destport()+" description: " +obj.get_trapdestination()+" srcIP: "+obj.get_srcip());   							
    		} catch (nitro_exception e)
    		{
    			System.out.println("Exception::get_snmptrap::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
    		}catch (Exception e)
    		{
    			System.err.println("Exception::get_snmptrap::message="+e);
    		}
    	}
     
     public  void   get_snmpuser(nitro_service client){
 		try
 		{
 			snmpuser obj = new snmpuser();
 			obj.set_name("u1");
 			obj = snmpuser.get(client, "u1");
 			System.out.println("get_snmpuser Name:"+obj.get_name()+" grpName: " +obj.get_group()+" storage Type: "+obj.get_storagetype());   							
 		} catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_snmpuser::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_snmpuser::message="+e);
 		}
 	}
     
     public  void get_snmpmanager(nitro_service client){
   		try
   		{	snmpmanager obj = new snmpmanager();
   			obj.set_ipaddress("10.102.31.20");
   			snmpmanager obj1 = snmpmanager.get(client, obj);
   			System.out.println("get_snmpmanager id:"+obj1.get_ipaddress()+"description" +obj1.get_netmask());
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::get_snmpmanager::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::get_snmpmanager::message="+e);
   		}
   	}
     
     public  void get_channel(nitro_service client){
  		try
  		{
  			channel obj = channel.get(client,"LA/1");
  			System.out.println("get_channel id:"+obj.get_id()+", description" +obj.get_description());
  						
  		}catch (nitro_exception e)
  		{
  			System.out.println("Exception::get_channel::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
  		}catch (Exception e)
  		{
  			System.err.println("Exception::get_channel::message="+e);
  		}
  	}
     
     public  void get_interface(nitro_service client){
 		try
 		{
 			Interface obj = Interface.get(client, "1/3");
 			System.out.println("get_interface id:"+obj.get_id()+", reqduplex" +obj.get_reqduplex());
 						
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_interface::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_interface::message="+e);
 		}
 	}
    
     public void count_filtered_lbvserver(nitro_service client){
    	 try
   		{    
    		 filtervalue[] filter = new filtervalue[1];
    		 filter[0] = new filtervalue("port","0");
    		 long lbvs_count = lbvserver.count_filtered(client, filter);
   			 System.out.println("count_filtered_lbvserver ::"+lbvs_count);
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::count_filtered_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::count_filtered_lbvserver::message="+e);
   		}
     }

     public void count_lbvserver(nitro_service client){
    	 try
   		{    		 
    		 long lbvs_count = lbvserver.count(client);
   			 System.out.println("count_lbvserver ::"+lbvs_count);
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::count_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::count_lbvserver::message="+e);
   		}
     }
     
     public void count_lbvserver_service_binding(nitro_service client){
    	 try
   		{    		 
    		 long lbvs_count = lbvserver_service_binding.count(client,"lb_vip");
   			 System.out.println("count_lbvserver_service_binding : "+lbvs_count);
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::count_lbvserver_service_binding::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::count_lbvserver_service_binding::message="+e);
   		}
     }
     
     public void count_lbvserver_cachepolicy_binding(nitro_service client){
    	 try
   		{    		 
    		 long lbvs_count = lbvserver_cachepolicy_binding.count(client,"lbvip1");
   			 System.out.println("count_lbvserver_cachepolicy_binding : "+lbvs_count);
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::count_lbvserver_cachepolicy_binding::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::count_lbvserver_cachepolicy_binding::message="+e);
   		}
     }
     
     
     public void get_snmpoid(nitro_service client){
    	 try
   		{
    		 snmpoid_args obj = new snmpoid_args();
    		 obj.set_entitytype("VSERVER");
    		snmpoid[] result = snmpoid.get(client, obj);
  			System.out.println("get_snmpoid name="+result.length);
  			for (int i =0;i<result.length;i++){
  				System.out.println(" enitity_name: "+result[i].get_entitytype()+" name="+result[i].get_name()+" cmnt= "+result[i].get_Snmpoid());
  			}
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::get_snmpoid::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::get_snmpoid::message="+e);
   		}
     }
     
     public void get_svcmon_binds(nitro_service client){
    	 try
   		{
    		 service_lbmonitor_binding[] result = service_lbmonitor_binding.get(client, "s1");
  			System.out.println("get_svcmon_binds name="+result.length);
  			for (int i =0;i<result.length;i++){
  				System.out.println("mon name: "+result[0].get_monitor_name());
  			}
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::get_svcmon_binds::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::get_svcmon_binds::message="+e);
   		}
     }
     
     public void get_svcgrp_svr_bind(nitro_service client){
    	 try
   		{
    		 servicegroup_servicegroupmember_binding[] result = servicegroup_servicegroupmember_binding.get(client, "svcgrp1");
  			System.out.println("get_svcgrp_svr_bind name="+result.length);
  			for (int i =0;i<result.length;i++){
  				System.out.println("svrip: "+result[i].get_ip());
  			}
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::get_svcgrp_svr_bind::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::get_svcgrp_svr_bind::message="+e);
   		}
     }
     public void get_nsfeature(nitro_service client) {
     	try {
     	 String[] features = client.get_features();
     	 int i =1;
     	 System.out.println("nsfeature on given NS: ");
     	 for(String feature: features){
     		 System.out.println("\t"+ i +") "+feature);
     		 i++;
     	 }
     	} catch(nitro_exception e)
 		{
 			System.out.println("Exception::get_nsfeature::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_nsfeature::message="+e);
 		}
     	 
     }
     
     public void get_enabled_nsfeature(nitro_service client) {
      	try {
      	 String[] enabled_features = client.get_enabled_features();
      	 int i =1;
      	 System.out.println("enabled nsfeatures: ");
      	 for(String en_feature: enabled_features){
      		 System.out.println("\t"+ i +") "+en_feature);
      		 i++;
      	 }
      	} catch(nitro_exception e)
  		{
  			System.out.println("Exception::get_enabled_nsfeature::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
  		}catch (Exception e)
  		{
  			System.err.println("Exception::get_enabled_nsfeature::message="+e);
  		}
      	 
       }
     public void get_enabled_modes(nitro_service client) {
     	try {
     	 String[] enabled_modes = client.get_enabled_modes();
     	 int i =1;
     	 System.out.println("enabled nsmodes: ");
     	 for(String en_mode: enabled_modes){
     		 System.out.println("\t"+ i +") "+en_mode);
     		 i++;
     	 }
     	} catch(nitro_exception e)
 		{
 			System.out.println("Exception::get_enabled_modes::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_enabled_modes::message="+e);
 		} 
      }
     
     public void get_nsmode(nitro_service client) {
    	try {
    	 String[] modes = client.get_modes();
    	 int i =1;
    	 System.out.println("nsmodes on given NS: ");
    	 for(String mode: modes){
    		 System.out.println("\t"+ i +") "+mode);
    		 i++;
    	 }
    	} catch(nitro_exception e)
		{
			System.out.println("Exception::get_nsmode::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::get_nsmode::message="+e);
		}
    	 
     }
     public void get_sslcipher_binds(nitro_service client){
    	 try
    		{
     		sslcipher_binding result = sslcipher_binding.get(client);
   			System.out.println("get_sslcipher_binds name="+result.get_sslcipher_individualcipher_bindings().length);
    		}catch (nitro_exception e)
    		{
    			System.out.println("Exception::get_sslcipher_binds::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
    		}catch (Exception e)
    		{
    			System.err.println("Exception::get_sslcipher_binds::message="+e);
    		}
      }

     public void get_vpnglobal_vpnclientlessaccesspolicy_bindings(nitro_service client){
    	 try
   		{
   			vpnglobal_vpnclientlessaccesspolicy_binding[] result = vpnglobal_vpnclientlessaccesspolicy_binding.get(client);
  			System.out.println("get_vpnglobal_binds name="+result.length);
   		}catch (nitro_exception e)
   		{
   			System.out.println("Exception::get_vpnglobal_binds::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
   		}catch (Exception e)
   		{
   			System.err.println("Exception::get_vpnglobal_binds::message="+e);
   		}
     }
     
     public void get_auth_bindings(nitro_service client) {
    	 try
  		{
   			authorizationpolicylabel_binding result = authorizationpolicylabel_binding.get(client, "trans_http_url");
 			System.out.println("get_auth_bindings name="+result.get_labelname());
 			if(result.get_authorizationpolicylabel_authorizationpolicy_bindings() != null) {
 				for (int i=0;i<result.get_authorizationpolicylabel_authorizationpolicy_bindings().length;i++) {
 					System.out.println("	auth cmd policies polname="+result.get_authorizationpolicylabel_authorizationpolicy_bindings()[i].get_policyname()+" priority="+result.get_authorizationpolicylabel_authorizationpolicy_bindings()[i].get_priority()+"invoke"+result.get_authorizationpolicylabel_authorizationpolicy_bindings()[i].get_invoke());
 				}
 			}
  		}catch (nitro_exception e)
  		{
  			System.out.println("Exception::get_auth_bindings::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
  		}catch (Exception e)
  		{
  			System.err.println("Exception::get_auth_bindings::message="+e);
  		}
     }
     
     public  void get_systemgrp_binds(nitro_service client)
 	 {
    
 		try
 		{
 			systemgroup_binding result = systemgroup_binding.get(client, "g1");
			System.out.println("get_systemgrp_binds name="+result.get_groupname());
			if(result.get_systemgroup_systemcmdpolicy_bindings() != null) {
				for (int i=0;i<result.get_systemgroup_systemcmdpolicy_bindings().length;i++) {
					System.out.println("system cmd policies polname="+result.get_systemgroup_systemcmdpolicy_bindings()[i].get_policyname()+" priority="+result.get_systemgroup_systemcmdpolicy_bindings()[i].get_priority());
				}
			}
			if(result.get_systemgroup_systemuser_bindings() != null) {
				for (int i=0;i<result.get_systemgroup_systemuser_bindings().length;i++) {
					System.out.println("system cmd user username="+result.get_systemgroup_systemuser_bindings()[i].get_username());
				}
			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_systemgrp_binds::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_systemgrp_binds::message="+e);
 		}
    }
     
     /*public  void get_transfmpr_binds(nitro_service client)
 	 {
    
 		try
 		{
 			transformprofile_transformaction_binding result[] = transformprofile_transformaction_binding.get(client, "pr");
 			for(int i =0;i<result.length;i++){
 				System.out.println("get_transfmpr_binds name="+result[i].get_name()+", prfilename=" + result[i].get_profilename());
 			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_transfmpr_binds::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.out.println("Exception::get_transfmpr_binds::message="+e.getMessage());
 		}
    }*/
     
     public  void get_gslbservice_binds(nitro_service client)
 	 {
    
 		try
 		{
 			gslbservice_binding result = gslbservice_binding.get(client,"sj_svc");
			System.out.println("get_gslbservice_binds name="+result.get_servicename()+", viewname=" + result.get_gslbservice_dnsview_bindings()[0].get_viewname());
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_gslbservice_binds::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_gslbservice_binds::message="+e);
 		}
    }
     
     public  void get_gslbldnsentries(nitro_service client)
 	 {
    
 		try
 		{
 			gslbldnsentries result[] = gslbldnsentries.get(client);
 			if(result != null)
 			{
 			for(int i=0;i<result.length;i++) {
 				System.out.println("get_gslbldnsentries sitename="+result[i].get_sitename()+", ttl=" + result[i].get_ttl());
 				for(int j=0;j<result[i].get_rtt().length;j++){
 					System.out.println("\trtt "+result[i].get_rtt()[j]);
 				}
 			}
 			}
 			else
 			{
 				System.out.println("Exception::get_gslbldnsentries - Done");
 			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_gslbldnsentries::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_gslbldnsentries::message="+e);
 		}
    }
     
     public  void get_cmppolicy_bindings(nitro_service client)
 	 {
    
 		try
 		{

 			cmppolicy_lbvserver_binding result[] = cmppolicy_lbvserver_binding.get(client, "pdf_cmp");
 			for(int i=0;i<result.length;i++){
 				System.out.println("cmppol name="+result[i].get_name()+", lbvserver=" + result[i].get_boundto());
 			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_cmppolicy_bindings::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_cmppolicy_bindings::message="+e);
 		}
    }
     
     public  void get_auditnslogaction(nitro_service client)
 	 {
    
 		try
 		{
 			auditnslogaction result[] = auditnslogaction.get(client);
 			if(result != null)
 			{
 			for (int i=0;i<result.length;i++){
 				System.out.println("cmppol name="+result[i].get_name()+", ip=" + result[i].get_serverip());
 			}
 			}
 			else
 			{
 				System.out.println("Exception::get_auditnslogaction - Done");
 			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_auditnslogaction::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_auditnslogaction::message="+e);
 		}
    }
     
     
     public  void get_sslbindings(nitro_service client)
 	 {
 		try
 		{
			sslpolicy_binding obj = new sslpolicy_binding();
 			obj.set_name("certInsert_pol");
 			sslpolicy_binding result = sslpolicy_binding.get(client, "certInsert_pol");
 			System.out.println("get_sslbindings result::name="+result.get_name());
 			if (result.get_sslpolicy_csvserver_bindings() != null){
					sslpolicy_csvserver_binding[] xx = new sslpolicy_csvserver_binding[result.get_sslpolicy_csvserver_bindings().length];
					xx = result.get_sslpolicy_csvserver_bindings();
 				for (int j=0;j<xx.length;j++) {
 					System.out.println("csvservername" + xx[j].get_boundto());
 				}
 			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_sslbindings::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_sslbindings::message="+e);
 		}
 	}
     
     public  void get_hanode(nitro_service client)
 	 {
 		try
 		{
 			options option = new options();
 			option.set_detailview(true);
 			hanode[] result = hanode.get(client, option);
 			for (int i=0;i<result.length;i++){
 				System.out.println("get_hanode result::Id="+result[i].get_id()+", IP="+result[i].get_ipaddress()+", effecive-interfaces="+result[i].get_enaifaces());
 			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_hanode::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_hanode::message="+e);
 		}
 	}
     
   /*  public  void get_nslimitselector(nitro_service client)
 	 {
 		try
 		{
 			nslimitselector[] result = nslimitselector.get(client);
 			System.out.println("get_nslimitselector result::name="+result[0].get_selectorname()+", rule="+result[0].get_rule()[1]);
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_nslimitselector::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.out.println("Exception::get_nslimitselector::message="+e.getMessage());
 		}
 	}*/
     public  void get_dnssuffix(nitro_service client)
 	 {
 		try
 		{
 			dnssuffix result = dnssuffix.get(client, "citrix.com");
 			if(result != null)
 			{
 				System.out.println("get_dnssuffix result::name="+result.get_Dnssuffix());
 			}
 			else
 			{
 				System.out.println("get_dnssuffix result - Done");
 			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_dnssuffix::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_dnssuffix::message="+e);
 		}
 	}
     
     public  void get_gslbparameter(nitro_service client)
 	 {
  		try
 		{
 			gslbparameter result = gslbparameter.get(client);
 			System.out.println("get_gslbparameter result::mask="+result.get_ldnsmask()+", ldnsProbOrder="+result.get_ldnsprobeorder()[0]);
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_gslbparameter::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_gslbparameter::message="+e);
 		}
 	}
     
     public  void get_auditsyslogparams(nitro_service client)
 	 {
 		try
 		{
 			auditsyslogparams result = (auditsyslogparams)auditsyslogparams.get(client);
 			System.out.println("get_auditsyslogparams result::ip="+result.get_serverip()+", loglevel="+result.get_loglevel()[0]);
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_auditsyslogparams::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_auditsyslogparams::message="+e);
 		}
 	}
     
     public  void get_appfwconfield(nitro_service client)
 	 {
  		try
 		{
 			appfwconfidfield obj = new appfwconfidfield();
 			obj.set_fieldname("ap_con");
 			obj.set_url("/test1");
 			appfwconfidfield result = appfwconfidfield.get(client, obj);
 			System.out.println("get_appfwconfield result::name="+result.get_fieldname()+", url="+result.get_url());
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_appfwconfield::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_appfwconfield::message="+e);
 		}
 	}
     
     public  void get_appfwprofile(nitro_service client)
 	 {
 		try
 		{
 			appfwprofile result = appfwprofile.get(client, "pr1");
 			if(result != null)
 			{
 				System.out.println("get_appfwprofile result::name="+result.get_name()+", StartURLAction="+result.get_starturlaction()[0]+result.get_starturlaction()[1]+ result.get_starturlaction()[2]);
 			}
 			else
 			{
 				System.out.println("get_appfwprofile - Done ");
 			}
 		}catch (nitro_exception e)
 		{
 			System.out.println("Exception::get_appfwprofile::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
 		}catch (Exception e)
 		{
 			System.err.println("Exception::get_appfwprofile::message="+e);
 		}
 	}
     
	public  void get_policyexpression(nitro_service client)
	{
		try
		{
			policyexpression_args args = new policyexpression_args();
			args.set_type("classic");
			policyexpression[] result = policyexpression.get(client, args);
			System.out.println("get_policyexpression result::length="+result.length);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::get_policyexpression::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::get_policyexpression::message="+e);
		}
	}

	public  void get_snmpgroup( nitro_service client){
		
		try
		{
			snmpgroup obj = new snmpgroup();
			obj.set_name("snmp_grp");
			obj.set_securitylevel("noAuthNoPriv");
			snmpgroup result = snmpgroup.get(client, obj);
			if(result!=null)
			{
				System.out.println("get_snmpgroup result::name="+result.get_name());
			}
			else
			{
				System.out.println("get_snmpgroup - done");
			}
		}catch (nitro_exception e)
		{
			System.out.println("Exception::get_snmpgroup::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::get_snmpgroup::message="+e);
		}
	}	
	
	public  void get_cacheobjects(nitro_service client){
		try
		{
			cacheobject[] result = cacheobject.get(client);
			System.out.println("get_cacheobjects result::length="+result.length);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::get_cacheobjects::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::get_cacheobjects::message="+e);
		}
	}
	
	public  void get_lbvserver(nitro_service client)
	{
		try
		{
			lbvserver[] result = lbvserver.get(client);
			System.out.println("get_lbvserver result::length="+result.length);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::get_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::get_lbvserver::message="+e);
		}			
	}

	public  void get_svc_bind(nitro_service client)
	{
		try
		{
			service_binding obj = new service_binding();
			obj.set_name("svc1");
			service_binding result = service_binding.get(client,"svc1");
			System.out.println("get_svc_bind result::length="+result.get_service_lbmonitor_bindings().length);
			for(int i = 0;i<result.get_service_lbmonitor_bindings().length;i++){
				System.out.println("resptime: "+result.get_service_lbmonitor_bindings()[i].get_responsetime());
			}
		}catch (nitro_exception e)
		{
			System.out.println("Exception::get_svc_bind::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::get_svc_bind::message="+e);
		}
	}
	
	public  void get_protocolhttpband(nitro_service client)
	{
		try
		{
			//protocolhttpband obj = new protocolhttpband();
			protocolhttpband_args obj = new protocolhttpband_args();
			obj.set_type("REQUEST");
			protocolhttpband[] result = protocolhttpband.get(client,obj);
			for(int j =0;j<result.length;j++) {
				System.out.println("get_protocolhttpband result::length="+result[j].get_accesscount().length);
				for(int i = 0;i<result[j].get_totalbandsize().length;i++){
				//	System.out.println("totalbandsize: "+result[j].get_totalbandsize()[i]);
				}
				for(int i = 0;i<result[j].get_accesscount().length;i++){
					System.out.println("totalbandsize: "+result[j].get_accesscount()[i]);
				}
			}
		}catch (nitro_exception e)
		{
			System.out.println("Exception::get_protocolhttpband::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::get_protocolhttpband::message="+e);
		}
	}
	
	public  void getlbvserver_bindings(nitro_service client)
	{
		try
		{
			lbvserver_binding obj = new lbvserver_binding();
			obj.set_name("lb_vip");
			lbvserver_binding result = lbvserver_binding.get(client,"lb_vip");
			if(result.get_lbvserver_service_bindings()!=null)
			{
			System.out.println("getlbvserver_bindings result::length="+result.get_lbvserver_service_bindings().length);
			for(int i = 0;i<result.get_lbvserver_service_bindings().length;i++){
				System.out.println("svc name "+result.get_lbvserver_service_bindings()[i].get_servicename());
			}
			}
			else
			{
				System.out.println("getlbvserver_bindings - Done");
			}
		}catch (nitro_exception e)
		{
			System.out.println("Exception::getlbvserver_bindings::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::getlbvserver_bindings::message="+e);
		}
	}

	public void getlbvserver_svc_bindings(nitro_service client){
		try
		{
			lbvserver_service_binding[] result = lbvserver_service_binding.get(client,"lb_vip");
			if(result!=null)
			{
				for (int i =0;i<result.length;i++){
					System.out.println("getlbvserver_svc_bindings result::vsName="+result[i].get_name()+", svcName="+result[i].get_servicename());
				}
			}
			else
			{
				System.out.println("getlbvserver_svc_bindings - Done");
			}
		}catch (nitro_exception e)
		{
			System.out.println("Exception::getlbvserver_svc_bindings::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::getlbvserver_svc_bindings::message="+e);
		}
	}
	public void getfiltered_lbvserver_svc_bindings(nitro_service client){
		try
		{
			filtervalue[] filter = new filtervalue[1];
			filter[0] = new filtervalue("servicename","svc_1");
			lbvserver_service_binding[] result = (lbvserver_service_binding[])lbvserver_service_binding.get_filtered(client, "lb_vip",filter);
			if(result != null)
			{
			System.out.println("getfiltered_lbvserver_svc_bindings result::length="+result.length);
			}
			else
			{
				System.out.println("Exception::getfiltered_lbvserver_svc_bindings - Done");
			}
		}catch (nitro_exception e)
		{
			System.out.println("Exception::getfiltered_lbvserver_svc_bindings::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::getfiltered_lbvserver_svc_bindings::message="+e);
		}
	}
	public  void getlbvserver_byname(nitro_service client)
	{
		try
		{
			lbvserver obj = (lbvserver)lbvserver.get(client, "lb_vip");
			System.out.println("getlbvserver_byname result::name="+obj.get_name()+", curstate="+obj.get_curstate()+", effectivestate="+obj.get_effectivestate()+", listenpolicy="+obj.get_listenpolicy()+", listenpriority"+obj.get_listenpriority());
		}catch (nitro_exception e)
		{
			System.out.println("Exception::getlbvserver_byname::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::getlbvserver_byname::message="+e);
		}
	}

	public  void getfiltered_lbvserver(nitro_service client)
	{
		try
		{
			filtervalue[] filter = new filtervalue[1];
			filter[0] = new filtervalue("name","/^lb.*/");
			//filter[0] = new filtervalue("port","80");
			//filter[1] = new filtervalue("servicetype","HTTP");
			lbvserver[] result = (lbvserver[])lbvserver.get_filtered(client, filter);
			System.out.println("getfiltered_lbvserver result::length="+result.length);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::getfiltered_lbvserver::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::getfiltered_lbvserver::message="+e);
		}
	}
	
	public  void getfiltered_services(nitro_service client)
	{
		try
		{
			String filter = "port:80,servicetype:HTTP";
			service[] result = service.get_filtered(client,filter);
			System.out.println("getfiltered_services result::length="+result.length);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::getfiltered_services::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::getfiltered_services::message="+e);
		}
	}
	
	public  void get_appfwlearningdata(nitro_service client){
		try
		{
	
			appfwlearningdata_args args = new appfwlearningdata_args();
			args.set_profilename("pr_testsite_3");
			args.set_securitycheck("starturl");
			appfwlearningdata[] result = (appfwlearningdata[])appfwlearningdata.get(client,args);
			System.out.println("get_appfwlearningdata length:"+result.length);
			for (appfwlearningdata appfwlearningdata : result) {
				System.out.println("get_appfwlearningdata result::profile name="+appfwlearningdata.get_profilename()+"blob= "+appfwlearningdata.get_data());
			}			
		}catch (nitro_exception e)
		{
			System.out.println("Exception::get_appfwlearningdata::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::get_appfwlearningdata::message="+e);
		}
	}

/*public void check_boolean (){
		String str = "{\"xyz\":false,\"abc\":true}";
		Gson gson = new Gson();
		test test1 = new test();
		test1 = (test)gson.fromJson(str, test.class);
		System.out.println("test1 values xyz: "+test1.xyz+ " abc: "+test1.abc);
		if(test1.xyz) {
			System.out.println("xyz is true");
		}
	}*/
}
