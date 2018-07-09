package inheritanceexp1;

public class AudiA5 extends AudiA4 {
    
    public AudiA5()
    {
        super(10);
        a=19;
        System.out.println("This is constructor for AudiA5");
    }
    
    public void openRoof()
    {
//        this.start();
//        super.start();
        System.out.println("This method will open the Roof of AudiA5");
    }
     public void closeRoof()
    {
        System.out.println("This method will close the Roof of AudiA5");
    }
    @Override
    public void start()
    {
        super.start();
        System.out.println("This method will start AudiA5 with button");
    }
}
