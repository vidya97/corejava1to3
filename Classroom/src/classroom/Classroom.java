package classroom;

public abstract class Classroom {
String Subname;
int Classroom_no;

public Classroom()
{
    System.out.println("This is My Classroom");
}
public Classroom(String sn, int cn)
{
    this();
    this.Subname= sn;
    this.Classroom_no=cn;
}

public abstract void sname();
public abstract void disp();
}
