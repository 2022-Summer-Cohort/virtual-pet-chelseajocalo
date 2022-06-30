package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking{
    public OrganicDog(String name, int thirstLevel, int hungerLevel, int boredomLevel, int soilingRate) {
        super(name, thirstLevel, hungerLevel, boredomLevel, soilingRate);
    }

    @Override
    public void walking() {
        decreaseBoredomLevel();
        decreaseSoilingRate();
    }
    public void cleanCage(){
        decreaseSoilingRate();
        System.out.println("Thanks for cleaning my cage!");
    }
}
