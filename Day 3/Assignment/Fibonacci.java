
public class Fibonacci {
   public static void fib(int low,int high) {
	   int f1=0,f2=1,sum=0;
	   while(f1<=high) {
		   if(f1>=low)
			   System.out.println(f1);
		   f1=f2;
		   f2=sum;
		   sum=f1+f2;
	   }
   }
   }
    class test{
   public static void main(String args[]) {
	   Fibonacci f= new Fibonacci(); 
	   int low=20,high=100;
	   Fibonacci.fib(low,high);
}
}
