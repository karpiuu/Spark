/**
 * Created by tomaszkropiwnicki on 24.10.2016.
 */
public class Tile {

    private TileType type;
    private Rotation rotation;

    /**
     * Generate tile of given type, and random starting rotation.
     * @param t Type of tile
     */
    public Tile( TileType t ) {
        type = t;
        int random = RandomGenerator.generator.nextInt(4);

        switch (random) {
            case 0: rotation = Rotation.R_0; break;
            case 1: rotation = Rotation.R_90; break;
            case 2: rotation = Rotation.R_180; break;
            case 3: rotation = Rotation.R_270; break;
        }
    }

    public TileType getType() {
        return type;
    }
    public Rotation getRotation() { return rotation; }

    public void rotate(Rotation rot) {
        rotation = rotation.add( rotation.toDouble(), rot.toDouble() );
    }
}
