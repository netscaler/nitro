package app;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;

public class variable extends base_resource {
	
	private String name;
	private String value;
	
	protected base_resource[] get_nitro_response(nitro_service service, String response) {
		apptemplateinfo_response result = (apptemplateinfo_response) service.get_payload_formatter().string_to_resource(apptemplateinfo_response.class, response);
		return result.apptemplate;
	}
	
	protected String get_object_name() {
		return this.name;
	}

	public String get_name() {
		return this.name;
	}
	
	public void set_name(String name) throws Exception{
		this.name = name;
	}
	
	public String get_value() {
		return this.value;
	}
	
	public void set_value(String value) throws Exception{
		this.value = value;
	}
}