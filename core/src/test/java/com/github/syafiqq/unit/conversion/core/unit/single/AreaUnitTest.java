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
        Assert.assertEquals(1.0E0000, kilometers.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, kilometers.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, kilometers.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, kilometers.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, kilometers.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0010, kilometers.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0012, kilometers.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E0002, kilometers.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0003, kilometers.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, kilometers.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_hectometer()
    {
        double area = 1.0;
        AreaUnit squareHectometer = AreaUnit.SQUARE_HECTOMETER;
        Assert.assertEquals(1.0E-002, squareHectometer.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareHectometer.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareHectometer.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, squareHectometer.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, squareHectometer.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, squareHectometer.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0010, squareHectometer.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E0000, squareHectometer.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0001, squareHectometer.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareHectometer.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_decameter()
    {
        double area = 1.0;
        AreaUnit squareDecameter = AreaUnit.SQUARE_DECAMETER;
        Assert.assertEquals(1.0E-004, squareDecameter.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareDecameter.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareDecameter.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareDecameter.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, squareDecameter.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, squareDecameter.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, squareDecameter.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-002, squareDecameter.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-001, squareDecameter.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareDecameter.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_meter()
    {
        double area = 1.0;
        AreaUnit squareMeter = AreaUnit.SQUARE_METER;
        Assert.assertEquals(1.0E-006, squareMeter.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareMeter.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareMeter.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareMeter.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareMeter.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, squareMeter.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, squareMeter.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-004, squareMeter.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-003, squareMeter.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareMeter.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_decimeter()
    {
        double area = 1.0;
        AreaUnit squareDecimeter = AreaUnit.SQUARE_DECIMETER;
        Assert.assertEquals(1.0E-008, squareDecimeter.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-006, squareDecimeter.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareDecimeter.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareDecimeter.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareDecimeter.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareDecimeter.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, squareDecimeter.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-006, squareDecimeter.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-005, squareDecimeter.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareDecimeter.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_centimeter()
    {
        double area = 1.0;
        AreaUnit squareCentimeter = AreaUnit.SQUARE_CENTIMETER;
        Assert.assertEquals(1.0E-010, squareCentimeter.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-008, squareCentimeter.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-006, squareCentimeter.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareCentimeter.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareCentimeter.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareCentimeter.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareCentimeter.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-008, squareCentimeter.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-007, squareCentimeter.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-006, squareCentimeter.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_millimeter()
    {
        double area = 1.0;
        AreaUnit squareMillimeter = AreaUnit.SQUARE_MILLIMETER;
        Assert.assertEquals(1.0E-012, squareMillimeter.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-010, squareMillimeter.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-008, squareMillimeter.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-006, squareMillimeter.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareMillimeter.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareMillimeter.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareMillimeter.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-010, squareMillimeter.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-009, squareMillimeter.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-008, squareMillimeter.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_hectare()
    {
        double area = 1.0;
        AreaUnit hectare = AreaUnit.HECTARE;
        Assert.assertEquals(1.0E-002, hectare.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, hectare.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, hectare.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, hectare.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, hectare.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, hectare.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0010, hectare.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E0000, hectare.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0001, hectare.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, hectare.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_decare()
    {
        double area = 1.0;
        AreaUnit decare = AreaUnit.DECARE;
        Assert.assertEquals(1.0E-003, decare.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-001, decare.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0001, decare.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0003, decare.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0005, decare.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0007, decare.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0009, decare.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-001, decare.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, decare.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0001, decare.to(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_are()
    {
        double area = 1.0;
        AreaUnit decare = AreaUnit.ARE;
        Assert.assertEquals(1.0E-004, decare.to(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, decare.to(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, decare.to(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, decare.to(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, decare.to(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, decare.to(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, decare.to(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-002, decare.to(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-001, decare.to(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, decare.to(AreaUnit.ARE, area), 1.0E-5);
    }
}
