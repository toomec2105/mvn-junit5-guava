package guava;

import java.util.List;

//import org.junit.jupiter.api.Test;

import com.google.common.collect.Lists;

public class GuavaLists {
	
	//@Test
	public void whenReverseList_thenReversed() {
    List<String> names = Lists.newArrayList("John", "Adam", "Jane");
    
    @SuppressWarnings("unused")
	List<String> reversed = Lists.reverse(names);
//	    assertThat(reversed, contains("Jane", "Adam", "John"));
    //assertThat("aaa", "dsa");
	}
	
	
}
