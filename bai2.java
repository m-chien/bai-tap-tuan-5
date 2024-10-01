import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"]=");
            a[i] = sc.nextInt();
        }
        System.out.print("mang chua dao nguoc la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nmang da dao nguoc la: ");
        for (int i = n-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
