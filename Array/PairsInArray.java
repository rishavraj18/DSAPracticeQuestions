package Array;

// Output 
// (2,4) (2,6) (2,8) (2,10) 
// (4,6) (4,8) (4,10)       
// (6,8) (6,10)
// (8,10)

public class PairsInArray {
    private static void pairNumber(int[] numbers) {
        int n = numbers.length;
        for(int i=0; i<n; i++){
            int curr = numbers[i];
            for(int j=i+1; j<n; j++){
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        int numbers[] = {2, 4, 6, 8, 10};
        pairNumber(numbers);
    }
}
