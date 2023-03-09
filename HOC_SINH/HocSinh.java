package HOC_SINH;

import java.util.Random;

public class HocSinh{
    String HoTen;
    int STT;
    String Lop;
    Date NgaySinh;
    int VaiTro;
    double diemVan;
    double diemToan;
    double diemAnh;  
    public void setHocSinh(HocSinh a){
        this.HoTen=a.HoTen;
        this.STT=a.STT;
        this.Lop=a.Lop;
        this.NgaySinh=a.NgaySinh;
        this.VaiTro=a.VaiTro;
        diemVan=a.diemVan;
        diemToan=a.diemToan;
        diemAnh=a.diemAnh;
    }
    public HocSinh(String HoTen,int STT, String Lop, Date NgaySinh, int VaiTro,int van,int toan, int anh){
        this.HoTen=HoTen;
        this.STT=STT;
        this.Lop=Lop;
        this.NgaySinh=NgaySinh;
        this.VaiTro=VaiTro;
        diemVan=van;
        diemToan=toan;
        diemAnh=anh;
    }
    public HocSinh(){

    }
    public void setDiem(int van,int toan, int anh){
        diemVan=van;
        diemToan=toan;
        diemAnh=anh;
    }
    public Double diemTB(){
        return (diemToan+diemVan+diemAnh)/3;
    }
    public String getVaiTro(){
        switch(VaiTro){
            case 1: 
                return "Lop Truong";
            case 0:
                return "Hoc Vien";
            case 2:
                return "Lop Pho";
            default: return "khong co trong lop";
        }
    }
    public String toString(){
        return "Ho va ten: "+HoTen+"\nNgay Sinh:"+NgaySinh+"\nSTT: "+STT+"\nLop : "+Lop+"\nVai tro: "+getVaiTro()+"\nDiem Van: "+diemVan+"\nDiem Toan: "+diemToan+"\nDiem Anh:"+diemAnh+"\nDiem Trung Binh: "+diemTB()+"\n";
    }
    public Double hashCode(String x){
        if(x=="STT"){
            return (double)STT;
        }
        if(x=="diemTB"){
            return diemTB();
        }
        return 0.0;
    }



}