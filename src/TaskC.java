import java.util.Scanner;
public class TaskC {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = 0; i <= Math.sqrt(b); i++) {
            int square = i * i;

            if (square >= a) {
                System.out.println(square + " ");
            }
         }
    }
}