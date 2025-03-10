public class SelectionSort {
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String args[]) {
    int arr[] = { 2, 3, 1, 5, 4 };

    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }

    printArray(arr);
  }
}
