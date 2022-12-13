package BasicProgramming;

public class Average {
    public static void main(String[] arg){
        int num1 = 56;
        int num2 = 65;
        int num3 = 59;
        int num4 = 80;
        int num5 = 54;

        int sumOfAll = (num1+num2+num3+num4+num5);
        int noOfElement = 5;

        AverageCal(sumOfAll, noOfElement);
    }
    
    public static void AverageCal(int Sum, int noOfElement){
        System.out.println(Sum/noOfElement);
    }

}
