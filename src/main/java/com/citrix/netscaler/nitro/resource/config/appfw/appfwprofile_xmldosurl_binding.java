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

class appfwprofile_xmldosurl_binding_response extends base_response
{
	public appfwprofile_xmldosurl_binding[] appfwprofile_xmldosurl_binding;
}
/**
	* Binding class showing the xmldosurl that can be bound to appfwprofile.
	*/

public class appfwprofile_xmldosurl_binding extends base_resource
{
	private String xmldosurl;
	private String xmlmaxelementdepthcheck;
	private Long xmlmaxelementdepth;
	private String xmlmaxelementnamelengthcheck;
	private Long xmlmaxelementnamelength;
	private String xmlmaxelementscheck;
	private Long xmlmaxelements;
	private String xmlmaxelementchildrencheck;
	private Long xmlmaxelementchildren;
	private String xmlmaxnodescheck;
	private Long xmlmaxnodes;
	private String xmlmaxentityexpansionscheck;
	private Long xmlmaxentityexpansions;
	private String xmlmaxentityexpansiondepthcheck;
	private Long xmlmaxentityexpansiondepth;
	private String xmlmaxattributescheck;
	private Long xmlmaxattributes;
	private String xmlmaxattributenamelengthcheck;
	private Long xmlmaxattributenamelength;
	private String xmlmaxattributevaluelengthcheck;
	private Long xmlmaxattributevaluelength;
	private String xmlmaxnamespacescheck;
	private Long xmlmaxnamespaces;
	private String xmlmaxnamespaceurilengthcheck;
	private Long xmlmaxnamespaceurilength;
	private String xmlmaxchardatalengthcheck;
	private Long xmlmaxchardatalength;
	private String xmlmaxfilesizecheck;
	private Long xmlmaxfilesize;
	private String xmlminfilesizecheck;
	private Long xmlminfilesize;
	private String xmlblockpi;
	private String xmlblockdtd;
	private String xmlblockexternalentities;
	private String xmlsoaparraycheck;
	private Long xmlmaxsoaparraysize;
	private Long xmlmaxsoaparrayrank;
	private String state;
	private String comment;
	private String name;
	private Long __count;

	/**
	* <pre>
	* State if XML Max element depth check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxelementdepthcheck(String xmlmaxelementdepthcheck) throws Exception{
		this.xmlmaxelementdepthcheck = xmlmaxelementdepthcheck;
	}

	/**
	* <pre>
	* State if XML Max element depth check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxelementdepthcheck() throws Exception {
		return this.xmlmaxelementdepthcheck;
	}

	/**
	* <pre>
	* Specify the maximum size of XML messages. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxfilesize(long xmlmaxfilesize) throws Exception {
		this.xmlmaxfilesize = new Long(xmlmaxfilesize);
	}

	/**
	* <pre>
	* Specify the maximum size of XML messages. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxfilesize(Long xmlmaxfilesize) throws Exception{
		this.xmlmaxfilesize = xmlmaxfilesize;
	}

	/**
	* <pre>
	* Specify the maximum size of XML messages. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxfilesize() throws Exception {
		return this.xmlmaxfilesize;
	}

	/**
	* <pre>
	* Specify the longest URI of any XML namespace. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxnamespaceurilength(long xmlmaxnamespaceurilength) throws Exception {
		this.xmlmaxnamespaceurilength = new Long(xmlmaxnamespaceurilength);
	}

	/**
	* <pre>
	* Specify the longest URI of any XML namespace. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxnamespaceurilength(Long xmlmaxnamespaceurilength) throws Exception{
		this.xmlmaxnamespaceurilength = xmlmaxnamespaceurilength;
	}

	/**
	* <pre>
	* Specify the longest URI of any XML namespace. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxnamespaceurilength() throws Exception {
		return this.xmlmaxnamespaceurilength;
	}

	/**
	* <pre>
	* XML DoS URL regular expression length.
	* </pre>
	*/
	public void set_xmldosurl(String xmldosurl) throws Exception{
		this.xmldosurl = xmldosurl;
	}

	/**
	* <pre>
	* XML DoS URL regular expression length.
	* </pre>
	*/
	public String get_xmldosurl() throws Exception {
		return this.xmldosurl;
	}

	/**
	* <pre>
	* Enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* State if XML SOAP Array check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlsoaparraycheck(String xmlsoaparraycheck) throws Exception{
		this.xmlsoaparraycheck = xmlsoaparraycheck;
	}

	/**
	* <pre>
	* State if XML SOAP Array check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlsoaparraycheck() throws Exception {
		return this.xmlsoaparraycheck;
	}

	/**
	* <pre>
	* State if XML Max element name length check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxelementnamelengthcheck(String xmlmaxelementnamelengthcheck) throws Exception{
		this.xmlmaxelementnamelengthcheck = xmlmaxelementnamelengthcheck;
	}

	/**
	* <pre>
	* State if XML Max element name length check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxelementnamelengthcheck() throws Exception {
		return this.xmlmaxelementnamelengthcheck;
	}

	/**
	* <pre>
	* State if XML Max elements check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxelementscheck(String xmlmaxelementscheck) throws Exception{
		this.xmlmaxelementscheck = xmlmaxelementscheck;
	}

	/**
	* <pre>
	* State if XML Max elements check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxelementscheck() throws Exception {
		return this.xmlmaxelementscheck;
	}

	/**
	* <pre>
	* Specify maximum allowed number of entity expansions. Protects aganist Entity Expansion Attack.
	* </pre>
	*/
	public void set_xmlmaxentityexpansions(long xmlmaxentityexpansions) throws Exception {
		this.xmlmaxentityexpansions = new Long(xmlmaxentityexpansions);
	}

	/**
	* <pre>
	* Specify maximum allowed number of entity expansions. Protects aganist Entity Expansion Attack.
	* </pre>
	*/
	public void set_xmlmaxentityexpansions(Long xmlmaxentityexpansions) throws Exception{
		this.xmlmaxentityexpansions = xmlmaxentityexpansions;
	}

	/**
	* <pre>
	* Specify maximum allowed number of entity expansions. Protects aganist Entity Expansion Attack.
	* </pre>
	*/
	public Long get_xmlmaxentityexpansions() throws Exception {
		return this.xmlmaxentityexpansions;
	}

	/**
	* <pre>
	* Specify maximum number of attributes per XML element. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxattributes(long xmlmaxattributes) throws Exception {
		this.xmlmaxattributes = new Long(xmlmaxattributes);
	}

	/**
	* <pre>
	* Specify maximum number of attributes per XML element. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxattributes(Long xmlmaxattributes) throws Exception{
		this.xmlmaxattributes = xmlmaxattributes;
	}

	/**
	* <pre>
	* Specify maximum number of attributes per XML element. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxattributes() throws Exception {
		return this.xmlmaxattributes;
	}

	/**
	* <pre>
	* State if XML Max file size check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxfilesizecheck(String xmlmaxfilesizecheck) throws Exception{
		this.xmlmaxfilesizecheck = xmlmaxfilesizecheck;
	}

	/**
	* <pre>
	* State if XML Max file size check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxfilesizecheck() throws Exception {
		return this.xmlmaxfilesizecheck;
	}

	/**
	* <pre>
	* Specify the maximum size of CDATA. Protects against overflow attacks and large quantities of unparsed data within XML messages.
	* </pre>
	*/
	public void set_xmlmaxchardatalength(long xmlmaxchardatalength) throws Exception {
		this.xmlmaxchardatalength = new Long(xmlmaxchardatalength);
	}

	/**
	* <pre>
	* Specify the maximum size of CDATA. Protects against overflow attacks and large quantities of unparsed data within XML messages.
	* </pre>
	*/
	public void set_xmlmaxchardatalength(Long xmlmaxchardatalength) throws Exception{
		this.xmlmaxchardatalength = xmlmaxchardatalength;
	}

	/**
	* <pre>
	* Specify the maximum size of CDATA. Protects against overflow attacks and large quantities of unparsed data within XML messages.
	* </pre>
	*/
	public Long get_xmlmaxchardatalength() throws Exception {
		return this.xmlmaxchardatalength;
	}

	/**
	* <pre>
	* State if XML Max namespaces check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxnamespacescheck(String xmlmaxnamespacescheck) throws Exception{
		this.xmlmaxnamespacescheck = xmlmaxnamespacescheck;
	}

	/**
	* <pre>
	* State if XML Max namespaces check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxnamespacescheck() throws Exception {
		return this.xmlmaxnamespacescheck;
	}

	/**
	* <pre>
	* Specify maximum number of active namespaces. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxnamespaces(long xmlmaxnamespaces) throws Exception {
		this.xmlmaxnamespaces = new Long(xmlmaxnamespaces);
	}

	/**
	* <pre>
	* Specify maximum number of active namespaces. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxnamespaces(Long xmlmaxnamespaces) throws Exception{
		this.xmlmaxnamespaces = xmlmaxnamespaces;
	}

	/**
	* <pre>
	* Specify maximum number of active namespaces. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxnamespaces() throws Exception {
		return this.xmlmaxnamespaces;
	}

	/**
	* <pre>
	* State if XML Max attribute name length check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxattributenamelengthcheck(String xmlmaxattributenamelengthcheck) throws Exception{
		this.xmlmaxattributenamelengthcheck = xmlmaxattributenamelengthcheck;
	}

	/**
	* <pre>
	* State if XML Max attribute name length check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxattributenamelengthcheck() throws Exception {
		return this.xmlmaxattributenamelengthcheck;
	}

	/**
	* <pre>
	* State if XML DTD is ON or OFF. Protects against recursive Document Type Declaration (DTD) entity expansion attacks. Also, SOAP messages cannot have DTDs in messages. .<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlblockdtd(String xmlblockdtd) throws Exception{
		this.xmlblockdtd = xmlblockdtd;
	}

	/**
	* <pre>
	* State if XML DTD is ON or OFF. Protects against recursive Document Type Declaration (DTD) entity expansion attacks. Also, SOAP messages cannot have DTDs in messages. .<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlblockdtd() throws Exception {
		return this.xmlblockdtd;
	}

	/**
	* <pre>
	* Specify the longest value of any XML attribute. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxattributevaluelength(long xmlmaxattributevaluelength) throws Exception {
		this.xmlmaxattributevaluelength = new Long(xmlmaxattributevaluelength);
	}

	/**
	* <pre>
	* Specify the longest value of any XML attribute. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxattributevaluelength(Long xmlmaxattributevaluelength) throws Exception{
		this.xmlmaxattributevaluelength = xmlmaxattributevaluelength;
	}

	/**
	* <pre>
	* Specify the longest value of any XML attribute. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxattributevaluelength() throws Exception {
		return this.xmlmaxattributevaluelength;
	}

	/**
	* <pre>
	* Maximum nesting (depth) of XML elements. This check protects against documents that have excessive hierarchy depths.
	* </pre>
	*/
	public void set_xmlmaxelementdepth(long xmlmaxelementdepth) throws Exception {
		this.xmlmaxelementdepth = new Long(xmlmaxelementdepth);
	}

	/**
	* <pre>
	* Maximum nesting (depth) of XML elements. This check protects against documents that have excessive hierarchy depths.
	* </pre>
	*/
	public void set_xmlmaxelementdepth(Long xmlmaxelementdepth) throws Exception{
		this.xmlmaxelementdepth = xmlmaxelementdepth;
	}

	/**
	* <pre>
	* Maximum nesting (depth) of XML elements. This check protects against documents that have excessive hierarchy depths.
	* </pre>
	*/
	public Long get_xmlmaxelementdepth() throws Exception {
		return this.xmlmaxelementdepth;
	}

	/**
	* <pre>
	* Specify the longest name of any element (including the expanded namespace) to protect against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxelementnamelength(long xmlmaxelementnamelength) throws Exception {
		this.xmlmaxelementnamelength = new Long(xmlmaxelementnamelength);
	}

	/**
	* <pre>
	* Specify the longest name of any element (including the expanded namespace) to protect against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxelementnamelength(Long xmlmaxelementnamelength) throws Exception{
		this.xmlmaxelementnamelength = xmlmaxelementnamelength;
	}

	/**
	* <pre>
	* Specify the longest name of any element (including the expanded namespace) to protect against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxelementnamelength() throws Exception {
		return this.xmlmaxelementnamelength;
	}

	/**
	* <pre>
	* Name of the profile to which to bind an exemption or rule.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the profile to which to bind an exemption or rule.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* State if XML Block PI is ON or OFF. Protects resources from denial of service attacks as SOAP messages cannot have processing instructions (PI) in messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlblockpi(String xmlblockpi) throws Exception{
		this.xmlblockpi = xmlblockpi;
	}

	/**
	* <pre>
	* State if XML Block PI is ON or OFF. Protects resources from denial of service attacks as SOAP messages cannot have processing instructions (PI) in messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlblockpi() throws Exception {
		return this.xmlblockpi;
	}

	/**
	* <pre>
	* State if XML Max element children check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxelementchildrencheck(String xmlmaxelementchildrencheck) throws Exception{
		this.xmlmaxelementchildrencheck = xmlmaxelementchildrencheck;
	}

	/**
	* <pre>
	* State if XML Max element children check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxelementchildrencheck() throws Exception {
		return this.xmlmaxelementchildrencheck;
	}

	/**
	* <pre>
	* Specify the maximum number of XML elements allowed. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxelements(long xmlmaxelements) throws Exception {
		this.xmlmaxelements = new Long(xmlmaxelements);
	}

	/**
	* <pre>
	* Specify the maximum number of XML elements allowed. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxelements(Long xmlmaxelements) throws Exception{
		this.xmlmaxelements = xmlmaxelements;
	}

	/**
	* <pre>
	* Specify the maximum number of XML elements allowed. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxelements() throws Exception {
		return this.xmlmaxelements;
	}

	/**
	* <pre>
	* State if XML Max Entity Expansions Check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxentityexpansionscheck(String xmlmaxentityexpansionscheck) throws Exception{
		this.xmlmaxentityexpansionscheck = xmlmaxentityexpansionscheck;
	}

	/**
	* <pre>
	* State if XML Max Entity Expansions Check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxentityexpansionscheck() throws Exception {
		return this.xmlmaxentityexpansionscheck;
	}

	/**
	* <pre>
	* State if XML Max namespace URI length check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxnamespaceurilengthcheck(String xmlmaxnamespaceurilengthcheck) throws Exception{
		this.xmlmaxnamespaceurilengthcheck = xmlmaxnamespaceurilengthcheck;
	}

	/**
	* <pre>
	* State if XML Max namespace URI length check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxnamespaceurilengthcheck() throws Exception {
		return this.xmlmaxnamespaceurilengthcheck;
	}

	/**
	* <pre>
	* State if XML Max Entity Expansions Depth Check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxentityexpansiondepthcheck(String xmlmaxentityexpansiondepthcheck) throws Exception{
		this.xmlmaxentityexpansiondepthcheck = xmlmaxentityexpansiondepthcheck;
	}

	/**
	* <pre>
	* State if XML Max Entity Expansions Depth Check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxentityexpansiondepthcheck() throws Exception {
		return this.xmlmaxentityexpansiondepthcheck;
	}

	/**
	* <pre>
	* State if XML Max atribute value length is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxattributevaluelengthcheck(String xmlmaxattributevaluelengthcheck) throws Exception{
		this.xmlmaxattributevaluelengthcheck = xmlmaxattributevaluelengthcheck;
	}

	/**
	* <pre>
	* State if XML Max atribute value length is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxattributevaluelengthcheck() throws Exception {
		return this.xmlmaxattributevaluelengthcheck;
	}

	/**
	* <pre>
	* XML Max Total SOAP Array Size. Protects against SOAP Array Abuse attack.
	* </pre>
	*/
	public void set_xmlmaxsoaparraysize(long xmlmaxsoaparraysize) throws Exception {
		this.xmlmaxsoaparraysize = new Long(xmlmaxsoaparraysize);
	}

	/**
	* <pre>
	* XML Max Total SOAP Array Size. Protects against SOAP Array Abuse attack.
	* </pre>
	*/
	public void set_xmlmaxsoaparraysize(Long xmlmaxsoaparraysize) throws Exception{
		this.xmlmaxsoaparraysize = xmlmaxsoaparraysize;
	}

	/**
	* <pre>
	* XML Max Total SOAP Array Size. Protects against SOAP Array Abuse attack.
	* </pre>
	*/
	public Long get_xmlmaxsoaparraysize() throws Exception {
		return this.xmlmaxsoaparraysize;
	}

	/**
	* <pre>
	* Specify maximum entity expansion depth. Protects aganist Entity Expansion Attack.
	* </pre>
	*/
	public void set_xmlmaxentityexpansiondepth(long xmlmaxentityexpansiondepth) throws Exception {
		this.xmlmaxentityexpansiondepth = new Long(xmlmaxentityexpansiondepth);
	}

	/**
	* <pre>
	* Specify maximum entity expansion depth. Protects aganist Entity Expansion Attack.
	* </pre>
	*/
	public void set_xmlmaxentityexpansiondepth(Long xmlmaxentityexpansiondepth) throws Exception{
		this.xmlmaxentityexpansiondepth = xmlmaxentityexpansiondepth;
	}

	/**
	* <pre>
	* Specify maximum entity expansion depth. Protects aganist Entity Expansion Attack.
	* </pre>
	*/
	public Long get_xmlmaxentityexpansiondepth() throws Exception {
		return this.xmlmaxentityexpansiondepth;
	}

	/**
	* <pre>
	* State if XML Max nodes check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxnodescheck(String xmlmaxnodescheck) throws Exception{
		this.xmlmaxnodescheck = xmlmaxnodescheck;
	}

	/**
	* <pre>
	* State if XML Max nodes check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxnodescheck() throws Exception {
		return this.xmlmaxnodescheck;
	}

	/**
	* <pre>
	* Specify the longest name of any XML attribute. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxattributenamelength(long xmlmaxattributenamelength) throws Exception {
		this.xmlmaxattributenamelength = new Long(xmlmaxattributenamelength);
	}

	/**
	* <pre>
	* Specify the longest name of any XML attribute. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxattributenamelength(Long xmlmaxattributenamelength) throws Exception{
		this.xmlmaxattributenamelength = xmlmaxattributenamelength;
	}

	/**
	* <pre>
	* Specify the longest name of any XML attribute. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxattributenamelength() throws Exception {
		return this.xmlmaxattributenamelength;
	}

	/**
	* <pre>
	* State if XML Max CDATA length check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxchardatalengthcheck(String xmlmaxchardatalengthcheck) throws Exception{
		this.xmlmaxchardatalengthcheck = xmlmaxchardatalengthcheck;
	}

	/**
	* <pre>
	* State if XML Max CDATA length check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxchardatalengthcheck() throws Exception {
		return this.xmlmaxchardatalengthcheck;
	}

	/**
	* <pre>
	* State if XML Min file size check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlminfilesizecheck(String xmlminfilesizecheck) throws Exception{
		this.xmlminfilesizecheck = xmlminfilesizecheck;
	}

	/**
	* <pre>
	* State if XML Min file size check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlminfilesizecheck() throws Exception {
		return this.xmlminfilesizecheck;
	}

	/**
	* <pre>
	* Specify the maximum number of children allowed per XML element. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxelementchildren(long xmlmaxelementchildren) throws Exception {
		this.xmlmaxelementchildren = new Long(xmlmaxelementchildren);
	}

	/**
	* <pre>
	* Specify the maximum number of children allowed per XML element. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxelementchildren(Long xmlmaxelementchildren) throws Exception{
		this.xmlmaxelementchildren = xmlmaxelementchildren;
	}

	/**
	* <pre>
	* Specify the maximum number of children allowed per XML element. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxelementchildren() throws Exception {
		return this.xmlmaxelementchildren;
	}

	/**
	* <pre>
	* Enforces minimum message size.
	* </pre>
	*/
	public void set_xmlminfilesize(long xmlminfilesize) throws Exception {
		this.xmlminfilesize = new Long(xmlminfilesize);
	}

	/**
	* <pre>
	* Enforces minimum message size.
	* </pre>
	*/
	public void set_xmlminfilesize(Long xmlminfilesize) throws Exception{
		this.xmlminfilesize = xmlminfilesize;
	}

	/**
	* <pre>
	* Enforces minimum message size.
	* </pre>
	*/
	public Long get_xmlminfilesize() throws Exception {
		return this.xmlminfilesize;
	}

	/**
	* <pre>
	* Specify the maximum number of XML nodes. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxnodes(long xmlmaxnodes) throws Exception {
		this.xmlmaxnodes = new Long(xmlmaxnodes);
	}

	/**
	* <pre>
	* Specify the maximum number of XML nodes. Protects against overflow attacks.
	* </pre>
	*/
	public void set_xmlmaxnodes(Long xmlmaxnodes) throws Exception{
		this.xmlmaxnodes = xmlmaxnodes;
	}

	/**
	* <pre>
	* Specify the maximum number of XML nodes. Protects against overflow attacks.
	* </pre>
	*/
	public Long get_xmlmaxnodes() throws Exception {
		return this.xmlmaxnodes;
	}

	/**
	* <pre>
	* Any comments about the purpose of profile, or other useful information about the profile.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments about the purpose of profile, or other useful information about the profile.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* State if XML Max attributes check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxattributescheck(String xmlmaxattributescheck) throws Exception{
		this.xmlmaxattributescheck = xmlmaxattributescheck;
	}

	/**
	* <pre>
	* State if XML Max attributes check is ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxattributescheck() throws Exception {
		return this.xmlmaxattributescheck;
	}

	/**
	* <pre>
	* XML Max Individual SOAP Array Rank. This is the dimension of the SOAP array.
	* </pre>
	*/
	public void set_xmlmaxsoaparrayrank(long xmlmaxsoaparrayrank) throws Exception {
		this.xmlmaxsoaparrayrank = new Long(xmlmaxsoaparrayrank);
	}

	/**
	* <pre>
	* XML Max Individual SOAP Array Rank. This is the dimension of the SOAP array.
	* </pre>
	*/
	public void set_xmlmaxsoaparrayrank(Long xmlmaxsoaparrayrank) throws Exception{
		this.xmlmaxsoaparrayrank = xmlmaxsoaparrayrank;
	}

	/**
	* <pre>
	* XML Max Individual SOAP Array Rank. This is the dimension of the SOAP array.
	* </pre>
	*/
	public Long get_xmlmaxsoaparrayrank() throws Exception {
		return this.xmlmaxsoaparrayrank;
	}

	/**
	* <pre>
	* State if XML Block External Entities Check is ON or OFF. Protects against XML External Entity (XXE) attacks that force applications to parse untrusted external entities (sources) in XML documents.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlblockexternalentities(String xmlblockexternalentities) throws Exception{
		this.xmlblockexternalentities = xmlblockexternalentities;
	}

	/**
	* <pre>
	* State if XML Block External Entities Check is ON or OFF. Protects against XML External Entity (XXE) attacks that force applications to parse untrusted external entities (sources) in XML documents.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlblockexternalentities() throws Exception {
		return this.xmlblockexternalentities;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwprofile_xmldosurl_binding_response result = (appfwprofile_xmldosurl_binding_response) service.get_payload_formatter().string_to_resource(appfwprofile_xmldosurl_binding_response.class, response);
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
		return result.appfwprofile_xmldosurl_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, appfwprofile_xmldosurl_binding resource) throws Exception {
		appfwprofile_xmldosurl_binding updateresource = new appfwprofile_xmldosurl_binding();
		updateresource.name = resource.name;
		updateresource.comment = resource.comment;
		updateresource.state = resource.state;
		updateresource.xmldosurl = resource.xmldosurl;
		updateresource.xmlmaxelementdepthcheck = resource.xmlmaxelementdepthcheck;
		updateresource.xmlmaxelementdepth = resource.xmlmaxelementdepth;
		updateresource.xmlmaxelementnamelengthcheck = resource.xmlmaxelementnamelengthcheck;
		updateresource.xmlmaxelementnamelength = resource.xmlmaxelementnamelength;
		updateresource.xmlmaxelementscheck = resource.xmlmaxelementscheck;
		updateresource.xmlmaxelements = resource.xmlmaxelements;
		updateresource.xmlmaxelementchildrencheck = resource.xmlmaxelementchildrencheck;
		updateresource.xmlmaxelementchildren = resource.xmlmaxelementchildren;
		updateresource.xmlmaxattributescheck = resource.xmlmaxattributescheck;
		updateresource.xmlmaxattributes = resource.xmlmaxattributes;
		updateresource.xmlmaxattributenamelengthcheck = resource.xmlmaxattributenamelengthcheck;
		updateresource.xmlmaxattributenamelength = resource.xmlmaxattributenamelength;
		updateresource.xmlmaxattributevaluelengthcheck = resource.xmlmaxattributevaluelengthcheck;
		updateresource.xmlmaxattributevaluelength = resource.xmlmaxattributevaluelength;
		updateresource.xmlmaxchardatalengthcheck = resource.xmlmaxchardatalengthcheck;
		updateresource.xmlmaxchardatalength = resource.xmlmaxchardatalength;
		updateresource.xmlmaxfilesizecheck = resource.xmlmaxfilesizecheck;
		updateresource.xmlmaxfilesize = resource.xmlmaxfilesize;
		updateresource.xmlminfilesizecheck = resource.xmlminfilesizecheck;
		updateresource.xmlminfilesize = resource.xmlminfilesize;
		updateresource.xmlblockpi = resource.xmlblockpi;
		updateresource.xmlblockdtd = resource.xmlblockdtd;
		updateresource.xmlblockexternalentities = resource.xmlblockexternalentities;
		updateresource.xmlmaxentityexpansionscheck = resource.xmlmaxentityexpansionscheck;
		updateresource.xmlmaxentityexpansions = resource.xmlmaxentityexpansions;
		updateresource.xmlmaxentityexpansiondepthcheck = resource.xmlmaxentityexpansiondepthcheck;
		updateresource.xmlmaxentityexpansiondepth = resource.xmlmaxentityexpansiondepth;
		updateresource.xmlmaxnamespacescheck = resource.xmlmaxnamespacescheck;
		updateresource.xmlmaxnamespaces = resource.xmlmaxnamespaces;
		updateresource.xmlmaxnamespaceurilengthcheck = resource.xmlmaxnamespaceurilengthcheck;
		updateresource.xmlmaxnamespaceurilength = resource.xmlmaxnamespaceurilength;
		updateresource.xmlsoaparraycheck = resource.xmlsoaparraycheck;
		updateresource.xmlmaxsoaparraysize = resource.xmlmaxsoaparraysize;
		updateresource.xmlmaxsoaparrayrank = resource.xmlmaxsoaparrayrank;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, appfwprofile_xmldosurl_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_xmldosurl_binding updateresources[] = new appfwprofile_xmldosurl_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwprofile_xmldosurl_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].state = resources[i].state;
				updateresources[i].xmldosurl = resources[i].xmldosurl;
				updateresources[i].xmlmaxelementdepthcheck = resources[i].xmlmaxelementdepthcheck;
				updateresources[i].xmlmaxelementdepth = resources[i].xmlmaxelementdepth;
				updateresources[i].xmlmaxelementnamelengthcheck = resources[i].xmlmaxelementnamelengthcheck;
				updateresources[i].xmlmaxelementnamelength = resources[i].xmlmaxelementnamelength;
				updateresources[i].xmlmaxelementscheck = resources[i].xmlmaxelementscheck;
				updateresources[i].xmlmaxelements = resources[i].xmlmaxelements;
				updateresources[i].xmlmaxelementchildrencheck = resources[i].xmlmaxelementchildrencheck;
				updateresources[i].xmlmaxelementchildren = resources[i].xmlmaxelementchildren;
				updateresources[i].xmlmaxattributescheck = resources[i].xmlmaxattributescheck;
				updateresources[i].xmlmaxattributes = resources[i].xmlmaxattributes;
				updateresources[i].xmlmaxattributenamelengthcheck = resources[i].xmlmaxattributenamelengthcheck;
				updateresources[i].xmlmaxattributenamelength = resources[i].xmlmaxattributenamelength;
				updateresources[i].xmlmaxattributevaluelengthcheck = resources[i].xmlmaxattributevaluelengthcheck;
				updateresources[i].xmlmaxattributevaluelength = resources[i].xmlmaxattributevaluelength;
				updateresources[i].xmlmaxchardatalengthcheck = resources[i].xmlmaxchardatalengthcheck;
				updateresources[i].xmlmaxchardatalength = resources[i].xmlmaxchardatalength;
				updateresources[i].xmlmaxfilesizecheck = resources[i].xmlmaxfilesizecheck;
				updateresources[i].xmlmaxfilesize = resources[i].xmlmaxfilesize;
				updateresources[i].xmlminfilesizecheck = resources[i].xmlminfilesizecheck;
				updateresources[i].xmlminfilesize = resources[i].xmlminfilesize;
				updateresources[i].xmlblockpi = resources[i].xmlblockpi;
				updateresources[i].xmlblockdtd = resources[i].xmlblockdtd;
				updateresources[i].xmlblockexternalentities = resources[i].xmlblockexternalentities;
				updateresources[i].xmlmaxentityexpansionscheck = resources[i].xmlmaxentityexpansionscheck;
				updateresources[i].xmlmaxentityexpansions = resources[i].xmlmaxentityexpansions;
				updateresources[i].xmlmaxentityexpansiondepthcheck = resources[i].xmlmaxentityexpansiondepthcheck;
				updateresources[i].xmlmaxentityexpansiondepth = resources[i].xmlmaxentityexpansiondepth;
				updateresources[i].xmlmaxnamespacescheck = resources[i].xmlmaxnamespacescheck;
				updateresources[i].xmlmaxnamespaces = resources[i].xmlmaxnamespaces;
				updateresources[i].xmlmaxnamespaceurilengthcheck = resources[i].xmlmaxnamespaceurilengthcheck;
				updateresources[i].xmlmaxnamespaceurilength = resources[i].xmlmaxnamespaceurilength;
				updateresources[i].xmlsoaparraycheck = resources[i].xmlsoaparraycheck;
				updateresources[i].xmlmaxsoaparraysize = resources[i].xmlmaxsoaparraysize;
				updateresources[i].xmlmaxsoaparrayrank = resources[i].xmlmaxsoaparrayrank;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, appfwprofile_xmldosurl_binding resource) throws Exception {
		appfwprofile_xmldosurl_binding deleteresource = new appfwprofile_xmldosurl_binding();
		deleteresource.name = resource.name;
		deleteresource.xmldosurl = resource.xmldosurl;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, appfwprofile_xmldosurl_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_xmldosurl_binding deleteresources[] = new appfwprofile_xmldosurl_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwprofile_xmldosurl_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].xmldosurl = resources[i].xmldosurl;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch appfwprofile_xmldosurl_binding resources of given name .
	*/
	public static appfwprofile_xmldosurl_binding[] get(nitro_service service, String name) throws Exception{
		appfwprofile_xmldosurl_binding obj = new appfwprofile_xmldosurl_binding();
		obj.set_name(name);
		appfwprofile_xmldosurl_binding response[] = (appfwprofile_xmldosurl_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_xmldosurl_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwprofile_xmldosurl_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_xmldosurl_binding obj = new appfwprofile_xmldosurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_xmldosurl_binding[] response = (appfwprofile_xmldosurl_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_xmldosurl_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwprofile_xmldosurl_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_xmldosurl_binding obj = new appfwprofile_xmldosurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_xmldosurl_binding[] response = (appfwprofile_xmldosurl_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count appfwprofile_xmldosurl_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		appfwprofile_xmldosurl_binding obj = new appfwprofile_xmldosurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		appfwprofile_xmldosurl_binding response[] = (appfwprofile_xmldosurl_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_xmldosurl_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_xmldosurl_binding obj = new appfwprofile_xmldosurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_xmldosurl_binding[] response = (appfwprofile_xmldosurl_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_xmldosurl_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_xmldosurl_binding obj = new appfwprofile_xmldosurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_xmldosurl_binding[] response = (appfwprofile_xmldosurl_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class as_scan_location_xmlsqlEnum {
		public static final String ELEMENT = "ELEMENT";
		public static final String ATTRIBUTE = "ATTRIBUTE";
	}
	public static class xmlmaxelementdepthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattachmentsizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class xmlsoaparraycheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_ffEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlmaxelementnamelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxelementscheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlendpointcheckEnum {
		public static final String ABSOLUTE = "ABSOLUTE";
		public static final String RELATIVE = "RELATIVE";
	}
	public static class xmlmaxfilesizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxnamespacescheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattributenamelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlblockdtdEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_sqlEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlblockpiEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlvalidateresponseEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxelementchildrencheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregexEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlmaxentityexpansionscheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class as_scan_location_xssEnum {
		public static final String FORMFIELD = "FORMFIELD";
		public static final String HEADER = "HEADER";
		public static final String COOKIE = "COOKIE";
	}
	public static class xmlmaxnamespaceurilengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxentityexpansiondepthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class as_scan_location_xmlxssEnum {
		public static final String ELEMENT = "ELEMENT";
		public static final String ATTRIBUTE = "ATTRIBUTE";
	}
	public static class as_scan_location_sqlEnum {
		public static final String FORMFIELD = "FORMFIELD";
		public static final String HEADER = "HEADER";
		public static final String COOKIE = "COOKIE";
	}
	public static class isregex_ffcEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlmaxattributevaluelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlattachmentcontenttypecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_xmlsqlEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlvalidatesoapenvelopeEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxnodescheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxchardatalengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlminfilesizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_xssEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class isregex_xmlxssEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmladditionalsoapheadersEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattributescheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class actionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String log = "log";
		public static final String remove = "remove";
		public static final String stats = "stats";
		public static final String xout = "xout";
	}
	public static class xmlblockexternalentitiesEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}

}