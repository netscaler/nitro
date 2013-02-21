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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.config.app.*;


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

	}
	
	public void export_app(nitro_service session) 
	{

		try
		{
		
			application exportresource = new application();
			exportresource.set_appname("share"); 
			
			base_response result = application.export(session, exportresource);
			System.out.println("export application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::export application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::export application::message="+e);
		}
	}
	
	public void export_app_withfilename(nitro_service session) 
	{

		try
		{
			application exportresource = new application();
			exportresource.set_apptemplatefilename("Myapp.xml"); 
			exportresource.set_appname("Myapp");
						
			base_response result = application.export(session, exportresource);
			System.out.println("export application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::export application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::export application::message="+e);
		}
	}
	
	public void export_app_withdeploymentfilename(nitro_service session) 
	{

		try
		{
			application exportresource = new application();
			exportresource.set_apptemplatefilename("Myapp1.xml"); 
			exportresource.set_appname("Myapp1");
			exportresource.set_deploymentfilename("Myapp1_deployment.xml");
			
			base_response result = application.export(session, exportresource);
			System.out.println("export application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::export application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::export application::message="+e);
		}
	}
	
}