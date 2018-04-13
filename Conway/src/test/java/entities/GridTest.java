package entities;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GridTest {
    private Grid grid;

    @BeforeMethod
    public void setup() {
        grid = new Grid(3, 3);
    }

    @Test
    public void testNoNeighborsDies() {
        int[][] array = grid.getCurrentArray();
        array[1][1] = 1;
        grid.setCurrentArray(array);

        grid.iterate();

        array = grid.getCurrentArray();

        Assert.assertEquals(array[1][1], 0);
    }
}