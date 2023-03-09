package HOC_SINH;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class test {
    public static void main(String[] args) {
        //Khoi tao danh sach hoc sinh
        List <HocSinh> Hoc_sinh=new ArrayList<HocSinh>();
        for(int i=0;i<4;i++){
            HocSinh a= new HocSinh(i+"Dang Anh Tu",i,"DCT121C2",new Date(10,05,2003),1,9,9,9);
            Hoc_sinh.add(a);
        }
        //Khoi tao lop hoc
        Lop lop1=new Lop("DT121C2", "HOA","Quynh anh", Hoc_sinh);
        //Khoi tao mot hoc sinh
        HocSinh b= new HocSinh("3Dang Anh Tu",10,"DCT121C2",new Date(10,05,2003),1,40,9,9);
        //Them mot hoc sinh
        //lop1.themHocSinh(b);
        //Xoa mot hoc sinh 
        //lop1.xoaHocSInh(b);
        //Sua thong tin hoc sinh
        //lop1.setThongtin(b);
        //Sap xep thu hang;
        //lop1.sapXep2("diemTB");
        //Xuat danh sach hoc sinh theo stt
        //lop1.sapXep2("STT");
        System.out.println(lop1.getHS());
        //Hoc sinh hang k
        //System.out.println(lop1.getThuHang(2));
        
    }
}
