package ShagAcademy.AWT;

import java.awt.*;

/**
 * Created by Антон on 24.06.2017.
 */
public class Line {

    int x0,y0,x1,y1;

    public Line(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public void draw (Graphics g){
        g.drawLine(x0,y0,x1,y1);
    }
}
