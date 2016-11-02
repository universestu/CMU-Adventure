package com.company.Sprite.Player;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Chetsada Chaiprasop on 10/22/2016.
 */
public class PlayerLoader {
    public BufferedImage loadImage(String pathRelativeToThis) throws IOException {
        URL url = this.getClass().getResource(pathRelativeToThis);
        BufferedImage image = ImageIO.read(url);
        return image;
    }
}
