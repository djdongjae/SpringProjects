package net.skhu.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class User {
	
	int id;
	
	@NotEmpty
	@NotBlank
	String loginName;
	
	@NotEmpty
	@NotBlank
	String password;
	
	@NotEmpty
	@NotBlank
	String name;
	
	@NotEmpty
	@NotBlank
	@Email
	String email;
	
	boolean enabled;
	
	@NotEmpty
	@NotBlank
	String userType;
	
	Integer departmentId;
	String departmentName;
	

}
