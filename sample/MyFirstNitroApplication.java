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

import java.util.Arrays;
import java.util.List;

import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver;
import com.citrix.netscaler.nitro.service.nitro_service;

// This sample code demonstrates basic usage of the NITRO APIs
public class MyFirstNitroApplication {

	public static void main(String[] args) {
		
		try {
			//Create an instance of the nitro_service class to connect to the appliance
			nitro_service ns_session = new nitro_service("10.102.29.170","HTTP");
			
			//Log on to the appliance using your credentials
			ns_session.login("admin","verysecret");
			
			//Check whether load balancing feature is enabled. Else, enable it.
			String[] features_to_be_enabled = {"lb"};			
			String[] enabled_features = ns_session.get_enabled_features();
			List<String> list = Arrays.asList(enabled_features);
			if(!(list.contains("lb"))){
				ns_session.enable_features(features_to_be_enabled);
				System.out.println("LB feature is enabled on the NetScaler");
			}
			
			//Create an instance of the virtual server class
			lbvserver new_lbvserver_obj = new lbvserver();
			
			//Create a new virtual server
			new_lbvserver_obj.set_name("MyFirstLbVServer");
			new_lbvserver_obj.set_ipv46("10.102.29.88");
			new_lbvserver_obj.set_servicetype("HTTP");
			new_lbvserver_obj.set_lbmethod("ROUNDROBIN");
			lbvserver.add(ns_session,new_lbvserver_obj);
					
			//Retrieve the details of the virtual server
			new_lbvserver_obj = lbvserver.get(ns_session,new_lbvserver_obj.get_name());
			System.out.println("Name : " +new_lbvserver_obj.get_name() +"\n" +"Protocol : " +new_lbvserver_obj.get_servicetype());

			//Delete the virtual server
			lbvserver.delete(ns_session, new_lbvserver_obj.get_name());
			
			//Save the configurations
			ns_session.save_config();
			
			//Logout from the NetScaler appliance
			ns_session.logout();
			
		}catch(nitro_exception error){
			
			System.out.println("NITRO Error -> Code " +error.getErrorCode() +" : " +error.getMessage());
		}catch(Exception e){
			System.out.println("Java Error -> " +e.getMessage());
		}
	}
}
