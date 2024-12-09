package video1_77;import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai28_AL_vd4 {
    public static void main(String[] args) {
        /*Java 31: Viết chương trình nhập vào 1 list có n phần tử ngẫu nhiên,
                các phần tử là số nguyên, n nhập từ bàn phím
            #1 in ra có bao nhiêu số nhỏ hơn 80,
            #2 và in ra vị trí index các số đó */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        Random rd = new Random();
        for (int i=0; i<n;i++){
            int ngaunhien = rd.nextInt(0,100);
            lst.add(ngaunhien);
        }
        System.out.println(lst);
        int dem=0;
        String vitri =" ";
        for (int i=0;i<n;i++){
            if (lst.get(i)<80){
                dem++;
                System.out.println(lst.get(i)+" nhỏ hơn 80 và nằm ở vị trí index: "+i);
            }
        }
        System.out.println("Có "+dem+" số nhỏ hơn 80");
    }
}
