import java.util.*;

public class TwoArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] twoArray = new int[rows][cols];

    //taking input
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        twoArray[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.println(twoArray[i][j]);
      }
    }
  }
}
