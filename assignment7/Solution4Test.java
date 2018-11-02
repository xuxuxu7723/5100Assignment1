package assignment7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Solution4Test {

	@Test
	void testIntervalList() {
		Interval i1 = new Interval(1,3);
		Interval i2 = new Interval(2,6);
		Interval i3 = new Interval(15,18);
		Interval i4 = new Interval(8,10);
		
		List<Interval> intervals = new ArrayList<Interval>();
				//(List<Interval>) i1;
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		assertEquals(intervals,intervals);
	}
	@Test
	void testMerge() {
		
		
		Interval i1 = new Interval(1,3);
		Interval i2 = new Interval(2,6);
		Interval i3 = new Interval(15,18);
		Interval i4 = new Interval(8,10);
		
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		List<Interval> result = Solution4.merge(intervals);

		
		Interval e1 = new Interval(1,6);
		Interval e2 = new Interval(8,10);
		Interval e3 = new Interval(15,18);
		List<Interval> expected = new ArrayList<Interval>();
		expected.add(e1);
		expected.add(e2);
		expected.add(e3);
		
		
		for ( int i = 0; i < expected.size();i ++) {
			assertEquals(expected.get(i).start,result.get(i).start);
			assertEquals(expected.get(i).end,result.get(i).end);
		}
		
	}

}
