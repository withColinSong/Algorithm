import java.util.Scanner;

public class Main {
	public String solution(int[] arrA, int[] arrB) {
		
		String answer = "";
		
		
		for(int i=0; i<arrA.length; i++) {
			//System.out.print(arrA[i] + " ");
			//System.out.print(arrB[i] + " ");
			
			if(arrA[i] == arrB[i]) answer += "D";
			else if(arrA[i] == 1 && arrB[i] == 3) answer += "A";
			else if(arrA[i] == 2 && arrB[i] == 1) answer += "A";
			else if(arrA[i] == 3 && arrB[i] == 2) answer += "A";
			else answer += "B";
			
		}
		
	
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		int cnt = scan.nextInt();
		int[] arrA = new int[cnt];
		int[] arrB = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			arrA[i] = scan.nextInt();
			
		}
		
		for(int i=0; i<cnt; i++) {
			arrB[i] = scan.nextInt();
		}
		
		System.out.println(main.solution(arrA, arrB));
		
	}
}