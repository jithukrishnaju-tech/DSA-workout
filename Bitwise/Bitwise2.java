//set the k th bit to 1 (if its 1 remains it one if its zero make it one.)

import java.util.Scanner;

public class Bitwise2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int ans = getAns(n, k);
    System.out.println(ans);
  }

  static int getAns(int n, int k) {
    return n | (1 << (k - 1));
  }
}
