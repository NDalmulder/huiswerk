package TrafficLight;

import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class Show extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white);
    g.setColor(Color.black);
    g.fillRoundRect(20, 20, 200, 400, 20, 20);
    g.setColor(Color.red);
    g.fillOval(70, 50, 100, 100);
    g.setColor(Color.orange);
    g.fillOval(70, 170, 100, 100);
    g.setColor(Color.green);
    g.fillOval(70, 300, 100, 100);
  }
}