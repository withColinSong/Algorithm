import java.util.Scanner;

public class backjoon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        
        for(int i=0; i<cnt; i++) {
            for(int j=0; j<cnt-i; j++) {
                System.out.print(" ");
            }
            for(int c=0; c<=i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}