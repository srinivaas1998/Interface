//Implementing nested interface with same method name
public interface Shapes {
	interface Square
	{
	   public int area(int a);
	}
	interface Rectangle
	{
	   public int area(int a,int b );
	}
}


class Central implements Shapes.Square,Shapes.Rectangle
{

   public int area(int a) 
   {
	   return a*a; 
   }
   public int area(int a,int b) 
   {
	   return a*b;
   }
}
class Area{
   public static void main(String args[])
   {
	   Shapes.Square s=new Central();
	   Shapes.Rectangle r=new Central();
	   System.out.println(s.area(5));
	   System.out.println(r.area(5,6));
   }
}

//Output
/*
 25
 30
*/
