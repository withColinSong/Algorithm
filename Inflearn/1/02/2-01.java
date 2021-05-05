import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public ArrayList<Integer> solution(int cnt, int[] cntArr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(cntArr[0]);
		
		for(int i=1; i<cnt; i++) {
			if(cntArr[i] > cntArr[i-1]) answer.add(cntArr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		int cnt = scan.nextInt();
		int[] cntArr = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			cntArr[i] = scan.nextInt();
		}
		
		for(Integer result : main.solution(cnt, cntArr)) {
			System.out.print(result+ " ");
		}
	}
}