import java.util.Scanner;

public class Main {
	public int solution(int[] arr) {
		int answer = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] < arr[i]) {
				answer++;
			}
		}
		
		return answer;
	}
	
    public int solutionTwo(int[] arr) {
        int answer=1, max=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
				answer++;
				System.out.println("answer="+answer+", max="+max);
			}
		}
		
		return answer;
    }

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		int cnt = scan.nextInt();
		int[] arr = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(main.solution(arr));
        System.out.println(main.solutionTwo(arr));
	}
}