import java.util.*;

public class scoring{
    
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);

        List<Integer> num = new ArrayList<Integer>();
        System.out.print("N: ");
        int N = key.nextInt();
        for(int i =0; i<N;i++){
            int value = key.nextInt();
            num.add(value);
        }
        Integer[] nums = new Integer[num.size()];
        for(int k=0;k<N;k++){
            nums[k] = num.get(k);
        }
        System.out.print("T: ");
        int T = key.nextInt();

        int result = findMaxScore(nums, T, 1, 0);
        System.out.println(result);
    }

    public static int findMaxScore(Integer[] nums, int T, int currentScore, int index) {
        if (index == nums.length) {
            return (currentScore < T) ? currentScore : 0;
        }

        int addScore = findMaxScore(nums, T, currentScore + nums[index], index + 1);
        int multiplyScore = findMaxScore(nums, T, currentScore * nums[index], index + 1);

        return Math.max(addScore, multiplyScore);
    }
}
