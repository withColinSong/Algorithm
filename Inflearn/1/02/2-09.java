import java.util.*;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum_row , sum_column;

        for(int i=0; i<n; i++) {
            sum_row = sum_column = 0;
            for(int j=0; j<n; j++) {
                sum_row += arr[i][j];
                sum_column += arr[j][i];
            }
            answer=Math.max(answer, sum_row);
            answer=Math.max(answer, sum_column);
        }
        sum_row = sum_column = 0;
        for(int i=0; i<n; i++) {
            sum_row += arr[i][i];
            sum_column += arr[i][n-i-1];
        }
        answer=Math.max(answer, sum_row);
        answer=Math.max(answer, sum_column);

        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
        int count = scan.nextInt();

        int[][] arr = new int[count][count];

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(main.solution(count, arr));
    }
}
