import chapter7.Whale;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

    public class SimpleTest {

        @Test
        public void WhaleWagTail() {
            Whale whale = new Whale();

            assertThat(whale.wag(), is ("Whale wagging"));
        }
    }
