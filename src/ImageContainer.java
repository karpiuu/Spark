import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomaszkropiwnicki on 24.10.2016.
 */
public class ImageContainer {
    private List<BufferedImage> tile;

    public ImageContainer() {

        tile = new ArrayList<>();
        loadImage("img/tile_straight.png");
        loadImage("img/tile_turn.png");
        loadImage("img/tile_test.png");
    }

    private boolean loadImage(String path) {
        BufferedImage buff;

        try {
            buff = ImageIO.read(new File(path));
        } catch (IOException ex) {
            System.out.print("Can't load image");
            return false;
        }

        tile.add(buff);

        return true;
    }

    public BufferedImage getImage(int index) {
        return tile.get(index);
    }

    public BufferedImage rotateImage(int index, double angle) {
        if( angle == 0 ) return getImage(index);

        double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
        int w = tile.get(index).getWidth(), h = tile.get(index).getHeight();
        int neww = (int) Math.floor(w * cos + h * sin), newh = (int) Math.floor(h * cos + w * sin);
        BufferedImage result = new BufferedImage(neww, newh, Transparency.TRANSLUCENT);
        Graphics2D g2d = result.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.translate((neww - w) / 2, (newh - h) / 2);
        g2d.rotate(angle, w / 2, h / 2);
        g2d.drawRenderedImage(tile.get(index), null);
        g2d.dispose();
        return result;
    }
}
