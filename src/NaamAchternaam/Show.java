package NaamAchternaam;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

  public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.setColor(Color.BLUE);
    g.drawString("Nino", 50, 60 );
    g.setColor(Color.RED);
    g.drawString("Dalmulder", 50, 70 );
  }
}