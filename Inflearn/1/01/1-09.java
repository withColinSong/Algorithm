public class Main {
	public int solution(String str) {
		String answer = "";
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(48 <= c && c <= 57) {
				answer += c;
			}
		}
		
		int out = Integer.parseInt(answer);
		return out;
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(main.solution(input));

	}
}