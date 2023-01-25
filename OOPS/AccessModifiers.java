package OOPS;

// Access Modifiers

// Private -> within class
// Default -> within class, within package
// Protected -> within class, within package, outside package by subclass only
// Public -> within class, within package, outside package by subclass only, outside package as well

public class AccessModifiers {
    public static void main(String args[])
    {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Rishav007";

        // We can't access password, however we can set it
        myAcc.setPassword("testpassword");
    }
}

class BankAccount{
    public String userName;
    private String password;
    
     void setPassword(String pwd){
        password = pwd;
    }

}
