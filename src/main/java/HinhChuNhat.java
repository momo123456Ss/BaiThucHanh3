public class HinhChuNhat {
    /////Ox
    private Diem trenBenTrai;
    /////Oy
    private Diem duoiBenPhai;
    public HinhChuNhat(Diem trenBenTrai,Diem duoiBenPhai){
        this.trenBenTrai = trenBenTrai;
        this.duoiBenPhai = duoiBenPhai;
    }
    public Diem getTrenBenTrai() {
        return trenBenTrai;
    }

    public void setTrenBenTrai(Diem trenBenTrai) {
        this.trenBenTrai = trenBenTrai;
    }

    public Diem getDuoiBenPhai() {
        return duoiBenPhai;
    }

    public void setDuoiBenPhai(Diem duoiBenPhai) {
        this.duoiBenPhai = duoiBenPhai;
    }
    private double dienTich(){
        double chieudai = this.duoiBenPhai.getX() - this.trenBenTrai.getX();
        double chieurong = this.trenBenTrai.getY() - this.duoiBenPhai.getY();
        return chieudai*chieurong;
    }
    private double chuVi(){
        double chieudai = this.duoiBenPhai.getX() - this.trenBenTrai.getX();
        double chieurong = this.trenBenTrai.getY() - this.duoiBenPhai.getY();
        return (chieudai+chieurong)*2;
    }
    public void hienThi(){
        System.out.println("Diện tích: " + dienTich());
        System.out.println("Chu vi tích: " + chuVi());
    }
    /////
//    public HinhChuNhat(int diemTrenBenTrai,int diemDuoiBenPhai){
//        this.TrucHoanh = diemDuoiBenPhai;
//        this.TrucTung = diemTrenBenTrai;
//    }
//    public double khoangCachOx(int x){
//        return Math.sqrt(Math.pow((0 - this.TrucHoanh),2) + Math.pow((0 - 0),2));
//    }
//    public double khoangCachOy(int y){
//        return Math.sqrt(Math.pow((0 - 0),2) + Math.pow((0 - this.TrucTung),2));
//    }
//    public double dienTichHinhChuNhat(int x,int y){
//        return (Math.sqrt(Math.pow((0 - this.TrucHoanh),2) + Math.pow((0 - 0),2)))*(Math.sqrt(Math.pow((0 - 0),2) + Math.pow((0 - this.TrucTung),2)));
//    }
//    public double chuViHinhChuNhat(int x,int y){
//        return ((Math.sqrt(Math.pow((0 - this.TrucHoanh),2) + Math.pow((0 - 0),2)))+(Math.sqrt(Math.pow((0 - 0),2) + Math.pow((0 - this.TrucTung),2))))*2;
//    }
//    public int getTrucHoanh(){
//        return TrucHoanh;
//    }
//    public int getTrucTung(){
//        return TrucTung;
//    }
//    public void setTrucHoanh(int x){
//        this.TrucHoanh = x;
//    }
//    public void setTrucTung(int y){
//        this.TrucTung = y;
//    }
}
