package com.BasicJava.demo.response;

import org.springframework.stereotype.Component;

@Component
public class EmployeeResponse {

	private String message;
	private boolean error;
	private String status;
	private Object data;

	public EmployeeResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
