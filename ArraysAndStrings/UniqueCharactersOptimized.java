//question : Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?


import java.util.Scanner;

// The optimization is obtained by creating a boolean array to represent the ASCII value of characters.


public class UniqueCharactersOptimized {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = input.nextLine();
		if (str.length() > 256 ) {
			System.out.println("False");
			return;
		}
		boolean[] chars = new boolean[256];
		for (int i=0;i< str.length();i++){
			char temp = str.charAt(i);
			if(chars[temp] ) {
			System.out.println("False");
			return ;
		}
			else chars[temp]=true;
		}
		System.out.println("True");
		return;
	}
}

