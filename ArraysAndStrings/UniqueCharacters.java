//question : Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?


import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

// The program contains data structures 
public class UniqueCharacters {
	public static void main (String[] args){
		HashSet hashSet = new HashSet()	;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = input.nextLine();
		for (char a: str.toCharArray()){
			if (hashSet.contains(a) && a != ' '){
				System.out.println("Word does not have unique characters");
				return ;
			} else {
                             if (a!=' ') hashSet.add(a);
			}
		}
		System.out.println("Unique characters are present in the word");
		return ;
	}
}
