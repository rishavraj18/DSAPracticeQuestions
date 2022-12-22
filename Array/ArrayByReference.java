package Array;

// Output
// Print Marks:
// 97 98 94 

// Print Marks after update:
// 98 99 95 

public class ArrayByReference {

    public static void updateMarks(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String arg[]){

        int marks[] = {97, 98, 94};

        System.out.println("Print Marks:");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        
        // Update marks
        updateMarks(marks);

        System.out.println();
        System.out.println();

        // Print Marks after update
        System.out.println("Print Marks after update:");

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
