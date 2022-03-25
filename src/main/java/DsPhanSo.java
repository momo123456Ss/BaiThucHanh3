import java.util.ArrayList;

public class DsPhanSo {
    private ArrayList<PhanSo> quanly = new ArrayList<>();
    public void   themPhanSo(PhanSo q){
        quanly.add(q);
    }
    public void xoaPhanSo(PhanSo q){
        quanly.remove(q);
    }
    public PhanSo tinhTongDs(){
        PhanSo q =new PhanSo();
        // foreach chi dung trong duyet mang in ra khong tinh toan duoc
        for (int i = 0 ; i < quanly.size() ;i++){
            q = q.cong(quanly.get(i));
        }
        return q;
    }
    public void sapXepTang(){
        quanly.sort((o1, o2) -> {
            double t1 = o1.getTuSo() / o1.getMauSo();
            double t2 = o2.getTuSo()/o2.getMauSo();
            if (t1 > t2)
                return 1;
            else if (t1 < t2)
                return  -1;
            return 0;
        });

    }
    public void hienThiDs(){
        quanly.forEach(fr ->fr.hienThi());
    }

    public ArrayList<PhanSo> getQuanly() {
        return quanly;
    }

    public void setQuanly(ArrayList<PhanSo> quanly) {
        this.quanly = quanly;
    }
}
