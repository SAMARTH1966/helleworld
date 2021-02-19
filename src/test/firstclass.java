package test;

public class firstclass {
	int age;
	String name;
	float sal;
	
	public void display() {
		System.out.println("inside display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		secondclass obj1 = new secondclass();
		obj1.show("rahul");
		
		secondclass obj2 = new secondclass();
		obj2.show("manjunath");
		
		
}

}
