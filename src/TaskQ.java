import java.util.Scanner;
public class TaskQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        for (int x = 1000; x >= 0; x--) {
            if ((((double) a * x + b) * x + c) * x + d == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
