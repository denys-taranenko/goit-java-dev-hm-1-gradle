package org.goit;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Denys", "Taranenko");

        String json = new Gson().toJson(person);

        System.out.println(json);
    }
}