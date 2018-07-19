package a;

public class A {
    String Username="ABC";
    String Password="XYZ";
    
    void disp()
    {
        class B{
            void Val()
            {
                System.out.println("Username is: "+Username);
                System.out.println("Password is: "+Password);
                System.out.println("Welcome ABC!!!");
            }
        }
        B obj1=new B();
        obj1.Val();
        System.out.println("This is Display Screen");
    }

    public static void main(String[] args) {
        A obj2=new A();
        obj2.disp();
    }
    
}
