package test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
public static void main(String args[]) {
	TreeSet<Integer> tset=new TreeSet<Integer>();
	tset.add(3);
	tset.add(1);
	tset.add(4);
	tset.add(2);

	System.out.println("Sorted set");
	Iterator<Integer> i2=tset.iterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	System.out.println();

	System.out.println("Descending Order");
	Iterator<Integer> i3=tset.descendingIterator();
	while(i3.hasNext())
	{
		System.out.println(i3.next());
	}
	
	}
}
