import java.io.PrintStream;

public class DoanThang {
    private Diem a;
    private Diem b;
    public DoanThang (Diem a,Diem b){
        this.a = a;
        this.b = b;
    }
    public Diem getA() {
        return a;
    }

    public void setA(Diem a) {
        this.a = a;
    }

    public Diem getB() {
        return b;
    }

    public void setB(Diem b) {
        this.b = b;
    }
    public void hienThiDoanThang(){
       System.out.printf("[(%.1f,%.1f),(%.1f,%.1f)]", this.a.getX(), this.a.getY(), this.b.getX(), this.b.getY());
    }
    public double tinhDoDaiDoanThang(){
        return this.a.khoangCachGiuaHaiDiem(this.b);
    }
    public Diem trungDiem(){
        double xM = (this.a.getX() - this.b.getX())/2;
        double yM = (this.a.getY() - this.b.getY())/2;
        return new Diem(xM,yM);
    }
    public boolean kiemTraSongSong(DoanThang a){
        double vt1 = (this.a.getX() - this.b.getX())/(this.a.getY() - this.b.getY());
        double vt2 = (a.a.getX() - a.b.getX())/(a.a.getY() - a.b.getY());
        if (vt1 == vt2) return true;
        return false;
    }
}
