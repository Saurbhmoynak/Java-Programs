package Recursion;

public class Permutation {
  public static void permutationOfString(String str, String permutations) {
    if (str.length() == 0) {
      System.out.println(permutations);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char currChar = str.charAt(i);

      String newString = str.substring(0, i) + str.substring(i + 1);

      permutationOfString(newString, permutations+currChar);
    }
  }
  public static void main(String[] args) {
    String str = "abc";
    permutationOfString(str,"");
  }
}
