package video1_77;import java.util.HashMap;

public class bai29_hasmap {
    public static void main(String[] args) {
        //1. khai báo
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map1 = new HashMap<>();
        //2. thêm phần tử vào Hasmap
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"orange");
        //3. Lấy giá trị của 1 phần tử
        String value = map.get(1);
        String value2 = map.get(2);
        String value3 = map.get(3);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
        //4. Xóa phần tử khỏi Hasmap
        map.remove(1);
        System.out.println(map.get(6));
        //5. Kiểm tra xem một phần tử có tồn tại trong Hasmap hay không
        boolean check = map.containsKey(2);
        System.out.println(check);
        //6. Kiểm tra xem một giá trị có tồn tại trong Hasmap hay không
        boolean check1 = map.containsValue("orange");
        System.out.println(check1);
        //7. Kiểm tra xem Hasmap có rỗng hay không
        boolean check2 = map.isEmpty();
        System.out.println(check2);
        //8. Số lượng phần tử
        int soluong = map.size();
        System.out.println(soluong);
        //Duyệt Hasmap
        for (Integer key: map.keySet()){
            String vl = map.get(key);
            System.out.println(key+": "+vl);
        }
    }
}
