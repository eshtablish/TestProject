package com.cg.interfacedemo;

public class Movi{
	  public static void main(String[] args)
	  {
		  String title = "Harry Potter";
   	  MyMovie m = new MyMovie();
		  m.setTitle(title);
		  System.out.println("the title is: "+m.getTitle());
	  }
}
