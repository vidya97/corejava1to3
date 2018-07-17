package exception2;

public class Exception2 {

    public static void main(String[] args) {
       int age=21;
       try
       {
           if(age<18)
           {
               System.out.println("Please enter age Greater than 18You are eligible to vote");
           }
       }
       catch(Exception e)
       {
           System.out.println("You are eligible to vote");
       }
    }
    
}
