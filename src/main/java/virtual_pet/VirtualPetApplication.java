package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.gameLoop();
        //Interact with a VirtualPet object in this method

    }

    public void gameLoop() {
        Scanner input = new Scanner(System.in);
        VirtualPet lollipop = new VirtualPet("Lollipop", 4, 5, 3);
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












//            String nextTask = input.nextLine();
//            while(lollipop.isAlive()) {
//                if(nextTask.equals("play")){
//                    lollipop.play();
//                    System.out.println("Thanks for playing.");
//                }
//                if(nextTask.equals("feed")) {
//                    lollipop.feed();
//                    System.out.println("Thanks for feeding me.");
//                }
//                if(nextTask.equals("drink")) {
//                    lollipop.giveDrink();
//                    System.out.println("Thanks for feeding me.");
//                }
//                if(lollipop.tooHungry()){
//                    System.out.println("I'm too hungry. Please feed me now.");
//                    String hungry = input.nextLine();
//                        if(!hungry.equals("feed")) {
//                            System.out.println("No. I asked for food.");
//                        }
//                        if(hungry.equals("feed")) {
//                            System.out.println("That's much better, thank you!");
//                            break;
//                        }
//                }
//            }



        }




    }

