//Interface with Multiple Default Methods 
public interface Default_Methods {
	default void show() 
    { 
        System.out.println("Default TestInterface 1"); 
    }
}
interface Default_Methods1 
{ 
    
    default void show() 
    { 
        System.out.println("Default TestInterface 2"); 
    } 
} 
  
 
  
// Implementation class code 
class TestClass implements Default_Methods, Default_Methods1 
{ 
    // Overriding default show method 
    public void show() 
    { 
         
        Default_Methods.super.show(); 
  
        Default_Methods1.super.show(); 
    } 
}
class Testing{
  
    public static void main(String args[]) 
    { 
        TestClass d = new TestClass(); 
        d.show(); 
    } 
} 
//Output
/*
Default TestInterface 1
Default TestInterface 2
*/
