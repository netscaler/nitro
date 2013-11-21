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

package com.citrix.netscaler.nitro.resource.config.rewrite;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rewriteaction_response extends base_response
{
	public rewriteaction[] rewriteaction;
}
/**
* Configuration for rewrite action resource.
*/

public class rewriteaction extends base_resource
{
	private String name;
	private String type;
	private String target;
	private String stringbuilderexpr;
	private String pattern;
	private String search;
	private String bypasssafetycheck;
	private String refinesearch;
	private String comment;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private Long referencecount;
	private String description;
	private Boolean isdefault;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the user-defined rewrite action. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the rewrite policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my rewrite action" or ‘my rewrite action’).
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the user-defined rewrite action. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the rewrite policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my rewrite action" or ‘my rewrite action’).
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Type of user-defined rewrite action. The information that you provide for, and the effect of, each type are as follows:: 
* REPLACE <target> <string_builder_expr>. Replaces the string with the string-builder expression.
* REPLACE_ALL <target> <string_builder_expr1> -(pattern|search) <string_builder_expr2>. In the request or response specified by <target>, replaces all occurrences of the string defined by <string_builder_expr1> with the string defined by <string_builder_expr2>. You can use a PCRE-format pattern or the search facility to find the strings to be replaced.
* REPLACE_HTTP_RES <string_builder_expr>. Replaces the complete HTTP response with the string defined by the string-builder expression.
* REPLACE_SIP_RES <target> - Replaces the complete SIP response with the string specified by <target>.
* INSERT_HTTP_HEADER <header_string_builder_expr> <contents_string_builder_expr>. Inserts the HTTP header specified by <header_string_builder_expr> and header contents specified by <contents_string_builder_expr>.
* DELETE_HTTP_HEADER <target>. Deletes the HTTP header specified by <target>.
* CORRUPT_HTTP_HEADER <target>. Replaces the header name of all occurrences of the HTTP header specified by <target> with a corrupted name, so that it will not be recognized by the receiver  Example: MY_HEADER is changed to MHEY_ADER.
* INSERT_BEFORE <string_builder_expr1> <string_builder_expr1>. Finds the string specified in <string_builder_expr1> and inserts the string in <string_builder_expr2> before it.
* INSERT_BEFORE_ALL <target> <string_builder_expr1> -(pattern|search) <string_builder_expr2>. In the request or response specified by <target>, locates all occurrences of the string specified in <string_builder_expr1> and inserts the string specified in <string_builder_expr2> before each. You can use a PCRE-format pattern or the search facility to find the strings.
* INSERT_AFTER <string_builder_expr1> <string_builder_expr2>. Finds the string specified in <string_builder_expr1>, and inserts the string specified in <string_builder_expr2> after it.
* INSERT_AFTER_ALL <target> <string_builder_expr1> -(pattern|search) <string_builder_expr>. In the request or response specified by <target>, locates all occurrences of the string specified by <string_builder_expr1> and inserts the string specified by <string_builder_expr2> after each. You can use a PCRE-format pattern or the search facility to find the strings.
* DELETE <target>. Finds and deletes the specified target.
* DELETE_ALL <target> -(pattern|search) <string_builder_expr>. In the request or response specified by <target>, locates and deletes all occurrences of the string specified by <string_builder_expr>. You can use a PCRE-format pattern or the search facility to find the strings.<br> Possible values = noop, delete, insert_http_header, delete_http_header, corrupt_http_header, insert_before, insert_after, replace, replace_http_res, delete_all, replace_all, insert_before_all, insert_after_all, clientless_vpn_encode, clientless_vpn_encode_all, clientless_vpn_decode, clientless_vpn_decode_all, insert_sip_header, delete_sip_header, corrupt_sip_header, replace_sip_res
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of user-defined rewrite action. The information that you provide for, and the effect of, each type are as follows:: 
* REPLACE <target> <string_builder_expr>. Replaces the string with the string-builder expression.
* REPLACE_ALL <target> <string_builder_expr1> -(pattern|search) <string_builder_expr2>. In the request or response specified by <target>, replaces all occurrences of the string defined by <string_builder_expr1> with the string defined by <string_builder_expr2>. You can use a PCRE-format pattern or the search facility to find the strings to be replaced.
* REPLACE_HTTP_RES <string_builder_expr>. Replaces the complete HTTP response with the string defined by the string-builder expression.
* REPLACE_SIP_RES <target> - Replaces the complete SIP response with the string specified by <target>.
* INSERT_HTTP_HEADER <header_string_builder_expr> <contents_string_builder_expr>. Inserts the HTTP header specified by <header_string_builder_expr> and header contents specified by <contents_string_builder_expr>.
* DELETE_HTTP_HEADER <target>. Deletes the HTTP header specified by <target>.
* CORRUPT_HTTP_HEADER <target>. Replaces the header name of all occurrences of the HTTP header specified by <target> with a corrupted name, so that it will not be recognized by the receiver  Example: MY_HEADER is changed to MHEY_ADER.
* INSERT_BEFORE <string_builder_expr1> <string_builder_expr1>. Finds the string specified in <string_builder_expr1> and inserts the string in <string_builder_expr2> before it.
* INSERT_BEFORE_ALL <target> <string_builder_expr1> -(pattern|search) <string_builder_expr2>. In the request or response specified by <target>, locates all occurrences of the string specified in <string_builder_expr1> and inserts the string specified in <string_builder_expr2> before each. You can use a PCRE-format pattern or the search facility to find the strings.
* INSERT_AFTER <string_builder_expr1> <string_builder_expr2>. Finds the string specified in <string_builder_expr1>, and inserts the string specified in <string_builder_expr2> after it.
* INSERT_AFTER_ALL <target> <string_builder_expr1> -(pattern|search) <string_builder_expr>. In the request or response specified by <target>, locates all occurrences of the string specified by <string_builder_expr1> and inserts the string specified by <string_builder_expr2> after each. You can use a PCRE-format pattern or the search facility to find the strings.
* DELETE <target>. Finds and deletes the specified target.
* DELETE_ALL <target> -(pattern|search) <string_builder_expr>. In the request or response specified by <target>, locates and deletes all occurrences of the string specified by <string_builder_expr>. You can use a PCRE-format pattern or the search facility to find the strings.<br> Possible values = noop, delete, insert_http_header, delete_http_header, corrupt_http_header, insert_before, insert_after, replace, replace_http_res, delete_all, replace_all, insert_before_all, insert_after_all, clientless_vpn_encode, clientless_vpn_encode_all, clientless_vpn_decode, clientless_vpn_decode_all, insert_sip_header, delete_sip_header, corrupt_sip_header, replace_sip_res
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Default syntax expression that specifies which part of the request or response to rewrite.<br> Minimum length =  1
	* </pre>
	*/
	public void set_target(String target) throws Exception{
		this.target = target;
	}

	/**
	* <pre>
	* Default syntax expression that specifies which part of the request or response to rewrite.<br> Minimum length =  1
	* </pre>
	*/
	public String get_target() throws Exception {
		return this.target;
	}

	/**
	* <pre>
	* Default syntax expression that specifies the content to insert into the request or response at the specified location, or that replaces the specified string.
	* </pre>
	*/
	public void set_stringbuilderexpr(String stringbuilderexpr) throws Exception{
		this.stringbuilderexpr = stringbuilderexpr;
	}

	/**
	* <pre>
	* Default syntax expression that specifies the content to insert into the request or response at the specified location, or that replaces the specified string.
	* </pre>
	*/
	public String get_stringbuilderexpr() throws Exception {
		return this.stringbuilderexpr;
	}

	/**
	* <pre>
	* Pattern that is used to match multiple strings in the request or response. The pattern may be a string literal (without quotes) or a PCRE-format regular expression with a delimiter that consists of any printable ASCII non-alphanumeric character except for the underscore (_) and space ( ) that is not otherwise used in the expression. Example: re~https?://|HTTPS?://~ The preceding regular expression can use the tilde (~) as the delimiter because that character does not appear in the regular expression itself. Used in the INSERT_BEFORE_ALL, INSERT_AFTER_ALL, REPLACE_ALL, and DELETE_ALL action types.
	* </pre>
	*/
	public void set_pattern(String pattern) throws Exception{
		this.pattern = pattern;
	}

	/**
	* <pre>
	* Pattern that is used to match multiple strings in the request or response. The pattern may be a string literal (without quotes) or a PCRE-format regular expression with a delimiter that consists of any printable ASCII non-alphanumeric character except for the underscore (_) and space ( ) that is not otherwise used in the expression. Example: re~https?://|HTTPS?://~ The preceding regular expression can use the tilde (~) as the delimiter because that character does not appear in the regular expression itself. Used in the INSERT_BEFORE_ALL, INSERT_AFTER_ALL, REPLACE_ALL, and DELETE_ALL action types.
	* </pre>
	*/
	public String get_pattern() throws Exception {
		return this.pattern;
	}

	/**
	* <pre>
	* Search facility that is used to match multiple strings in the request or response. Used in the INSERT_BEFORE_ALL, INSERT_AFTER_ALL, REPLACE_ALL, and DELETE_ALL action types. The following search types are supported:
* Text ("text(string)") - A literal string. Example: -search text("hello")
* Regular expression (“regex(re<delimiter>regular exp<delimiter>)”) - Pattern that is used to match multiple strings in the request or response. The pattern may be a string literal (without quotes) or a PCRE-format regular expression with a delimiter that consists of any printable ASCII non-alphanumeric character except for the underscore (_) and space ( ) that is not otherwise used in the expression. Example: -search regex(re~^hello~) The preceding regular expression can use the tilde (~) as the delimiter because that character does not appear in the regular expression itself.
* XPath ("xpath(xp<delimiter>xpath expression<delimiter>)") - An XPath expression. Example: -search xpath(xp%/a/b%)
* JSON ("xpath_json(xp<delimiter>xpath expression<delimiter>)") - An XPath JSON expression. Example: -search xpath_json(xp%/a/b%)
NOTE: JSON searches use the same syntax as XPath searches, but operate on JSON files instead of standard XML files.
* Patset ("patset(patset)") - A predefined pattern set. Example: -search patset("patset1").
	* </pre>
	*/
	public void set_search(String search) throws Exception{
		this.search = search;
	}

	/**
	* <pre>
	* Search facility that is used to match multiple strings in the request or response. Used in the INSERT_BEFORE_ALL, INSERT_AFTER_ALL, REPLACE_ALL, and DELETE_ALL action types. The following search types are supported:
* Text ("text(string)") - A literal string. Example: -search text("hello")
* Regular expression (“regex(re<delimiter>regular exp<delimiter>)”) - Pattern that is used to match multiple strings in the request or response. The pattern may be a string literal (without quotes) or a PCRE-format regular expression with a delimiter that consists of any printable ASCII non-alphanumeric character except for the underscore (_) and space ( ) that is not otherwise used in the expression. Example: -search regex(re~^hello~) The preceding regular expression can use the tilde (~) as the delimiter because that character does not appear in the regular expression itself.
* XPath ("xpath(xp<delimiter>xpath expression<delimiter>)") - An XPath expression. Example: -search xpath(xp%/a/b%)
* JSON ("xpath_json(xp<delimiter>xpath expression<delimiter>)") - An XPath JSON expression. Example: -search xpath_json(xp%/a/b%)
NOTE: JSON searches use the same syntax as XPath searches, but operate on JSON files instead of standard XML files.
* Patset ("patset(patset)") - A predefined pattern set. Example: -search patset("patset1").
	* </pre>
	*/
	public String get_search() throws Exception {
		return this.search;
	}

	/**
	* <pre>
	* Bypass the safety check and allow unsafe expressions. An unsafe expression is one that contains references to message elements that might not be present in all messages. If an expression refers to a missing request element, an empty string is used instead.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_bypasssafetycheck(String bypasssafetycheck) throws Exception{
		this.bypasssafetycheck = bypasssafetycheck;
	}

	/**
	* <pre>
	* Bypass the safety check and allow unsafe expressions. An unsafe expression is one that contains references to message elements that might not be present in all messages. If an expression refers to a missing request element, an empty string is used instead.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_bypasssafetycheck() throws Exception {
		return this.bypasssafetycheck;
	}

	/**
	* <pre>
	* Specify additional criteria to refine the results of the search. 
Always starts with the "extend(m,n)" operation, where 'm' specifies number of bytes to the left of selected data and 'n' specifies number of bytes to the right of selected data.
You can use refineSearch only on body expressions, and for the INSERT_BEFORE_ALL, INSERT_AFTER_ALL, REPLACE_ALL, and DELETE_ALL action types.
	* </pre>
	*/
	public void set_refinesearch(String refinesearch) throws Exception{
		this.refinesearch = refinesearch;
	}

	/**
	* <pre>
	* Specify additional criteria to refine the results of the search. 
Always starts with the "extend(m,n)" operation, where 'm' specifies number of bytes to the left of selected data and 'n' specifies number of bytes to the right of selected data.
You can use refineSearch only on body expressions, and for the INSERT_BEFORE_ALL, INSERT_AFTER_ALL, REPLACE_ALL, and DELETE_ALL action types.
	* </pre>
	*/
	public String get_refinesearch() throws Exception {
		return this.refinesearch;
	}

	/**
	* <pre>
	* Comment. Can be used to preserve information about this rewrite action.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comment. Can be used to preserve information about this rewrite action.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* New name for the rewrite action. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the rewrite policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my rewrite action" or ‘my rewrite action’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the rewrite action. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the rewrite policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my rewrite action" or ‘my rewrite action’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The number of times the action has been taken.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of times the action resulted in UNDEF.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* The number of references to the action.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* Description of the action.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default rewriteaction.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
	}

	/**
	* <pre>
	* Flag to determine whether rewrite action is built-in or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rewriteaction_response result = (rewriteaction_response) service.get_payload_formatter().string_to_resource(rewriteaction_response.class, response);
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
		return result.rewriteaction;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add rewriteaction.
	*/
	public static base_response add(nitro_service client, rewriteaction resource) throws Exception {
		rewriteaction addresource = new rewriteaction();
		addresource.name = resource.name;
		addresource.type = resource.type;
		addresource.target = resource.target;
		addresource.stringbuilderexpr = resource.stringbuilderexpr;
		addresource.pattern = resource.pattern;
		addresource.search = resource.search;
		addresource.bypasssafetycheck = resource.bypasssafetycheck;
		addresource.refinesearch = resource.refinesearch;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add rewriteaction resources.
	*/
	public static base_responses add(nitro_service client, rewriteaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewriteaction addresources[] = new rewriteaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new rewriteaction();
				addresources[i].name = resources[i].name;
				addresources[i].type = resources[i].type;
				addresources[i].target = resources[i].target;
				addresources[i].stringbuilderexpr = resources[i].stringbuilderexpr;
				addresources[i].pattern = resources[i].pattern;
				addresources[i].search = resources[i].search;
				addresources[i].bypasssafetycheck = resources[i].bypasssafetycheck;
				addresources[i].refinesearch = resources[i].refinesearch;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete rewriteaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		rewriteaction deleteresource = new rewriteaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete rewriteaction.
	*/
	public static base_response delete(nitro_service client, rewriteaction resource) throws Exception {
		rewriteaction deleteresource = new rewriteaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete rewriteaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			rewriteaction deleteresources[] = new rewriteaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new rewriteaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete rewriteaction resources.
	*/
	public static base_responses delete(nitro_service client, rewriteaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewriteaction deleteresources[] = new rewriteaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new rewriteaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update rewriteaction.
	*/
	public static base_response update(nitro_service client, rewriteaction resource) throws Exception {
		rewriteaction updateresource = new rewriteaction();
		updateresource.name = resource.name;
		updateresource.target = resource.target;
		updateresource.stringbuilderexpr = resource.stringbuilderexpr;
		updateresource.bypasssafetycheck = resource.bypasssafetycheck;
		updateresource.pattern = resource.pattern;
		updateresource.search = resource.search;
		updateresource.bypasssafetycheck = resource.bypasssafetycheck;
		updateresource.refinesearch = resource.refinesearch;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update rewriteaction resources.
	*/
	public static base_responses update(nitro_service client, rewriteaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewriteaction updateresources[] = new rewriteaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new rewriteaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].target = resources[i].target;
				updateresources[i].stringbuilderexpr = resources[i].stringbuilderexpr;
				updateresources[i].bypasssafetycheck = resources[i].bypasssafetycheck;
				updateresources[i].pattern = resources[i].pattern;
				updateresources[i].search = resources[i].search;
				updateresources[i].bypasssafetycheck = resources[i].bypasssafetycheck;
				updateresources[i].refinesearch = resources[i].refinesearch;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of rewriteaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, rewriteaction resource, String[] args) throws Exception{
		rewriteaction unsetresource = new rewriteaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of rewriteaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			rewriteaction unsetresources[] = new rewriteaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new rewriteaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of rewriteaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, rewriteaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewriteaction unsetresources[] = new rewriteaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new rewriteaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a rewriteaction resource.
	*/
	public static base_response rename(nitro_service client, rewriteaction resource, String new_name) throws Exception {
		rewriteaction renameresource = new rewriteaction();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a rewriteaction resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		rewriteaction renameresource = new rewriteaction();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the rewriteaction resources that are configured on netscaler.
	*/
	public static rewriteaction[] get(nitro_service service) throws Exception{
		rewriteaction obj = new rewriteaction();
		rewriteaction[] response = (rewriteaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the rewriteaction resources that are configured on netscaler.
	*/
	public static rewriteaction[] get(nitro_service service, options option) throws Exception{
		rewriteaction obj = new rewriteaction();
		rewriteaction[] response = (rewriteaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch rewriteaction resource of given name .
	*/
	public static rewriteaction get(nitro_service service, String name) throws Exception{
		rewriteaction obj = new rewriteaction();
		obj.set_name(name);
		rewriteaction response = (rewriteaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch rewriteaction resources of given names .
	*/
	public static rewriteaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			rewriteaction response[] = new rewriteaction[name.length];
			rewriteaction obj[] = new rewriteaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new rewriteaction();
				obj[i].set_name(name[i]);
				response[i] = (rewriteaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of rewriteaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static rewriteaction[] get_filtered(nitro_service service, String filter) throws Exception{
		rewriteaction obj = new rewriteaction();
		options option = new options();
		option.set_filter(filter);
		rewriteaction[] response = (rewriteaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rewriteaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static rewriteaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rewriteaction obj = new rewriteaction();
		options option = new options();
		option.set_filter(filter);
		rewriteaction[] response = (rewriteaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the rewriteaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		rewriteaction obj = new rewriteaction();
		options option = new options();
		option.set_count(true);
		rewriteaction[] response = (rewriteaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of rewriteaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		rewriteaction obj = new rewriteaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rewriteaction[] response = (rewriteaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rewriteaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rewriteaction obj = new rewriteaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rewriteaction[] response = (rewriteaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bypasssafetycheckEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class typeEnum {
		public static final String noop = "noop";
		public static final String delete = "delete";
		public static final String insert_http_header = "insert_http_header";
		public static final String delete_http_header = "delete_http_header";
		public static final String corrupt_http_header = "corrupt_http_header";
		public static final String insert_before = "insert_before";
		public static final String insert_after = "insert_after";
		public static final String replace = "replace";
		public static final String replace_http_res = "replace_http_res";
		public static final String delete_all = "delete_all";
		public static final String replace_all = "replace_all";
		public static final String insert_before_all = "insert_before_all";
		public static final String insert_after_all = "insert_after_all";
		public static final String clientless_vpn_encode = "clientless_vpn_encode";
		public static final String clientless_vpn_encode_all = "clientless_vpn_encode_all";
		public static final String clientless_vpn_decode = "clientless_vpn_decode";
		public static final String clientless_vpn_decode_all = "clientless_vpn_decode_all";
		public static final String insert_sip_header = "insert_sip_header";
		public static final String delete_sip_header = "delete_sip_header";
		public static final String corrupt_sip_header = "corrupt_sip_header";
		public static final String replace_sip_res = "replace_sip_res";
	}
}
