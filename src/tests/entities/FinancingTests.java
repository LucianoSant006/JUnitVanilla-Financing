package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {


    @Test
    public void constructorShouldInstantiateWhenDataIsValid() {

        Financing fn = new Financing(100000.00, 4000.00, 90);

        Assertions.assertEquals(100000.00, fn.getTotalAmount());
        Assertions.assertEquals(90, fn.getMonths());
        Assertions.assertEquals(4000.00, fn.getIncome());


    }

    @Test
    public void constructorShouldThrowAnExceptionWhenDataIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing fn = new Financing(100000.00, 4000.00, 5);
        });
    }

    @Test
    public void setTotalAmountShouldUpdatedWhenDataIsValid(){
        double expectedValue = 90000.0;
        Financing fn = new Financing(100000.00, 4000.00, 90);
        fn.setTotalAmount(90000.0);
        Assertions.assertEquals(expectedValue,fn.getTotalAmount());
    }
    @Test
    public void setTotalAmountShouldThrowAnExceptionWhenDataIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing fn = new Financing(200000.00, 3000.00, 60);
            fn.setTotalAmount(300000.00);

        });
    }

    @Test
    public void setIncomeShouldUpdatedWhenDataIsValid(){
        Financing fn = new Financing(100000.00, 2000.00, 80);
        fn.setIncome(900000.00);
        Assertions.assertEquals(900000.00,fn.getIncome());
    }

    @Test
    public void setIncomeAmountShouldThrowAnExceptionWhenDataIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            Financing fn = new Financing(100000.00, 2000.00, 80);
            fn.setIncome(1000.00);

        });
    }

    @Test
    public void setMonthsShouldUpdatedWhenDataIsValid(){
        Financing fn = new Financing(200000.00, 4000.00, 80);
        fn.setMonths(90);
        Assertions.assertEquals(90,fn.getMonths());
    }
    @Test public void  setMonthsAmountShouldThrowAnExceptionWhenDataIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            Financing fn = new Financing(200000.00, 4000.00, 80);
            fn.setMonths(4);

        });
    }

    @Test
    public void entryShouldCalculatingValuesWhenDataIsValid(){
        double expectedValue = 40000.00;
        Financing fn = new Financing(200000.00, 4000.00, 80);
        fn.entry();
        Assertions.assertEquals(expectedValue,fn.entry());
    }




}
