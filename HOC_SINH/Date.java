package HOC_SINH;

public class Date {
    int ngay ;
    int thang ;
    int nam;
    public Date(){

    }
    public Date(int ngay,int thang , int nam){
        this.ngay=ngay;
        this.thang=thang;
        this.nam = nam;
    }
    public String toString(){
        return ngay+"/"+thang+"/"+nam;
    }
}
