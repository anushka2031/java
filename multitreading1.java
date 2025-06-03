//Problem
// class downloadfile{

//     public static void file(String file){
//         for(int i=0;i<=5;i++){
//             System.out.println(file + "downloading..." + (i*20) + "%");
        
//         try {
//             Thread.sleep(2000);
//         } catch (Exception e) {
//         }
//         }
//         System.out.println(file + "done");
//     }
// }

// public class multitreading1 {

//     public static void main(String[] args) {
//            downloadfile obj = new downloadfile();
//            obj.file("file A");
//            obj.file("file B");
//     }
    
// }

//solution
class Filedownload extends Thread{
    String filename;
    public  Filedownload(String filename){
        this.filename=filename;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(filename + "downloading..." + (i*20) + "%");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        }
        System.out.println(filename + "done");
    }
}

public class multitreading1 {

    public static void main(String[] args) {
        Filedownload t1 = new Filedownload("file A");
        Filedownload t2 = new Filedownload("file B");
        t1.start();
        t2.start();
    }
}
