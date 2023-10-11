import java.util.Scanner;

public class RelativesInWill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt(); 
        int G = scanner.nextInt();

        int result = findMinimumAmount(R, G);
        System.out.println(result);

        scanner.close();
    }

    public static long calculateTotalAmount(long M, int R) {
        long totalAmount = 0;
        for (int r = 1; r <= R; r++) {
            totalAmount += (long) M / (r * r + Math.sqrt(M));
        }
        return totalAmount;
    }

    public static int findMinimumAmount(int R, int G) {
        long left = 1;
        long right = 1_000_000_000; // The upper limit for M

        while (left < right) {
            long mid = (left + right) / 2;
            long totalAmount = calculateTotalAmount(mid, R);

            if (totalAmount >= G) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return (int) left;
    }
}
