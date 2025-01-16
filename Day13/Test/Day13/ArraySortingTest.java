package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortingTest {
    @Test
    public void duplicate(){
        assertEquals("[1, 2, 3, 4, 4, 5]",ArraySorting.sorting(new int[] {5,3,4,4,1,2}));
        assertEquals("[1, 2, 3, 3, 4, 5]",ArraySorting.sorting(new int[] {5,3,4,3,1,2}));
        assertEquals("[1, 2, 3, 4, 5, 5]",ArraySorting.sorting(new int[] {5,3,4,5,1,2}));
    }

    @Test
    public void alreadySorted(){
        assertEquals("[1, 2, 3, 4, 5]",ArraySorting.sorting(new int[] {1,2,3,4,5}));
        assertEquals("[6, 7, 8, 9]",ArraySorting.sorting(new int[] {6,7,8,9}));
        assertEquals("[2, 4, 6, 8]",ArraySorting.sorting(new int[] {2,4,6,8}));
    }

    @Test
    public void empty(){
        assertEquals("[]",ArraySorting.sorting(new int[] {}));
    }

}