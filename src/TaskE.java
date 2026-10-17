import java.util.Scanner;
public class TaskE {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        int sum = 0;

        while (x > 0) {
            int digit = x % 10;
            sum = sum + digit;
            x = x / 10;
        }
            System.out.println(sum);
        }
    }
