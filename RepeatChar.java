import java.util.Scanner;

class RepeatChar {
    public static void Repeatchar() {

            String str;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            str = s.nextLine();
            System.out.print("Enter a number");
            int x = s.nextInt();
            int len = str.length();
            for (int i = 0; i < len - x; i++) {
                System.out.print(str.charAt(i));
            }
            for (int i = 0; i < x + 1; i++) {
                for (int j = len - x; j < len; j++)
                    System.out.print(str.charAt(j));
            }
        }
}