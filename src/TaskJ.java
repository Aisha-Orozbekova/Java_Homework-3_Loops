import java.util.Scanner;
public class TaskJ {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int sum = 0;
        for (int i = 0; i<100; i++) {
            int x = input.nextInt();
            sum += x;
        }
        System.out.println(sum);
    }
}
