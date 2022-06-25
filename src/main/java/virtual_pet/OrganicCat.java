package virtual_pet;

public class OrganicCat extends OrganicPet implements ChasingBirds{
    public OrganicCat(String name, int thirstLevel, int hungerLevel, int boredomLevel, int soilingRate) {
        super(name, thirstLevel, hungerLevel, boredomLevel, soilingRate);
    }

    @Override
    public void chasingBirds() {
        decreaseBoredomLevel();
        decreaseSoilingRate();
        increaseHunger();
    }
    public void cleanLitter(){
        decreaseSoilingRate();
        System.out.println("Thank you for cleaning my litter box!");
    }
}
