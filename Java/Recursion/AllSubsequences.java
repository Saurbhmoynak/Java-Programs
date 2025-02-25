package Recursion;

public class AllSubsequences {
  public static void allSubsequences(String str, int idx, String newString) {
    if (idx == str.length()) {
      System.out.println(newString);
      return;
    }
    char currChar = str.charAt(idx);

    //choose character
    allSubsequences(str, idx + 1, newString+currChar);
    
    //not choose character
    allSubsequences(str, idx+1, newString);
  }
  public static void main(String[] args) {
    String str = "abc";
    allSubsequences(str, 0, "");
  }
}
