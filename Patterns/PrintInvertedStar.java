package Patterns;

public class PrintInvertedStar {
    public static void main(String[] arg){
        int noOfLines = 4;
        for(int i=1; i<=noOfLines; i++)
        {
            for(int j=i; j<=noOfLines; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
