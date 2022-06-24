package virtual_pet;

public class RoboticDog extends RoboticPet implements Walking{

    public RoboticDog(String name, int thirstLevel, int hungerLevel, int boredomLevel, double batteryLevel, int oilLevel) {
        super(name, thirstLevel, hungerLevel, boredomLevel, batteryLevel, oilLevel);
    }

    @Override
    public void walking() {
        decreaseBatteryLevel();
        decreaseOil();
        decreaseBoredomLevel();
        increaseHunger();
    }
}
