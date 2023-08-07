public class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    public SinhVien(){

    }
    public SinhVien(String hoTen, String maSV,int namSinh){
    this.hoTen=hoTen;
    this.maSV=maSV;
    this.namSinh=namSinh;
    }
    public String getMaSV(){
        return maSV;
    }
    public String getHoTen(){
        return hoTen;
    }
    public int getNamSinh(){
        return namSinh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public void setNamSinh(int namSinh){
        this.namSinh=namSinh;
    }
}
