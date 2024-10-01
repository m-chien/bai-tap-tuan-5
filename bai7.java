import java.util.*;

public class bai7 {
    List<student> qlyssinhvien;

    public bai7() {
        this.qlyssinhvien = new ArrayList<>();
    }

    public bai7(List<student> qlyssinhvien) {
        this.qlyssinhvien = qlyssinhvien;
    }
    void themsinhvien(student sv)
    {
        qlyssinhvien.add(sv);
    }
    void xoasinhvien(int ma)
    {
        for (student sv : qlyssinhvien)
            if (ma==sv.getMasv()) qlyssinhvien.remove(sv);
    }
    void timliemtheoma(int ma)
    {
        for (student sv : qlyssinhvien)
            if (ma==sv.getMasv()) sv.indanhsach();
    }
    void nhapthongtin()
    {
        student hs;
        Scanner sc = new Scanner(System.in);
        int chon =1;
        while(chon!=6)
        {
            System.out.println("-----------\nvui long chon: ");
            System.out.println("1. them sinh vien\n2. xoa sinh vien\n3. tim kiem theo ma" +
                    "\n4. sap xep theo diem trung binh\n5. in sinh vien\n6. thoat");
            chon = sc.nextInt();
            switch (chon)
            {
                case 1:
                {
                    hs = new student();
                    hs.nhapdanhsach(sc);
                    themsinhvien(hs);
                    break;
                }
                case 2:
                {
                    hs =new student();
                    System.out.println("nhap ma sinh vien can xoa: ");
                    int ma = sc.nextInt();sc.nextLine();
                    xoasinhvien(ma);
                    break;
                }
                case 3:
                {
                    hs = new student();
                    System.out.println("nhap ma sinh vien can kiem:");
                    int ma = sc.nextInt();sc.nextLine();
                    timliemtheoma(ma);
                    break;
                }
                case 4:
                {
                    hs = new student();
                    sapxep();
                    break;
                }
                case 5:
                {
                    for (student sv : qlyssinhvien)
                    {
                        sv.indanhsach();
                    }
                    break;
                }
                case 6:
                default:
                {
                    hs = new student(); break;
                }
            }
        }
    }
    void sapxep()
    {
        Collections.sort(qlyssinhvien, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return (int) (o2.getDiemtb() - o1.getDiemtb());
            }
        });
        for (student hs : qlyssinhvien)
        {
            hs.indanhsach();
        }
    }
}
class main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bai7 hs = new bai7();
        hs.nhapthongtin();
    }
}
class student{
    protected int masv;
    protected String ten;
    protected double diemtb;

    public int getMasv() {
        return masv;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public student() {
    }
    void nhapdanhsach(Scanner sc)
    {
        System.out.println("nhap ma sinh vien: ");
        masv = sc.nextInt();sc.nextLine();
        System.out.println("nhap ten sinh vien: ");
        ten = sc.nextLine();
        System.out.println("nhap diem cua sinh vien: ");
        diemtb = sc.nextDouble();
    }
    void indanhsach()
    {
        System.out.println("-------------------\nma sinh vien: "+ masv);
        System.out.println("ten sinh vien: "+ten);
        System.out.println("diem: "+diemtb);
    }
}