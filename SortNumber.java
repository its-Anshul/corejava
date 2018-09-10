import java.util.Scanner;

class SortNumber<answer> {
    public static String Sortnumber(long a) {

            /*int a;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number:");
            a = s.nextInt();
*/
            int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            /*      Here we are declaring a array which stores number of occurrence of the index
             *       Ex: if arr[2] = 4
             *       then digit 2 has occurred 4 times in the number inputed
             *       then printing it from back for sorting
             *
             * */

            while (a != 0) {
                int b = (int)a % 10;
                a = a / 10;
                arr[b]++;
            }
            String answer=" ";

            System.out.println("Sorted number in non-increasing order : ");
            for (int i = 9; i >= 0; i--) {
                for (int j = 0; j < arr[i]; j++) {
                    answer = answer + " " ;
                }
            }
            int sum = 0;
            //System.out.println("Sum of even numbers :");
            for (int i = 2; i < 9; i = i + 2) {
                sum = sum + i * arr[i];
            }
            answer = answer + " " + sum;
            //System.out.print(sum);
            if (sum > 15)
                answer = answer + " True";
        //System.out.println("True");
            else
                answer = answer + " False";
        //System.out.println("False");
        return answer;
    }

}