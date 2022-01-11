import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length: ");
        int l=scan.nextInt();
        System.out.println("Enter breadth: ");
        int b=scan.nextInt();

        int area=l*b;
        System.out.println("Area of Rectangle = " + area);

    }

}
