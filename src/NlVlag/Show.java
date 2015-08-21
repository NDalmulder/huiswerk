package NlVlag;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.red);
    g.fillRect(0, 0, 190, 60);
    
    g.setColor(Color.blue);
    g.fillRect(0, 100, 190, 60 );
  }
}