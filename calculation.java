# gitassignment

class calculation
{
  public static void main(String[] arg)
  {
   int a=5,b=10,c,d,e;

   c=addition(a,b);
   System.out.println(" Addition of two numbers is : "+c);

   e=multiplication(a,b);
   System.out.println(" Multiplication of two numbers is : "+e);

   d=substraction(a,b);
   System.out.println(" Substraction of two numbers is : "+d);

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

}
