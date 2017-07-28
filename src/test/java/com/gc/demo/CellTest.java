package com.gc.demo;


import static com.gc.demo.Cell.*;
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CellTest {


    //tests if a cell dies with < 2 live neighbors.
    @Test
    public void test1() {
        assertFalse("Your cell should die.", liveOrDie(true, 1));
    }

    //tests if a cell dies with > 3 live neighbors.
    @Test
    public void test2() {
        assertFalse("Your cell should die from overpopulation", liveOrDie(true,4));
    }

    //tests if a cell lives with 2 or 3 live neighbors.
    @Test
    public void test3() {
        assertTrue("Your cell should still be alive.", liveOrDie(true, 2));
    }

    //tests if a cell revives with 3 live neighbors.
    @Test
    public void test4() {
        assertTrue("Your cell should revive.", liveOrDie(false, 3));
    }

    //tests if a cell stays dead with != 3 live neighbors.
    @Test
    public void test5() {
        assertFalse("Your cell should stay dead.", liveOrDie(false, 2));
    }

    // Tries out a 3x3 cell array. Hopefully nothing crashes.
    @Test
    public void test6() {
        boolean [][] allAlive = {{true,true,false}, {true,false,true}, {false, true,true}};
        allAlive = advanceGeneration(allAlive);

        assertFalse(Arrays.deepToString(allAlive), true);
    }

}
