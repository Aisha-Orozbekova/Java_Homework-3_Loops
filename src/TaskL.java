import java.util.Scanner;
public class TaskL {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        int x = input.nextInt();
        int result = 0;
        int power = 1;

        while (x > 0) {
            int digit = x % 10;
            result += digit * power;
            power *= 2;
            x /= 10;
        }

        System.out.println(result);
    }
}
