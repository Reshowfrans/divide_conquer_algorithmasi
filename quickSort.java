public class quickSort {

    public static void main(String[] args){
        System.out.println("Hello");

        int[] arr = {2,3,2,2,3,6,8,7,9,9,9,6,4,5,7,6,2,3,4,5,6,3,4,6,6,4,5,8};
        quickSort(arr, 0, arr.length-1);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ ",");
        }
    }

    public static void quickSort(int[] arr, int lowerBound, int higherBound){

        if(lowerBound>=higherBound){
            return;
        }
        int pivot = arr[higherBound];
        int leftPointer = lowerBound;
        int rightPointer = higherBound;

        while(leftPointer<rightPointer){
            while(arr[leftPointer]<=pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer --;
            }
            swap(arr,leftPointer,rightPointer);
        }
            swap(arr,leftPointer,higherBound);
        quickSort(arr, lowerBound, leftPointer-1);
        quickSort(arr, leftPointer+1, higherBound);

        
    }

    public static void swap(int[] arr,int index1,int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
    
}
