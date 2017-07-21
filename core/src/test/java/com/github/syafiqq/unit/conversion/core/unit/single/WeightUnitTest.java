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
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_tonne()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.TONNE;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_kilogram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.KILOGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_hectogram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.HECTOGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_decagram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.DECAGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_gram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.GRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_decigram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.DECIGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_centigram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.CENTIGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_miligram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.MILIGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_microgram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.MICROGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }

    @Test
    public void it_converse_nanogram()
    {
        double area = 1.0;
        WeightUnit weight = WeightUnit.NANOGRAM;
        double factor = weight.base / WeightUnit.KILLOTONNE.base;
        Assert.assertEquals(1.0E0000 * factor, weight.to(WeightUnit.KILLOTONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0003 * factor, weight.to(WeightUnit.TONNE, area), 1.0E-2);
        Assert.assertEquals(1.0E0006 * factor, weight.to(WeightUnit.KILOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0007 * factor, weight.to(WeightUnit.HECTOGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0008 * factor, weight.to(WeightUnit.DECAGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0009 * factor, weight.to(WeightUnit.GRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0010 * factor, weight.to(WeightUnit.DECIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0011 * factor, weight.to(WeightUnit.CENTIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0012 * factor, weight.to(WeightUnit.MILIGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0015 * factor, weight.to(WeightUnit.MICROGRAM, area), 1.0E-2);
        Assert.assertEquals(1.0E0018 * factor, weight.to(WeightUnit.NANOGRAM, area), 1.0E-2);
    }
}
