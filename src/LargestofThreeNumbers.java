public class LargestofThreeNumbers {
    public static void main(String[]args){
        int a=14, b=24, c=8;
        if(a>=b && a>=c){
            System.out.println("Largest number is " + a);
        }
        else if(b>=a && b>=c){
            System.out.println("Largest number is " + b);
        }
        else{
            System.out.println("Largest number is " + c);        }
    }
}
