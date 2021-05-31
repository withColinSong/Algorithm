import java.util.*;

public class backjoon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int c=cnt; c>i; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
