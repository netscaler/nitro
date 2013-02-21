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
	}
	
	public void import_app(nitro_service session)
	{
		try
		{
			application importresource = new application();
			importresource.set_apptemplatefilename("share.xml"); 
			
			base_response result = application.Import(session, importresource);
			
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::import application::message="+e);
		}
	}
	
	public void import_app_withappname(nitro_service session)
	{
		try
		{
			application importresource = new application();
			importresource.set_apptemplatefilename("share.xml"); 
			importresource.set_appname("Myapp");
			
			base_response result = application.Import(session, importresource);
			
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::import application::message="+e);
		}
	}
	
	public void import_app_withdeploymentfile(nitro_service session)
	{
		try
		{
			application importresource = new application();
			importresource.set_apptemplatefilename("share.xml"); 
			importresource.set_appname("Myapp1");
			importresource.set_deploymentfilename("share_deployment.xml");
			
			base_response result = application.Import(session, importresource);
			
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::import application::message="+e);
		}
	}
	
}
