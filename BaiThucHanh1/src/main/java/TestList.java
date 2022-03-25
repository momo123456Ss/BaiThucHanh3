import java.util.Scanner;

public class TestList {
    public static void main(String[] args){
        DsPhanSo a = new DsPhanSo();
        System.out.println("Nhap vao so phan tu mang ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PhanSo p = new PhanSo(16,7);
        for(int i = 0 ;i<n;i++)
        {
            PhanSo q = new PhanSo((int)(1+Math.random()*20),(int)(1+Math.random()*20));
            a.themPhanSo(q);
        }
        System.out.println("Cac phan tu trong mang : ");
        a.hienThiDs();
        System.out.println("Them vao mot phan so ");
        a.themPhanSo(p);
        a.hienThiDs();
        System.out.println("Xoa mot phan so ");
        a.xoaPhanSo(p);
        a.hienThiDs();
        PhanSo Tong = new PhanSo();
        Tong = a.tinhTongDs();
        System.out.print("Tong cac phan so trong mang : " );
        Tong.hienThi();
        System.out.println("Cac phan so trong mang : ");
        a.sapXepTang();
        a.hienThiDs();
    }
}
