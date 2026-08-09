class Rational{
   int nr;
   int dr;
   Rational(){
    nr=0;
    dr=1; 
  }
   Rational(int nr,int dr){
      this.nr=nr;
      this.dr=dr;
   }
   Rational add(Rational r1,Rational r2){
       Rational r3=new Rational ();
       r3.nr=r1.nr*r2.dr+r2.nr*r1.dr;
       r3.dr=r1.dr*r2.dr;
       return r3;
  }
public void display(){
    System.out.println(nr+"/"+dr);
}
}
public class rat{
   public static void main(String args[])
   {
     Rational r1=new Rational(3,4);
     Rational r2=new Rational(4,5);
     Rational r3=r1.add(r1,r2);
     r3.display();
   }
}