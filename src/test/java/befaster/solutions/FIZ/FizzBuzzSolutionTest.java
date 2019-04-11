package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fiz;

    @Before
    public void setUp() {

    	fiz = new FizzBuzzSolution();
    }

    @Test
    public void checkIdentical() {
        assertThat(fiz.fizzBuzz(13), equalTo("fizz"));
    	
    }
}
