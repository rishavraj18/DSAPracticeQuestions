package Recursion;

public class BasicRecursionProg {
    
    public static void printDec(int n)
    {   
        if(n==1){ //base case
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n)
    {
        if(n==1){ //base case
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String args[]){
        int n = 10;
        //printDec(n);
        printInc(n);
    }
}

// printDec Output: 10 9 8 7 6 5 4 3 2 1
// printInc Output: 1 2 3 4 5 6 7 8 9 10 