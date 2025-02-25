package Recursion;

public class RemoveDup {
  public static boolean[] mapArray = new boolean[26];
  public static void removeDuplicate(String str,int idx,String newString) {

    if (idx == str.length()) {
      System.out.println(newString);
      return;
    }

    char currChar = str.charAt(idx);

    if (mapArray[currChar - 'a'] == true) {
      removeDuplicate(str, idx+1, newString);
    } else {
      newString += currChar;
      mapArray[currChar - 'a'] = true;
      removeDuplicate(str, idx+1, newString);
    }
  }

  public static void main(String args[]) {
    String str = "abbccdd";
    removeDuplicate(str, 0,"");
  }
}