import java.util.Scanner;

public class Main {
	public String solution(int num, String str) {
		String answer = "";	
		
		for(int i=0; i<num; i++) {
			String temp = str.substring(0, 7).replace("#", "1").replace("*", "0");
			str = str.substring(7);
			int tempInt = Integer.parseInt(temp, 2);
			answer += (char)tempInt;
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		int num = scan.nextInt();
		String str = scan.next();		
		System.out.println(main.solution(num, str));
		
	}
}
