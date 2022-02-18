package com.soj.principle.liskov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
Car car;
    @Test
    void testToGetAnEngineTypeAndPrice() {
        car=new Car(60000);
        car.setEngineType("Petrol");
        Assertions.assertEquals("Petrol",car.getEngineType());
        Assertions.assertEquals(110000,car.price);
    }

    @Test
    void testToGetAPriceOfDiesel() {
        car=new Car(60000);
        car.setEngineType("Diesel");
        Assertions.assertEquals(70000,car.price);
    }
    @Test
    void testToGetASamePrice() {
        car=new Car(60000);
        car.setEngineType("Gas");
        Assertions.assertEquals(60000,car.price);
    }
}