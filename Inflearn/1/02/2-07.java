import java.util.*;

public class Main {

	public int solution(int[] arr) {
		int answer = 0;
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				cnt ++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(main.solution(arr));
	}
}