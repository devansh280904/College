//Write a program that prompts the user to enter 10 integers and display the integers in decreasing order using loop ,Use the ‘break’

import java.util.*;
class Decreasing
{
    public static void main(String args[])
    {
        Scanner sc=new
        Scanner(System.in);
        int n[]=new int[10];
       
        for(int i=0;i<10;i++)
        {
        System.out.print("ENTER 10 INTEGERS ");
        n[i]=sc.nextInt();
        }
        for(int i=0;i<n.length;i++)
            {
        boolean swapped=false;
        for(int j=0;j<n.length-i-1;j++)
            {
                if(n[j]<n[j+1])
                {
                    int t=n[j];
                        n[j]=n[j+1];
                        n[j+1]=t;
                        swapped=true;
                }
            }
            if (!swapped)
            {
                break;
            }

            }
        System.out.println("DECREASING INTEGERS ARE:");
        for( int num:n)
        {
            System.out.println(num);
        }

    }
}
