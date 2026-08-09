import java.util.*;
class Point
{
     int x;
     int y;
     public Point(int x,int y)
     {
       this.x=x;
       this.y=y;
      }
     public void display()
     {
       System.out.println("("+x+","+y+")");
     }
     public double gdfo()
     {
       return (Math.sqrt(x*x+y*y));
     }
}
public class pnt
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter how many points");
       int n=sc.nextInt();
       Point P[]=new Point[n];
       for(int i=0;i<n;i++)
       {
         int a=sc.nextInt();
         int b=sc.nextInt();
         P[i]=new Point(a,b);
         P[i].display();
       }
      int farpt=0;
      int nearpt=0;
      for(int i=0;i<n;i++)
      {
        if(P[i].gdfo()<P[nearpt].gdfo()
      ){
          nearpt=i;
       }
  }
      System.out.println(nearpt);
      P[nearpt].display();
 }}