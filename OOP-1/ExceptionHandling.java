import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER DIVIDEND: ");
        int dd=sc.nextInt();
        System.out.print("ENTER DIVISOR: ");
        int dr=sc.nextInt();

        try{
            int ans=dd/dr;
            System.out.println("Result of the Division:"+ans);
        }catch (ArithmeticException e) {
        	System.out.println("The value of Divisor cannot be zero.");
        }catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }
        finally{
            sc.close();
            System.out.println("Program Excuted Successfully");
        }
    }
}
