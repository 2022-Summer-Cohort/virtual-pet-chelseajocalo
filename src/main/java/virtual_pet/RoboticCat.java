package virtual_pet;

public class RoboticCat extends RoboticPet implements ChasingBirds{
    public RoboticCat(String name, int thirstLevel, int hungerLevel, int boredomLevel, double batteryLevel, int oilLevel) {
        super(name, thirstLevel, hungerLevel, boredomLevel, batteryLevel, oilLevel);
    }

    @Override
    public void chasingBirds() {
        decreaseBatteryLevel();
        decreaseBoredomLevel();
        decreaseOil();
        increaseHunger();
    }
}
