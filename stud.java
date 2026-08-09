import java.util.*;
class Student
{
    int rno;
    String name;
    float mark;
    public Student(int rno,String name,float mark)
    {
      this.rno=rno;
      this.name=name;
      this.mark=mark;
    }
    public void display()
    {
     System.out.println("Roll no:"+rno);
     System.out.println("Name:"+name);
     System.out.println("Mark:"+mark);
   }
}
public class stud
{
   public static void main(String args[])
   {
       Student s[]=new Student[3];
       s[0]=new Student(101,"ramu",99);
       s[1]=new Student(102,"somu",98);
       s[2]=new Student(103,"gopu",97);
       for(int i=0;i<3;i++)
       {
          s[i].display();
       }
   }
}