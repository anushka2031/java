public class subarray {

    public static void main(String[] args) {
        
        int[] arr={1,4,20,3,10,5};
        int target = 33;
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum == target){
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        if(found)
            System.out.println("yes");
        else
            System.out.println("no");

    }

}
