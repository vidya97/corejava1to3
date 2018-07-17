package exceptionfinally;

public class ExceptionFinally {

    public static void main(String[] args) {
        int sum, div, mul;
        int a=1; int b=3; int c=0;
        sum= a+b+c;
        try{
            div=a/c;
        }
        catch(Exception e)
        {
            System.out.println("Exception is handled");
        }
        mul=a*b*c;
        System.out.println("Addition is:"+sum);
        System.out.println("Multiplication is:"+mul);
    }
    
}
