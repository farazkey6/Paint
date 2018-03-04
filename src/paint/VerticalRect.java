/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 *
 * @author Farazoo
 */
public class VerticalRect extends PanelObject {
    
    @Override
    public void paintComponent(Graphics g) {
//        super.paintComponent(g);

        g.setColor(Color.PINK);
        g.fillRect(0, 0, 50, 100);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

//        requestFocus();
//        setBounds(e.getX(), e.getY(), 50, 100);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
