import java.util.Random;
import java.util.Scanner;
public class VirtualPet {
    private String name;
    private int hunger;
    private int energy;
    private int happiness;


    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHappiness() {
        return happiness;
    }

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 0;
        this.energy = 100;
        this.happiness = 100;
    }

    public void feed() {
        hunger -= 10;
        energy -= 5;
        happiness += 5;
    }

    public void play() {
        hunger += 5;
        energy -= 10;
        happiness += 10;
    }

    public void sleep() {
        hunger += 5;
        energy += 20;
        happiness -= 5;
    }

    public String getMood() {
        if (happiness >= 80) {
            return "happy";
        } else if (happiness >= 50) {
            return "okay";
        } else {
            return "sad";
        }
    }

    public void tick() {
        Random rand = new Random();
        hunger += rand.nextInt(5) + 1;
        energy -= rand.nextInt(5) + 1;
        happiness -= rand.nextInt(5) + 1;
    }

    public void displayStats() {
        System.out.println("-----------------------------");
        System.out.println("Name: " + name);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness + " (" + getMood() + ")");
        System.out.println("-----------------------------");
    }
}

