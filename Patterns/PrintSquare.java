package Patterns;

public class PrintSquare {
    public static void main(String[] args){
        int numberOfStarsPerLine = 10;
        for(int i=1; i<=numberOfStarsPerLine; i++) {
            for(int j=1; j<=numberOfStarsPerLine; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
