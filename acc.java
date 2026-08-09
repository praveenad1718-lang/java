import java.util.*;
class Account
{
   long accno;
   String name;
   double balance;
   String type;
   public Account(long accno,String name,double balance,String type)
   {
     this.accno=accno;
     this.name=name;
     this.balance=balance;
     this.type=type;
   }
   public void display()
   {
      System.out.println("Account No:"+accno);
      System.out.println("Name:"+name);
      System.out.println("Balance:"+balance);
      System.out.println("Type:"+type);
   }
}
public class acc
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your name:");
      String name=sc.nextLine();
      System.out.println("Enter your AccountNo:");
      long accno=sc.nextLong();
      System.out.println("Enter your balance:");
      int balance=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter your Type:");
      String type=sc.nextLine();
      Account a=new Account(accno,name,balance,type);
      a.display();
    }
}
      
      