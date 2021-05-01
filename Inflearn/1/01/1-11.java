import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		str = str + " ";

		int length = str.length();
		int cnt = 1;
		
		for(int i=0; i<length-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(i);
				cnt = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		
		String str = scan.next();
		System.out.println(main.solution(str));
		
	}
}