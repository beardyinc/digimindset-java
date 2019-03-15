package com.digimindset.java.lesson4;

/**
 * @author paullatzelsperger
 * @since 2019-03-15
 */
public class Vehicle {

    private String model;

    public Vehicle(){
        this.model = "unknown";
    }

    public Vehicle(String mdl){
        this.model= mdl;
    }


    public String getModel() {
        return model;
    }
}
