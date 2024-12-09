package video1_77;public class bai21_hamtrongjava {
    public static void main(String[] args) {
        int kq = cong(1,2,3);
        System.out.println("kết quả = "+kq);

        //goi ham
        abcd("male");
        abcd("sjdjkhsa");
    }
    public static int cong(int x,int y, int z){
        return x+y+z;
    }
    //Hàm thủ tục
    public static void abcd(String gioitinh){
        if (gioitinh.equals("female"))
            System.out.println("Xin chao, toi la nu");
        else if (gioitinh.equals("male"))
            System.out.println("Xin chao, toi la nam");
        else
            System.out.println("Toi la gioi tinh thu 3");
    }
}
