public class aunique {

    public static void main(String[] args) {
        int[] a1={1,2,3,4};
        int[] a2={3,5,6,7};

        System.out.println("unique elements");
        for(int i=0;i<a1.length;i++){
            int found=0;
            for(int j=0;j<a2.length;j++){
                if(a1[i] == a2[j]){
                    found=1;
                    break;
                }
            }
            if(found!=1){
                System.out.println(a1[i]);
            }
        }

        for(int i=0;i<a2.length;i++){
            int found=0;
            for(int j=0;j<a1.length;j++){
                if(a1[i] == a2[j]){
                    found=1;
                    break;
                }
            }
            if(found!=1){
                System.out.println(a2[i]);
            }
        }
    }
    
}
