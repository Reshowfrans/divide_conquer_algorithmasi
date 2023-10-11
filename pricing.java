public class pricing{
    // Define a function to calculate f(K) for a given K
    static long f(long K) {
        long sum = 0;
        for (long j = 1; j < K; j++) {
            sum += j * (K / j);
        }
        return sum;
    }

    // Define a function to find the maximum number of gems that can be bought for a given amount of money
    static long maxGems(long N) {
        // Initialize the search space
        long left = 0;
        long right = N;

        while (left < right) {
            // Choose the middle value
            long mid = (left + right + 1) / 2;

            // Calculate f(mid)
            long cost = f(mid);

            if (cost <= N) {
                // If f(mid) is less than or equal to N, update the left bound
                left = mid;
            } else {
                // Otherwise, update the right bound
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        long N = 30;
        long result = maxGems(N);
        System.out.println(result); // Output: 6
    }
}
