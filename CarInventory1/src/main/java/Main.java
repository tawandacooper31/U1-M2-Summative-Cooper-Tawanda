import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> carMake = new ArrayList<>();
        ArrayList<String> carModel = new ArrayList<>();
        ArrayList<String> carColor = new ArrayList<>();
        ArrayList<String> carYear = new ArrayList<>();
        ArrayList<String> carMiles = new ArrayList<>();


        int removeCar;
        int updateCar;

        do {
                System.out.println("Enter your action? Type 1-4");
                System.out.println("1.Add a new car");
                System.out.println("2.Remove a car");
                System.out.println("3.Update a car");
                System.out.println("4.Print all cars");

                switch(action){
                    case "add":
                        do{

                        System.out.println("Enter the Make of the car you want to search");
                        car.make = scanner.next();

                            System.out.println("Enter the Model of the car you wish to search:");
                            car.model = scanner.next();


                            System.out.println("Enter the Color of the car you wish to search:");
                            car.color = scanner.next();


                            System.out.println("Enter the Year of the car you wish to search:");
                            car.year = scanner.nextInt();


                            System.out.println("Enter the Miles of the car you wish to Search:");
                            car.miles = scanner.nextInt();







                }
            }

        }
    }