package com.example.course.services.execptions;


public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 2578236874585067467L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
