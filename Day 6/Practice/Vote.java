
public class Vote {
  int age;

public Vote(int age) {
	this.age = age;
}
  public void canvote() {
	  try {
		  if(age<18) {
			  throw new AgeException();
		  }
		  else {
			  System.out.println("you can vote");
		  }
	  }
	  catch(AgeException ag) {
		  System.out.println(ag);
		  System.out.println(ag.getMessage());
	  }
  }
}
class test4{
	public static void main(String args[]) {
		Vote v= new Vote(19);
		v.canvote();
	}
}
