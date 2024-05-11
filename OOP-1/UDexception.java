class ArithmeticException extends Exception{
    public ArithmeticException(String message){
    super(message);
    }
}
class age{
    void eligibility(int age)throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }else{
            System.out.println("You are eligible to vote:"+age);
        }

    }
}
public class UDexception {
    public static void main(String[] args){
    try{
    age Age=new age();
    Age.eligibility(13);
    }catch(ArithmeticException e){
        System.out.println("Caught Exception: " + e.getMessage());
        }
    }   
}
