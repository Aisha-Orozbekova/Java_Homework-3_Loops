import java.util.Scanner;
public class TaskF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String reversed = " ";

        while (x > 0) {
            int digit = x % 10;

            if (digit != 0 || !reversed.isEmpty()) {
                reversed = reversed + digit;
            }
            x = x / 10;
        }
        System.out.println(reversed);
    }
}
