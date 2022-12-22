package Array;

import java.util.Scanner;

public class BasicsOfArray {
    
    public static void main(String[] arr){

        // Array Creation
        int marks[] = new int[10];

        // Input in Array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        
        
        // Output in Array
        System.out.println("Phy: "+marks[0] );
        System.out.println("Chem: "+marks[1] );
        System.out.println("Maths: "+marks[2] );

        // Length of Array
        System.out.println("Array length: "+ marks.length);

        // Output
        // Phy: 95  
        // Chem: 97 
        // Maths: 99
        // Array length: 10

    }
}
