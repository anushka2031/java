public class LinearSearch {

    public static void search(int[] arr,int target){
        int found=0;
        int i;

        for(i=0;i<arr.length;i++){
            if(arr[i] == target){
                found=1;
                break;
            }
        }

        if(found == 1)
        System.out.println("Element found at index "+i);
        else
        System.out.println("element not found");
    }

    public static void main(String[] args) {
        int[] arr={22,4,7,6,3,0,12};
        search(arr, 7);
    }
    
}
