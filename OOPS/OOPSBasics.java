package OOPS;

public class OOPSBasics {
    public static void main(String args[]){

        // Object creation in HEAP (p1 is object) 
        // new keyword makes some spaces in memory to store properties value and perform functions operation
        Pen p1 = new Pen(); 
        p1.setColor("blue");
        System.out.println(p1.color);
        // changes value directly
        p1.color = "yellow";
        System.out.println("Value changes directly "+p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

    }
}

// others class are written below Public class

// Blueprint or Class
class Pen {
    // properties
    String color;
    int tip;
 
    // functions are defined
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }   
}

// Blueprint or Class
class Student {
    // properties
    String name;
    int age;
    float percentage;

    // functions are defined
    void calculatePercentage(float phy, float chem, float maths) {
        percentage = (phy + chem + maths) / 3;
    }
}