public class amax2 {

    public static void main(String[] args) {
        int[] a1={1,2,8};
        int[] a2={7,4,9};
        int max=0;
        int max1=0;
        int max2=0;

        for(int i=0;i<a1.length;i++){
            if(a1[i]>max1)
            max1=a1[i];
        }

        for(int j=0;j<a2.length;j++){
            if(a2[j]>max2)
            max2=a2[j];
        }

        if(max1>max2)
         max=max1;
        else
         max=max2;

        System.out.println("Max: "+max);
    }
    
}
