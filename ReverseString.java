import java.util.Scanner;

class ReverseString {
    public static String Reversestring(String str) {
/*
            String str;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            str = s.nextLine();
*/
            String answer=" ";
            int len = str.length();
            for (int i = len - 1; i >= 0; i--) {
                answer = answer + str.charAt(i);
            }
            return answer;
        }
}