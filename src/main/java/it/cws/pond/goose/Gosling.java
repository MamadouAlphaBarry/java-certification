package it.cws.pond.goose;

import it.cws.pond.shore.Bird;

public class Gosling extends Bird {
    public void swim() {
        floatInWater(); // protected access is ok
        System.out.print(text); // protected access is ok
    }
}
