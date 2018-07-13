package classroom;

public class Student extends Classroom{
    
    public Student(String sn, int cn)
    {
        super(sn, cn);
    }
    public void sname()
    {
        System.out.println("Student name: Vidya Ugale");
    }
    public void disp()
    {
        System.out.println("Subject name is:" +Subname);
        System.out.println("Classroom number is:" +Classroom_no);
    }
}
class test
{
    public static void main(String[] args) {
        Student s=new Student("Core java", 1);
        s.sname();
        s.disp();
    }
}