import java.util.*;
class Student  
{
   int batchno;
   String name;
   float mark;
   public Student(int batchno,String name,float mark)
   {
     this.batchno=batchno;
     this.name=name;
     this.mark=mark;
   }
   public void display()
  {
   System.out.println("Batch No:"+batchno);
   System.out.println("Name:"+name);
   System.out.println("Mark:"+mark);
  }
}
public class stu
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Name:");
      String name=sc.nextLine();
      System.out.println("Enter batchno:");
      int batchno=sc.nextInt();
      System.out.println("Enter Mark:");
      float mark=sc.nextFloat();
      Student s=new Student(batchno,name,mark);
      s.display();
  }
}