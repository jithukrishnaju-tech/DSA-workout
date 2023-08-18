import java.util.Scanner;

public class Bitwise1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int ans = getAns(n, k);
    System.out.println(ans);
    in.close();
  }

  static int getAns(int n, int k) {
    return n & (1 << (k - 1));
  }
}
