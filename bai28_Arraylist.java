package video1_77;import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bai28_Arraylist {
    public static void main(String[] args) {
        //1. Khai báo Arraylist
        ArrayList<Integer> lst = new ArrayList<>();
        //2. khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        //3. Khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));

        //Xuất list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        //add thêm phần tử
        ArrayList<Integer> list = new ArrayList<>();
        list.add(213);
        list.add(214);
        list.add(215);//thêm vào cuối danh sách
        System.out.println("Danh sách mới: ");
        System.out.println(list);

        //add(index, element) vào vị trí chỉ định sẵn
        list.add(1,99);
        System.out.println("Danh sách mới khi thêm 99 vào vị trí index 1: ");
        System.out.println(list);

        //size : trả về số phần tử của list
        System.out.println("Số phần tử của list là: "+list.size());//index chạy từ 0 còn size đếm thì đếm từ 1

        //get (int index): trả về giá trị list tại vị trí index
        System.out.println(list.get(3));

        //remove(index) :xóa phần tử tại vị trí index được chỉ định
        list.remove(3);
        System.out.println("Danh sách mới khi xóa giá trị tại vị trí index 3 là: ");
        System.out.println(list);

        //remove(Object o) xóa một phần tử được chỉ định
        ArrayList<Integer> lst4 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        System.out.println("lst4: "+lst4);
        lst4.remove(Integer.valueOf(4));
        System.out.println("lst4: "+lst4);

        //set(index, element): thay đổi thông tin
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        System.out.println("lst5: "+lst5);
        lst5.set(3,88);
        System.out.println("lst5: "+lst5);

        //contains() Kiểm tra collection có chứa phần tử nào đó hay không
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        boolean ktra = lst6.contains(8);
        System.out.println(ktra);

        //Collections.sort(list): Sắp xếp tăng dần
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(15,25,34,4,5,6,76,8,9));
        Collections.sort(lst7);
        System.out.println(lst7);

        //indexOf(): tìm vị trí đầu tiên của element trong list
        //nếu không có trả về -1
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(1,2,3,4,5,7,8,9,9));
        System.out.println(lst8);
        System.out.println(lst8.indexOf(7));

        //DUYỆT LIST
        //Cách 1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(123,34,6,5,7453,636,36));
        System.out.println("List 9 dùng duyệt for: ");
        for (int vl : lst9){
            System.out.println(vl);
        }
        //Cách 2: Khi cần sử dụng đến các chỉ số index
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(123,34,6,5,7453,636,36));
        System.out.println("----------------------------------------");
        for (int i=0; i<lst10.size(); i++){
            int vl = lst10.get(i);
            System.out.println(vl);
        }
    }
}
