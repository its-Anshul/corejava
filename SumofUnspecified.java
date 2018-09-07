import java.util.Scanner;

class SumofUnspecified {
    public static void Sumofunspecified() {

            String a;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            a = s.nextLine();

            int len = a.length();
            int sum = 0;
            String[] arrOfStr = a.split(" ");
            try {
                for (String b : arrOfStr) {
                    int result = Integer.parseInt(b);
                    sum = sum + result;
                }
            } catch (Exception e) {
                System.out.print("Enter only Integers");
            }

            System.out.println(" " + sum);
    }
}