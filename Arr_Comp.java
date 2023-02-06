package PracticeQ2;

import java.util.Arrays;

public class Arr_Comp {

	public static void main(String[] args) {
		Object[] a = new Object[] {1, 5, 7, 9};
	    Object[] b = new Object[] {9, 5, 1, 7};
	    Object[] c = new Object[] {1, 6, 7, 5};
	      
	    Arrays.sort(a);
	    Arrays.sort(b);
	    Arrays.sort(c);

	    boolean returnVal1 = Arrays.equals(a,b);
	    System.out.println("Array a and b equal? : " + returnVal1);

	    boolean returnVal2 = Arrays.equals(b,c);
	    System.out.println("Array b and c equal ?: " + returnVal2);
	}

}
