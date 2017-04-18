import javax.swing.JFrame;

public class EllipTester {
    public static void main (String[]args){
        JFrame frame=new JFrame();
        frame.setSize(300,400);
        frame.setTitle("The Circute");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EllipComponent c=new EllipComponent();
        frame.add (c);
        frame.setVisible(true);
        
    }
}
