package com.dps.aiotracker.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ErrorResponse {
	private String message;
	private String details;
	private HttpStatus status;

	public ErrorResponse(String message, String details, HttpStatus status) {
		this.message = message;
		this.details = details;
		this.status = status;
	}

}