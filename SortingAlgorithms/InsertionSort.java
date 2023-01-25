package SortingAlgorithms;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = i; 
            int prev = i-1;

            // finding out the correct position to insert
            while(prev>=0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1] =  arr[curr];
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArray(arr);
        
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
