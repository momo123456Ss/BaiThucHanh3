import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestHam {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
//        int choose;
//        do{
            DanhSachHocVien Ds = new DanhSachHocVien();
//            System.out.println("MENU\n1.Hiển thị danh sách\n2.Nhập điểm\n0.Thoat");
//            choose = scanner.nextInt();
//            switch (choose){
//                case 1:
                    Ds.docDsHV("src/main/resources/hocvien.txt");
                    Ds.hienThiDanhSach();
//                break;
//                case 2:
//                    Ds.docDsHV("src/main/resources/hocvien.txt");
        System.out.println("=============================");
                    Ds.nhapDiemDsHV();
                    Ds.hienThiDanhSach();
//                break;
//            }
//        }while (choose >= 1 && choose <= 2);
        System.out.println("=============================");
        List<HocVien> kq = Ds.timKiem("K");
        kq.forEach(h->h.hienThi());
        System.out.println("=============================");
        Ds.sapXep();
        Ds.hienThiDanhSach();
        System.out.println("=============================");
//        List<HocVien> kqHocBong = Ds.xetHocBong();
//        kqHocBong.forEach(h->h.hienThi());
        Ds.xetHocBong().forEach(h->h.hienThi());
        System.out.println("=============================");
        List<HocVien> hb = Ds.xetHocBong();
        DanhSachHocVien.xuatHocBong("src/main/resources/hocbong.txt",hb);
    }
}
