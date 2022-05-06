package com.company;

public class MetalType {
    double volume = 1;
    public void printType() {
        System.out.println("Metal Type");
    }
    public void Volume(double Ro, double m){
        volume =  m / Ro;
    }
    public void printVolume(){
        System.out.println(volume);
    }

}
