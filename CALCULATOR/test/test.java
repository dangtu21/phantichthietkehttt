package CALCULATOR.test;

import javax.swing.UIManager;

import CALCULATOR.view.CalculatorView;

public class test {
    public static void main(String[] args) {

        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }catch(Exception ex){
        ex.printStackTrace();
    }
        CalculatorView a =new CalculatorView();
    }
}
