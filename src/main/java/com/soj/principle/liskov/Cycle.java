package com.soj.principle.liskov;

public class Cycle extends TransportationDeviceWithoutEngine {
    int price=0;

    public Cycle() {
        super();

    }

    @Override
    public String withOutEngine() {

        return "There  is no engine in cycle.";
    }
}
