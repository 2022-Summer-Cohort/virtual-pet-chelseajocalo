package virtual_pet;

import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {

    @Test
    public void adoptRemovesPet(){
        VirtualPet testPet1 = new VirtualPet("test1", "" ,3,4,5);
        VirtualPet testPet2 = new VirtualPet("test2","",3,4,5);
        VirtualPet testPet3 = new VirtualPet("test3","",3,4,5);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.surrenderPet(testPet1);
        underTest.surrenderPet(testPet2);
        underTest.surrenderPet(testPet3);
        underTest.adoptPet(testPet1.getName());
        assertFalse(underTest.getPetsInShelter().contains(testPet1));
    }

    @Test
    public void surrenderAddsPet() {
        VirtualPet testPet1 = new VirtualPet("test1","", 3,4,5);
        VirtualPet testPet2 = new VirtualPet("test2","",3,4,5);
        VirtualPet testPet3 = new VirtualPet("test3","",3,4,5);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.surrenderPet(testPet1);
        assertTrue(underTest.getPetsInShelter().contains(testPet1));
    }

    @Test
    public void hungerDecreasesWhenFeedAllAnimals() {
        VirtualPet testPet1 = new VirtualPet("test1","", 3,4,5);
        VirtualPet testPet2 = new VirtualPet("test2", "",2,3,4);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.surrenderPet(testPet1);
        underTest.surrenderPet(testPet2);
        underTest.feedAllPets();
        assertTrue(underTest.getPetsHungerLevel(testPet1) < 4 && underTest.getPetsHungerLevel(testPet2) < 3);
    }
}
