package baitaptuan5;

import java.util.Scanner;

public class bai4 {
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
        show(a, n);
        xapsep(a, n);
        System.out.println("Mang sau khi xap sep: ");
        show(a, n);
        int mostFrequent = dem(a, n);
        System.out.println("Phan tu xuat hien nhieu nhat la: " + mostFrequent);
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

    public static int dem(int[] a, int n) {
        int max = 1;
        int dem = 1;
        int ptu = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                dem++;
            } else {
                if (dem > max) {
                    max = dem;
                    ptu = a[i - 1];
                }
                dem = 1;
            }
        }
        if (dem > max) {
            max = dem;
            ptu = a[n - 1];
        }

        return ptu;
    }
}
