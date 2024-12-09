package video1_77;public class bai26_vdgiaibai19 {
    public static void main(String[] args) {
        /*Java 19: Cho: String str1= "English = 78 Science = 83 Math = 68 History = 65"
        1. tính tổng các số trong chuỗi trên
        2. tính trung bình cộng*/
        String str1= "English = 78 Science = 83 Math = 68 History = 65";
        int tong = 0;
        int dem =0;
        //Sử dụng split tách chuỗi sang dạng mảng
        String[] mang = str1.split(" ");
        //Sử dụng hàm parseInt() để ép kiểu
        //buộc ép kiểu sang số nguyên
        for (String pt: mang){
            //hiển thị từng phần tử trong mảng
            System.out.println(pt);
            //Sử dụng try catch để buộc ép kiểu
            try {
                // Chuyển chuỗi sang số nguyên bằng phương thức parseInt() của lớp Integer
                int a = Integer.parseInt(pt);
                tong+=a;
                dem++;
            }catch (NumberFormatException exception){
                //không làm gì cả
            }
        }
        //tính trung bình cộng
        double tbc = (double) tong/dem;
        System.out.println("Tổng của các số có trong chuỗi là: "+tong);
        System.out.println("Trung bình cộng của các số có trong chuỗi là: "+tbc);
    }
}
