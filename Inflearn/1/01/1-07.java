import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		str = str.toUpperCase();
		int len = str.length();
		
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) answer = "NO";
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(main.solution(input));
		
	}

}
