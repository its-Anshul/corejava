import java.util.Scanner;

class TomandJerry {
    public static void Tomandjerry() {

            long n;    //Input number
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any number:");
            n = s.nextLong();
            if (n % 2 == 0 && n > 20 && n < 30) {                   //condition checking even number and number between 20-30
                System.out.println("Jerry");
            } else if (n % 2 != 0 && n > 20 && n < 30) {
                System.out.println("Tom");                              //condition checking odd number and number between 20-30
        }
    }
}