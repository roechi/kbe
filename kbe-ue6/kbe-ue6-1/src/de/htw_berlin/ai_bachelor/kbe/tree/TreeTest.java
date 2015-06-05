package de.htw_berlin.ai_bachelor.kbe.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class TreeTest {
	public static void main(String... a) {
		Tree<Integer> t = new Tree<Integer>(1, new Tree<Integer>(23, 
				new Tree<Integer>(65 , null, null), null), new Tree<Integer>(42, null, null));
		System.out.println(export(t));
		System.out.println(TreeSum.sum(t));
		ComparePredicate<Integer> pred = new ComparePredicate<Integer>(20,50);
		System.out.println("ComparePred: " + filterElements(pred, t).toString());
	}
	
	public static String export(Tree<Integer> t) {
		String s = "( ";
		if (t != null) {	
			s+= " val = " + t.getValue() + 
				", left: " + export(t.getLeft()) + 
				", right: " +  export(t.getRight());
		} else { 
			s += "none";
		}
		s += " )";
		return s;
	}
	
	public static <V extends Comparable<V>> Collection<V> filterElements(ComparePredicate<V> comp, Tree<V> t) {
		Collection<V> col = new LinkedHashSet<V>();
		if (t != null) {
			if (comp.isOk(t)) 
				col.add(t.getValue());
			col.addAll(filterElements(comp, t.getLeft()));
			col.addAll(filterElements(comp, t.getRight()));
		}	
		return col; 
	}
}
