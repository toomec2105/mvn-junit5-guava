package junitWithMaven2;

import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import com.google.common.collect.Lists;

public class GuavaListsTest {
	@Test
	public void whenReverseList_thenReversed() {
	    List<String> names = Lists.newArrayList("John", "Adam", "Jane");
	 
	    List<String> reversed = Lists.reverse(names);
	    
	    // import static org.hamcrest.MatcherAssert.assertThat;
	    assertThat(reversed, contains("Jane", "Adam", "John"));
	    org.hamcrest.MatcherAssert.assertThat(reversed, contains("Jane", "Adam", "John"));

	    // import org.hamcrest.MatcherAssert;
	    MatcherAssert.assertThat(reversed, contains("Jane", "Adam", "John"));

	}
}
