import java.util.Scanner;
public class TaskS {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int printedCount = 0;
        int currentNumber = 1;

        while (printedCount < n) {
            for (int i = 0; i < currentNumber && printedCount < n; i++) {
                System.out.print(currentNumber + " ");
                printedCount++;
            }
            currentNumber++;
        }
    }
}

