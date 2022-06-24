package virtual_pet;

public abstract class VirtualPet {

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
    public void status() {
        System.out.print(name + ": ");
        System.out.print("Boredom Level = " + getBoredomLevel() + ".");
        System.out.print(" Hunger Level = " + getHungerLevel() + ".");
        System.out.println(" Thirst Level = " + getThirstLevel() + ".");
    }
    public void greeting(){
        System.out.println("Hello! My name is " + name + ". Please take care of me!");
    }

    public boolean tooBored() {
        if(getBoredomLevel()>=4) {
            return true;
        }
        return false;
    }
    public boolean isAlive() {
        if(getThirstLevel() > 8) {
            return false;
        }
        else if(getHungerLevel() > 15) {
            return false;
        }
        else if(getBoredomLevel() > 15) {
            return false;
        }
        return true;
    }

    public void feed() {
        hungerLevel -= 3;

    }
    public void giveDrink() {
        thirstLevel -= 2;

    }
    public void play(){
        boredomLevel -=2;
        hungerLevel +=1;

    }

    public void tick() {
        thirstLevel += 1;
        hungerLevel += 1;
        boredomLevel += 1;
        if(this.hungerLevel > 10) {
            System.out.println(this.getName() + " may need to be fed.");
        }
        if(this.thirstLevel > 8) {
            System.out.println(this.getName() + " may need a drink.");
        }
        }


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
    public void decreaseBoredomLevel(){
        boredomLevel--;
    }
    public void increaseHunger(){
        hungerLevel++;
    }

}
