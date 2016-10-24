public enum TileType
{
    TILE_STRAIGHT,
    TILE_TURN;

    public Integer toInteger()
    {
        switch (this)
        {
            case TILE_STRAIGHT:   return 0;
            case TILE_TURN:
            default:            return 1;
        }
    }
}