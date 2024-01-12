package javaDataTypes;

public class Variables {
    
    static int s = 10;

    
    int v1 = 20;

    public void LocalVariable() {
        
        int l1 = 30;
        System.out.println("local variable value is:"+ l1);

        System.out.println("Static Variable: " + s);
        System.out.println("Instance Variable: " + v1);
        
    }

    public static void main(String[] args) {
        Variables v = new Variables();
        v.LocalVariable();
    }
}
