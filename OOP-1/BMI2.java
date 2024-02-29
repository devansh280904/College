//Body Mass Index(BMI) in Inches and Pounds

import java.util.*;
class BMI2{
    public static void main(String args[])
    {
        Scanner sc=new
        Scanner(System.in);
        System.out.print("ENTER HEIGHT IN INCHES(in) ");
        double height=sc.nextDouble();
        System.out.print("ENTER WEIGHT IN POUNDS(lbs) ");
        double weight=sc.nextDouble();

        double BMI=(weight/(height*height))*703;

        System.out.println("BMI OF GIVEN DATA IS="+BMI);
        
    }
}
