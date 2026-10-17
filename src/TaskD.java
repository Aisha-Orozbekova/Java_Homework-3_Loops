import java.util.Scanner;
public class TaskD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int d = input.nextInt();
        int count = 0;

        while (x > 0) {
            int digit = x % 10;

            if (digit == d) {
                count++;

            }

            x = x / 10;
        }

        System.out.println(count);

    }
}