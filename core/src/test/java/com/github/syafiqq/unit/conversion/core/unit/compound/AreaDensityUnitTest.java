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
        Assert.assertEquals(1E0, AreaDensityUnit.converse(1E4, AreaDensityUnit.TONNE_PER_HECTARE, AreaDensityUnit.TONNE_PER_SQUARE_METER), 0.0);
    }

    @Test
    public void it_converse_t_p_ha_to_kg_p_m2_4()
    {
        Assert.assertEquals(1E3, AreaDensityUnit.converse(1E4, AreaDensityUnit.TONNE_PER_HECTARE, AreaDensityUnit.KILOGRAM_PER_SQUARE_METER), 0.0);
    }

    @Test
    public void it_converse_t_p_ha_to_kg_p_m2_3()
    {
        Assert.assertEquals(1E2, AreaDensityUnit.converse(1E3, AreaDensityUnit.TONNE_PER_HECTARE, AreaDensityUnit.KILOGRAM_PER_SQUARE_METER), 0.0);
    }

    @Test public void it_converse_100kg_500m_to_kg_m_and_t_ha()
    {
        Assert.assertEquals(2E-1, AreaDensityUnit.converse(1E2, 5E2, AreaDensityUnit.KILOGRAM_PER_SQUARE_METER, AreaDensityUnit.KILOGRAM_PER_SQUARE_METER), 0.0);
        Assert.assertEquals(2E0, AreaDensityUnit.converse(1E2, 5E2, AreaDensityUnit.KILOGRAM_PER_SQUARE_METER, AreaDensityUnit.TONNE_PER_HECTARE), 0.0);
        Assert.assertEquals(2E-1, AreaDensityUnit.converse(1E2, 5E2, AreaDensityUnit.KILOGRAM_PER_SQUARE_METER, 1E1, AreaDensityUnit.TONNE_PER_HECTARE), 0.0);
    }
}
