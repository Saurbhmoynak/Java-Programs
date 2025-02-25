import java.util.Scanner;

public class AltSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] array2 = new int[n];

        int startIndex = 0;
        int lastIndex = n - 1;

        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                array2[j] = array[lastIndex--];
            } else {
                array2[j] = array[startIndex++];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array2[i]);
        }
        
        sc.close(); // Always close the scanner to avoid resource leak
    }
}
