package virtual_pet;

public abstract class OrganicPet extends VirtualPet {

    private int soilingRate;

    public OrganicPet(String name, int thirstLevel, int hungerLevel, int boredomLevel, int soilingRate) {
        super(name, thirstLevel, hungerLevel, boredomLevel);
        this.soilingRate = soilingRate;
    }

    public boolean isCleaningRequired() {
        return soilingRate >= 5;
    }

    public int getSoilingRate() {
        return soilingRate;
    }
    public void decreaseSoilingRate(){
        soilingRate-=2;
    }
    public void status() {
        System.out.print(getName() + ":");
        System.out.print(" Hunger Level: " + getHungerLevel() + " ");
        System.out.println("Boredom Level: " + getBoredomLevel());
        if (getSoilingRate() >= 4) {
            System.out.println("Please clean the pet cages.");
        }
    }
    public void availablePets() {
        System.out.print(getName() + ":");
        System.out.print(" Hunger Level: " + getHungerLevel() + " ");
        System.out.println("Boredom Level: " + getBoredomLevel());
    }

    public void play(){
        decreaseBoredomLevel();
        decreaseSoilingRate();
    }

}
