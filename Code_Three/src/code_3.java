
public class code_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub_strings("Sid");
		System.out.println("reverse the string: "+reverse("Sid"));
		System.out.println("check if number is palindrone:  "+palindrome("lol"));
		matrix_add();
		matrix_multiply();
		replace("You the best");
		random();
		
		overriding(4);
		

	}
	
	//finding all the substrings of a Sting 
	
	public static void sub_strings(String a) {
		
		for(int i=0;i<a.length();i++) {
			
			for(int j=i+1;j<=a.length();j++) {
				System.out.print(a.substring(i, j)+",  ");
			}
		}
	}
	
	
	// reverse a String
	public static String reverse(String a) {
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		return rev;
	}

	// Check if string is palindrome or not
	public static boolean palindrome(String b) {
		String v=reverse(b);
		if(v.equals(b)) {
			return true;
		}
		return false;
	}
	// adding two matrix 
	public static void matrix_add() {
		int[][] arr1= new int [][] {{1,2},{2,4}};
		int[][] arr2= new int [][] {{3,4},{6,8}};
		int[][] sum= new int [2][2] ;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				sum[i][j]=arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("addition of two matrix:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.print(sum[i][j]);
			}
			System.out.println();
		}
		
	}
	
	//multiply two matrix
	public static void matrix_multiply() {
		int[][] arr1= new int [][] {{1,2},{2,4}};
		int[][] arr2= new int [][] {{3,4},{6,8}};
		int[][] sum= new int [2][2] ;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				sum[i][j]=arr1[i][j] *arr2[i][j];
			}
		}
		System.out.println("Multplication of two matrix:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.print(sum[i][j]);
			}
			System.out.println();
		}
		
	}
	
	//replace a string with another but we cant change (String a) in this case, as strings are immutable
	public static void replace(String a) {
		String c=a.replaceAll("You", "Sid");
		
		System.out.println(c);
	}
	
	// generate a random number
	public static void random() {
		int a =(int) (Math.random()*10);
		System.out.println("Random number is :" +a);
	}
	
	
	// method Overriding example
	public static void overriding() {
		System.out.println("I am Parameterless method");
	}
	public static void overriding(int a) {
		System.out.println("I am Parameterized method");
	}
	
	
	
	
}
