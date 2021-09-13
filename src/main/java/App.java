import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("What is the second number? ");
        int y = Integer.parseInt(scanner.nextLine());
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y;
        System.out.println(String.format("%s + %s = %s\n%s - %s = %s\n%s * %s = %s\n%s / %s = %s",
                x, y, sum, x, y, difference, x, y, product, x, y, quotient));

    }
}
