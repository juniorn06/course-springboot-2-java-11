package com.example.course.services.execptions;

public class DatabaseException extends RuntimeException{


    private static final long serialVersionUID = -8628480599757939208L;

    public DatabaseException(String msg){
        super(msg);
    }
}
