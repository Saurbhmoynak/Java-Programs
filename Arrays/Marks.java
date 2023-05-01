package Arrays;

public class Marks {
  public static void main(String[] args) {

    //First way 
    int[] marks = new int[5];

    marks[0] = 97;
    marks[1] = 98;
    marks[2] = 99;

    for (int i = 0; i < 5; i++) {
      System.out.println(marks[i]);
    }

    //second way
    int mark[] = { 99, 98, 97 };


    for (int i = 0; i < 3; i++) {
      System.out.println(mark[i]);
    }
  } 
}
