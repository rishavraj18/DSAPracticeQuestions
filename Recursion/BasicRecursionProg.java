package Recursion;

public class BasicRecursionProg {
    public static void printDec(int n)
    {   
        if(n==1){ // base case
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void main(String args[]){
        int n = 10;
        printDec(n);
    }
}

// Output: 10 9 8 7 6 5 4 3 2 1