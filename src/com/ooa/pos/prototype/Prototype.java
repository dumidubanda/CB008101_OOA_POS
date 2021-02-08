 package com.ooa.pos.prototype;
//implementing clene method
public interface Prototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}
