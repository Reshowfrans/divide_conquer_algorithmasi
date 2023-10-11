import java.util.Random;

public class mergeSort{
    

    public static void main(String[] args){
        //int[] myArray = {2,5,3,5,8,9,4,6,3,4,8,9,7,6,3,3,5,7,8,9,9,6,3,1,8,3,5,3,2,4,85,8};
        //int[] result = merge(myArray);
        int arraySize = 10000000; // Size of the array

        int[] results = generateLargeArray(arraySize);
        int[] result = merge(results);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
    }

    public static int[] merge(int[] inputArray){

        int length = inputArray.length;

        if(length<2){
            return inputArray;
        }

        int midpoint = length/2;
        int[] left = new int[midpoint];
        int[] right = new int[length -  midpoint];

        for (int i = 0; i < midpoint; i++) {
            left[i] = inputArray[i];
        }
        for (int i = midpoint; i < length; i++) {
            right[i - midpoint] = inputArray[i];
        }

        merge(left);
        merge(right);


        int[] merged = merged(inputArray, left, right);
        return  merged;
    }

    public static int[] merged(int[] inputArray, int[] left, int[] right){
        int inputlength = inputArray.length;
        int leftlength = left.length;
        int rightlength = right.length;
        int l=0, m=0, k=0;
    
        while(m < leftlength && k < rightlength){
            if(left[m] < right[k]){
                inputArray[l] = left[m];
                m++;
            }
            else{
                inputArray[l] = right[k];
                k++;
            }
            l++;
        }
    
        while(m < leftlength){
            inputArray[l] = left[m];
            m++;
            l++;
        }
    
        while(k < rightlength){
            inputArray[l] = right[k];
            k++;
            l++;
        }
    
        return inputArray;
    }

    
    public static int[] generateLargeArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000); // Generate random integers between 0 and 999,999
        }

        return array;
    }

}
