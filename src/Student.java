public class Student {
    String name="John";
    int rollno=2;
    int age=24;

    void info()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollno);
        System.out.println("Age: "+ age);
    }
    public static void main(String[]args){
        Student student=new Student();
       // student.name="John";
      //  student.rollno=2;
      //  student.age=24;

        student.info();
    }
}
