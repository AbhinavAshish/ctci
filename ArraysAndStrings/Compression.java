
import java.util.Scanner;
import java.util.ArrayList;

public class Compression{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		int count=1;
		if (str.length()<2) {
			System.out.println(str);
			return;
		}
		char last = str.charAt(0);
		StringBuffer strBuffer = new StringBuffer();
		for (int i =1;i< str.length();i++){
			if (last == str.charAt(i)){
				count++;
			}else{
				strBuffer.append(last);
				strBuffer.append(count);
				count=1;
				last = str.charAt(i);
			}
		}
		strBuffer.append(last);
		strBuffer.append(count);
		if (strBuffer.toString().length()>=str.length()){
			System.out.println(str);
		}else {
			System.out.println(strBuffer.toString());
		}
	
	}

}