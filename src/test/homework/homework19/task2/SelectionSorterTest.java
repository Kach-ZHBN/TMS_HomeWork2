package homework.homework19.task2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SelectionSorterTest {

    @Test
    public void testSort() {
        assertEquals(SelectionSorter.sort(new int[]{}), new int[]{});
        assertEquals(SelectionSorter.sort(new int[]{1}), new int[]{1});
        assertEquals(SelectionSorter.sort(new int[]{0, 1, 2, 3, 4, 5}), new int[]{0, 1, 2, 3, 4, 5});
        assertEquals(SelectionSorter.sort(new int[]{25, 9, -48, 659, 69, 6, -12, -156}),
                new int[]{-156, -48, -12, 6, 9, 25, 69, 659});
    }
}