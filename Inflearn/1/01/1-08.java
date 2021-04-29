import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "NO";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		System.out.println(str);
		String temp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(temp)) {
			answer = "YES";
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(main.solution(input));
		
	}

}