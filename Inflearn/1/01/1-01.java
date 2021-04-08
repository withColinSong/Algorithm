import java.util.Scanner;

public class Main {
	public int Solution(String str, char c) {
		int answer = 0;
		
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		int length = str.length();
		
		for(int i=0; i<length; i++) {
			System.out.println(i);
			if(str.charAt(i) == c) answer++;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char c = scan.next().charAt(0);
		

		System.out.println(main.Solution(str, c));
		
		
	}
}
