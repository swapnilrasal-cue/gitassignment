# gitassignment
 
class calculation
{
  public static void main(String[] arg)
  {
  int a=5,b=10,c,d,e;
 
   if(a<0)
   {
     a=a-(2*a);
   }
   if(b<0)
   {
     b=b-(2*b);
   }
 
   c=addition(a,b);
   System.out.println(" Addition of two numbers is : "+c);
  
   d=substraction(a,b);
   System.out.println(" Substraction of two numbers is : "+d);

   e=multiplication(a,b);
   System.out.println(" Multiplication of two numbers is : "+e);

   f=division(a,b);
   System.out.println("Division of two number is :"+f);
  

 }
  static int addition(int x,int y)
  {
   return x+y;
  }
  static int multiplication(int x,int y)
  {
   return x*y;
  }
  static int substraction(int x,int y)
  {
   return x-y;
  }
  static int division(int x,int y)
  {
   return x/y;
  }


}
