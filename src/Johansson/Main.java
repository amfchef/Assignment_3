package Johansson;
import java.util.Scanner;
/**
 *
 * Prime numbers. Write a program that prompts the user for an integer and then
 * prints out all prime numbers up to that integer. For example, when the user
 * enters 20, the program should print 2 3 5 7 11 13 17 19 Recall that a number
 * is a prime number if it is not divisible by any number except 1 and itself.
 *
 * @version 02-10-2020
 * @author Jakob Johansson <a href = "jakobtj@hotmail.com">jakobtj@hotmail.com</a>
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int checkPrimeNumb = 0;
        System.out.print("Please enter a maximum number of primenumber you would like to print out: ");

        try {
            checkPrimeNumb = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Error\nInvalid format\nYou have to enter a number");
            System.exit(0);

        }
        scan.close();
        String primeNumbers = "";
        if (checkPrimeNumb <= 1) {
            System.out.println("The maximum value you entered is too low");
            System.exit(0);
        } else {
            for (int i = 2; i <= checkPrimeNumb; i++) {
                int counter = 0;
                for (int j = i; j >= 1; j--) {
                    if (i % j == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {

                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out
                    .println("Prime numbers with the maximum of " + checkPrimeNumb + " is the below:\n" + primeNumbers);
        }
        System.exit(0);
    }
}