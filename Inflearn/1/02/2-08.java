import java.util.*;

public class Main {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for(int i=0; i<n; i++) {
            int cnt = 1;
            for(int j=0; j<n; j++) {
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();

        int count = scan.nextInt();
        int[] arr = new int[count];

        for(int i=0; i<count; i++) {
            arr[i] = scan.nextInt();
        }

        for(Integer x : main.solution(count, arr)) {
            System.out.print(x +" ");
        }
    }
}