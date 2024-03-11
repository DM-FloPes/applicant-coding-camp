package dm.applicantcodingcamp.bikerental.console;

import dm.applicantcodingcamp.bikerental.model.Bike;
import dm.applicantcodingcamp.bikerental.storage.MemoryStorage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

@Component
public class ConsoleRunner implements CommandLineRunner {

    private final MemoryStorage memoryStorage;

    public ConsoleRunner(MemoryStorage memoryStorage) {
        this.memoryStorage = memoryStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        String[] options = {"1- Show all bike status",
                "2- Rent new bike",
                "3- Return rented bike",
                "4- Exit",
        };
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        while (option!=4){
            printMainMenu(options);
            option = scanner.nextInt();
            switch (option){
                case 1: showAllBikeStatus(); break;
                case 2: rentBike(); break;
                case 3: returnBike(); break;
                case 4: exit(0);
            }
        }
    }

    public void returnBike() {
        out.println("Choose bike to return");
        List<Bike> bikes = new LinkedList<>(memoryStorage.getBikes());
        out.println("0: Return");
        for (int idx = 0; idx < memoryStorage.getBikes().size(); idx++) {
            Bike bike = bikes.get(idx);
            if (bike.rented) {
                out.println((idx + 1) + ": " + bikes.get(idx));
            }
        }
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=0){
            option = scanner.nextInt();
            if (option == 0) {
                return;
            }
            if (option >= bikes.size() || option < 0) {
                out.println("Please choose a valid option");
                continue;
            }
            Bike bike = bikes.get(option);
            bike.rented = false;
            out.println("Returned bike: " + bike);
            break;
        }
    }

    private void rentBike() {
        out.println("Choose bike to rent");
        List<Bike> bikes = new LinkedList<>(memoryStorage.getBikes());
        out.println("0: Return");
        for (int idx = 0; idx <= memoryStorage.getBikes().size(); idx++) {
            out.println((idx + 1) + ": " + bikes.get(idx));
        }
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=0){
            option = scanner.nextInt();
            if (option == 0) {
                return;
            }
            if (option > bikes.size() || option < 0) {
                out.println("Please choose a valid option");
                continue;
            }
            Bike bike = bikes.get(option);
            bike.rented = true;
            out.println("Rented bike: " + bike);
            break;
        }
    }

    void showAllBikeStatus() {
        for (Bike bike :  MemoryStorage.get().getBikes()) {
            out.println(bike);
        }
    }

    static void printMainMenu(String[] options){
        for (String option : options){
            out.println(option);
        }
        out.print("Choose your option : ");
    }
}
