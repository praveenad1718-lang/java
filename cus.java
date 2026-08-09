import java.util.*;
class Customer
{
   int id;
   String name;
   public Customer(int id,String name)
   {
     this.id=id;
     this.name=name;
   }
   public void display()
   {
     System.out.println("Customer id:"+id);
     System.out.println("Customer name:"+name);
   }
}
public class cus
{
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of customers");
      int n=sc.nextInt();
      Customer[] c= new Customer[n];
      for(int i=0;i<n;i++)
      {
        System.out.println("Enter customer id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter customer name:");
        String name=sc.nextLine();
        c[i]=new Customer(id,name);
      }
       System.out.println("\nDetails of ram");
       for(int i=0;i<n;i++)
       {
        if(c[i].name.equals("Ram"))
        {
           c[i].display();
        }
       }
    }
}
         
      
        