import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
    Button b[]=new Button[9];
    int x=100;
    int y=100;
    int w=100;
    int h=100;
    int c=0;
    demo()
    {
        setLayout(null);
        Font f = new Font("Forte",Font.BOLD,30);
        setFont(f);
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[k]=new Button("");
                b[k].setSize(w,h);
                b[k].setLocation(x,y);
                add(b[k]);
                k++;
                x=x+100;
            }
            x=100;
            y=y+100;
        }
    }
    @Override
         public void actionPerformed(ActionEvent e)
        {
            Button b1 =(Button)e.getSource();
            if(c%2==0)
            {
                b1.setLabel("X");
            }
            else
            {
                b1.setLabel("0");
            }
            //b1.removeActionListener(this);
            c++;
            if(b[0].getLabel()=="X"&&b[1].getLabel()=="X"&&b[2].getLabel()=="X")
            {
                System.out.println("X is winner");
            }
            else
            {
                System.out.println("Y is winner");
            }
            if(b[3].getLabel()=="X"&&b[4].getLabel()=="X"&&b[5].getLabel()=="X")
            {
                System.out.println("X is winner");
            }
            else
            {
                System.out.println("Y is winner");
            }
            if(b[6].getLabel()=="X"&&b[7].getLabel()=="X"&&b[8].getLabel()=="X")
            {
                System.out.println("X is winner");
            }
            else
            {
                System.out.println("Y is winner");
            }
        }


}
public class tiktaktoe {
    public static void main(String[] args) {
       demo d = new demo();
       d.setVisible(true);
       d.setSize(380,100);
       d.setLocation(200,100);
       d.addWindowListener(new WindowAdapter(){
           public void WindowClosing(WindowEvent e)
           {
               System.exit(0);
           }
       });
    }
    
}
