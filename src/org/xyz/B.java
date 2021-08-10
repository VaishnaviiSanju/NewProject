package org.xyz;

public class B extends A {
	public void mul() {
		System.out.println("Mul...");
}
	public void div() {
		System.out.println("Div...");
}
	public static void main(String[] args) {
		B b = new B();
		b.add();
		b.sub();
	}
}
