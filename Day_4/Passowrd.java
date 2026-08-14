package Day_4;
class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String er){
        super(er);
    }
}
class IncorrectPasswordException extends RuntimeException{
    public IncorrectPasswordException(String er){
        super(er);
    }
}

class Pass{
    String password = "User@123";
    void passCheck(String str)throws RuntimeException{
        boolean upper = false;
        boolean digit = false;
        boolean special = false;

        for(int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if(Character.isUpperCase(ch)) {
            upper = true;
        }
        else if(Character.isDigit(ch)) {
            digit = true;
        }
        else if(!Character.isLetterOrDigit(ch)) {
            special = true;
        }
    }
        if(password.equals(str)){
            System.out.println("Valid");
        }
        else if(upper && digit && special) {
            throw new IncorrectPasswordException(" the password in not correct");
        } else {
            throw new InvalidPasswordException(" The password is not valid");
        }
        
    }
}



public class Passowrd {
    public static void main(String[] args) {
        Pass p = new Pass();
        p.passCheck("User@123");
        p.passCheck("Use@123");
        p.passCheck("r@123");
    }
    
}
