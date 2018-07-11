package countries;

public class Maharashtra extends India{
    
    public void language()
    {
        System.out.println("The commonly used language in maharashtra is Marathi");
    }
}
class Test
{
public static void main(String args[])
{
    Maharashtra M=new Maharashtra();
    M.language();
    M.national_sport();
    M.people();
}
}