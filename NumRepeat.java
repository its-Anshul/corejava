import java.util.Scanner;

class NumRepeat {
    public static void Numrepeat() {

            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number:");
            n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
            }
        }
}