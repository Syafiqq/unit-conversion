package com.github.syafiqq.unit.conversion.core.misc;

import com.github.syafiqq.unit.conversion.core.unit.single.AreaUnit;
import com.github.syafiqq.unit.conversion.core.unit.single.WeightUnit;
import org.junit.Test;

/*
 * This <unit-conversion> created by : 
 * Name         : syafiq
 * Date / Time  : 21 July 2017, 5:28 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class EnumConstantsGenerator
{
    @Test
    public void it_generate_area_density()
    {
        for(WeightUnit weight : WeightUnit.values())
        {
            for(AreaUnit area : AreaUnit.values())
            {
                System.out.printf("%s_PER_%s(%s.%s, %s.%s),\n", weight.name(), area.name(), WeightUnit.class.getSimpleName(), weight.name(), AreaUnit.class.getSimpleName(), area.name());
            }
        }
    }
}
