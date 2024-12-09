package video1_77;import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai28_AL_vd5 {
    public static void main(String[] args) {
        /*Java 32: Cho list lst={1,9,3,14,5,27,8}
        Viết chương trình in số lớn thứ 2 và số nhỏ thứ 2 trong list
                # 2: in ra vị trí index số đó
                  đáp án:
                  # Số lớn thứ 2: 3
                  # Số nhỏ thứ 2: 14
                       #Vị trí index của số lớn thứ 2: 1
                       #Vị trí index của số nhỏ thứ 2: 3*/
        ArrayList<Integer> lst = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        ArrayList<Integer> copy = new ArrayList<>(lst);
        Collections.sort(copy);
        System.out.println(copy);
        int n = copy.size();
        int min = copy.get(1);//Số nhỏ thứ 2: 3
        int max = copy.get(n-2);//Số lớn thứ 2: 14
        System.out.println(min);
        System.out.println(max);
        System.out.println(lst.indexOf(min));
        System.out.println(lst.indexOf(max));
    }
}
