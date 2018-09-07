import java.util.Scanner;

class SortNumber {
    public static void Sortnumber() {

            int a;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number:");
            a = s.nextInt();

            int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            /*      Here we are declaring a array which stores number of occurence of the index
             *       Ex: if arr[2] = 4
             *       then digit 2 has occured 4 times in the numbmber inputed
             *       then printing it from back for sorting
             *
             * */

            while (a != 0) {
                int b = a % 10;
                a = a / 10;
                arr[b]++;
            }

            System.out.println("Sorted number in non-increasing order : ");
            for (int i = 9; i >= 0; i--) {
                for (int j = 0; j < arr[i]; j++) {
                    System.out.print(i);
                }
            }
            int sum = 0;
            System.out.println("Sum of even numbers :");
            for (int i = 2; i < 9; i = i + 2) {
                sum = sum + i * arr[i];
            }
            System.out.print(sum);
            if (sum > 15)
                System.out.println("True");
            else
                System.out.println("False");

    }
}