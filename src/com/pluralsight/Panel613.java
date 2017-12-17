package com.pluralsight;

import javax.swing.*;
import java.awt.*;

class Panel613 extends JPanel {
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.drawString("Hi", 75, 100);
    }
}