package com.app.springbootsample.exception;

import com.app.springbootsample.model.constants.Constants;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(Integer id){
        super(Constants.STUDENT_NOT_FOUND + id);
    }
}
