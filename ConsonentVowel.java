import java.util.Scanner;

class ConsonentVowel {
    public static void Consonentvowel() {

            String a;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            a = s.nextLine();

            int len = a.length();
            for (int i = 0; i < len; i++) {
                if ((a.charAt(i) == 'a') || (a.charAt(i) == 'e') || (a.charAt(i) == 'i') || (a.charAt(i) == 'o') || (a.charAt(i) == 'u') || (a.charAt(i) == 'A') || (a.charAt(i) == 'E') || (a.charAt(i) == 'I') || (a.charAt(i) == 'O') || (a.charAt(i) == 'U')) {
                    System.out.print("Vowel ");
                } else {
                    System.out.print("Consonant ");
                }
            }

    }
}