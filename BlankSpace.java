package PracticeQ2;

public class BlankSpace {

	public static void main(String[] args) {
		String str = "     Java Development    ";
		 
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);

	}

}
