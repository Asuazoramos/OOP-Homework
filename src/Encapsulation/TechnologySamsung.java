package Encapsulation;

public class TechnologySamsung {



public static void  main(String[] args) {
	
	
	SamsungStores SamsungStores = new SamsungStores ();
			
	
	SamsungStores.getSmartTV("development");
	SamsungStores.getPhones("newphone");
	SamsungStores.getScreen("newTV");
	
	System.out.println(SamsungStores.getSmartTV() + SamsungStores.getPhones() + SamsungStores.getScreen());



}








}
