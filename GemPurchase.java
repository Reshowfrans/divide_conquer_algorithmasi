import java.util.Scanner;

public class GemPurchase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum amount of currency (N): ");
        long N = scanner.nextLong();
        
        long maxGems = findMaxGems(N, 1, 0);
        System.out.println(maxGems);
    }

    public static long findMaxGems(long N, long K, long maxK) {
        if (K == 1) {
            maxK = K; // Initialize maxK with 1
        }
        
        long cost = K * (N / K);
        
        if (cost <= N) {
            maxK = K; // Update maxK if we can buy K gems
        }
        
        if (K + 1 <= N) {
            return findMaxGems(N, K + 1, maxK); // Try with the next value of K
        } else {
            return maxK;
        }
    }
}
