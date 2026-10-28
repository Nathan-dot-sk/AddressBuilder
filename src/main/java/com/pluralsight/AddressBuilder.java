package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] address = new String[9];

        System.out.print("Full name: ");
        address[0] = scanner.nextLine();

        System.out.print("Billing Street: ");
        address[1] = scanner.nextLine();

        System.out.print("Billing City: ");
        address[2] = scanner.nextLine();

        System.out.print("Billing State: ");
        address[3] = scanner.nextLine();

        System.out.print("Billing Zip: ");
        address[4] = scanner.nextLine();

        System.out.print("Shipping Street: ");
        address[5] = scanner.nextLine();

        System.out.print("Shipping City: ");
        address[6] = scanner.nextLine();

        System.out.print("Shipping State: ");
        address[7] = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        address[8] = scanner.nextLine();

        String customerInfo = address[0] + "\n" +
                "Billing Address:\n" +
                address[1] + "\n" +
                address[2] + ", " +
                address[3] + " " +
                address[4] + "\n" +
                "Shipping Address:\n" +
                address[5] + "\n" +
                address[6] + ", " +
                address[7] + " " +
                address[8] + "\n";

        System.out.println("\n" + customerInfo);

        scanner.close();
    }
}

