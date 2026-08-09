import java.util.*;
class Time
{
   int hr;
   int min;
   int sec;
   public Time()
   {
     hr=0;
     min=0; 
     sec=0;
   }
   public Time(int hr,int min,int sec)
   {
    this.hr=hr;
    this.min=min;
    this.sec=sec;
   }
   public Time addTime(Time t1,Time t2)
   {
    Time t3= new Time ();
    t3.hr=t1.hr+t2.hr;
    t3.min=t1.min+t2.min;
    t3.sec=t1.sec+t2.sec;
    if(t3.sec>=60)
    {
    t3.sec-=60;
    t3.min++;
    }
    if(t3.min>=60)
   {
   t3.min-=60;
   t3.hr++;
    }
    return t3;
    }
    void display()
    { 
    System.out.println(hr+":"+min+":"+sec);
    }
    }
public class Timeadd
{
public static void main(String args[])
{
Time t1=new Time(2,30,20);
Time t2=new Time(4,23,24);
Time t3=t1.addTime(t1,t2);
t3.display();
}
}