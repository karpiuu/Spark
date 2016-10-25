public enum TileType
{
    TILE_TEST,
    TILE_STRAIGHT,
    TILE_TURN;

    public Integer toInteger()
    {
        switch (this)
        {
            case TILE_STRAIGHT:     return 0;
            case TILE_TURN:         return 1;
            case TILE_TEST:
            default:                return 2;
        }
    }
}