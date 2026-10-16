/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      //Experiment with new methods here. Don't forget setColor!

      // g.setColor(Color.red);
      // g.fillOval(100,100,50,50);
      // g.fillRect(200,200,25,25);
      this.drawBullsEye(g);
      //this.olympicRings(g);
      //this.trafficLight(g);
   }

      public void drawBullsEye(Graphics g){
         g.setColor(Color.red);
         g.fillOval(0,0,50,50);
         g.setColor(Color.black);
         g.fillOval(10,10,25,25);
         g.setColor(Color.red);
         g.fillOval(15,15,12,12);
         g.setColor(Color.black);
         g.fillOval(20,20,6,6);
      }
      public void olympicRings(Graphics g){
         g.setColor(Color.green);
      }

}
