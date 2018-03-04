/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JTextField;

/**
 *
 * @author Farazoo
 */
public class FakeField extends JTextField {

    double theta;
    int oldX, oldY;

    public FakeField() {
//        
////        this.setSize(new Dimension(oldX, oldY));

        theta = 0;
        oldX = getWidth();
        oldY = getHeight();
    }

    public void setTheta(double theta) {

        this.theta += theta;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int cx = getWidth() / 2;
        int cy = getHeight() / 2;

//        if (theta == -90) {
//            g2.rotate(-Math.PI / 2, cx, cy);
//        } else if (theta == 90) {

//            g2.rotate(Math.PI / 2, cx, cy);
//        }
        g2.rotate(Math.toRadians(theta), cx, cy);
        super.paintComponent(g2);
//        g2.rotate(-theta);

//        this.setPreferredSize(new Dimension(oldY, oldX));
    }
}
