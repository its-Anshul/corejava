import java.util.Scanner;

class Palindrome {
    public static void Palindrome() {

            long n;
            long m;
            long a = 0;
            long x;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any number:");
            n = s.nextLong();
            m = n;
            while (n > 0) {
                x = n % 10;
                a = a * 10 + x;
                n = n / 10;
            }
            if (a == m) {
                System.out.print(m + " is Palindrome");
                a = 0;
                while (m > 0) {
                    x = m % 10;
                    if (x % 2 == 0) {
                        a = a + x;
                    }
                    m = m / 10;
                }
                if (a > 25) {
                    System.out.print(" and the sum of even numbers is greater than 25");
                } else {
                    System.out.print(" and the sum of even numbers is less than 25");
                }
            } else {
                System.out.println(m + " is Not Palindrome");
            }

        }
}