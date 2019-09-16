package com.lambdaschool.school.handlers;

import com.lambdaschool.school.model.ErrorDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import javax.servlet.http.HttpServletRequest;
import java.util.Date;

//bean shared by controller
//when something happens in controller look here at ControllerAdvice
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    //when we hit an exception in a controller, run THIS method:
    @ExceptionHandler({ResourceNotFoundException.class}) //how we handle this error -- {curly braces cuz its a list}
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request) {

        ErrorDetail errorDetail = new ErrorDetail();

        errorDetail.setTimestamp(new Date().getTime());
        errorDetail.setStatus(HttpStatus.NOT_FOUND.value());
        errorDetail.setTitle("Resource Not Found");
        errorDetail.setDetail(rnfe.getMessage());
        errorDetail.setDeveloperMessage(rnfe.getClass().getName());
        return new ResponseEntity<>(errorDetail, null, HttpStatus.NOT_FOUND);
    }

}
