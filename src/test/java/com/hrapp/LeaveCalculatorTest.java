
package com.hrapp;



import org.junit.Test;

import static org.junit.Assert.*;



public class LeaveCalculatorTest {



    LeaveCalculator calc = new LeaveCalculator();



    @Test

    public void testRemainingLeaveNormal() {

        assertEquals(10, calc.getRemainingLeave(30, 20));

    }



    @Test

    public void testRemainingLeaveZero() {

        assertEquals(0, calc.getRemainingLeave(20, 20));

    }



    @Test

    public void testLeaveEncashment() {

        assertEquals(5000.0, calc.getLeaveEncashment(10, 500.0), 0.01);

    }

}

