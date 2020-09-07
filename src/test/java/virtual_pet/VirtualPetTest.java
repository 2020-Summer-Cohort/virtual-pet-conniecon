   // When i tried to do TDD it wouldn't work so I created another
   // virtual-pet to work on until I could figure out all the red
   // I'm not sure why it won't let me test but the other program
   // did. Its not done but I committed it anyway.

package virtual_pet;

import org.junit.Test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet(5, 5, 3,8,1);

    @Test
    public void isMyPetHungry() {
        // Arrange   1st VirtualPet is class 2nd VirtualPet is constructor
        //VirtualPet underTest = new VirtualPet(5, 5, 3,8,1);
        // Act
        int isHungry = underTest.getHungerLevel();
        // Assert
        assertThat(isHungry, is(5));
    }
    @Test
    public void isMyPetThirsty() {
        // Arrange
        //VirtualPet underTest = new VirtualPet(3,);
        // Act
        int isThirsty = underTest.getThirstLevel();
        // Assert
        assertThat(isThirsty, is(3));
    }

    @Test
    public void isMyPetSleepy() {
        // Arrange
        //VirtualPet underTest = new VirtualPet(8);
        // Act
        int isSleepy = underTest.getSleepLevel();
        // Assert
        assertThat(isSleepy, is(8));
    }

    @Test
    public void isMyPetPlaying() {
        // Arrange
        //VirtualPet underTest = new VirtualPet(1);
        // Act
        int isPlaying = underTest.getPlayLevel();
        // Arrange
        assertThat(isPlaying, is(1));
    }

    @Test
    public void ifMyPetIsEatingIncreaseInitialValueBy2() {
        // Arrange
        //VirtualPet underTest = new VirtualPet(5);
        // Act
        underTest.tick(1);
        int actualHungerLevel = underTest.getHungerLevel();
        // Assert
        assertThat(actualHungerLevel, is(7));
    }

    @Test
    public void ifMyPetIsDrinkingIncreaseInitialValueBy() {
        //VirtualPet underTest = new VirtualPet(3);
        underTest.tick(1);
        int actualThirstLevel = underTest.getThirstLevel();
        assertThat(actualThirstLevel, is(5));


    }

    @Test
    public void ifMyPetIsSleepingIncreaseInitialValueBy2() {
        //VirtualPet underTest = new VirtualPet(8);
        underTest.tick(2);
        int actualSleepLevel = underTest.getSleepLevel();
        assertThat(actualSleepLevel, is(10));
    }

    @Test
    public void ifMyPetIsPlayingIncreaseInitialValueBy2() {
        //VirtualPet underTest = new VirtualPet(1);
        underTest.tick(2);
        int actualSleepLevel = underTest.getSleepLevel();
        assertThat(actualSleepLevel, is(3));
    }

    @Test
    public void ifMyPetIsEatingDecreaseThirstLevelBy1() {

    }

    @Test
    public void ifMyPetIsPlayingDecreaseSleepLevelBy1() {

    }
}




}
