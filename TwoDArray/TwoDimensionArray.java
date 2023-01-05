package TwoDArray;

import java.util.Scanner;

// Total cells = rows(n)*columns(m)

// Output:
// 1 2 3
// 4 5 6
// 7 8 9
// false

public class TwoDimensionArray {
    public static boolean searchKey(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    } 
    public static void main(String args[]){
        
        int n = 3; 
        int m = 3; 

        int matrix[][] = new int[n][m];
        //Rows = matrix.length = 3
        //Columns = matrix[0].length = 3

        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(searchKey(matrix, 10));
    }
}
