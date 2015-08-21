package Staafdiagram;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.BLACK);
    g.drawLine(20, 500, 20, 20);
    g.drawLine(350, 500, 20, 500);
    g.setColor(Color.green);
    g.fillRect(20, 20, 100, 480);
    g.setColor(Color.magenta);
    g.fillRect(120, 100, 100, 400);
    g.setColor(Color.black);
    g.drawString("Hans", 160, 515);
    g.drawString("Valerie", 245, 515);
    g.setColor(Color.cyan);
    g.fillRect(220, 300, 100, 200);
    g.setColor(Color.black);
    g.drawLine(20, 300, 350, 300);
    g.drawLine(20, 400, 350, 400 );
    g.drawLine(20, 200, 350, 200);
    g.drawLine(20, 100, 350, 100);
    g.drawLine(20, 20, 350, 20);
    g.drawString("0", 360, 505);
    g.drawString("20", 360, 405);
    g.drawString("40", 360, 305);
    g.drawString("60", 360, 205);
    g.drawString("80", 360, 105);
    g.drawString("100", 360, 25);
    g.setColor(Color.black);
    g.drawString("Jeroen", 50, 515 );
    }
   }