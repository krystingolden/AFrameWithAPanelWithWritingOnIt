package com.pluralsight;

import javax.swing.*;
import java.awt.*;

class Frame613 extends JFrame {
    public Frame613 ()
    {
        setTitle("613 rocks!");
        setSize(300,200);
        setLocation(100,200);

        Panel613 panel = new Panel613();
        Container cp = getContentPane();
        cp.add(panel);
    }
}
