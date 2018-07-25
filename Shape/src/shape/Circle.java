
package shape;

public class Circle extends Shape{
        
    public void Shape_name()
    {
        System.out.println("This Shape is Circle");
    }
    public void DateofCreated()
    {
        System.out.println("Date of Creation of this Shape is: 01/02/02");
    }
    
}
class test{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        c.Shape_name();
        c.fill_Color();
        r.Shape_name();
        r.fill_Color();
        
    }
}
