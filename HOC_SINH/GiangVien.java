package HOC_SINH;

public class GiangVien {
    String HoTen;
    int ms;
    public GiangVien(){

    }
    public GiangVien(String h,int m){
        HoTen=h;
        ms=m;
    }
    public String  toString(){
        return "Ho va ten Giang Vien: "+ HoTen+"Ma so Giang Vien: "+ms;
    }
    
}
