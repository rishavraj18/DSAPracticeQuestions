package Patterns;

//     1
//    212
//   32123
//  4321234
// 543212345

public class PalindromePatternWithNumbers {
    public static void main(String[] arg){
        int n = 5;

        for(int i=1; i<=n; i++){
        // spaces
         for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
         }
        // desc num
        for(int j=i; j>=1; j--){
            System.out.print(j);
        }
        // asc num
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
          System.out.println();
        }        
    }
}
