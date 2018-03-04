/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 *
 * @author Farazoo
 */
public abstract class PanelObject extends JPanel implements MouseMotionListener{
    
    @Override
    public abstract void paintComponent(Graphics g);
}
