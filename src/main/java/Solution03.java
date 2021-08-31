/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

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
    }
}
