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

package com.citrix.netscaler.nitro.resource.stat.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class system_response extends base_response
{
	public system_stats system;
}

public class system_stats extends base_resource
{
	private String clearstats;
	private Double voltagev12n;
	private Double voltagev5n;
	private Long cpuusage;
	private Long rescpuusage;
	private Long slavecpuusage;
	private Long mastercpuusage;
	private Double auxvolt7;
	private Double auxvolt6;
	private Double auxvolt5;
	private Double auxvolt4;
	private Double auxvolt3;
	private Double auxvolt2;
	private Double auxvolt1;
	private Double auxvolt0;
	private Double voltagevsen2;
	private Double voltagev5sb;
	private Double voltagevtt;
	private Double voltagevbat;
	private Double voltagev12p;
	private Double voltagev5p;
	private Double voltagev33stby;
	private Double voltagev33main;
	private Double voltagevcc1;
	private Double voltagevcc0;
	private Long numcpus;
	private Double memusagepcnt;
	private Long memuseinmb;
	private Double mgmtcpuusagepcnt;
	private Double pktcpuusagepcnt;
	private Double cpuusagepcnt;
	private Double rescpuusagepcnt;
	private String starttime;
	private Long disk0perusage;
	private Long disk1perusage;
	private Long cpufan0speed;
	private Long cpufan1speed;
	private Long systemfanspeed;
	private Long fan0speed;
	private Long fanspeed;
	private Long cpu0temp;
	private Long cpu1temp;
	private Long internaltemp;
	private String powersupply1status;
	private String powersupply2status;
	private Long disk0size;
	private Long disk0used;
	private Long disk0avail;
	private Long disk1size;
	private Long disk1used;
	private Long disk1avail;
	private Long fan2speed;
	private Long fan3speed;
	private Long fan4speed;
	private Long fan5speed;
	private Long auxtemp0;
	private Long auxtemp1;
	private Long auxtemp2;
	private Long auxtemp3;
	private String powersupply3status;
	private String powersupply4status;
	private String timesincestart;
	private Long memsizemb;

	/**
	* <pre>
	* Clear the statsistics / counters
	* </pre>
	*/
	public void set_clearstats(String clearstats) throws Exception{
		this.clearstats = clearstats;
	}

	/**
	* <pre>
	* Clear the statsistics / counters.<br> Possible values = basic, full
	* </pre>
	*/
	public String get_clearstats() throws Exception {
		return this.clearstats;
	}

	/**
	* <pre>
	* Onboard battery power supply output. 9800 and 9950 platforms display standard value of 5.0V.
	* </pre>
	*/
	public Double get_voltagevbat() throws Exception {
		return this.voltagevbat;
	}

	/**
	* <pre>
	* Voltage of a device connected to health monitoring chip through pin 2.
	* </pre>
	*/
	public Double get_auxvolt2() throws Exception {
		return this.auxvolt2;
	}

	/**
	* <pre>
	* Power supply -5V output. Acceptable range is -5.50 through -4.50 volts. 9800 and 9960 platforms display standard value of -5.0V.
	* </pre>
	*/
	public Double get_voltagev5n() throws Exception {
		return this.voltagev5n;
	}

	/**
	* <pre>
	* Voltage of a device connected to health monitoring chip through pin 7.
	* </pre>
	*/
	public Double get_auxvolt7() throws Exception {
		return this.auxvolt7;
	}

	/**
	* <pre>
	* CPU 0 temperature. 9800 and 9960 platforms display internal chip temperature. This is a critical counter.
You can configure CPU 0 Temperature by using the Set snmp alarm TEMPERATURE-HIGH command to set the upper limit.

	* </pre>
	*/
	public Long get_cpu0temp() throws Exception {
		return this.cpu0temp;
	}

	/**
	* <pre>
	* System fan 1 speed. For new platforms associated pin is connected to CPU supporting fans. For platforms in which it is not connected, it will point to System Fan.
	* </pre>
	*/
	public Long get_fan0speed() throws Exception {
		return this.fan0speed;
	}

	/**
	* <pre>
	* Used space in /var partition of the disk, as a percentage. This is a critical counter. You can configure /var Used (%) by using the Set snmp alarm DISK-USAGE-HIGH command.
	* </pre>
	*/
	public Long get_disk1perusage() throws Exception {
		return this.disk1perusage;
	}

	/**
	* <pre>
	* Average CPU utilization percentage. Not applicable for a single-CPU system.
	* </pre>
	*/
	public Double get_rescpuusagepcnt() throws Exception {
		return this.rescpuusagepcnt;
	}

	/**
	* <pre>
	* Used space in /var partition of the hard disk.
	* </pre>
	*/
	public Long get_disk1used() throws Exception {
		return this.disk1used;
	}

	/**
	* <pre>
	* Available space in /var partition of the hard disk.
	* </pre>
	*/
	public Long get_disk1avail() throws Exception {
		return this.disk1avail;
	}

	/**
	* <pre>
	* Speed of Fan 2 if associated pin is connected to health monitoring chip.
	* </pre>
	*/
	public Long get_fan4speed() throws Exception {
		return this.fan4speed;
	}

	/**
	* <pre>
	* Shows average CPU utilization percentage if more than 1 CPU is present.
	* </pre>
	*/
	public Long get_rescpuusage() throws Exception {
		return this.rescpuusage;
	}

	/**
	* <pre>
	* Power supply 3 failure status.
	* </pre>
	*/
	public String get_powersupply3status() throws Exception {
		return this.powersupply3status;
	}

	/**
	* <pre>
	* Voltage of a device connected to health monitoring chip through pin 5.
	* </pre>
	*/
	public Double get_auxvolt5() throws Exception {
		return this.auxvolt5;
	}

	/**
	* <pre>
	* Voltage of a device connected to health monitoring chip through pin 3.
	* </pre>
	*/
	public Double get_auxvolt3() throws Exception {
		return this.auxvolt3;
	}

	/**
	* <pre>
	* Used space in /flash partition of the disk, as a percentage. This is a critical counter.
You can configure /flash Used (%) by using the Set snmp alarm DISK-USAGE-HIGH command.

	* </pre>
	*/
	public Long get_disk0perusage() throws Exception {
		return this.disk0perusage;
	}

	/**
	* <pre>
	* Speed of Fan 0 if associated pin is connected to health monitoring chip.
	* </pre>
	*/
	public Long get_fan2speed() throws Exception {
		return this.fan2speed;
	}

	/**
	* <pre>
	* Power supply 4 failure status.
	* </pre>
	*/
	public String get_powersupply4status() throws Exception {
		return this.powersupply4status;
	}

	/**
	* <pre>
	* Voltage of a device connected to health monitoring chip through pin 1.
	* </pre>
	*/
	public Double get_auxvolt1() throws Exception {
		return this.auxvolt1;
	}

	/**
	* <pre>
	* System fan 2 speed. For new platforms associated pin is connected to CPU supporting fans. For platforms in which it is not connected, it will point to System Fan
	* </pre>
	*/
	public Long get_fanspeed() throws Exception {
		return this.fanspeed;
	}

	/**
	* <pre>
	* Speed of Fan 3 if associated pin is connected to health monitoring chip.
	* </pre>
	*/
	public Long get_fan5speed() throws Exception {
		return this.fan5speed;
	}

	/**
	* <pre>
	* Size of /flash partition of the hard disk.
	* </pre>
	*/
	public Long get_disk0size() throws Exception {
		return this.disk0size;
	}

	/**
	* <pre>
	* Management CPU utilization percentage.
	* </pre>
	*/
	public Double get_mgmtcpuusagepcnt() throws Exception {
		return this.mgmtcpuusagepcnt;
	}

	/**
	* <pre>
	* CPU utilization percentage.
	* </pre>
	*/
	public Long get_cpuusage() throws Exception {
		return this.cpuusage;
	}

	/**
	* <pre>
	* Power Supply 5V Standby Voltage. Currently only 13k Platforms will have valid value for this counter and for older platforms this will be 0.
	* </pre>
	*/
	public Double get_voltagev5sb() throws Exception {
		return this.voltagev5sb;
	}

	/**
	* <pre>
	* Used space in /flash partition of the hard disk.
	* </pre>
	*/
	public Long get_disk0used() throws Exception {
		return this.disk0used;
	}

	/**
	* <pre>
	* Power supply 1 failure status.
	* </pre>
	*/
	public String get_powersupply1status() throws Exception {
		return this.powersupply1status;
	}

	/**
	* <pre>
	* CPU Fan 0 speed. Acceptable range is 3000 through 6000 RPM. This is a critical counter.
You can configure CPU Fan 0 Speed by using the Set snmp alarm FAN-SPEED-LOW command to set the lower limit.

	* </pre>
	*/
	public Long get_cpufan0speed() throws Exception {
		return this.cpufan0speed;
	}

	/**
	* <pre>
	* Size of /var partition of the hard disk.
	* </pre>
	*/
	public Long get_disk1size() throws Exception {
		return this.disk1size;
	}

	/**
	* <pre>
	* Temperature of a device connected to health monitoring chip through pin 1.
	* </pre>
	*/
	public Long get_auxtemp1() throws Exception {
		return this.auxtemp1;
	}

	/**
	* <pre>
	* The number of CPUs on the NetScaler appliance.
	* </pre>
	*/
	public Long get_numcpus() throws Exception {
		return this.numcpus;
	}

	/**
	* <pre>
	* Average CPU utilization percentage for all packet engines excluding management PE.
	* </pre>
	*/
	public Double get_pktcpuusagepcnt() throws Exception {
		return this.pktcpuusagepcnt;
	}

	/**
	* <pre>
	* Power supply +5V output. Acceptable range is 4.50 through 5.50 volts.
	* </pre>
	*/
	public Double get_voltagev5p() throws Exception {
		return this.voltagev5p;
	}

	/**
	* <pre>
	* Voltage Sensor 2 Input. Currently only 13k Platforms will have valid value for this counter and for older platforms this will be 0.
	* </pre>
	*/
	public Double get_voltagevsen2() throws Exception {
		return this.voltagevsen2;
	}

	/**
	* <pre>
	* Voltage of a device connected to health monitoring chip through pin 0.
	* </pre>
	*/
	public Double get_auxvolt0() throws Exception {
		return this.auxvolt0;
	}

	/**
	* <pre>
	* Temperature of a device connected to health monitoring chip through pin 2.
	* </pre>
	*/
	public Long get_auxtemp2() throws Exception {
		return this.auxtemp2;
	}

	/**
	* <pre>
	* Total amount of system memory, in megabytes.
	* </pre>
	*/
	public Long get_memsizemb() throws Exception {
		return this.memsizemb;
	}

	/**
	* <pre>
	* Main power supply +3.3V output. Acceptable range is 2.970 through 3.630 volts. This is a critical counter.
You can configure Main 3.3V Supply Voltage, by using the Set snmp alarm VOLTAGE-LOW command to set the lower limit and the Set snmp alarm VOLTAGE-HIGH command to set the upper limit.

	* </pre>
	*/
	public Double get_voltagev33main() throws Exception {
		return this.voltagev33main;
	}

	/**
	* <pre>
	* CPU 1 temperature. 9800 and 9960 platforms display internal chip temperature. 7000, 9010 and 10010 platforms display CPU 0 temperature. This is a critical counter.
You can configure CPU 1 Temperature by using the Set snmp alarm TEMPERATURE-HIGH command to set the upper limit.

	* </pre>
	*/
	public Long get_cpu1temp() throws Exception {
		return this.cpu1temp;
	}

	/**
	* <pre>
	* Power supply -12V output. Acceptable range is -13.20 through -10.80 volts. 9800 and 9960 platforms display standard value of -12.0V.
	* </pre>
	*/
	public Double get_voltagev12n() throws Exception {
		return this.voltagev12n;
	}

	/**
	* <pre>
	* Main memory currently in use, in megabytes.
	* </pre>
	*/
	public Long get_memuseinmb() throws Exception {
		return this.memuseinmb;
	}

	/**
	* <pre>
	* Temperature of a device connected to health monitoring chip through pin 3.
	* </pre>
	*/
	public Long get_auxtemp3() throws Exception {
		return this.auxtemp3;
	}

	/**
	* <pre>
	* Internal temperature of health monitoring chip. This is a critical counter.
You can configure Internal Temperature by using the Set snmp alarm TEMPERATURE-HIGH command to set the upper limit.

	* </pre>
	*/
	public Long get_internaltemp() throws Exception {
		return this.internaltemp;
	}

	/**
	* <pre>
	* Power supply +12V output. Acceptable range is 10.80 through 13.20 volts.
	* </pre>
	*/
	public Double get_voltagev12p() throws Exception {
		return this.voltagev12p;
	}

	/**
	* <pre>
	* Available space in /flash partition of the hard disk.
	* </pre>
	*/
	public Long get_disk0avail() throws Exception {
		return this.disk0avail;
	}

	/**
	* <pre>
	* Standby power supply +3.3V output. Acceptable range is 2.970 through 3.630 volts. 9800 and 9960 platforms display standard value of 3.3V.
You can configure Standby 3.3V Supply Voltage by using the Set snmp alarm VOLTAGE-LOW command to set the lower limit and the Set snmp alarm VOLTAGE-HIGH command to set the upper limit.

	* </pre>
	*/
	public Double get_voltagev33stby() throws Exception {
		return this.voltagev33stby;
	}

	/**
	* <pre>
	* CPU core 1 voltage. Acceptable range is 1.080 through 1.650 volts. If CPU 1 is not connected to the health monitoring chip, display shows voltage of CPU 0.
	* </pre>
	*/
	public Double get_voltagevcc1() throws Exception {
		return this.voltagevcc1;
	}

	/**
	* <pre>
	* Speed of Fan 1 if associated pin is connected to health monitoring chip.
	* </pre>
	*/
	public Long get_fan3speed() throws Exception {
		return this.fan3speed;
	}

	/**
	* <pre>
	* Intel CPU Vtt power. Currently only 13k Platforms will have valid value for this counter and for older platforms this will be 0.
	* </pre>
	*/
	public Double get_voltagevtt() throws Exception {
		return this.voltagevtt;
	}

	/**
	* <pre>
	* Temperature of a device connected to health monitoring chip through pin 0.
	* </pre>
	*/
	public Long get_auxtemp0() throws Exception {
		return this.auxtemp0;
	}

	/**
	* <pre>
	* CPU Fan 1 speed. Acceptable range is 3000 through 6000 RPM. 7000 platform displays speed of CPU fan 0. This is a critical counter.
You can configure CPU Fan 1 Speed by using the Set snmp alarm FAN-SPEED-LOW command to set the lower limit.

	* </pre>
	*/
	public Long get_cpufan1speed() throws Exception {
		return this.cpufan1speed;
	}

	/**
	* <pre>
	* CPU core 0 voltage. Acceptable range is 1.080 through 1.650 volts.
	* </pre>
	*/
	public Double get_voltagevcc0() throws Exception {
		return this.voltagevcc0;
	}

	/**
	* <pre>
	* Voltage of a device connected to health monitoring chip through pin 4.
	* </pre>
	*/
	public Double get_auxvolt4() throws Exception {
		return this.auxvolt4;
	}

	/**
	* <pre>
	* Time when the NetScaler appliance was last started.
	* </pre>
	*/
	public String get_starttime() throws Exception {
		return this.starttime;
	}

	/**
	* <pre>
	* System fan speed. Acceptable range is 3000 through 6000 RPM. This is a critical counter.
You can configure System Fan Speed by using the Set snmp alarm FAN-SPEED-LOW command to set the lower limit.

	* </pre>
	*/
	public Long get_systemfanspeed() throws Exception {
		return this.systemfanspeed;
	}

	/**
	* <pre>
	* CPU utilization percentage.
	* </pre>
	*/
	public Double get_cpuusagepcnt() throws Exception {
		return this.cpuusagepcnt;
	}

	/**
	* <pre>
	* CPU 0 (currently the master CPU) utilization, as percentage of capacity.
	* </pre>
	*/
	public Long get_mastercpuusage() throws Exception {
		return this.mastercpuusage;
	}

	/**
	* <pre>
	* Seconds since the NetScaler appliance started.
	* </pre>
	*/
	public String get_timesincestart() throws Exception {
		return this.timesincestart;
	}

	/**
	* <pre>
	* Voltage of a device connected to health monitoring chip through pin 6.
	* </pre>
	*/
	public Double get_auxvolt6() throws Exception {
		return this.auxvolt6;
	}

	/**
	* <pre>
	* CPU 1 (currently the slave CPU) utilization, as percentage of capacity. Not applicable for a single-CPU system.
	* </pre>
	*/
	public Long get_slavecpuusage() throws Exception {
		return this.slavecpuusage;
	}

	/**
	* <pre>
	* Percentage of memory utilization on NetScaler.
	* </pre>
	*/
	public Double get_memusagepcnt() throws Exception {
		return this.memusagepcnt;
	}

	/**
	* <pre>
	* Power supply 2 failure status.
	* </pre>
	*/
	public String get_powersupply2status() throws Exception {
		return this.powersupply2status;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		system_stats[] resources = new system_stats[1];
		system_response result = (system_response) service.get_payload_formatter().string_to_resource(system_response.class, response);
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
		resources[0] = result.system;
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
	* Use this API to fetch the statistics of all system_stats resources that are configured on netscaler.
	*/
	public static system_stats get(nitro_service service) throws Exception{
		system_stats obj = new system_stats();
		system_stats[] response = (system_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all system_stats resources that are configured on netscaler.
	*/
	public static system_stats get(nitro_service service,  options option) throws Exception{
		system_stats obj = new system_stats();
		system_stats[] response = (system_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
