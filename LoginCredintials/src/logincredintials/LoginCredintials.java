package logincredintials;

class LoginCredintials {
    
    static String Username="ABC";
    static String Password="XYZ";
    
       static class ValidateCredintials{
       static void Validate()
        {
            System.out.println("Username is: "+Username);
            System.out.println("Password is: "+Password);
            System.out.println("Welcome ABC!!!");
        }
    }

    public static void main(String[] args) {
        LoginCredintials l=new LoginCredintials();
       
//        LoginCredintials.ValidateCredintials v= l.new ValidateCredintials();
        ValidateCredintials.Validate();
    }
    
}
