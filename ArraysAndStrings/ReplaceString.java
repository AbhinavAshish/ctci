
import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		int count =0;
		for (int i=0;i<str.length();i++){
			if (str.charAt(i)==' ') count++;
		}
		char[] arr = new char[str.length() + count *2];
		
		for (int i=0,j=0;i<str.length();i++){
			if (str.charAt(i)== ' '){
				arr[j]= '%';
				j++;
				arr[j] = '2';
				j++;
				arr[j] = '0';
				j++;

			}else{
				arr[j] = str.charAt(i);
				j++;
			}
		}
		System.out.println(new String(arr));
	}
}