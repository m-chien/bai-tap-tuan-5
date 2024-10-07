package baitaptuan5;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mang chua xap sep: ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        xapsep(a, n);
        System.out.println("Mang sau khi xap sep: ");
        show(a, n);
    }

    public static void xapsep(int[] a, int n) {
        int tg;
        for (int t = 0; t < n - 1; t++) {
            for (int s = t + 1; s < n; s++) {
                if (a[t] > a[s]) {
                    tg = a[t];
                    a[t] = a[s];
                    a[s] = tg;
                }
            }
        }
    }

    public static void show(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
