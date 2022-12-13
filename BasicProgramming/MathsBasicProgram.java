package BasicProgramming;

public class MathsBasicProgram {
    public static void main(String[] arg){
        int a = 50;
        int b = 10;

        Sum(a,b);
        Sub(a,b);
        Multiply(a, b);
        Divide(a, b);
    }

    public static void Sum(int a, int b){
        System.out.println("Sum of a and b is: "+ (a+b));
    }

    public static void Sub(int a, int b){
        System.out.println("Diff of a and b is: "+ (a-b));
    }

    public static void Multiply(int a, int b){
        System.out.println("Product of a and b is: "+ (a*b));
    }

    public static void Divide(int a, int b){
        System.out.println("Division of a by b is: "+ (a/b));
    }
    
}
