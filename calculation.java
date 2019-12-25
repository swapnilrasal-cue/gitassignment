# gitassignment

class calculation
{
  public static void main(String[] arg)
  {
   int a=5,b=10,c,f;
   c=addition(a,b);
   System.out.println(" Addition of two numbers is : "+c);
   
   f=division(a,b);
   System.out.println("Division of two number is :"+f);
  
  }
  
  static int division(int x,int y)
  {
   return x/y;
  }

  
  static int addition(int x,int y)
  {
   return x+y;
  }
}
