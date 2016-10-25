public enum Rotation
{
    R_0,
    R_90,
    R_180,
    R_270;

    public Double toDouble()
    {
        switch (this)
        {
            case R_0:       return 0.0;
            case R_90:      return Math.PI*0.5;
            case R_180:     return Math.PI;
            default:        return Math.PI*1.5;
        }
    }

    public Rotation add(Double x, Double y) {
        Double z = x+y;

        if(z > Math.PI*2) z = 0.0;

        if(z == Math.PI*0.5)        return R_90;
        else if(z == Math.PI)       return R_180;
        else if(z == Math.PI*1.5)   return R_270;
        else                        return R_0;
    }
}