package com.soj.principle.liskov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycleTest {
 Cycle cycle;
    @Test
    void testToBeWithNoEngine() {
        cycle=new Cycle();
        String result="There  is no engine in cycle.";
        Assertions.assertEquals(result,cycle.withOutEngine());

    }
}