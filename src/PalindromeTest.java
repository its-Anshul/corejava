import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p = new Palindrome();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void palindrome() {
        String testcase2 = p.palindrome(12345654321L);
        String answer2 = 12345654321L + " is Palindrome and the sum of even numbers is less than 25";
        Assert.assertEquals(testcase2,answer2);
    }

}



