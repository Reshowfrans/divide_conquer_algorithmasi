public class HouseRober{
    

    public static void main(String[] args){
        System.out.println("House Robber!!!");
        int[] houseVal= {6,7,1,30,8,2,4};
        int result = maxVal(houseVal, 0);
        System.out.println("Maximum Value: "+ result);
    }

    private static int maxVal(int[] houseVal, int curentHouse){
        if(curentHouse>=houseVal.length){
            return 0;
        }
        
        int first = houseVal[curentHouse] + maxVal(houseVal, curentHouse+2);
        int second = maxVal(houseVal, curentHouse+1);
        
        return Math.max(first, second);
    }
}
