package Graphe.Forme;


import java.awt.*;

public class Carre extends Sommet{
    private int l;
    public Carre(String n,int a,int b,int c){
        super(n,a,b);
        this.l=c;
    }
    public Carre(String n,int a,int b,int c,Color d){
        super(n,a,b,d);
        this.l=c;
    }
    public Carre(String n,int a,int b,int c,Color d,Color d2){
        super(n,a,b,d,d2);
        this.l=c;
    }
    public void setLenght(int a){
        this.l=a;
    }
    public int getLenght(){
        return this.l;
    }
    public int getXCenter(){
        return this.getX()+(this.l/2);
    }
    public int getYCenter(){
        return this.getY()+(this.l/2);
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.getCouleurAff());
        g2.fill3DRect(this.getX(),this.getY(),this.l,this.l,false);
        Font fonte = new Font("TimesRoman ",Font.BOLD,Element.getNomDisplaySize());
        g2.setFont(fonte);
        g2.drawString(this.getNom(),this.getX(),this.getY());
    }
}
