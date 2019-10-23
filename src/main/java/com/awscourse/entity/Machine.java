package com.awscourse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Machine {

	private String ip;
	
	private String name;
	
	private String os;
	
	private String architecture;
	
	private String osVersion;

	public Machine(String ip, String name, String os, String architecture, String osVersion) {
		super();
		this.ip = ip;
		this.name = name;
		this.os = os;
		this.architecture = architecture;
		this.osVersion = osVersion;
	}
	
	
}
