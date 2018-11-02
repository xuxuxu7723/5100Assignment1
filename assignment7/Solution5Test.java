package assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution5Test {

	@Test
	void testFindMedianSortedArrays() {
		int[] nums1 = {1};
		int[] nums2 = {2,3,4};
		double mid = Solution5.findMedianSortedArrays(nums1,nums2);
		assertEquals(2.5,mid);
	}

}
