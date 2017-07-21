package com.github.syafiqq.unit.conversion.core.unit.single;

/*
 * This <unit-conversion> created by : 
 * Name         : syafiq
 * Date / Time  : 21 July 2017, 2:43 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public enum AreaUnit
{
    SQUARE_MILLIMETER(1.0E-6),
    SQUARE_CENTIMETER(1.0E-4),
    SQUARE_DECIMETER(1.0E-2),
    SQUARE_METER(1.0E0),
    SQUARE_DECAMETER(1.0E2),
    SQUARE_HECTOMETER(1.0E4),
    SQUARE_KILOMETERS(1.0E6),

    ARE(1.0E2),
    DECARE(1.0E3),
    HECTARE(1.0E4);

    static final double MAX = Double.MAX_VALUE;

    public final double base;

    AreaUnit(double base)
    {
        this.base = base;
    }

    static double eval(double d, double m, double over)
    {
        if(d > over)
        {
            return Double.MAX_VALUE;
        }
        if(d < -over)
        {
            return Double.MIN_VALUE;
        }
        return d * m;
    }

    public double to(AreaUnit sourceUnit, double sourceArea)
    {
        return eval(sourceArea, this.base / sourceUnit.base, MAX / (this.base / sourceUnit.base));
    }
}
