package com.github.syafiqq.unit.conversion.core.unit.compound;

import org.junit.Assert;
import org.junit.Test;

/*
 * This <unit-conversion> created by : 
 * Name         : syafiq
 * Date / Time  : 21 July 2017, 3:48 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class AreaDensityUnitTest
{
    @Test
    public void it_converse_t_p_ha_to_t_p_m2()
    {
        Assert.assertEquals(1E0, AreaDensityUnit.TONNE_PER_HECTARE.to(AreaDensityUnit.TONNE_PER_SQUARE_METER, 1E4), 0.0);
    }

    @Test
    public void it_converse_t_p_ha_to_kg_p_m2()
    {
        Assert.assertEquals(1E3, AreaDensityUnit.TONNE_PER_HECTARE.to(AreaDensityUnit.KILOGRAM_PER_SQUARE_METER, 1E4), 0.0);
    }
}
