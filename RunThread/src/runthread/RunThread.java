package runthread;
import java.lang.Thread;
public class RunThread implements Runnable{
    
    public void run()
    {
        System.out.println("Thread 1");
       
    }

    public static void main(String[] args) {
        RunThread r= new RunThread();
        Thread t=new Thread(r);
        t.start();
        
    }
    
}
