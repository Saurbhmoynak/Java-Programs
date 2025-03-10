public class Reverse {
  public static void main(String[] args) {
    // StringBuilder sb = new StringBuilder("Hello");

    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    
    for (int i = 0; i < sb.length() / 2; i++) {
      int front = i;
      int back = sb.length() - 1 - i;

      char frontChar = sb.charAt(front);
      char backChar = sb.charAt(back);

      sb.setCharAt(front, backChar);
      sb.setCharAt(back, frontChar);
    }

    System.out.println(sb.toString());
  }
}
