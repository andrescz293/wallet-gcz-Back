package com.ghostcz.walletback.dto;

import org.springframework.http.HttpStatusCode;

public class GeneralResponse<T>  {

	public GeneralResponse(T data, String message, Integer code) {
		this.data = data;
		this.message = message;
		Code = code;
	}

	private T data;
	private String message;
	private Integer Code;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return Code;
	}

	public void setCode(Integer code) {
		Code = code;
	}
}
