/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author Farazoo
 */
public class HorizontalRect extends PanelObject{
    
    @Override
    public void paintComponent(Graphics g) {
//        super.paintComponent(g);

        g.setColor(Color.PINK);
        g.fillRect(0, 0, 100, 50);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
