package com.jfbuilds.collections;

import java.util.HashSet;

import com.jfbuilds.collections.olives.Kalamata;
import com.jfbuilds.collections.olives.Ligurio;
import com.jfbuilds.collections.olives.Olive;
import com.jfbuilds.collections.olives.Picholine;

public class UseHashSet {

	public static void main(String[] args) {
        System.out.println("UseHashSet");

        Olive lig = new Ligurio();
		Olive kal = new Kalamata();
		Olive pic = new Picholine();
		
		HashSet<Olive> set = new HashSet<>();
		set.add(lig);
		set.add(kal);
		set.add(pic);
		System.out.println("There are " + set.size() + " olives in the set.");
		
	}

}
