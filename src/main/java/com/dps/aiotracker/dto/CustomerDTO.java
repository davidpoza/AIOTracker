package com.dps.aiotracker.dto;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;

	@NotBlank(message = "Name is mandatory")
	private String name;

	@Email(message = "Email should be valid")
	private String email;
}