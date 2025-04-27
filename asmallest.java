public class asmallest {

    static int small(){
        int[] arr={7,8,6,4,2};
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        System.out.println(small());
    }
    
}
