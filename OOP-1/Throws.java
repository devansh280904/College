class Height{
    void heightcheck(int height)throws ArithmeticException{
        if(height<0){
            throw new ArithmeticException("Height Cannot be negative");
        }else{
            System.out.println("Height in CM:"+height);
        }

    }
}
public class Throws {
    public static void main(String[] args){
    try{
    Height h=new Height();
    h.heightcheck(165);
    }catch(ArithmeticException e){
        System.out.println("Caught Exception: " + e.getMessage());
        }
    }   
}
