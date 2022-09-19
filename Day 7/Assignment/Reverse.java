public class Reverse {
	String s1;
	public Reverse(String s1) {
		this.s1 = s1;
	}
	public String reverse() {
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		return s2;
	}
	public void reverse2(String s3) {
		String[] s4=s3.split(" ");
		for(int i=s4.length-1;i>=0;i--) {
			System.out.print(s4[i]+" ");
		}
	}

}
