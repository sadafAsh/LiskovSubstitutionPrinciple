package com.soj.principle.liskov;

public class Car extends TransportationDeviceWithEngine {
     int price;

    public Car(int price) {
        super();
        this.price = price;
    }


    @Override
    public void setEngineType(String engineType) {
super.setEngineType(engineType);
    if (engineType.equalsIgnoreCase("Petrol")){
            this.price=this.price+50000;
        }
        else
            if (engineType.equalsIgnoreCase("Diesel")){
            this.price=this.price+10000;
       }

    }



}
