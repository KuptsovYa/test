package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Master2 another commit");
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("aaa");
        listOfStrings.add("aaa");
        listOfStrings.add("aaa");
        listOfStrings.add("aaa");
        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i).charAt(i));
        }
    }
}
