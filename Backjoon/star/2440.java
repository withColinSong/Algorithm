import java.util.Scanner;

public class backjoon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
           for(int i=5; i>0; i--) {
               for(int j=0; j<i; j++) {
                   System.out.print("*");
               }
               System.out.println();
           }
    }
}
