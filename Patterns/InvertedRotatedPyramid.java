package Patterns;

// Output:
//    *
//   **
//  ***
// ****

public class InvertedRotatedPyramid {
    public static void main(String[] arg){
        int n =4;

        for(int i=1; i<=n; i++){
            //to print space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //to print stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
