import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1,String s2) {
    	char ch1[]=s1.toCharArray();
    	char ch2[]=s2.toCharArray();
    	int count=0;
    	Arrays.sort(ch1);
    	Arrays.sort(ch2);
    	if(ch1.length!=ch2.length) {
    		return false;
    	}
    	for(int i=0;i<ch1.length;i++) {
    		if(ch1[i]==ch2[i]) {
    			count++;
    		}
    	}
    	if(count==ch1.length) {
    		return true;
    	}
    	return false;
    }

}
