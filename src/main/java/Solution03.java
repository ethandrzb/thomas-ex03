/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 3
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

// Pseudocode Solution
// Prompt user for a quote
// Store user input in variable <quote>
// Prompt user for who said the quote
// Store user input in variable <speaker>
// Print <speaker> says, "<quote>"

public class Solution03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = sc.nextLine();

        System.out.print("Who said it? ");
        String speaker = sc.nextLine();

        System.out.println(speaker + " says, \"" + quote + '\"');

        System.exit(0);
    }
}
