import java.util.Scanner;

class RecognizeChar {
    public static void Recognizechar() {

            char a;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a Character:");
            a = s.next().charAt(0);

            if (a < 91 && a > 64)                            //ASCII Value of Capital letters
                System.out.println("Capital Letter");
            else if (a < 123 && a > 96)                            //ASCII Value of small letters
                System.out.println("a small case letter");
            else if (a < 58 && a > 47)                            //ASCII Value of digits
                System.out.print("digit");
            else
                System.out.print("Special Character");


        }
}