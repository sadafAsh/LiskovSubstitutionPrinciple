package com.soj.principle.liskov;

public class TransportationDeviceWithoutEngine extends TransportationDevice {

    String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String withOutEngine(){
        return getEngineType();
    }
}
