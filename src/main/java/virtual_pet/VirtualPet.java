// Can't figure out getters and tick.

public class VirtualPet {
    private int hungerLevel;
    private int thirstLevel;
    private int sleepLevel;
    private int playLevel;
    private int tick;




    // Constructor
    public VirtualPet(int tick, int initialHungerLevel, int initialThirstLevel, int initialSleepLevel,
                      int initialPlayLevel) {
        this.tick = tick;
        this.hungerLevel = initialHungerLevel;
        this.thirstLevel = initialThirstLevel;
        this.sleepLevel = initialSleepLevel;
        this.playLevel = initialPlayLevel;


    }

    // Getters
    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {

        return thirstLevel;
    }

    public int getSleepLevel() {

        return sleepLevel;
    }

    public int getPlayLevel() {

        return playLevel;
    }

    public void tick(int amountToIncreaseInitialLevel) {

        tick += amountToIncreaseInitialLevel;
    }
}

