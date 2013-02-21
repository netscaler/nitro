package app;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import app.appendpoint;
import com.citrix.netscaler.nitro.resource.config.basic.service;
import app.apptemplateinfo;
import com.citrix.netscaler.nitro.service.options;

class application_response extends base_response
{
	public application[] application;
}

public class application extends base_resource {
	private String name;
	private appendpoint[] appendpoint; 
	private service[] service;
	

	public void set_name(String name) throws Exception{
		this.name = name;
	}
	
	public String get_name() throws Exception {
		return this.name;
	}
	
	public void set_endpoints(appendpoint[] endpoint) {
		this.appendpoint = endpoint;
	}
	
	public appendpoint[] get_endpoints() throws Exception {
		return this.appendpoint;
	}
	
	public void set_backendservices(service[] backendservices) {
		this.service = backendservices;
	}
	
	public service[] get_backendservices() throws Exception {
		return this.service;
	}
	
	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) {
		application_response result = (application_response) service.get_payload_formatter().string_to_resource(application_response.class, response);
		return result.application;
	}
	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}
	
	
	/**
	* Use this API to create an application from an apptemplate file .
	*/
	
	public static base_response import_from_file(nitro_service client, String templatefilename) throws Exception {
		apptemplateinfo importresource = new apptemplateinfo();
		importresource.set_apptemplatefilename(templatefilename);

		return importresource.perform_operation(client,"import");
	}

	public static base_response import_from_file(nitro_service client, String templatefilename, options option) throws Exception {
		apptemplateinfo importresource = new apptemplateinfo();
		importresource.set_apptemplatefilename(templatefilename);

		option.set_action("import");
		return importresource.perform_operation(client, option);
	}
	
	

	/**
	* Use this API to create an application from an apptemplate file, and to override the template's application name
	*/
	public static base_response import_from_file(nitro_service client, String templatefilename, String appname) throws Exception {
		apptemplateinfo importresource = new apptemplateinfo();
		importresource.set_apptemplatefilename(templatefilename);
		importresource.set_appname(appname);

		return importresource.perform_operation(client,"import");
	}
	
	public static base_response import_from_file(nitro_service client, String templatefilename, String appname, options option) throws Exception {
		apptemplateinfo importresource = new apptemplateinfo();
		importresource.set_apptemplatefilename(templatefilename);
		importresource.set_appname(appname);
		
		option.set_action("import");

		return importresource.perform_operation(client,option);
	}
	
	
	/**
	* Use this API to create an application from an apptemplate file, and to use the deployment data
	*/
	public static base_response import_from_file(nitro_service client, String templatefilename, String appname, String deploymentfilename) throws Exception {
		apptemplateinfo importresource = new apptemplateinfo();
		importresource.set_appname(appname);
		importresource.set_apptemplatefilename(templatefilename);
		importresource.set_deploymentfilename(deploymentfilename);
		
		return importresource.perform_operation(client,"import");
	}

	public static base_response import_from_file(nitro_service client, String templatefilename, String appname, String deploymentfilename, options option) throws Exception {
		apptemplateinfo importresource = new apptemplateinfo();
		importresource.set_appname(appname);
		importresource.set_apptemplatefilename(templatefilename);
		importresource.set_deploymentfilename(deploymentfilename);
		
		option.set_action("import");
		
		return importresource.perform_operation(client,option);
	}
	
	/**
	* Use this API to create an application from an apptemplate file that uses variables.
	*/
	public static base_response import_from_file(nitro_service client, String templatefilename, String appname, deploymentinfo deploymentinfo) throws Exception {
		apptemplateinfo importresource = new apptemplateinfo();
		importresource.set_apptemplatefilename(templatefilename);
		importresource.set_appname(appname);
		importresource.set_deploymentinfo(deploymentinfo);
			
		return importresource.perform_operation(client,"import");
	}
	
	public static base_response import_from_file(nitro_service client, String templatefilename, String appname, deploymentinfo deploymentinfo, options option) throws Exception {
		apptemplateinfo importresource = new apptemplateinfo();
		importresource.set_apptemplatefilename(templatefilename);
		importresource.set_appname(appname);
		importresource.set_deploymentinfo(deploymentinfo);
		
		option.set_action("import");
		
		return importresource.perform_operation(client,option);
	}
	
	
	
	/**
	* Use this API to export an application to an apptemplate file
	*/
	public static base_response export_to_file(nitro_service client, String appname) throws Exception {
		apptemplateinfo exportresource = new apptemplateinfo();
		exportresource.set_appname(appname);
		
		return exportresource.perform_operation(client,"export");
	}
	
	public static base_response export_to_file(nitro_service client, String appname, String templatefilename) throws Exception {
		apptemplateinfo exportresource = new apptemplateinfo();
		exportresource.set_apptemplatefilename(templatefilename);
		exportresource.set_appname(appname);
		
		return exportresource.perform_operation(client,"export");
	}

	
	public static base_response export_to_file(nitro_service client, String appname, String templatefilename, template_info template_info) throws Exception
	{
		apptemplateinfo exportresource = new apptemplateinfo();
		exportresource.set_appname(appname);
		exportresource.set_apptemplatefilename(templatefilename);
		exportresource.set_template_info(template_info);
	
		return exportresource.perform_operation(client,"export");
	}
	
	public static base_response export_to_file(nitro_service client, String appname, String templatefilename, String deploymentfilename) throws Exception {
		apptemplateinfo exportresource = new apptemplateinfo();
		exportresource.set_apptemplatefilename(templatefilename);
		exportresource.set_appname(appname);
		exportresource.set_deploymentfilename(deploymentfilename);
		
		return exportresource.perform_operation(client,"export");
	}

	
	public static base_response export_to_file(nitro_service client, String appname, String templatefilename, String deploymentfilename, template_info template_info) throws Exception
	{
		apptemplateinfo exportresource = new apptemplateinfo();
		exportresource.set_appname(appname);
		exportresource.set_apptemplatefilename(templatefilename);
		exportresource.set_deploymentfilename(deploymentfilename);
		exportresource.set_template_info(template_info);
	
		return exportresource.perform_operation(client,"export");
	}
}