package com.companyname.col;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * reverse the order of the output so that the largest
element appears on the left and the smallest element appears on the right.
 * It declares and instantiates an anonymous class that implements Comparator. Its
compareTo() method subtracts element e2 from element e1 to achieve descending numerical order. The
compiler handles the task of unboxing e2 and e1 by converting e2-e1 to e2.intValue()-e1.intValue().
 */
class PriorityQueueDemo 
{
	final static int NELEM = 15;
	public static void main(String[] args)
	{
		Comparator<Integer> cmp;
		cmp = new Comparator<Integer>()
				{
					public int compare(Integer e1, Integer e2){
						return e2-e1;
					}
				};
		Queue<Integer> qi = new PriorityQueue<>(NELEM, cmp);
		for (int i = 0; i < NELEM; i++)
			qi.add((int) (Math.random()*100));
		while (!qi.isEmpty())
			System.out.print(qi.poll() + " ");
		System.out.println();
	}
}
