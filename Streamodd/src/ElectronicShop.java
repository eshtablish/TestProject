import java.util.ArrayList;
public class ElectronicShop {
	public static void main(String[] args) {
		
		Electronics e1=new Electronics(201,"Television","Sony",50500,"Bravia 32W830K");
		Electronics e2=new Electronics(202,"Clock","Titan",5600,"Rosegold");
		Electronics e3=new Electronics(203,"Laptop","Lenovo",45000,"ideapad S340");
		Electronics e4=new Electronics(204,"Washing machine","LG",65800,"T65SKSF4Z");
		Electronics e5=new Electronics(205,"Refrigirator","Whirlpool",32000,"Sapphire Mulia");
		Electronics e6=new Electronics(206,"Mobile","moto",9500,"gpower-10");
		ArrayList<Electronics> al=new ArrayList<Electronics>();
		al.add(e6);al.add(e5);al.add(e4);al.add(e3);al.add(e2);al.add(e1);

		al.stream().filter(ele->ele.ePrice>=30000)
		.forEach(ele->{System.out.println(ele.eName+" "+ele.eCompany+" "+ele.eModel+" Rs : "+ele.ePrice);});
	}

}

