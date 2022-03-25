import java.util.Scanner;

public class BaiThucHanh2BaiSo3 {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập Điểm Trên Bên Trái: ");
//        int y = sc.nextInt();
//        System.out.print("Nhập Điểm Dưới Bên Phải: ");
//        int x = sc.nextInt();
//        HinhChuNhat HCN = new HinhChuNhat(y,x);
//        System.out.println("Khoảng cách từ O đến điểm dưới bên phải là : "+HCN.khoangCachOx(HCN.getTrucHoanh())+"\n");
//        System.out.println("Khoảng cách từ O đến điểm trên bên trái là : "+HCN.khoangCachOy(HCN.getTrucTung())+"\n");
//        System.out.println("Diện tích hình chữ nhật là " + HCN.dienTichHinhChuNhat(HCN.getTrucHoanh(), HCN.getTrucTung()));
//        System.out.println("Chu vi hình chữ nhật là " + HCN.chuViHinhChuNhat(HCN.getTrucHoanh(), HCN.getTrucTung()));
        Diem A = new Diem(5,3);
        Diem B = new Diem(9,2);
        HinhChuNhat AB = new HinhChuNhat(A,B);
        AB.hienThi();

    }
}
