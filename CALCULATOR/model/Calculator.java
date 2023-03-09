package CALCULATOR.model;

public class Calculator {
    public double a=0.0;
    public Calculator(){
        
    }
    public Calculator(int x){
        a=x;
    }
    public void setA(double x){
        a=x;
    }
    
    public double getA(){
        return a*1.0;
    }
    public String toString(){
        return "a = "+a;
    }
    public double add(Double double1){
        return a+double1*1.0;
    }
    public  double sub(Double b){
        return a-b*1.0;
    }
    public double mul(Double b){
        return a*b*1.0;
    }
    public double div(Double b){
        return (double)a/b;
    }
    public double square(){
        return a*a*1.0;
    }
    public double onePerA(){
        return 1.0/a;
    }
    public double percent(int x){
        return a/100.0*x;
    }
    public double doiDau(){
        return -(a);
    }
}
