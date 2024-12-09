package video1_77;public class bai17_vd5 {
    public static void main(String[] args) {
        /*Bài tập Java 16:
        Viết chương trình:
        Tính tổng S= 1!+2!+3!+...+10!*/
        int m=1;
        int tong =0;
        for (int i= 1; i<=10; i++){
            m=i*m;
            tong+=m;
        }
        System.out.println("Tính tổng S= "+tong );
    }
}
