package app;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import app.deploymentinfo;

class apptemplateinfo_response extends base_response
{
	public apptemplateinfo[] apptemplate;
}

public class apptemplateinfo extends base_resource {
	private String apptemplatefilename;
	private String deploymentfilename;
	private String appname;
	private template_info template_info;
	private deploymentinfo deploymentinfo;
	
	public void set_apptemplatefilename(String apptemplatefilename) {
		this.apptemplatefilename = apptemplatefilename;
	}
	
	public String get_apptemplatefilename() throws Exception {
		return this.apptemplatefilename;
	}
	
	public void set_deploymentfilename(String deploymentfilename) {
		this.deploymentfilename = deploymentfilename;
	}
	
	public String get_deploymentfilename() throws Exception {
		return this.deploymentfilename;
	}
	
	public void set_appname(String appname) throws Exception{
		this.appname = appname;
	}
	
	public String get_appname() throws Exception {
		return this.appname;
	}
	
	public void set_template_info(template_info template_info) {
		this.template_info = template_info;
	}
	
	public template_info template_info() throws Exception {
		return this.template_info;
	}
	
	public void set_deploymentinfo(deploymentinfo deploymentinfo) {
		this.deploymentinfo = deploymentinfo;
	}
	
	public deploymentinfo deploymentinfo() throws Exception {
		return this.deploymentinfo;
	}
	
	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) {
		apptemplateinfo_response result = (apptemplateinfo_response) service.get_payload_formatter().string_to_resource(apptemplateinfo_response.class, response);
		return result.apptemplate;
	}
	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.appname;
	}
	
}
