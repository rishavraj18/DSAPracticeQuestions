package Patterns;

// Output:
// A
// BC
// DEF
// GHIJ

public class PrintCharacter {
    public static void main(String[] arg){
        char ch = 'A';
        int n = 4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch);
                ch++;
            }
           System.out.println();
        }
    }
}
