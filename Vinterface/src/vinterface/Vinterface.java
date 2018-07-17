package vinterface;

interface Vinterface {

    void start();
    
    void stop();
}
interface Ainterface extends Vinterface{
    
    void print();
    
    default void color()
    {
        System.out.println("My favourite color is Black");
    }
}
class U implements Ainterface{
    public void start()
    {
        System.out.println("This is start Method");
    }
     public void stop()
    {
        System.out.println("This is stop Method");
    }
      public void print()
    {
        System.out.println("This is print Method");
    }
     
      public static void main(String[] args) {
        U obj=new U();
        obj.start();
        obj.stop();
        obj.print();
        obj.color();
    }
}