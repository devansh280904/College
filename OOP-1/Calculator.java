import java.util.*;
class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new
        Scanner(System.in);
        {
            System.out.print("ENTER THE OPERATOR (1:+ ,2: - ,3:* ,4:/ ,5:^2 ,6:^3 ,7:%)");
            int o=sc.nextInt();
            System.out.print("ENTER 1st VALUE ");
            double a=sc.nextDouble();
            System.out.print("ENTER 2nd VALUE ");
            double b=sc.nextDouble();
            if(o==1)
            {
                double add=a+b;
                System.out.println("ADDITION OF GIVEN 2 INTEGERS ="+add);
            }
            if(o==2)
            {
                double d=a-b;
                System.out.println("SUBTRACTION OF GIVEN 2 INTEGERS =" +d);
            }
            if(o==3)
            {
                double e=a*b;
                System.out.println("MULTIPLICATION OF GIVEN 2 INTEGERS =" +e);
            }
            if(o==4)
            {
                double f=a/b;
                System.out.println("DIVISION OF GIVEN 2 INTEGERS =" +f);
            }
            if(o==5)
            {
                double g=a*a;
                double h=b*b;
                System.out.println("SQUARE OF  1st INTEGER =" +g);
                System.out.println("SQUARE OF  2nd INTEGER =" +h);
            }
            if(o==6)
            {
                double i=a*a*a;
                double j=b*b*b;
                System.out.println("CUBE OF 1st INTEGER =" +i);
                System.out.println("CUBE OF 2nd INTEGER =" +j);
            }
            if(o==7)
            {
                double k=(a*b)/100;
                System.out.println("VALUE OF GIVEN PERCENTAGE =" +k);
            }
        }
    }
}