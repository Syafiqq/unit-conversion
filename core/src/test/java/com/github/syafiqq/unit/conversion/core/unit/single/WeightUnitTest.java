package com.github.syafiqq.unit.conversion.core.unit.single;

import org.junit.Assert;
import org.junit.Test;

/*
 * This <unit-conversion> created by : 
 * Name         : syafiq
 * Date / Time  : 21 July 2017, 2:54 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class WeightUnitTest
{
    @Test
    public void it_converse_kilotonne()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.KILLOTONNE;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_tonne()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.TONNE;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_kilogram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.KILOGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_hectogram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.HECTOGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_decagram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.DECAGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_gram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.GRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_decigram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.DECIGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_centigram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.CENTIGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_miligram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.MILIGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_microgram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.MICROGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_converse_nanogram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.NANOGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, WeightUnit.converse(area, weight, WeightUnit.KILLOTONNE), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, WeightUnit.converse(area, weight, WeightUnit.TONNE), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, WeightUnit.converse(area, weight, WeightUnit.KILOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, WeightUnit.converse(area, weight, WeightUnit.HECTOGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, WeightUnit.converse(area, weight, WeightUnit.DECAGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, WeightUnit.converse(area, weight, WeightUnit.GRAM), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, WeightUnit.converse(area, weight, WeightUnit.DECIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, WeightUnit.converse(area, weight, WeightUnit.CENTIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, WeightUnit.converse(area, weight, WeightUnit.MILIGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, WeightUnit.converse(area, weight, WeightUnit.MICROGRAM), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, WeightUnit.converse(area, weight, WeightUnit.NANOGRAM), 1.0E-2);
    }

    @Test
    public void it_suceess_convert_with_wrapper()
    {
        Assert.assertEquals(1E-3, WeightUnit.converse(1.0, WeightUnit.GRAM, WeightUnit.KILOGRAM), 0.0);
        Assert.assertEquals(1E-3, WeightUnit.converse(new WeightUnit.WeightWrapper<Double>()
        {
            @Override public WeightUnit getUnit()
            {
                return WeightUnit.GRAM;
            }

            @Override public Double getValue()
            {
                return 1.0;
            }
        }, new WeightUnit.WeightWrapper<Double>()
        {
            @Override public WeightUnit getUnit()
            {
                return WeightUnit.KILOGRAM;
            }

            @Override public Double getValue()
            {
                return 1.0;
            }
        }), 0.0);

        Assert.assertEquals(5E-4, WeightUnit.converse(new WeightUnit.WeightWrapper<Double>()
        {
            @Override public WeightUnit getUnit()
            {
                return WeightUnit.GRAM;
            }

            @Override public Double getValue()
            {
                return 1.0;
            }
        }, 2.0, WeightUnit.KILOGRAM), 0.0);

    }
}
