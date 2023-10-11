
public class minCost {
    
    public static void main(String[] args){
        System.out.println("Min cost to last cell");
        int[][] arr = {{4,7,8,6,4},{6,7,3,9,2},{3,8,1,2,4},{7,1,7,3,7},{2,9,8,9,3}};
        int result = minCost(arr, 4, 4);
        System.out.println(result);
    }

    private static int minCost(int[][] arr, int row, int col){
        if(row == -1 || col == -1){
            return Integer.MAX_VALUE;
        }
        if(row == 0 && col == 0){
            return arr[row][col];
        }
        int option1 = minCost(arr, row-1, col);
        int option2 = minCost(arr, row, col-1);
         int minVal = Integer.min(option1, option2); 
         
          return minVal + arr[row][col];
    }
}
