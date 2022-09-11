// super class in is-a inheritance
// for each and every class there is a cosmic super class father of all classes called "object" class
public class Animal_inheritance extends Object {
	
	Animal_inheritance(){
		System.out.println("in animal constructor");
	}
	public void talk() {
		System.out.println("animal talking");
	}
	public void eat() {
		System.out.println("animal eating");
	}
	public void sleep() {
		System.out.println("animal sleeping");
	}
	public void breath() {
		System.out.println("animal breathing");
	}
	public Animal_inheritance  dosomething(Animal_inheritance a) {
		return null;
	}

}