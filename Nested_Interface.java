//Using Nested Interface
public interface Nested_Interface {
	static void print() {
		System.out.println("Outer Interface");
	}
	interface Inner_Interface{
		void inner_print();
	}

}
class TestNestedInterface implements Nested_Interface.Inner_Interface{  
	 public void inner_print(){
		 System.out.println("Inner interface");
	}
}
class Testing1{
	  
	 public static void main(String args[]){  
		 Nested_Interface.Inner_Interface message=new TestNestedInterface();  
		 Nested_Interface.print();
	     message.inner_print();  
	 }  
} 

//Output
/*
Outer Interface
Inner interface
*/
*/
