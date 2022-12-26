package Array;

public class PrintAllSubArrays {
    private static void subArrayNumber(int[] numbers) {
        int n = numbers.length;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
                for(int k=start; k <= end; k++){
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        subArrayNumber(numbers);
    }    
}

// Output:
// 2 
// 2 4
// 2 4 6
// 2 4 6 8
// 2 4 6 8 10

// 4
// 4 6
// 4 6 8
// 4 6 8 10

// 6
// 6 8
// 6 8 10

// 8 
// 8 10

// 10
