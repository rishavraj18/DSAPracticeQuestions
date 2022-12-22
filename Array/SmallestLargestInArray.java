package Array;

// Output:
// Smallest num in array is: 2 and largest num in array is: 111

public class SmallestLargestInArray {
    public static int getLargest(int arrayNum[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arrayNum.length; i++){
            if(largest < arrayNum[i]){
                largest = arrayNum[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int arrayNum[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arrayNum.length; i++){
            if(smallest > arrayNum[i]){
                smallest = arrayNum[i];
            }
        }
        return smallest;
    }
    public static void main(String arg[]){
        int arrayNum[] = {15, 95, 74, 2, 111, 85, 110};
        int largestNum = getLargest(arrayNum);
        int smallestNum = getSmallest(arrayNum);
        System.out.println("Smallest num in array is: "+ smallestNum+ " and largest num in array is: "+ largestNum);
    }
}
