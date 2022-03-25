import java.util.Scanner;

public class BaiThucHanh2BaiSo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tọa độ x của điểm thứ 1 : ");
        int x1 = sc.nextInt();
        System.out.print("Nhập tọa độ y của điểm thứ 1 : ");
        int y1 = sc.nextInt();
        Diem DiemA = new Diem(x1,y1);
        System.out.print("A");
        DiemA.hienThi();
        ///////////////
        System.out.print("Nhập tọa độ x của điểm thứ 2 : ");
        int x2 = sc.nextInt();
        System.out.print("Nhập tọa độ y của điểm thứ 2 : ");
        int y2 = sc.nextInt();
        Diem DiemB = new Diem(x2,y2);
        System.out.print("B");
        DiemB.hienThi();
        /////////////////
        System.out.print(DiemA.khoangCachGiuaHaiDiem(DiemB));
    }
}
