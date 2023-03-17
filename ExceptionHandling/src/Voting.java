public class Voting {
    public static void main(String[] args){
         // Checked Exception
        int age = 16;
        try {
            if (age < 18) {
                throw new UnderAgeException("Can't vote");
            } else {
                System.out.println("You are eligible to vote!!");
            }
        }catch(UnderAgeException e){
            System.out.println(e);
        }
    }
}
class UnderAgeException extends Exception{
    UnderAgeException(){
        super("You are not eligible to vote!!");
    }
    UnderAgeException(String message){
        super(message);
    }
}
