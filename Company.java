//Interface with Parametrized Constructor
public interface Company {
	public void getName();
	public void getAge();
	public void calculateRetirement();
}
class Employee implements Company{
	int age,retirement;
	String name;
	Employee(String n,int age){
		name=n;
		this.age=age;
	}
	public void getName() {
		System.out.println("Employee name is "+name);
		
	}
	public void getAge() {
		System.out.println(name+" age is "+age);
	}
	public void calculateRetirement() {
		retirement=65-age;
		System.out.println(name+" has "+retirement+" for retirement.");
	}
	
}
class Testing{
	public static void main(String[] args) {
		Employee e=new Employee("Ram",54);
		e.getName();
		e.getAge();
		e.calculateRetirement();
		
		
	}
}

//Output
/*
Employee name is Ram
Ram age is 54
Ram has 11 for retirement.
*/
