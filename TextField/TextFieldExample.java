import javax.swing.*;  
class TextFieldExample  
{  
public static void main(String args[])  
    {  
    JFrame frame= new JFrame("TextField Example");  
    JTextField t1,t2;  
    t1=new JTextField("TextField 01.");  
    t1.setBounds(50,100, 200,30);  
    t2=new JTextField("TextField 02.");  
    t2.setBounds(50,150, 200,30);  
    frame.add(t1); 
    frame.add(t2);  
    frame.setSize(400,400);  
    frame.setLayout(null);  
    frame.setVisible(true);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    }  