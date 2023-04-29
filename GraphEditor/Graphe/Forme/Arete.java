package Graphe.Forme;

import java.awt.*;
import javax.swing.*;

public class Arete extends Arc {
    /* Constructeurs */
    public Arete(Sommet a, Sommet b){
        super(a,b);
    }
    public Arete(Sommet a,Sommet b,String n,Color c){
        super(a,b,n,c);
    }
    /* Methode paint */
    public void paint(Graphics g){
        /* Trace une simple ligne entre le milieux de chaque sommet */
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.getCouleurAff());
        g2.setStroke(new BasicStroke(this.getThickness()));
        g2.drawLine(this.getS1().getXCenter(),this.getS1().getYCenter(),this.getS2().getXCenter(),this.getS2().getYCenter());
    }
}