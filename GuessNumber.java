import java.util.Scanner;

class GuessNumber {
    public static void Guessnumber() {

            int n = 62;
            int a;
            do {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a number:");
                a = s.nextInt();
                if (a > n)
                    System.out.println("Number guessed is more than original number");
                else if (a < n)
                    System.out.println("Number guessed is less than original number");
                else
                    System.out.println("Number guessed matches original number");
            } while (a != n);
        }
}