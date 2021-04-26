import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		int length = str.length();
		
		for(int i=0; i<length; i++) {
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
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