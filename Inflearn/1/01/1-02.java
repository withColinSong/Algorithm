import java.util.Scanner;

public class Main {
	public String Solution(String str) {
		String answer = "";
		
		char[] arrayChar = str.toCharArray();
		
		for(char x : arrayChar) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String answer = main.Solution(str);
		System.out.println(answer);
		
	}
}
