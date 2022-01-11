import java.util.Scanner;

public class WhileForLoop {
    public static void main(String[]args){
        int a=50;
        int sum=0;
        int i=1;
        while(i<=a)
        {
            sum=sum+i; i++;
        }
        System.out.println("Sum of natural numbers :  " + sum);
    }
}
