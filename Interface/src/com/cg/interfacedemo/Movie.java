package com.cg.interfacedemo;

abstract class Movie {
    String title;
    abstract void setTitle(String name);
}
 class MyMovie extends Movie{
	 void setTitle(String name) {
		 title = name;
	 }
  String getTitle() {
	return title;
  }
 }
 
 
	  
	
	
	
	
	
	
	
	
	
	
	