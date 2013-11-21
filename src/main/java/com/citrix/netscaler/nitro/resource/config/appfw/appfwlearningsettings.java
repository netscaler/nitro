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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwlearningsettings_response extends base_response
{
	public appfwlearningsettings[] appfwlearningsettings;
}
/**
* Configuration for learning settings resource.
*/

public class appfwlearningsettings extends base_resource
{
	private String profilename;
	private Long starturlminthreshold;
	private Long starturlpercentthreshold;
	private Long cookieconsistencyminthreshold;
	private Long cookieconsistencypercentthreshold;
	private Long csrftagminthreshold;
	private Long csrftagpercentthreshold;
	private Long fieldconsistencyminthreshold;
	private Long fieldconsistencypercentthreshold;
	private Long crosssitescriptingminthreshold;
	private Long crosssitescriptingpercentthreshold;
	private Long sqlinjectionminthreshold;
	private Long sqlinjectionpercentthreshold;
	private Long fieldformatminthreshold;
	private Long fieldformatpercentthreshold;
	private Long xmlwsiminthreshold;
	private Long xmlwsipercentthreshold;
	private Long xmlattachmentminthreshold;
	private Long xmlattachmentpercentthreshold;
	private Long __count;

	/**
	* <pre>
	* Name of the profile.<br> Minimum length =  1
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* Name of the profile.<br> Minimum length =  1
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn start URLs.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_starturlminthreshold(long starturlminthreshold) throws Exception {
		this.starturlminthreshold = new Long(starturlminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn start URLs.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_starturlminthreshold(Long starturlminthreshold) throws Exception{
		this.starturlminthreshold = starturlminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn start URLs.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_starturlminthreshold() throws Exception {
		return this.starturlminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular start URL pattern for the learning engine to learn that start URL.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_starturlpercentthreshold(long starturlpercentthreshold) throws Exception {
		this.starturlpercentthreshold = new Long(starturlpercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular start URL pattern for the learning engine to learn that start URL.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_starturlpercentthreshold(Long starturlpercentthreshold) throws Exception{
		this.starturlpercentthreshold = starturlpercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular start URL pattern for the learning engine to learn that start URL.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_starturlpercentthreshold() throws Exception {
		return this.starturlpercentthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn cookies.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_cookieconsistencyminthreshold(long cookieconsistencyminthreshold) throws Exception {
		this.cookieconsistencyminthreshold = new Long(cookieconsistencyminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn cookies.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_cookieconsistencyminthreshold(Long cookieconsistencyminthreshold) throws Exception{
		this.cookieconsistencyminthreshold = cookieconsistencyminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn cookies.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_cookieconsistencyminthreshold() throws Exception {
		return this.cookieconsistencyminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular cookie pattern for the learning engine to learn that cookie.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_cookieconsistencypercentthreshold(long cookieconsistencypercentthreshold) throws Exception {
		this.cookieconsistencypercentthreshold = new Long(cookieconsistencypercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular cookie pattern for the learning engine to learn that cookie.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_cookieconsistencypercentthreshold(Long cookieconsistencypercentthreshold) throws Exception{
		this.cookieconsistencypercentthreshold = cookieconsistencypercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular cookie pattern for the learning engine to learn that cookie.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_cookieconsistencypercentthreshold() throws Exception {
		return this.cookieconsistencypercentthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn cross-site request forgery (CSRF) tags.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_csrftagminthreshold(long csrftagminthreshold) throws Exception {
		this.csrftagminthreshold = new Long(csrftagminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn cross-site request forgery (CSRF) tags.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_csrftagminthreshold(Long csrftagminthreshold) throws Exception{
		this.csrftagminthreshold = csrftagminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn cross-site request forgery (CSRF) tags.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_csrftagminthreshold() throws Exception {
		return this.csrftagminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular CSRF tag for the learning engine to learn that CSRF tag.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_csrftagpercentthreshold(long csrftagpercentthreshold) throws Exception {
		this.csrftagpercentthreshold = new Long(csrftagpercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular CSRF tag for the learning engine to learn that CSRF tag.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_csrftagpercentthreshold(Long csrftagpercentthreshold) throws Exception{
		this.csrftagpercentthreshold = csrftagpercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular CSRF tag for the learning engine to learn that CSRF tag.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_csrftagpercentthreshold() throws Exception {
		return this.csrftagpercentthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn field consistency information.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_fieldconsistencyminthreshold(long fieldconsistencyminthreshold) throws Exception {
		this.fieldconsistencyminthreshold = new Long(fieldconsistencyminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn field consistency information.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_fieldconsistencyminthreshold(Long fieldconsistencyminthreshold) throws Exception{
		this.fieldconsistencyminthreshold = fieldconsistencyminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn field consistency information.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_fieldconsistencyminthreshold() throws Exception {
		return this.fieldconsistencyminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular field consistency pattern for the learning engine to learn that field consistency pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_fieldconsistencypercentthreshold(long fieldconsistencypercentthreshold) throws Exception {
		this.fieldconsistencypercentthreshold = new Long(fieldconsistencypercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular field consistency pattern for the learning engine to learn that field consistency pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_fieldconsistencypercentthreshold(Long fieldconsistencypercentthreshold) throws Exception{
		this.fieldconsistencypercentthreshold = fieldconsistencypercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular field consistency pattern for the learning engine to learn that field consistency pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_fieldconsistencypercentthreshold() throws Exception {
		return this.fieldconsistencypercentthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn HTML cross-site scripting patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_crosssitescriptingminthreshold(long crosssitescriptingminthreshold) throws Exception {
		this.crosssitescriptingminthreshold = new Long(crosssitescriptingminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn HTML cross-site scripting patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_crosssitescriptingminthreshold(Long crosssitescriptingminthreshold) throws Exception{
		this.crosssitescriptingminthreshold = crosssitescriptingminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn HTML cross-site scripting patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_crosssitescriptingminthreshold() throws Exception {
		return this.crosssitescriptingminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular cross-site scripting pattern for the learning engine to learn that cross-site scripting pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_crosssitescriptingpercentthreshold(long crosssitescriptingpercentthreshold) throws Exception {
		this.crosssitescriptingpercentthreshold = new Long(crosssitescriptingpercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular cross-site scripting pattern for the learning engine to learn that cross-site scripting pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_crosssitescriptingpercentthreshold(Long crosssitescriptingpercentthreshold) throws Exception{
		this.crosssitescriptingpercentthreshold = crosssitescriptingpercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular cross-site scripting pattern for the learning engine to learn that cross-site scripting pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_crosssitescriptingpercentthreshold() throws Exception {
		return this.crosssitescriptingpercentthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn HTML SQL injection patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_sqlinjectionminthreshold(long sqlinjectionminthreshold) throws Exception {
		this.sqlinjectionminthreshold = new Long(sqlinjectionminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn HTML SQL injection patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_sqlinjectionminthreshold(Long sqlinjectionminthreshold) throws Exception{
		this.sqlinjectionminthreshold = sqlinjectionminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn HTML SQL injection patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sqlinjectionminthreshold() throws Exception {
		return this.sqlinjectionminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular HTML SQL injection pattern for the learning engine to learn that HTML SQL injection pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_sqlinjectionpercentthreshold(long sqlinjectionpercentthreshold) throws Exception {
		this.sqlinjectionpercentthreshold = new Long(sqlinjectionpercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular HTML SQL injection pattern for the learning engine to learn that HTML SQL injection pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_sqlinjectionpercentthreshold(Long sqlinjectionpercentthreshold) throws Exception{
		this.sqlinjectionpercentthreshold = sqlinjectionpercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular HTML SQL injection pattern for the learning engine to learn that HTML SQL injection pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_sqlinjectionpercentthreshold() throws Exception {
		return this.sqlinjectionpercentthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn field formats.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_fieldformatminthreshold(long fieldformatminthreshold) throws Exception {
		this.fieldformatminthreshold = new Long(fieldformatminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn field formats.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_fieldformatminthreshold(Long fieldformatminthreshold) throws Exception{
		this.fieldformatminthreshold = fieldformatminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn field formats.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_fieldformatminthreshold() throws Exception {
		return this.fieldformatminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular web form field pattern for the learning engine to recommend a field format for that form field.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_fieldformatpercentthreshold(long fieldformatpercentthreshold) throws Exception {
		this.fieldformatpercentthreshold = new Long(fieldformatpercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular web form field pattern for the learning engine to recommend a field format for that form field.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_fieldformatpercentthreshold(Long fieldformatpercentthreshold) throws Exception{
		this.fieldformatpercentthreshold = fieldformatpercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular web form field pattern for the learning engine to recommend a field format for that form field.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_fieldformatpercentthreshold() throws Exception {
		return this.fieldformatpercentthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn web services interoperability (WSI) information.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_xmlwsiminthreshold(long xmlwsiminthreshold) throws Exception {
		this.xmlwsiminthreshold = new Long(xmlwsiminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn web services interoperability (WSI) information.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_xmlwsiminthreshold(Long xmlwsiminthreshold) throws Exception{
		this.xmlwsiminthreshold = xmlwsiminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn web services interoperability (WSI) information.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_xmlwsiminthreshold() throws Exception {
		return this.xmlwsiminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular pattern for the learning engine to learn a web services interoperability (WSI) pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_xmlwsipercentthreshold(long xmlwsipercentthreshold) throws Exception {
		this.xmlwsipercentthreshold = new Long(xmlwsipercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular pattern for the learning engine to learn a web services interoperability (WSI) pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_xmlwsipercentthreshold(Long xmlwsipercentthreshold) throws Exception{
		this.xmlwsipercentthreshold = xmlwsipercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular pattern for the learning engine to learn a web services interoperability (WSI) pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_xmlwsipercentthreshold() throws Exception {
		return this.xmlwsipercentthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn XML attachment patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_xmlattachmentminthreshold(long xmlattachmentminthreshold) throws Exception {
		this.xmlattachmentminthreshold = new Long(xmlattachmentminthreshold);
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn XML attachment patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_xmlattachmentminthreshold(Long xmlattachmentminthreshold) throws Exception{
		this.xmlattachmentminthreshold = xmlattachmentminthreshold;
	}

	/**
	* <pre>
	* Minimum number of application firewall sessions that the learning engine must observe to learn XML attachment patterns.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_xmlattachmentminthreshold() throws Exception {
		return this.xmlattachmentminthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular XML attachment pattern for the learning engine to learn that XML attachment pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_xmlattachmentpercentthreshold(long xmlattachmentpercentthreshold) throws Exception {
		this.xmlattachmentpercentthreshold = new Long(xmlattachmentpercentthreshold);
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular XML attachment pattern for the learning engine to learn that XML attachment pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_xmlattachmentpercentthreshold(Long xmlattachmentpercentthreshold) throws Exception{
		this.xmlattachmentpercentthreshold = xmlattachmentpercentthreshold;
	}

	/**
	* <pre>
	* Minimum percentage of application firewall sessions that must contain a particular XML attachment pattern for the learning engine to learn that XML attachment pattern.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_xmlattachmentpercentthreshold() throws Exception {
		return this.xmlattachmentpercentthreshold;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwlearningsettings_response result = (appfwlearningsettings_response) service.get_payload_formatter().string_to_resource(appfwlearningsettings_response.class, response);
		if(result.errorcode != 0) {
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if (result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode);
			}
		}
		return result.appfwlearningsettings;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.profilename;
	}

	/**
	* Use this API to update appfwlearningsettings.
	*/
	public static base_response update(nitro_service client, appfwlearningsettings resource) throws Exception {
		appfwlearningsettings updateresource = new appfwlearningsettings();
		updateresource.profilename = resource.profilename;
		updateresource.starturlminthreshold = resource.starturlminthreshold;
		updateresource.starturlpercentthreshold = resource.starturlpercentthreshold;
		updateresource.cookieconsistencyminthreshold = resource.cookieconsistencyminthreshold;
		updateresource.cookieconsistencypercentthreshold = resource.cookieconsistencypercentthreshold;
		updateresource.csrftagminthreshold = resource.csrftagminthreshold;
		updateresource.csrftagpercentthreshold = resource.csrftagpercentthreshold;
		updateresource.fieldconsistencyminthreshold = resource.fieldconsistencyminthreshold;
		updateresource.fieldconsistencypercentthreshold = resource.fieldconsistencypercentthreshold;
		updateresource.crosssitescriptingminthreshold = resource.crosssitescriptingminthreshold;
		updateresource.crosssitescriptingpercentthreshold = resource.crosssitescriptingpercentthreshold;
		updateresource.sqlinjectionminthreshold = resource.sqlinjectionminthreshold;
		updateresource.sqlinjectionpercentthreshold = resource.sqlinjectionpercentthreshold;
		updateresource.fieldformatminthreshold = resource.fieldformatminthreshold;
		updateresource.fieldformatpercentthreshold = resource.fieldformatpercentthreshold;
		updateresource.xmlwsiminthreshold = resource.xmlwsiminthreshold;
		updateresource.xmlwsipercentthreshold = resource.xmlwsipercentthreshold;
		updateresource.xmlattachmentminthreshold = resource.xmlattachmentminthreshold;
		updateresource.xmlattachmentpercentthreshold = resource.xmlattachmentpercentthreshold;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appfwlearningsettings resources.
	*/
	public static base_responses update(nitro_service client, appfwlearningsettings resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwlearningsettings updateresources[] = new appfwlearningsettings[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwlearningsettings();
				updateresources[i].profilename = resources[i].profilename;
				updateresources[i].starturlminthreshold = resources[i].starturlminthreshold;
				updateresources[i].starturlpercentthreshold = resources[i].starturlpercentthreshold;
				updateresources[i].cookieconsistencyminthreshold = resources[i].cookieconsistencyminthreshold;
				updateresources[i].cookieconsistencypercentthreshold = resources[i].cookieconsistencypercentthreshold;
				updateresources[i].csrftagminthreshold = resources[i].csrftagminthreshold;
				updateresources[i].csrftagpercentthreshold = resources[i].csrftagpercentthreshold;
				updateresources[i].fieldconsistencyminthreshold = resources[i].fieldconsistencyminthreshold;
				updateresources[i].fieldconsistencypercentthreshold = resources[i].fieldconsistencypercentthreshold;
				updateresources[i].crosssitescriptingminthreshold = resources[i].crosssitescriptingminthreshold;
				updateresources[i].crosssitescriptingpercentthreshold = resources[i].crosssitescriptingpercentthreshold;
				updateresources[i].sqlinjectionminthreshold = resources[i].sqlinjectionminthreshold;
				updateresources[i].sqlinjectionpercentthreshold = resources[i].sqlinjectionpercentthreshold;
				updateresources[i].fieldformatminthreshold = resources[i].fieldformatminthreshold;
				updateresources[i].fieldformatpercentthreshold = resources[i].fieldformatpercentthreshold;
				updateresources[i].xmlwsiminthreshold = resources[i].xmlwsiminthreshold;
				updateresources[i].xmlwsipercentthreshold = resources[i].xmlwsipercentthreshold;
				updateresources[i].xmlattachmentminthreshold = resources[i].xmlattachmentminthreshold;
				updateresources[i].xmlattachmentpercentthreshold = resources[i].xmlattachmentpercentthreshold;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appfwlearningsettings resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appfwlearningsettings resource, String[] args) throws Exception{
		appfwlearningsettings unsetresource = new appfwlearningsettings();
		unsetresource.profilename = resource.profilename;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of appfwlearningsettings resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String profilename[], String args[]) throws Exception {
		base_responses result = null;
		if (profilename != null && profilename.length > 0) {
			appfwlearningsettings unsetresources[] = new appfwlearningsettings[profilename.length];
			for (int i=0;i<profilename.length;i++){
				unsetresources[i] = new appfwlearningsettings();
				unsetresources[i].profilename = profilename[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appfwlearningsettings resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, appfwlearningsettings resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwlearningsettings unsetresources[] = new appfwlearningsettings[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new appfwlearningsettings();
				unsetresources[i].profilename = resources[i].profilename;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the appfwlearningsettings resources that are configured on netscaler.
	*/
	public static appfwlearningsettings[] get(nitro_service service) throws Exception{
		appfwlearningsettings obj = new appfwlearningsettings();
		appfwlearningsettings[] response = (appfwlearningsettings[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwlearningsettings resources that are configured on netscaler.
	*/
	public static appfwlearningsettings[] get(nitro_service service, options option) throws Exception{
		appfwlearningsettings obj = new appfwlearningsettings();
		appfwlearningsettings[] response = (appfwlearningsettings[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appfwlearningsettings resource of given name .
	*/
	public static appfwlearningsettings get(nitro_service service, String profilename) throws Exception{
		appfwlearningsettings obj = new appfwlearningsettings();
		obj.set_profilename(profilename);
		appfwlearningsettings response = (appfwlearningsettings) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwlearningsettings resources of given names .
	*/
	public static appfwlearningsettings[] get(nitro_service service, String profilename[]) throws Exception{
		if (profilename !=null && profilename.length>0) {
			appfwlearningsettings response[] = new appfwlearningsettings[profilename.length];
			appfwlearningsettings obj[] = new appfwlearningsettings[profilename.length];
			for (int i=0;i<profilename.length;i++) {
				obj[i] = new appfwlearningsettings();
				obj[i].set_profilename(profilename[i]);
				response[i] = (appfwlearningsettings) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appfwlearningsettings resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwlearningsettings[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwlearningsettings obj = new appfwlearningsettings();
		options option = new options();
		option.set_filter(filter);
		appfwlearningsettings[] response = (appfwlearningsettings[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwlearningsettings resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwlearningsettings[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwlearningsettings obj = new appfwlearningsettings();
		options option = new options();
		option.set_filter(filter);
		appfwlearningsettings[] response = (appfwlearningsettings[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwlearningsettings resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwlearningsettings obj = new appfwlearningsettings();
		options option = new options();
		option.set_count(true);
		appfwlearningsettings[] response = (appfwlearningsettings[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwlearningsettings resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwlearningsettings obj = new appfwlearningsettings();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwlearningsettings[] response = (appfwlearningsettings[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwlearningsettings resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwlearningsettings obj = new appfwlearningsettings();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwlearningsettings[] response = (appfwlearningsettings[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
