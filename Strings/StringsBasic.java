package Strings;

// Input
// This is string basics

// Output
// This is string basics
// This is string basics
// The lenght of string is: 21
// Rishav Raj
// Character at index 0 is: R

import java.util.*;

public class StringsBasic {
    public static void main(String args[]){
        
        // Representation and Declaration of String
        String str = "abc";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        // Input and Output in String
        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next(); // Input: Rishav Raj Output: Rishav
        name = sc.nextLine(); // Input: Rishav Raj Output: Rishav Raj
        System.out.println(name);

        // String length
        // => Since String is class here, special function such as length is defined including space

        System.out.println("The lenght of string is: "+name.length()); // Output : Length of text

        // String Concatenate => Add two or more strings
        String firstName = "Rishav";
        String lastName = "Raj";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        // CharAt function in String
        System.out.println("Character at index 0 is: "+ fullName.charAt(0));
    }
}
