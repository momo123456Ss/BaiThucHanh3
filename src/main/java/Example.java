import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        int tu = 0,mau = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số : ");
        tu = sc.nextInt();
        System.out.println("Nhập mẫu số : ");
        mau = sc.nextInt();
        PhanSo ps1 = new PhanSo(tu,mau);
        ps1.hienThi();
        System.out.printf("\n" + "Ước chung lớn nhất của là %d\n",PhanSo.gcd(ps1.getTuSo(), ps1.getMauSo()));
        ////////////////////////////////
        System.out.println("Nhập tử số : ");
        tu = sc.nextInt();
        System.out.println("Nhập mẫu số : ");
        mau = sc.nextInt();
        PhanSo ps2 = new PhanSo(tu,mau);
        ps2.hienThi();
        System.out.printf("\n" + "Ước chung lớn nhất của là %d\n",PhanSo.gcd(ps2.getTuSo(), ps2.getMauSo()));
        /////////////////////////////////
        PhanSo KQCong = ps1.cong(ps2);
        System.out.println("\nKết quả cộng 2 phân số");
        KQCong.hienThi();
        /////////////////////////////////
        PhanSo KQTru = ps1.tru(ps2);
        System.out.println("\nKết quả trừ 2 phân số");
        KQTru.hienThi();
        /////////////////////////////////
        PhanSo KQNhan = ps1.nhan(ps2);
        System.out.println("\nKết quả nhân 2 phân số");
        KQNhan.hienThi();
        /////////////////////////////////
        PhanSo KQChia = ps1.chia(ps2);
        System.out.println("\nKết quả chia 2 phân số");
        KQChia.hienThi();
        ////////////////////////////////
        PhanSo.KetQuaSoSanh(ps1,ps2);
    }
    public static void RutGon(PhanSo ps){
        int ucln = PhanSo.gcd(ps.getTuSo(), ps.getMauSo());
        int tu = ps.getTuSo()/ucln;
        int mau = ps.getMauSo()/ucln;
        if (mau!=1)
        {
            if (mau<0){
                mau = mau-1;
                tu = tu-1;
            }
            System.out.printf("Phân số rút gọn %d/%d \n",tu,mau);
        }
        else{
            System.out.printf("Phân số rút gọn %d \n",tu);
        }
    }
}
