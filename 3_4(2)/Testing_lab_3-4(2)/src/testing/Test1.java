package testing;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	final void test() {
		BinarySearch test = new BinarySearch();
		ArrayList<Integer> arrayForTest = new ArrayList<Integer>();
		arrayForTest.add(1);
		arrayForTest.add(2);
		arrayForTest.add(3);
		arrayForTest.add(4);
		arrayForTest.add(5);
		arrayForTest.add(6);
		int output = test.binarySearchFunc(arrayForTest, 1,0,5);
		assertEquals(0, output);
	}

}
