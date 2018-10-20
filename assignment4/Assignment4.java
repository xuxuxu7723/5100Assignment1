//import java.util.*;
//import java.lang.*;

public class Assignment4 {
	
	private static int lo,len;
	
	public static void main(String[] args) {
		//firstUniqChar
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
		
		//addDigits
		int n = 99;
		System.out.println(addDigits(n));
		
		//moveZeroes
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int nu : nums) {
			System.out.print(nu + " ");
		}
		System.out.println();
		
		//longestPalindrome
		String str = "babad";
		System.out.println(longestPalindrome(str));
		
		//rotate(int[][] matrix)
	    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
		
		
	}

		/**
		 * The deadline of assignment4 is 10/12/2018 23:59 PST.
		 * Please feel free to contact Zane and Amanda for any questions.
		 */
		
		/*
		 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
		 * s = "leetcode" return 0. 
		 * s = "loveleetcode" return 2.
		 */
	    public static int firstUniqChar(String s) {
	    		//TODO
	    	for (int i = 0; i < s.length(); i++) {
	             if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
	                 return i;
	             }
	         }
	         return -1;
	     }
	    
	    /*
	     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
	     * Input: 38 Output: 2
	     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	     */
	    public static int addDigits(int n) {
	    		//TODO
	    	while ( n > 10 ) {
	    		int m = n;
	    		int res = 0;
	    		while ( m != 0) {
	    			res += m % 10;
	    			m = m / 10 ;
	    		}
	    		n = res;
	    	}
	    	return n;
	    }
	    
	    /*
	     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
	     */
	    public static void moveZeroes(int[] nums) {
	    		//TODO
	    		if (nums == null || nums.length == 0) 
	    			return;        

	    		int index = 0;
	    		for (int n: nums) {
	    			if (n != 0) {
	    				nums[index++] = n;
	    			}
	    		}        

	    		while (index < nums.length) {
	    			nums[index++] = 0;
	    		}
	    }
		
	    /*
	     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
	     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
	     */
		public static String longestPalindrome(String s) {
			//TODO
			
		        if (s.length() < 2) {
		            return s;
		        }
		        for (int i = 0 ; i < s.length() - 1; i ++) {
		            Palindrome(s,i,i);
		            Palindrome(s,i,i+1);            
		        }
		        
		        return s.substring(lo, lo + len);
		    }
		    
		private static void Palindrome(String s, int j, int k) {
				while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
					j--;
					k++;
				}
				if (len < k - j - 1) {
					lo = j + 1;
					len = k - j - 1;
				}
		   	} 
		
	    /*
	     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
	     * Given input matrix = [ [1,2,3],
	  			      [4,5,6],
	  			      [7,8,9] ],
	     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
	  								 [8,5,2],
	  								  [9,6,3] ],
	     */
	    public static int[][] rotate(int[][] matrix) {
	    		//TODO
	    	for (int i = 0; i < matrix.length/2; i ++) {
	    		for (int j = 0; j< matrix[i].length; j ++) {
	    			int temp = matrix[i][j];
	    			matrix[i][j] = matrix[matrix.length - 1 - i][j];
	    			matrix[matrix.length - 1 - i][j] = temp;
	    		}
	    	}
	    	
	    	for (int i = 0; i < matrix.length; i ++) {
	    		for (int j = i + 1; j < matrix[i].length; j ++) {
	    			int temp = matrix[i][j];
	    			matrix[i][j] = matrix[j][i];
	    			matrix[j][i] = temp;
	    		}
	    	}
	    	return matrix;
	   }
	    
	}

