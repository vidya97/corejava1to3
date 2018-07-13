package rectangle;

public abstract class Rectangle {
    int length;
    int breadth;
    
    public Rectangle(int l, int b)
    {
        this.length= l;
        this.breadth= b;
    }
    public abstract void disp();
    
    public abstract void arearect();
    
}
