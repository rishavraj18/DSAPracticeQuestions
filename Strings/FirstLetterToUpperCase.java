package Strings;

// Output
// Hi, My Name Is Rishav

public class FirstLetterToUpperCase {
    
    public static void main(String args[]){
        String str = "hi, my name is rishav";
        System.out.println(firstCharToUpper(str));
    }

    private static String firstCharToUpper(String str) {
        StringBuilder sb = new StringBuilder("");
        char upperCase;
        
        // First letter to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // after space every letter to upper case
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;

                upperCase = Character.toUpperCase(str.charAt(i));
                sb.append(upperCase);
            } 
            // Other letter as it is
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
