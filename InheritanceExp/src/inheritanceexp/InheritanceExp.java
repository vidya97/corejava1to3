package inheritanceexp;

public class InheritanceExp {

    public static void main(String[] args) {
    
        System.out.println("This is AudiA4");
        AudiA4 a1=new AudiA4();
        a1.start();
        a1.stop();
        
        System.out.println("This is AudiA4_alpha");
        AudiA4_alpha a02=new AudiA4_alpha();
        a02.NoGear();
        a02.start();
        a02.stop();
        
        System.out.println("This is AudiA4_beta");
        AudiA4_beta a03=new AudiA4_beta();
        a03.Sensor();
        a03.start();
        a03.stop();
        
        
        
//        System.out.println("This is AudiA5");
//        AudiA5 a2=new AudiA5();
//        a2.OpenRoof();
//        a2.CloseRoof();
//        a2.start();
//        a2.stop();
//        
//        System.out.println("This is AudiA6");
//        AudiA6 a3=new AudiA6();
//        a3.NoGear();
//        a3.Sensor();
//        a3.OpenRoof();
//        a3.CloseRoof();
//        a3.start();
//        a3.stop();
//        
        
    }
    
}
