package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.gameLoop();

    }

    public void gameLoop() {
        Scanner input = new Scanner(System.in);
        VirtualPet lollipop = new VirtualPet("Lollipop", 3, 4, 5);
        lollipop.greeting();


        do  {
            lollipop.status();
            System.out.println("What would you like to do next? Type feed, drink, or play. Press Q at any time to quit. Type status to see what I need.");
            String task = input.nextLine();
            if(task.equalsIgnoreCase("Q")) {
                lollipop.quitGame();
                break;
            }
            if (task.equals("feed")) {
                lollipop.feed();
            }
            if (task.equals("drink")) {
                lollipop.giveDrink();
            }
            if (task.equals("play")) {
                lollipop.play();
            }
            if(lollipop.tooBored()) {
                String bored = input.nextLine();
                if (bored.equals("play")) {
                    lollipop.tick();
                    lollipop.play();
                    continue;
                }
                else if (!bored.equals("play")) {
                    System.out.println("No. I want to play.");
                    lollipop.tickNoPlay();
                    continue;

                }
                break;
                }

            lollipop.tick();
        }
        while(lollipop.isAlive());
        if(!lollipop.isAlive()) {
            System.out.println("Your pet is dead.");
        }
        
        }




    }

