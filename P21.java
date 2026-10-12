interface Arithmetic
{
public void add(int a,int b);
public void sub(int a,int b);
}
class Test implements Arithmetic
{
 public void add(int a,int b)
{
System.out.println(a+b);
}
public void sub(int a,int b)
{
System.out.println(a-b);
}
}
public class P21
{
public static void main(String args[]){
Test obj=new Test();
obj.add(7,3);
obj.sub(7,3);
}}