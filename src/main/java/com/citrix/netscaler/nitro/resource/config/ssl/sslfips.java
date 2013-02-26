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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslfips_response extends base_response
{
	public sslfips sslfips;
}
/**
* Configuration for fips resource.
*/

public class sslfips extends base_resource
{
	private String inithsm;
	private String sopassword;
	private String oldsopassword;
	private String userpassword;
	private String hsmlabel;
	private String fipsfw;

	//------- Read only Parameter ---------;

	private String erasedata;
	private Integer serial;
	private Integer majorversion;
	private Integer minorversion;
	private Integer flashmemorytotal;
	private Integer flashmemoryfree;
	private Integer sramtotal;
	private Integer sramfree;
	private Integer status;
	private Integer flag;
	private String serialno;
	private Integer state;
	private String firmwarereleasedate;
	private Integer coresmax;
	private Integer coresenabled;

	/**
	* <pre>
	* The FIPS initialization level.<br> Possible values = Level-2
	* </pre>
	*/
	public void set_inithsm(String inithsm) throws Exception{
		this.inithsm = inithsm;
	}

	/**
	* <pre>
	* The FIPS initialization level.<br> Possible values = Level-2
	* </pre>
	*/
	public String get_inithsm() throws Exception {
		return this.inithsm;
	}

	/**
	* <pre>
	* The Hardware Security Module's (HSM) Security Officer password.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sopassword(String sopassword) throws Exception{
		this.sopassword = sopassword;
	}

	/**
	* <pre>
	* The Hardware Security Module's (HSM) Security Officer password.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sopassword() throws Exception {
		return this.sopassword;
	}

	/**
	* <pre>
	* The old Security Officer password. This is used for authentication.<br> Minimum length =  1
	* </pre>
	*/
	public void set_oldsopassword(String oldsopassword) throws Exception{
		this.oldsopassword = oldsopassword;
	}

	/**
	* <pre>
	* The old Security Officer password. This is used for authentication.<br> Minimum length =  1
	* </pre>
	*/
	public String get_oldsopassword() throws Exception {
		return this.oldsopassword;
	}

	/**
	* <pre>
	* The Hardware Security Module's (HSM) User password.<br> Minimum length =  1
	* </pre>
	*/
	public void set_userpassword(String userpassword) throws Exception{
		this.userpassword = userpassword;
	}

	/**
	* <pre>
	* The Hardware Security Module's (HSM) User password.<br> Minimum length =  1
	* </pre>
	*/
	public String get_userpassword() throws Exception {
		return this.userpassword;
	}

	/**
	* <pre>
	* The label to identify the Hardware Security Module (HSM).<br> Minimum length =  1
	* </pre>
	*/
	public void set_hsmlabel(String hsmlabel) throws Exception{
		this.hsmlabel = hsmlabel;
	}

	/**
	* <pre>
	* The label to identify the Hardware Security Module (HSM).<br> Minimum length =  1
	* </pre>
	*/
	public String get_hsmlabel() throws Exception {
		return this.hsmlabel;
	}

	/**
	* <pre>
	* The FIPS firmware update.<br> Possible values = 4.6.1
	* </pre>
	*/
	public void set_fipsfw(String fipsfw) throws Exception{
		this.fipsfw = fipsfw;
	}

	/**
	* <pre>
	* The FIPS firmware update.<br> Possible values = 4.6.1
	* </pre>
	*/
	public String get_fipsfw() throws Exception {
		return this.fipsfw;
	}

	/**
	* <pre>
	* Erase data.<br> Default value: FIPS_ERASE<br> Minimum length =  1
	* </pre>
	*/
	public String get_erasedata() throws Exception {
		return this.erasedata;
	}

	/**
	* <pre>
	* FIPS card serial number.
	* </pre>
	*/
	public Integer get_serial() throws Exception {
		return this.serial;
	}

	/**
	* <pre>
	* Firmware major version.
	* </pre>
	*/
	public Integer get_majorversion() throws Exception {
		return this.majorversion;
	}

	/**
	* <pre>
	* Firmware minor version.
	* </pre>
	*/
	public Integer get_minorversion() throws Exception {
		return this.minorversion;
	}

	/**
	* <pre>
	* Total size of the flash memory on card.
	* </pre>
	*/
	public Integer get_flashmemorytotal() throws Exception {
		return this.flashmemorytotal;
	}

	/**
	* <pre>
	* Total size of free flash memory.
	* </pre>
	*/
	public Integer get_flashmemoryfree() throws Exception {
		return this.flashmemoryfree;
	}

	/**
	* <pre>
	* Total size of the SRAM memory on card.
	* </pre>
	*/
	public Integer get_sramtotal() throws Exception {
		return this.sramtotal;
	}

	/**
	* <pre>
	* Total size of free SRAM memory.
	* </pre>
	*/
	public Integer get_sramfree() throws Exception {
		return this.sramfree;
	}

	/**
	* <pre>
	* Status.
	* </pre>
	*/
	public Integer get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* Internal Flags.
	* </pre>
	*/
	public Integer get_flag() throws Exception {
		return this.flag;
	}

	/**
	* <pre>
	* FIPS card serial number.
	* </pre>
	*/
	public String get_serialno() throws Exception {
		return this.serialno;
	}

	/**
	* <pre>
	* FIPS card state.
	* </pre>
	*/
	public Integer get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* FIPS card firmware revision date.
	* </pre>
	*/
	public String get_firmwarereleasedate() throws Exception {
		return this.firmwarereleasedate;
	}

	/**
	* <pre>
	* Maximum number of crypto cores present in the FIPS card.
	* </pre>
	*/
	public Integer get_coresmax() throws Exception {
		return this.coresmax;
	}

	/**
	* <pre>
	* Number of crypto cores enabled in the FIPS card.
	* </pre>
	*/
	public Integer get_coresenabled() throws Exception {
		return this.coresenabled;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslfips[] resources = new sslfips[1];
		sslfips_response result = (sslfips_response) service.get_payload_formatter().string_to_resource(sslfips_response.class, response);
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
		resources[0] = result.sslfips;
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
	* Use this API to update sslfips.
	*/
	public static base_response update(nitro_service client, sslfips resource) throws Exception {
		sslfips updateresource = new sslfips();
		updateresource.inithsm = resource.inithsm;
		updateresource.sopassword = resource.sopassword;
		updateresource.oldsopassword = resource.oldsopassword;
		updateresource.userpassword = resource.userpassword;
		updateresource.hsmlabel = resource.hsmlabel;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of sslfips resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslfips resource, String[] args) throws Exception{
		sslfips unsetresource = new sslfips();
		unsetresource.hsmlabel = resource.hsmlabel;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to reset sslfips.
	*/
	public static base_response reset(nitro_service client, sslfips resource) throws Exception {
		sslfips resetresource = new sslfips();
		return resetresource.perform_operation(client,"reset");
	}

	/**
	* Use this API to change sslfips.
	*/
	public static base_response change(nitro_service client, sslfips resource) throws Exception {
		sslfips updateresource = new sslfips();
		updateresource.fipsfw = resource.fipsfw;
		return updateresource.perform_operation(client,"update");
	}

	/**
	* Use this API to fetch all the sslfips resources that are configured on netscaler.
	*/
	public static sslfips get(nitro_service service) throws Exception{
		sslfips obj = new sslfips();
		sslfips[] response = (sslfips[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the sslfips resources that are configured on netscaler.
	*/
	public static sslfips get(nitro_service service,  options option) throws Exception{
		sslfips obj = new sslfips();
		sslfips[] response = (sslfips[])obj.get_resources(service,option);
		return response[0];
	}

	public static class inithsmEnum {
		public static final String Level_2 = "Level-2";
	}
	public static class fipsfwEnum {
		public static final String _4_6_1 = "4.6.1";
	}
}
