package com.cg.interfacedemo;

 interface Bike {
    void getMileage();
}
 class R15 implements Bike
{
	 void getMileage()
	 {
		 System.out.println("Mileage is 40 km/L");
	 }
}
 public class Interfacedemo{
	 public static void main(String args[])
	 {
		 R15 bike=new R15();
		 bike.getMileage();
	 }
 }

  