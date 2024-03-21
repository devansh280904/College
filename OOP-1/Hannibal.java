// Importing Libraries
import java.util.Scanner;

// Main class
public class Hannibal{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER HEIGHT IN INCHES(in) ");
        double height=sc.nextDouble();
        System.out.print("ENTER WEIGHT IN POUNDS(lbs) ");
        double weight=sc.nextDouble();

        double hm=height*0.0254 ;
        double wk=weight*0.45359237;

        System.out.println("HEIGHT IN METERS = "+hm);
        System.out.println("WEIGHT IN KILLOGRAMS = "+wk);

        double BMI=(wk/(hm*hm));

        System.out.println("BMI OF GIVEN DATA = "+BMI);

        //Closing scanners
        sc.close();
    
    }
}