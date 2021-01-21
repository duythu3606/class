public class MARK {
    String Monhoc;
    float diemLT;
    float diemTH;
    float diemTB;

    public MARK(String monhoc, float diemLT, float diemTH) {
        Monhoc = monhoc;
        this.diemLT = diemLT;
        this.diemTH = diemTH;

    }
    public float TinhDTB(){
        diemTB = (diemLT+diemTH)/2;
        return 0;
    }
    public void print(){
        System.out.println(" Mon hoc " +Monhoc +" \nDiem LT " + diemLT +"\nDiem TH"+diemTH + "\nDiem TB"+diemTB);
    }
}
