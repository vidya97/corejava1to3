package vinterface;

interface Vinterface {
    String name="VIDYA";
    void start();
    
    void stop();
    
    default void color()
    {
        System.out.println("My favourite color is Black");
    }
    
    static void run()
    {
        return;
    }
}
interface Ainterface{
    void disp();
    
    void print();
    
}
class M implements Vinterface, Ainterface{
    public void start()
    {
        System.out.println(" This is start method");
    }
     public void stop()
    {
        System.out.println(" This is stop method");
    }
      public void disp()
    {
        System.out.println(" This is display method");
    }
       public void print()
    {
        System.out.println(" This is print method");
    }
       
       public static void main(String[] args) {
        M obj=new M();
        obj.start();
        obj.stop();
        obj.color();
        obj.disp();
        obj.print();
        System.out.println("The value is: "+name);
    }
}