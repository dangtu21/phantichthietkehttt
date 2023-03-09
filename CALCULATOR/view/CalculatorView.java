package CALCULATOR.view;
import java.awt.*;
import javax.tools.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.tools.Tool;
import javax.swing.event.*;

import CALCULATOR.model.Calculator;

public class CalculatorView extends JFrame{
    Calculator a;
    String x="";
    String pheptinh="+";
    JLabel jlLabel=new JLabel();
    JLabel jlLabel1=new JLabel();
    public CalculatorView(){
        a=new Calculator();
        this.init();
    }
    public void init(){
        this.setTitle("Calculator");
         
        this.setSize(335,540);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    
        jlLabel.setText(a.getA()+" ");
        Font font3 = new Font("Arial", Font.PLAIN, 16);
        Font font = new Font("Arial", Font.BOLD, 40);
        jlLabel.setFont(font);
        jlLabel1.setFont(font3);
        jlLabel.setHorizontalAlignment(JLabel.RIGHT);
        jlLabel1.setHorizontalAlignment(JLabel.RIGHT);
        jlLabel.setPreferredSize(new Dimension(330,90));
        jlLabel1.setPreferredSize(new Dimension(330,40));
        
        URL urlIconNotepad= CalculatorView.class.getResource("MenuIcont.png");
        ImageIcon img=new ImageIcon( Toolkit.getDefaultToolkit().createImage(urlIconNotepad));
        URL urlIconNotepad1= CalculatorView.class.getResource("icon1.jpg");
        Image img1= Toolkit.getDefaultToolkit().createImage(urlIconNotepad1);
        this.setIconImage(img1);
        Image scaledImage = img.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon scaledImg = new ImageIcon(scaledImage);
        JPanel jPanel_menu=new JPanel();
        JButton jButton_menu=new JButton(scaledImg);
        jButton_menu.setPreferredSize(new Dimension(40,40));
        jPanel_menu.add(jButton_menu);
        JLabel jLabel_Standard=new JLabel("Standard");
        Font font2 = new Font("Arial", Font.BOLD, 20);
        
        jLabel_Standard.setFont(font2);
        jPanel_menu.add(jLabel_Standard);
        jPanel_menu.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel jPanel_head=new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jlLabel1,BorderLayout.NORTH);
        jPanel_head.add(jlLabel,BorderLayout.CENTER);
        JButton jButton_0 = new JButton("0");
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        JButton jButton_6 = new JButton("6");
        JButton jButton_7 = new JButton("7");
        JButton jButton_8 = new JButton("8");
        JButton jButton_9 = new JButton("9");
        JButton jButton_add = new JButton("+");
        JButton jButton_sub = new JButton("-");
        JButton jButton_mul = new JButton("X");
        JButton jButton_div= new JButton(":");
        JButton jButton_end=new JButton("=");
        jButton_end.setBackground(Color.GREEN);
        JButton jButton_DOI=new JButton("+/-");
        JButton jButton_cham=new JButton(".");
        JButton jButton_phantram= new JButton("%");
        JButton jButton_tamxoa= new JButton("CE");
        JButton jButton_xoahet= new JButton("C");
        JButton jButton_xoa1= new JButton("<x");
        JButton jButton_mot=new JButton("1/X");
        JButton jButton_binhphuong=new JButton();
        jButton_binhphuong.setText("<html>x<sup>2</sup></html>");
        JButton jButton_canbac=new JButton("/x");
        jButton_canbac.setText("<html>&radic;x</html>");
        Font font1 = new Font("Arial",Font.PLAIN, 16);
        jButton_0 .setFont(font1); 
       jButton_1 .setFont(font1); 
       jButton_2 .setFont(font1); 
       jButton_3 .setFont(font1); 
       jButton_4 .setFont(font1); 
       jButton_5 .setFont(font1); 
       jButton_6 .setFont(font1); 
       jButton_7 .setFont(font1); 
       jButton_8 .setFont(font1); 
       jButton_9 .setFont(font1); 
       jButton_add .setFont(font1); 
       jButton_sub .setFont(font1); 
       jButton_mul .setFont(font1); 
       jButton_div.setFont(font1); 
       jButton_end.setFont(font1);
       jButton_DOI.setFont(font1);
        jButton_cham.setFont(font1);
        jButton_phantram.setFont(font1); 
        jButton_tamxoa.setFont(font1); 
        jButton_xoahet.setFont(font1); 
        jButton_xoa1.setFont(font1); 
        jButton_mot.setFont(font1);
        jButton_binhphuong.setFont(font1);
        jButton_canbac.setFont(font1);
        JPanel jPanel_button=new JPanel();
        jPanel_button.setLayout(new GridLayout(6,4));
        jPanel_button.add(jButton_phantram);
        jPanel_button.add(jButton_xoahet);
        jPanel_button.add(jButton_tamxoa);
        jPanel_button.add(jButton_xoa1);
        jPanel_button.add(jButton_mot);
        jPanel_button.add(jButton_binhphuong);
        jPanel_button.add(jButton_canbac);
        jPanel_button.add(jButton_div);
        jPanel_button.add(jButton_7);
        jPanel_button.add(jButton_8);
        jPanel_button.add(jButton_9);
        jPanel_button.add(jButton_mul);
        jPanel_button.add(jButton_4);
        jPanel_button.add(jButton_5);
        jPanel_button.add(jButton_6);
        jPanel_button.add(jButton_sub);
        jPanel_button.add(jButton_1);
        jPanel_button.add(jButton_2);
        jPanel_button.add(jButton_3);
        jPanel_button.add(jButton_add);
        jPanel_button.add(jButton_DOI);
        jPanel_button.add(jButton_0);
        jPanel_button.add(jButton_cham);
        jPanel_button.add(jButton_end);
        jButton_add.addActionListener(new AddListener());
        jButton_sub.addActionListener(new SubListener());
        jButton_mul.addActionListener(new MulListener());
        jButton_div.addActionListener(new DivListener());
        jButton_0.addActionListener(new _0Listener());
        jButton_1.addActionListener(new _1Listener());
        jButton_2.addActionListener(new _2Listener());
        jButton_3.addActionListener(new _3Listener());
        jButton_4.addActionListener(new _4Listener());
        jButton_5.addActionListener(new _5Listener());
        jButton_6.addActionListener(new _6Listener());
        jButton_7.addActionListener(new _7Listener());
        jButton_8.addActionListener(new _8Listener());
        jButton_9.addActionListener(new _9Listener());
        jButton_end.addActionListener(new endListener());
        jButton_cham.addActionListener(new chamListener());





 


        this.setLayout(new BorderLayout());
        JPanel containerJPanel=new JPanel();
        containerJPanel.setLayout(new BorderLayout());
        containerJPanel.add(jPanel_head,BorderLayout.NORTH);
        containerJPanel.add(jPanel_button,BorderLayout.CENTER);
        this.add(jPanel_menu,BorderLayout.NORTH);
        this.add(containerJPanel,BorderLayout.CENTER);
        this.setVisible(true);
    }
    public void Calculator1(){
        switch(pheptinh){
            case "+":
                System.out.print(x);
                a.setA(a.add(Double.valueOf(x)));

                break;
            case  "-":
                a.setA(a.sub(Double.valueOf(x)));
                break;
            case "x":
                a.setA(a.mul(Double.valueOf(x)));
                break;
            case ":":
                 a.setA(a.div(Double.valueOf(x)));
                break;
            default:
                break;
        }
    }
    private class AddListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.print(x);
            if(x!="")
            {Calculator1();
            String oldString = jlLabel1.getText();
            if(pheptinh=="x"||pheptinh==":"){
                jlLabel1.setText(""+a.getA()+" + ");
            }else{
                jlLabel1.setText(oldString + " "+ "+ " );
            }
            jlLabel.setText(a.getA()+"");
            }
            String oldText=jlLabel1.getText();
            jlLabel1.setText(oldText.substring(0, oldText.length() - 2)+" + ");
            pheptinh="+";
            x="";
        }

        private JLabel setText(String string) {
            return null;
        }
    }
    private class endListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(x!=""){
                Calculator1();
                String oldString = jlLabel1.getText();
                if(pheptinh=="x"||pheptinh==":"){
                    jlLabel1.setText(""+a.getA()+" - ");
                }else{
                    jlLabel1.setText(oldString + " "+ "- " );
                }
                    jlLabel.setText(a.getA()+"");
                }
                String oldText=jlLabel1.getText();
                jlLabel1.setText(oldText.substring(0, oldText.length() - 2)+" = ");
            pheptinh="";
            x="";
        }
    }
    private class SubListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(x!=""){
                Calculator1();
            String oldString = jlLabel1.getText();
            if(pheptinh=="x"||pheptinh==":"){
                jlLabel1.setText(""+a.getA()+" - ");
            }else{
                jlLabel1.setText(oldString + " "+ "- " );
            }
            jlLabel.setText(a.getA()+"");
        }
        String oldText=jlLabel1.getText();
        jlLabel1.setText(oldText.substring(0, oldText.length() - 2)+" - ");
            pheptinh="-";
            x="";
        }
    }
    private class MulListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(x!="")
            {Calculator1();
            String oldString = jlLabel1.getText();
            if(pheptinh=="+"||pheptinh=="-"){
                jlLabel1.setText(""+a.getA()+" x ");
            }else{
                jlLabel1.setText(oldString + " "+ "x " );
            }
            jlLabel.setText(a.getA()+"");
            }
            String oldText=jlLabel1.getText();
            jlLabel1.setText(oldText.substring(0, oldText.length() - 2)+" x ");
            pheptinh="x";
            x="";
        }
    }
    private class DivListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(x!="")
            {Calculator1();
            String oldString = jlLabel1.getText();
            if(pheptinh=="+"||pheptinh=="-"){
                jlLabel1.setText(""+a.getA()+" : ");
            }else{
                jlLabel1.setText(oldString + " "+ ": " );
            }
            jlLabel.setText(a.getA()+"");
            }
            String oldText=jlLabel1.getText();
            jlLabel1.setText(oldText.substring(0, oldText.length() - 2)+" : ");
            pheptinh=":";
            x="";
        }
    }
    private class chamListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(x!=""){
                x=x+".";
            }
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString  + "." );
        }
    }
    private class _0Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"0";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString  + 0 );
        }
    }
    private class _1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"1";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 1 );
        }
    }
    private class _2Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"2";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 2 );
        }
    }
    private class _3Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"3";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 3);
        }
    }
    private class _4Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"4";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 4 );
        }
    }
    private class _5Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"5";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 5 );
        }
    }
    private class _6Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"6";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 6 );
        }
    }
    private class _7Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"7";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 7 );
        }
    }
    private class _8Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"8";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 8 );
        }
    }
    private class _9Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            x=x+"9";
            String oldString = jlLabel1.getText();
            jlLabel1.setText(oldString + 9 );
        }
    }
}

