package Strings;

// Output: ab2c3d4e5

public class StringCompression {
    public static void main(String args[]){
        String str = "abbcccddddeeeee";
        System.out.println(stringCompress(str));
    }

    private static String stringCompress(String str) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
}
