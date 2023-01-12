package Strings;


// Input: racecar, noon Output: true
// Input: rishav Output: false

public class CheckPalindrome {
    public static void main(String args[]){
        String str = "racecar";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
