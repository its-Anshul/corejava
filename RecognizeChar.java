import java.util.Scanner;

class RecognizeChar {
    public static void Recognizechar() {

            char c;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a Character:");
            c = s.next().charAt(0);

            if (c < 91 && c > 64)                            //ASCII Value of Capital letters
                System.out.println("Capital Letter");
            else if (c < 123 && c > 96)                            //ASCII Value of small letters
                System.out.println("a small case letter");
            else if (c < 58 && c > 47)                            //ASCII Value of digits
                System.out.print("digit");
            else
                System.out.print("Special Character");


        }
}