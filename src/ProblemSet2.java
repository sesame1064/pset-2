/**
 * Problem Set 2.
 * 
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         * 
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

        // //prompt
        System.out.print("Enter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        System.out.print("Enter your grade: ");
        int grade = in.nextInt();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter your hometown: ");
        String hometown = in.next();
        //results
        System.out.print("\nNAME      : " + firstName + " " + lastName + "\n");
        System.out.print("GRADE     : " + grade + "\n");
        System.out.print("AGE       : " + age + "\n");
        System.out.print("HOMETOWN  : " + hometown + "\n");
        
        /*
         * Exercise 2.
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
        final double DOLLAR = 1.00;
        final double QUARTER = 0.25;
        final double DIME = 0.10;
        final double NICKEL = 0.05;
        final double PENNY = 0.01;

        System.out.print("Enter a dollar amount: ");
        double amount = in.nextDouble();

        int dollarAmt = (int)  Math.floor(amount/DOLLAR);
        double change = amount % DOLLAR;
        int quarterAmt = (int) Math.floor(change/QUARTER);
        change %= QUARTER;
        int dimeAmt = (int) Math.floor(change/DIME);
        change %= DIME;
        int nickelAmt = (int) Math.floor(change/NICKEL);
        change %= NICKEL;
        int pennyAmt = (int) Math.floor(change/PENNY);

        System.out.println("DOLLARS  : " + dollarAmt);
        System.out.println("QUARTERS : " + quarterAmt);
        System.out.println("DIMES    : " + dimeAmt);
        System.out.println("NICKElS  : " + nickelAmt);
        System.out.println("PENNY    : " + pennyAmt);

        /*
         * Exercise 3.)
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */
        final double TEN_DOLLAR = 10.00;
        final double FIVE_DOLLAR = 5.00;

        System.out.print("Enter a dollar amount: ");
        double amount2 = in.nextDouble();

        int tenDollarAmt = (int) Math.floor(amount2/TEN_DOLLAR);
        change = amount2 % TEN_DOLLAR;

        int fiveDollarAmt = (int) Math.floor(change / FIVE_DOLLAR);
        change %= FIVE_DOLLAR;
        
        int dollarAmt2 = (int) Math.floor(change / DOLLAR);
        change %= DOLLAR;

        int quarterAmt2 = (int) Math.floor(change/ QUARTER);
        change %= QUARTER;

        int dimeAmt2 = (int) Math.floor(change / DIME);
        change %= DIME;

        int nickelAmt2 = (int) Math.floor(change / NICKEL);
        change %= NICKEL;

        int pennyAmt2 = (int) Math.floor(change / PENNY);
        

        int bills = tenDollarAmt + fiveDollarAmt + dollarAmt2;
        System.out.println("\nBILLS  : " + bills);

        int coins = quarterAmt2 + dimeAmt2 + nickelAmt2 + pennyAmt2;
        System.out.println("COINS  : " + coins);




        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */
        final int MILE_INCH = 63360;
        final int YARD_INCH = 36;
        final int FEET_INCH = 12;

        System.out.print("Enter a number of inches: ");
        double givenLength = in.nextDouble();

        int mile = (int) Math.floor(givenLength / MILE_INCH);
        double leftOver = givenLength % MILE_INCH;
        
        int yard = (int) Math.floor(leftOver / YARD_INCH);
        leftOver %= YARD_INCH;

        int feet = (int) Math.floor(leftOver / FEET_INCH);
        int inch = (int) leftOver % 1;
         
        System.out.println("MILES: " + mile);
        System.out.println("YARDS:" + yard );
        System.out.println("FEETS: " + feet);
        System.out.println("INCHES :" + inch);
      
        




        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        

        
        /*
         * Exercise 6.
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        


        /*
         * Exercise 7.
         * 
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
        

        
        /*
         * Exercise 8.
         * 
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
        

        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        

        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        

        
        in.close();
    }
}