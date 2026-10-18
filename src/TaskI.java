import java.util.Scanner;
public class TaskI {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        int count = 0;

        for (int d = 1; d < x; d++) {
            if (x % d == 0) {
                count++;
            }
        }
        count++;
        System.out.println(count);
    }
}
