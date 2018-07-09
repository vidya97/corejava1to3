package inheritanceexp1;

public class AudiA4 {
//   int a;
//    public int a;
//    private int a;
    protected int a;
    
    public AudiA4(int x)
    {
        a=10;
        System.out.println("This is constructor for AudiA4");
    }
    
    public void start()
    {
        System.out.println("This is start method of AudiA4");
    }
    public void stop()
    {
        System.out.println("This is stop method of AudiA4");
    }
}
