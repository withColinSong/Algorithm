import java.util.Scanner;

public class Main {
	public int[] solution(int[] arr) {
		int[] answer = arr;
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2; i<arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		int cnt = scan.nextInt();
		int[] arr = new int[cnt];
		for(Integer i : main.solution(arr)) {
			System.out.println(i);
		}
	}
}