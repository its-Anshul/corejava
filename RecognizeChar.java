import java.util.Scanner;

class RecognizeChar {
    public static String Recognizechar(char c) {

            /*char c;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a Character:");
            c = s.next().charAt(0);
*/
            String answer = "";
            if (c < 91 && c > 64)                            //ASCII Value of Capital letters
                answer = "Capital Letter";
            else if (c < 123 && c > 96)                            //ASCII Value of small letters
                answer = "a small case letter";
            else if (c < 58 && c > 47)                            //ASCII Value of digits
                answer = "digit";
            else
                answer = "Special Character";

        return answer;
        }
}