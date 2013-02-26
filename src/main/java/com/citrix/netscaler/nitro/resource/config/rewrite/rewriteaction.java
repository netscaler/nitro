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
	* Name of the rewrite action to be added.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the rewrite action to be added.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Type of rewrite action. It can be: (replace|insert_http_header|delete_http_header|corrupt_http_header|insert_before|insert_after|delete|replace_http_res).
	For each action type the <target> and <string builder expr> are defined below.

		o	INSERT_HTTP_HEADER: Will insert a HTTP header.
			<target> = header name.
			<string builder expr> = header value specified as a compound text expression.

		o	INSERT_SIP_HEADER: Will insert a SIP header.
			<target> = header name.
			<string builder expr> = header value specified as a compound text expression.

		o	DELETE_HTTP_HEADER: Will delete all occurrence of HTTP header.
			<target> = header name.

		o	DELETE_SIP_HEADER: Will delete all occurrence of SIP header.
			<target> = header name.

		o	CORRUPT_HTTP_HEADER: Will corrupt all occurrence of HTTP header.
			<target> = header name.

		o	CORRUPT_SIP_HEADER: Will corrupt all occurrence of SIP header.
			<target> = header name.

		o	REPLACE: Will replace the target text reference with the value specified in attr.
			<target> = Advanced text expression
			<string builder expr> = Compound text expression

		o	INSERT_BEFORE: Will insert the value specified by attr before the target text reference.
			<target> = Advanced text expression
			<string builder expr> = Compound text expression

		o	INSERT_AFTER: Will insert the value specified by attr after the target text reference.
			<target> = Advanced text expression
			<string builder expr> = Compound text expression

		o	DELETE: Delete the target text reference.
			<target> = Advanced text expression

		o	REPLACE_HTTP_RES: Replace the http response with value specified in target.
			<target> = Compound text expression

		o	REPLACE_SIP_RES: Replace the SIP response with value specified in target.
			<target> = Compound text expression

		o	REPLACE_ALL: Replaces all occurrence of the pattern in the text provided in the target with the text provided in the stringBuilderExpr, with a string defined in the -pattern argument or -search argument.
      For example, you can replace all occurences of abcd with -pattern efgh.
			<target> = text in a request or a response, for example http.req.body(1000)
			<stringBuilderExpr> = Compound text expression
			-pattern <expression> = string constant, for example -pattern efgh or -search text("efgh")

		o	INSERT_BEFORE_ALL: Will insert the value specified by stringBuilderExpr before all the occurrence of pattern in the target text reference.
			<target> = Advanced text expression
			<stringBuilderExpr> = Compound text expression
			-pattern <expression> = string constant or advanced regular expression or
			-search regex(<regular expression>) or -search text(string constant)

		o	INSERT_AFTER_ALL: Will insert the value specified by stringBuilderExpr after all the occurrence of pattern in the target text reference.
			<target> = Advanced text expression
			<stringBuilderExpr> = Compound text expression
			-pattern <expression> = string constant or advanced regular expression or
			-search regex(<regular expression>) or -search text(string constant)

		o	DELETE_ALL: Delete all the occurrence of pattern in the target text reference.
			<target> = Advanced text expression
			-pattern <expression> = string constant or advanced regular expression or
			-search regex(<regular expression>) or -search text(string constant)
		.<br> Possible values = noop, delete, insert_http_header, delete_http_header, corrupt_http_header, insert_before, insert_after, replace, replace_http_res, delete_all, replace_all, insert_before_all, insert_after_all, clientless_vpn_encode, clientless_vpn_encode_all, clientless_vpn_decode, clientless_vpn_decode_all, insert_sip_header, delete_sip_header, corrupt_sip_header, replace_sip_res
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of rewrite action. It can be: (replace|insert_http_header|delete_http_header|corrupt_http_header|insert_before|insert_after|delete|replace_http_res).
	For each action type the <target> and <string builder expr> are defined below.

		o	INSERT_HTTP_HEADER: Will insert a HTTP header.
			<target> = header name.
			<string builder expr> = header value specified as a compound text expression.

		o	INSERT_SIP_HEADER: Will insert a SIP header.
			<target> = header name.
			<string builder expr> = header value specified as a compound text expression.

		o	DELETE_HTTP_HEADER: Will delete all occurrence of HTTP header.
			<target> = header name.

		o	DELETE_SIP_HEADER: Will delete all occurrence of SIP header.
			<target> = header name.

		o	CORRUPT_HTTP_HEADER: Will corrupt all occurrence of HTTP header.
			<target> = header name.

		o	CORRUPT_SIP_HEADER: Will corrupt all occurrence of SIP header.
			<target> = header name.

		o	REPLACE: Will replace the target text reference with the value specified in attr.
			<target> = Advanced text expression
			<string builder expr> = Compound text expression

		o	INSERT_BEFORE: Will insert the value specified by attr before the target text reference.
			<target> = Advanced text expression
			<string builder expr> = Compound text expression

		o	INSERT_AFTER: Will insert the value specified by attr after the target text reference.
			<target> = Advanced text expression
			<string builder expr> = Compound text expression

		o	DELETE: Delete the target text reference.
			<target> = Advanced text expression

		o	REPLACE_HTTP_RES: Replace the http response with value specified in target.
			<target> = Compound text expression

		o	REPLACE_SIP_RES: Replace the SIP response with value specified in target.
			<target> = Compound text expression

		o	REPLACE_ALL: Replaces all occurrence of the pattern in the text provided in the target with the text provided in the stringBuilderExpr, with a string defined in the -pattern argument or -search argument.
      For example, you can replace all occurences of abcd with -pattern efgh.
			<target> = text in a request or a response, for example http.req.body(1000)
			<stringBuilderExpr> = Compound text expression
			-pattern <expression> = string constant, for example -pattern efgh or -search text("efgh")

		o	INSERT_BEFORE_ALL: Will insert the value specified by stringBuilderExpr before all the occurrence of pattern in the target text reference.
			<target> = Advanced text expression
			<stringBuilderExpr> = Compound text expression
			-pattern <expression> = string constant or advanced regular expression or
			-search regex(<regular expression>) or -search text(string constant)

		o	INSERT_AFTER_ALL: Will insert the value specified by stringBuilderExpr after all the occurrence of pattern in the target text reference.
			<target> = Advanced text expression
			<stringBuilderExpr> = Compound text expression
			-pattern <expression> = string constant or advanced regular expression or
			-search regex(<regular expression>) or -search text(string constant)

		o	DELETE_ALL: Delete all the occurrence of pattern in the target text reference.
			<target> = Advanced text expression
			-pattern <expression> = string constant or advanced regular expression or
			-search regex(<regular expression>) or -search text(string constant)
		.<br> Possible values = noop, delete, insert_http_header, delete_http_header, corrupt_http_header, insert_before, insert_after, replace, replace_http_res, delete_all, replace_all, insert_before_all, insert_after_all, clientless_vpn_encode, clientless_vpn_encode_all, clientless_vpn_decode, clientless_vpn_decode_all, insert_sip_header, delete_sip_header, corrupt_sip_header, replace_sip_res
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Expression specifying which part of HTTP packet needs to be rewritten.<br> Minimum length =  1
	* </pre>
	*/
	public void set_target(String target) throws Exception{
		this.target = target;
	}

	/**
	* <pre>
	* Expression specifying which part of HTTP packet needs to be rewritten.<br> Minimum length =  1
	* </pre>
	*/
	public String get_target() throws Exception {
		return this.target;
	}

	/**
	* <pre>
	* Expression specifying new value of the rewritten HTTP packet. Maximum length of the input expression is 8191. Maximum size of string that can be used inside the expression is 1499.
	* </pre>
	*/
	public void set_stringbuilderexpr(String stringbuilderexpr) throws Exception{
		this.stringbuilderexpr = stringbuilderexpr;
	}

	/**
	* <pre>
	* Expression specifying new value of the rewritten HTTP packet. Maximum length of the input expression is 8191. Maximum size of string that can be used inside the expression is 1499.
	* </pre>
	*/
	public String get_stringbuilderexpr() throws Exception {
		return this.stringbuilderexpr;
	}

	/**
	* <pre>
	* Pattern to be used for insert_before_all, insert_after_all, replace_all, delete_all action types.
	* </pre>
	*/
	public void set_pattern(String pattern) throws Exception{
		this.pattern = pattern;
	}

	/**
	* <pre>
	* Pattern to be used for insert_before_all, insert_after_all, replace_all, delete_all action types.
	* </pre>
	*/
	public String get_pattern() throws Exception {
		return this.pattern;
	}

	/**
	* <pre>
	* search expression takes the followin 5 argumens to use the appropriate methods to search in the specified body or header:
1. text(string) - example: -search text("hello")
2. regex(re<delimiter>regular exp<delimiter>) - example: -search regex(re/^hello/)
3. xpath(xp<delimiter>xpath expression<delimiter>) - example: -search xpath(xp%/a/b%)
4. xpath_json(xp<delimiter>xpath expression<delimiter>) - example: -search xpath_json(xp%/a/b%)
	xpath_json_search takes xpath expression as argument but operates on json file instead of xml file.
5. patset(patset) - example: -search patset("patset1")

search expression are allowed on actions of type
1) replace_all
2) insert_after_all
3) delete_all
4) insert_before_all.
search is a super set of pattern. It is advised to use search over pattern.
	* </pre>
	*/
	public void set_search(String search) throws Exception{
		this.search = search;
	}

	/**
	* <pre>
	* search expression takes the followin 5 argumens to use the appropriate methods to search in the specified body or header:
1. text(string) - example: -search text("hello")
2. regex(re<delimiter>regular exp<delimiter>) - example: -search regex(re/^hello/)
3. xpath(xp<delimiter>xpath expression<delimiter>) - example: -search xpath(xp%/a/b%)
4. xpath_json(xp<delimiter>xpath expression<delimiter>) - example: -search xpath_json(xp%/a/b%)
	xpath_json_search takes xpath expression as argument but operates on json file instead of xml file.
5. patset(patset) - example: -search patset("patset1")

search expression are allowed on actions of type
1) replace_all
2) insert_after_all
3) delete_all
4) insert_before_all.
search is a super set of pattern. It is advised to use search over pattern.
	* </pre>
	*/
	public String get_search() throws Exception {
		return this.search;
	}

	/**
	* <pre>
	* Bypass the safety check and allow unsafe expressions.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_bypasssafetycheck(String bypasssafetycheck) throws Exception{
		this.bypasssafetycheck = bypasssafetycheck;
	}

	/**
	* <pre>
	* Bypass the safety check and allow unsafe expressions.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_bypasssafetycheck() throws Exception {
		return this.bypasssafetycheck;
	}

	/**
	* <pre>
	* refineSearch expressions specifies how the selected HTTP data can further be refined. These expression always starts with the 'Extend(m,n)' operation. Where 'm' specifies number of bytes to the left of selected data and 'n' specifies number of bytes to the right of selected data.
refineSearch expression are only allowed on body based expression and for actions of type
1) replace_all
2) insert_after_all
3) delete_all
4) insert_before_all.
This can accelerate search using regular expression. For example if we need to find all the urls from www.zippo.com in a response body. Rather than writing a regular expression to search this url pattern we can search for 'zippo' pattern first and then extend the search space by some bytes and finally check for prefix 'www.zippo.com'. The rewrite command might look like:
     	add rewrite action act1 delete_all 'http.res.body(10000)' -pattern "zippo" -refineSearch "extend(10,10).regex_select(re%<www.zippo.com[^>].*>%)"
Maximum length of the input expression is 8191. Maximum size of string that can be used inside the expression is 1499.
	* </pre>
	*/
	public void set_refinesearch(String refinesearch) throws Exception{
		this.refinesearch = refinesearch;
	}

	/**
	* <pre>
	* refineSearch expressions specifies how the selected HTTP data can further be refined. These expression always starts with the 'Extend(m,n)' operation. Where 'm' specifies number of bytes to the left of selected data and 'n' specifies number of bytes to the right of selected data.
refineSearch expression are only allowed on body based expression and for actions of type
1) replace_all
2) insert_after_all
3) delete_all
4) insert_before_all.
This can accelerate search using regular expression. For example if we need to find all the urls from www.zippo.com in a response body. Rather than writing a regular expression to search this url pattern we can search for 'zippo' pattern first and then extend the search space by some bytes and finally check for prefix 'www.zippo.com'. The rewrite command might look like:
     	add rewrite action act1 delete_all 'http.res.body(10000)' -pattern "zippo" -refineSearch "extend(10,10).regex_select(re%<www.zippo.com[^>].*>%)"
Maximum length of the input expression is 8191. Maximum size of string that can be used inside the expression is 1499.
	* </pre>
	*/
	public String get_refinesearch() throws Exception {
		return this.refinesearch;
	}

	/**
	* <pre>
	* Comments associated with this rewrite action.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this rewrite action.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The new name of the rewrite action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the rewrite action.<br> Minimum length =  1
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
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		rewriteaction unsetresource = new rewriteaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of rewriteaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, rewriteaction resource, String[] args) throws Exception{
		rewriteaction unsetresource = new rewriteaction();
		unsetresource.name = resource.name;
		unsetresource.stringbuilderexpr = resource.stringbuilderexpr;
		unsetresource.refinesearch = resource.refinesearch;
		unsetresource.comment = resource.comment;
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
				unsetresources[i].stringbuilderexpr = resources[i].stringbuilderexpr;
				unsetresources[i].refinesearch = resources[i].refinesearch;
				unsetresources[i].comment = resources[i].comment;
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
