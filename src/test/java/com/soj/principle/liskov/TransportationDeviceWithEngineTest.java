package com.soj.principle.liskov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportationDeviceWithEngineTest {
 protected  TransportationDeviceWithEngine withEngine;


    @Test
    void setEngineType() {
        withEngine=new TransportationDeviceWithEngine();
        withEngine.setEngineType("petrol");
        Assertions.assertEquals("petrol",withEngine.getEngineType());

    }
}