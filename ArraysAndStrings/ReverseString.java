import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a string");
		String str =input.nextLine();
		char[] temp  = str.toCharArray();
		for(int i=0,j=str.length()-1;i<j;i++,j--){
			char t = temp[i];
			temp[i]=temp[j];
			temp[j]= t; 
		}
		System.out.println(new String(temp));
		
	}

}