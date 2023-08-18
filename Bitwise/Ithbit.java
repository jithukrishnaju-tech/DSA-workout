public class Main(){
public static void main(String[] args) {
        int n=13;
        int k=1;
        int ans = getAns(n,k);
        System.out.println(ans);
        }
           static int getAns(int n, int k) {
        return n & (1 << (k-1));
    }
}