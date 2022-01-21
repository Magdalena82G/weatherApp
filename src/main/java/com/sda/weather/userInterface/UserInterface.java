package com.sda.weather.userInterface; // todo rename to userinterface or forntend

import java.util.Scanner;

public class UserInterface {

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

            switch (decision) {
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

    private void addLocalization() {

    }

    private void getAllLocalizations() {

    }

    private void getWeatherInfo() {

    }
}
