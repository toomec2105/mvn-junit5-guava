package guava;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

public class Main {

	public static void main(String[] args) {
		   List<String> names = Lists.newArrayList("John", "Adam", "Jane"); 
		    List<String> list = new ArrayList<>();
		    list.add("John");
		   // List<String> list = Arrays.asList("John", "Adam", "Jane");
		   
		   System.out.println(names);
		   List<String> reversed = Lists.reverse(names);
		   System.out.println(reversed);
	}

}
