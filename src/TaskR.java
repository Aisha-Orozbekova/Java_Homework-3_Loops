import java.util.Scanner;
public class TaskR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int count = 0;
        for (long x = 0; x <= 1000; x++) {
            if (x == e) {
                continue;
            }
            long numerator = a * x * x * x + b * x * x + c * x + d;

            if (numerator == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}