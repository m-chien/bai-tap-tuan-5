package baitaptuan5;

import java.util.Scanner;

public class bai1 {
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
        int sum;
        sum = 0;
        for (i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        System.out.println("Tong cua mang tren la: " + sum);

    }
}
