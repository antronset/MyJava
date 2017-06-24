package ShagAcademy.AWT;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Антон on 24.06.2017.
 */
public class MyFrame extends Frame implements MouseListener, MouseMotionListener {

    public MyFrame(String title){
        super(title);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("Thread name " + Thread.currentThread().getName());
                System.exit(0);

            }
        });
        Random rd = new Random();
        Button changeColor = new Button("Next colour");

        this.add("West", changeColor);
        changeColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rd = new Random();
                switch (rd.nextInt(5)){
                    case 0: currentColour = Color.blue;
                    break;
                    case 1: Color c1 = new Color(rd.nextInt(254),rd.nextInt(254),rd.nextInt(254));
                        currentColour = c1;
                    break;
                    case 2: Color c2 = new Color(rd.nextInt(254),rd.nextInt(254),rd.nextInt(254));
                        currentColour = c2;
                    break;
                    case 3: Color c3 = new Color(rd.nextInt(254),rd.nextInt(254),rd.nextInt(254));
                        currentColour = c3;
                    break;
                    case 4: currentColour = Color.pink;
                    break;
                }
            }
        });

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    Color currentColour = Color.RED;

    int x,y;
    java.util.LinkedList<Line> list = new java.util.LinkedList<>();

    public void paint (Graphics g){
        g.setColor(Color.BLUE);
        for (Line temp: list){
            temp.draw(g);

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    x = e.getX();
    y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(currentColour);
    g.drawLine(x,y,e.getX(),e.getY());
    list.add(new Line (x,y,e.getX(),e.getY()));
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
