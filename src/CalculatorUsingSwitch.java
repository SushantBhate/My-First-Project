import java.util.Scanner;
public class CalculatorUsingSwitch {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char sc;
        double x, y, n=0;
        System.out.println("Enter two numbers to perform operations ");
        System.out.println("Enter the first number: ");
        x=s.nextDouble();
        System.out.println("Enter the second number: ");
        y=s.nextDouble();
        System.out.println("Enter operators to perform");
        sc=s.next().charAt(0);
        switch(sc)
        {
            case '+':
                n=x+y;
                System.out.println("Result:  " + n);
                break;
            case '-':
                n=x-y;
                System.out.println("Result:  " + n);
                break;
            case '*':
                n=x*y;
                System.out.println("Result:  " + n);
                break;
            case '/':
                n=x/y;
                System.out.println("Result:  " + n);
                break;
            case '%':
                n=x%y;
                System.out.println("Result:  " + n);
                break;
            default:
                System.out.println("Invalid Operator!");
                break;
        }
    }

}

