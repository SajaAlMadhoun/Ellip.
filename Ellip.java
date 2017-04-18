import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Ellip {

    private int x;
    private int y;
    private int w;
    private int h;
     private Color c;
    public Ellip(int x,int y,int w,int h,Color e ){
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.c=c;
    }

    void draw(Graphics2D g2) {
       Ellipse2D.Double e=new Ellipse2D.Double(x,y,w,h);
       g.draw(e);
       g.setColor(c);
       g.fill(e);
       
       
       
    }

   
    }
    

