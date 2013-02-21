package app;

import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.resource.base.*;

public class template_info {
	
	private String templateversion_major;
	private String templateversion_minor;
    private String author;
    private String introduction;
    private String summary;

    protected base_resource[] get_nitro_response(nitro_service service, String response) {
		apptemplateinfo_response result = (apptemplateinfo_response) service.get_payload_formatter().string_to_resource(apptemplateinfo_response.class, response);
		return result.apptemplate;
	}
	
	public void set_templateversion_major(String templateversion_major) throws Exception{
		this.templateversion_major = templateversion_major;
	}
	
	public String get_templateversion_major() throws Exception {
		return this.templateversion_major;
	}
	
	public void set_templateversion_minor(String templateversion_minor) throws Exception{
		this.templateversion_minor = templateversion_minor;
	}
	
	public String get_templateversion_minor() throws Exception {
		return this.templateversion_minor;
	}
	
	public void set_author(String author) throws Exception{
		this.author = author;
	}
	
	public String get_author() throws Exception {
		return this.author;
	}
	
	public void set_introduction(String introduction) throws Exception{
		this.introduction = introduction;
	}
	
	public String get_introduction() throws Exception {
		return this.introduction;
	}
	
	public void set_summary(String summary) throws Exception{
		this.summary = summary;
	}
	
	public String get_summary() throws Exception {
		return this.summary;
	}
	
}
