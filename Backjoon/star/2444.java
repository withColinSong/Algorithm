import java.util.*;

public class backjoon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();

        for(int i=0; i<cnt; i++) {
            for(int j=cnt; j>i; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<(i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<i+2; j++) {
                System.out.print(" ");
            }
            for(int j=cnt; j>=(i*2)-1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}