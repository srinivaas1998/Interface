// Using Interfaces to achieve Multiple Inheritance
public interface Honda {
	public void petrol();

}
interface Tesla{
	public void electric();
}
class Car implements Honda,Tesla{
	public void petrol() {
		System.out.println("Petrol based cars were at top once.");
	}
	public void electric() {
		System.out.println("Nowadays people prefer electric over petrol.");
	}
}
class Automobile{
	public static void main(String[] args) {
		Car c=new Car();
		c.petrol();
		c.electric();
	}
}


//Output
/*
Petrol based cars were at top once.
Nowadays people prefer electric over petrol.
*/
