package com.ventas.springboot.ventas.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ventas.springboot.ventas.VentasApplication;

@ControllerAdvice
@RestController
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(VentasApplication.class);
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> manejarExceptions(Exception e){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				new Date(), 
				"Ocurrio un error", 
				e.getMessage()
			); 
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		logger.trace("Este es un log mi primer log rastreo");
		logger.debug("Este es un log mi primer log depuración");
		logger.info("Este es un log mi primer log info");
		logger.warn("Este es un log mi primer log advertencia");
		logger.error("Este es un log mi primer log error");

		Map<String, String> errors = new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError)error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});

		ExceptionResponse exceptionResponse = new ExceptionResponse(
				new Date(), 
				"Ocurrio un error", 
				ex.getMessage(),
				errors
			); 
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
}
