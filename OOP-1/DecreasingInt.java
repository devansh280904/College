//Importing Libraries
import java.util.Scanner;

// Main class
public class DecreasingInt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]num= new int[10];

        for(int i = 0 ; i < 10 ; i++){
        System.out.println("Enter Integer "+(i+1) +":");
        num[i]=sc.nextInt();
        }
        for(int i = 0 ; i < 10 ; i++){
            for(int j = i+1 ; j< 10 ; j++){
                if(num[i]<num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("Integers in Decreasing Order:");
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(num[i]);
        }
      
      // Clossing scanner 
        sc.close();
    }
}
