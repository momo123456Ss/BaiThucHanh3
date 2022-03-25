import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DanhSachHocVien {
//    private ArrayList<HocVien> hocVienCre = new ArrayList<>();
//    private HocVien diemToan = null;
//    private HocVien diemAnh = null;
//    private HocVien diemVan = null;
//    public void hienThiDanhSachHocVien(){
//        File f = new File("src/main/resources/hocvien.txt");
//        try(Scanner scanner = new Scanner(f)){
//            while (scanner.hasNext()){
//                String hoTen = scanner.nextLine();
//                String queQuan = scanner.nextLine();
//                String ngaySinh = scanner.nextLine();
//                System.out.printf("Họ tên : %s\tQuê quán : %s\tNgày Sinh : %s  \n",hoTen,queQuan,ngaySinh);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//    public void nhapDiemHocVien(){
//        Scanner sc = new Scanner(System.in);
//        File f = new File("src/main/resources/hocvien.txt");
//        try(Scanner scanner = new Scanner(f)){
//            while (scanner.hasNext()){
//                String hoTen = scanner.nextLine();
//                String queQuan = scanner.nextLine();
//                String ngaySinh = scanner.nextLine();
////                layDiemToan();
////                layDiemVan();
////                layDiemAnh();
//                HocVien hocVienCreate = new HocVien(hoTen,queQuan,ngaySinh,layDiemToan());
//                hocVienCre.add(hocVienCreate);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        hocVienCre.forEach(fr->fr.hienThiDaNhapDiem());
//    }
//    public double layDiemToan(){
//        return this.diemToan.nhapDiemToan();
//    }
//    public double layDiemVan(){
//        return this.diemVan.nhapDiemVan();
//    }
//    public double layDiemAnh(){
//        return this.diemAnh.nhapDiemAnh();
//    }
    private List<HocVien> ds = new ArrayList<>();

    public void themHV(HocVien h){
        ds.add(h);
    }

    public void hienThiDanhSach(){
        for (HocVien h : this.ds){
            h.hienThi();
        }
    }

    public void docDsHV(String path) throws FileNotFoundException {
        File f = new File(path);
        try(Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()){
                String hoTen = scanner.nextLine();
                String queQuan = scanner.nextLine();
                String ngaySinh = scanner.nextLine();
                HocVien Hv = new HocVien(hoTen,queQuan,ngaySinh);
                this.ds.add(Hv);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void nhapDiemDsHV(){
        for (HocVien h : this.ds){
            h.nhapDiem();
        }
    }

    public HocVien timKiem(int ma){
        return this.ds.stream().filter(h->h.getMaHV() == ma).findFirst().get();
//        for (HocVien h: this.ds){
//            if (ma == h.getMaHV())
//                return h;
//        }
//        return null;
    }

    public List<HocVien> timKiem(String tuKhoa){
        return this.ds.stream().filter(h->h.getTenHV().contains(tuKhoa) == true || h.getQueQuan().contains(tuKhoa) == true).collect(Collectors.toList());
//        List<HocVien> kq = new ArrayList<>();
//        for (HocVien h : this.ds){
//            if (h.getTenHV().contains(tuKhoa) == true || h.getQueQuan().contains(tuKhoa) == true)
//                kq.add(h);
//        }
//        return kq;
    }

    public void sapXep(){
        this.ds.sort((h1,h2)->h1.soSamh(h2));
    }

    public List<HocVien> xetHocBong(){
        return this.ds.stream().filter(h->h.isHocBong() == true).collect(Collectors.toList());
    }

    public static void xuatHocBong(String path,List<HocVien> hb) throws FileNotFoundException {
        File f = new File(path);
       try (PrintWriter w = new PrintWriter(f)){
           for (HocVien h : hb){
               w.printf("%d - %s - %.1f\n",h.getMaHV(),h.getTenHV(),h.tinhDiem());
           }
       }

    }

    public List<HocVien> getDs() {
        return ds;
    }

    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }
}
