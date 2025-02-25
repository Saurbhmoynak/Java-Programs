public class ClearBit {
  public static void main(String[] args) {
    int n = 10;
    int pos = 3;
    int bitMask = 1 << pos;

    int clearBitNumber = (~(bitMask) & n);

    System.out.println(clearBitNumber);
  }
}
