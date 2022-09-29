package datastructure.array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author piksel
 */
@RunWith(MockitoJUnitRunner.class)
public class SortArrayOfIntegersTest {


    @InjectMocks
    private SortArrayOfIntegers sortArrayOfIntegers;

    @Test
    public void testSortArrayOfIntegersInAscendingOrder() {
        int[] input = {1, 3, 2, -4, 8, 5, 7, 6};
        int[] expectedSortedArray = {-4, 1, 2, 3, 5, 6, 7, 8};
        int[] result = sortArrayOfIntegers.sortIntArrayInAscendingOrder(input);
        assertThat(result, is(expectedSortedArray));
    }

    @Test
    public void testSortArrayOfIntegersInDescendingOrder() {
        int[] input = {1, 3, 2, -4, 8, 5, 7, 6};
        int[] expectedSortedArray = {8, 7, 6, 5, 3, 2, 1, -4};
        int[] result = sortArrayOfIntegers.sortIntArrayInDescendingOrder(input);
        assertThat(result, is(expectedSortedArray));
    }

    @Test
    public void testSortArrayOfIntegersUsingArraySortFunction() {
        int[] input = {1, 3, 2, -4, 8, 5, 7, 6};
        int[] expectedSortedArray = {-4, 1, 2, 3, 5, 6, 7, 8};
        int[] result = sortArrayOfIntegers.sortInAscOrderUsingArraySortFunction(input);
        assertThat(result, is(expectedSortedArray));
    }
    @Test
    public void testSortArrayOfIntegersInDescendingOrderUsingArraySortFunction() {
        int[] input = {1, 3, 2, -4, 8, 5, 7, 6};
        int[] expectedSortedArray = {8, 7, 6, 5, 3, 2, 1, -4};
        int[] result = sortArrayOfIntegers.sortInDescendingOrderUsingArraySortFunction(input);
        assertThat(result, is(expectedSortedArray));
    }

}