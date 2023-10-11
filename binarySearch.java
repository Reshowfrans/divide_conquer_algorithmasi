public class binarySearch{

    public static void main(String[] args){
        System.out.println("Binary Search!!!!!!");

        int[] arr = {1,2,3,5,6,7,9,11,15,18,19,23,27,55,91,101};
        int index = binarySearch(arr, 5);

        System.out.println("Value at position: " + index);

    }

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;

        while(low<=high){
            int midpoint = (low+high)/2;
            int midNumber = arr[midpoint];

            if(midNumber == target){
                return midpoint;
            }
            if(midNumber<target){
               low = midpoint+1;
            }else{
                high = midpoint-1;
            }
        }
        return -1;
    }
    
}
