import java.util.*;
class Calculator
{
  int a;
  int b;
  public Calculator()
  {
     a=0;
     b=0;
  }
  public Calculator(int a,int b)
  {
     this.a=a;
     this.b=b;
  }
  public void add() {
   System.out.println(a+b);
  }
  public void sub() {
   System.out.println(a-b);
  }
  public void mul() {
   System.out.println(a*b);
  }
}
public class calci
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two numbers");
       int a=sc.nextInt();
       int b=sc.nextInt();
       Calculator c=new Calculator(a,b);
       c.add();
       c.sub();
       c.mul();
    }
 }  


