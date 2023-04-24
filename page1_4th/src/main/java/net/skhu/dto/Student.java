package net.skhu.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Student {
	int id;
	
	@NotEmpty
	@NotBlank
	@Size(min=8, max=9)
	String studentNo;

}
