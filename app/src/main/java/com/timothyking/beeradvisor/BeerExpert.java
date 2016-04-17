package com.timothyking.beeradvisor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tking on 4/16/2016.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("Amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
            brands.add("Yo Mamma");
        } else if (color.equals("Orange")) {
            brands.add("Blue (yuck) Moon");
            brands.add("IPA");
        } else if (color.equals("Light")) {
            brands.add("Coors");
            brands.add("Miller");
        } else if (color.equals("Dark")) {
            brands.add("Guiness");
            brands.add("Negra Modelo");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
