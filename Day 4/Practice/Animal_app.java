
public class Animal_app {
 public static void main(String []args) {
	 //polymorphic references or dynamic method dispatch
	Animal_inheritance a= new Dog();
	a.breath();
	//a.read();not possible because not present in animal class
	// downcasting ((subclass) object of super class).method();
	((Dog) a).read();
 }
}
