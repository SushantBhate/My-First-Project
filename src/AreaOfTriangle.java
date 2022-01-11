import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter width of triangle: ");
        int w=scan.nextInt();
        System.out.println("Enter height of triangle: ");
        int h=scan.nextInt();

        double area=(w*h)/2;
        System.out.println("Area of Triangle = " + area);

    }
}

