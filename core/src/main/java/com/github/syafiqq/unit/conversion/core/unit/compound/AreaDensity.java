package com.github.syafiqq.unit.conversion.core.unit.compound;

import com.github.syafiqq.unit.conversion.core.unit.single.AreaUnit;
import com.github.syafiqq.unit.conversion.core.unit.single.WeightUnit;

/*
 * This <unit-conversion> created by : 
 * Name         : syafiq
 * Date / Time  : 21 July 2017, 3:12 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public enum AreaDensity
{
    TONNE_PER_HECTARE(WeightUnit.TONNE, AreaUnit.HECTARE),
    TONNE_PER_SQUARE_METER(WeightUnit.TONNE, AreaUnit.SQUARE_METER),
    KILOGRAM_PER_SQUARE_METER(WeightUnit.KILOGRAM, AreaUnit.SQUARE_METER);

    static final double MAX = Double.MAX_VALUE;
    private final WeightUnit weight;
    private final AreaUnit area;

    AreaDensity(WeightUnit weight, AreaUnit area)
    {
        this.weight = weight;
        this.area = area;
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

    public double to(AreaDensity sourceUnit, double sourceArea)
    {
        return this.to(sourceUnit.weight, sourceUnit.area, sourceArea);
    }

    private double to(WeightUnit weight, AreaUnit area, double sourceArea)
    {
        double calculate = (this.weight.base / weight.base) / (this.area.base / area.base);
        return eval(sourceArea, (calculate), MAX / (calculate));
    }
}
