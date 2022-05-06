package com.company;

public class Main {

    public static void main(String[] args) {
        MetalType []metals = new MetalType[3];
        metals[0] = new Iron();
        metals[1] = new Aluminium();
        metals[2] = new Nikel();
        metals[0].Volume(7800, 50);
        metals[1].Volume(2700, 50);
        metals[2].Volume(8900, 50);
        metals[0].printType();
        metals[1].printType();
        metals[2].printType();
        for(MetalType volumes: metals){
            volumes.printVolume();

        }
    }
}

