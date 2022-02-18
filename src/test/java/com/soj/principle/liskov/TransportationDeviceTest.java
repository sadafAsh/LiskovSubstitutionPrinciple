package com.soj.principle.liskov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportationDeviceTest {
 protected TransportationDevice transport;
    @Test
    void testToGetName() {
        transport=new TransportationDevice();
        transport.setName("wagon");
        Assertions.assertEquals("wagon",transport.getName());
    }

    @Test
    void testToGetSpeed() {
      transport=new TransportationDevice();
      transport.setSpeed(3.5);
      Assertions.assertEquals(3.5,transport.getSpeed());
    }
}