package Patterns;

// Output:

//     *****
//    *   *
//   *   *
//  *   *
// *****

public class PrintHollowRhombus {
    public static void main(String[] arg){
        int n = 5;
        
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars - hollow rectangle
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
