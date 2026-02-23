import java.util.Arrays;

public class leftRotated {
    
    public static void main(String[] args) {
        
        int[] arr ={10,20,30,40,50};
        int last = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = last;
        System.out.println(Arrays.toString(arr));
        
    }
}
