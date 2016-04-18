package com.timothyking.beeradvisor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tking on 4/16/2016.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        switch (color) {
            case "Amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                brands.add("Yo Mamma");
                break;
            case "Orange":
                brands.add("Blue (yuck) Moon");
                brands.add("IPA");
                break;
            case "Light":
                brands.add("Coors");
                brands.add("Miller");
                break;
            case "Dark":
                brands.add("Guiness");
                brands.add("Negra Modelo");
                break;
            default:
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
        }
        return brands;
    }
}
