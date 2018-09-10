import java.util.Scanner;

class NumRepeat {
    public static String Numrepeat(int n) {

            /*int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number:");
            n = s.nextInt();
            */
            String answer="";
        for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    answer = answer + i + " ";
                }
            }
            return answer;
        }
}