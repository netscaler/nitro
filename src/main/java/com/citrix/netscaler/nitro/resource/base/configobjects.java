/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2012 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/


package com.citrix.netscaler.nitro.resource.base;

import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.base.base_resource;
import com.citrix.netscaler.nitro.service.nitro_service;

class configobjects_response extends base_response
{
	public configobjects configobjects;
}

public class configobjects extends base_resource 
{
	private String[] objects;
	
	public String[] get_objects() throws Exception {
		return this.objects;
	}
	
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		configobjects[] resources = new configobjects[1];
		configobjects_response result = (configobjects_response) service.get_payload_formatter().string_to_resource(configobjects_response.class, response);
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
		resources[0] = result.configobjects;
		return resources;
	}

	protected String get_object_name() {
		return null;
	}
	
	/**
	* Use this API to fetch all the config objects resources that are available on netscaler.
	*/
	public static configobjects get(nitro_service service) throws Exception{
		configobjects obj = new configobjects();
		configobjects[] response = (configobjects[])obj.get_resources(service);
		return response[0];
	}
}
