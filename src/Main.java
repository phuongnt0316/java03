import Demo1.SinhVien1;public class Main {
    public static void main(String[] args) {
        SinhVien1.SinhVien sv=new SinhVien1.SinhVien("SV01","Phuong",1997);
        System.out.println("Ma SV: "+sv.getMaSV()+" Ho ten: "+ sv.getHoTen()+" Nam sinh: "+ sv.getNamSinh());
        SinhVien1.SinhVien sv1=new SinhVien1.SinhVien();
        System.out.println("Ma SV: "+sv1.getMaSV()+" Ho ten: "+ sv1.getHoTen()+" Nam sinh: "+ sv1.getNamSinh());
    }
}