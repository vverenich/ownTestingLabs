package testing;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test3 {

	@Test
	final void test() {
		BinarySearch test = new BinarySearch();
		ArrayList<Integer> arrayForTest = new ArrayList<Integer>();
		arrayForTest.add(1);
 
		int output = test.binarySearchFunc(arrayForTest, 1,0,0);
		assertEquals(0, output);
	}

}
