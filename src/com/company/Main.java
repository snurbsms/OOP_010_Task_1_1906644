package com.company;

import java.util.Scanner; // Importing the Scanner for text input

public class Main {

    public static void main(String[] args) {

        Scanner stringInput = new Scanner(System.in); // Creation of the scanner object

        System.out.println("Enter a string!"); // Initiates the text input

        String yourString = stringInput.nextLine(); // Takes user input and places it into yourString
        String revString = ""; // Creates the final reversed string

        for(int i = yourString.length() -1; i>=0; i--){ // Takes the length of users string, inputs each letter into reversed string. So the final letter will be first and it will progress until no characters are left.
            revString = revString + yourString.charAt(i);
        }

        System.out.println(revString); // Displays reversed string
    }
}
