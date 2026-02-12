import java.util.Arrays;

public class insertionSort {

    public static int[] Sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        return arr;
    }
    
    public static void main(String[] args) {

        int[] arr={22,1,2,0,4,12};
        System.out.println(Arrays.toString(Sort(arr)));

    }
}
