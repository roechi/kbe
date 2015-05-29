package de.htw_berlin.ai_bachelor.kbe.tree;


public class TreeTest {
	public static void main(String... a) {
		Tree<Integer> t = new Tree<Integer>(1, new Tree<Integer>(23, 
				new Tree<Integer>(65 , null, null), null), new Tree<Integer>(42, null, null));
		System.out.println(export(t));
	}
	
	public static String export(Tree<Integer> t) {
		String s = "( val = " + t.getValue() + 
				", left: " + t.getLeft() != null ? export(t.getLeft()) : "none" + 
				", right: " + t.getRight() != null ? export(t.getRight()) : "none" + 
				" )";
		return s;
	}
}
