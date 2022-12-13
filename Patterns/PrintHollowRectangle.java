package Patterns;

// Output: 4 rows * 5 columns
// *****
// *   *
// *   *
// *****

public class PrintHollowRectangle {
    public static void main(String[] arg){
        int rows = 4;
        int columns = 5;
        for(int i=1; i<=rows; i++){
            for(int j = 1; j<=columns; j++){
                if(i == 1 || i == rows || j == 1 || j == columns){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}