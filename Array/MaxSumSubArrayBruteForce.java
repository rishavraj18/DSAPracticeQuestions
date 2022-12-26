package Array;

// Output:
// max sum = 8
// Time Complexity = O(n^3) => Bad

public class MaxSumSubArrayBruteForce {
    private static void maxSumSubArray(int[] numbers) {
        int curr_Sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = numbers.length;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
                curr_Sum = 0;
                for(int k=start; k <= end; k++){
                    curr_Sum += numbers[k]; 
                } 
                System.out.println(curr_Sum); 
                if(maxSum < curr_Sum){
                    maxSum = curr_Sum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        maxSumSubArray(numbers);
    } 

}
