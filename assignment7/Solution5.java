package assignment7;

public class Solution5 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length == 0 ) {
			if ( nums2.length % 2 == 0) {
				return (nums2[nums2.length/2] + nums2[nums2.length/2 - 1]) /2.0;
			}
			else {
				return nums2[nums2.length/2];
			}
		}
		
		if (nums2.length == 0) {
			if(nums1.length % 2 == 0) {
				return (nums1[nums1.length/2] + nums1[nums1.length/2 - 1]) /2.0;
			}
			else {
				return nums1[nums1.length/2];
			}
		}
	       int length = nums1.length + nums2.length;
	       int mid = length/2;
	       int left = 0;
	       return sortTwoArray(nums1,nums2,0,0,mid,length,left);
	    }
	
	public static double sortTwoArray(int[] nums1, int[] nums2, int i, int j, int mid, int length, int left) {
		if (i == nums1.length) {
			
			if (length % 2 == 1) {
			return nums2[mid + j];
			}
			else {
				if (mid == 0) {
					return (left + nums2[j])/2.0;
				}
				return (nums2[mid + j] +nums2[mid + j - 1])/2.0 ;
			}
		}
	
		if (j == nums2.length) {
			if (length % 2 == 1) {
			return nums1[mid + i];
			}
			else {
				if (mid == 0) {
					return (left + nums1[i])/2.0;
				}
				return (nums1[mid + i] + nums1[mid + i - 1])/2.0;
			}
			
		}
		if ( nums1[i] <= nums2[j]) {
			if (mid == 0 && length % 2 == 0) {
				return (nums1[i]+left)/2.0;
			}
			if (mid == 0 && length %2 == 1) {
				return (double)(nums1[i]);
			}
			mid --;
			if (mid == 0 && length % 2 == 0) {
				left = nums1[i];
			}
			
			return sortTwoArray(nums1,nums2,i+1,j,mid,length,left);
			
		}
		else  {
			if (mid == 0 && length % 2 == 0) {
				return (nums2[j]+left)/2.0;
			}
			if (mid == 0 && length %2 == 1) {
				return (double)(nums2[j]);
			}
			mid --;
			if (mid == 0 && length % 2 == 0) {
				left = nums2[j];
			}
			return sortTwoArray(nums1,nums2,i,j+1,mid,length,left);
	
		}
	}
	public static void main(String args[]) {
		int[] nums1 = {1};
		int[] nums2 = {2,3,4};
		double mid = findMedianSortedArrays(nums1,nums2);
		System.out.println(mid);
	}
}
