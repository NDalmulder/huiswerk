package FillArc;
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.blue);
    g.setColor(Color.yellow);
    g.fillArc(20, 20, 200, 400, 40, 400);
  }
}