/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/


package app;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.nitro_service.OnerrorEnum;
import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.config.basic.service;
import com.citrix.netscaler.nitro.service.options;

public class apptemplate_import
{
	String ip ;
	String username ;
	String password ;
	   
	public static void main(String[] args) {
		nitro_service session = null;
		if (args.length < 3) {
			System.out.println("Usage: run.bat <ip> <username> <password>");
			return;
		}
		try {
			apptemplate_import config = new apptemplate_import();
		   	session = new nitro_service(args[0],"http");
		  	session.set_credential(args[1],args[2]);
		  	config.import_apptemplates(session);
		  	if (session != null)
				session.logout();
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rc="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::message="+e.getMessage());
		} 
	    return;
	}
	
	public void import_apptemplates(nitro_service client) 
	{
		import_app(client);
		import_app_withappname(client);
		import_app_withdeploymentfile(client);
		import_app_withvariables(client);
		import_app_withoptions(client);
	}
	
	public void import_app(nitro_service session)
	{
		try
		{
			String templete_file = "sampleapp.xml"; 
			
			base_response result = application.import_from_file(session, templete_file);
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::import application::message="+e.getMessage());
		}
	}
	public void import_app_withappname(nitro_service session)
	{
		try
		{
			String templete_file = "sampleapp.xml"; 
			String appname = "Myapp1";
			
			base_response result = application.import_from_file(session, templete_file, appname);
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::import application::message="+e.getMessage());
		}
	}
	
	public void import_app_withdeploymentfile(nitro_service session)
	{
		try
		{
			String templete_file = "sampleapp1.xml"; 
			String appname = "Myapp2";
			String deploymentfilename = "sampleapp1_deployment.xml";
			
			base_response result = application.import_from_file(session, templete_file, appname, deploymentfilename);
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::import application::message="+e.getMessage());
		}
	}
	
	public void import_app_withvariables(nitro_service session)
	{
		try
		{
			String templete_file = "sampleapp.xml"; 
			String appname = "Myapp3";
			
			appendpoint[] endpoints = get_endpoints();
			service[] backendservices = get_backendservices();
			variable[] variables = get_variables();
			
			deploymentinfo deploymentinfo_resrc = new deploymentinfo();
			deploymentinfo_resrc.set_publicendpoints(endpoints);
			deploymentinfo_resrc.set_backendservices(backendservices);
			deploymentinfo_resrc.set_variables(variables);
						
			session.set_onerror(OnerrorEnum.ROLLBACK);

			base_response result = application.import_from_file(session, templete_file, appname, deploymentinfo_resrc);
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::import application::message="+e.getMessage());
		}
	}
	
	public void import_app_withoptions(nitro_service session)
	{
		try
		{
			String templete_file = "Myapp1.xml"; 
			String appname = "Myapp4";
			
			session.set_onerror(OnerrorEnum.EXIT);
			
			base_response result = application.import_from_file(session, templete_file, appname);
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::import application::message="+e.getMessage());
		}
	}
	
	public appendpoint[] get_endpoints() throws Exception{
		appendpoint[] epoint = new appendpoint[1];
		epoint[0] = new appendpoint();
		epoint[0].set_ipv46("1.2.3.6");
		epoint[0].set_port(80);
		epoint[0].set_servicetype("HTTP");
		
		return epoint;
	}
	
	public service[] get_backendservices() throws Exception{
		service[] backendservices = new service[2];
		backendservices[0] = new service();
		backendservices[0].set_ip("10.102.10.85");
		backendservices[0].set_port(65334);
		backendservices[0].set_servicetype("HTTP");
		backendservices[1] = new service();
		backendservices[1].set_ip("10.102.10.16");
		backendservices[1].set_port(80);
		backendservices[1].set_servicetype("HTTP");
		return backendservices;
	}
	
	public variable[] get_variables() throws Exception{
		variable[] variables = new variable[2];
		variables[0] = new variable();
		variables[0].set_name("Rewrite-var1");
		variables[0].set_value("CONTAINS");
		return variables;
	}

}
