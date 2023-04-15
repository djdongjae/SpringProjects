package net.skhu.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	String shortName;
	String phone;
	
}
