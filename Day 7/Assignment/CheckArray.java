
public class CheckArray {
public static  boolean checkarray(int arr[]) {
	if(arr[0]==arr[arr.length-1]) {
		return true;
	}
	return false;
}

public static void main(String[] args) {
	int arr[] = new int[] {1,2,3,4,5,6,9};
	System.out.println(CheckArray.checkarray(arr));
	
}
}
