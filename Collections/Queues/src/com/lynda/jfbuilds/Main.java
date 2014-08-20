package com.lynda.jfbuilds;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.jfbuilds.collections.olives.Golden;
import com.jfbuilds.collections.olives.Kalamata;
import com.jfbuilds.collections.olives.Ligurio;
import com.jfbuilds.collections.olives.Olive;
import com.jfbuilds.collections.olives.Picholine;

public class Main {

	public static void main(String[] args) {
        System.out.println("Queues");
		LinkedList<Olive> list = new LinkedList<>();
		
		list.add(new Picholine());
		list.add(new Kalamata());
		list.add(1, new Golden());
		list.addFirst(new Ligurio());
		
		display(list);
		
	}
	
	static private void display(Collection<Olive> col) {
		System.out.println("List order: ");
		Iterator<Olive> iterator = col.iterator();
		while (iterator.hasNext()) {
			Olive olive = (Olive) iterator.next();
			System.out.println(olive.oliveName.toString());
		}
	}
	
}
