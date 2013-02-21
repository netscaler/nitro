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

class sslcertkey_response extends base_response
{
	public sslcertkey[] sslcertkey;
}
/**
* Configuration for certificate key resource.
*/

public class sslcertkey extends base_resource
{
	private String certkey;
	private String cert;
	private String key;
	private Boolean password;
	private String fipskey;
	private String inform;
	private String passplain;
	private String expirymonitor;
	private Long notificationperiod;
	private String linkcertkeyname;
	private Boolean nodomaincheck;

	//------- Read only Parameter ---------;

	private String signaturealg;
	private String serial;
	private String issuer;
	private String clientcertnotbefore;
	private String clientcertnotafter;
	private Integer daystoexpiration;
	private String subject;
	private String publickey;
	private Integer publickeysize;
	private Integer version;
	private Long priority;
	private String status;
	private String passcrypt;
	private Long data;
	private String servicename;
	private Long __count;

	/**
	* <pre>
	* The name of the certificate and private-key pair.<br> Minimum length =  1
	* </pre>
	*/
	public void set_certkey(String certkey) throws Exception{
		this.certkey = certkey;
	}

	/**
	* <pre>
	* The name of the certificate and private-key pair.<br> Minimum length =  1
	* </pre>
	*/
	public String get_certkey() throws Exception {
		return this.certkey;
	}

	/**
	* <pre>
	* The file name and path for the X509 certificate file. The certificate file should be present on the system device (HDD). The default input path for the certificate file is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cert(String cert) throws Exception{
		this.cert = cert;
	}

	/**
	* <pre>
	* The file name and path for the X509 certificate file. The certificate file should be present on the system device (HDD). The default input path for the certificate file is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cert() throws Exception {
		return this.cert;
	}

	/**
	* <pre>
	* The file name and path for the private-key file. The private-key file should be present on the system device (HDD). The default input path for the key file is /nsconfig/ssl/.

Notes:
1) This argument is optional when adding a Certificate-Authority (CA) certificate file. In this case the CA's private-key will not be available to the user.
2) The System's FIPS system does not support external keys (non-FIPS keys). On a System's FIPS system, you will not be able to load keys from a local storage device such as a hard disc or flash memory.<br> Minimum length =  1
	* </pre>
	*/
	public void set_key(String key) throws Exception{
		this.key = key;
	}

	/**
	* <pre>
	* The file name and path for the private-key file. The private-key file should be present on the system device (HDD). The default input path for the key file is /nsconfig/ssl/.

Notes:
1) This argument is optional when adding a Certificate-Authority (CA) certificate file. In this case the CA's private-key will not be available to the user.
2) The System's FIPS system does not support external keys (non-FIPS keys). On a System's FIPS system, you will not be able to load keys from a local storage device such as a hard disc or flash memory.<br> Minimum length =  1
	* </pre>
	*/
	public String get_key() throws Exception {
		return this.key;
	}

	/**
	* <pre>
	* The pass-phrase that was used to encrypt the private-key. This option can be used to load encrypted private-keys. The maximum length of the pass-phrase supported is 32 characters.

			Note: Password protected private key is supported only for the PEM format.
	* </pre>
	*/
	public void set_password(boolean password) throws Exception {
		this.password = new Boolean(password);
	}

	/**
	* <pre>
	* The pass-phrase that was used to encrypt the private-key. This option can be used to load encrypted private-keys. The maximum length of the pass-phrase supported is 32 characters.

			Note: Password protected private key is supported only for the PEM format.
	* </pre>
	*/
	public void set_password(Boolean password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* The pass-phrase that was used to encrypt the private-key. This option can be used to load encrypted private-keys. The maximum length of the pass-phrase supported is 32 characters.

			Note: Password protected private key is supported only for the PEM format.
	* </pre>
	*/
	public Boolean get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* The name of the FIPS key. The FIPS key is created inside the FIPS HSM (Hardware Security Module). This is applicable only to the SSL FIPS system.<br> Minimum length =  1
	* </pre>
	*/
	public void set_fipskey(String fipskey) throws Exception{
		this.fipskey = fipskey;
	}

	/**
	* <pre>
	* The name of the FIPS key. The FIPS key is created inside the FIPS HSM (Hardware Security Module). This is applicable only to the SSL FIPS system.<br> Minimum length =  1
	* </pre>
	*/
	public String get_fipskey() throws Exception {
		return this.fipskey;
	}

	/**
	* <pre>
	* The input format of the certificate and the private-key files. The two formats supported by the system are:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_inform(String inform) throws Exception{
		this.inform = inform;
	}

	/**
	* <pre>
	* The input format of the certificate and the private-key files. The two formats supported by the system are:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_inform() throws Exception {
		return this.inform;
	}

	/**
	* <pre>
	* This is mostly used for API purpose.The pass-phrase that was used to encrypt the private-key. This option can be used to load encrypted private-keys. The maximum length of the pass-phrase supported is 32 characters.
                      Note: Password protected private key is supported only for the PEM format.<br> Minimum length =  1
	* </pre>
	*/
	public void set_passplain(String passplain) throws Exception{
		this.passplain = passplain;
	}

	/**
	* <pre>
	* This is mostly used for API purpose.The pass-phrase that was used to encrypt the private-key. This option can be used to load encrypted private-keys. The maximum length of the pass-phrase supported is 32 characters.
                      Note: Password protected private key is supported only for the PEM format.<br> Minimum length =  1
	* </pre>
	*/
	public String get_passplain() throws Exception {
		return this.passplain;
	}

	/**
	* <pre>
	* Alert before the certificate is about to expire.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_expirymonitor(String expirymonitor) throws Exception{
		this.expirymonitor = expirymonitor;
	}

	/**
	* <pre>
	* Alert before the certificate is about to expire.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_expirymonitor() throws Exception {
		return this.expirymonitor;
	}

	/**
	* <pre>
	* Number of days in advance when an alert needs to be generated for a certificate which is about to expire.<br> Minimum value =  10<br> Maximum value =  100
	* </pre>
	*/
	public void set_notificationperiod(long notificationperiod) throws Exception {
		this.notificationperiod = new Long(notificationperiod);
	}

	/**
	* <pre>
	* Number of days in advance when an alert needs to be generated for a certificate which is about to expire.<br> Minimum value =  10<br> Maximum value =  100
	* </pre>
	*/
	public void set_notificationperiod(Long notificationperiod) throws Exception{
		this.notificationperiod = notificationperiod;
	}

	/**
	* <pre>
	* Number of days in advance when an alert needs to be generated for a certificate which is about to expire.<br> Minimum value =  10<br> Maximum value =  100
	* </pre>
	*/
	public Long get_notificationperiod() throws Exception {
		return this.notificationperiod;
	}

	/**
	* <pre>
	* The name of the Certificate-Authority.<br> Minimum length =  1
	* </pre>
	*/
	public void set_linkcertkeyname(String linkcertkeyname) throws Exception{
		this.linkcertkeyname = linkcertkeyname;
	}

	/**
	* <pre>
	* The name of the Certificate-Authority.<br> Minimum length =  1
	* </pre>
	*/
	public String get_linkcertkeyname() throws Exception {
		return this.linkcertkeyname;
	}

	/**
	* <pre>
	* Specify this option to override the check for matching domain names during certificate update operation.
	* </pre>
	*/
	public void set_nodomaincheck(boolean nodomaincheck) throws Exception {
		this.nodomaincheck = new Boolean(nodomaincheck);
	}

	/**
	* <pre>
	* Specify this option to override the check for matching domain names during certificate update operation.
	* </pre>
	*/
	public void set_nodomaincheck(Boolean nodomaincheck) throws Exception{
		this.nodomaincheck = nodomaincheck;
	}

	/**
	* <pre>
	* Specify this option to override the check for matching domain names during certificate update operation.
	* </pre>
	*/
	public Boolean get_nodomaincheck() throws Exception {
		return this.nodomaincheck;
	}

	/**
	* <pre>
	* Signature algorithm.
	* </pre>
	*/
	public String get_signaturealg() throws Exception {
		return this.signaturealg;
	}

	/**
	* <pre>
	* Serial number.
	* </pre>
	*/
	public String get_serial() throws Exception {
		return this.serial;
	}

	/**
	* <pre>
	* Issuer name.
	* </pre>
	*/
	public String get_issuer() throws Exception {
		return this.issuer;
	}

	/**
	* <pre>
	* Not-Before date.
	* </pre>
	*/
	public String get_clientcertnotbefore() throws Exception {
		return this.clientcertnotbefore;
	}

	/**
	* <pre>
	* Not-After date.
	* </pre>
	*/
	public String get_clientcertnotafter() throws Exception {
		return this.clientcertnotafter;
	}

	/**
	* <pre>
	* Days remaining for the certificate to expire.
	* </pre>
	*/
	public Integer get_daystoexpiration() throws Exception {
		return this.daystoexpiration;
	}

	/**
	* <pre>
	* Subject name.
	* </pre>
	*/
	public String get_subject() throws Exception {
		return this.subject;
	}

	/**
	* <pre>
	* Public key algorithm.
	* </pre>
	*/
	public String get_publickey() throws Exception {
		return this.publickey;
	}

	/**
	* <pre>
	* Size of the public key.
	* </pre>
	*/
	public Integer get_publickeysize() throws Exception {
		return this.publickeysize;
	}

	/**
	* <pre>
	* Version.
	* </pre>
	*/
	public Integer get_version() throws Exception {
		return this.version;
	}

	/**
	* <pre>
	* ocsp priority.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Status of the certificate.<br> Possible values = Valid, Not yet valid, Expired
	* </pre>
	*/
	public String get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* Passcrypt.<br> Minimum length =  1
	* </pre>
	*/
	public String get_passcrypt() throws Exception {
		return this.passcrypt;
	}

	/**
	* <pre>
	* Vserver Id.
	* </pre>
	*/
	public Long get_data() throws Exception {
		return this.data;
	}

	/**
	* <pre>
	* Service name to which the certificate key pair is bound.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcertkey_response result = (sslcertkey_response) service.get_payload_formatter().string_to_resource(sslcertkey_response.class, response);
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
		return result.sslcertkey;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.certkey;
	}

	/**
	* Use this API to add sslcertkey.
	*/
	public static base_response add(nitro_service client, sslcertkey resource) throws Exception {
		sslcertkey addresource = new sslcertkey();
		addresource.certkey = resource.certkey;
		addresource.cert = resource.cert;
		addresource.key = resource.key;
		addresource.password = resource.password;
		addresource.fipskey = resource.fipskey;
		addresource.inform = resource.inform;
		addresource.passplain = resource.passplain;
		addresource.expirymonitor = resource.expirymonitor;
		addresource.notificationperiod = resource.notificationperiod;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add sslcertkey resources.
	*/
	public static base_responses add(nitro_service client, sslcertkey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcertkey addresources[] = new sslcertkey[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new sslcertkey();
				addresources[i].certkey = resources[i].certkey;
				addresources[i].cert = resources[i].cert;
				addresources[i].key = resources[i].key;
				addresources[i].password = resources[i].password;
				addresources[i].fipskey = resources[i].fipskey;
				addresources[i].inform = resources[i].inform;
				addresources[i].passplain = resources[i].passplain;
				addresources[i].expirymonitor = resources[i].expirymonitor;
				addresources[i].notificationperiod = resources[i].notificationperiod;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslcertkey of given name.
	*/
	public static base_response delete(nitro_service client, String certkey) throws Exception {
		sslcertkey deleteresource = new sslcertkey();
		deleteresource.certkey = certkey;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslcertkey.
	*/
	public static base_response delete(nitro_service client, sslcertkey resource) throws Exception {
		sslcertkey deleteresource = new sslcertkey();
		deleteresource.certkey = resource.certkey;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslcertkey resources of given names.
	*/
	public static base_responses delete(nitro_service client, String certkey[]) throws Exception {
		base_responses result = null;
		if (certkey != null && certkey.length > 0) {
			sslcertkey deleteresources[] = new sslcertkey[certkey.length];
			for (int i=0;i<certkey.length;i++){
				deleteresources[i] = new sslcertkey();
				deleteresources[i].certkey = certkey[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslcertkey resources.
	*/
	public static base_responses delete(nitro_service client, sslcertkey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcertkey deleteresources[] = new sslcertkey[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslcertkey();
				deleteresources[i].certkey = resources[i].certkey;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update sslcertkey.
	*/
	public static base_response update(nitro_service client, sslcertkey resource) throws Exception {
		sslcertkey updateresource = new sslcertkey();
		updateresource.certkey = resource.certkey;
		updateresource.expirymonitor = resource.expirymonitor;
		updateresource.notificationperiod = resource.notificationperiod;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update sslcertkey resources.
	*/
	public static base_responses update(nitro_service client, sslcertkey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcertkey updateresources[] = new sslcertkey[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslcertkey();
				updateresources[i].certkey = resources[i].certkey;
				updateresources[i].expirymonitor = resources[i].expirymonitor;
				updateresources[i].notificationperiod = resources[i].notificationperiod;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslcertkey resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String certkey, String args[]) throws Exception {
		sslcertkey unsetresource = new sslcertkey();
		unsetresource.certkey = certkey;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of sslcertkey resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslcertkey resource, String[] args) throws Exception{
		sslcertkey unsetresource = new sslcertkey();
		unsetresource.certkey = resource.certkey;
		unsetresource.expirymonitor = resource.expirymonitor;
		unsetresource.notificationperiod = resource.notificationperiod;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of sslcertkey resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String certkey[], String args[]) throws Exception {
		base_responses result = null;
		if (certkey != null && certkey.length > 0) {
			sslcertkey unsetresources[] = new sslcertkey[certkey.length];
			for (int i=0;i<certkey.length;i++){
				unsetresources[i] = new sslcertkey();
				unsetresources[i].certkey = certkey[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslcertkey resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, sslcertkey resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcertkey unsetresources[] = new sslcertkey[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new sslcertkey();
				unsetresources[i].certkey = resources[i].certkey;
				unsetresources[i].expirymonitor = resources[i].expirymonitor;
				unsetresources[i].notificationperiod = resources[i].notificationperiod;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to link sslcertkey.
	*/
	public static base_response link(nitro_service client, sslcertkey resource) throws Exception {
		sslcertkey linkresource = new sslcertkey();
		linkresource.certkey = resource.certkey;
		linkresource.linkcertkeyname = resource.linkcertkeyname;
		return linkresource.perform_operation(client,"link");
	}

	/**
	* Use this API to link sslcertkey resources.
	*/
	public static base_responses link(nitro_service client, sslcertkey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcertkey linkresources[] = new sslcertkey[resources.length];
			for (int i=0;i<resources.length;i++){
				linkresources[i] = new sslcertkey();
				linkresources[i].certkey = resources[i].certkey;
				linkresources[i].linkcertkeyname = resources[i].linkcertkeyname;
			}
			result = perform_operation_bulk_request(client, linkresources,"link");
		}
		return result;
	}

	/**
	* Use this API to unlink sslcertkey.
	*/
	public static base_response unlink(nitro_service client, sslcertkey resource) throws Exception {
		sslcertkey unlinkresource = new sslcertkey();
		unlinkresource.certkey = resource.certkey;
		return unlinkresource.perform_operation(client,"unlink");
	}

	/**
	* Use this API to unlink sslcertkey resources.
	*/
	public static base_responses unlink(nitro_service client, sslcertkey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcertkey unlinkresources[] = new sslcertkey[resources.length];
			for (int i=0;i<resources.length;i++){
				unlinkresources[i] = new sslcertkey();
				unlinkresources[i].certkey = resources[i].certkey;
			}
			result = perform_operation_bulk_request(client, unlinkresources,"unlink");
		}
		return result;
	}

	/**
	* Use this API to change sslcertkey.
	*/
	public static base_response change(nitro_service client, sslcertkey resource) throws Exception {
		sslcertkey updateresource = new sslcertkey();
		updateresource.certkey = resource.certkey;
		updateresource.cert = resource.cert;
		updateresource.key = resource.key;
		updateresource.password = resource.password;
		updateresource.fipskey = resource.fipskey;
		updateresource.inform = resource.inform;
		updateresource.passplain = resource.passplain;
		updateresource.nodomaincheck = resource.nodomaincheck;
		return updateresource.perform_operation(client,"update");
	}

	/**
	* Use this API to change sslcertkey resources.
	*/
	public static base_responses change(nitro_service client, sslcertkey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcertkey updateresources[] = new sslcertkey[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslcertkey();
				updateresources[i].certkey = resources[i].certkey;
				updateresources[i].cert = resources[i].cert;
				updateresources[i].key = resources[i].key;
				updateresources[i].password = resources[i].password;
				updateresources[i].fipskey = resources[i].fipskey;
				updateresources[i].inform = resources[i].inform;
				updateresources[i].passplain = resources[i].passplain;
				updateresources[i].nodomaincheck = resources[i].nodomaincheck;
			}
			result = perform_operation_bulk_request(client, updateresources,"update");
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslcertkey resources that are configured on netscaler.
	*/
	public static sslcertkey[] get(nitro_service service) throws Exception{
		sslcertkey obj = new sslcertkey();
		sslcertkey[] response = (sslcertkey[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslcertkey resources that are configured on netscaler.
	*/
	public static sslcertkey[] get(nitro_service service, options option) throws Exception{
		sslcertkey obj = new sslcertkey();
		sslcertkey[] response = (sslcertkey[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslcertkey resource of given name .
	*/
	public static sslcertkey get(nitro_service service, String certkey) throws Exception{
		sslcertkey obj = new sslcertkey();
		obj.set_certkey(certkey);
		sslcertkey response = (sslcertkey) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslcertkey resources of given names .
	*/
	public static sslcertkey[] get(nitro_service service, String certkey[]) throws Exception{
		if (certkey !=null && certkey.length>0) {
			sslcertkey response[] = new sslcertkey[certkey.length];
			sslcertkey obj[] = new sslcertkey[certkey.length];
			for (int i=0;i<certkey.length;i++) {
				obj[i] = new sslcertkey();
				obj[i].set_certkey(certkey[i]);
				response[i] = (sslcertkey) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslcertkey resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslcertkey[] get_filtered(nitro_service service, String filter) throws Exception{
		sslcertkey obj = new sslcertkey();
		options option = new options();
		option.set_filter(filter);
		sslcertkey[] response = (sslcertkey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcertkey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslcertkey[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslcertkey obj = new sslcertkey();
		options option = new options();
		option.set_filter(filter);
		sslcertkey[] response = (sslcertkey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslcertkey resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslcertkey obj = new sslcertkey();
		options option = new options();
		option.set_count(true);
		sslcertkey[] response = (sslcertkey[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslcertkey resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslcertkey obj = new sslcertkey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcertkey[] response = (sslcertkey[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcertkey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslcertkey obj = new sslcertkey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcertkey[] response = (sslcertkey[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class statusEnum {
		public static final String Valid = "Valid";
		public static final String Not_yet_valid = "Not yet valid";
		public static final String Expired = "Expired";
	}
	public static class informEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
	public static class expirymonitorEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
