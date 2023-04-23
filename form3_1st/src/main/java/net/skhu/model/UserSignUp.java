package net.skhu.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserSignUp {
	
	@NotEmpty @NotBlank
	@Size(min=3, max=12)
	String loginName;
	
	@NotEmpty
	@Size(min=6, max=12)
	String passwd1;
	
	String passwd2;
	
	@NotEmpty @NotBlank
	@Size(min=2, max=30)
	String name;
	
	@NotEmpty
	@Email
	String email;
	
	int departmentId;

}
