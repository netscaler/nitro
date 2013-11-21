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

class sslfipskey_response extends base_response
{
	public sslfipskey[] sslfipskey;
}
/**
* Configuration for FIPS key resource.
*/

public class sslfipskey extends base_resource
{
	private String fipskeyname;
	private Long modulus;
	private String exponent;
	private String key;
	private String inform;
	private String wrapkeyname;
	private String iv;

	//------- Read only Parameter ---------;

	private Long size;
	private Long __count;

	/**
	* <pre>
	* Name for the FIPS key. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the FIPS key is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my fipskey" or 'my fipskey').<br> Minimum length =  1
	* </pre>
	*/
	public void set_fipskeyname(String fipskeyname) throws Exception{
		this.fipskeyname = fipskeyname;
	}

	/**
	* <pre>
	* Name for the FIPS key. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the FIPS key is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my fipskey" or 'my fipskey').<br> Minimum length =  1
	* </pre>
	*/
	public String get_fipskeyname() throws Exception {
		return this.fipskeyname;
	}

	/**
	* <pre>
	* Modulus, in multiples of 64, of the FIPS key to be created.<br> Minimum value =  1024<br> Maximum value =  4096
	* </pre>
	*/
	public void set_modulus(long modulus) throws Exception {
		this.modulus = new Long(modulus);
	}

	/**
	* <pre>
	* Modulus, in multiples of 64, of the FIPS key to be created.<br> Minimum value =  1024<br> Maximum value =  4096
	* </pre>
	*/
	public void set_modulus(Long modulus) throws Exception{
		this.modulus = modulus;
	}

	/**
	* <pre>
	* Modulus, in multiples of 64, of the FIPS key to be created.<br> Minimum value =  1024<br> Maximum value =  4096
	* </pre>
	*/
	public Long get_modulus() throws Exception {
		return this.modulus;
	}

	/**
	* <pre>
	* Exponent value for the FIPS key to be created. Available values function as follows:
 3=3 (hexadecimal)
F4=10001 (hexadecimal).<br> Default value: 3<br> Possible values = 3, F4
	* </pre>
	*/
	public void set_exponent(String exponent) throws Exception{
		this.exponent = exponent;
	}

	/**
	* <pre>
	* Exponent value for the FIPS key to be created. Available values function as follows:
 3=3 (hexadecimal)
F4=10001 (hexadecimal).<br> Default value: 3<br> Possible values = 3, F4
	* </pre>
	*/
	public String get_exponent() throws Exception {
		return this.exponent;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the key file to be imported.
 /nsconfig/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public void set_key(String key) throws Exception{
		this.key = key;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the key file to be imported.
 /nsconfig/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public String get_key() throws Exception {
		return this.key;
	}

	/**
	* <pre>
	* Input format of the key file. Available formats are:
SIM - Secure Information Management; select when importing a FIPS key. If the external FIPS key is encrypted, first decrypt it, and then import it.
PEM - Privacy Enhanced Mail; select when importing a non-FIPS key.
<br> Default value: SIM<br> Possible values = SIM, DER, PEM
	* </pre>
	*/
	public void set_inform(String inform) throws Exception{
		this.inform = inform;
	}

	/**
	* <pre>
	* Input format of the key file. Available formats are:
SIM - Secure Information Management; select when importing a FIPS key. If the external FIPS key is encrypted, first decrypt it, and then import it.
PEM - Privacy Enhanced Mail; select when importing a non-FIPS key.
<br> Default value: SIM<br> Possible values = SIM, DER, PEM
	* </pre>
	*/
	public String get_inform() throws Exception {
		return this.inform;
	}

	/**
	* <pre>
	* Name of the wrap key to use for importing the key. Required for importing a non-FIPS key.<br> Minimum length =  1
	* </pre>
	*/
	public void set_wrapkeyname(String wrapkeyname) throws Exception{
		this.wrapkeyname = wrapkeyname;
	}

	/**
	* <pre>
	* Name of the wrap key to use for importing the key. Required for importing a non-FIPS key.<br> Minimum length =  1
	* </pre>
	*/
	public String get_wrapkeyname() throws Exception {
		return this.wrapkeyname;
	}

	/**
	* <pre>
	* Initialization Vector (IV) to use for importing the key. Required for importing a non-FIPS key.<br> Minimum length =  1
	* </pre>
	*/
	public void set_iv(String iv) throws Exception{
		this.iv = iv;
	}

	/**
	* <pre>
	* Initialization Vector (IV) to use for importing the key. Required for importing a non-FIPS key.<br> Minimum length =  1
	* </pre>
	*/
	public String get_iv() throws Exception {
		return this.iv;
	}

	/**
	* <pre>
	* Size.
	* </pre>
	*/
	public Long get_size() throws Exception {
		return this.size;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslfipskey_response result = (sslfipskey_response) service.get_payload_formatter().string_to_resource(sslfipskey_response.class, response);
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
		return result.sslfipskey;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.fipskeyname;
	}

	/**
	* Use this API to create sslfipskey.
	*/
	public static base_response create(nitro_service client, sslfipskey resource) throws Exception {
		sslfipskey createresource = new sslfipskey();
		createresource.fipskeyname = resource.fipskeyname;
		createresource.modulus = resource.modulus;
		createresource.exponent = resource.exponent;
		return createresource.perform_operation(client,"create");
	}

	/**
	* Use this API to create sslfipskey resources.
	*/
	public static base_responses create(nitro_service client, sslfipskey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslfipskey createresources[] = new sslfipskey[resources.length];
			for (int i=0;i<resources.length;i++){
				createresources[i] = new sslfipskey();
				createresources[i].fipskeyname = resources[i].fipskeyname;
				createresources[i].modulus = resources[i].modulus;
				createresources[i].exponent = resources[i].exponent;
			}
			result = perform_operation_bulk_request(client, createresources,"create");
		}
		return result;
	}

	/**
	* Use this API to delete sslfipskey of given name.
	*/
	public static base_response delete(nitro_service client, String fipskeyname) throws Exception {
		sslfipskey deleteresource = new sslfipskey();
		deleteresource.fipskeyname = fipskeyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslfipskey.
	*/
	public static base_response delete(nitro_service client, sslfipskey resource) throws Exception {
		sslfipskey deleteresource = new sslfipskey();
		deleteresource.fipskeyname = resource.fipskeyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslfipskey resources of given names.
	*/
	public static base_responses delete(nitro_service client, String fipskeyname[]) throws Exception {
		base_responses result = null;
		if (fipskeyname != null && fipskeyname.length > 0) {
			sslfipskey deleteresources[] = new sslfipskey[fipskeyname.length];
			for (int i=0;i<fipskeyname.length;i++){
				deleteresources[i] = new sslfipskey();
				deleteresources[i].fipskeyname = fipskeyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslfipskey resources.
	*/
	public static base_responses delete(nitro_service client, sslfipskey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslfipskey deleteresources[] = new sslfipskey[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslfipskey();
				deleteresources[i].fipskeyname = resources[i].fipskeyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to Import sslfipskey.
	*/
	public static base_response Import(nitro_service client, sslfipskey resource) throws Exception {
		sslfipskey Importresource = new sslfipskey();
		Importresource.fipskeyname = resource.fipskeyname;
		Importresource.key = resource.key;
		Importresource.inform = resource.inform;
		Importresource.wrapkeyname = resource.wrapkeyname;
		Importresource.iv = resource.iv;
		Importresource.exponent = resource.exponent;
		return Importresource.perform_operation(client,"Import");
	}

	/**
	* Use this API to Import sslfipskey resources.
	*/
	public static base_responses Import(nitro_service client, sslfipskey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslfipskey Importresources[] = new sslfipskey[resources.length];
			for (int i=0;i<resources.length;i++){
				Importresources[i] = new sslfipskey();
				Importresources[i].fipskeyname = resources[i].fipskeyname;
				Importresources[i].key = resources[i].key;
				Importresources[i].inform = resources[i].inform;
				Importresources[i].wrapkeyname = resources[i].wrapkeyname;
				Importresources[i].iv = resources[i].iv;
				Importresources[i].exponent = resources[i].exponent;
			}
			result = perform_operation_bulk_request(client, Importresources,"Import");
		}
		return result;
	}

	/**
	* Use this API to export sslfipskey.
	*/
	public static base_response export(nitro_service client, sslfipskey resource) throws Exception {
		sslfipskey exportresource = new sslfipskey();
		exportresource.fipskeyname = resource.fipskeyname;
		exportresource.key = resource.key;
		return exportresource.perform_operation(client,"export");
	}

	/**
	* Use this API to export sslfipskey resources.
	*/
	public static base_responses export(nitro_service client, sslfipskey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslfipskey exportresources[] = new sslfipskey[resources.length];
			for (int i=0;i<resources.length;i++){
				exportresources[i] = new sslfipskey();
				exportresources[i].fipskeyname = resources[i].fipskeyname;
				exportresources[i].key = resources[i].key;
			}
			result = perform_operation_bulk_request(client, exportresources,"export");
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslfipskey resources that are configured on netscaler.
	*/
	public static sslfipskey[] get(nitro_service service) throws Exception{
		sslfipskey obj = new sslfipskey();
		sslfipskey[] response = (sslfipskey[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslfipskey resources that are configured on netscaler.
	*/
	public static sslfipskey[] get(nitro_service service, options option) throws Exception{
		sslfipskey obj = new sslfipskey();
		sslfipskey[] response = (sslfipskey[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslfipskey resource of given name .
	*/
	public static sslfipskey get(nitro_service service, String fipskeyname) throws Exception{
		sslfipskey obj = new sslfipskey();
		obj.set_fipskeyname(fipskeyname);
		sslfipskey response = (sslfipskey) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslfipskey resources of given names .
	*/
	public static sslfipskey[] get(nitro_service service, String fipskeyname[]) throws Exception{
		if (fipskeyname !=null && fipskeyname.length>0) {
			sslfipskey response[] = new sslfipskey[fipskeyname.length];
			sslfipskey obj[] = new sslfipskey[fipskeyname.length];
			for (int i=0;i<fipskeyname.length;i++) {
				obj[i] = new sslfipskey();
				obj[i].set_fipskeyname(fipskeyname[i]);
				response[i] = (sslfipskey) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslfipskey resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslfipskey[] get_filtered(nitro_service service, String filter) throws Exception{
		sslfipskey obj = new sslfipskey();
		options option = new options();
		option.set_filter(filter);
		sslfipskey[] response = (sslfipskey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslfipskey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslfipskey[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslfipskey obj = new sslfipskey();
		options option = new options();
		option.set_filter(filter);
		sslfipskey[] response = (sslfipskey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslfipskey resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslfipskey obj = new sslfipskey();
		options option = new options();
		option.set_count(true);
		sslfipskey[] response = (sslfipskey[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslfipskey resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslfipskey obj = new sslfipskey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslfipskey[] response = (sslfipskey[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslfipskey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslfipskey obj = new sslfipskey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslfipskey[] response = (sslfipskey[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class informEnum {
		public static final String SIM = "SIM";
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
	public static class exponentEnum {
		public static final String _3 = "3";
		public static final String F4 = "F4";
	}
}
