package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;


public class VirtualPetShelter {
    Scanner input = new Scanner(System.in);
    ArrayList<VirtualPet> petsInShelter = new ArrayList<>();

    public void adoptPet(String name) {
        for (VirtualPet thisPet : petsInShelter) {
            if (thisPet.getName().equalsIgnoreCase(name)) {
                petsInShelter.remove(thisPet);
                break;
            }
        }
    }

    public void adopt() {
        System.out.println("These are our available pets:");
        petsStatus();
        System.out.println("Enter the name of the pet you'd like to adopt.");
        String name = input.nextLine();
        adoptPet(name);
        System.out.println("We hope you and " + name + " are very happy together!😄");

    }
    public void volunteer() {
        System.out.println("Awesome! We are always looking for more volunteers. " +
                "Here are our current pets, you can play, feed, or give them a drink, depending on their needs. " +
                "If you would like an update on their status, type status.");
    }

    public void surrender() {
        System.out.println("I'm sorry to hear that. Please tell us the name of your pet.");
        String surrenderedPetName = input.nextLine();
        VirtualPet surrenderedPet = new VirtualPet(surrenderedPetName, "\uD83D\uDC31", 3, 4, 5);
        surrenderPet(surrenderedPet);
        System.out.println("We will take very good care of " + surrenderedPetName + ". ");
    }

    public void feedAllPets() {
        for (VirtualPet thisPet : petsInShelter) {
            thisPet.feed();
        }
    }

    public void playAllPets() {
        for (VirtualPet thisPet : petsInShelter) {
            thisPet.play();
        }

    }

    public void drinkAllPets() {
        for (VirtualPet thisPet : petsInShelter) {
            thisPet.giveDrink();
        }
    }

    public void petsStatus() {
        for (VirtualPet thisPet : petsInShelter) {
            thisPet.status();
        }
    }

    public void petsTick() {
        for (VirtualPet thisPet : petsInShelter) {
            thisPet.tick();
        }
    }

    public boolean shelterIsOpen() {
        if (petsInShelter.isEmpty()) ;
        return true;

    }

    public void quitGame() {
        System.out.println("Thanks for stopping by!");
    }

    public void surrenderPet(VirtualPet pet) {
        petsInShelter.add(pet);
    }

    public ArrayList<VirtualPet> getPetsInShelter() {
        return petsInShelter;
    }


    public int getPetsHungerLevel(VirtualPet name) {
        return name.getHungerLevel();
    }

    public void petsPlayTogether() {
        for (VirtualPet thisPet : petsInShelter) {
            if (thisPet.tooBored()) {
                thisPet.play();
            }
        }
    }

    public void feedOnePet(String name) {
        getPetByName(name).feed();
    }

    public VirtualPet getPetByName(String name) {
        for (VirtualPet thisPet : petsInShelter) {
            if (thisPet.getName().equalsIgnoreCase(name)) {
                return thisPet;
            }

        }
        return null;
    }

    public void welcomeMenu() {
        System.out.println("Thanks for coming to my pet shelter. ");
        System.out.println("Are you interested in adopting a pet? Type adopt. If you have a pet to surrender, type surrender.");
        System.out.println("If you'd like to volunteer to help with out pets, type volunteer.");
        System.out.println("To quit the game at any time, press q.");
    }

    public void waterOnePet(String name) {
        getPetByName(name).giveDrink();
    }

    public void playOnePet(String name) {
        getPetByName(name).play();
    }
}




