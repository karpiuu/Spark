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
    private static final Integer SIZE_X = 16;
    private static final Integer SIZE_Y = 15;

    public GameEngine() {
        element = new Tile[SIZE_X][SIZE_Y];
        imageContainer = new ImageContainer();
        generate();
    }

    public void generate() {
        for(int i = 0; i < SIZE_X; i++) {
            for(int j = 0; j < SIZE_Y; j++) {
                element[i][j] = new Tile( ( ((i+j) % 2) == 0 ? TileType.TILE_STRAIGHT : TileType.TILE_TURN ) );
            }
        }

        element[0][0] = new Tile( TileType.TILE_TEST );
        element[0][14] = new Tile( TileType.TILE_TEST );
        element[15][0] = new Tile( TileType.TILE_TEST );
        element[15][14] = new Tile( TileType.TILE_TEST );
    }

    public void update() {
        for(int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                element[i][j].rotate(Rotation.R_90);
            }
        }
    }

    public void draw(Graphics g) {
        for(int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {

                g.drawImage(imageContainer.rotateImage(element[i][j].getType().toInteger(), element[i][j].getRotation().toDouble()),
                            50 * i, 50 * j,
                            (ImageObserver) null);
            }
        }
    }
}
