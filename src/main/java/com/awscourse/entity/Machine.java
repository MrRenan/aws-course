package com.awscourse.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Machine implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ip;
	private String name;
	private String os;
	private String architecture;
	private String osVersion;

	public Machine(String ip, String name, String os, String architecture, String osVersion) {
		this.ip = ip;
		this.name = name;
		this.os = os;
		this.architecture = architecture;
		this.osVersion = osVersion;
	}

	public Machine() {

	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
