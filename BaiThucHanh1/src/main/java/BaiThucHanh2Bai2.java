import java.util.Scanner;

public class BaiThucHanh2Bai2 {
    public static class DoanThang{
        public static class DiemThu1{
            int x,y;
        }
        public static class DiemThu2{
            int x,y;
        }
        public static double KhoangCach(DiemThu1 diem1, DiemThu2 diem2){
            double KC = 0;
            KC = Math.sqrt(Math.pow((diem1.x- diem2.x),2) + Math.pow((diem1.y- diem2.y),2));
            return KC;
        }
        public static double KiemTraSongSong(int x1,int y1,int x2, int y2)
        {
            return (x1-x2)/(y1-y2);
        }
        public static void NhapToaDo(DiemThu1 diem1,DiemThu2 diem2)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhậpp tọa độ điểm "  + 1);
            System.out.print("Nhập X : ");
            diem1.x = sc.nextInt();
            System.out.print("Nhập Y : ");
            diem1.y = sc.nextInt();

            System.out.println("Nhậpp tọa độ điểm "  + 2);
            System.out.print("Nhập X : ");
            diem2.x = sc.nextInt();
            System.out.print("Nhập Y : ");
            diem2.y = sc.nextInt();
        }
        public static void main(String[] args)
        {
            DoanThang AB = new DoanThang();
            DoanThang.DiemThu1 A = new DoanThang.DiemThu1();
            DoanThang.DiemThu2 B = new DoanThang.DiemThu2();
            NhapToaDo(A,B);

            DoanThang CD = new DoanThang();
            DoanThang.DiemThu1 C = new DoanThang.DiemThu1();
            DoanThang.DiemThu2 D = new DoanThang.DiemThu2();
            NhapToaDo(C,D);

            System.out.println("A("+ A.x + "," + A.y + ")");
            System.out.println("B("+ B.x + "," + B.y + ")");
            System.out.println("C("+ C.x + "," + C.y + ")");
            System.out.println("D("+ C.x + "," + D.y + ")");

            System.out.println("Đoạn AB " + KhoangCach(A,B));
            System.out.println("Đoạn CD " + KhoangCach(C,D));

            if (A.x == B.x && A.y == B.y){
                System.out.println("2 Đoạn thẳng song song");
            }
            else if (KiemTraSongSong(A.x,A.y,B.x,B.y) == KiemTraSongSong(C.x,C.y,D.x,D.y)){
                System.out.println("2 Đoạn thẳng trùng nhau");
            }
            else System.out.println("2 Đoạn thẳng không song song");
        }
    }
}
