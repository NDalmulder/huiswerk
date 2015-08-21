package Dobbelsteen;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.gray);
    g.setColor(Color.white);
    g.fillRoundRect(40, 40, 200, 200, 20, 20);
    g.setColor (Color.black);
    g.fillOval(70, 70, 50, 50);
    g.fillOval(170, 170, 50, 50);
    g.fillOval(170, 70, 50, 50);
    g.fillOval(70, 170, 50, 50);
  }
}