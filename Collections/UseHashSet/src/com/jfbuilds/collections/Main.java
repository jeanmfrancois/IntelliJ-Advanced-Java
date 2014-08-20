package com.jfbuilds.collections;

import com.jfbuilds.collections.olives.Kalamata;
import com.jfbuilds.collections.olives.Ligurio;
import com.jfbuilds.collections.olives.Olive;
import com.jfbuilds.collections.olives.Picholine;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		System.out.println("UseHashSet");

        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        HashSet<Olive> set = new HashSet<>();
        set.add(lig);
        set.add(kal);
        System.out.println("There are " + set.size() + " olives in the set.");
        set.add(pic);
        System.out.println("There are " + set.size() + " olives in the set.");
        set.add(null);
        System.out.println("There are " + set.size() + " olives in the set.");
    }

}
