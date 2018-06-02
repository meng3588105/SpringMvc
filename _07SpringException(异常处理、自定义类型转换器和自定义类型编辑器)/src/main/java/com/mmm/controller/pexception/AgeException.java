package com.mmm.controller.pexception;

import org.omg.CORBA.UserException;

public class AgeException extends UserException {

    public AgeException(){
        super();
    }
    public AgeException(String msg){
        super(msg);
    }

}
