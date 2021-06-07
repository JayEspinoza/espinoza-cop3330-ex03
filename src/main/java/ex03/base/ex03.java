/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 3 - Printing Quotes
 *  Create a program that prompts for a quote and an author.
 *  Display the quotation and author as shown in the example output.
 *
 *  Constraint:
 *  Use a single output statement to produce this output,
 *  using appropriate string-escaping techniques for quotes.
 *  If your language supports string interpolation or string substitution,
 *  don’t use it for this exercise. Use string concatenation instead.
 *
 */

package ex03.base;
import java.util.Scanner;

public class ex03 {
    public static void main(String [] args)
    {
        // Variable initialization
        Scanner userInput = new Scanner(System.in);
        String quote;
        String quotePerson;
        String output;

        // User Input Step
        System.out.printf("What is the quote? ");
        quote = userInput.nextLine();

        System.out.printf("Who said it? ");
        quotePerson = userInput.nextLine();

        // String concatenation
        output = quotePerson + " says, \"" + quote + "\"";
        System.out.printf(output);
    }
}
