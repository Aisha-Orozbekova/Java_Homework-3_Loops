import java.util.Scanner;
public class TaskH {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        for (int d = 1; d<= x; d++) {
            if (x % d == 0) {
                System.out.print (d + " ");

            }
            if (d == x) {
                break;
            }
        }
    }
}
