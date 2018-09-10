import java.util.Scanner;

class TomandJerry {
    public static String Tomandjerry(long n) {

            /*long n;    //Input number
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any number:");
            n = s.nextLong();
            */
            String answer = "";
            if (n % 2 == 0 && n > 20 && n < 30) {                   //condition checking even number and number between 20-30
                answer = "Jerry";
            } else if (n % 2 != 0 && n > 20 && n < 30) {
                answer = "Tom";                              //condition checking odd number and number between 20-30
        }
        return answer;
    }
}