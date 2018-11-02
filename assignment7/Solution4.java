package assignment7;

import java.util.*;


public class Solution4 {
	 public static List<Interval> merge(List<Interval> intervals) {
	       // add your code here
		 	int n = intervals.size();
			int[] starts = new int[n];
			int[] ends = new int[n];
			for (int i = 0; i < n; i++) {
				starts[i] = intervals.get(i).start;
				ends[i] = intervals.get(i).end;
			}
			Arrays.sort(starts);
			Arrays.sort(ends);
			
			List<Interval> res = new ArrayList<Interval>();
            int i = 0;
			while (i < n) {
                if (i == n -1 ) {
                    res.add(new Interval(starts[i], ends[i]));
                    return res;
                }
				for (int j = i+1; j < n; j ++) {
					
					if (ends[j-1] < starts[j]) {
						res.add(new Interval(starts[i], ends[j-1]));
						i = j;
						break;
					}
					if (j == n-1 && ends[j-1] >= starts[j] ) {
						res.add(new Interval(starts[i], ends[j]));
						return res;
					}
				}
				
 			}
			return res;
	    }
}

 class Interval {
	int start;
	int end;
	public Interval(int x, int y) {
		start = x;
		end = y;
	}
}