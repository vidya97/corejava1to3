package inheritanceexp;

public class AudiA5 extends AudiA4{
    int cr;
    
    public AudiA5()
    {
        System.out.println("This is simple constructor of AudiA5");
    }
    
    public void OpenRoof()
    {
        System.out.println("This is the method of OpenRoof of AudiA5");
    }
     public void CloseRoof()
    {
        System.out.println("This is the method of CloseRoof of AudiA5");
    }
    public void start()
    {
        System.out.println("This is a start method with button for AudiA5");
    }
}
