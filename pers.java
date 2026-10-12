abstract class Person
{
  String name;
  String gender;
  public Person (String name,String gender)
{
  this.name=name;
  this.gender=gender;
  }
public String toString()
{
return name+"\n"+gender;
}
public abstract void getDetails();
}
class Student extends Person
{
 int batchno;
 long regno;
 public Student(String name,String gender,int batchno, long regno)
{
  super(name,gender);
  this.batchno=batchno;
  this.regno=regno;
}
public void getDetails()
{
System.out.println("Name "+name);
System.out.println("Gender "+gender);
System.out.println("Batch no "+batchno);
System.out.println("Reg no "+regno);
}}
public class pers{
public static void main(String args[]){
Student s=new Student("Veena","Female",281074,4073);
s.getDetails();
}}

