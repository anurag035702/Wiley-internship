// using extends keyword, you create subclass of existing class which behaves like it 
public class Dog extends Animal_inheritance{
	// first sub class constructor is called
	// then super() keyword
	// then parent class constructor 
	//execution is reverse
	Dog(){
		super();// it is added by default in every class
		System.out.println("in Dog constructor");
	}
	//method overriding 
	public void talk() {
		System.out.println("Dog barking");
	}
	public void read() {
		System.out.println("reading");
	}
	@Override
	/*
	 *  rules for method overriding
	 *  1) return type must be same or covariant(subclass of return type)
	 *  2) you cannot have restrictive access specifier
	 *  3) No change in arguments
	 *  4)there cannot be broader exception
	 *  5)Method signature must be the same
	 *  6)final methods cannot be overriden
	 *  7)static has nothing to do with objects 
	 */
	
	public Dog  dosomething(Animal_inheritance a) {
		return null;
	}
}
