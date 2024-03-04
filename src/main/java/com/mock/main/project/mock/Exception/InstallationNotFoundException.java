package com.mock.main.project.mock.Exception;

public class InstallationNotFoundException extends RuntimeException{

    public InstallationNotFoundException (){
        super("This Installation could not be found");
    }
}
