package com.jfbuilds.collections.olives;

public enum OliveColor {
	BLACK("Black"), GREEN("Green"), GOLD("Gold");
	
	private String colorAsString;
	
	private OliveColor(String colorAsString) {
		this.colorAsString = colorAsString;
	}
	
	@Override
	public String toString() {
		return this.colorAsString;
	}
}
