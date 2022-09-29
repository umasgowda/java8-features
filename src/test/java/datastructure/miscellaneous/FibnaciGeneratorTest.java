package datastructure.miscellaneous;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * @author piksel
 */
@RunWith(MockitoJUnitRunner.class)
public class FibnaciGeneratorTest {
    @InjectMocks
    private FibnaciGenerator fibnaciGenerator;

    @Test
    public void testGenerateFibnaciSeriesUsingIterative() {
        int [] expected = {0, 1, 1, 2, 3, 5, 8, 13};
        int[] result = fibnaciGenerator.generateFibnaciSeriesUsingIterative(8);

        assertThat(result, is(expected));
    }

    @Test
    public void testGenerateFibnaciSeriesUsingRecursion() {
        int [] expected = {0, 1, 1, 2, 3, 5, 8, 13};
        int[] result = fibnaciGenerator.generateFibnaciSeriesUsingRecursive(8);
        assertThat(result, is(expected));
    }


}