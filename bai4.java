import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"]=");
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        int max=0;
        int number=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i]==a[j]) b[i] +=1;
            }
            if (b[i]>max)
            {
                max =b[i];
                number =a[i];
            }
        }
        System.out.println("so xuat hien nhieu nhat la "+number+" voi "+max+" lan xuat hien");
    }
}
