package com.github.syafiqq.unit.conversion.core.unit.single;

import com.github.syafiqq.unit.conversion.core.util.Conversion;

/*
 * This <unit-conversion> created by : 
 * Name         : syafiq
 * Date / Time  : 21 July 2017, 2:46 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public enum WeightUnit implements Conversion<WeightUnit>
{
    KILLOTONNE(1.0E9),
    TONNE(1.0E6),
    KILOGRAM(1.0E3),
    HECTOGRAM(1.0E2),
    DECAGRAM(1.0E1),
    GRAM(1.0E0),
    DECIGRAM(1.0E-1),
    CENTIGRAM(1.0E-2),
    MILIGRAM(1.0E-3),
    MICROGRAM(1.0E-6),
    NANOGRAM(1.0E-9);

    static final double MAX = Double.MAX_VALUE;

    public final double base;

    WeightUnit(double base)
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

    @Override public double to(WeightUnit to, double value)
    {
        return this.to(to, value, 1.0);
    }

    @Override public double to(WeightUnit to, double value, double base)
    {
        final double calculate = this.base / to.base / base;
        return eval(value, calculate, MAX / (calculate));
    }
}

