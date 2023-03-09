package HOC_SINH;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Lop {
        String tenLop;
        String GVCN;
        String lopTruong;
        List <HocSinh> list=new ArrayList<HocSinh>();
        int siSo;
        public Lop(){

        }
        public Lop(String tenLop,String GVCN,String lopTruong,List <HocSinh> list){
            this.tenLop=tenLop;
            this.GVCN=GVCN;
            this.list=list;
            this.siSo=list.size();
        }
        public void themHocSinh(HocSinh a){
            list.add(a);
        }
        public void xoaHocSInh(HocSinh a){
            list.remove(a.STT);
        }
        public String getHS(){
            String l="";
            for(HocSinh a : list){
                l=l+a.toString()+"\n\n";
            }
            return l;
        }
        public void setThongtin(HocSinh a){
            for(HocSinh i : list){
                if(a.STT==i.STT){
                    i.setHocSinh(a);
                }
            }
        }
        public void hoanVi(HocSinh x,HocSinh y){
            
            HocSinh f=new HocSinh();
            f.setHocSinh(x);
            x.setHocSinh(y);
            y.setHocSinh(f);
        }
        public void sapXep1(String x){
            for(HocSinh i: list){
                for(HocSinh j: list){
                    if(i.hashCode(x)<j.hashCode(x)){
                        hoanVi(i, j);
                    }
                }
            }
        }
        public void sapXep2(String x){
            for(HocSinh i: list){
                for(HocSinh j: list){
                    if(i.hashCode(x)>j.hashCode(x)){
                        hoanVi(i, j);
                    }
                }
            }
        }
        public int getSS(){
            return siSo;
        }
        public HocSinh getThuHang(int k){
            sapXep1("diemTB");
            return list.get(k-1);
        }
        

}
