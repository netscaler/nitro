package app;

import com.citrix.netscaler.nitro.resource.base.base_resource;
import com.citrix.netscaler.nitro.resource.config.basic.service;
import com.citrix.netscaler.nitro.service.nitro_service;
import app.appendpoint;


public class deploymentinfo {
	
	private appendpoint[] appendpoint; 
	private service[] service;
	private variable[] variable;
		
	protected base_resource[] get_nitro_response(nitro_service service, String response) {
		apptemplateinfo_response result = (apptemplateinfo_response) service.get_payload_formatter().string_to_resource(apptemplateinfo_response.class, response);
		return result.apptemplate;
	}
	
	public void set_publicendpoints(appendpoint[] endpoint) {
		this.appendpoint = endpoint;
	}
	
	public appendpoint[] get_publicendpoints() throws Exception {
		return this.appendpoint;
	}
	
	public void set_backendservices(service[] backendservices) {
		this.service = backendservices;
	}
	
	public service[] get_backendservices() throws Exception {
		return this.service;
	}
	
	public void set_variables(variable[] variable) {
		this.variable = variable;
	}
	
	public variable[] get_variables() throws Exception {
		return this.variable;
	}
	

}
