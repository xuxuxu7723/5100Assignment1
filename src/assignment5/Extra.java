package assignment5;
import java.util.*;

public class Extra {
	protected static boolean flag = true;
	protected static List<Integer> result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},
						  {4,5,6},
						  {7,8,9},
						  {1,2,3}};
		List<Integer> list = spiralOrder(matrix);
		System.out.println(list);
		
		

	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        //write your code here
		List<Integer> list = new ArrayList<Integer> ();
		int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int times = 0;
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int r = m;
        int c = n;
        int rr = 0;
        int cc = 0;
        
        while (list.size() < (m + 1) * (n + 1)) {
        	//list.add(matrix[rr][cc]);

        	switch(times % 4) {
        	case 0 : 
        		if (cc == c) {
        			times ++;
        		} else {
        			list.add(matrix[rr][cc]);
        			cc += dc[0];
        			rr += dr[0];

        		}
        		break;
        		
        	case 1 : 
        		if (rr == r) {
        			times ++;
        			r --;
        		} else {
        			list.add(matrix[rr][cc]);
        			cc += dc[1];
        			rr += dr[1];
        		}
        		break;
        	case 2 : 
        		if (cc == n - c) {
        			times ++;
        			c --;
        		} else {
        			list.add(matrix[rr][cc]);
        			cc += dc[2];
        			rr += dr[2];
        		}
        		break;
        	case 3 : 
        		if (rr == m - r) {
        			times ++;
        		} else {
        			list.add(matrix[rr][cc]);
        			cc += dc[3];
        			rr += dr[3];
        		}
        		break;
        	}
        }
        
		return list;
		
	}

}
