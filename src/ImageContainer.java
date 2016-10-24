import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomaszkropiwnicki on 24.10.2016.
 */
public class ImageContainer {
    public List<Image> tile;

    public ImageContainer() {
        tile = new ArrayList<>();
        tile.add( new ImageIcon("img/tile_straight.png").getImage() );
        tile.add( new ImageIcon("img/tile_turn.png").getImage() );
    }
}
