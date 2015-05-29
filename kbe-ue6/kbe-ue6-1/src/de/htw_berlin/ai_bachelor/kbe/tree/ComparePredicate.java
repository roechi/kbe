package de.htw_berlin.ai_bachelor.kbe.tree;

public class ComparePredicate<V extends Comparable<V>> implements
		TreePredicate<V> {
	V minEle;
	V maxEle;
	
	public ComparePredicate(V minEle, V maxEle) {
		this.minEle = minEle;
		this.maxEle = maxEle;
	}

	@Override
	public Boolean isOk(Tree<V> t) {
		return (t.getValue().compareTo(maxEle) < 0  && t.getValue().compareTo(minEle) > 0 ? true : false);
	}

}
