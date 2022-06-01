package virtual_pet;

public class VirtualPet {

    private String name;
    private int thirstLevel;
    private int hungerLevel;
    private int boredomLevel;

    public VirtualPet(String name, int thirstLevel, int hungerLevel, int boredomLevel) {
        this.name = name;
        this.thirstLevel = thirstLevel;
        this.hungerLevel = hungerLevel;
        this.boredomLevel = boredomLevel;
    }
// put three 3 methods
    public boolean tooHungry() {
        if(getHungerLevel()>=5) {
            return true;
        }
        return false;
    }
    public void play(){
        boredomLevel -=2;
        System.out.println("Thanks for playing with me.");
    }
    public boolean tooBored() {
        if(getBoredomLevel()>=4) {
            System.out.println("I'm too bored. Play with me.");
            return true;
        }
        return false;
    }
    public boolean isAlive() {
        if(getThirstLevel() > 8) {
            return false;
        }
        else if(getHungerLevel() > 10) {
            return false;
        }
        else if(getBoredomLevel() > 15) {
            return false;
        }
        return true;
    }
    public void greeting(){
        System.out.println("Hello! My name is " + name + ". Please take care of me!");
    }
    public void feed() {
        hungerLevel -= 2;
        System.out.println("Thanks for the snack.");
    }
    public void giveDrink() {
        thirstLevel -= 2;
        System.out.println("Thanks for the drink.");
    }
    //tick method
    public void tick() {
        thirstLevel += 1;
        hungerLevel += 1;
        boredomLevel += 1;
        if(getHungerLevel()>=7) {
            System.out.println("Your pet ate your shoes. Try to feed him sooner next time.");
            hungerLevel = hungerLevel - 3;
        }
    }

    //getter methods
    public String getName() {
        return name;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }
    public void quitGame() {
        System.out.println("Thanks for playing! Goodbye!");
    }

    public void status() {
        System.out.print("Boredom Level = " + getBoredomLevel() + ".");
        System.out.print(" Hunger Level = " + getHungerLevel() + ".");
        System.out.println(" Thirst Level = " + getThirstLevel() + ".");
    }

    public void tickNoPlay() {
        thirstLevel += 1;
        hungerLevel += 1;

    }
}
