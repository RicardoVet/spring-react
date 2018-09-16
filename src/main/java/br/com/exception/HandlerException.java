package br.com.exception;

import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HandlerException {

	@ExceptionHandler({EmptyResultDataAccessException.class, NoSuchElementException.class})
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public void handlerEmptyResultDataAccessException() {
		
	}
}
