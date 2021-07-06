import java.util.Scanner;

public class ZohoProgram {

	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		String input = c.next();
		String subString1 = input.substring(0,(input.length()/2));
		String subString2 = input.substring((input.length()/2),input.length());
		System.out.println("subs "+subString2);
		StringBuilder sb = new StringBuilder();
		String newInput = sb.append(subString2).append(subString1).toString();
		
		for(int i=1;i<=newInput.length();i++) {
			for(int j=i;j<newInput.length();j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(newInput.charAt(k-1));
			}
			System.out.println();
		}
	}
}
