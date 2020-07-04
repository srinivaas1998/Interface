//Basic interface concept.


public interface Curriculum {
	
		public void learn();
		public void code();
}
class Student implements Curriculum{
	public void learn(){
		System.out.println("A student must learn code before starting to code");
	}
	public void code(){
		System.out.println("A student must code only after learning ");
	}  
}
class Testing{
	public static void main(String[] args){
		Student s=new Student();
		s.learn();
    s.code();
	}
}
//Output
/*
A student must learn code before starting to code
A student must code only after learning 
*/
