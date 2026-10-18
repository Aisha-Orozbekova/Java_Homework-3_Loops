import java.util.Scanner;
public class TaskO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        boolean hasZero = false;

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();

            if (x == 0) {
                hasZero = true;
            }
        }

        if (hasZero) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
