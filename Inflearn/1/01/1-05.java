import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = str.length()-1;
		
		
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char temp = s[lt];
				s[lt] = s[rt];
				s[rt] = temp;
				lt++;
				rt--;
				System.out.println("실행");
			}
		}
		
		answer = String.valueOf(s);
		
		return answer;
		
	}
	public static void main(String[] args) {
		
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		String stringAlphabetic = scan.next();
		System.out.println(main.solution(stringAlphabetic));
		
	}

}