import java.util.Scanner;

public class Pattern7 {
    private static Scanner in() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        int n = in().nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                if (j > ((2 * n) / 2) - (i + 1) && j < ((2 * n) / 2) + i - 1) {
                    if (j < (2 * n) / 2) {
                        System.out.print(" ");
                        System.out.print(((2 * n) / 2) - j + " ");
                    } else {
                        System.out.print(" ");
                        System.out.print(2 + j - ((2 * n) / 2) + " ");
                    }
                } else
                    System.out.print("   ");

            }
            System.out.println();
        }
    }
}