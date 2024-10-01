import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cau mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"]=");
            a[i] = sc.nextInt();
        }
        int tong=0;
        System.out.println("tong cac phan tu cua mang so nguyen la: ");
        for (int i = 0; i < n; i++) {
            tong+= a[i];
        }
        System.out.println(tong);
    }
}
