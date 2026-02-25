public class moveZeros {
    
    public static void main(String[] args) {
        
        int[] arr={0,1,0,12,3};
        int l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[l++] = arr[i];
            }
        }
        // System.out.println(l);
        while (l<arr.length) {
            arr[l++] = 0;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
