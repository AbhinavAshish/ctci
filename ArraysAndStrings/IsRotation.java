import java.util.Scanner;

public class IsRotation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s =  input.nextLine();
		s= s +s;
		System.out.println("Enter the rotated string ");
		String t =  input.nextLine();
		if (s.length()/2 != t.length()) {
			System.out.println("It is not a substring");
			return;	
		}
		
		if(s.indexOf(t)!= -1) System.out.println("It is a substring");
		else System.out.println("It is not a substring");
	}
}