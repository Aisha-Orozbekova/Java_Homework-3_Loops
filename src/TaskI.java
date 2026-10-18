import java.util.Scanner;
public class TaskI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int count = 0;

        for (int d = 1; d <= x / d; d++) {
            if (x % d == 0) {
                if (d == x / d) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }

        System.out.println(count);
    }
}