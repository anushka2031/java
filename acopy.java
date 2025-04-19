public class acopy {
    public static void main(String[] args) {
        int[] a1={2,4,6,8};
        int[] a2=new int[a1.length];

        for(int i=0;i<a1.length;i++){
            a2[i] = a1[i];
        }

        System.out.println("Copied Array :");
        for(int i=0;i<a2.length;i++){
            System.out.println(a2[i]);
        }
    }
    
}
