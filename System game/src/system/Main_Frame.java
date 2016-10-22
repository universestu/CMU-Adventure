package system;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chetsada Chaiprasop on 10/20/2016.
 */
public class Main_Frame extends JFrame {
    public Main_Frame() {
        setTitle("Loop");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1,1,0,0));
        screen();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void screen() {
        Sub_Frame screen = new Sub_Frame();
        add(screen);
        pack();
    }
}
