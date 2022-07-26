package com;

abstract class Shape {
	abstract void draw();
}
class rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
class Draw{
public static void main(String[] args) {
	rectangle s=new rectangle();
	s.draw();
	}

}
