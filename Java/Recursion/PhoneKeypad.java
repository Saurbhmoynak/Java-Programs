package Recursion;

public class PhoneKeypad {
  public static String[] keypad = { ".", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

  public static void phoneKey(String str, int idx, String combination) {
    if (idx == str.length()) {
      System.out.println(combination);
      return;
    }
    char currChar = str.charAt(idx);
    //convert string into number
    String map = keypad[currChar - '0'];

    for (int i = 0; i < map.length(); i++) {
      phoneKey(str, idx+1, combination+map.charAt(i));
    }
  }

  public static void main(String[] args) {
    String str = "23";
    phoneKey(str, 0, "");
  }
}
