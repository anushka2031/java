public class BinarySearch {

    
    public static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;  
            }

            if (arr[mid] > target) {
                end = mid - 1;  
            } else {
                start = mid + 1;  
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};  
        int target = 33;  

    
        int result = binarysearch(arr, target);

        
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
