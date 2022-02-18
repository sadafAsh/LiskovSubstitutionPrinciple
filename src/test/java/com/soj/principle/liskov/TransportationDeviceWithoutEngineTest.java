package com.soj.principle.liskov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportationDeviceWithoutEngineTest {
    TransportationDeviceWithoutEngine noEngine;

    @Test
    void testToSetEngineType() {
        noEngine = new TransportationDeviceWithoutEngine();
        noEngine.setEngineType("No Engine");
        Assertions.assertEquals("No Engine", noEngine.getEngineType());
    }

    @Test
    void testToWithOutEngine() {
        noEngine = new TransportationDeviceWithoutEngine();
        String result = "no engine";
        noEngine.withOutEngine();
        Assertions.assertEquals(noEngine.withOutEngine(), noEngine.getEngineType());
    }
}