package rectangle;

public class AreaofRectangle extends Rectangle{
    
    public AreaofRectangle(int l, int b)
    {
        super(l, b);
    }
    public void disp()
    {
        System.out.println("Length of Rectangle is:" +length);
        System.out.println("Breadth of Rectangle is:" +breadth);
    }
    public void arearect()
    {
        System.out.println("Area of Rectangle is:"+ (length*breadth));
    }
}
class test
{
    public static void main(String[] args) {
        AreaofRectangle a=new AreaofRectangle(5,3);
        a.disp();
        a.arearect();
    }
}