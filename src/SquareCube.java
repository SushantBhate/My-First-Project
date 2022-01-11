import java.util.Scanner;

public class SquareCube {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scan.nextInt();
        System.out.println("Square of " + num + " is " + Math.pow(num,2));
        System.out.println("Cube of " + num + " is " + Math.pow(num,3));
        double squareroot=Math.sqrt(num);
        double cuberoot=Math.cbrt(num);

        System.out.println("Square root of " + num + " = " + squareroot);
        System.out.println("Cube root of " + num + " = " + cuberoot);
    }
}
