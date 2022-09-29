package datastructure.miscellaneous;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * @author piksel
 */
public class FizzBuzzKataTest {

    private FizzBuzzKata fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzzKata();
    }

    @Test
    public void of0_is0() {
        assertThat(fizzBuzz.of(0), is("0"));
    }

    @Test
    public void of1_is1() {
        assertThat(fizzBuzz.of(1), is("1"));
    }

    @Test
    public void of3_isFizz() {
        assertThat(fizzBuzz.of(3), is("Fizz"));
    }

    @Test
    public void of5_isBuzz() {
        assertThat(fizzBuzz.of(5), is("Buzz"));
    }

    @Test
    public void of6_isFizz() {
        assertThat(fizzBuzz.of(6), is("Fizz"));
    }

    @Test
    public void of10_isBuzz() {
        assertThat(fizzBuzz.of(10), is("Buzz"));
    }

    @Test
    public void of15_isBuzz() {
        assertThat(fizzBuzz.of(15), is("FizzBuzz"));
    }

}