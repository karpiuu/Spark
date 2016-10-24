import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomaszkropiwnicki on 24.10.2016.
 */
public class GameEngine {
    private ImageContainer imageContainer;
    private Tile element[][];
    private static final Integer SIZE_X = 40;
    private static final Integer SIZE_Y = 40;

    public GameEngine() {
        element = new Tile[SIZE_X][SIZE_Y];
        imageContainer = new ImageContainer();
        generate();
    }

    public void generate() {
        for(int i = 0; i < 40; i++) {
            for(int j = 0; j < 40; j++) {
                element[i][j] = new Tile( ( ((i+j) % 2) == 0 ? TileType.TILE_STRAIGHT : TileType.TILE_TURN ) );
            }
        }
    }

    public void draw(Graphics g) {
        for(int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                g.drawImage(imageContainer.tile.get(element[i][j].getType().toInteger()),
                            50 * i, 50 * j,
                            (ImageObserver) null);
            }
        }
    }
}
