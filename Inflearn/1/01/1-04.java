
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			String temp = new StringBuilder(x).reverse().toString();
			answer.add(temp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		String[] strArray = new String[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("단어를 입력하세요. >> " + (i+1));
			strArray[i] = scan.next();
		}
		
		for(String x : solution(num, strArray)) {
			System.out.println(x);
		}
		
	}
}