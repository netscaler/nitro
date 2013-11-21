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

package com.citrix.netscaler.nitro.resource.config.co;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class coparameter_response extends base_response
{
	public coparameter coparameter;
}
/**
* Configuration for CO parameter resource.
*/

public class coparameter extends base_resource
{
	private Boolean cachemaxage;
	private Boolean imgtype;
	private Boolean jpegqualitypercent;
	private Boolean inlinecssthressize;
	private Boolean inlinejsthressize;
	private Boolean inlineimgthressize;

	/**
	* <pre>
	* Maximum age for cache extension in days.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  360
	* </pre>
	*/
	public void set_cachemaxage(boolean cachemaxage) throws Exception {
		this.cachemaxage = new Boolean(cachemaxage);
	}

	/**
	* <pre>
	* Maximum age for cache extension in days.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  360
	* </pre>
	*/
	public void set_cachemaxage(Boolean cachemaxage) throws Exception{
		this.cachemaxage = cachemaxage;
	}

	/**
	* <pre>
	* Maximum age for cache extension in days.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  360
	* </pre>
	*/
	public Boolean get_cachemaxage() throws Exception {
		return this.cachemaxage;
	}

	/**
	* <pre>
	* Image format whose quality we want to reduce. e.g. reduce only jpeg images.<br> Default value: 0
	* </pre>
	*/
	public void set_imgtype(boolean imgtype) throws Exception {
		this.imgtype = new Boolean(imgtype);
	}

	/**
	* <pre>
	* Image format whose quality we want to reduce. e.g. reduce only jpeg images.<br> Default value: 0
	* </pre>
	*/
	public void set_imgtype(Boolean imgtype) throws Exception{
		this.imgtype = imgtype;
	}

	/**
	* <pre>
	* Image format whose quality we want to reduce. e.g. reduce only jpeg images.<br> Default value: 0
	* </pre>
	*/
	public Boolean get_imgtype() throws Exception {
		return this.imgtype;
	}

	/**
	* <pre>
	* to with % quality of a particular image can be reduced. Range: 0 - 100.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_jpegqualitypercent(boolean jpegqualitypercent) throws Exception {
		this.jpegqualitypercent = new Boolean(jpegqualitypercent);
	}

	/**
	* <pre>
	* to with % quality of a particular image can be reduced. Range: 0 - 100.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_jpegqualitypercent(Boolean jpegqualitypercent) throws Exception{
		this.jpegqualitypercent = jpegqualitypercent;
	}

	/**
	* <pre>
	* to with % quality of a particular image can be reduced. Range: 0 - 100.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Boolean get_jpegqualitypercent() throws Exception {
		return this.jpegqualitypercent;
	}

	/**
	* <pre>
	* Threshold file size for inlining the css, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public void set_inlinecssthressize(boolean inlinecssthressize) throws Exception {
		this.inlinecssthressize = new Boolean(inlinecssthressize);
	}

	/**
	* <pre>
	* Threshold file size for inlining the css, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public void set_inlinecssthressize(Boolean inlinecssthressize) throws Exception{
		this.inlinecssthressize = inlinecssthressize;
	}

	/**
	* <pre>
	* Threshold file size for inlining the css, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public Boolean get_inlinecssthressize() throws Exception {
		return this.inlinecssthressize;
	}

	/**
	* <pre>
	* Thres file size for inlining the js, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public void set_inlinejsthressize(boolean inlinejsthressize) throws Exception {
		this.inlinejsthressize = new Boolean(inlinejsthressize);
	}

	/**
	* <pre>
	* Thres file size for inlining the js, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public void set_inlinejsthressize(Boolean inlinejsthressize) throws Exception{
		this.inlinejsthressize = inlinejsthressize;
	}

	/**
	* <pre>
	* Thres file size for inlining the js, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public Boolean get_inlinejsthressize() throws Exception {
		return this.inlinejsthressize;
	}

	/**
	* <pre>
	* Maximum file size for inlining the img, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public void set_inlineimgthressize(boolean inlineimgthressize) throws Exception {
		this.inlineimgthressize = new Boolean(inlineimgthressize);
	}

	/**
	* <pre>
	* Maximum file size for inlining the img, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public void set_inlineimgthressize(Boolean inlineimgthressize) throws Exception{
		this.inlineimgthressize = inlineimgthressize;
	}

	/**
	* <pre>
	* Maximum file size for inlining the img, in bytes.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2048
	* </pre>
	*/
	public Boolean get_inlineimgthressize() throws Exception {
		return this.inlineimgthressize;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		coparameter[] resources = new coparameter[1];
		coparameter_response result = (coparameter_response) service.get_payload_formatter().string_to_resource(coparameter_response.class, response);
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
		resources[0] = result.coparameter;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to unset the properties of coparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, coparameter resource, String[] args) throws Exception{
		coparameter unsetresource = new coparameter();
		return unsetresource.unset_resource(client,args);
	}

}
