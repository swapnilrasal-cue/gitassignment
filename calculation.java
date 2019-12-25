# gitassignment

class calculation
{
  public static void main(String[] arg)
  {
   int a=5,b=10,c,d;
   c=addition(a,b);
   d=substraction(a,b);

   System.out.println(" Addition of two numbers is : "+c);
  }

  static int addition(int x,int y)
  {
   return x+y;
  }

  static int substraction(int x,int y)
  {
   return x-y;
  }

}
