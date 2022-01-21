package com.sda.weather.userinterface;

import com.sda.weather.entity.Location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {

    public ArrayList<Location> locations = new ArrayList<>();

    public void run() {
        System.out.println("Weather App is running");
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Witaj w App");
            System.out.println("1. Dodaj nową lokalizację");
            System.out.println("2. Wyświetl lokalizację");
            System.out.println("3. Podaj informacje pogodowe");
            System.out.println("0. Wyjść z aplikacji");

            int decision = keyboard.nextInt();

            switch(decision) {
                case 1:
                    addLocalization();
                    break;
                case 2:
                    getAllLocalizations();
                    break;
                case 3:
                    getWeatherInfo();
                    break;
                case 0:
                    return;

            }

        }

    }
    private void addLocalization(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Aby dodać nową lokalizację podaj: ");

        System.out.println("miasto");
        String city = keyboard.next();

        System.out.println("kraj");
        String country = keyboard.next();

        System.out.println("szerokość geograficzna");
        float latitude = keyboard.nextFloat();

        System.out.println("wysokość geograficzna");
        float longitude = keyboard.nextFloat();

        locations.add(new Location(city, longitude, latitude,  country));


    }
    private void getAllLocalizations(){


     //   for (int i = 0; i < locations.size(); i++) {
            System.out.println(locations);
      //  }
    }
    private void getWeatherInfo() {


    }
}
