# gitassignment
 
class calculation
{
  public static void main(String[] arg)
  {
   int a=5,b=10,c,d,e;

   int a=-5,b=10,c,d;
 
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
