package com.lambdaschool.school.handlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.ResourceNotFoundException;

//bean shared by controller
//when something happens in controller look here at ControllerAdvice
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    //when we hit an exception in a controller, run THIS method:
    @ExceptionHandler({ResourceNotFoundException.class}) //how we handle this error -- {curly braces cuz its a list}
    public ResponseEntity<?> {
        return new ResponseEntity<>();
    }

}
