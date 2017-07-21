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
        Assert.assertEquals(1.0E0000, kilometers.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, kilometers.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, kilometers.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, kilometers.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, kilometers.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0010, kilometers.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0012, kilometers.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E0002, kilometers.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0003, kilometers.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, kilometers.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_hectometer()
    {
        double area = 1.0;
        AreaUnit squareHectometer = AreaUnit.SQUARE_HECTOMETER;
        Assert.assertEquals(1.0E-002, squareHectometer.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareHectometer.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareHectometer.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, squareHectometer.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, squareHectometer.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, squareHectometer.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0010, squareHectometer.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E0000, squareHectometer.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0001, squareHectometer.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareHectometer.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_decameter()
    {
        double area = 1.0;
        AreaUnit squareDecameter = AreaUnit.SQUARE_DECAMETER;
        Assert.assertEquals(1.0E-004, squareDecameter.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareDecameter.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareDecameter.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareDecameter.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, squareDecameter.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, squareDecameter.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, squareDecameter.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-002, squareDecameter.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-001, squareDecameter.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareDecameter.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_meter()
    {
        double area = 1.0;
        AreaUnit squareMeter = AreaUnit.SQUARE_METER;
        Assert.assertEquals(1.0E-006, squareMeter.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareMeter.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareMeter.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareMeter.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareMeter.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, squareMeter.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, squareMeter.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-004, squareMeter.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-003, squareMeter.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareMeter.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_decimeter()
    {
        double area = 1.0;
        AreaUnit squareDecimeter = AreaUnit.SQUARE_DECIMETER;
        Assert.assertEquals(1.0E-008, squareDecimeter.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-006, squareDecimeter.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareDecimeter.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareDecimeter.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareDecimeter.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareDecimeter.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, squareDecimeter.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-006, squareDecimeter.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-005, squareDecimeter.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareDecimeter.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_centimeter()
    {
        double area = 1.0;
        AreaUnit squareCentimeter = AreaUnit.SQUARE_CENTIMETER;
        Assert.assertEquals(1.0E-010, squareCentimeter.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-008, squareCentimeter.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-006, squareCentimeter.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareCentimeter.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareCentimeter.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareCentimeter.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, squareCentimeter.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-008, squareCentimeter.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-007, squareCentimeter.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-006, squareCentimeter.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_square_millimeter()
    {
        double area = 1.0;
        AreaUnit squareMillimeter = AreaUnit.SQUARE_MILLIMETER;
        Assert.assertEquals(1.0E-012, squareMillimeter.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-010, squareMillimeter.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-008, squareMillimeter.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-006, squareMillimeter.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E-004, squareMillimeter.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, squareMillimeter.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, squareMillimeter.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-010, squareMillimeter.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-009, squareMillimeter.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-008, squareMillimeter.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_hectare()
    {
        double area = 1.0;
        AreaUnit hectare = AreaUnit.HECTARE;
        Assert.assertEquals(1.0E-002, hectare.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, hectare.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, hectare.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, hectare.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, hectare.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, hectare.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0010, hectare.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E0000, hectare.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0001, hectare.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, hectare.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_decare()
    {
        double area = 1.0;
        AreaUnit decare = AreaUnit.DECARE;
        Assert.assertEquals(1.0E-003, decare.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-001, decare.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0001, decare.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0003, decare.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0005, decare.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0007, decare.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0009, decare.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-001, decare.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, decare.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0001, decare.from(AreaUnit.ARE, area), 1.0E-5);
    }

    @Test
    public void it_converse_are()
    {
        double area = 1.0;
        AreaUnit decare = AreaUnit.ARE;
        Assert.assertEquals(1.0E-004, decare.from(AreaUnit.SQUARE_KILOMETERS, area), 1.0E-5);
        Assert.assertEquals(1.0E-002, decare.from(AreaUnit.SQUARE_HECTOMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, decare.from(AreaUnit.SQUARE_DECAMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0002, decare.from(AreaUnit.SQUARE_METER, area), 1.0E-5);
        Assert.assertEquals(1.0E0004, decare.from(AreaUnit.SQUARE_DECIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0006, decare.from(AreaUnit.SQUARE_CENTIMETER, area), 1.0E-5);
        Assert.assertEquals(1.0E0008, decare.from(AreaUnit.SQUARE_MILLIMETER, area), 1.0E-5);

        Assert.assertEquals(1.0E-002, decare.from(AreaUnit.HECTARE, area), 1.0E-5);
        Assert.assertEquals(1.0E-001, decare.from(AreaUnit.DECARE, area), 1.0E-5);
        Assert.assertEquals(1.0E0000, decare.from(AreaUnit.ARE, area), 1.0E-5);
    }
}
