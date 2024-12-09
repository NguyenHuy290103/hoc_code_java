package video1_77;public class bai17_vd6 {
    public static void main(String[] args) {
        /*Bài tập java 17:
        số hoàn hảo là số: Tổng các ước thực của nó bằng chính nó
        ví dụ : 6 = 1+2+3 (6)
        Tìm tất cả những số hoàn thiện trong phạm vi từ 1-1000*/

        //kiểm tra xem 1 số có phải số hoàn hảo hay không
        /*int n=10;
        int tong=0;
        for (int i = 1; i<n; i++){
            if (n%i == 0){
                tong+=i;
            }
        }
        if (tong==n)
            System.out.println(n+" là số hoàn hảo");
        else
            System.out.println(n+" không phải là số hoàn hảo");*/

        //for

        for (int n=1; n<=1000; n++){
            int tong=0;
            for (int i = 1; i<n; i++){
                if (n%i == 0){
                    tong+=i;
                }
            }
            if (tong==n)
                System.out.println(n+" là số hoàn hảo");
        }
    }
}
