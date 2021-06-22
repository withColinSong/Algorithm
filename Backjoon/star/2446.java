import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i=0; i<num; i++) {

            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<(2*num-1)-(2*i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=0; i<num-1; i++) {


            for(int j=1; j<(num-1)-i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<3+(2*i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}