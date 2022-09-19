
public class Occurence_app {
	public static void findoccurence(String s,int [] occur,char[] ch) {
		for(int i=0;i<s.length();i++) {
			occur[i]=1;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					occur[i]++;
					ch[j]='0';
				}
			}
		}
	}
	public static void print(char ch[],int[]occur) {
		for(int i=0;i<occur.length;i++) {
			if(ch[i]!=' ' && ch[i]!='0' ) {
				System.out.println(ch[i]+" "+occur[i]);
			}
		}
	}

	public static void main(String[] args) {
		occurenceofchar oc= new occurenceofchar();
		oc.setS("anurag sharma");
		char ch[] = oc.getS().toCharArray();
		int occur[]= new int[oc.getS().length()];	
		Occurence_app.findoccurence(oc.getS(),occur,ch);
		Occurence_app.print(ch,occur);
	}

}
