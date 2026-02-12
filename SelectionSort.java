import java.util.Arrays;

public class SelectionSort {

    public static int[] Selection(int[] arr){

        for(int i=0;i<arr.length;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        swap(arr,min,i);
        }
        
        return arr;
    }

   public static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    // complexity is n*(n-1)/2 which will then becomes n^2

    public static void main(String[] args) {
        
        int[] arr={11,2,44,33,55,68};
        System.out.println(Arrays.toString(Selection(arr)));
    
    }
}
