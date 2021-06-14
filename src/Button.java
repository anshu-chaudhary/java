 import java.awt.event;
import javax.swing ;
 import javax.swing.*;

 public class Button {
    JFrame  f = new JFrame();
    JButton b1 = new JButton("click");
    b1.setBounds( 50,50,100,30);
    f.add(b1); 
    JRadioButton j1 = new JRadioButton("A");
     JRadioButton J2 = new JRadioButton("B");
     j1 setBounds(100,20,30,40);
     j2 setBounds(100,20,30,40);
     ButtonGroup bg =new ButtonGroup();
     bg.add(j1);
      bg.add(j2);
      f.add(j1);
      f.add(j2);
      f.setLayout(null);
      f.setVisible(true);
      public static void main(String[] args){
           button();

     }


}
