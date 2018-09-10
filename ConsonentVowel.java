import java.util.Scanner;

class ConsonentVowel {
    public static void Consonentvowel() {

            String str;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            str = s.nextLine();

            int len = str.length();
            for (int i = 0; i < len; i++) {
                if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u') || (str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O') || (str.charAt(i) == 'U')) {
                    System.out.print("Vowel ");
                } else {
                    System.out.print("Consonant ");
                }
            }

    }
}