import java.util.Scanner;
import java.util.Arrays;

public class Permutation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str_one = input.nextLine();
		System.out.println("Enter String 2");
		String str_two = input.nextLine();
		char[] arr_one  = str_one.toCharArray();
		char[] arr_two  = str_two.toCharArray();
		Arrays.sort(arr_one);
		Arrays.sort(arr_two);
		if ((new String(arr_one)).equals((new String(arr_two)))) {
			System.out.println(" The two words are permutation of each other ");
			return;
		}else {
			System.out.println(" The two words are not permutation of each other ");

		}
	}
}