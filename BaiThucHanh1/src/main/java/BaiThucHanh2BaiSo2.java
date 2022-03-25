import java.util.Scanner;

public class BaiThucHanh2BaiSo2 {
    public static void main(String[]args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap toa do x: ");
//        int x = scanner.nextInt();
//        System.out.println("Nhap toa do y: ");
//        int y = scanner.nextInt();
//        Diem diem1 = new Diem(x,y);
//        diem1.hienThi();
//        System.out.println();
//        System.out.println("Nhap toa do x: ");
//        x = scanner.nextInt();
//        System.out.println("Nhap toa do y: ");
//        y = scanner.nextInt();
//        Diem diem2 = new Diem(x,y);
//        diem2.hienThi();
//        System.out.println("Nhap toa do x: ");
//        x = scanner.nextInt();
//        System.out.println("Nhap toa do y: ");
//        y = scanner.nextInt();
//        Diem diem3 = new Diem(x,y);
//        diem3.hienThi();
//        System.out.println();
//        System.out.println("Nhap toa do x: ");
//        x = scanner.nextInt();
//        System.out.println("Nhap toa do y: ");
//        y = scanner.nextInt();
//        Diem diem4 = new Diem(x,y);
//        diem4.hienThi();
//        if (Diem.dieuKienSongSong1(diem1,diem2) == Diem.dieuKienSongSong1(diem3,diem4)){
//            System.out.println("2 đoạn này song song");
//        }
//        else System.out.println("2 đoạn này không song song");
//        /////
//        System.out.println("Trung điểm AB ");
//        int xM = (diem1.getX()+ diem2.getX()) / 2;
//        int yM = (diem1.getY()+ diem2.getY()) / 2;
//        Diem M = new Diem(xM,yM);
//        System.out.print("M");
//        M.hienThi();
        Diem A = new Diem(5,3);
        Diem B = new Diem(16,9);
        DoanThang AB = new DoanThang(A,B);
        AB.hienThiDoanThang();
        System.out.println("Độ dài: "+AB.tinhDoDaiDoanThang());
        Diem M = AB.trungDiem();
        M.hienThi();
        Diem C = new Diem(9,3);
        Diem D = new Diem(10,9);
        DoanThang CD = new DoanThang(A,B);
        System.out.print(AB.kiemTraSongSong(CD));
    }
}
