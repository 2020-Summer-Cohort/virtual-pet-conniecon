// I'm not finished here either. I feel like I'm not getting how it all connects together.
// I don't really like the direction I took here but I was trying a simple minimalist approach.
// Instead of starting with testing maybe i should have written out what i wanted first. I used the
// Atm as a blueprint and then I thought I would change things as I went along. 

package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet myPet = new VirtualPet(5, 3, 8, 3, 8);

        System.out.println("Welcome to my Virtual Pet game");
        System.out.println("Bebe is a cat and she's ready to play the game");
        System.out.println("What do you want to do?");
        System.out.println("Press 1 to feed Bebe");
        System.out.println("Press 2 to water Bebe");
        System.out.println("Press 3 to play Bebe");
        System.out.println("Press 4 to put Bebe to sleep");
        System.out.println("Press 5 to end game");
        String userChoice = input.nextLine();

        while (!userChoice.equals("5")) {
            if (userChoice.equals("1")) {
                System.out.println("Bebe is eating and is no longer hungry");
                myPet.getHungerLevel();
            } else if (userChoice.equals("2")) {
                System.out.println("Bebe is drinking");
                myPet.getThirstLevel();
            } else if (userChoice.equals("3")) {
                System.out.println("Bebe is playing");
                myPet.getPlayLevel();
            } else if (userChoice.equals("4")) {
                System.out.println("Bebe is sleeping");
                myPet.getSleepLevel();
            } else {
                System.out.println("I'm sorry Bebe does not understand...");
            }


            System.out.println("What do you want to do?");
            System.out.println("Press 1 to feed Bebe");
            System.out.println("Press 2 to water Bebe");
            System.out.println("Press 3 to play Bebe");
            System.out.println("Press 4 to put Bebe to sleep");
            System.out.println("Press 5 to end game");
            userChoice = input.nextLine();


        }
        System.out.println("Thanks for playing");
    }
}
}
