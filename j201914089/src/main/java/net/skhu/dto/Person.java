package net.skhu.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Person {
	int pid;
	
	@NotEmpty
	@NotBlank
	String name;
	
	@NotNull
	int categoryCode;	
	
	String phone;
	
	@NotEmpty
	@NotBlank
	@Email
	String email;
	
	String gender;
	
	@NotNull
	@DecimalMax(value="3")
	@DecimalMin(value="1")
	int title;
	
	String categoryTitle;

}
