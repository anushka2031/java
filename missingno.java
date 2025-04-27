public class missingno {

    static int missing(){
        int[] arr={1,2,4,5};
        int n=5;
        int s=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int d=s-sum;
        return d;
    }

    public static void main(String[] args) {
        System.out.println("The missing no is "+missing());
    }
    
}
