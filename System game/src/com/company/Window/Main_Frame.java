package com.company.Window;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public class Main_Frame extends JFrame {
    public Main_Frame() throws IOException {
        setTitle("Loop");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1,1,0,0));
        screen();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void screen() throws IOException {
        Sub_Frame screen = new Sub_Frame();
        add(screen);
        pack();
    }
}
