package lab_4;

import java.util.Scanner;

public class BandBoosterSales {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        // Read the names of the two band boosters
        System.out.print("Enter the name of the first band booster: ");
        String name1 = input.nextLine();
        System.out.print("Enter the name of the second band booster: ");
        String name2 = input.nextLine();

        // Create BandBooster objects
        BandBooster booster1 = new BandBooster(name1);
        BandBooster booster2 = new BandBooster(name2);

        // Loop to read sales data for 3 weeks
        for (int week = 1; week <= 3; week++) {
            System.out.println("\nWeek " + week);

            // For booster1
            System.out.print("Enter the number of boxes sold by " + booster1.getName() + " this week: ");
            int sales1 = input.nextInt();
            booster1.updateSales(sales1);

            // For booster2
            System.out.print("Enter the number of boxes sold by " + booster2.getName() + " this week: ");
            int sales2 = input.nextInt();
            booster2.updateSales(sales2);
        }

        // After 3 weeks, print the total sales for both boosters
        System.out.println("\nTotal sales for both boosters:");
        System.out.println(booster1);  // Implicitly calls toString()
        System.out.println(booster2);  // Implicitly calls toString()

        input.close();
    }
}