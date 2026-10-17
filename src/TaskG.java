import java.util.Scanner;
public class TaskG {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        int d = 2;

        while (x % d != 0) {
            d++;
        }
        System.out.print(d);
    }
}
