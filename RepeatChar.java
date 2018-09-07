import java.util.Scanner;

class RepeatChar {
    public static void Repeatchar() {

            String a;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            a = s.nextLine();
            System.out.print("Enter a number");
            int x = s.nextInt();
            int len = a.length();
            for (int i = 0; i < len - x; i++) {
                System.out.print(a.charAt(i));
            }
            for (int i = 0; i < x + 1; i++) {
                for (int j = len - x; j < len; j++)
                    System.out.print(a.charAt(j));
            }
        }
}