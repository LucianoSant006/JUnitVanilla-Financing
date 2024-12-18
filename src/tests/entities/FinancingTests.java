package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {


    @Test
    public void constructorShouldInstantiateWhenDataIsValid(){

        Financing fn = new Financing(100000.00, 4000.00, 90);

        Assertions.assertEquals(100000.00,fn.getTotalAmount());
        Assertions.assertEquals(90,fn.getMonths());
        Assertions.assertEquals(4000.00,fn.getIncome());


    }

}
