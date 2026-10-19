import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrafficLight extends JPanel implements MouseListener {
    private int xClick = -999;
    private int yClick = -999;

    public TrafficLight() {
        JFrame myFrame = new JFrame();
        myFrame.setSize(400, 1000);
        myFrame.add(this);
        myFrame.setVisible(true);

        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(10.0f));
        g.drawOval(100, 100, 200, 200);
        g.drawOval(100, 350, 200, 200);
        g.drawOval(100, 600, 200, 200);

        if()
        g.setColor(Color.red);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.yellow);
        g.fillOval(100, 350, 200, 200);
        g.setColor(Color.green);
        g.fillOval(100, 600, 200, 200);
        if (xClick != -999 && yClick != -999)
            g.drawOval(xClick, yClick, 100, 100);
    }

    public void mouseDragged(MouseEvent event) {
        this.xClick = event.getX();
        this.yClick = event.getY();
        repaint();
    }

    public void mouseClicked(MouseEvent event) {
    }

    public void mouseReleased(MouseEvent event) {
    }

    public void mousePressed(MouseEvent event) {
    }

    public void mouseEntered(MouseEvent event) {
    }

    public void mouseExited(MouseEvent event) {
    }
}
