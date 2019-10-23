package com.awscourse.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

import com.awscourse.entity.DatailedMachine;
import com.awscourse.entity.Machine;

@Service
public class MachineService {

//	Get machine information
	public Machine getMachineInformation() throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		Machine machine = new Machine();

		machine.setIp(address.getHostAddress());
		machine.setName(address.getHostName());
		machine.setOs(System.getProperty("os.name"));
		machine.setArchitecture(System.getProperty("os.arch"));
		machine.setOsVersion(System.getProperty("os.version"));

		return machine;
	}
//	get detailed machine information

	public DatailedMachine getDetailedMachineInformation() throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		DatailedMachine detailedMachine = new DatailedMachine();

		detailedMachine.setIp(address.getHostAddress());
		detailedMachine.setName(address.getHostName());
		detailedMachine.setOs(System.getProperty("os.name"));
		detailedMachine.setArchitecture(System.getProperty("os.arch"));
		detailedMachine.setOsVersion(System.getProperty("os.version"));
		detailedMachine.setJavaVersion(System.getProperty("java.version"));
		detailedMachine.setJavaVendor("java.vendor");
		detailedMachine.setJavaVendorUrl("java.vendor.url");

		return detailedMachine;
	}
}
