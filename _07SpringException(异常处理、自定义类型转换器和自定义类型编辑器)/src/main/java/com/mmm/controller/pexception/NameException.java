package com.mmm.controller.pexception;

import org.omg.CORBA.UserException;

public class NameException extends UserException {
    public  NameException(){
        super();
    }
    public  NameException(String msg){
        super(msg);
    }
}
