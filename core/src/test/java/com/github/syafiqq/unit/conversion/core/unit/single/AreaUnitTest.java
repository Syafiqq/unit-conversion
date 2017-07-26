package com.github.syafiqq.unit.conversion.core.unit.single;

import org.junit.Assert;
import org.junit.Test;

/*
 * This <unit-conversion> created by : 
 * Name         : syafiq
 * Date / Time  : 21 July 2017, 2:44 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class AreaUnitTest
{
    @Test
    public void it_converse_square_kilometer()
    {
        double area = 1.0;
        AreaUnit kilometers = AreaUnit.SQUARE_KILOMETERS;
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, kilometers, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, kilometers, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E0004, AreaUnit.converse(area, kilometers, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E0006, AreaUnit.converse(area, kilometers, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E0008, AreaUnit.converse(area, kilometers, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0010, AreaUnit.converse(area, kilometers, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0012, AreaUnit.converse(area, kilometers, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, kilometers, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E0003, AreaUnit.converse(area, kilometers, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E0004, AreaUnit.converse(area, kilometers, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_square_hectometer()
    {
        double area = 1.0;
        AreaUnit squareHectometer = AreaUnit.SQUARE_HECTOMETER;
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, squareHectometer, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, squareHectometer, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, squareHectometer, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E0004, AreaUnit.converse(area, squareHectometer, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E0006, AreaUnit.converse(area, squareHectometer, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0008, AreaUnit.converse(area, squareHectometer, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0010, AreaUnit.converse(area, squareHectometer, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, squareHectometer, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E0001, AreaUnit.converse(area, squareHectometer, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, squareHectometer, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_square_decameter()
    {
        double area = 1.0;
        AreaUnit squareDecameter = AreaUnit.SQUARE_DECAMETER;
        Assert.assertEquals(1.0E-004, AreaUnit.converse(area, squareDecameter, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, squareDecameter, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, squareDecameter, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, squareDecameter, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E0004, AreaUnit.converse(area, squareDecameter, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0006, AreaUnit.converse(area, squareDecameter, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0008, AreaUnit.converse(area, squareDecameter, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, squareDecameter, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E-001, AreaUnit.converse(area, squareDecameter, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, squareDecameter, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_square_meter()
    {
        double area = 1.0;
        AreaUnit squareMeter = AreaUnit.SQUARE_METER;
        Assert.assertEquals(1.0E-006, AreaUnit.converse(area, squareMeter, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E-004, AreaUnit.converse(area, squareMeter, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, squareMeter, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, squareMeter, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, squareMeter, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0004, AreaUnit.converse(area, squareMeter, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0006, AreaUnit.converse(area, squareMeter, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E-004, AreaUnit.converse(area, squareMeter, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E-003, AreaUnit.converse(area, squareMeter, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, squareMeter, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_square_decimeter()
    {
        double area = 1.0;
        AreaUnit squareDecimeter = AreaUnit.SQUARE_DECIMETER;
        Assert.assertEquals(1.0E-008, AreaUnit.converse(area, squareDecimeter, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E-006, AreaUnit.converse(area, squareDecimeter, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E-004, AreaUnit.converse(area, squareDecimeter, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, squareDecimeter, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, squareDecimeter, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, squareDecimeter, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0004, AreaUnit.converse(area, squareDecimeter, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E-006, AreaUnit.converse(area, squareDecimeter, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E-005, AreaUnit.converse(area, squareDecimeter, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E-004, AreaUnit.converse(area, squareDecimeter, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_square_centimeter()
    {
        double area = 1.0;
        AreaUnit squareCentimeter = AreaUnit.SQUARE_CENTIMETER;
        Assert.assertEquals(1.0E-010, AreaUnit.converse(area, squareCentimeter, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E-008, AreaUnit.converse(area, squareCentimeter, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E-006, AreaUnit.converse(area, squareCentimeter, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E-004, AreaUnit.converse(area, squareCentimeter, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, squareCentimeter, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, squareCentimeter, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, squareCentimeter, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E-008, AreaUnit.converse(area, squareCentimeter, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E-007, AreaUnit.converse(area, squareCentimeter, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E-006, AreaUnit.converse(area, squareCentimeter, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_square_millimeter()
    {
        double area = 1.0;
        AreaUnit squareMillimeter = AreaUnit.SQUARE_MILLIMETER;
        Assert.assertEquals(1.0E-012, AreaUnit.converse(area, squareMillimeter, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E-010, AreaUnit.converse(area, squareMillimeter, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E-008, AreaUnit.converse(area, squareMillimeter, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E-006, AreaUnit.converse(area, squareMillimeter, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E-004, AreaUnit.converse(area, squareMillimeter, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, squareMillimeter, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, squareMillimeter, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E-010, AreaUnit.converse(area, squareMillimeter, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E-009, AreaUnit.converse(area, squareMillimeter, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E-008, AreaUnit.converse(area, squareMillimeter, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_hectare()
    {
        double area = 1.0;
        AreaUnit hectare = AreaUnit.HECTARE;
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, hectare, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, hectare, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, hectare, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E0004, AreaUnit.converse(area, hectare, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E0006, AreaUnit.converse(area, hectare, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0008, AreaUnit.converse(area, hectare, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0010, AreaUnit.converse(area, hectare, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, hectare, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E0001, AreaUnit.converse(area, hectare, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, hectare, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_decare()
    {
        double area = 1.0;
        AreaUnit decare = AreaUnit.DECARE;
        Assert.assertEquals(1.0E-003, AreaUnit.converse(area, decare, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E-001, AreaUnit.converse(area, decare, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E0001, AreaUnit.converse(area, decare, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E0003, AreaUnit.converse(area, decare, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E0005, AreaUnit.converse(area, decare, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0007, AreaUnit.converse(area, decare, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0009, AreaUnit.converse(area, decare, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E-001, AreaUnit.converse(area, decare, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, decare, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E0001, AreaUnit.converse(area, decare, AreaUnit.ARE), 1.0E-5);
    }

    @Test
    public void it_converse_are()
    {
        double area = 1.0;
        AreaUnit decare = AreaUnit.ARE;
        Assert.assertEquals(1.0E-004, AreaUnit.converse(area, decare, AreaUnit.SQUARE_KILOMETERS), 1.0E-5);
        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, decare, AreaUnit.SQUARE_HECTOMETER), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, decare, AreaUnit.SQUARE_DECAMETER), 1.0E-5);
        Assert.assertEquals(1.0E0002, AreaUnit.converse(area, decare, AreaUnit.SQUARE_METER), 1.0E-5);
        Assert.assertEquals(1.0E0004, AreaUnit.converse(area, decare, AreaUnit.SQUARE_DECIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0006, AreaUnit.converse(area, decare, AreaUnit.SQUARE_CENTIMETER), 1.0E-5);
        Assert.assertEquals(1.0E0008, AreaUnit.converse(area, decare, AreaUnit.SQUARE_MILLIMETER), 1.0E-5);

        Assert.assertEquals(1.0E-002, AreaUnit.converse(area, decare, AreaUnit.HECTARE), 1.0E-5);
        Assert.assertEquals(1.0E-001, AreaUnit.converse(area, decare, AreaUnit.DECARE), 1.0E-5);
        Assert.assertEquals(1.0E0000, AreaUnit.converse(area, decare, AreaUnit.ARE), 1.0E-5);
    }
}
