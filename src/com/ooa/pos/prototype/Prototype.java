package com.ooa.pos.prototype;

public interface Prototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}
