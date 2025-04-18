public class amerge {

    
    public static void main(String[] args) {
            int[] arr1={1,2,3,4,5};
            int[] arr2={6,7,8,9,10};
            int a1=arr1.length;
            int a2=arr2.length;
            int[] arr3= new int[ a1+a2];
            for(int i=0; i<arr3.length; i++){
                if(i<a1){
                    arr3[i]=arr1[i];
                }
                else if(i>=a1 || i<=a2){
                    arr3[i]=arr2[i-a1];
                }
            }
            for(int i=0; i<arr3.length; i++)
            System.out.print(arr3[i]+"  ");
    
    }
    
    
}
