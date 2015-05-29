package de.htw_berlin.ai_bachelor.kbe.tree;


public class TreeTest {
	public static void main(String... a) {
		Tree<Integer> t = new Tree<Integer>(1, new Tree<Integer>(23, 
				new Tree<Integer>(65 , null, null), null), new Tree<Integer>(42, null, null));
		System.out.println(export(t));
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
}
