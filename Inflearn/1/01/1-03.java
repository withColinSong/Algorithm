
import java.util.Scanner;

public class Main {
	public String solution(String str) {
		
		String answer = "";
		String[] answerArray = str.split(" ");
	
		for(int i=0; i<answerArray.length; i++) {
			int length = answerArray[0].length();
			if(length < answerArray[i].length()) {
				answer = answerArray[i];
			}
		}
		
		return answer;
	}

	public String solutionTwo(String str) {
		int m = Integer.MIN_VALUE, pos;
		String answer = "";
		
		while((pos = str.indexOf(" ")) != -1) {
			
			String temp = str.substring(0, pos);
			
			int len = temp.length();
			if(len > m) {
				m = len;
				answer = temp;
			}
			
			str = str.substring(pos+1);
			if(str.length() > m) answer = str;
			
		}
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		
        String str = scan.nextLine();
		String result = main.solution(str);
		System.out.println(result);
		
	}
}
