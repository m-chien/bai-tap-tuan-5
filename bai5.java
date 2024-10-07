package baitaptuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();
        System.out.println("Nhap so luong phan tu cua danh sach: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int phanTu = sc.nextInt();
            danhSach.add(phanTu);
        }
        System.out.println("Cac phan tu trong danh sach la: ");
        for (int i = 0; i < n; i++) {
            System.out.println(danhSach.get(i));
        }
        sc.close();
    }
}
