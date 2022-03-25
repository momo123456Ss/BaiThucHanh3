import java.util.Scanner;

public class BaiThucHanh2Bai1 {
    public static class ToaDo{
        int x;
        int y;
        public static void main(String[] args){
            ToaDo diem1 = new ToaDo();
            NhapToaDo(diem1,1);
            ToaDo diem2 = new ToaDo();
            NhapToaDo(diem2,2);
            System.out.println("Khoảng cách giữa 2 điểm = " + KhoangCach(diem1,diem2));

        }
        public static double KhoangCach(ToaDo diem1,ToaDo diem2){
            double KC = 0;
            KC = Math.sqrt(Math.pow((diem1.x- diem2.x),2) + Math.pow((diem1.y- diem2.y),2));
            return KC;
        }
        public static void NhapToaDo(ToaDo diem, int a)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhậpp tọa độ điểm "  + a);
            System.out.print("Nhập X : ");
            diem.x = sc.nextInt();
            System.out.print("Nhập Y : ");
            diem.y = sc.nextInt();
        }
    }
}
