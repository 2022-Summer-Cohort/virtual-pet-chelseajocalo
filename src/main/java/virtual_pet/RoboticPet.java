package virtual_pet;

public abstract class RoboticPet extends VirtualPet{
    private double batteryLevel;
    private int oilLevel;

    public RoboticPet(String name, int thirstLevel, int hungerLevel, int boredomLevel, double batteryLevel, int oilLevel) {
        super(name, thirstLevel, hungerLevel, boredomLevel);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }
    public void chargeBattery(){
        batteryLevel = 100;
    }

    public int getOilLevel() {
        return oilLevel;
    }
    public void decreaseOil(){
        oilLevel--;
    }
    public void decreaseBatteryLevel(){
        batteryLevel*=.95;
    }
    public void oilPets(){
        oilLevel = 10;
    }
}
