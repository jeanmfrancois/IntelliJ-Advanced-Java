package com.jfbuilds.collections;

import com.jfbuilds.collections.olives.Kalamata;
import com.jfbuilds.collections.olives.Ligurio;
import com.jfbuilds.collections.olives.Olive;
import com.jfbuilds.collections.olives.Picholine;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

        System.out.println("UseTreeSet");

        Olive lig = new Ligurio();
		Olive kal = new Kalamata();
		Olive pic = new Picholine();

        TreeSet<Olive> set = new TreeSet<>();

        //Comparable<Olive> olives = o -> o.compareTo();

        //Comparable<Olive> olives = (Olive::compareTo);

        set.add(lig);

	}

}
