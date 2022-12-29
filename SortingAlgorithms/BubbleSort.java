package SortingAlgorithms;

// Output: 1 2 3 4 5
// Time Complexity = O(n^2)
// It works by repeatedly swapping the adjacent elements if they are in the wrong order. 
// This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String arg[]){
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
    }
}
