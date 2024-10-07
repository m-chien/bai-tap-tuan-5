package baitaptuan5;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n, i;
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu: " + i);
            a[i] = sc.nextInt();
        }
        System.out.println("Mang chua dao nghich: ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Mang da dao nghich: ");
        for (i = n - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
