package Recursion;

public class Loop {

  public static void loop(int n,int m)
  {
    if (n == 0) {
      return;
    }

    System.out.println(n);
    System.out.println(m);
    
    loop(n - 1, m - 1);
  }
  public static void main(String args[]) {
    loop(6,10);
  }
}