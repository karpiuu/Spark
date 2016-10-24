public enum Rotation
{
    R_0,
    R_90,
    R_180,
    R_270;

    public Integer toInteger()
    {
        switch (this)
        {
            case R_0:       return 0;
            case R_90:      return 90;
            case R_180:     return 180;
            default:        return 270;
        }
    }
}