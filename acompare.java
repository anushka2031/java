public class acompare {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int count=0;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
            count=1;
             
        }

        if(count==0)
        System.out.println("Both are equal");
        else 
        System.out.println("not equal");

    }
    
}
