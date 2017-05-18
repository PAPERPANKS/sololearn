import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<APPLET CODE="testapp2" HEIGHT =240  WIDTH=370 >
</APPLET>
*/
public class testapp2 extends Applet implements ActionListener,ItemListener
{
    Label l1,l2,l3,l4;
    Button ok,cancel;
    TextField n1,n2;
    Choice ch,colorchoice;
    Color clr;
    Checkbox cb1,cb2,cb3,cb4;
    CheckboxGroup cgroup;
    public void init()
     { 
      clr=new Color(219,240,251);
      setBackground(clr);
      setLayout(null);
      cgroup=new CheckboxGroup();
       cb1=new Checkbox("ADD",true,cgroup);
       cb2=new Checkbox("SUBTRACT",false,cgroup);
       cb3=new Checkbox("Multipilication",false,cgroup);
       cb4=new Checkbox("Division",false,cgroup);
       ch=new Choice();
       colorchoice=new Choice();
       ch.addItem("Addition");
       ch.addItem("Subtraction");
       ch.addItem("Multiplication");
       ch.addItem("Division");       
      colorchoice.addItem("DEFAULT");
      colorchoice.addItem("RED"); 
      colorchoice.addItem("GREEN"); 
      colorchoice.addItem("BLUE"); 
      colorchoice.addItem("PINK"); 
      colorchoice.addItem("MAGENTA");
      colorchoice.addItem("ORANGE"); 
      n1=new TextField(15);
      n2=new TextField(15);      
      l1=new Label("Enter First Number:");
      l1.setBounds(5,10,130,30);
     n1.setBounds(150,10,130,20);
     l2=new Label("Enter Second Number:");
     l2.setBounds(5,40,130,30);     
     n2.setBounds(150,40,130,20);
     l3=new Label();
     l4=new Label("Result : ");
     ok=new Button("Ok");
     cancel=new Button("Clear");
     ch.setBounds(80,140,80,25);
     colorchoice.setBounds(200,140,80,25);
     ok.setBounds(80,180,70,35);
     cancel.setBounds(180,180,80,35);
     l4.setBounds(5,70,150,30);
     l3.setBounds(100,70,180,30);
       cb1.setBounds(1,100,80,25);
       cb2.setBounds(81,100,100,25);
       cb3.setBounds(180,100,100,25);
       cb4.setBounds(280,100,100,25);
    add(l1);     add(n1);
    add(l2);     add(n2);
    add(l3);     add(l4);
    add(ok);    add(cancel);
    add(cb1);  add(cb2);    add(cb3);    add(cb4);
    add(ch);    add(colorchoice);
l3.setFont(new Font("",Font.BOLD,14));  //setting Text Font
l3.setForeground(Color.RED);
      colorchoice.addItemListener(this);
      ch.addItemListener(this);
      cb1.addItemListener(this);
      cb2.addItemListener(this);
      cb3.addItemListener(this);
      cb4.addItemListener(this);
      ok.addActionListener(this);
      cancel.addActionListener(this);
     } 
 public void itemStateChanged(ItemEvent ie)    
 {
   
if(ie.getSource()==cb1||ie.getSource()==cb2||ie.getSource()==cb3||ie.getSource()==cb4)
     {
            if(cgroup.getSelectedCheckbox()==cb1)
                 ch.select(0);
             if(cgroup.getSelectedCheckbox()==cb2)
                 ch.select(1);
             if(cgroup.getSelectedCheckbox()==cb3)
                ch.select(2);
             if(cgroup.getSelectedCheckbox()==cb4)
                 ch.select(3);
      }
else if(ie.getSource()==ch)
      {
          if(ch.getSelectedIndex()==0)
                cb1.setState(true);
          if(ch.getSelectedIndex()==1)
                cb2.setState(true);
          if(ch.getSelectedIndex()==2)
                cb3.setState(true);
          if(ch.getSelectedIndex()==3)
               cb4.setState(true);
       }             
     if(colorchoice.getSelectedIndex()==0)
         {
            setBackground(clr);
            l1.setBackground(clr);
            l2.setBackground(clr);
            l3.setBackground(clr);            
            l4.setBackground(clr);
       }
       else if(colorchoice.getSelectedIndex()==1)
        {
            setBackground(Color.RED);
            l1.setBackground(Color.RED);
            l2.setBackground(Color.RED);
            l3.setBackground(Color.RED);            
            l4.setBackground(Color.RED);
        }
       else if(colorchoice.getSelectedIndex()==2)
        {
            setBackground(Color.GREEN);
            l1.setBackground(Color.GREEN);
            l2.setBackground(Color.GREEN);
            l3.setBackground(Color.GREEN);
            l4.setBackground(Color.GREEN);
        }
     else if(colorchoice.getSelectedIndex()==3)
        {
            setBackground(Color.BLUE);       
            l1.setBackground(Color.BLUE);
            l2.setBackground(Color.BLUE);
            l3.setBackground(Color.BLUE);
            l4.setBackground(Color.BLUE);
        }
    else if(colorchoice.getSelectedIndex()==4)
        {
            setBackground(Color.PINK);       
            l1.setBackground(Color.PINK);
            l2.setBackground(Color.PINK);
            l3.setBackground(Color.PINK);
            l4.setBackground(Color.PINK);
        }
   else if(colorchoice.getSelectedIndex()==5)
        {
            setBackground(Color.MAGENTA);                   
            l1.setBackground(Color.MAGENTA);
            l2.setBackground(Color.MAGENTA);
            l3.setBackground(Color.MAGENTA);            
            l4.setBackground(Color.MAGENTA);
        }
    else  if(colorchoice.getSelectedIndex()==6)
        {
            setBackground(Color.ORANGE);     
            l1.setBackground(Color.ORANGE);
            l2.setBackground(Color.ORANGE);
            l3.setBackground(Color.ORANGE);
            l4.setBackground(Color.ORANGE);
        }
   }
 public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==ok) 
         {
             int c=0;
             int a = Integer.parseInt(n1.getText());
             int b = Integer.parseInt(n2.getText());
if(ch.getSelectedIndex()==0||cgroup.getSelectedCheckbox()==cb1)
                 c=a+b;
else if(ch.getSelectedIndex()==1||cgroup.getSelectedCheckbox()==cb2 )
                 c=a-b;
else if(ch.getSelectedIndex()==2||cgroup.getSelectedCheckbox()==cb3)
                 c=a*b;
else if(ch.getSelectedIndex()==3||cgroup.getSelectedCheckbox()==cb4)
                 c=a/b;
                
  l3.setText(String.valueOf(c));     
 }
else
  { 
          n1.setText("");
          n2.setText("");
          l3.setText("");
   }
 }
}