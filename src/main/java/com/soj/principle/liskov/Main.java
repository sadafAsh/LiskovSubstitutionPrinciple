package com.soj.principle.liskov;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){

        Car car1=new Car(60000);
        car1.setName("HONDA");
        car1.setSpeed(4.5);
        car1.setEngineType("Petro");
        logger.debug(car1.getName());
        logger.debug(car1.getSpeed());
        logger.debug(car1.getEngineType());
        logger.debug(car1.price);


        TransportationDeviceWithoutEngine cycle=new Cycle();
        String noEngine=cycle.withOutEngine();
        logger.debug(noEngine);

    }
}
