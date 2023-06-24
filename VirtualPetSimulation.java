import java.util.Random;
import java.util.Scanner;

public class VirtualPetSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your pet's name: ");
        String petName = scanner.nextLine();
        VirtualPet pet = new VirtualPet(petName);

        System.out.println("Welcome to the Virtual Pet Simulator!");
        System.out.println("You adopted a pet named " + pet.getName());

        while (true) {
            pet.displayStats();

            System.out.println("What would you like to do? (feed/play/sleep/quit)");
            String action = scanner.nextLine();

            if (action.equals("feed")) {
                pet.feed();
                System.out.println("You fed " + pet.getName() + ".");
            } else if (action.equals("play")) {
                pet.play();
                System.out.println("You played with " + pet.getName() + ".");
            } else if (action.equals("sleep")) {
                pet.sleep();
                System.out.println(pet.getName() + " went to sleep.");
            } else if (action.equals("quit")) {
                System.out.println("Thank you for playing!");
                break;
            } else {
                System.out.println("Invalid action. Please try again.");
            }

            pet.tick();
        }

        scanner.close();
    }}