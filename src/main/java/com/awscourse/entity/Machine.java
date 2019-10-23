package com.awscourse.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
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
	
	
}
