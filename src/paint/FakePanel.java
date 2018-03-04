/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Farazoo
 */
public class FakePanel extends JPanel {

    int x;
    Color c;

    public FakePanel(int x, Color c) {

        this.x = x;
        this.c = c;
//        setPreferredSize(new Dimension(12, 12));
        setSize(x, x);
        setFocusable(false);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(c);
        g.fillRect(0, 0, x, x);
    }
}
