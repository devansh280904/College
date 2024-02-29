//Body Mass Index(BMI) in Killograms and Meters

import java.util.*;
class BMI
{
    public static void main(String[] args) {
    Scanner sc=new
    Scanner(System.in);
    System.out.print("ENTER HEIGHT IN METER ");
    double height=sc.nextDouble();
    System.out.print("ENTER WEIGHT IN KILLOGRAMS ");
    double weight=sc.nextDouble();
    
    double BMI=weight/(height*height);
    
    System.out.println("BMI OF GIVEN DATA IS="+BMI);
    }
}
