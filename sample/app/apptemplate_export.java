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
import com.citrix.netscaler.nitro.exception.nitro_exception;



public class apptemplate_export
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
			apptemplate_export config = new apptemplate_export();
		   	session = new nitro_service(args[0],"http");
		  	session.set_credential(args[1],args[2]);
		  	config.export_apptemplates(session);
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
	
	public void export_apptemplates(nitro_service client) 
	{
		export_app(client);
		export_app_withfilename(client);
		export_app_withdeploymentfilename(client);
		export_app_withtemplateinfo(client);

	}
	
	public void export_app(nitro_service session) 
	{

		try
		{
			base_response result = application.export_to_file(session, "Myapp1");
			System.out.println("export application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::export application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::export application::message="+e.getMessage());
		}
	}
	
	public void export_app_withfilename(nitro_service session) 
	{

		try
		{
			String templete_file = "sampleapp.xml"; 
			
			base_response result = application.export_to_file(session, "Myapp2", templete_file);
			System.out.println("export application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::export application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::export application::message="+e.getMessage());
		}
	}
	
	public void export_app_withdeploymentfilename(nitro_service session) 
	{

		try
		{
			String template_file = "sampleapp.xml"; 
			String deploymentfilename = "sample_deployment.xml";
			
			base_response result = application.export_to_file(session, "Myapp2", template_file, deploymentfilename);
			System.out.println("export application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::export application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::export application::message="+e.getMessage());
		}
	}
	
	public void export_app_withtemplateinfo(nitro_service session) 
	{

		try
		{
			String templete_file = "sampleapp1.xml"; 
			template_info templateinfo = get_templateinfo();
			
			base_response result = application.export_to_file(session, "Myapp3", templete_file, templateinfo);
			System.out.println("export application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::export application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::export application::message="+e.getMessage());
		}
	}
	
	public template_info get_templateinfo() throws Exception{
		template_info templateinfo = new template_info();
		templateinfo.set_author("ABC");
		templateinfo.set_introduction("This is introduction");
		templateinfo.set_summary("This is summary");
		templateinfo.set_templateversion_major("1");
		templateinfo.set_templateversion_minor("1");
			
		return templateinfo;
	}
}