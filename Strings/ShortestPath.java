package Strings;

// Output: 5.0

public class ShortestPath {

    public static float getShortestPath(String path){
        float x = 0, y = 0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }   
        }
        float X2 = x*x;
        float Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }
    
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
