package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Options.showOptions;

public class Game {

//future update: life bar

    Character BearGrills = new Character();


    //run game with start and eng game functions

    public void startgame(){
        String[] options = {"1. Spear " , "2. Matches", "3. Java Handbook"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your in a deserted island. Pick one item.");

        int option = 1;

        if (option!=3) {
            showOptions(options);
            try {
                option = scanner.nextInt();
                updateItem(option);

            }
            catch (InputMismatchException exception){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
            catch (Exception exception){
                System.out.println("Something unexpected has happened. Please try again");
                scanner.next();
            }
        }

    }

    private void updateItem(int option){
        if (option == 1){
            BearGrills.setItem("Spear");
            System.out.println("You picked " + BearGrills.getItem());
        }
        if(option == 2){
            BearGrills.setItem("Matches");
            System.out.println("You picked " + BearGrills.getItem());
        }
        if (option == 3){
            BearGrills.setItem("Java Handbook");
            System.out.println("You picked " + BearGrills.getItem());

        }

    }

    public void pickDirection(){
        String[] options = {"1. Into the Jungle " , "2. Up the rocks", "3. Along the beach"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where do you want to go?");

        int option = 1;



        if (option!=3) {
            showOptions(options);
            try {
                option = scanner.nextInt();
                updateLocation(option);
            }
            catch (InputMismatchException exception){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
            catch (Exception exception){
                System.out.println("Something unexpected has happened. Please try again");
                scanner.next();
            }
        }
    }

    private void updateLocation(int option) {
        if(option==1){
            BearGrills.setLocation("Jungle");
            System.out.println("You picked " + BearGrills.getLocation());

            endGameJungle();

        }
        if(option==2){
            BearGrills.setLocation("Rocks");
            System.out.println("You picked " + BearGrills.getLocation());

            endGameRocks();
        }
        if(option==3){
            BearGrills.setLocation("Beach");
            System.out.println("You picked " + BearGrills.getLocation());
            endgameBeach();

        }
    }

    private void endgameBeach() {
        System.out.println("You stayed by the beach, and you found drift woods.");
        if(BearGrills.getItem().equals("Matches")){
            System.out.println("Lucky you had a matches! You lit a big fire and got help!");
        }
        else {
            System.out.println("Unlucky you don't have matches to light a fire...It got a bit cold at night.");
        }
    }

    private void endGameRocks() {
        System.out.println("You started to climb up the rocks but you fell...");
        if(BearGrills.getItem().equals("Java Handbook")){
            System.out.println("Lucky you had a Java Handbook, it protected your head from the fall!");
        }
        else {
            System.out.println("Unlucky you don't have a Java Handbook... You died on impact...");
        }
    }

    private void endGameJungle(){
        System.out.println("You went into the jungle and came across a giant snake.");
        if(BearGrills.getItem().equals("Spear")){
            System.out.println("Lucky you had a spear! You killed the snake and survived!");
        }
        else {
            System.out.println("Unlucky you don't have a spear to fight the snake and you died...");
        }
    }

}
