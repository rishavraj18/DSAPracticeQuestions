package Array;

// Output:
// Array:
// 2 4 6 8 10 12 14 16

// Reversed Array:
// 16 14 12 10 8 6 4 2

public class ReverseArray {
    public static int[] ReverseArrayElement(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while(first < last){           
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
        return numbers;
        
    }
    public static void main(String arg[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("Array: ");

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println("Reversed Array: ");

        int reversedArray[];
        reversedArray = ReverseArrayElement(numbers);

        for(int i=0; i<reversedArray.length; i++){
            System.out.print(reversedArray[i]+ " ");
        }
        
    }   
}
