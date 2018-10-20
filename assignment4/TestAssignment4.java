import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssignment4 {

	@Test
	public void testFirstUniqChar() {
		String s = "loveleetcode";
	    assertEquals(2, Assignment4.firstUniqChar(s));
	    assertEquals(5, Assignment4.firstUniqChar(s));
    }
	
	@Test
	public void testAddDigits() {
		int n = 99;
	    assertEquals(9, Assignment4.addDigits(n));
    }
	
	@Test
	public void testMoveZeroes() {
		int[] nums = {0,1,0,3,12};
		int[] expected = {1,3,12,0,0};
		Assignment4.moveZeroes(nums);
		assertArrayEquals(expected,nums);
    }
	
	@Test
	public void testLongestPalindrome() {
		String str = "babad";
	    assertEquals("bab", Assignment4.longestPalindrome(str));
    }
	
	@Test
	public void testRotate() {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        Assignment4.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }
}
