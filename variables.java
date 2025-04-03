public class variables{

    static int InstanceVariable;
    public static void main(String args[]){
        

        //Data Types
        int var1;
        var1=1;
        double var2 = 3.14;
        char var3 = 65;
        boolean var4 = true;
        String var5 = "Hi";

        System.out.println(var1+" "+var2+" "+var3+" "+var4+" "+var5);


        //Variable Scopes
        // Local Scope
        int localVar = 10; // Local variable
        System.out.println(localVar);

        // Static variable
        InstanceVariable=10;
        System.out.println(InstanceVariable);

        //Variable Types
        //Final Unchangable
        final double PI = 3.14159;
        // PI=1.1;
        // This gives error
    }
}