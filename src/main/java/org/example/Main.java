package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("YatakOdası",new Wall("right"),new Wall("left"),new Wall("top"),new Wall("bottom"),new Ceiling(3, PaintColor.GREEN),new Bed("ortopedik",3,5,6,7),new Lamp(LampType.NEON,false,2),new Wardrobe(10,20,90.0),new Carpet(3,4,PaintColor.RED));


        System.out.println(bedroom.getCarpet().getColor());
        System.out.println(bedroom.getBed().getStyle());
        System.out.println(bedroom.getName());

    }
}