package inheritanceexp;

public class AudiA6 extends AudiA5{
    int g;
    int s;
    
    public AudiA6()
    {
        System.out.println("This is simple constructor of AudiA6");
    }
    
    public void NoGear()
    {
        System.out.println("This will show that there is no gear in AudiA6");
    }
     public void Sensor()
    {
        System.out.println("This will initiate the sensor in AudiA6");
    }
}
