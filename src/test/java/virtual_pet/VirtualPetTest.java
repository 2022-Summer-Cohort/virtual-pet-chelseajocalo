package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {

    @Test
    public void shouldReturnNameWhenAskedForName(){
        VirtualPet underTest = new VirtualPet("Lollipop",3,4,5);
        String result = underTest.getName();
        assertEquals("Lollipop", result);
    }

    @Test
    public void shouldReturnThreeWhenAskedForThirstLevel() {
        VirtualPet underTest = new VirtualPet("Lollipop", 3,4,5);
        underTest.getThirstLevel();
        assertEquals(3, underTest.getThirstLevel());
    }

    @Test
    public void thirstLevelShouldDecreaseWhenWatered(){
        VirtualPet underTest = new VirtualPet("Lollipop", 3, 4, 5);
        underTest.giveDrink();
        assertEquals(1, underTest.getThirstLevel());
    }

    @Test
    public void hungerLevelShouldDecreaseWhenFed() {
        VirtualPet underTest = new VirtualPet("Lollipop", 3,4,5);
        underTest.feed();
        assertEquals(3, underTest.getHungerLevel());
    }
    @Test
    public void levelsShouldIncreaseAfterTick() {
        VirtualPet underTest = new VirtualPet("Lollipop", 3,4,5);
        underTest.tick();
        assertTrue(underTest.getThirstLevel() > 3);
        assertTrue(underTest.getBoredomLevel()>5);
        assertTrue(underTest.getHungerLevel()>4);
    }

}
