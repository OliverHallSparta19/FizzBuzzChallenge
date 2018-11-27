package FIZZBUZZ;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Fizz go = new Fizz();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Fizz Number: ");
        int number1 = reader.nextInt();
        System.out.println("Enter Buzz Number: ");
        int number2 = reader.nextInt();
        System.out.println("Enter Max Number Count: ");
        int upuntil = reader.nextInt();
        go.Start2(number1, number2, upuntil);
    }
}
