/**
 * Created by tomaszkropiwnicki on 24.10.2016.
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
    public DrawingPanel() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.draw(g);
    }

    private void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
        ImageIcon ii = new ImageIcon("img/tile.png");
        Image img = ii.getImage();

        for(int i = 0; i < 16; ++i) {
            g.drawImage(img, ii.getIconWidth() * i, 400, (ImageObserver)null);
        }

    }
}
