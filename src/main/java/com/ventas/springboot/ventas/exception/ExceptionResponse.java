package com.ventas.springboot.ventas.exception;

import java.util.Date;
import java.util.Map;

public class ExceptionResponse {
	
	
	private Date timestamp;
	private String mensaje;
	private String detalle;
	
	private Map<String, String> errorsValidation;
	
	public ExceptionResponse() {}
	
	public ExceptionResponse(Date timestamp, String mensaje, String detalle) {
		this.timestamp = timestamp;
		this.mensaje = mensaje;
		this.detalle = detalle;
		
	}
	
	public ExceptionResponse(Date timestamp, String mensaje, String detalle, Map<String, String> errorsValidation ) {
		this.timestamp = timestamp;
		this.mensaje = mensaje;
		this.detalle = detalle;
		this.errorsValidation = errorsValidation;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, String> getErrorsValidation() {
		return errorsValidation;
	}

	public void setErrorsValidation(Map<String, String> errorsValidation) {
		this.errorsValidation = errorsValidation;
	}
	
}
