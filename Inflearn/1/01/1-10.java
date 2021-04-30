import java.util.Scanner;

public class Main {
	public int[] solution(String str, char c) {
		int length = str.length();
		int answer[] = new int[length];
		
		int p = 1000;
		
		for(int i=0; i<length; i++) {
			if(str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		
		for(int i=length-1; i>=0; i--) {
			if(str.charAt(i) == c)  p = 0; 
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		
		String str = scan.nextLine();
		char c = scan.next().charAt(0);
		for(int output : main.solution(str, c)) {
			System.out.print(output + " ");
		}
		
	}
}