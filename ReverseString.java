import java.util.Scanner;

class ReverseString {
    public static void Reversestring() {

            String a;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            a = s.nextLine();
            int len = a.length();
            for (int i = len - 1; i >= 0; i--) {
                System.out.print(a.charAt(i));
            }
        }
}