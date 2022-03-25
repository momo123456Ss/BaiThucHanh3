public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo(){
        this.tuSo = 0;
        this.mauSo = 1;
    }
    public PhanSo(int tu,int mau){
        this.tuSo = tu;
        this.mauSo = mau;
    }
    public int getTuSo(){
        return tuSo;
    }
    public void setTuSo(int tuSo){
        this.tuSo = tuSo;
    }
    public int getMauSo(){
        return mauSo;
    }
    public void setMauSo(int mauSo){
        this.mauSo = mauSo;
    }
    public PhanSo cong(PhanSo p){
        int tu = this.tuSo*p.mauSo + p.tuSo*this.mauSo;
        int mau = this.mauSo*p.mauSo;
        int ucln = PhanSo.gcd(tu, mau);
        tu = tu/ucln;
        mau = mau/ucln;
        if (mau!=1) {
            if (mau < 0) {
                mau = mau - 1;
                tu = tu - 1;
            }
        }
        return new PhanSo(tu,mau);
    }
    public  PhanSo tru(PhanSo p){
        int tu = this.tuSo*p.mauSo - p.tuSo*this.mauSo;
        int mau = this.mauSo*p.mauSo;
        int ucln = PhanSo.gcd(tu, mau);
        tu = tu/ucln;
        mau = mau/ucln;
        if (mau!=1) {
            if (mau < 0) {
                mau = mau - 1;
                tu = tu - 1;
            }
        }
        return new PhanSo(tu,mau);
    }
    public  PhanSo nhan(PhanSo p){
        int tu = this.tuSo*p.tuSo;
        int mau = this.mauSo*p.mauSo;
        int ucln = PhanSo.gcd(tu, mau);
        tu = tu/ucln;
        mau = mau/ucln;
        if (mau!=1) {
            if (mau < 0) {
                mau = mau - 1;
                tu = tu - 1;
            }
        }
        return new PhanSo(tu,mau);
    }
    public  PhanSo chia(PhanSo p){
        int tu = this.tuSo*p.mauSo;
        int mau = this.mauSo*p.tuSo;
        int ucln = PhanSo.gcd(tu, mau);
        tu = tu/ucln;
        mau = mau/ucln;
        if (mau!=1) {
            if (mau < 0) {
                mau = mau - 1;
                tu = tu - 1;
            }
        }
        return new PhanSo(tu,mau);
    }
    private static int soSanh(PhanSo p1,PhanSo p2)
    {
        double PhanSo1 = p1.tuSo/p1.mauSo;
        double PhanSo2 = p2.tuSo/p2.mauSo;
        if (PhanSo1 > PhanSo2) return 1;
        else if (PhanSo1 < PhanSo2) return -1;
        else return 0;
    }
    public static void KetQuaSoSanh(PhanSo p1,PhanSo p2){
        if (soSanh(p1,p2) == 1)
            System.out.print("\nPhân số thứ 1 lớn hơn phân số thứ 2\n");
        if (soSanh(p1,p2) == -1)
            System.out.print("\nPhân số thứ 1 nhỏ hơn phân số thứ 2\n");
        if (soSanh(p1,p2) == 0)
            System.out.print("\nPhân số thứ 1 bằng hơn phân số thứ 2\n");
    }
    public void hienThi(){
        System.out.printf("Phân số : %d/%d\n",this.tuSo,this.mauSo);
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public  PhanSo rutGon(){
        int tu = 0 , mau =1;
        int ucln = PhanSo.gcd(tu, mau);
        tu = tu/ucln;
        mau = mau/ucln;
        if (mau!=1) {
            if (mau < 0) {
                mau = mau - 1;
                tu = tu - 1;
            }
        }
        return new PhanSo(tu,mau);
    }
}
