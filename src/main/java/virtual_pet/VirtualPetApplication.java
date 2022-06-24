package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.gameLoop();

    }

    public void gameLoop() {
        Scanner input = new Scanner(System.in);
        VirtualPet lollipop = new RoboticDog("Lollipop",1,2,3,100.0,10);
        VirtualPet buddy = new OrganicDog("Buddy", 3, 2,1,0);
        VirtualPet elphie = new OrganicCat("Elphie",  1, 4, 2,1);
        VirtualPet penny = new RoboticCat("Penny", 1,2,3,100.00,10);
        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.surrenderPet(lollipop);
        myShelter.surrenderPet(buddy);
        myShelter.surrenderPet(elphie);
        myShelter.surrenderPet(penny);


        while (myShelter.shelterIsOpen()) {
            myShelter.welcomeMenu();
            String ask = input.nextLine();
            if (ask.equalsIgnoreCase("adopt")) {
                myShelter.adopt();
                break;
            }
            if (ask.equalsIgnoreCase("surrender")) {
                myShelter.surrender();
                
                break;
            }
            if(ask.equalsIgnoreCase("q")){
                myShelter.quitGame();
                break;
            }
            if (ask.equalsIgnoreCase("volunteer")) {

                myShelter.petsStatus();
                for (int i = 0; i < 20; i++) {
                    String task = input.nextLine();
                    if (task.equals("feed")) {
                        System.out.println("Who would you like to feed? Type a pet's name or all.");
                        String feedWho = input.nextLine();
                        if (feedWho.equalsIgnoreCase("all")) {
                            myShelter.feedAllPets();
                        } else {
                            myShelter.feedOnePet(feedWho);
                        }
                        myShelter.petsStatus();
                    }
                    if (task.equals("drink")) {
                        System.out.println("Which pet are you watering? Type all or type one pet's name.");
                        String waterWho = input.nextLine();
                        if (waterWho.equalsIgnoreCase("all")) {
                            myShelter.drinkAllPets();
                        } else {
                            myShelter.waterOnePet(waterWho);
                        }
                        myShelter.petsStatus();
                    }
                    if (task.equals("play")) {
                        System.out.println("Who do you want to play with? Type all or type one pet's name.");
                        String playWho = input.nextLine();
                        if(playWho.equalsIgnoreCase("all")) {
                            myShelter.playAllPets();
                        }
                        else {
                            myShelter.playOnePet(playWho);
                        }
                        myShelter.petsStatus();
                    }
                    if (task.equals("status")) {
                        myShelter.petsStatus();
                    }
                    if (task.equalsIgnoreCase("Q")) {
                        myShelter.quitGame();
                        break;
                    }
                    if (i == 19) {
                        System.out.println("We appreciate your help today! Come back and volunteer anytime!");
                        break;
                    }
                    myShelter.petsTick();
                    myShelter.petsPlayTogether();
                }


            }


        }


    }

}






