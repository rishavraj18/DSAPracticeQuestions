package SearchingAlgo;

// Find Index of 50 in below array
public class LinearSearch {
   public static int linearSearch(int numbers[], int key){
     for(int i=0; i<numbers.length; i++){
        if(numbers[i] == key){
            return i;
        }
     }
     return -1;
   }

    public static void main(String[] arg){
        int numbers[] = {40, 45, 46, 47, 48, 49, 50, 51, 64, 80};
        int key = 50;

        int index = linearSearch(numbers, key);
        System.out.println("Key is at Index: "+index);
    }
}
