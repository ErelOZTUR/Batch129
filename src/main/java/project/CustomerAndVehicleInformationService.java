package project;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerAndVehicleInformationService {
    static List<Vehicle> vehicleList = new ArrayList<>();

    public static VehicleRequest vehicleRequest() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please specify city:");
        String cityTakeOn = inp.nextLine();
        System.out.println("please enter the city you would like to return the vehicle to:");
        String cityDelivery = inp.nextLine();
        boolean isValid = false;
        LocalDate dateOfTake;
        LocalDate dateOfDelivery;
        LocalTime timeOfDelivery;

        do {
            isValid = false;
            System.out.println("Please specify date:\n" +
                    "Enter the date format as DD/MM/YYYY");
            dateOfTake = LocalDate.parse(inp.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("please enter the date you would like to return the vehicle :\n" +
                    "Enter the date format as DD/MM/YYYY");
            dateOfDelivery = LocalDate.parse(inp.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("please enter the time you would like to return the vehicle:\n" +
                    "Enter the time format as HH:mm");
            timeOfDelivery = LocalTime.parse(inp.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));
            long numberOfDaysToPay = ChronoUnit.DAYS.between(dateOfTake, dateOfDelivery);
            if (numberOfDaysToPay < 0) {
                System.out.println("the delivery day cannot be earlier than the day of receipt ");
                isValid = true;

            } else if (numberOfDaysToPay == 0) {
                System.out.println("a daily fee is charged for vehicles picked up and delivered on the same day");
            }
        } while (isValid);
        return new VehicleRequest(cityTakeOn, dateOfTake, dateOfDelivery, timeOfDelivery);
    }

    public static void createVehicle() {
        Vehicle vehicle1 = new Vehicle("Tesla", "S", "Electric", "Automatic", 200.0);
        Vehicle vehicle2 = new Vehicle("Audi", "R8", "Gas", "Manuel", 400.0);
        Vehicle vehicle3 = new Vehicle("Toyota", "Corolla", "Hybrid", "Automatic", 250.0);
        Vehicle vehicle4 = new Vehicle("BMW", "7.30L", "GAS", "Automatic", 379.9);
        Vehicle vehicle5 = new Vehicle("Mercedes", "S400", "Diesel", "Automatic", 370.0);

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);
    }

    public static void getVehicle() {
        System.out.println();
        System.err.println("**********   WELCOME TO QA-04 RENT A CAR  WEBSİTES **********");

        System.err.println("************************* OUR VEHICLES *************************");
        System.out.println();
        System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", "Make", "Model", "Fuel Type", "Transmission", "Daily fee");
        System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", "_____", "_____", "__________", "__________", "____________");
        for (Vehicle w : vehicleList) {

            System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n",
                    w.getMake(), w.getModel(), w.getFuelType(), w.getGear(), w.getdDailyfee());
        }

        Scanner inp = new Scanner(System.in);
        double price = 0;
        boolean isExist = false;
        do {
            System.out.println("Please enter vehicle make");
            String make = inp.nextLine();
            System.out.println("Please enter vehicle model");
            String model = inp.nextLine();

            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getMake().equals(make) && vehicle.getModel().equals(model)) {
                    System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", "Make", "Model", "Fuel Type", "Transmission", "Daily fee");
                    System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", "_____", "_____", "__________", "__________", "____________");
                    System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", vehicle.getMake(), vehicle.getModel(),
                            vehicle.getFuelType(), vehicle.getGear(), vehicle.getdDailyfee());
                    price = vehicle.getdDailyfee();
                    isExist = true;
                }
            }
            if (!isExist) System.out.println("There is no such vehicle in our fleet.");
        } while (!isExist);

        VehicleRequest vehicleRequest = vehicleRequest();
        long numberOfDaysToPay = ChronoUnit.DAYS.between(vehicleRequest.getRentDay(), vehicleRequest.getDeliveryDay());
        System.out.println(numberOfDaysToPay + " numberOfDaysToPay: " + (numberOfDaysToPay * price));
        System.out.println("press 1 for confirmation, press 2 for new selection , press any key to exit.");
        String choice = inp.next();
        if (choice.equals("1")) {
            customerInfo();
        } else if (choice.equals("2")) {
            getVehicle();
        } else System.out.println("Have a good day.");


    }

    public static void customerInfo() {
        Scanner inp = new Scanner(System.in);
        System.out.println("What is full name?:");
        String fullName = inp.nextLine();
        System.out.println("ID number:");
        String idNum = inp.next();
        System.out.println("Age:");
        String age = inp.next();
        inp.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = inp.nextLine();
        System.out.println("Full name: " + fullName + "\nID num: " + idNum + "\nAge: " + age + "\nPhoneNumber: " + phoneNumber);
        paymentInfo();
    }

    public static void paymentInfo() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Card Holder Full Name");
        String fullName = inp.nextLine();
        do {
            System.out.println("Card Number:");
            String cardNumber = inp.nextLine();
            if (cardNumber.replaceAll(" ", "").length() == 12) break;
            else System.out.println("Incorrect Card Number.");
        } while (true);
        System.out.println("Expiration Date: (MM/YY )");
        String expirationDate = inp.next();
        System.out.println("Security Code:");
        String securityCode = inp.next();

        System.out.println("Your payment is succesful. Have a good day:)");
    }
}
