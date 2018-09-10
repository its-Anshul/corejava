import java.util.Scanner;

class ReverseString {
    public static void Reversestring() {

            String str;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            str = s.nextLine();
            int len = str.length();
            for (int i = len - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }
}